
  const __sfc__ = defineComponent({
    data() {
      return {
        msg: '点击按钮，测试上报'
      }
    },
    methods: {
      handleAppLaunch() {
        const options = uni.getLaunchOptionsSync()
        uni.report({
          name: 'uni-app-launch',
          options: options,
          success:(res)=> {
            this.msg = 'onLaunch --> ' + res.errMsg
            console.log(res);
          }, fail:(err)=>  {
            this.msg = 'onLaunch --> ' + err.errMsg
            console.log(err);
          }
        })
      },
      handleAppHide() {
        uni.report({
          name: 'uni-app-hide',
          success:(res)=> {
            this.msg = 'onAppHide --> ' + res.errMsg
            console.log(res);
          }, fail:(err)=>  {
            this.msg = 'onAppHide --> ' + err.errMsg
            console.log(err);
          }
        })
      },
      handleAppShow() {
        // const options = uni.getLaunchOptionsSync()
        uni.report({
          name: 'uni-app-show',
          success:(res)=> {
            this.msg = 'onAppShow --> ' + res.errMsg
            console.log(res);
          }, fail:(err)=>  {
            this.msg = 'onAppShow --> ' + err.errMsg
            console.log(err);
          }
        })
      },
      handleAppError() {
        const errmsg = '测试错误'
        uni.report({
          name: 'uni-app-error',
          options: errmsg,
          success:(res)=> {
            this.msg = 'onAppError --> ' + res.errMsg
            console.log(res);
          }, fail:(err)=>  {
            this.msg = 'onAppError --> ' + err.errMsg
            console.log(err);
          }
        })
      },
    }
  })

export default __sfc__
function GenPagesAPIReportReportRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: "report" })),
    createElementVNode("view", utsMapOf({ class: "tips" }), [
      createElementVNode("view", utsMapOf({ class: "tips-title" }), "调用信息："),
      createElementVNode("view", utsMapOf({ class: "tips-content" }), toDisplayString(_ctx.msg), 1 /* TEXT */)
    ]),
    createElementVNode("view", utsMapOf({ class: "page" }), [
      createElementVNode("button", utsMapOf({
        class: "normal-button",
        type: "default",
        onClick: _ctx.handleAppLaunch
      }), " 模拟应用启动 ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "normal-button",
        type: "default",
        onClick: _ctx.handleAppHide
      }), " 模拟应用切入后台 ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "normal-button",
        type: "default",
        onClick: _ctx.handleAppShow
      }), " 模拟应用切入前台 ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        class: "normal-button",
        type: "default",
        onClick: _ctx.handleAppError
      }), " 模拟应用错误 ", 8 /* PROPS */, ["onClick"]),
      createElementVNode("text", utsMapOf({ class: "instructions" }), " 当前页面调用API均为模拟，请查看文档，在特定场景下使用以上 API。请在main.uts中设置统计debug配置为true，并点击按钮查控制台输出。 ")
    ])
  ], 4 /* STYLE */)
}
const GenPagesAPIReportReportStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["tips", padStyleMapOf(utsMapOf([["marginTop", 15], ["marginRight", 15], ["marginBottom", 15], ["marginLeft", 15], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["backgroundColor", "#f5f5f5"], ["fontSize", 14], ["textAlign", "center"]]))], ["tips-title", padStyleMapOf(utsMapOf([["fontSize", 16], ["color", "#333333"], ["marginBottom", 10]]))], ["tips-content", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#999999"]]))], ["normal-button", padStyleMapOf(utsMapOf([["width", "100%"], ["marginBottom", 10]]))], ["instructions", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginLeft", 10], ["marginRight", 10], ["backgroundColor", "#eeeeee"], ["fontSize", 12], ["color", "#999999"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
