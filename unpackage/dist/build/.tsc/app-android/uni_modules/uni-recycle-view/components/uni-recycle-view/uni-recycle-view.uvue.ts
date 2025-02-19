
  /**
   * 使用限制
   * - 容器大小变动时未刷新缓存的子元素大小
   * - 不支持设置初始滚动位置
   * - list数据内每一项不可以是基础类型
   * - item不支持设置margin，会导致计算位置不准确
   */
  /**
   * recycle-view 虚拟长列表组件
   * @description 用于超长列表的展示
   * @property {any[]} list 列表所有数据
   */
  const __sfc__ = defineComponent({
    name: "uni-recycle-view",
    props: {
      type: {
        type: String,
        default: ''
      },
      direction: {
        type: String,
        default: 'vertical'
      },
      associativeContainer: {
        type: String,
        default: ''
      },
      enableBackToTop: {
        type: Boolean,
        default: false
      },
      bounces: {
        type: Boolean,
        default: true
      },
      upperThreshold: {
        type: Number,
        default: 50
      },
      lowerThreshold: {
        type: Number,
        default: 50
      },
      scrollTop: {
        type: Number,
        default: 0
      },
      scrollLeft: {
        type: Number,
        default: 0
      },
      scrollIntoView: {
        type: String,
        default: ''
      },
      scrollWithAnimation: {
        type: Boolean,
        default: false
      },
      refresherEnabled: {
        type: Boolean,
        default: false
      },
      refresherThreshold: {
        type: Number,
        default: 45
      },
      refresherMaxDragDistance: {
        type: Number
      },
      refresherDefaultStyle: {
        type: String,
        default: 'black'
      },
      refresherBackground: {
        type: String,
        default: 'transparent'
      },
      refresherTriggered: {
        type: Boolean,
        default: false
      },
      showScrollbar: {
        type: Boolean,
        default: true
      },
      customNestedScroll: {
        type: Boolean,
        default: false
      },
      nestedScrollChild: {
        type: String,
        default: ''
      },
      list: {
        type: Array as PropType<any[]>,
        default: [] as any[]
      },
      itemHeight: {
        type: Number,
        default: 0
      }
    },
    emits: [
      'scroll',
      'scrollend',
      'scrolltolower',
      'scrolltoupper',
      'refresherabort',
      'refresherpulling',
      'refresherrefresh',
      'refresherrestore',
    ],
    watch: {
      list: {
        handler(list : any[]) {
          this.cachedSize.forEach((_ : number, key : any) => {
            if (!list.includes(key)) {
              this.cachedSize.delete(key)
            }
          })
        },
        deep: true
      },
      defaultItemSize() {
        this.rearrange(this.lastScrollTop)
      }
    },
    data() {
      return {
        items: [] as any[],
        containerTop: 0,
        scrollElementHeight: 0,
        placeholderHeight: 0,
        offsetThreshold: [0, 0, 0, 0], // -5, -3, 3, 5 屏对应的offset
        cachedSize: new Map<any, number>(),
        initialized: false,
        hasDefaultSize: false,
        defaultItemSize: 40,
        lastScrollTop: 0,
        rearrangeQueue: [] as number[]
      };
    },
    provide() {
      return {
        itemHeight: this.itemHeight,
        setCachedSize: (item : any, size : number) => {
          if(this.itemHeight != 0) {
            return
          }
          if (!this.hasDefaultSize) {
            this.defaultItemSize = size
            this.hasDefaultSize = true
          }
          this.cachedSize.set(item, size)
        },
        getCachedSize:  (item : any) => {
          return this.cachedSize.get(item)
        }
      }
    },
    created() {
      if(this.itemHeight != 0) {
        this.defaultItemSize = this.itemHeight
      }
      this.placeholderHeight = this.list.length * this.defaultItemSize
    },
    mounted() {
      nextTick(() => {
        uni.createSelectorQuery().in(this).select('.uni-recycle-view-main').boundingClientRect().exec((ret) => {
          this.scrollElementHeight = (ret[0] as NodeInfo).height!
          this.rearrange(0)
          this.initialized = true
        })
      })
    },
    methods: {
      onScrollEnd(e: UniScrollEvent) {
        this.$emit('scrollend', e)
      },
      onScrollToLower(e: UniScrollToLowerEvent) {
        this.$emit('scrolltolower', e)
      },
      onScrollToUpper(e: UniScrollToUpperEvent) {
        this.$emit('scrolltoupper', e)
      },
      onRefresherAbort(e: UniRefresherEvent) {
        this.$emit('refresherabort', e)
      },
      onRefresherPulling(e: UniRefresherEvent) {
        this.$emit('refresherpulling', e)
      },
      onRefresherRefresh(e: UniRefresherEvent) {
        this.$emit('refresherrefresh', e)
      },
      onRefresherRestore(e: UniRefresherEvent) {
        this.$emit('refresherrestore', e)
      },
      onScroll(e : UniScrollEvent) {
        this.$emit('scroll', e)
        if (!this.initialized) {
          return
        }
        const scrollTop = e.detail.scrollTop
        if (scrollTop === this.lastScrollTop || scrollTop < 0) {
          return
        }
        this.lastScrollTop = scrollTop
        if (scrollTop < this.offsetThreshold[1] || scrollTop > this.offsetThreshold[2]) {
          this.queue(scrollTop)
        }
      },
      queue(scrollTop : number) {
        /*
         * rearrange内为大量同步逻辑，在上次rearrange未执行完毕的情况下将后续多个rearrange合并成一次执行，即仅执行最后一次
         * 如何测试：push后console.log(this.rearrangeQueue.length) 输出结果大于1时触发优化
         */
        this.rearrangeQueue.push(scrollTop)
        setTimeout(() => {
          this.flush()
        }, 50)
      },
      flush() {
        const queueLength = this.rearrangeQueue.length
        if (queueLength == 0) {
          return
        }
        const lastScrollTop = this.rearrangeQueue[queueLength - 1]
        this.rearrange(lastScrollTop)
        this.rearrangeQueue = [] as number[]
      },
      rearrange(scrollTop : number) {
        this.offsetThreshold[0] = Math.max(scrollTop - this.scrollElementHeight * 5, 0)
        this.offsetThreshold[1] = Math.max(scrollTop - this.scrollElementHeight * 3, 0)
        this.offsetThreshold[2] = Math.min(scrollTop + this.scrollElementHeight * 4, this.placeholderHeight)
        this.offsetThreshold[3] = Math.min(scrollTop + this.scrollElementHeight * 6, this.placeholderHeight)
        const offsetStart = this.offsetThreshold[0]
        const offsetEnd = this.offsetThreshold[3]
        const items = [] as any[]
        const defaultItemSize = this.defaultItemSize
        const cachedSize = this.cachedSize
        const list = this.list
        let tempTotalHeight = 0
        let containerTop = 0
        let start = false, end = false
        for (let i = 0; i < list.length; i++) {
          const item = list[i]
          let itemSize = defaultItemSize
          const cachedItemSize = cachedSize.get(item)
          if (cachedItemSize != null) {
            itemSize = cachedItemSize
          }
          tempTotalHeight += itemSize
          if (end) {
            continue
          }
          if (tempTotalHeight < offsetStart) {
            containerTop = tempTotalHeight
          } else if (tempTotalHeight >= offsetStart && tempTotalHeight <= offsetEnd) {
            if (start == false) {
              start = true
            }
            items.push(item)
          } else {
            if (!end) {
              end = true
            }
          }
        }
        this.placeholderHeight = tempTotalHeight
        this.items = items
        this.containerTop = containerTop
      }
    }
  })

