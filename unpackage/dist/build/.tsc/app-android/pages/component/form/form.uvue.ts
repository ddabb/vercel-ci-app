
  const __sfc__ = defineComponent({
    data() {
      return {
        nickname: '',
        gender: '0',
        age: 18,
        loves: ['0'],
        switch: true,
        comment: '',
        formData: {} as UTSJSONObject,
        // 仅测试
        testVerifySubmit: false,
        testVerifyReset: false,
      }
    },
    computed: {
      formDataText() : string {
        return JSON.stringify(this.formData)
      }
    },
    methods: {
      onFormSubmit: function (e : UniFormSubmitEvent) {
        this.formData = e.detail.value

        // 仅测试
        this.testVerifySubmit = (e.type == 'submit' && (e.target?.tagName ?? '') == "FORM")
      },
      onFormReset: function (e : UniFormResetEvent) {
        this.formData = {}

        // 仅测试
        this.testVerifyReset = (e.type == 'reset' && (e.target?.tagName ?? '') == "FORM")
      }
    }
  })

export default __sfc__
function GenPagesComponentFormFormRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_checkbox = resolveComponent("checkbox")
const _component_checkbox_group = resolveComponent("checkbox-group")
const _component_slider = resolveComponent("slider")
const _component_switch = resolveComponent("switch")
const _component_form = resolveComponent("form", true)

  return createElementVNode("scroll-view", utsMapOf({ class: "scroll-view" }), [
    createElementVNode("view", utsMapOf({ class: "page" }), [
      createVNode(_component_form, utsMapOf({
        onSubmit: _ctx.onFormSubmit,
        onReset: _ctx.onFormReset
      }), utsMapOf({
        default: withSlotCtx((): any[] => [
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "姓名"),
            createElementVNode("input", utsMapOf({
              class: "uni-input",
              name: "nickname",
              value: _ctx.nickname,
              placeholder: "请输入姓名",
              maxlength: "-1"
            }), null, 8 /* PROPS */, ["value"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "性别"),
            createVNode(_component_radio_group, utsMapOf({
              name: "gender",
              class: "flex-row"
            }), utsMapOf({
              default: withSlotCtx((): any[] => [
                createElementVNode("view", utsMapOf({ class: "group-item" }), [
                  createVNode(_component_radio, utsMapOf({
                    value: "0",
                    checked: _ctx.gender=='0'
                  }), null, 8 /* PROPS */, ["checked"]),
                  createElementVNode("text", null, "男")
                ]),
                createElementVNode("view", utsMapOf({ class: "group-item" }), [
                  createVNode(_component_radio, utsMapOf({
                    value: "1",
                    checked: _ctx.gender=='1'
                  }), null, 8 /* PROPS */, ["checked"]),
                  createElementVNode("text", null, "女")
                ])
              ]),
              _: 1 /* STABLE */
            }))
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "爱好"),
            createVNode(_component_checkbox_group, utsMapOf({
              name: "loves",
              class: "flex-row"
            }), utsMapOf({
              default: withSlotCtx((): any[] => [
                createElementVNode("view", utsMapOf({ class: "group-item" }), [
                  createVNode(_component_checkbox, utsMapOf({
                    value: "0",
                    checked: _ctx.loves.indexOf('0')>-1
                  }), null, 8 /* PROPS */, ["checked"]),
                  createElementVNode("text", null, "读书")
                ]),
                createElementVNode("view", utsMapOf({ class: "group-item" }), [
                  createVNode(_component_checkbox, utsMapOf({
                    value: "1",
                    checked: _ctx.loves.indexOf('1')>-1
                  }), null, 8 /* PROPS */, ["checked"]),
                  createElementVNode("text", null, "写字")
                ])
              ]),
              _: 1 /* STABLE */
            }))
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "年龄"),
            createVNode(_component_slider, utsMapOf({
              name: "age",
              value: _ctx.age,
              "show-value": true
            }), null, 8 /* PROPS */, ["value"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "保留选项"),
            createElementVNode("view", null, [
              createVNode(_component_switch, utsMapOf({
                name: "switch",
                checked: _ctx.switch
              }), null, 8 /* PROPS */, ["checked"])
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-form-item" }), [
            createElementVNode("view", utsMapOf({ class: "title" }), "备注"),
            createElementVNode("textarea", utsMapOf({
              name: "comment",
              value: _ctx.comment,
              placeholder: "请输入备注",
              style: normalizeStyle(utsMapOf({"background":"#FFF"}))
            }), null, 12 /* STYLE, PROPS */, ["value"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-btn-v flex-row" }), [
            createElementVNode("button", utsMapOf({
              class: "btn btn-submit",
              "form-type": "submit",
              type: "primary"
            }), "Submit"),
            createElementVNode("button", utsMapOf({
              class: "btn btn-reset",
              type: "default",
              "form-type": "reset"
            }), "Reset")
          ])
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onSubmit", "onReset"]),
      createElementVNode("view", utsMapOf({ class: "result" }), "提交的表单数据"),
      createElementVNode("textarea", utsMapOf({
        class: "textarea",
        value: _ctx.formDataText,
        maxlength: -1,
        "auto-height": true
      }), null, 8 /* PROPS */, ["value"])
    ])
  ])
}
const GenPagesComponentFormFormStyles = [utsMapOf([["scroll-view", padStyleMapOf(utsMapOf([["flex", 1]]))], ["page", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["flex-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["uni-form-item", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 0], ["paddingBottom", 15], ["paddingLeft", 0]]))], ["title", padStyleMapOf(utsMapOf([["marginBottom", 10]]))], ["group-item", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["marginRight", 20]]))], ["btn", padStyleMapOf(utsMapOf([["flex", 1]]))], ["btn-submit", padStyleMapOf(utsMapOf([["marginRight", 5]]))], ["btn-reset", padStyleMapOf(utsMapOf([["marginLeft", 5]]))], ["result", padStyleMapOf(utsMapOf([["marginTop", 30]]))], ["textarea", padStyleMapOf(utsMapOf([["marginTop", 5], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5], ["backgroundColor", "#ffffff"]]))]])]
