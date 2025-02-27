const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTransformTranslateRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({ class: "page" }), [
    createElementVNode("view", utsMapOf({ class: "trace" }), [
      createElementVNode("view", utsMapOf({ class: "base reserve" }), [
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "translateX(80%)"),
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
      ]),
      createElementVNode("view", utsMapOf({ class: "base reserve" }), [
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "translateY(50px)"),
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
      ]),
      createElementVNode("view", utsMapOf({ class: "base reserve" }), [
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "translate(-50%,50%)"),
        createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
      ])
    ]),
    createElementVNode("view", utsMapOf({
      class: "base transform",
      style: normalizeStyle(utsMapOf({"transform":"translateX(80%)"}))
    }), [
      createElementVNode("text", null, "translateX(80%)"),
      createElementVNode("text", null, "转变后位置")
    ], 4 /* STYLE */),
    createElementVNode("view", utsMapOf({
      class: "base transform",
      style: normalizeStyle(utsMapOf({"transform":"translateY(50px)"}))
    }), [
      createElementVNode("text", null, "translateY(50px)"),
      createElementVNode("text", null, "转变后位置")
    ], 4 /* STYLE */),
    createElementVNode("view", utsMapOf({
      class: "base transform",
      style: normalizeStyle(utsMapOf({"transform":"translate(-50%, 50%)"}))
    }), [
      createElementVNode("text", null, "translate(-50%,50%)"),
      createElementVNode("text", null, "转变后位置")
    ], 4 /* STYLE */)
  ])
}
const GenPagesCSSTransformTranslateStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1], ["alignItems", "center"]]))], ["trace", padStyleMapOf(utsMapOf([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["alignItems", "center"]]))], ["base", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10], ["width", 150], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"]]))], ["reserve", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "dotted"], ["borderColor", "#558888"], ["backgroundColor", "#DDDDDD"]]))], ["reserve-text", padStyleMapOf(utsMapOf([["color", "#CCCCCC"]]))], ["transform", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#0000FF"], ["backgroundColor", "rgba(0,255,255,0.5)"]]))]])]
