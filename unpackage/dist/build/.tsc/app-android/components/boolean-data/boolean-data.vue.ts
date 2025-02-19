
  const __sfc__ = defineComponent({
    emits: ['change'],
    props: {
      title: {
        type: String,
        default: ''
      },
      disabled: {
        type: Boolean,
        default: false
      },
      defaultValue: {
        type: Boolean,
        default: false
      }
    },
    data() {
      return {
        _checked: false
      }
    },
    created() {
      this._checked = this.defaultValue
    },
    methods: {
      // @ts-ignore
      _change(e : UniSwitchChangeEvent) {
        this._checked = e.detail.value;
        this.$emit('change', this._checked)
      }
    }
  })

export default __sfc__
function GenComponentsBooleanDataBooleanDataRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_switch = resolveComponent("switch")

  return createElementVNode("view", utsMapOf({ class: "button-data-main uni-flex" }), [
    createElementVNode("view", utsMapOf({
      class: "uni-title",
      style: normalizeStyle(utsMapOf({"width":"80%"}))
    }), toDisplayString(_ctx.title), 5 /* TEXT, STYLE */),
    createVNode(_component_switch, utsMapOf({
      checked: _ctx._checked,
      disabled: _ctx.disabled,
      onChange: _ctx._change
    }), null, 8 /* PROPS */, ["checked", "disabled", "onChange"])
  ])
}
export type BooleanDataComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenComponentsBooleanDataBooleanDataStyles = [utsMapOf([["button-data-main", padStyleMapOf(utsMapOf([["justifyContent", "space-between"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "rgba(0,0,0,0.06)"], ["alignItems", "center"]]))]])]
