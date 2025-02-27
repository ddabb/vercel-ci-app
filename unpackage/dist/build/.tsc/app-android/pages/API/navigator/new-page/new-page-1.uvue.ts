
  import { state } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        data: '',
      }
    },
    onLoad(options : OnLoadOptions) {
      if (options['data'] != null) {
        this.data = options['data']!
      }
    },
    methods: {
      // 自动化测试
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
      navigateBackWithDelta2() {
        uni.navigateBack({
          delta: 2,
          success() {
            console.log('回退上上层页面成功')
          },
          fail(error) {
            console.warn(`回退上上层页面失败: ${error.errMsg}`)
          },
        })
      },
      navigateToOnLoadWithType(type : string) {
        uni.navigateTo({
          url: `/pages/API/navigator/new-page/onLoad?type=${type}`,
        })
      }
    },
  })

export default __sfc__
function GenPagesAPINavigatorNewPageNewPage1Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "new-page-1" })),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("text", null, "onLoad 接收到参数"),
      createElementVNode("text", null, "data: " + toDisplayString(_ctx.data), 1 /* TEXT */),
      createElementVNode("button", utsMapOf({
        onClick: _ctx.navigateBackWithDelta2,
        class: "uni-btn"
      }), " 回退到上上层页面 ", 8 /* PROPS */, ["onClick"])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPINavigatorNewPageNewPage1Styles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
