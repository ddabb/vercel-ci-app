
  import { ItemType } from '@/components/enum-data/enum-data-types'
  const __sfc__ = defineComponent({
    data() {
      return {
        plain_boolean: false,
        disabled_boolean: false,
        default_style: false,
        size_enum: [{ "value": 0, "name": "default" }, { "value": 1, "name": "mini" }] as ItemType[],
        size_enum_current: 0,
        type_enum: [{ "value": 0, "name": "default" }, { "value": 1, "name": "primary" }, { "value": 2, "name": "warn" }] as ItemType[],
        type_enum_current: 0,
        count: 0,
        text: 'uni-app-x'
      }
    },
    methods: {
      button_click() {
        console.log("组件被点击时触发")
        this.count++
      },
      button_touchstart() { console.log("手指触摸动作开始") },
      button_touchmove() { console.log("手指触摸后移动") },
      button_touchcancel() { console.log("手指触摸动作被打断，如来电提醒，弹窗") },
      button_touchend() { console.log("手指触摸动作结束") },
      button_tap() { console.log("手指触摸后马上离开") },
      button_longpress() { console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。") },
      change_plain_boolean(checked : boolean) { this.plain_boolean = checked },
      change_disabled_boolean(checked : boolean) { this.disabled_boolean = checked },
      change_default_style(checked : boolean) { this.default_style = checked },
      radio_change_size_enum(checked : number) { this.size_enum_current = checked },
      radio_change_type_enum(checked : number) { this.type_enum_current = checked },
      confirm_text_input(value : string) { this.text = value }
    }
  })

export default __sfc__
function GenPagesComponentButtonButtonstatusRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("scroll-view", utsMapOf({
    direction: "vertical",
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "main" }), [
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[_ctx.size_enum_current].name,
          type: _ctx.type_enum[0].name,
          plain: _ctx.plain_boolean,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " type-default ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[_ctx.size_enum_current].name,
          type: _ctx.type_enum[1].name,
          plain: _ctx.plain_boolean,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " type-primary ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[_ctx.size_enum_current].name,
          type: _ctx.type_enum[2].name,
          plain: _ctx.plain_boolean,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " type-warn ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[0].name,
          type: _ctx.type_enum[_ctx.type_enum_current].name,
          plain: _ctx.plain_boolean,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " size-default ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[1].name,
          type: _ctx.type_enum[_ctx.type_enum_current].name,
          plain: _ctx.plain_boolean,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " size-mini ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[_ctx.size_enum_current].name,
          type: _ctx.type_enum[_ctx.type_enum_current].name,
          plain: true,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " plain-true ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ]),
      createElementVNode("view", utsMapOf({ class: "container" }), [
        createElementVNode("button", utsMapOf({
          style: normalizeStyle(utsMapOf({"margin":"10px"})),
          disabled: _ctx.disabled_boolean,
          size: _ctx.size_enum[_ctx.size_enum_current].name,
          type: _ctx.type_enum[_ctx.type_enum_current].name,
          plain: false,
          onClick: [_ctx.button_click, _ctx.button_tap],
          onTouchstart: _ctx.button_touchstart,
          onTouchmove: _ctx.button_touchmove,
          onTouchcancel: _ctx.button_touchcancel,
          onTouchend: _ctx.button_touchend,
          onLongpress: _ctx.button_longpress,
          class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
          "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
        }), " plain-false ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["disabled", "size", "type", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
      ])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px","position":"relative","text-align":"left","padding":"5px","color":"#ffffff","background-color":"#1AAD19","font-size":"10px","line-height":"2"})),
        disabled: _ctx.disabled_boolean
      }), " custom-btn ", 12 /* STYLE, PROPS */, ["disabled"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px","font-size":"15px","color":"red"})),
        type: "warn",
        plain: "true",
        disabled: _ctx.disabled_boolean
      }), " custom-btn-plain-warn ", 12 /* STYLE, PROPS */, ["disabled"])
    ]),
    createElementVNode("view", utsMapOf({ class: "content" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px"})),
        type: "primary",
        size: "default",
        disabled: _ctx.disabled_boolean,
        "hover-class": "none"
      }), "hover-class none", 12 /* STYLE, PROPS */, ["disabled"])
    ]),
    createElementVNode("view", utsMapOf({ class: "content" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px"})),
        type: "primary",
        size: "default",
        disabled: _ctx.disabled_boolean
      }), "uni-app x", 12 /* STYLE, PROPS */, ["disabled"]),
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px"})),
        type: "primary",
        onClick: () => {_ctx.change_disabled_boolean(!_ctx.disabled_boolean)}
      }), "修改disabled为" + toDisplayString(!_ctx.disabled_boolean), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px"})),
        disabled: false,
        size: _ctx.size_enum[_ctx.size_enum_current].name,
        type: _ctx.type_enum[_ctx.type_enum_current].name,
        plain: _ctx.plain_boolean,
        onClick: [_ctx.button_click, _ctx.button_tap],
        onTouchstart: _ctx.button_touchstart,
        onTouchmove: _ctx.button_touchmove,
        onTouchcancel: _ctx.button_touchcancel,
        onTouchend: _ctx.button_touchend,
        onLongpress: _ctx.button_longpress,
        class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
        "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
      }), " disable-false ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
    ]),
    createElementVNode("view", utsMapOf({ class: "container" }), [
      createElementVNode("button", utsMapOf({
        style: normalizeStyle(utsMapOf({"margin":"10px"})),
        disabled: true,
        size: _ctx.size_enum[_ctx.size_enum_current].name,
        type: _ctx.type_enum[_ctx.type_enum_current].name,
        plain: _ctx.plain_boolean,
        onClick: [_ctx.button_click, _ctx.button_tap],
        onTouchstart: _ctx.button_touchstart,
        onTouchmove: _ctx.button_touchmove,
        onTouchcancel: _ctx.button_touchcancel,
        onTouchend: _ctx.button_touchend,
        onLongpress: _ctx.button_longpress,
        class: normalizeClass(["btn", _ctx.default_style ? 'custom-btn' : '']),
        "hover-class": _ctx.default_style ? 'is-hover' : 'button-hover'
      }), " disable-true ", 46 /* CLASS, STYLE, PROPS, NEED_HYDRATION */, ["size", "type", "plain", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress", "hover-class"])
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentButtonButtonstatusStyles = [utsMapOf([["main", padStyleMapOf(utsMapOf([["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "rgba(0,0,0,0.06)"], ["flexDirection", "column"], ["justifyContent", "center"]]))], ["list-item", utsMapOf([[".main ", utsMapOf([["width", "100%"], ["height", 100], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#666666"]])]])], ["custom-btn", padStyleMapOf(utsMapOf([["color", "#ffffff"], ["backgroundColor", "#1AAD19"], ["borderColor", "#1AAD19"], ["borderRadius", 5], ["borderWidth", 0.5], ["height", 53]]))], ["is-hover", padStyleMapOf(utsMapOf([["color", "rgba(255,255,255,0.6)"], ["backgroundColor", "#179b16"], ["borderColor", "#179b16"]]))], ["container", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 60]]))], ["button-hover", padStyleMapOf(utsMapOf([["color", "rgba(0,0,0,0.6)"], ["backgroundColor", "#dedede"]]))]])]
