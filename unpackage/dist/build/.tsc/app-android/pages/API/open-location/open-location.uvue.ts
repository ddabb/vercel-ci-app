
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'openLocation',
        longitude: 116.39747,
        latitude: 39.9085,
        name: '天安门',
        address: '北京市东城区东长安街',
        // 自动化测试
        dialogPagesNum: -1,
      }
    },
    onShow() {
      console.log("Page Show");
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onHide() {
      console.log("Page Hide");
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 1)
    },
    methods: {
      openLocation: function () {
        uni.openLocation({
          longitude: this.longitude,
          latitude: this.latitude,
          name: this.name,
          address: this.address
        })
        // 自动化测试
        setTimeout(() => {
          this.test()
        }, 500)
      },
      // 自动化测试
      test() {
        const pages = getCurrentPages()
        const page = pages[pages.length - 1]

        const dialogPages = page.getDialogPages()
        this.dialogPagesNum = dialogPages.length

      },
      // 自动化测试
      setLifeCycleNum(value : number) {
        setLifeCycleNum(value)
      },
      // 自动化测试
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
    }
  })

export default __sfc__
function GenPagesAPIOpenLocationOpenLocationRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_form = resolveComponent("form")

  return createElementVNode("view", null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
      createVNode(_component_form, utsMapOf({ onSubmit: _ctx.openLocation }), utsMapOf({
        default: withSlotCtx((): any[] => [
          createElementVNode("view", utsMapOf({ class: "uni-list" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
                createElementVNode("view", utsMapOf({ class: "uni-label" }), "经度")
              ]),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
                createElementVNode("input", utsMapOf({
                  modelValue: _ctx.longitude,
                  onInput: ($event: InputEvent) => {(_ctx.longitude) = looseToNumber($event.detail.value)},
                  class: "uni-input",
                  type: "text",
                  disabled: true
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
                createElementVNode("view", utsMapOf({ class: "uni-label" }), "纬度")
              ]),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
                createElementVNode("input", utsMapOf({
                  modelValue: _ctx.latitude,
                  onInput: ($event: InputEvent) => {(_ctx.latitude) = looseToNumber($event.detail.value)},
                  class: "uni-input",
                  type: "text",
                  disabled: true
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
                createElementVNode("view", utsMapOf({ class: "uni-label" }), "位置名称")
              ]),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
                createElementVNode("input", utsMapOf({
                  modelValue: _ctx.name,
                  onInput: ($event: InputEvent) => {(_ctx.name) = $event.detail.value},
                  class: "uni-input",
                  type: "text",
                  disabled: true
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
              ])
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell" }), [
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
                createElementVNode("view", utsMapOf({ class: "uni-label" }), "详细位置")
              ]),
              createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
                createElementVNode("input", utsMapOf({
                  modelValue: _ctx.address,
                  onInput: ($event: InputEvent) => {(_ctx.address) = $event.detail.value},
                  class: "uni-input",
                  type: "text",
                  disabled: true
                }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
              ])
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
            createElementVNode("view", utsMapOf({ class: "tips" }), "注意：需要正确配置地图服务商的Key才能正常显示位置"),
            createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
              createElementVNode("button", utsMapOf({
                type: "primary",
                formType: "submit"
              }), "查看位置")
            ])
          ])
        ]),
        _: 1 /* STABLE */
      }), 8 /* PROPS */, ["onSubmit"])
    ])
  ])
}
const GenPagesAPIOpenLocationOpenLocationStyles = [utsMapOf([["uni-list-cell-left", padStyleMapOf(utsMapOf([["paddingTop", 0], ["paddingRight", "30rpx"], ["paddingBottom", 0], ["paddingLeft", "30rpx"]]))], ["tips", padStyleMapOf(utsMapOf([["fontSize", 12], ["marginTop", 15], ["opacity", 0.8]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
