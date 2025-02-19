
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
        animationFinishIndex: 0,
        swiperWidth: 0
      }
    },
    onLoad() {
      for (let i = 0; i < 4; i++) {
        this.swiperList.push({
          title: "Tab " + i
        } as SwiperViewItem)
      }
    },
    onReady() {
      this.tabScrollView = this.$refs['tabScroll'] as UniElement;
      (this.$refs["swiper"] as UniElement).getBoundingClientRectAsync()!.then((res : DOMRect) => {
        this.swiperWidth = res.width
        this.updateTabIndicator(this.swiperIndex, this.swiperIndex, 1)
      });
    },
    methods: {
      onTabClick(index : number) {
        this.setSwiperIndex(index, false)
      },
      onSwiperTransition(e : SwiperTransitionEvent) {
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
      onSwiperAnimationfinish(e : SwiperAnimationFinishEvent) {
        this.setSwiperIndex(e.detail.current, true)
        this.animationFinishIndex = e.detail.current
      },
      setSwiperIndex(index : number, updateIndicator : boolean) {
        if (this.swiperIndex == index) {
          return
        }

        this.swiperIndex = index

        if (updateIndicator) {
          this.updateTabIndicator(index, index, 1)
        }
      },
      updateTabIndicator(current_index : number, move_to_index : number, percentage : number) {
        if (percentage == 0) {
          return
        }

        // 缩放范围
        const min_ratio = 1
        const max_ratio = 1.3

        const tabs = this.$refs['swipertab'] as UniElement[]
        const current_node = tabs[current_index]
        const move_to_node = tabs[move_to_index]

        // 当前
        const current_scale = lerpNumber(min_ratio, max_ratio, 1 - percentage)
        current_node.style.setProperty('transform', `scale(${current_scale})`)

        // 目标
        const move_to_scale = lerpNumber(min_ratio, max_ratio, percentage)
        move_to_node.style.setProperty('transform', `scale(${move_to_scale})`)

        // 滚动到水平中心位置
        const target_x = lerpNumber(current_node.offsetLeft, move_to_node.offsetLeft, percentage)
        const center_x = target_x + move_to_node.offsetWidth / 2 - this.swiperWidth / 2
        // app 平台后续支持 scrollTo()

        this.tabScrollView!.scrollLeft = center_x






      }
    }
  })

export default __sfc__
function GenPagesTemplateSwiperList2SwiperList2Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "swiper-list" }), [
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
            class: normalizeClass(["swiper-tabs-item", _ctx.swiperIndex==index ? 'swiper-tabs-item-active' : '']),
            key: index,
            onClick: () => {_ctx.onTabClick(index)}
          }), toDisplayString(item.title), 11 /* TEXT, CLASS, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      ], 4 /* STYLE */)
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
const GenPagesTemplateSwiperList2SwiperList2Styles = [utsMapOf([["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["swiper-list", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper-tabs-item", padStyleMapOf(utsMapOf([["color", "#555555"], ["fontSize", 16], ["marginTop", 15], ["marginRight", 25], ["marginBottom", 5], ["marginLeft", 25], ["whiteSpace", "nowrap"]]))], ["swiper-tabs-item-active", padStyleMapOf(utsMapOf([["color", "#000000"]]))], ["swiper-view", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper-item", padStyleMapOf(utsMapOf([["flex", 1], ["alignItems", "center"], ["justifyContent", "center"]]))], ["swiper-item-text", padStyleMapOf(utsMapOf([["fontSize", 72], ["fontWeight", "bold"]]))]])]