export default __sfc__
function GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    class: "uni-recycle-view-main",
    ref: "scroll",
    type: _ctx.type,
    direction: _ctx.direction,
    "associative-container": _ctx.associativeContainer,
    "enable-back-to-top": _ctx.enableBackToTop,
    bounces: _ctx.bounces,
    "upper-threshold": _ctx.upperThreshold,
    "lower-threshold": _ctx.lowerThreshold,
    "scroll-top": _ctx.scrollTop,
    "scroll-left": _ctx.scrollLeft,
    "scroll-into-view": _ctx.scrollIntoView,
    "scroll-with-animation": _ctx.scrollWithAnimation,
    "refresher-enabled": _ctx.refresherEnabled,
    "refresher-threshold": _ctx.refresherThreshold,
    "refresher-max-drag-distance": _ctx.refresherMaxDragDistance,
    "refresher-default-style": _ctx.refresherDefaultStyle,
    "refresher-background": _ctx.refresherBackground,
    "refresher-triggered": _ctx.refresherTriggered,
    "show-scrollbar": _ctx.showScrollbar,
    "custom-nested-scroll": _ctx.customNestedScroll,
    "nested-scroll-child": _ctx.nestedScrollChild,
    onScroll: _ctx.onScroll,
    onScrollend: _ctx.onScrollEnd,
    onScrolltolower: _ctx.onScrollToLower,
    onScrolltoupper: _ctx.onScrollToUpper,
    onRefresherabort: _ctx.onRefresherAbort,
    onRefresherpulling: _ctx.onRefresherPulling,
    onRefresherrefresh: _ctx.onRefresherRefresh,
    onRefresherrestore: _ctx.onRefresherRestore
  }), [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({ height: _ctx.placeholderHeight + 'px' })),
      class: "uni-recycle-view-placeholder"
    }), [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({ top: _ctx.containerTop + 'px' })),
        class: "uni-recycle-view-container"
      }), [
        renderSlot(_ctx.$slots, "default", utsMapOf({ items: _ctx.items }))
      ], 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 40 /* PROPS, NEED_HYDRATION */, ["type", "direction", "associative-container", "enable-back-to-top", "bounces", "upper-threshold", "lower-threshold", "scroll-top", "scroll-left", "scroll-into-view", "scroll-with-animation", "refresher-enabled", "refresher-threshold", "refresher-max-drag-distance", "refresher-default-style", "refresher-background", "refresher-triggered", "show-scrollbar", "custom-nested-scroll", "nested-scroll-child", "onScroll", "onScrollend", "onScrolltolower", "onScrolltoupper", "onRefresherabort", "onRefresherpulling", "onRefresherrefresh", "onRefresherrestore"])
}
export type UniRecycleViewComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleViewStyles = [utsMapOf([["uni-recycle-view-placeholder", padStyleMapOf(utsMapOf([["position", "relative"], ["overflow", "hidden"]]))], ["uni-recycle-view-container", padStyleMapOf(utsMapOf([["position", "absolute"], ["width", "100%"]]))]])]
