
  import longPage from './long-list-page.uvue';

  type SwiperTabsItem = {
    x : number,
    w : number
  }

  type SwiperViewItem = {
    type : string,
    name : string,
    preload : boolean,
  }

  /**
   * 根据权重在两个值之间执行线性插值.
   * @constructor
   * @param {number} value1 - 第一个值，该值应为下限.
   * @param {number} value2 - 第二个值，该值应为上限.
   * @param {number} amount - 应介于 0 和 1 之间，指示内插的权重.
   * @returns {number} 内插值
   */
  function lerpNumber(value1 : number, value2 : number, amount : number) : number {
    return (value1 + (value2 - value1) * amount)
  }

  const __sfc__ = defineComponent({
    components: {
      longPage
    },
    data() {
      return {
        swiperList: [
          {
            type: 'UpdatedDate',
            name: '最新上架',
            preload: true
          },
          {
            type: 'FreeHot',
            name: '免费热榜',
            preload: false
          },
          {
            type: 'PaymentHot',
            name: '付费热榜',
            preload: false
          },
          {
            type: 'HotList',
            name: '热门总榜',
            preload: false
          }
        ] as SwiperViewItem[],
        swiperIndex: 0,
        pageScrollView: null as null | UniElement,
        headerHeight: 0,
        animationFinishIndex: 0,
        tabScrollView: null as null | UniElement,
        indicatorNode: null as null | UniElement,
        swiperWidth: 0,
        swiperTabsRect: [] as SwiperTabsItem[]
      }
    },
    onReady() {
      this.pageScrollView = this.$refs['pageScrollView'] as UniElement;
      this.headerHeight = (this.$refs['header'] as UniElement).offsetHeight
      this.tabScrollView = this.$refs['tabScroll'] as UniElement
      this.indicatorNode = this.$refs['indicator'] as UniElement
      (this.$refs["swiper"] as UniElement).getBoundingClientRectAsync()!.then((res : DOMRect) : Promise<void> => {
        this.swiperWidth = res.width
        return this.cacheTabItemsSize()
      }).then(() => {
        this.updateTabIndicator(this.swiperIndex, this.swiperIndex, 1)
      });
    },
    onPullDownRefresh() {
      (this.$refs["longPage"]! as ComponentPublicInstance[])[this.swiperIndex].$callMethod('refreshData', () => {
        uni.stopPullDownRefresh()
      })
    },
    methods: {
      // TODO
      onStartNestedScroll(_ : StartNestedScrollEvent) : boolean {
        return true
      },
      onNestedPreScroll(event : NestedPreScrollEvent) {
        const deltaY = event.deltaY
        const scrollTop = this.pageScrollView!.scrollTop

        // 优先处理父容器滚动，父容器不能滚动时滚动子

        if (deltaY > 0) {
          // 向上滚动，如果父容器 header scrollTop < offsetHeight，先滚动父容器
          if (scrollTop < this.headerHeight) {
            const difference = this.headerHeight - scrollTop - deltaY
            if (difference > 0) {
              this.pageScrollView!.scrollBy(event.deltaX, deltaY)
              event.consumed(event.deltaX, deltaY)
            } else {
              const top : number = deltaY + difference
              event.consumed(event.deltaX, top.toFloat())
              this.pageScrollView!.scrollBy(event.deltaX, top.toFloat())
            }
          }
        } else if (deltaY < 0) {
          // 向下滚动，如果父容器 scrollTop > 0，通知子被父容器消耗，然后滚动到 0
          if (scrollTop > 0) {
            event.consumed(event.deltaX, deltaY)
            this.pageScrollView!.scrollBy(event.deltaX, deltaY)
          }
        }
      },
      onTabClick(index : number) {
        this.setSwiperIndex(index, false)
      },
      onSwiperTransition(e : SwiperTransitionEvent) {
        // 微信 skyline 每项完成触发 Animationfinish，偏移值重置
        // 微信 webview 全部完成触发 Animationfinish，偏移值累加
        // 在滑动到下一个项的过程中，再次反向滑动，偏移值递减
        // uni-app-x 和微信 webview 行为一致

        const offset_x = e.detail.dx

        // 计算当前索引并重置差异
        const current_offset_x = offset_x % this.swiperWidth
        const current_offset_i = offset_x / this.swiperWidth
        const current_index = this.animationFinishIndex + parseInt(current_offset_i + '')

        // 计算目标索引及边界检查
        let move_to_index = current_index
        if (current_offset_x > 0 && move_to_index < this.swiperList.length - 1) {
          move_to_index += 1
        } else if (current_offset_x < 0 && move_to_index > 0) {
          move_to_index -= 1
        }

        // 计算偏移百分比
        const percentage = Math.abs(current_offset_x) / this.swiperWidth

        // 通知更新指示线
        this.updateTabIndicator(current_index, move_to_index, percentage)

        // 首次可见时初始化数据
        this.initSwiperItemData(move_to_index)
      },
      onSwiperAnimationfinish(e : SwiperAnimationFinishEvent) {
        this.setSwiperIndex(e.detail.current, true)
        this.animationFinishIndex = e.detail.current
      },
      async cacheTabItemsSize() {
        this.swiperTabsRect.length = 0;
        const tabs = this.$refs["swipertab"] as UniElement[]
        for (let i = 0; i < tabs.length; i++) {
          const element = tabs[i];
          const rect = await element.getBoundingClientRectAsync()!
          this.swiperTabsRect.push({
            x: rect.left,
            w: rect.width
          } as SwiperTabsItem)
        }
      },
      setSwiperIndex(index : number, updateIndicator : boolean) {
        if (this.swiperIndex === index) {
          return
        }

        this.swiperIndex = index

        this.initSwiperItemData(index)

        if (updateIndicator) {
          this.updateTabIndicator(index, index, 1)
        }
      },
      updateTabIndicator(current_index : number, move_to_index : number, percentage : number) {
        const current_size = this.swiperTabsRect[current_index]
        const move_to_size = this.swiperTabsRect[move_to_index]

        // 计算指示线 左边距 和 宽度 在移动过程中的线性值
        const indicator_line_x = lerpNumber(current_size.x, move_to_size.x, percentage)
        const indicator_line_w = lerpNumber(current_size.w, move_to_size.w, percentage)

        // 更新指示线

        const x = indicator_line_x + indicator_line_w / 2
        this.indicatorNode?.style?.setProperty('transform', `translateX(${x}px) scaleX(${indicator_line_w})`)








        // 滚动到水平中心位置
        const scroll_x = x - this.swiperWidth / 2
        // app 平台后续支持 scrollTo()

        this.tabScrollView!.scrollLeft = scroll_x






      },
      initSwiperItemData(index : number) {
        if (!this.swiperList[index].preload) {
          this.swiperList[index].preload = true;
          (this.$refs["longPage"]! as ComponentPublicInstance[])[index].$callMethod('loadData', null)
        }
      }
    }
  })

