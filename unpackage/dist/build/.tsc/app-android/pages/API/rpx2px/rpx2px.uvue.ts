
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'rpx2px',
        rpxValue: 750,
        pxValue: 0,
        result: false
      }
    },
    methods: {
      rpx2px: function () {
        this.pxValue = uni.rpx2px(this.rpxValue);

        // 仅限自动化测试
        const windowInfo = uni.getWindowInfo();
        if (windowInfo.windowWidth == this.pxValue) {
          this.result = true
        }
      }
    }
  })

export default __sfc__
function GenPagesAPIRpx2pxRpx2pxRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", utsMapOf({ class: "page" }), [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", null, [
        createElementVNode("view", utsMapOf({ class: "item" }), [
          createElementVNode("text", utsMapOf({ class: "item-k" }), "输入:"),
          createElementVNode("text", utsMapOf({ class: "item-v" }), toDisplayString(_ctx.rpxValue) + "rpx", 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "item" }), [
          createElementVNode("text", utsMapOf({ class: "item-k" }), "返回:"),
          createElementVNode("text", utsMapOf({ class: "item-v" }), toDisplayString(_ctx.pxValue) + "px", 1 /* TEXT */)
        ])
      ]),
      createElementVNode("view", null, [
        createElementVNode("button", utsMapOf({
          class: "convert",
          type: "primary",
          onClick: _ctx.rpx2px
        }), "转换", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ])
}
const GenPagesAPIRpx2pxRpx2pxStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["item", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["item-k", padStyleMapOf(utsMapOf([["width", 72], ["lineHeight", 2]]))], ["item-v", padStyleMapOf(utsMapOf([["fontWeight", "bold"], ["lineHeight", 2]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
