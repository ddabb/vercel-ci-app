
  const __sfc__ = defineComponent({
    data() {
      return {
        total_fee: 1, // 支付金额，单位分 100 = 1元
        order_no: "", // 业务系统订单号（即你自己业务系统的订单表的订单号）
        out_trade_no: "", // 插件支付单号
        description: "测试订单", // 支付描述
        type: "test", // 支付回调类型 如 recharge 代表余额充值 goods 代表商品订单（可自定义，任意英文单词都可以，只要你在 uni-pay-co/notify/目录下创建对应的 xxx.js文件进行编写对应的回调逻辑即可）
        openid: "", // 微信公众号需要
        custom: {
          a: "a",
          b: 1
        } as UTSJSONObject,
        adpid: "1000000001", // uni-ad的广告位id

        transaction_id: "", // 查询订单接口的查询条件
        getOrderRes: {} as UTSJSONObject, // 查询订单支付成功后的返回值
      }
    },
    onLoad(options) {
      console.log('onLoad: ', options)





























    },
    methods: {
      /**
       * 发起支付（唤起收银台，如果只有一种支付方式，则收银台不会弹出来，会直接使用此支付方式）
       * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
       */
      open() {
        this.order_no = `test` + Date.now();
        this.out_trade_no = `${this.order_no}-1`;
        // 打开支付收银台
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        payInstance.open({
          total_fee: this.total_fee, // 支付金额，单位分 100 = 1元
          order_no: this.order_no, // 业务系统订单号（即你自己业务系统的订单表的订单号）
          out_trade_no: this.out_trade_no, // 插件支付单号
          description: this.description, // 支付描述
          type: this.type, // 支付回调类型
          openid: this.openid, // 微信公众号需要
          custom: this.custom, // 自定义数据
        });
      },
      /**
       * 发起支付（不唤起收银台，手动指定支付方式）
       * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
       */
      createOrder(provider : string) {
        this.order_no = `test` + Date.now();
        this.out_trade_no = `${this.order_no}-1`;
        // 发起支付
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        payInstance.createOrder({
          provider: provider, // 支付供应商
          total_fee: this.total_fee, // 支付金额，单位分 100 = 1元
          order_no: this.order_no, // 业务系统订单号（即你自己业务系统的订单表的订单号）
          out_trade_no: this.out_trade_no, // 插件支付单号
          description: this.description, // 支付描述
          type: this.type, // 支付回调类型
          openid: this.openid, // 微信公众号需要
          custom: this.custom, // 自定义数据
        });
      },
      /**
       * 生成支付独立二维码（只返回支付二维码）
       * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
       */
      createQRcode(provider : string) {
        this.order_no = `test` + Date.now();
        this.out_trade_no = `${this.order_no}-1`;
        // 发起支付
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        payInstance.createOrder({
          provider: provider, // 支付供应商
          total_fee: this.total_fee, // 支付金额，单位分 100 = 1元
          order_no: this.order_no, // 业务系统订单号（即你自己业务系统的订单表的订单号）
          out_trade_no: this.out_trade_no, // 插件支付单号
          description: this.description, // 支付描述
          type: this.type, // 支付回调类型
          qr_code: true, // 强制扫码支付
          openid: this.openid, // 微信公众号需要
          custom: this.custom, // 自定义数据
        });
      },
      /**
       * 前往自定义收银台页面
       * 在调用此api前，你应该先创建自己的业务系统订单，并获得订单号 order_no，把order_no当参数传给此api，而示例中为了简化跟支付插件无关的代码，这里直接已时间戳生成了order_no
       */
      toPayDesk() {
        this.order_no = `test` + Date.now();
        this.out_trade_no = `${this.order_no}-1`;
        let options = {
          total_fee: this.total_fee, // 支付金额，单位分 100 = 1元
          order_no: this.order_no, // 业务系统订单号（即你自己业务系统的订单表的订单号）
          out_trade_no: this.out_trade_no, // 插件支付单号
          description: this.description, // 支付描述
          type: this.type, // 支付回调类型
          openid: this.openid, // 微信公众号需要
          custom: this.custom, // 自定义数据
        };
        let optionsStr = encodeURI(JSON.stringify(options));
        uni.navigateTo({
          url: `/uni_modules/uni-pay-x/pages/pay-desk/pay-desk?options=${optionsStr}`
        });
      },
      // 打开查询订单的弹窗
      getOrderPopup(key : boolean) {
        const getOrderPopupInstance = this.$refs["getOrderPopupRef"] as UniPayPopupComponentPublicInstance;
        if (key) {
          getOrderPopupInstance.open();
        } else {
          getOrderPopupInstance.close();
        }
      },
      // 查询支付状态
      async getOrder() : Promise<void> {
        this.getOrderRes = {} as UTSJSONObject;
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        let getOrderData = {
          await_notify: true
        } as UTSJSONObject;
        if (this.transaction_id != "") {
          getOrderData['transaction_id'] = this.transaction_id;
        } else if (this.out_trade_no != "") {
          getOrderData['out_trade_no'] = this.out_trade_no;
        }
        let res = await payInstance.getOrder(getOrderData);
        if (res['errCode'] == 0) {
          this.getOrderRes = res.getJSON('pay_order') as UTSJSONObject;
          let obj = {
            "-1": "已关闭",
            "1": "已支付",
            "0": "未支付",
            "2": "已部分退款",
            "3": "已全额退款"
          } as UTSJSONObject;
          let status = res['status'] as number;
          let statusStr = status + "";
          let title = obj[statusStr] as string;
          uni.showToast({
            title: title,
            icon: "none"
          });
        }
      },
      // 发起退款
      async refund() : Promise<void> {
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        let res = await payInstance.refund({
          out_trade_no: this.out_trade_no, // 插件支付单号
        });
        if (res['errCode'] == 0) {
          uni.showToast({
            title: res['errMsg'] as string,
            icon: "none"
          });
        }
      },
      // 查询退款状态
      async getRefund() : Promise<void> {
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        let res = await payInstance.getRefund({
          out_trade_no: this.out_trade_no, // 插件支付单号
        });
        if (res['errCode'] == 0) {
          uni.showModal({
            content: res['errMsg'] as string,
            showCancel: false
          });
        }
      },
      // 关闭订单
      async closeOrder() : Promise<void> {
        const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
        let res = await payInstance.closeOrder({
          out_trade_no: this.out_trade_no, // 插件支付单号
        });
        if (res['errCode'] == 0) {
          uni.showModal({
            content: res['errMsg'] as string,
            showCancel: false
          });
        }
      },


































      // 监听事件 - 支付订单创建成功（此时用户还未支付）
      onCreate(res : UTSJSONObject) {
        console.log('create: ', res);
        // 如果只是想生成支付二维码，不需要组件自带的弹窗，则在这里可以获取到支付二维码 qr_code_image
      },
      // 监听事件 - 支付成功
      onSuccess(res : UTSJSONObject) {
        console.log('success: ', res);
        let user_order_success = res.getBoolean('user_order_success');
        if (user_order_success != null && user_order_success != true) {
          // 代表用户已付款，且你自己写的回调成功并正确执行了

        } else {
          // 代表用户已付款，但你自己写的回调执行失败（通常是因为你的回调代码有问题）

        }
      },
      // 监听事件 - 支付失败
      onFail(err : UTSJSONObject) {
        console.log('fail: ', err)

      },
      // 监听事件 - 取消支付
      onCancel(err : UTSJSONObject) {
        console.log('cancel: ', err)

      },
      // 页面跳转
      pageTo(url : string) {
        uni.navigateTo({
          url
        });
      },
      // provider格式化
      providerFormat(provider ?: string) : string {
        if (provider == null) {
          return "";
        }
        let providerObj = {
          "wxpay": "微信支付",
          "alipay": "支付宝支付",
          "appleiap": "ios内购"
        } as UTSJSONObject;
        let providerStr = providerObj[provider] as string;
        return providerStr;
      },
      // amount格式化
      amountFormat(totalFee : number | null) : string {
        if (totalFee == null) {
          return "0";
        } else {
          return (totalFee / 100).toFixed(2)
        }
      }
    },
    computed: {
      // 计算当前H5环境
      h5Env() : string {




















        return "";
      },
      // 计算当前是否是ios app
      isIosAppCom() : boolean {
        let info = uni.getSystemInfoSync();
        return info.uniPlatform == 'app' && info.osName == 'ios' ? true : false;
      },
      // 计算当前是否是PC环境
      isPcCom() : boolean {
        let isPC = false;




        return isPC;
      }
    },
  })

