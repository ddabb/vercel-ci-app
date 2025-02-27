
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'switch 开关',
        checked: true,
        color: '#FFCC33',
        clickCheckedValue: true,
        testVerifyEvent: false,
      }
    },
    methods: {
      switch1Change: function (e : UniSwitchChangeEvent) {
        this.clickCheckedValue = e.detail.value
        console.log('switch1 发生 change 事件，携带值为', e.detail.value)

        // 仅测试
        this.testVerifyEvent = (e.type == 'change' && (e.target?.tagName ?? '') == "SWITCH")
      },
      switch2Change: function (e : UniSwitchChangeEvent) {
        console.log('switch2 发生 change 事件，携带值为', e.detail.value)
      }
    }
  })

export default __sfc__
function GenPagesComponentSwitchSwitchRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch", true)

  return createElementVNode("view", null, [
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), "默认样式"),
      createElementVNode("view", utsMapOf({ class: "flex-row" }), [
        createVNode(_component_switch, utsMapOf({
          class: "switch-checked",
          checked: _ctx.checked,
          onChange: _ctx.switch1Change
        }), null, 8 /* PROPS */, ["checked", "onChange"]),
        createVNode(_component_switch, utsMapOf({ onChange: _ctx.switch2Change }), null, 8 /* PROPS */, ["onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), "暗黑样式"),
      createElementVNode("view", utsMapOf({ class: "flex-row" }), [
        createVNode(_component_switch, utsMapOf({
          id: "darkChecked",
          "background-color": "#1f1f1f",
          activeBackgroundColor: "#007aff",
          foreColor: "#f0f0f0",
          activeForeColor: "#ffffff",
          checked: _ctx.checked
        }), null, 8 /* PROPS */, ["checked"]),
        createVNode(_component_switch, utsMapOf({
          id: "dark",
          "background-color": "#1f1f1f",
          activeBackgroundColor: "#007aff",
          foreColor: "#f0f0f0",
          activeForeColor: "#ffffff"
        }))
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), "禁用样式"),
      createElementVNode("view", utsMapOf({ class: "flex-row" }), [
        createVNode(_component_switch, utsMapOf({
          class: "switch-checked",
          checked: _ctx.checked,
          disabled: true
        }), null, 8 /* PROPS */, ["checked"]),
        createVNode(_component_switch, utsMapOf({ disabled: true }))
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), "不同颜色和尺寸的switch"),
      createElementVNode("view", utsMapOf({ class: "flex-row" }), [
        createVNode(_component_switch, utsMapOf({
          class: "switch-color-checked",
          color: _ctx.color,
          style: normalizeStyle(utsMapOf({"transform":"scale(0.7)"})),
          checked: true
        }), null, 8 /* PROPS */, ["color", "style"]),
        createVNode(_component_switch, utsMapOf({
          class: "switch-color",
          color: _ctx.color,
          style: normalizeStyle(utsMapOf({"transform":"scale(0.7)"}))
        }), null, 8 /* PROPS */, ["color", "style"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), "推荐展示样式")
    ]),
    createElementVNode("view", utsMapOf({ class: "uni-list" }), [
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "开启中"),
        createVNode(_component_switch, utsMapOf({ checked: true }))
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "关闭"),
        createVNode(_component_switch)
      ])
    ])
  ])
}
const GenPagesComponentSwitchSwitchStyles = [utsMapOf([["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))]])]
