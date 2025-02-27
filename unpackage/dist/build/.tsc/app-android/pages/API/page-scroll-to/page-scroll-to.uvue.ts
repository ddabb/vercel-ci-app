
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'pageScrollTo',
      }
    },
    methods: {
      scrollTo() {
        uni.pageScrollTo({
          scrollTop: 100,
          duration: 300,
          success: () => {
            console.log('success')
          },
        })
      },
      scrollToElement() {
        uni.pageScrollTo({
          selector: '.custom-element',
          duration: 300,
          success: () => {
            console.log('success')
          },
        })
      },
    },
  })

export default __sfc__
function GenPagesAPIPageScrollToPageScrollToRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"})),
    "scroll-with-animation": "true"
  }), [
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("button", utsMapOf({
        type: "default",
        class: "btn-scrollTo",
        onClick: _ctx.scrollTo
      }), " scrollTo ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        type: "default",
        class: "btn-scrollToElement",
        onClick: _ctx.scrollToElement
      }), " scrollToElement ", 8 /* PROPS */, ["onClick"]),
      createElementVNode(Fragment, null, RenderHelpers.renderList(10, (_, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          class: "uni-list",
          key: index
        }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell list-item" }), toDisplayString(index), 1 /* TEXT */)
        ])
      }), 64 /* STABLE_FRAGMENT */),
      createElementVNode("view", utsMapOf({ class: "custom-element" }), "scrollTo-custom-element"),
      createElementVNode(Fragment, null, RenderHelpers.renderList(10, (_, index2, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          class: "uni-list",
          key: index2
        }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell list-item" }), toDisplayString(index2), 1 /* TEXT */)
        ])
      }), 64 /* STABLE_FRAGMENT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIPageScrollToPageScrollToStyles = [utsMapOf([["list-item", padStyleMapOf(utsMapOf([["height", 100], ["paddingLeft", 30]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
