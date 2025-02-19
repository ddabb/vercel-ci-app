
  const __sfc__ = defineComponent({
    data() {
      return {
        sift_item: ["排序", "筛选"],
        list_item: [] as Array<string>,
        refresher_enabled_boolean: true,
        refresher_triggered_boolean: false,
        scroll_top_input: 0
      }
    },
    onLoad() {
      let lists : Array<string> = []
      for (let i = 0; i < 40; i++) {
        lists.push("item---" + i)
      }
      this.list_item = lists
    },
    methods: {
      list_view_refresherrefresh() {
        console.log("下拉刷新被触发 ")
        this.refresher_triggered_boolean = true
        setTimeout(() => {
          this.refresher_triggered_boolean = false
        }, 1500)
      },
      confirm_scroll_top_input(value : number) {
        this.scroll_top_input = value
      },
      clickTH(index : number) {
        console.log("点击表头：" + index);
      }
    }
  })

export default __sfc__
function GenPagesComponentStickyHeaderStickyHeaderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("list-view", utsMapOf({
    "scroll-y": true,
    class: "page",
    rebound: "false",
    "show-scrollbar": "false",
    "scroll-top": _ctx.scroll_top_input,
    "refresher-enabled": _ctx.refresher_enabled_boolean,
    "refresher-triggered": _ctx.refresher_triggered_boolean,
    onRefresherrefresh: _ctx.list_view_refresherrefresh
  }), [
    createElementVNode("list-item", utsMapOf({ type: "1" }), [
      createElementVNode("swiper", utsMapOf({
        "indicator-dots": "true",
        circular: "true",
        style: normalizeStyle(utsMapOf({"height":"240px"}))
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(3, (i, __key, __index, _cached): any => {
          return createElementVNode("swiper-item", utsMapOf({
            "item-id": i + ''
          }), [
            createElementVNode("image", utsMapOf({
              src: "/static/shuijiao.jpg",
              style: normalizeStyle(utsMapOf({"height":"240px","width":"100%"}))
            }), null, 4 /* STYLE */),
            createElementVNode("text", utsMapOf({
              style: normalizeStyle(utsMapOf({"position":"absolute"}))
            }), toDisplayString(i), 5 /* TEXT, STYLE */)
          ], 8 /* PROPS */, ["item-id"])
        }), 64 /* STABLE_FRAGMENT */)
      ], 4 /* STYLE */)
    ]),
    createElementVNode("list-item", utsMapOf({
      class: "content-item",
      type: "2"
    }), [
      createElementVNode("text", utsMapOf({ class: "text" }), "向上滑动页面，体验sticky-header吸顶效果。")
    ]),
    createElementVNode("sticky-header", null, [
      createElementVNode("scroll-view", utsMapOf({
        style: normalizeStyle(utsMapOf({"background-color":"#f5f5f5","flex-direction":"row"})),
        direction: "horizontal",
        "show-scrollbar": false
      }), [
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"align-self":"flex-start","flex-direction":"row"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.sift_item, (name, index, __index, _cached): any => {
            return createElementVNode("text", utsMapOf({
              ref_for: true,
              ref: "swipertab",
              class: "sift-item",
              onClick: () => {_ctx.clickTH(index)}
            }), toDisplayString(name), 9 /* TEXT, PROPS */, ["onClick"])
          }), 256 /* UNKEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ], 4 /* STYLE */)
    ]),
    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.list_item, (item, index, __index, _cached): any => {
      return createElementVNode("list-item", utsMapOf({
        key: index,
        class: "content-item",
        type: "3"
      }), [
        createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(item), 1 /* TEXT */)
      ])
    }), 128 /* KEYED_FRAGMENT */)
  ], 40 /* PROPS, NEED_HYDRATION */, ["scroll-top", "refresher-enabled", "refresher-triggered", "onRefresherrefresh"])
}
const GenPagesComponentStickyHeaderStickyHeaderStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1], ["backgroundColor", "#f5f5f5"]]))], ["content-item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["marginBottom", 10], ["backgroundColor", "#ffffff"]]))], ["text", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#666666"], ["lineHeight", "20px"]]))], ["sift-item", padStyleMapOf(utsMapOf([["color", "#555555"], ["fontSize", 16], ["paddingTop", 12], ["paddingRight", 15], ["paddingBottom", 12], ["paddingLeft", 15]]))]])]
