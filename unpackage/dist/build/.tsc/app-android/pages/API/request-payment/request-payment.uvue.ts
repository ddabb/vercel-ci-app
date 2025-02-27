
  export type PayItem = { id : string, name : string, provider ?: UniProvider }
  const __sfc__ = defineComponent({
    data() {
      return {
        btnText: "支付宝支付",
        btnType: "primary",
        orderInfo: "",
        errorCode: 0,
        errorMsg: "",
        complete: false,
        providerList: [] as PayItem[]
      }
    },
    onLoad: function () {
      let provider = uni.getProviderSync({
        service: "payment",
      } as GetProviderSyncOptions)
      console.log(provider)
      provider.providerObjects.forEach((value : UniProvider) => {
        switch (value.id) {
          case 'alipay':
            var aliPayProvider = value as UniPaymentAlipayProvider
            console.log('alipay', aliPayProvider)
            this.providerList.push({
              name: aliPayProvider.description,
              id: aliPayProvider.id,
              provider: aliPayProvider
            } as PayItem);
            break;
          case 'wxpay':
            var wxPayProvider = value as UniPaymentWxpayProvider
            console.log('wxpay', wxPayProvider)
            this.providerList.push({
              name: wxPayProvider.description,
              id: wxPayProvider.id,
              provider: wxPayProvider
            } as PayItem);
            break;
          default:
            break;
        }
      })
    },
    methods: {
      requestPayment(e : PayItem) {
        const provider = e.id
        if (provider == "alipay") {
          this.payAli(provider)
        } else if (provider == "wxpay") {

          if (e.provider != null && e.provider instanceof UniPaymentWxpayProvider && !((e.provider as UniPaymentWxpayProvider).isWeChatInstalled)) {
            uni.showToast({
              title: "微信没有安装",
              icon: 'error'
            })
          } else {
            this.payWX(provider)
          }











        }
      },
      payAli(id:string) {
        uni.showLoading({
          title: "请求中..."
        })
        uni.request({
          url: 'https://demo.dcloud.net.cn/payment/alipay/?total=0.01',
          method: 'GET',
          timeout: 6000,
          success: (res) => {
            this.orderInfo = JSON.stringify(res.data);
            console.log("====" + this.orderInfo)
            uni.hideLoading()
            uni.requestPayment({
              provider: id,
              orderInfo: res.data as string,
              fail: (res) => {
                console.log(JSON.stringify(res))
                this.errorCode = res.errCode
                uni.showToast({
                  icon: 'error',
                  title: 'errorCode:' + this.errorCode
                });
              },
              success: (res) => {
                console.log(JSON.stringify(res))
                uni.showToast({
                  icon: 'success',
                  title: '支付成功'
                });
              }
            })
          },
          fail: (e) => {
            console.log(e)
            uni.hideLoading()
          },
        });
      },
      payWX(id:string) {
        uni.showLoading({
          title: "请求中..."
        })
        let url = 'https://demo.dcloud.net.cn/payment/wxpayv3.__UNI__uniappx/?total=0.01'
        const res = uni.getAppBaseInfo();
        let packageName : string | null


        packageName = res.packageName






        if (packageName == 'io.dcloud.hellouniappx') {//hello uniappx
          url = 'https://demo.dcloud.net.cn/payment/wxpayv3.__UNI__HelloUniAppX/?total=0.01'
        }
        uni.request({
          url: url,
          method: 'GET',
          timeout: 6000,
          header: {
            "Content-Type": "application/json"
          } as UTSJSONObject,
          success: (res) => {
            console.log(res.data)
            uni.hideLoading()
            uni.requestPayment({
              provider: id,
              orderInfo: JSON.stringify(res.data),
              fail: (res) => {
                console.log(JSON.stringify(res))
                this.errorCode = res.errCode
                uni.showToast({
                  duration: 5000,
                  icon: 'error',
                  title: 'errorCode:' + this.errorCode,
                });
              },
              success: (res) => {
                console.log(JSON.stringify(res))
                uni.showToast({
                  duration: 5000,
                  icon: 'success',
                  title: '支付成功'
                });
              }
            })
          },
          fail: (res) => {
            uni.hideLoading()
            console.log(res)
          },
        });
      },

      //自动化测试使用
      jest_pay() {
        uni.requestPayment({
          provider: "alipay",
          orderInfo: this.orderInfo,
          fail: (res : RequestPaymentFail) => {
            this.errorCode = res.errCode
            this.complete = true
          },
          success: (res : RequestPaymentSuccess) => {
            console.log(JSON.stringify(res))
            this.complete = true
          }
        } as RequestPaymentOptions)
      }
    }
  })

export default __sfc__
function GenPagesAPIRequestPaymentRequestPaymentRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "发起支付" })),
    _ctx.providerList.length > 0
      ? createElementVNode(Fragment, utsMapOf({ key: 0 }), RenderHelpers.renderList(_ctx.providerList, (item, index, __index, _cached): any => {
          return createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"margin-top":"20px"})),
            type: "primary",
            key: index,
            onClick: () => {_ctx.requestPayment(item)}
          }), toDisplayString(item.name), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
        }), 128 /* KEYED_FRAGMENT */)
      : createCommentVNode("v-if", true)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIRequestPaymentRequestPaymentStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
