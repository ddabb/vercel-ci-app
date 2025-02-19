
  type DomRectType = {
    x : number,
    y : number,
    left : number,
    top : number,
    right : number,
    bottom : number,
    width : number,
    height : number,
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'getBoundingClientRectAsync',
        rectInfo: {
          x: 0,
          y: 0,
          width: 0,
          height: 0,
          left: 0,
          top: 0,
          right: 0,
          bottom: 0,
        } as DomRectType,
      }
    },
    methods: {
      getBoundingClientRectAsync() {
        (this.$refs["rect-test"] as UniElement).getBoundingClientRectAsync()!.then((rect : DOMRect) => {
          this.rectInfo = {
            x: rect.x,
            y: rect.y,
            width: rect.width,
            height: rect.height,
            left: rect.left,
            top: rect.top,
            right: rect.right,
            bottom: rect.bottom,
          } as DomRectType;;
        })
      }
    }
  })

export default __sfc__
function GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", utsMapOf({
      class: "page",
      id: "page"
    }), [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("button", utsMapOf({
        class: "btn btn-get-all-node-info",
        onClick: _ctx.getBoundingClientRectAsync
      }), "getBoundingClientRectAsync", 8 /* PROPS */, ["onClick"]),
      createElementVNode("view", utsMapOf({
        id: "rect-test",
        ref: "rect-test",
        class: "rect-test"
      }), null, 512 /* NEED_PATCH */),
      isTrue(_ctx.rectInfo)
        ? createElementVNode("view", utsMapOf({
            key: 0,
            class: "rect-info"
          }), [
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "x: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.x), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "y: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.y), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "width: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.width), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "height: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.height), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "left: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.left), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "top: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.top), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "right: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.right), 1 /* TEXT */)
            ]),
            createElementVNode("view", utsMapOf({ class: "node-info-item" }), [
              createElementVNode("text", utsMapOf({ class: "node-info-item-k" }), "bottom: "),
              createElementVNode("text", utsMapOf({ class: "node-info-item-v" }), toDisplayString(_ctx.rectInfo.bottom), 1 /* TEXT */)
            ])
          ])
        : createCommentVNode("v-if", true)
    ])
  ])
}
const GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["btn", padStyleMapOf(utsMapOf([["marginTop", 15]]))], ["rect-test", padStyleMapOf(utsMapOf([["marginTop", 15], ["height", 100], ["backgroundColor", "#1E90FF"]]))], ["rect-info", padStyleMapOf(utsMapOf([["marginTop", 15], ["flexDirection", "column"]]))], ["node-info-item", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["node-info-item-k", padStyleMapOf(utsMapOf([["width", 72], ["lineHeight", 2]]))], ["node-info-item-v", padStyleMapOf(utsMapOf([["fontWeight", "bold"], ["lineHeight", 2]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
