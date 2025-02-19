
  type SwiperTabsItem = {
    x : number,
    w : number
  }

  type SwiperViewItem = {
    title : string,
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
    data() {
      return {
        swiperList: [] as SwiperViewItem[],
        swiperIndex: 0,
        tabScrollView: null as null | UniElement,
        indicatorNode: null as null | UniElement,
        animationFinishIndex: 0,
        swiperWidth: 0,
        swiperTabsRect: [] as SwiperTabsItem[]
      }
    },
    onLoad() {
      // 初始化 8 个页签，宽度依次递增，用于演示在滑动 swiper 过程中指示线宽度的线性变化
      for (let i = 0; i < 8; i++) {
        const space = " ".repeat(i)
        this.swiperList.push({
          title: "Tab " + space + i
        } as SwiperViewItem)
      }
    },
    onReady() {
      this.tabScrollView = this.$refs['tabScroll'] as UniElement;
      this.indicatorNode = this.$refs['indicator'] as UniElement;
      (this.$refs["swiper"] as UniElement).getBoundingClientRectAsync()!.then((res : DOMRect) : Promise<void> => {
        this.swiperWidth = res.width
        return this.cacheTabItemsSize()
      }).then(() => {
        this.updateTabIndicator(this.swiperIndex, this.swiperIndex, 1)
      });
    },
    methods: {
      /**
       * 每个页签的点击事件，点击后设置当前 swiper.
       * @constructor
       * @param {number} index - 当前索引，该值应介于 0 和 最大数量之间.
       */
      onTabClick(index : number) {
        this.setSwiperIndex(index, false)
      },
      onSwiperTransition(e : SwiperTransitionEvent) {
        // 微信 skyline 每项完成触发 Animationfinish，偏移值重置
        // 微信 webview 全部完成触发 Animationfinish，偏移值累加
        // 在滑动到下一个项的过程中，再次反向滑动，偏移值递减
        // uni-app-x 和 微信 webview 行为一致

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
        if (current_index != move_to_index) {
          this.updateTabIndicator(current_index, move_to_index, percentage)
        }
      },
      /**
       * Swiper滑动动画结束事件.
       */
      onSwiperAnimationfinish(e : SwiperAnimationFinishEvent) {
        this.setSwiperIndex(e.detail.current, true)

        // 记录上次的索引位置
        this.animationFinishIndex = e.detail.current
      },
      /**
       * 缓存所有页签的左边距和宽度，用于计算指示线在移动过程中的线性变化.
       */
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
      /**
       * 设置当前 swiper 选中的索引值.
       * @constructor
       * @param {number} index - 当前索引，该值应介于 0 和 最大数量之间.
       * @param {boolean} updateIndicator - 是否更新指示线.
       */
      setSwiperIndex(index : number, updateIndicator : boolean) {
        if (this.swiperIndex === index) {
          return
        }

        this.swiperIndex = index

        if (updateIndicator) {
          this.updateTabIndicator(index, index, 1)
        }
      },
      /**
       * 更新页签指示线的位置和宽度.
       * @constructor
       * @param {number} current_index - 当前索引，该值应介于 0 和 最大数量之间.
       * @param {number} move_to_index - 目标索引，该值应介于 0 和 最大数量之间.
       * @param {number} percentage - 偏移百分比，应介于 0 和 1 之间，用于计算在移动过程中的线性值.
       */
      updateTabIndicator(current_index : number, move_to_index : number, percentage : number) {
        const current_size = this.swiperTabsRect[current_index]
        const move_to_size = this.swiperTabsRect[move_to_index]

        // 计算指示线 位置 和 宽度 在移动过程中的线性值
        const indicator_line_x = lerpNumber(current_size.x, move_to_size.x, percentage)
        const indicator_line_w = lerpNumber(current_size.w, move_to_size.w, percentage)

        // 通过 transform 更新指示线，避免重排版

        const x = indicator_line_x + indicator_line_w / 2
        this.indicatorNode?.style?.setProperty('transform', `translateX(${x}px) scaleX(${indicator_line_w})`)








        // 滚动到水平中心位置
        const scroll_x = x - this.swiperWidth / 2
        // app 平台后续支持 scrollTo()

        this.tabScrollView!.scrollLeft = scroll_x






      }
    }
  })

export default __sfc__
function GenPagesTemplateSwiperListSwiperListRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "swiper-list" }), [
    createElementVNode("scroll-view", utsMapOf({
      ref: "tabScroll",
      class: "swiper-tabs",
      direction: "horizontal",
      "show-scrollbar": false
    }), [
      createElementVNode("view", utsMapOf({ class: "flex-row" }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, (item, index, __index, _cached): any => {
          return createElementVNode("text", utsMapOf({
            ref_for: true,
            ref: "swipertab",
            space: "nbsp",
            class: normalizeClass(["swiper-tabs-item", _ctx.swiperIndex==index ? 'swiper-tabs-item-active' : '']),
            key: index,
            onClick: () => {_ctx.onTabClick(index)}
          }), toDisplayString(item.title), 11 /* TEXT, CLASS, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      ]),
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
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, (_, index, __index, _cached): any => {
        return createElementVNode("swiper-item", utsMapOf({
          class: "swiper-item",
          key: index
        }), [
          createElementVNode("text", utsMapOf({ class: "swiper-item-text" }), toDisplayString(index), 1 /* TEXT */)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ], 40 /* PROPS, NEED_HYDRATION */, ["current", "onTransition", "onAnimationfinish"])
  ])
}
const GenPagesTemplateSwiperListSwiperListStyles = [utsMapOf([["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["alignSelf", "flex-start"]]))], ["swiper-list", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper-tabs", padStyleMapOf(utsMapOf([["backgroundColor", "#ffffff"]]))], ["swiper-tabs-item", padStyleMapOf(utsMapOf([["color", "#555555"], ["fontSize", 16], ["paddingTop", 12], ["paddingRight", 25], ["paddingBottom", 12], ["paddingLeft", 25], ["whiteSpace", "nowrap"]]))], ["swiper-tabs-item-active", padStyleMapOf(utsMapOf([["color", "#007AFF"]]))], ["swiper-tabs-indicator", padStyleMapOf(utsMapOf([["width", 1], ["height", 2], ["backgroundColor", "#007AFF"]]))], ["swiper-view", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper-item", padStyleMapOf(utsMapOf([["flex", 1], ["alignItems", "center"], ["justifyContent", "center"]]))], ["swiper-item-text", padStyleMapOf(utsMapOf([["fontSize", 72], ["fontWeight", "bold"]]))]])]
