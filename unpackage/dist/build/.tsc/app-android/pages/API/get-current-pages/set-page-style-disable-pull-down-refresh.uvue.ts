
  class Page {
    constructor(public route : string) {
    }
  }

  const __sfc__ = defineComponent({
    data() {
      return {
        checked: false,
        pages: [] as Page[],
        currentPageStyle: {} as UTSJSONObject,
        // TODO
        enablePullDownRefreshStatus: true
      }
    },
    computed: {
      pageStyleText() : string {
        return JSON.stringify(this.currentPageStyle)
      }
    },
    onLoad() {
      const pages = getCurrentPages();
      const currentPage = pages[pages.length - 1];
      this.currentPageStyle = currentPage.getPageStyle();
      this.enablePullDownRefreshStatus = this.currentPageStyle["enablePullDownRefresh"] as boolean
    },
    onPullDownRefresh() {
      setTimeout(() => {
        uni.stopPullDownRefresh()
      }, 3000)
    },
    methods: {
      getPageStyle() {
        const pages = getCurrentPages();
        const currentPage = pages[pages.length - 1];
        this.currentPageStyle = currentPage.getPageStyle();
      },
      setPageStyle(enable : boolean) {
        // 目前仅支持 enablePullDownRefresh
        const pages = getCurrentPages();
        const currentPage = pages[pages.length - 1];
        currentPage.setPageStyle({
          enablePullDownRefresh: enable
        });
        this.enablePullDownRefreshStatus = enable
      },
      startPullDownRefresh() {
        uni.startPullDownRefresh()
      }
    },
  })

export default __sfc__
function GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "getCurrentPages" })),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("button", utsMapOf({
        class: "btn btn-get-page-style",
        type: "default",
        onClick: _ctx.getPageStyle
      }), "getPageStyle", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "btn btn-set-page-style-1",
        type: "default",
        onClick: () => {_ctx.setPageStyle(true)}
      }), "setPageStyle(true)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "btn btn-set-page-style-0",
        type: "default",
        onClick: () => {_ctx.setPageStyle(false)}
      }), "setPageStyle(false)", 8 /* PROPS */, ["onClick"]),
      createElementVNode("text", utsMapOf({ class: "page-style" }), "当前 PageStyle"),
      createElementVNode("text", utsMapOf({ class: "page-style-value" }), toDisplayString(_ctx.pageStyleText), 1 /* TEXT */),
      createElementVNode("text", utsMapOf({ class: "status" }), "状态："),
      createElementVNode("view", utsMapOf({ class: "status-list" }), [
        createElementVNode("text", null, "enablePullDownRefresh: " + toDisplayString(_ctx.enablePullDownRefreshStatus), 1 /* TEXT */)
      ]),
      createElementVNode("text", utsMapOf({ class: "tips" }), "当前版本仅支持设置属性 enablePullDownRefresh")
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshStyles = [utsMapOf([["btn", padStyleMapOf(utsMapOf([["marginTop", 10]]))], ["page-style", padStyleMapOf(utsMapOf([["marginTop", 15]]))], ["page-style-value", padStyleMapOf(utsMapOf([["marginTop", 5], ["paddingTop", 5], ["paddingRight", 5], ["paddingBottom", 5], ["paddingLeft", 5], ["backgroundColor", "#ffffff"], ["width", "100%"]]))], ["status", padStyleMapOf(utsMapOf([["marginTop", 20]]))], ["status-list", padStyleMapOf(utsMapOf([["marginTop", 5]]))], ["tips", padStyleMapOf(utsMapOf([["fontSize", 12], ["marginTop", 15], ["opacity", 0.8]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
