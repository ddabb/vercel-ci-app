
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'installApk'
      }
    },
    onUnload: function () {
    },
    methods: {
      installApk: function () {
        uni.installApk({
          filePath: "/static/test-apk/test.apk",
          complete(res : any) {
            console.log(res);
          }
        })
      },
    }
  })

export default __sfc__
function GenPagesAPIInstallApkInstallApkRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: _ctx.installApk
            }), " installApk ", 8 /* PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIInstallApkInstallApkStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
