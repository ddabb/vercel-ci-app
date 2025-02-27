
  import {
    state,
    setLifeCycleNum
  } from '@/store/index.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'dialog 4'
      }
    },
    onShow() {
      console.log('dialog 4 onShow')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum + 1)
    },
    onUnload() {
      console.log('dialog 4 onUnload')
      // 自动化测试
      setLifeCycleNum(state.lifeCycleNum - 5)
    },
    methods: {
      closeDialog() {
        uni.closeDialogPage({
          success(res) {
            console.log('closeDialog success', res)
          },
          fail(err) {
            console.log('closeDialog fail', err)
          },
          complete(res) {
            console.log('closeDialog complete', res)
          }
        })
      },
      closeThisDialog() {
        uni.closeDialogPage({
          dialogPage: this.$page,
          success(res) {
            console.log('closeThisDialog success', res)
          },
          fail(err) {
            console.log('closeThisDialog fail', err)
          },
          complete(res) {
            console.log('closeThisDialog complete', res)
          }
        })
      },
      openDialog3(){
        uni.openDialogPage({url: '/pages/API/dialog-page/dialog-3'})
      }
    }
  })

export default __sfc__
function GenPagesAPIDialogPageDialog4Render(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "dialog-container" }), [
    createElementVNode("view", utsMapOf({ class: "dialog-content" }), [
      createElementVNode("text", null, "title: " + toDisplayString(_ctx.title), 1 /* TEXT */),
      createElementVNode("button", utsMapOf({
        class: "mt-10",
        onClick: _ctx.closeDialog
      }), " closeDialog ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "mt-10",
        onClick: _ctx.closeThisDialog
      }), " closeThisDialog ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "mt-10",
        onClick: _ctx.openDialog3
      }), " open dialog 3 ", 8 /* PROPS */, ["onClick"])
    ])
  ])
}
const GenPagesAPIDialogPageDialog4Styles = [utsMapOf([["dialog-container", padStyleMapOf(utsMapOf([["width", "100%"], ["height", "100%"], ["backgroundColor", "rgba(0,0,0,0.3)"], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]]))], ["dialog-content", padStyleMapOf(utsMapOf([["width", "80%"], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10], ["backgroundColor", "#ffffff"], ["borderRadius", 6]]))], ["mt-10", padStyleMapOf(utsMapOf([["marginTop", 10]]))]])]
