
  type ItemType = {
    value : string
    name : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        items: [
          {
            value: 'CHN',
            name: '中国',
          },
          {
            value: 'USA',
            name: '美国',
          },

          {
            value: 'BRA',
            name: '巴西',
          },
          {
            value: 'JPN',
            name: '日本',
          },
          {
            value: 'ENG',
            name: '英国',
          },
          {
            value: 'FRA',
            name: '法国',
          },
        ] as ItemType[],
        current: 0,
        eventTest: false,

        value: '',
        text: '未选中',
        wrapText: 'uni-app x，终极跨平台方案\nuts，大一统语言',
        disabled: true,
        checked: true,
        color: '#007aff',
        // 组件属性 autotest
        checked_boolean: false,
        disabled_boolean: false,
        color_input: "#007AFF",
        backgroundColor_input: "#ffffff",
        borderColor_input: "#d1d1d1",
        activeBackgroundColor_input: "#007AFF",
        activeBorderColor_input: "",
        iconColor_input: "#ffffff"
      }
    },

    methods: {
      radioChange(e : UniRadioGroupChangeEvent) {

        // 自动化测试
        console.log('test: radio event detail', e.target?.tagName, e.type)
        if ((e.target?.tagName ?? '') == 'RADIO-GROUP' && e.type == 'change') {
          this.eventTest = true
        }

        const selected = this.items.find((item) : boolean => {
          return item.value == e.detail.value
        })
        uni.showToast({
          icon: 'none',
          title: '当前选中:' + selected?.name,
        })
      },
      testChange(e : UniRadioGroupChangeEvent) {

        this.value = e.detail.value
      },
      radio_click() { console.log("组件被点击时触发") },
      radio_touchstart() { console.log("手指触摸动作开始") },
      radio_touchmove() { console.log("手指触摸后移动") },
      radio_touchcancel() { console.log("手指触摸动作被打断，如来电提醒，弹窗") },
      radio_touchend() { console.log("手指触摸动作结束") },
      radio_tap() { console.log("手指触摸后马上离开") },
      radio_longpress() { console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。") },
      change_checked_boolean(checked : boolean) { this.checked_boolean = checked },
      change_disabled_boolean(checked : boolean) { this.disabled_boolean = checked },
      confirm_color_input(value : string) { this.color_input = value },
      confirm_backgroundColor_input(value : string) { this.backgroundColor_input = value },
      confirm_borderColor_input(value : string) { this.borderColor_input = value },
      confirm_activeBackgroundColor_input(value : string) { this.activeBackgroundColor_input = value },
      confirm_activeBorderColor_input(value : string) { this.activeBorderColor_input = value },
      confirm_iconColor_input(value : string) { this.iconColor_input = value }
    }
  })