export default __sfc__
function GenPagesTemplateLongListLongListRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_long_page = resolveComponent("long-page")

  return createElementVNode("scroll-view", utsMapOf({
    ref: "pageScrollView",
    class: "page",
    rebound: false,
    onStartnestedscroll: _ctx.onStartNestedScroll,
    onNestedprescroll: _ctx.onNestedPreScroll
  }), [
    createElementVNode("view", utsMapOf({
      ref: "header",
      class: "search-bar"
    }), [
      createElementVNode("input", utsMapOf({
        placeholder: "搜索...",
        maxlength: "-1"
      }))
    ], 512 /* NEED_PATCH */),
    createElementVNode("view", utsMapOf({ class: "swiper-list" }), [
      createElementVNode("scroll-view", utsMapOf({
        ref: "tabScroll",
        class: "swiper-tabs",
        direction: "horizontal",
        "show-scrollbar": false
      }), [
        createElementVNode("view", utsMapOf({
          class: "flex-row",
          style: normalizeStyle(utsMapOf({"align-self":"flex-start"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, (item, index, __index, _cached): any => {
            return createElementVNode("text", utsMapOf({
              ref_for: true,
              ref: "swipertab",
              space: "nbsp",
              class: normalizeClass(["swiper-tabs-item", _ctx.swiperIndex==index ? 'swiper-tabs-item-active' : '']),
              key: index,
              onClick: () => {_ctx.onTabClick(index)}
            }), toDisplayString(item.name), 11 /* TEXT, CLASS, PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */),
        createElementVNode("view", utsMapOf({
          ref: "indicator",
          class: "swiper-tabs-indicator"
        }), null, 512 /* NEED_PATCH */)
      ], 512 /* NEED_PATCH */),
      createElementVNode("swiper", utsMapOf({
        ref: "swiper",
        class: "swiper-view",
        current: _ctx.swiperIndex,
        onTransition: _ctx.onSwiperTransition,
        onAnimationfinish: _ctx.onSwiperAnimationfinish
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, (item, index, __index, _cached): any => {
          return createElementVNode("swiper-item", utsMapOf({
            class: "swiper-item",
            key: index
          }), [
            createVNode(_component_long_page, utsMapOf({
              ref_for: true,
              ref: "longPage",
              type: item.type,
              preload: item.preload
            }), null, 8 /* PROPS */, ["type", "preload"])
          ])
        }), 128 /* KEYED_FRAGMENT */)
      ], 40 /* PROPS, NEED_HYDRATION */, ["current", "onTransition", "onAnimationfinish"])
    ])
  ], 40 /* PROPS, NEED_HYDRATION */, ["onStartnestedscroll", "onNestedprescroll"])
}
const GenPagesTemplateLongListLongListStyles = [utsMapOf([["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["page", padStyleMapOf(utsMapOf([["flex", 1]]))], ["search-bar", padStyleMapOf(utsMapOf([["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["swiper-list", padStyleMapOf(utsMapOf([["height", "100%"]]))], ["swiper-tabs", padStyleMapOf(utsMapOf([["backgroundColor", "#ffffff"], ["flexDirection", "column"]]))], ["swiper-tabs-item", padStyleMapOf(utsMapOf([["color", "#555555"], ["fontSize", 16], ["paddingTop", 12], ["paddingRight", 25], ["paddingBottom", 12], ["paddingLeft", 25], ["whiteSpace", "nowrap"]]))], ["swiper-tabs-item-active", padStyleMapOf(utsMapOf([["color", "#007AFF"]]))], ["swiper-tabs-indicator", padStyleMapOf(utsMapOf([["width", 1], ["height", 2], ["backgroundColor", "#007AFF"]]))], ["swiper-view", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper-item", padStyleMapOf(utsMapOf([["flex", 1]]))]])]
