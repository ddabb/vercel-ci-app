
  const __sfc__ = defineComponent({
    data() {
      return {
        display: 'none'
      }
    },
    methods: {
      switchDisplay() {
        this.display = ('flex' == this.display) ? 'none' : 'flex';
      }
    }
  })

export default __sfc__
function GenPagesCSSDisplayNoneRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    class: "page",
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "head" }), [
      createElementVNode("text", utsMapOf({ class: "tip" }), "下面有一个灰色区域，display默认值为none"),
      createElementVNode("text", utsMapOf({ class: "tip" }), "当前display值：" + toDisplayString(_ctx.display), 1 /* TEXT */)
    ]),
    createElementVNode("view", utsMapOf({
      class: "content",
      style: normalizeStyle(utsMapOf({display:_ctx.display}))
    }), [
      createElementVNode("text", utsMapOf({
        style: normalizeStyle(utsMapOf({"background-color":"aquamarine"}))
      }), "展示display区域", 4 /* STYLE */)
    ], 4 /* STYLE */),
    createElementVNode("button", utsMapOf({ onClick: _ctx.switchDisplay }), "切换display属性", 8 /* PROPS */, ["onClick"])
  ], 4 /* STYLE */)
}
const GenPagesCSSDisplayNoneStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["alignItems", "center"], ["height", "100%"]]))], ["head", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginBottom", 10], ["alignItems", "center"]]))], ["tip", padStyleMapOf(utsMapOf([["color", "#FF0000"]]))], ["content", padStyleMapOf(utsMapOf([["borderWidth", 5], ["borderStyle", "solid"], ["borderColor", "#0000FF"], ["marginTop", 50], ["marginRight", 0], ["marginBottom", 50], ["marginLeft", 0], ["paddingTop", 50], ["paddingRight", 50], ["paddingBottom", 50], ["paddingLeft", 50], ["width", 200], ["height", 200], ["backgroundColor", "#808080"], ["alignItems", "center"], ["justifyContent", "center"]]))]])]
