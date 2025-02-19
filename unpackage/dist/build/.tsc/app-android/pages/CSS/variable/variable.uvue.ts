const __sfc__ = defineComponent({})
export default __sfc__
function GenPagesCSSVariableVariableRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "page" }), [
    createElementVNode("view", utsMapOf({ class: "status-bar-height" }), [
      createElementVNode("text", null, "status bar height")
    ]),
    createElementVNode("view", utsMapOf({ class: "window-top" }), [
      createElementVNode("text", null, "window top")
    ]),
    createElementVNode("view", utsMapOf({ class: "window-bottom" }), [
      createElementVNode("text", null, "window bottom")
    ])
  ])
}
const GenPagesCSSVariableVariableStyles = [utsMapOf([["status-bar-height", padStyleMapOf(utsMapOf([["height", CSS_VAR_STATUS_BAR_HEIGHT], ["backgroundColor", "#FF0000"]]))], ["window-top", padStyleMapOf(utsMapOf([["height", CSS_VAR_WINDOW_TOP], ["backgroundColor", "#008000"]]))], ["window-bottom", padStyleMapOf(utsMapOf([["height", CSS_VAR_WINDOW_BOTTOM], ["backgroundColor", "#0000FF"]]))]])]
