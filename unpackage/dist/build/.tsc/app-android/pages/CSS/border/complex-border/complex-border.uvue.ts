const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSBorderComplexBorderComplexBorderRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex-grow":"1"}))
  }), [
    createElementVNode("view", null, [
      createElementVNode("text", null, "圆角 : 各边之间 不同width && 不同颜色 && 不同圆角"),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"250px","height":"250px","background-color":"gray","justify-content":"center","align-items":"center"}))
      }), [
        createElementVNode("view", utsMapOf({ class: "border-circle" }))
      ], 4 /* STYLE */)
    ]),
    createElementVNode("view", null, [
      createElementVNode("text", null, "直角 : 各边之间 不同width && 不同颜色 "),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"width":"250px","height":"250px","background-color":"gray","justify-content":"center","align-items":"center"}))
      }), [
        createElementVNode("view", utsMapOf({ class: "border-rect" }))
      ], 4 /* STYLE */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesCSSBorderComplexBorderComplexBorderStyles = [utsMapOf([["common", padStyleMapOf(utsMapOf([["width", 250], ["height", 250], ["backgroundColor", "#808080"]]))], ["border-circle", padStyleMapOf(utsMapOf([["width", 125], ["height", 125], ["backgroundColor", "#00dd00"], ["borderWidth", 10], ["borderStyle", "solid"], ["borderColor", "#000000"], ["borderBottomWidth", 20], ["borderBottomColor", "#ff0000"], ["borderBottomRightRadius", 25], ["borderBottomLeftRadius", 15], ["borderRadius", 5], ["borderRightColor", "#FFDC02"]]))], ["border-rect", padStyleMapOf(utsMapOf([["width", 125], ["height", 125], ["borderStyle", "solid"], ["backgroundColor", "#00dd00"], ["borderWidth", 10], ["borderColor", "#000000"], ["borderBottomWidth", 20], ["borderBottomColor", "#ff0000"], ["borderRightColor", "#FFDC02"]]))]])]
