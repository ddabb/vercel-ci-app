const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSLayoutWidthRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex-grow":"1"}))
  }), [
    createElementVNode("view", null, [
      createElementVNode("text", null, "width: 250px"),
      createElementVNode("view", utsMapOf({
        class: "common",
        style: normalizeStyle(utsMapOf({"width":"250px"}))
      }), null, 4 /* STYLE */)
    ]),
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"width":"250px"}))
    }), [
      createElementVNode("text", null, "width: 50%"),
      createElementVNode("view", utsMapOf({
        class: "common",
        style: normalizeStyle(utsMapOf({"width":"50%"}))
      }), null, 4 /* STYLE */)
    ], 4 /* STYLE */),
    createElementVNode("view", null, [
      createElementVNode("text", null, "width: 250rpx"),
      createElementVNode("view", utsMapOf({
        class: "common",
        style: normalizeStyle(utsMapOf({"width":"250rpx"}))
      }), null, 4 /* STYLE */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSLayoutWidthStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["height", 250], ["backgroundColor", "#FF0000"]]))]])]
