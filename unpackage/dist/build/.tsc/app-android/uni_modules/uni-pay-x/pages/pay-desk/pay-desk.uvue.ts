
	import { objectAssign } from "../../js_sdk/js_sdk"
	const __sfc__ = defineComponent({
		data() {
			return {
				myOptions: {
					total_fee: "",
				} as UTSJSONObject,
				insideData: {
					currentProviders: [] as Array<string>,
					images: {
						alipay: "",
						wxpay: ""
					} as UTSJSONObject
				} as UTSJSONObject, // uni-pay组件mounted事件获得的数据
				adpid: "", // 广告id
				return_url: "", // 支付成功后点击查看订单跳转的订单详情页面地址
				main_color: "", // 支付成功页面的主色调
			}
		},
		// 监听 - 页面每次【加载时】执行(如：前进)
		onLoad(options) {
			let optionsStr = options['options'] as string | null;
			if (optionsStr != null && optionsStr != "") {
				let newOptions = JSON.parse(decodeURI(optionsStr)!) as UTSJSONObject;
				this.myOptions = newOptions as UTSJSONObject;
			}
			console.log('myOptions: ', this.myOptions)
		},
		// 监听 - 页面【首次渲染完成时】执行。注意如果渲染速度快，会在页面进入动画完成前触发
		onReady() { },
		// 监听 - 页面每次【显示时】执行(如：前进和返回) (页面每次出现在屏幕上都触发，包括从下级页面点返回露出当前页面)
		onShow() { },
		// 监听 - 页面每次【隐藏时】执行(如：返回)
		onHide() { },
		// 函数
		methods: {
			// 监听 - 支付组件加载完毕事件
			onMounted(insideData : UTSJSONObject) {
				this.insideData['currentProviders'] = insideData.getArray('currentProviders') as Array<string>;
				this.insideData['images'] = insideData.getJSON('images') as UTSJSONObject;
			},
			// 发起支付
			createOrder(data : UTSJSONObject) {
				this.myOptions = objectAssign(this.myOptions, data);
				const payInstance = this.$refs["payRef"] as UniPayComponentPublicInstance;
				payInstance.createOrder(this.myOptions);
			},
			// 根据provider发起支付
			createOrderByProvider(provider : string) {
				this.createOrder({
					provider
				})
			},
			// 监听事件 - 支付成功
			onSuccess(res : UTSJSONObject) {
				let out_trade_no = res['out_trade_no'] as string;
				let pay_order = res.getJSON('pay_order') as UTSJSONObject;
				let order_no = pay_order['order_no'] as string;
				//let pay_date = pay_order['pay_date'] as string;
				let total_fee = pay_order.getNumber('total_fee');
				if (total_fee == null) {
					total_fee = 0;
				}
				let return_url = this.return_url as string;
				let adpid = this.adpid as string;
				let main_color = this.main_color as string;

				console.log('success: ', res);
				let user_order_success = res.getBoolean('user_order_success');
				if (user_order_success != null && user_order_success != true) {
					// 代表用户已付款，且你自己写的回调成功并正确执行了
					uni.redirectTo({
						url: `/uni_modules/uni-pay-x/pages/success/success?out_trade_no=${out_trade_no}&order_no=${order_no}&total_fee=${total_fee}&adpid=${adpid}&return_url=${return_url}&main_color=${main_color}`
					});
				} else {
					// 代表用户已付款，但你自己写的回调执行失败（通常是因为你的回调代码有问题）

				}
			},
			// 监听事件 - 支付失败
			onFail(err : RequestPaymentFail) {
				console.log('fail: ', err)

			},
			// 监听事件 - 取消支付
			onCancel(err : RequestPaymentFail) {
				console.log('cancel: ', err)

			},
			amountFormat(totalFee : number | null) :string{
				if (totalFee == null) {
					return "0";
				} else {
					return (totalFee / 100).toFixed(2)
				} 
			},
			// 检测provider
			checkProvider(provider : string) : boolean {
				let currentProviders = this.insideData.getArray<string>('currentProviders');
				return currentProviders != null && currentProviders.indexOf(provider) > -1 ? true : false;
			}
		},
		// 监听器
		watch: {

		},
		// 计算属性
		computed: {

		}
	})

