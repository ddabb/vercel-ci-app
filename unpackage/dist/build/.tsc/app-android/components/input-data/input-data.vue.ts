
  const __sfc__ = defineComponent({
    name: "input-data",
    emits: ['confirm'],
    props: {
      title: {
        type: String,
        required: true
      },
      type: {
        type: String,
        required: true
      },
      defaultValue: {
        type: String,
        required: true,
        default: ''
      }
    },
    data() {
      return {
        inputClearValue: '' as any,
        showClearIcon: false,
        inputType: 'text'
      }
    },
    created() {
      switch (this.type) {
        case 'number':
          this.inputType = 'number'
          break;
      }
      this.inputClearValue = this.getValue(this.defaultValue)
    },
    methods: {
      input: function (event : InputEvent) {
        // @ts-ignore
        this.inputClearValue = event.detail.value
        if ((this.inputClearValue as string).length > 0) {
          this.showClearIcon = true
        } else {
          this.showClearIcon = false
        }

        this.$emit('confirm', this.getValue(this.inputClearValue))
      },
      clearIcon: function () {
        this.inputClearValue = ''
        this.showClearIcon = false
        this.$emit('confirm', this.getValue(this.inputClearValue))
      },
      blur() {
        this.showClearIcon = false
      },
      focus() {
        let inputValue = this.inputClearValue
        if (typeof inputValue !== 'string') {
          inputValue = inputValue.toString()
        }
        if ((inputValue as string).length > 0) {
          this.showClearIcon = true
        } else {
          this.showClearIcon = false
        }
      },
      getValue(value : any) : any {
        switch (this.type) {
          case 'number':
            return parseFloat(value as string)
        }

        return value
      }
    }
  })

export default __sfc__
function GenComponentsInputDataInputDataRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode(Fragment, null, [
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), toDisplayString(_ctx.title), 1 /* TEXT */)
      ])
    ]),
    createElementVNode("view", utsMapOf({ class: "input-wrapper" }), [
      createElementVNode("input", utsMapOf({
        class: "uni-input",
        type: _ctx.inputType,
        value: _ctx.inputClearValue,
        placeholder: _ctx.title,
        maxlength: "-1",
        onInput: _ctx.input,
        onBlur: _ctx.blur,
        onFocus: _ctx.focus
      }), null, 40 /* PROPS, NEED_HYDRATION */, ["type", "value", "placeholder", "onInput", "onBlur", "onFocus"]),
      isTrue(_ctx.showClearIcon)
        ? createElementVNode("image", utsMapOf({
            key: 0,
            class: "input-wrapper_image",
            src: "/static/icons/clear.png",
            onTouchstart: _ctx.clearIcon
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart"])
        : createCommentVNode("v-if", true)
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
export type InputDataComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsInputDataInputDataStyles = [utsMapOf([["input-wrapper", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "rgba(0,0,0,0.08)"], ["flexDirection", "row"], ["justifyContent", "center"], ["paddingTop", 0], ["paddingRight", 0], ["paddingBottom", 0], ["paddingLeft", 0], ["marginTop", 0], ["marginRight", 10], ["marginBottom", 0], ["marginLeft", 10], ["flexWrap", "nowrap"], ["backgroundColor", "#ffffff"]]))], ["input-wrapper_image", padStyleMapOf(utsMapOf([["width", 22], ["height", 22], ["alignSelf", "center"], ["marginRight", 5]]))]])]
