
  type ItemType = {
    value : string,
    name : string,
  }
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'modal',
        showCancelSelect: false,
        cancelTextSelect: false,
        confirmTextSelect: false,
        editableSelect: false,
        placeholderTextSelect: false,
        exeRet: "",
        items: [{
          value: '标题',
          name: '有标题'
        },
        {
          value: '',
          name: '无标题'
        },
        {
          value: '超长标题测试内容，测试超过显示最大范围之后的样式-超长标题测试内容，测试超过显示最大范围之后的样式',
          name: '超长标题'
        }
        ] as ItemType[],
        current: 0
      }
    },
    onLoad() {
      uni.showModal({
        title: "onLoad 调用示例,请手动取消",
        showCancel: false
      })
    },
    methods: {
      //自动化测试例专用
      jest_getWindowInfo() : GetWindowInfoResult {
        return uni.getWindowInfo();
      },
      showCancelChange: function (e : UniSwitchChangeEvent) {
        this.showCancelSelect = e.detail.value
      },
      cancelTextChange: function (e : UniSwitchChangeEvent) {
        this.cancelTextSelect = e.detail.value
      },
      confirmTextChange: function (e : UniSwitchChangeEvent) {
        this.confirmTextSelect = e.detail.value
      },
      editableChange: function (e : UniSwitchChangeEvent) {
        this.editableSelect = e.detail.value
      },
      placeholderTextChange: function (e : UniSwitchChangeEvent) {
        this.placeholderTextSelect = e.detail.value
      },
      radioChange(e : UniRadioGroupChangeEvent) {
        for (let i = 0; i < this.items.length; i++) {
          if (this.items[i].value === e.detail.value) {
            this.current = i;
            break;
          }
        }
      },
      modalTap: function () {
        let cancelTextVal : string
        let cancelColorVal = ''
        if (this.cancelTextSelect) {
          cancelTextVal = "修改后的取消文本"
          cancelColorVal = "#ff00ff"
        } else {
          cancelTextVal = "取消"
        }

        let confirmTextVal = '确定'
        let confirmColorVal = ''
        if (this.confirmTextSelect) {
          confirmTextVal = "修改后的确定文本"
          confirmColorVal = "#00ffff"
        }

        let placeholderTextVal = ''
        let contentVal = "弹窗内容，告知当前状态、信息和解决方法，描述文字尽量控制在三行内"
        if (this.placeholderTextSelect) {
          placeholderTextVal = "定制提示信息"
          contentVal = ""
        }
        uni.showModal({
          title: this.items[this.current].value,
          editable: this.editableSelect,
          placeholderText: placeholderTextVal,
          content: contentVal,
          showCancel: this.showCancelSelect,
          cancelText: cancelTextVal,
          cancelColor: cancelColorVal,
          confirmText: confirmTextVal,
          confirmColor: confirmColorVal,
          success: (res) => {
            this.exeRet = JSON.stringify(res)
          },
          fail: (res) => {
            this.exeRet = JSON.stringify(res)
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIShowModalShowModalRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_switch = resolveComponent("switch")

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-list" }), [
        createVNode(_component_radio_group, utsMapOf({ onChange: _ctx.radioChange }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, (item, index, __index, _cached): any => {
              return createVNode(_component_radio, utsMapOf({
                class: normalizeClass(["uni-list-cell uni-list-cell-pd", index < _ctx.items.length - 1 ? 'uni-list-cell-line' : '']),
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
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-list" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-pd" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示取消按钮"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.showCancelSelect,
            onChange: _ctx.showCancelChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-pd" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "定制取消文案"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.cancelTextSelect,
            onChange: _ctx.cancelTextChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-pd" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "定制确认文案"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.confirmTextSelect,
            onChange: _ctx.confirmTextChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-pd" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否显示输入框"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.editableSelect,
            onChange: _ctx.editableChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-pd" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), "是否定制输入提示词"),
          createVNode(_component_switch, utsMapOf({
            checked: _ctx.placeholderTextSelect,
            onChange: _ctx.placeholderTextChange
          }), null, 8 /* PROPS */, ["checked", "onChange"])
        ])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
          createElementVNode("button", utsMapOf({
            class: "uni-btn-v",
            type: "default",
            onClick: _ctx.modalTap,
            id: "btn-modal-show"
          }), " modal测试 ", 8 /* PROPS */, ["onClick"])
        ]),
        createElementVNode("text", null, toDisplayString(_ctx.exeRet), 1 /* TEXT */)
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIShowModalShowModalStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
