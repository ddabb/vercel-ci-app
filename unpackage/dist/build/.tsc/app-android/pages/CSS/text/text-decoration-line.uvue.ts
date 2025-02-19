const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTextTextDecorationLineRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex-grow":"1"}))
  }), [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"height":"250px","background-color":"gray","justify-content":"center","align-items":"center"}))
    }), [
      createElementVNode("text", utsMapOf({
        class: "common",
        style: normalizeStyle(utsMapOf({"text-decoration-line":"underline"}))
      }), "text-decoration-line: underline", 4 /* STYLE */),
      createElementVNode("text", utsMapOf({
        class: "common",
        style: normalizeStyle(utsMapOf({"text-decoration-line":"line-through"}))
      }), "text-decoration-line: line-through", 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextTextDecorationLineStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["fontSize", 20]]))]])]
