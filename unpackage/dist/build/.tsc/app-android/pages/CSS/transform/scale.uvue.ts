const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSTransformScaleRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({ class: "page" }), [
    createElementVNode("view", utsMapOf({ class: "scale-container" }), [
      createElementVNode("view", utsMapOf({ class: "trace" }), [
        createElementVNode("view", utsMapOf({ class: "base reserve" }), [
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "scaleX(0.6)"),
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
        ]),
        createElementVNode("view", utsMapOf({ class: "base reserve" }), [
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "scaleY(0.8)"),
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
        ]),
        createElementVNode("view", utsMapOf({ class: "base reserve" }), [
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "scale(0.8,0.8)"),
          createElementVNode("text", utsMapOf({ class: "reserve-text" }), "转变前位置")
        ])
      ]),
      createElementVNode("view", utsMapOf({
        class: "base transform",
        style: normalizeStyle(utsMapOf({"transform":"scaleX(0.6)"}))
      }), [
        createElementVNode("text", null, "scaleX(0.6)"),
        createElementVNode("text", null, "转变后位置")
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        class: "base transform",
        style: normalizeStyle(utsMapOf({"transform":"scaleY(0.6)"}))
      }), [
        createElementVNode("text", null, "scaleY(0.6)"),
        createElementVNode("text", null, "转变后位置")
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        class: "base transform",
        style: normalizeStyle(utsMapOf({"transform":"scale(1.2,1.2)"}))
      }), [
        createElementVNode("text", null, "scale(1.2,1.2)"),
        createElementVNode("text", null, "转变后位置")
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({ class: "base" }), [
        createElementVNode("text", null, "通过scaleY(0.5)实现0.5px的线"),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"width":"150px","height":"1px","background-color":"#000","transform":"scaleY(0.5)"}))
        }), null, 4 /* STYLE */)
      ])
    ])
  ])
}
const GenPagesCSSTransformScaleStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1]]))], ["scale-container", padStyleMapOf(utsMapOf([["display", "flex"], ["alignItems", "center"]]))], ["trace", padStyleMapOf(utsMapOf([["position", "absolute"], ["top", 0], ["left", 0], ["width", "100%"], ["alignItems", "center"]]))], ["base", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10], ["width", 150], ["height", 150], ["alignItems", "center"], ["justifyContent", "center"]]))], ["reserve", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "dotted"], ["borderColor", "#558888"], ["backgroundColor", "#DDDDDD"]]))], ["reserve-text", padStyleMapOf(utsMapOf([["color", "#CCCCCC"]]))], ["transform", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#0000FF"], ["backgroundColor", "rgba(0,255,255,0.5)"]]))]])]
