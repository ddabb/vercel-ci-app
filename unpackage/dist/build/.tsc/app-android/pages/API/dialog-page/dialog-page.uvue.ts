
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  type OpenAnimationType =
    'auto' |
    'none' |
    'slide-in-right' |
    'slide-in-left' |
    'slide-in-top' |
    'slide-in-bottom' |
    'fade-in' |
    'zoom-out' |
    'zoom-fade-out'

  const __sfc__ = defineComponent({
    data() {
      return {
        jest_click_x: -1,
        jest_click_y: -1,
        openAnimationType: 'none' as OpenAnimationType,
        openAnimationTypeList: [
          'auto',
          'none',
          'slide-in-right',
          'slide-in-left',
          'slide-in-top',
          'slide-in-bottom',
          'fade-in',
          'zoom-out',
          'zoom-fade-out'
        ]
      }
    },
    onLoad() {
      console.log('dialogPage parent onLoad')
    },
    onShow() {
      console.log('dialogPage parent onShow')
      setLifeCycleNum(state.lifeCycleNum + 10)
    },
    onReady() {
      console.log('dialogPage parent onReady')
    },
    onHide() {
      console.log('dialogPage parent onHide')
      setLifeCycleNum(state.lifeCycleNum - 10)
    },
    onUnload() {
      console.log('dialogPage parent onUnload')
    },
    methods: {
      goNextPage() {
        uni.navigateTo({
          url: '/pages/API/dialog-page/next-page'
        })
      },
      openDialog1() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-1?name=dialog1',
          animationType: this.openAnimationType,
          success(res) {
            console.log('openDialogPage1 success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('openDialogPage1 fail', err)
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('openDialogPage1 complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      openDialog2() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-2',
          animationType: this.openAnimationType,
          disableEscBack: true,
          success(res) {
            console.log('openDialog2 success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('openDialog2 fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('openDialog2 complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      openDialog1WrongPath() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-11?name=dialog1',
          success(res) {
            console.log('openDialogPage1 success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('openDialogPage1 fail', err)
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('openDialogPage1 complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      goNextPageOpenDialog1() {
        uni.navigateTo({
          url: '/pages/API/dialog-page/next-page',
          success() {
            setTimeout(() => {
              uni.openDialogPage({
                url: '/pages/API/dialog-page/dialog-1?name=dialog1',
                animationType: this.openAnimationType,
                success(res) {
                  console.log('openDialogPage1 success', res)
                  // 自动化测试
                  setLifeCycleNum(state.lifeCycleNum + 1)
                },
                fail(err) {
                  console.log('openDialogPage1 fail', err)
                  // 自动化测试
                  setLifeCycleNum(state.lifeCycleNum - 4)
                },
                complete(res) {
                  console.log('openDialogPage1 complete', res)
                  // 自动化测试
                  setLifeCycleNum(state.lifeCycleNum + 1)
                }
              })
            }, 2000)
          }
        })
      },
      closeDialog() {
        uni.closeDialogPage({
          success(res) {
            console.log('closeDialog success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('closeDialog fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('closeDialog complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      closeSpecifiedDialog(index : number) {
        const dialogPages = this.$page.getDialogPages()
        uni.closeDialogPage({
          dialogPage: dialogPages[index],
          success(res) {
            console.log('closeSomeOneDialog success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('closeSomeOneDialog fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('closeSomeOneDialog complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      // 自动化测试
      openDialog4() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-4',
        })
      },
      openDialogWithTriggerParentHide() {
        uni.openDialogPage({
          url: `/pages/API/dialog-page/dialog-4?tag=${Date.now()}`,
          triggerParentHide: true,
          success(res) {
            console.log('openDialogWithTriggerParentHide success', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          },
          fail(err) {
            console.log('openDialogWithTriggerParentHide fail', err)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum - 4)
          },
          complete(res) {
            console.log('openDialogWithTriggerParentHide complete', res)
            // 自动化测试
            setLifeCycleNum(state.lifeCycleNum + 1)
          }
        })
      },
      setLifeCycleNum(value : number) {
        setLifeCycleNum(value)
      },
      getLifeCycleNum() : number {
        return state.lifeCycleNum
      },
      jest_OpenDialog1() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-1?name=dialog1'
        })
      },
      jest_CloseDialog1() {
        uni.closeDialogPage({})
      },
      jest_getTapPoint() {
        const systemInfo = uni.getSystemInfoSync()
        let ratio = 1
        if (systemInfo.platform == 'android') {
          ratio = systemInfo.devicePixelRatio
        }
        this.jest_click_x = systemInfo.screenWidth / 2 * ratio
        this.jest_click_y = systemInfo.statusBarHeight * ratio + 10
      },
      openDialog2ForTest() {
        uni.openDialogPage({
          url: '/pages/API/dialog-page/dialog-2'
        });
      },
      closeDialog2ForTest() {
        uni.closeDialogPage({});
      },
      setPageStyleForTest(style : UTSJSONObject) {
        const pages = this.$page.getDialogPages();
        if (pages.length > 0) pages[pages.length - 1].setPageStyle(style);
      },
      openDialog3() {
        uni.openDialogPage({ url: '/pages/API/dialog-page/dialog-3', animationType: this.openAnimationType })
      },
      handleOpenAnimationType(e : RadioGroupChangeEvent) {
        this.openAnimationType = e.detail.value as OpenAnimationType
      },
      // 自动化测试
      getDialogPage() : UniPage | null {
        const dialogPages = this.$page.getDialogPages()
        return dialogPages.length > 0 ? dialogPages[0] : null
      },
      // 自动化测试
      dialogPageCheckGetDialogPages() : boolean {
        const dialogPage = this.getDialogPage()!
        const dialogPages = dialogPage.getDialogPages()
        const res = dialogPages.length == 0
        return res
      },
      // 自动化测试
      dialogPageGetPageStyle() : UTSJSONObject {
        const dialogPage = this.getDialogPage()!
        return dialogPage.getPageStyle()
      },
      // 自动化测试
      dialogPageSetPageStyle() {
        const dialogPage = this.getDialogPage()!
        dialogPage.setPageStyle({
          backgroundColorContent: 'red'
        })
      },
      // 自动化测试
      dialogPageCheckGetElementById() : boolean {
        const dialogPage = this.getDialogPage()!
        const element = dialogPage.getElementById('dialog1-go-next-page')
        let res = element != null







        return res
      },
      // 自动化测试
      dialogCheckGetAndroidView() : boolean {
        const dialogPage = this.getDialogPage()!
        const androidView = dialogPage.getAndroidView()
        const res = androidView != null
        return res
      },
      // 自动化测试
      dialogCheckGetIOSView() : boolean {
        const dialogPage = this.getDialogPage()!
        const IOSView = dialogPage.getIOSView()
        const res = IOSView != null
        return res
      },
      // 自动化测试
      dialogCheckGetHTMLElement() : boolean {
        const dialogPage = this.getDialogPage()!
        const HTMLView = dialogPage.getHTMLElement()
        const res = HTMLView != null
        return res
      },
    }
  })

export default __sfc__
function GenPagesAPIDialogPageDialogPageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")

  return createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "go-next-page",
      onClick: _ctx.goNextPage
    }), " go next page ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "open-dialog1",
      onClick: _ctx.openDialog1
    }), " open dialog 1 ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "open-dialog1-wrong-path",
      onClick: _ctx.openDialog1WrongPath
    }), " open dialog page 1 with wrong path ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "go-next-page-open-dialog1",
      onClick: _ctx.goNextPageOpenDialog1
    }), " go next page & open dialog1 ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "open-dialog1",
      onClick: _ctx.openDialog3
    }), " open dialog 3 test page style ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "uni-common-mt",
      id: "open-dialog4",
      onClick: _ctx.openDialogWithTriggerParentHide
    }), " openDialog with triggerParentHide ", 8 /* PROPS */, ["onClick"]),
    createElementVNode("text", utsMapOf({ class: "uni-common-mt choose-open-animation-type-title" }), "choose open dialogPage animationType"),
    createVNode(_component_radio_group, utsMapOf({
      class: "choose-open-animation-type-radio-group",
      onChange: _ctx.handleOpenAnimationType
    }), utsMapOf({
      default: withSlotCtx((): any[] => [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.openAnimationTypeList, (item, __key, __index, _cached): any => {
          return createVNode(_component_radio, utsMapOf({
            class: "ml-10 uni-common-mt",
            key: item,
            value: item,
            checked: _ctx.openAnimationType == item
          }), utsMapOf({
            default: withSlotCtx((): any[] => [toDisplayString(item)]),
            _: 2 /* DYNAMIC */
          }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["value", "checked"])
        }), 128 /* KEYED_FRAGMENT */)
      ]),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["onChange"])
  ])
}
const GenPagesAPIDialogPageDialogPageStyles = [utsMapOf([["ml-10", padStyleMapOf(utsMapOf([["marginLeft", 10]]))], ["choose-open-animation-type-title", padStyleMapOf(utsMapOf([["fontWeight", "bold"]]))], ["choose-open-animation-type-radio-group", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["flexWrap", "wrap"]]))]])]
