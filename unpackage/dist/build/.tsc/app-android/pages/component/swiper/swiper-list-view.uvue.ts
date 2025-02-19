
  const __sfc__ = defineComponent({
    data() {
      return {
        swiperCurrentIndex: 0,
        currentVal: 0,
        scrollTop: 0,
        refresherTriggeredArray: [false, false, false] as Array<boolean>,
      }
    },
    methods: {
      swiperChange(e : SwiperChangeEvent) {
        this.swiperCurrentIndex = e.detail.current
      },
      onRefresherrefresh() {
        this.refresherTriggeredArray[this.swiperCurrentIndex] = true;
        setTimeout(() => {
          this.refresherTriggeredArray[this.swiperCurrentIndex] = false;
        }, 100)
      }
    }
  })

export default __sfc__
function GenPagesComponentSwiperSwiperListViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "content-item" }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "左右滑动页面，体验swiper嵌套list-view效果。")
    ]),
    createElementVNode("swiper", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"})),
      current: _ctx.currentVal,
      onChange: _ctx.swiperChange
    }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(3, (index, __key, __index, _cached): any => {
        return createElementVNode("swiper-item", null, [
          createElementVNode("list-view", utsMapOf({
            id: 'list'+index,
            style: normalizeStyle(utsMapOf({"flex":"1"})),
            "refresher-enabled": "true",
            onRefresherrefresh: _ctx.onRefresherrefresh,
            "refresher-triggered": _ctx.refresherTriggeredArray[index-1],
            "scroll-top": _ctx.scrollTop
          }), [
            createElementVNode("sticky-header", null, [
              createElementVNode("text", utsMapOf({ class: "header" }), "上下滑动体验吸顶效果 swiper-item" + toDisplayString(index), 1 /* TEXT */)
            ]),
            createElementVNode(Fragment, null, RenderHelpers.renderList(40, (itemIndex, __key, __index, _cached): any => {
              return createElementVNode("list-item", utsMapOf({ class: "item" }), [
                createElementVNode("text", null, "item----------" + toDisplayString(itemIndex), 1 /* TEXT */)
              ])
            }), 64 /* STABLE_FRAGMENT */)
          ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["id", "onRefresherrefresh", "refresher-triggered", "scroll-top"])
        ])
      }), 64 /* STABLE_FRAGMENT */)
    ], 44 /* STYLE, PROPS, NEED_HYDRATION */, ["current", "onChange"])
  ], 4 /* STYLE */)
}
const GenPagesComponentSwiperSwiperListViewStyles = [utsMapOf([["item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginTop", 0], ["marginRight", 0], ["marginBottom", 5], ["marginLeft", 0], ["backgroundColor", "#ffffff"], ["borderRadius", 5]]))], ["text", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#666666"], ["lineHeight", "20px"]]))], ["content-item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginBottom", 10], ["backgroundColor", "#ffffff"]]))], ["header", padStyleMapOf(utsMapOf([["backgroundColor", "#ffaa00"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["textAlign", "center"], ["color", "#ffffff"]]))]])]