export default __sfc__
function GenUniModulesUniPayXPagesPayDeskPayDeskRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_pay = resolveEasyComponent("uni-pay",_easycom_uni_pay)

  return createElementVNode("view", utsMapOf({ class: "uni-pay" }), [
    createElementVNode("view", utsMapOf({ class: "mobile-pay-popup" }), [
      createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-amount-box" }), [
        createElementVNode("view", null, [
          createElementVNode("text", utsMapOf({ class: "text" }), "待支付金额：")
        ]),
        createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-amount" }), [
          createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString(_ctx.amountFormat(_ctx.myOptions.getNumber('total_fee'))), 1 /* TEXT */)
        ])
      ]),
      createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-provider-list" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list" }), [
          isTrue(_ctx.checkProvider('wxpay'))
            ? createElementVNode("view", utsMapOf({
                key: 0,
                class: "uni-list-item",
                onClick: () => {_ctx.createOrderByProvider('wxpay')}
              }), [
                createElementVNode("view", utsMapOf({ class: "uni-list-item__container container--right" }), [
                  createElementVNode("view", utsMapOf({ class: "uni-list-item__header" }), [
                    createElementVNode("image", utsMapOf({
                      src: _ctx.insideData.getJSON('images')!['wxpay'],
                      class: "image"
                    }), null, 8 /* PROPS */, ["src"])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "uni-list-item__content uni-list-item__content--center" }), [
                    createElementVNode("text", utsMapOf({ class: "text" }), "微信支付")
                  ])
                ]),
                createElementVNode("view", utsMapOf({ class: "arrowright" }))
              ], 8 /* PROPS */, ["onClick"])
            : createCommentVNode("v-if", true),
          isTrue(_ctx.checkProvider('alipay'))
            ? createElementVNode("view", utsMapOf({
                key: 1,
                class: "uni-list-item",
                onClick: () => {_ctx.createOrderByProvider('alipay')}
              }), [
                createElementVNode("view", utsMapOf({ class: "uni-list-item__container container--right" }), [
                  createElementVNode("view", utsMapOf({ class: "uni-list-item__header" }), [
                    createElementVNode("image", utsMapOf({
                      src: _ctx.insideData.getJSON('images')!['alipay'],
                      class: "image"
                    }), null, 8 /* PROPS */, ["src"])
                  ]),
                  createElementVNode("view", utsMapOf({ class: "uni-list-item__content uni-list-item__content--center" }), [
                    createElementVNode("text", utsMapOf({ class: "text" }), "支付宝")
                  ])
                ]),
                createElementVNode("view", utsMapOf({ class: "arrowright" }))
              ], 8 /* PROPS */, ["onClick"])
            : createCommentVNode("v-if", true)
        ])
      ])
    ]),
    createVNode(_component_uni_pay, utsMapOf({
      ref: "payRef",
      height: "900rpx",
      "to-success-page": false,
      onMounted: _ctx.onMounted,
      onSuccess: _ctx.onSuccess,
      onFail: _ctx.onFail,
      onCancel: _ctx.onCancel
    }), null, 8 /* PROPS */, ["onMounted", "onSuccess", "onFail", "onCancel"])
  ])
}
const GenUniModulesUniPayXPagesPayDeskPayDeskStyles = [utsMapOf([["uni-pay", padStyleMapOf(utsMapOf([["flex", 1], ["display", "flex"], ["flexDirection", "column"], ["backgroundColor", "#f3f3f3"]]))], ["mobile-pay-popup", padStyleMapOf(utsMapOf([["flex", 1]]))], ["mobile-pay-popup-amount-box", utsMapOf([[".mobile-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]])]])], ["mobile-pay-popup-amount", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-amount-box ", utsMapOf([["marginTop", "20rpx"]])]])], ["text", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-amount-box .mobile-pay-popup-amount ", utsMapOf([["color", "#e43d33"], ["fontSize", "60rpx"]])], [".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__content ", utsMapOf([["color", "#3b4144"], ["fontSize", "28rpx"]])]])], ["mobile-pay-popup-provider-list", utsMapOf([[".mobile-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["marginTop", "20rpx"]])]])], ["uni-list", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list ", utsMapOf([["display", "flex"], ["backgroundColor", "#ffffff"], ["position", "relative"], ["flexDirection", "column"]])]])], ["uni-list-item", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list ", utsMapOf([["display", "flex"], ["position", "relative"], ["justifyContent", "space-between"], ["alignItems", "center"], ["backgroundColor", "#ffffff"], ["flexDirection", "row"], ["borderBottomWidth", "2rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#f8f8f8"], ["backgroundColor:hover", "#f1f1f1"]])]])], ["uni-list-item__container", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["position", "relative"], ["display", "flex"], ["flexDirection", "row"], ["paddingTop", 12], ["paddingRight", 15], ["paddingBottom", 12], ["paddingLeft", 15], ["flex", 1], ["overflow", "hidden"]])]])], ["uni-list-item__header", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container ", utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"]])]])], ["image", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container .uni-list-item__header ", utsMapOf([["width", "52rpx"], ["height", "52rpx"], ["marginRight", "18rpx"]])]])], ["container--right", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["paddingRight", 0]])]])], ["uni-list-item__content", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["display", "flex"], ["paddingRight", 8], ["flex", 1], ["flexDirection", "column"], ["justifyContent", "space-between"], ["overflow", "hidden"]])]])], ["uni-list-item__content--center", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["justifyContent", "center"]])]])], ["arrowright", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["borderTopWidth", "2rpx"], ["borderTopStyle", "solid"], ["borderTopColor", "#bbbbbb"], ["borderRightWidth", "2rpx"], ["borderRightStyle", "solid"], ["borderRightColor", "#bbbbbb"], ["width", "16rpx"], ["height", "16rpx"], ["marginRight", "30rpx"], ["transform", "rotate(45deg)"]])]])]])]

import _easycom_uni_pay from '@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue'

import { UniPayComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay/uni-pay.uvue"