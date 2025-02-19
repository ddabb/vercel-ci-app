
  import { state, setLifeCycleNum } from '@/store/index.uts'
  type AnimationType = "slide-in-right" | "slide-in-left" | "slide-in-top" | "slide-in-bottom" | "pop-in" | "fade-in" | "zoom-out" | "zoom-fade-out" | "none" | "auto"

  const __sfc__ = defineComponent({
    data() {
      return {
        onLoadTime: 0,
        onShowTime: 0,
        onReadyTime: 0,
        onHideTime: 0,
        animationTypeList: [
          'slide-in-right',
          'slide-in-left',
          'slide-in-top',
          'slide-in-bottom',
          'pop-in',
          'fade-in',
          'zoom-out',
          'zoom-fade-out',
          'none'
        ]
      }
    },
    onLoad() {
      this.onLoadTime = Date.now()
      console.log('onLoad', this.onLoadTime)
    },
    onShow() {
      this.onShowTime = Date.now()
      console.log('onShow', this.onShowTime)
    },
    onReady() {
      this.onReadyTime = Date.now()
      console.log('onReady', this.onReadyTime)
    },
    onHide() {
      this.onHideTime = Date.now()
      console.log('onHide', this.onHideTime)
    },
    onBackPress(options : OnBackPressOptions) : boolean | null {
      console.log('onBackPress', Date.now())
      console.log('onBackPress from', options.from)
      return null
    },
    onUnload() {
      console.log('onUnload', Date.now())
    },
    methods: {
      reLaunch() {
        uni.reLaunch({
          url: '/pages/tabBar/component',
          success(result) {
            console.log('reLaunch success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('reLaunch fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('reLaunch complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateTo() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToAnimationType(animationType : AnimationType) {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          animationType: animationType,
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToErrorPage() {
        uni.navigateTo({
          url: '/pages/error-page/error-page',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            uni.showToast({
              title: error.errMsg,
              icon: 'none',
            })
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateToDebounce() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=debounce',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=debounce',
          success(result) {
            console.log('navigateTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          fail(error) {
            console.log('navigateTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          complete(result) {
            console.log('navigateTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath1() {
        uni.navigateTo({
          url: 'new-page/new-page-1?data=new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath2() {
        uni.navigateTo({
          url: './new-page/new-page-1?data=./new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      navigateToRelativePath3() {
        uni.navigateTo({
          url: '../navigator/new-page/new-page-1?data=../navigator/new-page/new-page-1',
          success() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail() {
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete() {
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateBack() {
        uni.navigateBack({
          success(result) {
            console.log('navigateBack success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('navigateBack fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('navigateBack complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      navigateBackWithDelta1() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1',
          success() {
            uni.navigateBack({
              delta: 1,
              success(result) {
                console.log('navigateBack success', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
              fail(error) {
                console.log('navigateBack fail', error.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum - 1)
              },
              complete(result) {
                console.log('navigateBack complete', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
            })
          },
        })
      },
      navigateBackWithDelta100() {
        uni.navigateTo({
          url: '/pages/API/navigator/new-page/new-page-1',
          success() {
            uni.navigateBack({
              delta: 100,
              success(result) {
                console.log('navigateBack success', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
              fail(error) {
                console.log('navigateBack fail', error.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum - 1)
              },
              complete(result) {
                console.log('navigateBack complete', result.errMsg)
                // 自动化测试
                setLifeCycleNum(state.lifeCycleNum + 1)
              },
            })
          },
        })
      },
      redirectTo() {
        uni.redirectTo({
          url: '/pages/API/navigator/new-page/new-page-1?data=Hello',
          success(result) {
            console.log('redirectTo success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('redirectTo fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('redirectTo complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      switchTab() {
        uni.switchTab({
          url: '/pages/tabBar/template',
          success(result) {
            console.log('switchTab success', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(error) {
            console.log('switchTab fail', error.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 1)
          },
          complete(result) {
            console.log('switchTab complete', result.errMsg)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
        })
      },
      // 自动化测试
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
      // 自动化测试
      setLifeCycleNum(num : number) {
        setLifeCycleNum(num)
      },
    },
  })

export default __sfc__
function GenPagesAPINavigatorNavigatorRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: "navigate" })),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt uni-common-mb" }), [
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onLoad触发时间戳:"),
          createElementVNode("text", null, toDisplayString(_ctx.onLoadTime), 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onShow触发时间戳:"),
          createElementVNode("text", null, toDisplayString(_ctx.onShowTime), 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onReady触发时间戳:"),
          createElementVNode("text", null, toDisplayString(_ctx.onReadyTime), 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onHide触发时间戳:"),
          createElementVNode("text", null, toDisplayString(_ctx.onHideTime), 1 /* TEXT */)
        ]),
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onBackPress触发时间戳:"),
          createElementVNode("text", null, "见控制台")
        ]),
        createElementVNode("view", utsMapOf({ class: "direction-row" }), [
          createElementVNode("text", utsMapOf({ class: "label" }), "onUnload触发时间戳:"),
          createElementVNode("text", null, "见控制台")
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
          createElementVNode("button", utsMapOf({
            onClick: _ctx.navigateTo,
            class: "uni-btn"
          }), " 跳转新页面，并传递数据 ", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            onClick: _ctx.navigateBack,
            class: "uni-btn"
          }), "返回上一页", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            onClick: _ctx.redirectTo,
            class: "uni-btn"
          }), "在当前页面打开", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            onClick: _ctx.switchTab,
            class: "uni-btn"
          }), "切换到模板选项卡", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            onClick: _ctx.reLaunch,
            class: "uni-btn"
          }), " 关闭所有页面，打开首页 ", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            onClick: _ctx.navigateToErrorPage,
            class: "uni-btn"
          }), " 打开不存在的页面 ", 8 /* PROPS */, ["onClick"]),
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.animationTypeList, (item, _, __index, _cached): any => {
            return createElementVNode("button", utsMapOf({
              onClick: () => {_ctx.navigateToAnimationType(item)},
              class: "uni-btn"
            }), "navigateTo动画(" + toDisplayString(item) + ")", 9 /* TEXT, PROPS */, ["onClick"])
          }), 256 /* UNKEYED_FRAGMENT */)
        ])
      ])
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPINavigatorNavigatorStyles = [utsMapOf([["direction-row", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["label", padStyleMapOf(utsMapOf([["width", 190]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
