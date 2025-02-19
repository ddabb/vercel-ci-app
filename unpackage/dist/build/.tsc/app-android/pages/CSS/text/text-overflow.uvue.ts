
  const __sfc__ = defineComponent({
    data() {
      return {
        multiLineText: 'HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言',
        singleLineText: 'uts，大一统语言（单行文本）'
      }
    }
  })

export default __sfc__
function GenPagesCSSTextTextOverflowRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex-grow":"1"}))
  }), [
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"height":"250px","padding":"0 30px","background-color":"gray","justify-content":"center"}))
    }), [
      createElementVNode("view", utsMapOf({ class: "margin-bottom-10" }), [
        createElementVNode("text", utsMapOf({ class: "font-weight-bold" }), "text-overflow:clip white-space:nowrap"),
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"text-overflow":"clip","white-space":"nowrap"}))
        }), toDisplayString(_ctx.multiLineText), 5 /* TEXT, STYLE */)
      ]),
      createElementVNode("view", utsMapOf({ class: "margin-bottom-10" }), [
        createElementVNode("text", utsMapOf({ class: "font-weight-bold" }), "text-overflow:ellipsis white-space:nowrap"),
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"text-overflow":"ellipsis","white-space":"nowrap"}))
        }), toDisplayString(_ctx.singleLineText), 5 /* TEXT, STYLE */),
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"text-overflow":"ellipsis","white-space":"nowrap"}))
        }), toDisplayString(_ctx.multiLineText), 5 /* TEXT, STYLE */)
      ]),
      createElementVNode("view", utsMapOf({ class: "margin-bottom-10" }), [
        createElementVNode("text", utsMapOf({ class: "font-weight-bold" }), "white-space:normal"),
        createElementVNode("text", utsMapOf({
          class: "font-size-20",
          style: normalizeStyle(utsMapOf({"white-space":"normal"}))
        }), toDisplayString(_ctx.multiLineText), 5 /* TEXT, STYLE */)
      ])
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesCSSTextTextOverflowStyles = [utsMapOf([["font-size-20", padStyleMapOf(utsMapOf([["fontSize", 20]]))], ["font-weight-bold", padStyleMapOf(utsMapOf([["fontWeight", "bold"]]))], ["margin-bottom-10", padStyleMapOf(utsMapOf([["marginBottom", 10]]))]])]
