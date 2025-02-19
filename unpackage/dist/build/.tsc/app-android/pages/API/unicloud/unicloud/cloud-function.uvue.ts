
  const __sfc__ = defineComponent({
    data() {
      return {
        title: '请求云函数',
        callFunctionResult: {},
        callFunctionError: {},
        genericDemoShowMessage: '',
        isUniTest: false
      }
    },
    onLoad() {
    },
    onUnload() {
      if (this.isUniTest) {
        uni.hideToast()
      }
    },
    methods: {
      notify(content : string, title : string) {
        if (!this.isUniTest) {
          uni.showModal({
            title,
            content,
            showCancel: false
          })
        } else {
          console.log(title, content)
        }
      },
      async callFunctionWithGeneric() : Promise<void> {
        type EchoCfResult = {
          showMessage : string
        }
        uni.showLoading({
          title: '加载中...'
        })
        await uniCloud.callFunction<EchoCfResult>({
          name: 'echo-cf',
          data: {
            num: 1,
            str: 'ABC'
          }
        }).then(res => {
          const result = res.result
          uni.hideLoading()
          this.genericDemoShowMessage = result.showMessage
          this.notify(result.showMessage, '提示')
        }).catch((err : any | null) => {
          const error = err as UniCloudError
          this.callFunctionError = {
            errCode: error.errCode,
            errMsg: error.errMsg
          }
          uni.hideLoading()
          this.notify(error.errMsg, '错误')
        })
      },
      async callFunction() : Promise<void> {
        uni.showLoading({
          title: '加载中...'
        })
        await uniCloud.callFunction({
          name: 'echo-cf',
          data: {
            num: 1,
            str: 'ABC'
          }
        }).then(res => {
          const result = res.result
          this.callFunctionResult = result
          console.log(JSON.stringify(result))
          uni.hideLoading()
          this.notify(result['showMessage'] as string, '提示')
        }).catch((err : any | null) => {
          const error = err as UniCloudError
          this.callFunctionError = {
            errCode: error.errCode,
            errMsg: error.errMsg
          }
          uni.hideLoading()
          this.notify(error.errMsg, '错误')
        })
      },
      jest_UniCloudError() {
        return new Error() instanceof UniCloudError
      }
    }
  })

export default __sfc__
function GenPagesAPIUnicloudUnicloudCloudFunctionRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.callFunction
          }), "请求云函数", 8 /* PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: _ctx.callFunctionWithGeneric
          }), "请求云函数传入泛型", 8 /* PROPS */, ["onClick"])
        ])
      ])
    ])
  ])
}
const GenPagesAPIUnicloudUnicloudCloudFunctionStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
