
  type IconItemType = {
    value : "success" | "error" | "fail" | "exception" | "loading" | "none";
    name : string
  }
  type PositionItemType = {
    value : "top" | "center" | "bottom";
    name : string
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'toast',
        exeRet: '',
        imageSelect: false,
        maskSelect: false,
        intervalSelect: 1500,
        position_current: 0,
        position_enum: [
          { "value": "top", "name": "top: 居上显示（Android 暂不支持）" },
          { "value": "center", "name": "center: 居中显示（Android 暂不支持）" },
          { "value": "bottom", "name": "bottom: 居底显示" },
        ] as PositionItemType[],
        icon_current: 0,
        icon_enum: [
          {
            value: 'success',
            name: '显示成功图标',
          },
          {
            value: 'error',
            name: '显示错误图标',
          },
          // {
          //   value: 'fail',
          //   name: '显示错误图标',
          // },
          // {
          //   value: 'exception',
          //   name: '显示异常图标，此时title文本无长度显示',
          // },
          {
            value: 'loading',
            name: '显示加载图标',
          },
          {
            value: 'none',
            name: '不显示图标',
          },
        ] as IconItemType[],
      }
    },
    onLoad() {
      uni.showToast({
        title: 'onLoad 调用示例,2秒后消失'
      })
      setTimeout(function () {
        uni.hideToast()
      }, 2000);
    },
    methods: {
      //自动化测试例专用
      jest_getWindowInfo() : GetWindowInfoResult {
        return uni.getWindowInfo();
      },
      radioChangeIcon(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.icon_enum.length; i++) {
          if (this.icon_enum[i].value === e.detail.value) {
            this.icon_current = i;
            break;
          }
        }
      },
      change_image_boolean: function (e : UniSwitchChangeEvent) {
        this.imageSelect = e.detail.value
      },
      change_mask_boolean: function (e : UniSwitchChangeEvent) {
        this.maskSelect = e.detail.value
      },
      sliderChange(e : UniSliderChangeEvent) {
        this.intervalSelect = e.detail.value
      },
      radioChangePosition(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.position_enum.length; i++) {
          if (this.position_enum[i].value === e.detail.value) {
            this.position_current = i;
            break;
          }
        }
      },
      toast1Tap: function () {
        uni.showToast({
          title: "默认",
          icon: this.icon_enum[this.icon_current].value,
          duration: this.intervalSelect,
          image: this.imageSelect ? "/static/uni.png" : null,
          mask: this.maskSelect,
          success: (res) => {
            // console.log('success:',res)
            this.exeRet = "success:" + JSON.stringify(res)
          },
          fail: (res) => {
            this.exeRet = "fail:" + JSON.stringify(res)
          },
        })
      },
      toast3Tap: function () {
        uni.showToast({
          title: "默认",
          icon: 'none',
          duration: this.intervalSelect,
          image: this.imageSelect ? "/static/uni.png" : null,
          mask: this.maskSelect,
          success: (res) => {
            // console.log('success:',res)
            this.exeRet = "success:" + JSON.stringify(res)
          },
          fail: (res) => {
            this.exeRet = "fail:" + JSON.stringify(res)
          },
        })
      },

      toast2Tap: function () {
        let positionValue = this.position_enum[this.position_current].value
        uni.showToast({
          title: "显示一段轻提示,position:" + positionValue,
          position: positionValue,
          success: (res) => {
            this.exeRet = "success:" + JSON.stringify(res)
          },
          fail: (res) => {
            this.exeRet = "fail:" + JSON.stringify(res)
          },
        })
      },

      hideToast: function () {
        uni.hideToast()
      }
    }
  })

export default __sfc__
function GenPagesAPIShowToastShowToastRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_switch = resolveComponent("switch")
const _component_slider = resolveComponent("slider")

  return createElementVNode("scroll-view", utsMapOf({
    direction: "vertical",
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text uni-common-mb" }), "设置icon")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list uni-common-pl" }), [
        createVNode(_component_radio_group, utsMapOf({ onChange: _ctx.radioChangeIcon }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.icon_enum, (icon, index, __index, _cached): any => {
              return createVNode(_component_radio, utsMapOf({
                class: normalizeClass(["uni-list-cell uni-list-cell-pd radio-icon", index < _ctx.icon_enum.length - 1 ? 'uni-list-cell-line' : '']),
                key: icon.value,
                value: icon.value,
                checked: index === _ctx.icon_current
              }), utsMapOf({
                default: withSlotCtx((): any[] => [toDisplayString(icon.name)]),
                _: 2 /* DYNAMIC */
              }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示自定义图标"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.imageSelect,
          onChange: _ctx.change_image_boolean
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-padding" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示透明蒙层-屏蔽点击事件"),
        createVNode(_component_switch, utsMapOf({
          checked: _ctx.maskSelect,
          onChange: _ctx.change_mask_boolean
        }), null, 8 /* PROPS */, ["checked", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-title uni-list-cell-padding" }), "提示的延迟时间，默认：1500（单位毫秒）"),
      createElementVNode("view", utsMapOf({ class: "uni-list-cell-padding" }), [
        createVNode(_component_slider, utsMapOf({
          onChange: _ctx.sliderChange,
          foreColor: "#007AFF",
          value: _ctx.intervalSelect,
          min: 1500,
          max: 5000,
          "show-value": true
        }), null, 8 /* PROPS */, ["onChange", "value"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "default",
          onClick: _ctx.toast1Tap,
          id: "btn-toast-default"
        }), "点击弹出toast", 8 /* PROPS */, ["onClick"]),
        createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "default",
          onClick: _ctx.hideToast,
          id: "btn-toast-hide"
        }), "点击隐藏toast", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text uni-common-mb" }), " 设置position，仅App生效 ")
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list uni-common-pl" }), [
        createVNode(_component_radio_group, utsMapOf({ onChange: _ctx.radioChangePosition }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.position_enum, (position, index, __index, _cached): any => {
              return createVNode(_component_radio, utsMapOf({
                class: normalizeClass(["uni-list-cell uni-list-cell-pd radio-position", index < _ctx.position_enum.length - 1 ? 'uni-list-cell-line' : '']),
                key: position.value,
                value: position.value,
                checked: index === _ctx.position_current
              }), utsMapOf({
                default: withSlotCtx((): any[] => [toDisplayString(position.name)]),
                _: 2 /* DYNAMIC */
              }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["class", "value", "checked"])
            }), 128 /* KEYED_FRAGMENT */)
          ]),
          _: 1 /* STABLE */
        }), 8 /* PROPS */, ["onChange"])
      ]),
      createElementVNode("button", utsMapOf({
        class: "uni-btn uni-btn-v uni-common-mb",
        type: "default",
        onClick: _ctx.toast2Tap
      }), "点击弹出设置position的toast", 8 /* PROPS */, ["onClick"]),
      createElementVNode("text", null, toDisplayString(_ctx.exeRet), 1 /* TEXT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIShowToastShowToastStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