export default __sfc__
function GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_pay_popup = resolveEasyComponent("uni-pay-popup",_easycom_uni_pay_popup)
const _component_uni_pay = resolveEasyComponent("uni-pay",_easycom_uni_pay)

  return createElementVNode("view", utsMapOf({ class: "app" }), [
    createElementVNode("view", null, [
      createElementVNode("view", utsMapOf({ class: "label" }), "支付单号："),
      createElementVNode("view", null, [
        createElementVNode("input", utsMapOf({
          class: "input",
          modelValue: _ctx.out_trade_no,
          onInput: ($event: InputEvent) => {(_ctx.out_trade_no) = $event.detail.value},
          placeholder: "点击发起支付会自动生成"
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ])
    ]),
    createElementVNode("view", null, [
      createElementVNode("view", utsMapOf({ class: "label" }), "支付金额（单位分，100=1元）："),
      createElementVNode("view", null, [
        createElementVNode("input", utsMapOf({
          class: "input",
          modelValue: _ctx.total_fee,
          onInput: ($event: InputEvent) => {(_ctx.total_fee) = looseToNumber($event.detail.value)}
        }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"])
      ])
    ]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.open()}
    }), "打开收银台（弹窗模式）", 8 /* PROPS */, ["onClick"]),
    isTrue(!_ctx.isPcCom)
      ? createElementVNode("view", utsMapOf({ key: 0 }), [
          createElementVNode("button", utsMapOf({
            class: "button",
            onClick: _ctx.toPayDesk
          }), "打开收银台（新页面模式）", 8 /* PROPS */, ["onClick"])
        ])
      : createCommentVNode("v-if", true),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.createOrder('wxpay')}
    }), "发起支付（微信）", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.createOrder('alipay')}
    }), "发起支付（支付宝）", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.createQRcode('alipay')}
    }), "APP扫码支付（支付宝）", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.getOrderPopup(true)}
    }), "查询支付状态", 8 /* PROPS */, ["onClick"]),
    createElementVNode("button", utsMapOf({
      class: "button",
      onClick: () => {_ctx.pageTo('/uni_modules/uni-pay-x/pages/success/success?out_trade_no=test2024030501-1&order_no=test2024030501&total_fee=1&adpid=1000000001&return_url=/pages/API/request-payment/request-payment/order-detail')}
    }), "支付成功页面示例", 8 /* PROPS */, ["onClick"]),
    createVNode(_component_uni_pay_popup, utsMapOf({
      ref: "getOrderPopupRef",
      type: "center"
    }), utsMapOf({
      default: withSlotCtx((): any[] => [
        createElementVNode("scroll-view", utsMapOf({
          direction: "vertical",
          class: "get-order-popup"
        }), [
          createElementVNode("view", utsMapOf({ class: "label" }), "插件支付单号："),
          createElementVNode("view", utsMapOf({ class: "mt20" }), [
            createElementVNode("input", utsMapOf({
              class: "input pd2030",
              modelValue: _ctx.out_trade_no,
              onInput: ($event: InputEvent) => {(_ctx.out_trade_no) = $event.detail.value},
              placeholder: "请输入"
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"]),
            createElementVNode("view", null, [
              createElementVNode("text", utsMapOf({ class: "tips" }), "插件支付单号和第三方交易单号2选1填即可")
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "label" }), "第三方交易单号："),
          createElementVNode("view", utsMapOf({ class: "mt20" }), [
            createElementVNode("input", utsMapOf({
              class: "input pd2030",
              modelValue: _ctx.transaction_id,
              onInput: ($event: InputEvent) => {(_ctx.transaction_id) = $event.detail.value},
              placeholder: "请输入"
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["modelValue", "onInput"]),
            createElementVNode("view", utsMapOf({ class: "tips" }), [
              createElementVNode("text", utsMapOf({ class: "tips" }), "可从支付宝账单（订单号）、微信账单（交易单号）中复制")
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "mt20" }), [
            createElementVNode("button", utsMapOf({
              class: "button",
              onClick: _ctx.getOrder
            }), "查询支付状态", 8 /* PROPS */, ["onClick"])
          ]),
          isTrue(_ctx.getOrderRes['transaction_id'])
            ? createElementVNode("view", utsMapOf({
                key: 0,
                class: "mt20"
              }), [
                createElementVNode("view", utsMapOf({ class: "table" }), [
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "订单描述")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.getOrderRes['description']), 1 /* TEXT */)
                    ])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "支付金额")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.amountFormat(_ctx.getOrderRes.getNumber('total_fee'))), 1 /* TEXT */)
                    ])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "支付方式")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.providerFormat(_ctx.getOrderRes['provider'] as string)), 1 /* TEXT */)
                    ])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "第三方交易单号")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.getOrderRes['transaction_id']), 1 /* TEXT */)
                    ])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "插件支付单号")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.getOrderRes['out_trade_no']), 1 /* TEXT */)
                    ])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "table-tr" }), [
                    createElementVNode("view", utsMapOf({ class: "table-td label" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-left" }), "回调状态")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "table-td" }), [
                      createElementVNode("text", utsMapOf({ class: "text align-right" }), toDisplayString(_ctx.getOrderRes.getBoolean('user_order_success') != null && _ctx.getOrderRes.getBoolean('user_order_success') == true ? "成功" : "异常"), 1 /* TEXT */)
                    ])
                  ])
                ])
              ])
            : createCommentVNode("v-if", true)
        ])
      ]),
      _: 1 /* STABLE */
    }), 512 /* NEED_PATCH */),
    createVNode(_component_uni_pay, utsMapOf({
      ref: "payRef",
      adpid: _ctx.adpid,
      height: "900rpx",
      "return-url": "/pages/API/request-payment/request-payment/order-detail",
      logo: "/static/logo.png",
      onSuccess: _ctx.onSuccess,
      onCreate: _ctx.onCreate,
      onFail: _ctx.onFail,
      onCancel: _ctx.onCancel
    }), null, 8 /* PROPS */, ["adpid", "onSuccess", "onCreate", "onFail", "onCancel"])
  ])
}
const GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayStyles = [utsMapOf([["app", padStyleMapOf(utsMapOf([["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))], ["input", padStyleMapOf(utsMapOf([["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#f3f3f3"], ["paddingTop", "10rpx"], ["paddingRight", "10rpx"], ["paddingBottom", "10rpx"], ["paddingLeft", "10rpx"], ["width", "100%"], ["boxSizing", "border-box"], ["height", "80rpx"], ["backgroundImage", "none"], ["backgroundColor", "#FFFFFF"]]))], ["button", padStyleMapOf(utsMapOf([["marginTop", "20rpx"]]))], ["label", utsMapOf([["", utsMapOf([["marginTop", "10rpx"], ["marginRight", 0], ["marginBottom", "10rpx"], ["marginLeft", 0]])], [".table ", utsMapOf([["width", "180rpx"]])]])], ["tips", padStyleMapOf(utsMapOf([["marginTop", "20rpx"], ["marginRight", 0], ["marginBottom", "20rpx"], ["marginLeft", 0], ["fontSize", "24rpx"], ["color", "#565656"]]))], ["get-order-popup", padStyleMapOf(utsMapOf([["backgroundColor", "#ffffff"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"], ["height", "900rpx"], ["borderRadius", "20rpx"], ["width", "690rpx"]]))], ["mt20", padStyleMapOf(utsMapOf([["marginTop", "20rpx"]]))], ["pd2030", padStyleMapOf(utsMapOf([["paddingTop", "20rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "30rpx"]]))], ["table-tr", utsMapOf([[".table ", utsMapOf([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "center"], ["alignItems", "center"], ["paddingTop", "10rpx"], ["paddingRight", 0], ["paddingBottom", "10rpx"], ["paddingLeft", 0]])]])], ["table-td", utsMapOf([[".table ", utsMapOf([["flex", 1]])]])], ["align-left", utsMapOf([[".table ", utsMapOf([["textAlign", "left"]])]])], ["align-right", utsMapOf([[".table ", utsMapOf([["textAlign", "right"]])]])], ["text", utsMapOf([[".table ", utsMapOf([["fontSize", "24rpx"]])]])]])]

import _easycom_uni_pay_popup from '@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue'
import _easycom_uni_pay from '@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue'

import { UniPayComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue"
import { UniPayPopupComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue"