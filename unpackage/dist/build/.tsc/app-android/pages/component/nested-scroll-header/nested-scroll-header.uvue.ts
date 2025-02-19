
  const __sfc__ = defineComponent({
    data() {
      return {
        scrollData: [] as Array<string>,
      }
    },
    onLoad() {
      let lists : Array<string> = []
      for (let i = 0; i < 30; i++) {
        lists.push("item---" + i)
      }
      this.scrollData = lists
    },
    methods: {
    }
  })

export default __sfc__
function GenPagesComponentNestedScrollHeaderNestedScrollHeaderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    type: "nested",
    direction: "vertical"
  }), [
    createElementVNode("nested-scroll-header", null, [
      createElementVNode("view", utsMapOf({ class: "scroll-header-tiem1" }), [
        createElementVNode("text", null, "会渲染的nested-scroll-header")
      ]),
      createElementVNode("view", utsMapOf({ class: "scroll-header-tiem1" }), [
        createElementVNode("text", null, "不会渲染nested-scroll-header，因为 nested-scroll-header 只会渲染第一个子节点")
      ])
    ]),
    createElementVNode("nested-scroll-header", null, [
      createElementVNode("swiper", utsMapOf({
        ref: "header",
        "indicator-dots": "true",
        circular: "true"
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(3, (i, __key, __index, _cached): any => {
          return createElementVNode("swiper-item", utsMapOf({ "item-id": i }), [
            createElementVNode("view", utsMapOf({ class: "scroll-header-tiem2" }), [
              createElementVNode("text", null, "如果存在多个头部节点，那么就使用多个 nested-scroll-header 来将其包裹")
            ])
          ], 8 /* PROPS */, ["item-id"])
        }), 64 /* STABLE_FRAGMENT */)
      ], 512 /* NEED_PATCH */)
    ]),
    createElementVNode("nested-scroll-body", null, [
      createElementVNode("scroll-view", utsMapOf({
        style: normalizeStyle(utsMapOf({"flex":"1"})),
        "associative-container": "nested-scroll-view"
      }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, (key, __key, __index, _cached): any => {
          return createElementVNode("view", null, [
            createElementVNode("view", utsMapOf({ class: "scroll-item" }), [
              createElementVNode("text", utsMapOf({ class: "scroll-item-title" }), toDisplayString(key), 1 /* TEXT */)
            ])
          ])
        }), 256 /* UNKEYED_FRAGMENT */)
      ], 4 /* STYLE */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentNestedScrollHeaderNestedScrollHeaderStyles = [utsMapOf([["scroll-item", padStyleMapOf(utsMapOf([["marginLeft", 6], ["marginRight", 6], ["marginTop", 6], ["backgroundColor", "#ffffff"], ["borderRadius", 4]]))], ["scroll-item-title", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 60], ["lineHeight", "60px"], ["textAlign", "center"], ["color", "#555555"]]))], ["scroll-header-tiem1", padStyleMapOf(utsMapOf([["height", 200], ["backgroundColor", "#66ccff"], ["alignItems", "center"], ["justifyContent", "center"]]))], ["scroll-header-tiem2", padStyleMapOf(utsMapOf([["height", 100], ["backgroundColor", "#89ff8d"], ["alignItems", "center"], ["justifyContent", "center"]]))]])]