export default __sfc__
function GenPagesComponentRadioRadioRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio", true)
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)
const _component_input_data = resolveEasyComponent("input-data",_easycom_input_data)
const _component_radio_group = resolveComponent("radio-group")

  return createElementVNode(Fragment, null, [
    createElementVNode("view", utsMapOf({ class: "main" }), [
      createVNode(_component_radio, utsMapOf({
        disabled: _ctx.disabled_boolean,
        checked: _ctx.checked_boolean,
        color: _ctx.color_input,
        backgroundColor: _ctx.backgroundColor_input,
        borderColor: _ctx.borderColor_input,
        activeBackgroundColor: _ctx.activeBackgroundColor_input,
        activeBorderColor: _ctx.activeBorderColor_input,
        iconColor: _ctx.iconColor_input,
        onClick: [_ctx.radio_click, _ctx.radio_tap],
        onTouchstart: _ctx.radio_touchstart,
        onTouchmove: _ctx.radio_touchmove,
        onTouchcancel: _ctx.radio_touchcancel,
        onTouchend: _ctx.radio_touchend,
        onLongpress: _ctx.radio_longpress
      }), utsMapOf({
        default: withSlotCtx((): any[] => [
          createElementVNode("text", null, "uni-app-x")
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["disabled", "checked", "color", "backgroundColor", "borderColor", "activeBackgroundColor", "activeBorderColor", "iconColor", "onClick", "onTouchstart", "onTouchmove", "onTouchcancel", "onTouchend", "onLongpress"])
    ]),
    createElementVNode("scroll-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"}))
    }), [
      createElementVNode("view", utsMapOf({ class: "content" }), [
        createVNode(_component_page_head, utsMapOf({ title: "组件属性" })),
        createVNode(_component_boolean_data, utsMapOf({
          defaultValue: false,
          title: "<radio/> 当前是否选中",
          onChange: _ctx.change_checked_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        createVNode(_component_boolean_data, utsMapOf({
          defaultValue: false,
          title: "是否禁用",
          onChange: _ctx.change_disabled_boolean
        }), null, 8 /* PROPS */, ["onChange"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "#007AFF",
          title: "radio的颜色",
          type: "text",
          onConfirm: _ctx.confirm_color_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "#ffffff",
          title: "radio默认的背景颜色",
          type: "text",
          onConfirm: _ctx.confirm_backgroundColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "#d1d1d1",
          title: "radio默认的边框颜色",
          type: "text",
          onConfirm: _ctx.confirm_borderColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "#007AFF",
          title: "radio选中时的背景颜色，优先级大于color属性",
          type: "text",
          onConfirm: _ctx.confirm_activeBackgroundColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "",
          title: "radio选中时的边框颜色",
          type: "text",
          onConfirm: _ctx.confirm_activeBorderColor_input
        }), null, 8 /* PROPS */, ["onConfirm"]),
        createVNode(_component_input_data, utsMapOf({
          defaultValue: "#ffffff",
          title: "radio的图标颜色",
          type: "text",
          onConfirm: _ctx.confirm_iconColor_input
        }), null, 8 /* PROPS */, ["onConfirm"])
      ]),
      createElementVNode("view", null, [
        createVNode(_component_page_head, utsMapOf({ title: "默认及使用" })),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
            createElementVNode("text", utsMapOf({ class: "uni-title-text" }), " 默认样式 ")
          ]),
          createVNode(_component_radio_group, utsMapOf({
            class: "uni-flex uni-row radio-group",
            onChange: _ctx.testChange,
            style: normalizeStyle(utsMapOf({"flex-wrap":"wrap"}))
          }), utsMapOf({
            default: withSlotCtx((): any[] => [
              createVNode(_component_radio, utsMapOf({
                id: "trigger-change",
                value: "r",
                checked: _ctx.checked,
                color: _ctx.color,
                style: normalizeStyle(utsMapOf({"margin-right":"15px"})),
                class: "radio r"
              }), utsMapOf({
                default: withSlotCtx((): any[] => ["选中 "]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["checked", "color", "style"]),
              createVNode(_component_radio, utsMapOf({
                value: "r1",
                style: normalizeStyle(utsMapOf({"margin-right":"15px"})),
                class: "radio r1"
              }), utsMapOf({
                default: withSlotCtx((): any[] => [toDisplayString(_ctx.text)]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"]),
              createVNode(_component_radio, utsMapOf({
                value: "r2",
                disabled: _ctx.disabled,
                class: "radio r2"
              }), utsMapOf({
                default: withSlotCtx((): any[] => ["禁用"]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["disabled"]),
              createVNode(_component_radio, utsMapOf({
                value: "r3",
                class: "radio r3",
                style: normalizeStyle(utsMapOf({"margin-top":"10px"}))
              }), utsMapOf({
                default: withSlotCtx((): any[] => [toDisplayString(_ctx.wrapText)]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"])
            ]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["onChange", "style"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
            createElementVNode("text", utsMapOf({ class: "uni-title-text" }), " 不同颜色和尺寸的radio ")
          ]),
          createVNode(_component_radio_group, utsMapOf({ class: "uni-flex uni-row radio-group" }), utsMapOf({
            default: withSlotCtx((): any[] => [
              createVNode(_component_radio, utsMapOf({
                value: "r1",
                checked: true,
                color: "#FFCC33",
                style: normalizeStyle(utsMapOf({"transform":"scale(0.7)","margin-right":"15px"})),
                class: "radio"
              }), utsMapOf({
                default: withSlotCtx((): any[] => ["选中 "]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"]),
              createVNode(_component_radio, utsMapOf({
                value: "r2",
                color: "#FFCC33",
                style: normalizeStyle(utsMapOf({"transform":"scale(0.7)"})),
                class: "radio"
              }), utsMapOf({
                default: withSlotCtx((): any[] => ["未选中"]),
                _: 1 /* STABLE */
              }), 8 /* PROPS */, ["style"])
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
            createElementVNode("text", utsMapOf({ class: "uni-title-text" }), " 两端对齐样式测试 ")
          ]),
          createVNode(_component_radio_group, utsMapOf({ class: "uni-flex uni-row radio-group" }), utsMapOf({
            default: withSlotCtx((): any[] => [
              createVNode(_component_radio, utsMapOf({ class: "justify-test" }), utsMapOf({
                default: withSlotCtx((): any[] => ["justify-content样式测试"]),
                _: 1 /* STABLE */
              }))
            ]),
            _: 1 /* STABLE */
          }))
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-title uni-common-mt" }), [
            createElementVNode("text", utsMapOf({ class: "uni-title-text" }), " 推荐展示样式 ")
          ])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list uni-common-pl" }), [
          createVNode(_component_radio_group, utsMapOf({
            onChange: _ctx.radioChange,
            class: "radio-group"
          }), utsMapOf({
            default: withSlotCtx((): any[] => [
              createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
                return createVNode(_component_radio, utsMapOf({
                  class: normalizeClass(["uni-list-cell uni-list-cell-pd radio recommand", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
                  key: item.value,
                  value: item.value,
                  checked: index === _ctx.current
                }), utsMapOf({
                  default: withSlotCtx((): any[] => [toDisplayString(item.name)]),
                  _: 2 /* DYNAMIC */
                }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
              }), 128 /* KEYED_FRAGMENT */)
            ]),
            _: 1 /* STABLE */
          }), 8 /* PROPS */, ["onChange"])
        ])
      ])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesComponentRadioRadioStyles = [utsMapOf([["main", padStyleMapOf(utsMapOf([["maxHeight", 250], ["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["borderBottomWidth", 1], ["borderBottomStyle", "solid"], ["borderBottomColor", "rgba(0,0,0,0.06)"], ["flexDirection", "row"], ["justifyContent", "center"]]))], ["uni-list-cell", padStyleMapOf(utsMapOf([["justifyContent", "flex-start"]]))], ["justify-test", padStyleMapOf(utsMapOf([["width", "100%"], ["justifyContent", "space-between"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
import _easycom_input_data from '@/components/input-data/input-data.vue'
