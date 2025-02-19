
	// 引入支付云对象
	const uniPayCo = uniCloud.importObject("uni-pay-co");
	import { checkPlatform, objectAssign, getWeixinCode, getAlipayCode } from "../../js_sdk/js_sdk"
	const __sfc__ = defineComponent({
		name: "uni-pay",
		emits: ["success", "cancel", "fail", "create", "mounted", "qrcode"],
		props: {
			/**
			 * Banner广告位id
			 */
			adpid: {
				type: String,
				default: ""
			},
			/**
			 * 是否自动跳转到插件内置的支付成功页面（具有看广告功能，可以增加开发者收益）默认true
			 */
			toSuccessPage: {
				type: Boolean,
				default: true
			},
			/**
			 * 支付成功后，点击查看订单按钮时跳转的页面地址
			 */
			returnUrl: {
				type: String,
				default: ""
			},
			/**
			 * 支付结果页主色调，默认支付宝小程序为#108ee9，其他端均为#01be6e
			 * 建议：绿色系 #01be6e 蓝色系 #108ee9 咖啡色 #816a4e 粉红 #fe4070 橙黄 #ffac0c 橘黄 #ff7100
			 */
			mainColor: {
				type: String,
				default: ""
			},
			/**
			 * 收银台模式
			 * mobile 手机版
			 * pc 电脑版
			 */
			mode: {
				type: String,
				default: ""
			},
			/**
			 * PC收银台模式时，展示的logo
			 */
			logo: {
				type: String,
				default: "/static/logo.png"
			},
			/**
			 * 收银台高度（默认70vh）
			 */
			height: {
				type: [String],
				default: "70vh"
			},
			/**
			 * 是否打印运行过程日志
			 */
			debug: {
				type: Boolean,
				default: false
			}
		},
		data() {
			return {
				// 支付参数
				myOptions: {} as UTSJSONObject,
				// 支付云对象返回结果
				orderRes: {
					order: "",
					order_no: "",
					out_trade_no: "",
					provider: "",
					provider_pay_type: "",
					errCode: 0,
				} as UTSJSONObject,
				images: {
					wxpay: "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAAXNSR0IArs4c6QAABC9JREFUeF7tWk1a20AMlUzv0bDr13AAYAOcpLCBcoqQU1DYEE6C2QAHIP26q3sPPOqniU2cZMYj+SeGxN5kEXlm9ObpjaQxwpY/uOX+Qw9Az4AtR6APgS0nQC+CfQi0FQLfrvcHXwAGPP4bQMK/fy5f7O9HehphwPfb/dOIogEhHQHBcamDCDESPoIxMQPTNSi1ABj+OrwDpNMaO5og4P2bMZOugFADwNTewWhU0/FVzAgnKZnxuoFQAbB3vX9MET7U2PHgq4R09vv8ZRI0bMhADMDw9uAhGN8NLQrWyAYRAGt1PgcRIU5TOms7JIIAdOL8nElJauikTRBKAdi7ObwioFFTzHaMw3mBzRV8DwKOXy+ertpagxcAq/YR/g2d6TlNrUDu4EiiE0Why4T1rgyINoXRC4DgjE+mF8+7RYAkp4RrRyVztRUKTgCkuz89fz4pAiB5z7WbklBrKxScAEgWxI6joZPXy5c4B0H0nkPdhzcHFIxxhHgZ8OA7AgMnAMObA479UnF6H5twQpF5RBMdibPDvB4AAAL6IZ0rNbTb9IngAyC8IwJ0K5okQBgzqFEKSV4wcXg17bxl8fIiJXFc0bHAgYLjYlHEFaZlVUQDoAIbcVZaN1VRrgAgUfImASiKW6Yh4pAohmHVQqpLABI0dMYiKhJPCeoV0ueuQsDmEJrkSeJ/bqNJnOqfApqVzWznzrdYWkvzhnUDYGnPKLTdV5gpfLiOqJUIaTefF8RKH6wxtAOX2IdA8NcCmmRItmBLfVF5jRBnR58kGQtWlGUJlBeAxpQ5A4eFKTu/ufLzPQv1f2mRRDiZ/nyyYwYrypI0OlQOc/9PsgshDsh2v+BUwTFnD3K5DglVlD4WlDZEsqywNgiK2F9gQBkLi7EtyV59WhBsiTURCjy5QZMgYRn9cxbZWgCQ+IKlnH2sFQYTURHmCYMgAJaKs9aYPkXNXGK6QhQdt9xeC4UhTC+eV/wVASASmrKj6IMA4NIBMQDsX1VN4IlbuU0K7vmiQS0G5EOpmiW6I1Dpjtp8pYc5yxYVj0RtXcMJcwDFSiqYLh2x+QgqAJwnAuEEydxbkZtdj+fKPVfwbPIq7KngqvMVX4WoAmDBAcH9HTMmXw23s0LJSlPOOsZx0l8VAu/0Fzjuc2Td3aY5zf1VoZgBvPgmvuhoIrFSMSXQThcDoJo0YLxGLfBSv5IINgVC1XxCOb/oZrkTBtRJqkQgKG6ROgPgPbGq/6HVIiYK51WngAj5ikbBhoZi3FALbHmozhlQXFChTc75g6wRM2ufzb9N/IwMcG0wg8HZJf9HBF/tFZnBBBH+cW/BpBDnd4XLDNJcon4oBiiY7jS194mEI0IaSz+12ygAclSYEcXvFsqA3UgANEzqAdCgtYm2PQM2cVc1PvUM0KC1ibY9AzZxVzU+bT0D/gPs/oxfcUEcJAAAAABJRU5ErkJggg==",
					alipay: "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAAXNSR0IArs4c6QAAA2FJREFUeF7tmU122jAQx2cMB2hp9yULeK+naHISwhJyiIRDBJaQkwRO0fdgEWff0h4ANH0yFc+m+hhbckKNvJUsaX76z4ckhAv/8MLthwggKuDCCUQXuHABxCAYXSC6wIUTiC7wFgL4MPveTaj9optrO+696ya8yeQRQFRAdIEYAxoVBD/PNtdCwHWpDIJwr+1PMCk1DgAkCSx/jHrLsv/p+lfKAp3HzQOYDAqxKtcYBJPtXe/B1Y3TXgmATGst0WIrgAC7JmBINOQsNN8HE0zfVQFlFxzrgFgHNLQOkNJuQ7vrcgkS1CXEua5fgnDj+l+172CX/h59Tbn9Of0qBUE1cGe2ngPhLWeiEH0krFDBT63HC8Cnx/VtFuFDfgl90UOldDvuX4WcSo7lBSD0YuR4H6ebZwRNkRUw9xdSah1G+IzZmW5IW7ERDX/e9Rc+YwerBEMvQo1nrhfqkf/ZuYCxxK5J/t4AjkFQBi71CXxFoFSWq2XTlkn+AndXodNf5SwgT4J7gnttoNL6BqUEmCZET/tkvzQZYj5g1Sf/0goIkfcJYIkEK5HsFnkYnen6BXQptUb5lwJgMz4zCihXD/BqAwVDuoy+Uqx399kACrkZaYECVjY5qxJZXpoQwrcDHB6UghfVvPssAMo35W4R7oZVg5EMmAJxUCZ2CNzfVJ2Pm6qdleDBNwFClaHZdRrQAEhWe25VSPCuAMo1tnQhdIzMNUixfDYBqAOGVQEKQB15OFMCwXPV3QsFww7g73E39Pudr/Gn0EyplQPXCkBF/5AKsBtPKRA+AdKAEx/0BhYLL9nHFkhZLiBvbkOcxFzG5wPtoe7gBUrrTiMttqO+8ebZCkAtWErs17jHvrrSLcj+lkCpKeV5g/ABIA05lqgVM4Er2nPhZgev7DHGnToLG+ALIC9budgWwoRzyuMUPlzj8waVBuELIFOB5iksi7xIKQh8PS4wu8/j+a3vBScbRAgABVfg5BZbH6SFgP0kVIl7UCjNja4RCkAGwecaPLDhp4yNsSYkADlp/mncdNLLu8fpud9XQK7//wERGoBrAefSfgRBsLI9pTtPg+diUNV1yLuJypVg1Un/p/8arwDXZkQALkJNb48KaPoOu+yLCnARanp7VEDTd9hlX1SAi1DT2/8AaakVXysj5qkAAAAASUVORK5CYII="
				} as UTSJSONObject,
				originalRroviders: ["wxpay", "alipay"] as Array<string>,
				currentProviders: ["wxpay", "alipay"] as Array<string>,
				openid: ""
			}
		},
		mounted() {


































			let insideData = {
				images: this.images as UTSJSONObject,
				originalRroviders: this.originalRroviders as Array<string>,
				currentProviders: this.currentProviders as Array<string>,
			} as UTSJSONObject;
			this.$emit("mounted", insideData);
		},
		methods: {
			// 发起支付 - 打开支付选项弹窗
			async open(options : UTSJSONObject) : Promise<void> {
				let provider = options['provider'] as string | null;
				if (provider != null && provider != "") {
					let providers : Array<string> = [];
					this.originalRroviders.map((item : string) => {
						if (provider == item) {
							providers.push(item);
						}
					});
					this.currentProviders = providers;
					options['provider'] = "";
				} else {
					this.currentProviders = JSON.parse(JSON.stringify(this.originalRroviders)) as Array<string>;
				}
				this.myOptions = options;
				if (this.currentProviders.length == 1) {
					this.createOrder({ provider: this.currentProviders[0] });
				} else {
					if (this.modeCom == "pc") {
						this._pcChooseProvider(this.currentProviders[0]);
					}
					this.openPopup("payPopup");
				}
			},
			createOrderByProvider(provider : string) {
				this.createOrder({
					provider
				})
			},
			// 创建支付
			async createOrder(data : UTSJSONObject) : Promise<void> {
				let options = this.myOptions;
				options['qr_code'] = false;
				options = objectAssign(options, data);
				if (options['provider'] == "appleiap") {
					// 苹果虚拟支付走特殊逻辑




					uni.showModal({
						title: "提示",
						content: "请在iOS系统中执行",
						showCancel: false
					})

				}

				if (options['provider'] == "wxpay") {








				}








				let createOrderData = {
					provider: options['provider'],
					total_fee: options.getNumber('total_fee'),
					order_no: options['order_no'],
					out_trade_no: options['out_trade_no'],
					description: options['description'],
					type: options['type'],
					qr_code: options.getBoolean('qr_code'),
					custom: options.getJSON('custom'),
					other: options.getJSON('other'),
					wxpay_virtual: options.getJSON('wxpay_virtual'), // 微信小程序虚拟支付需要
				} as UTSJSONObject;










				try {
					let res = await uniPayCo.createOrder(createOrderData);
					if (res['errCode'] == 0) {
						this.$emit("create", res);
						if (res['qr_code'] != null && res['qr_code'] == true && options.getBoolean('cancel_popup') != true) {
							this.orderRes = res;
							// 展示组件内置的二维码弹窗
							if (this.modeCom == "pc") {
								this.openPopup("payPopup");
								this._pcChooseProvider(options['provider'] as string);
							} else {
								this.openPopup("qrcodePopup");
							}
						} else {
							// 调起支付
							this.orderPayment(res);
						}
					} else {
						this.$emit("fail", res);
					}
				} catch (err) {
					this.$emit("fail", {
						errCode: -1,
						errMsg: (err as Error).message
					});
				}
			},
			// 调起支付
			orderPayment(res : UTSJSONObject) {
				this.orderRes = res;
				if (res['qr_code'] != null && res['qr_code'] != "") {
					this.$emit("qrcode", res);
				}




























				let _order = res.get('order');
				let orderStr = typeof _order == "string" ? _order as string : JSON.stringify(_order) as string;
				console.log('orderStr: ', orderStr)
				uni.requestPayment({
					provider: res['provider'] as string,
					orderInfo: orderStr,



					success: (res) => {
						console.log("requestPaymentSuccess", JSON.stringify(res))
						this._getOrder();
					},
					fail: (err) => {
						console.log("requestPaymentFail", JSON.stringify(err))
						let errCode = err.errCode;
						let errMsg = err.errMsg;
						if (errCode == 701110) {
							// 用户取消支付
							this.$emit("cancel", err);
						} else if (errMsg.indexOf("fail cancel") > -1) {
							// 用户取消支付
							this.$emit("cancel", err);
						} else {
							// 发起支付失败
							console.error("uni.requestPayment:fail", err);
							this.$emit("fail", {
								errCode: errCode,
								errMsg: errMsg
							});
						}
					}
				});

			},
			// 打开弹窗
			openPopup(name : string) {
				let popupRef = this.$refs[name] as UniPayPopupComponentPublicInstance;
				popupRef.open();
			},
			// 关闭弹窗
			closePopup(name : string) {
				let popupRef = this.$refs[name] as UniPayPopupComponentPublicInstance;
				popupRef.close();
			},
			// 查询订单（查询支付情况）
			async getOrder(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.getOrder(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 发起退款（此接口需要admin角色才可以访问）
			async refund(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.refund(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 查询退款（查询退款情况）
			async getRefund(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.getRefund(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 关闭订单
			async closeOrder(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.closeOrder(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 获取支持的支付供应商
			async getPayProviderFromCloud(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.getPayProviderFromCloud(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 获取支付配置内的appid（主要用于获取获取微信公众号的appid，用以获取code）
			async getProviderAppId(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.getProviderAppId(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 根据code获取openid
			async getOpenid(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.getOpenid(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 验证iosIap苹果内购支付凭据
			async verifyReceiptFromAppleiap(data : UTSJSONObject) : Promise<UTSJSONObject> {
				try {
					let res = await uniPayCo.verifyReceiptFromAppleiap(data);
					return res;
				} catch (err) {
					return {
						errCode: -1,
						errMsg: (err as Error).message
					} as UTSJSONObject
				}
			},
			// 支付成功后的逻辑
			paySuccess(res : UTSJSONObject) {
				this.closePopup("payPopup");
				this.closePopup("payConfirmPopup");
				this.clearQrcode();
				let toSuccessPage = this.toSuccessPage as boolean;
				if (toSuccessPage) {
					// 跳转到支付成功的内置页面
					this.pageToSuccess(res);
				}
				this.$emit("success", res);
			},
			pageToSuccess(res : UTSJSONObject) {
				let out_trade_no = res['out_trade_no'] as string;
				let pay_order = res.getJSON('pay_order') as UTSJSONObject;
				let order_no = pay_order['order_no'] as string;
				//let pay_date = pay_order['pay_date'];
				let total_fee = pay_order.getNumber('total_fee');
				if (total_fee == null) {
					total_fee = 0;
				}
				let returnUrl = this.returnUrl as string;
				let adpid = this.adpid as string;
				let mainColor = this.mainColor as string;

				if (this.modeCom != "pc") {
					uni.navigateTo({
						url: `/uni_modules/uni-pay-x/pages/success/success?out_trade_no=${out_trade_no}&order_no=${order_no}&total_fee=${total_fee}&adpid=${adpid}&return_url=${returnUrl}&main_color=${mainColor}`
					});
				} else {
					if (returnUrl != "") {
						let url = returnUrl + `?out_trade_no=${out_trade_no}&order_no=${order_no}`;
						if (url.indexOf("/") != 0) url = `/${url}`;
						uni.navigateTo({
							url
						});
					}
				}
			},
			// 监听 - 关闭二维码弹窗
			clearQrcode() {
				this.orderRes["codeUrl"] = "";
				this.orderRes["qr_code_image"] = "";
			},
			// 内部函数查询支付状态
			async _getOrder() : Promise<void> {
				let out_trade_no = this.orderRes["out_trade_no"] as string;
				let res = await this.getOrder({
					out_trade_no,
					await_notify: true
				});
				if (res['errCode'] == 0) {
					let has_paid = res.getBoolean('has_paid');
					if (has_paid != null && has_paid == true) {
						this.closePopup("qrcodePopup");
						this.paySuccess(res);
					}
				}
			},
			// 重新发起支付
			_afreshPayment() {
				this.orderPayment(this.orderRes);
			},
			// pc版弹窗选择支付方式
			_pcChooseProvider(provider : string) {
				let _provider : string = this.myOptions["provider"] as string;
				if (provider != _provider) {
					this.createOrder({ provider: provider })
				}
			},
			// 苹果虚拟支付支付逻辑
			async _appleiapCreateOrder(options : UTSJSONObject) : Promise<void>{

				uni.showToast({
					title: "请在iOS系统中打开",
					icon: "none"
				})

































































































































			},
			// 苹果虚拟支付未完成订单检测
			appleiapRestore() {




























































			},











		},
		watch: {

		},
		computed: {
			modeCom() : string {
				let mode = this.mode as string;
				if (mode != "") return mode;
        let systemInfo = uni.getDeviceInfo();
				return systemInfo.deviceType == "pc" ? "pc" : "mobile";
			},
			totalFeeCom() : number {
				let totalFee = this.myOptions.getNumber('total_fee');
				return totalFee != null ? totalFee : 0;
			}
		},
	})

export default __sfc__
function GenUniModulesUniPayXComponentsUniPayUniPayRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_uni_pay_popup = resolveEasyComponent("uni-pay-popup",_easycom_uni_pay_popup)

  return createElementVNode("view", utsMapOf({ class: "uni-pay" }), [
    _ctx.modeCom == 'pc'
      ? createVNode(_component_uni_pay_popup, utsMapOf({
          key: 0,
          ref: "payPopup",
          type: "center",
          "safe-area": false
        }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode("view", utsMapOf({ class: "pc-pay-popup" }), [
              createElementVNode("view", utsMapOf({ class: "pc-pay-popup-title" }), [
                createElementVNode("text", utsMapOf({ class: "text" }), "收银台")
              ]),
              createElementVNode("view", utsMapOf({ class: "pc-pay-popup-flex" }), [
                createElementVNode("view", utsMapOf({ class: "pc-pay-popup-qrcode-box" }), [
                  createElementVNode("image", utsMapOf({
                    class: "pc-pay-popup-qrcode-image",
                    src: _ctx.orderRes['qr_code_image']
                  }), null, 8 /* PROPS */, ["src"]),
                  createElementVNode("view", utsMapOf({ class: "pc-pay-popup-amount-box" }), [
                    createElementVNode("view", utsMapOf({ class: "pc-pay-popup-amount-tips" }), [
                      _ctx.orderRes['provider'] == 'wxpay'
                        ? createElementVNode("text", utsMapOf({
                            key: 0,
                            class: "text"
                          }), "微信扫一扫付款")
                        : _ctx.orderRes['provider'] == 'alipay'
                          ? createElementVNode("text", utsMapOf({
                              key: 1,
                              class: "text"
                            }), "支付宝扫一扫付款")
                          : createElementVNode("text", utsMapOf({
                              key: 2,
                              class: "text"
                            }), "扫一扫付款")
                    ]),
                    createElementVNode("view", utsMapOf({ class: "pc-pay-popup-amount" }), [
                      createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString((_ctx.totalFeeCom / 100).toFixed(2)), 1 /* TEXT */)
                    ])
                  ]),
                  isTrue(_ctx.orderRes['qr_code_image'])
                    ? createElementVNode("view", utsMapOf({
                        key: 0,
                        class: "pc-pay-popup-complete-button"
                      }), [
                        createElementVNode("button", utsMapOf({
                          type: "primary",
                          onClick: () => {_ctx._getOrder()}
                        }), "我已完成支付", 8 /* PROPS */, ["onClick"])
                      ])
                    : createCommentVNode("v-if", true)
                ]),
                createElementVNode("view", utsMapOf({ class: "pc-pay-popup-provider-list" }), [
                  _ctx.currentProviders.indexOf('wxpay') > -1
                    ? createElementVNode("view", utsMapOf({
                        key: 0,
                        class: normalizeClass(["pc-pay-popup-provider-item", _ctx.myOptions['provider'] == 'wxpay' ? 'active' : '']),
                        onClick: () => {_ctx._pcChooseProvider('wxpay')}
                      }), [
                        createElementVNode("image", utsMapOf({
                          src: _ctx.images['wxpay'],
                          class: "pc-pay-popup-provider-image"
                        }), null, 8 /* PROPS */, ["src"]),
                        createElementVNode("text", utsMapOf({ class: "pc-pay-popup-provider-text" }), "微信支付")
                      ], 10 /* CLASS, PROPS */, ["onClick"])
                    : createCommentVNode("v-if", true),
                  _ctx.currentProviders.indexOf('alipay') > -1
                    ? createElementVNode("view", utsMapOf({
                        key: 1,
                        class: normalizeClass(["pc-pay-popup-provider-item", _ctx.myOptions['provider'] == 'alipay' ? 'active' : '']),
                        onClick: () => {_ctx._pcChooseProvider('alipay')}
                      }), [
                        createElementVNode("image", utsMapOf({
                          src: _ctx.images['alipay'],
                          class: "pc-pay-popup-provider-image"
                        }), null, 8 /* PROPS */, ["src"]),
                        createElementVNode("text", utsMapOf({ class: "pc-pay-popup-provider-text" }), "支付宝支付")
                      ], 10 /* CLASS, PROPS */, ["onClick"])
                    : createCommentVNode("v-if", true),
                  createElementVNode("view", utsMapOf({ class: "pc-pay-popup-logo" }), [
                    createElementVNode("image", utsMapOf({
                      class: "image",
                      src: _ctx.logo,
                      mode: "widthFix"
                    }), null, 8 /* PROPS */, ["src"])
                  ])
                ])
              ])
            ])
          ]),
          _: 1 /* STABLE */
        }), 512 /* NEED_PATCH */)
      : createVNode(_component_uni_pay_popup, utsMapOf({
          key: 1,
          ref: "payPopup",
          type: "bottom",
          "safe-area": false
        }), utsMapOf({
          default: withSlotCtx((): any[] => [
            createElementVNode("view", utsMapOf({
              class: "mobile-pay-popup",
              style: normalizeStyle('min-height: '+_ctx.height+';')
            }), [
              createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-title" }), [
                createElementVNode("text", utsMapOf({ class: "text" }), "收银台")
              ]),
              createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-amount-box" }), [
                createElementVNode("view", null, [
                  createElementVNode("text", utsMapOf({ class: "text" }), "待支付金额：")
                ]),
                createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-amount" }), [
                  createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString((_ctx.totalFeeCom / 100).toFixed(2)), 1 /* TEXT */)
                ])
              ]),
              createElementVNode("view", utsMapOf({ class: "mobile-pay-popup-provider-list" }), [
                createElementVNode("view", utsMapOf({ class: "uni-list" }), [
                  _ctx.currentProviders.indexOf('wxpay') > -1
                    ? createElementVNode("view", utsMapOf({
                        key: 0,
                        class: "uni-list-item",
                        onClick: () => {_ctx.createOrderByProvider('wxpay')}
                      }), [
                        createElementVNode("view", utsMapOf({ class: "uni-list-item__container container--right" }), [
                          createElementVNode("view", utsMapOf({ class: "uni-list-item__header" }), [
                            createElementVNode("image", utsMapOf({
                              src: _ctx.images['wxpay'],
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
                  _ctx.currentProviders.indexOf('alipay') > -1
                    ? createElementVNode("view", utsMapOf({
                        key: 1,
                        class: "uni-list-item",
                        onClick: () => {_ctx.createOrderByProvider('alipay')}
                      }), [
                        createElementVNode("view", utsMapOf({ class: "uni-list-item__container container--right" }), [
                          createElementVNode("view", utsMapOf({ class: "uni-list-item__header" }), [
                            createElementVNode("image", utsMapOf({
                              src: _ctx.images['alipay'],
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
            ], 4 /* STYLE */)
          ]),
          _: 1 /* STABLE */
        }), 512 /* NEED_PATCH */),
    createVNode(_component_uni_pay_popup, utsMapOf({
      ref: "qrcodePopup",
      type: "center",
      "safe-area": false,
      animation: false,
      "mask-click": false,
      onClose: _ctx.clearQrcode
    }), utsMapOf({
      default: withSlotCtx((): any[] => [
        createElementVNode("view", utsMapOf({ class: "qrcode-popup-content" }), [
          createElementVNode("image", utsMapOf({
            src: _ctx.orderRes['qr_code_image'],
            class: "qrcode-image"
          }), null, 8 /* PROPS */, ["src"]),
          createElementVNode("view", utsMapOf({ class: "qrcode-popup-info" }), [
            createElementVNode("view", utsMapOf({ class: "qrcode-popup-info-fee-box" }), [
              createElementVNode("view", utsMapOf({ class: "qrcode-popup-info-fee" }), [
                createElementVNode("text", utsMapOf({ class: "text" }), toDisplayString((_ctx.totalFeeCom / 100).toFixed(2)), 1 /* TEXT */)
              ]),
              createElementVNode("view", utsMapOf({ class: "qrcode-popup-info-fee-unit" }), [
                createElementVNode("text", utsMapOf({ class: "text" }), "元")
              ])
            ]),
            _ctx.myOptions['provider'] == 'wxpay'
              ? createElementVNode("view", utsMapOf({ key: 0 }), [
                  createElementVNode("text", null, "请用微信扫码支付")
                ])
              : _ctx.myOptions['provider'] == 'alipay'
                ? createElementVNode("view", utsMapOf({ key: 1 }), [
                    createElementVNode("text", null, "请用支付宝扫码支付")
                  ])
                : createCommentVNode("v-if", true)
          ]),
          createElementVNode("button", utsMapOf({
            type: "primary",
            onClick: () => {_ctx._getOrder()},
            class: "qrcode-popup-btn-primary"
          }), "我已完成支付", 8 /* PROPS */, ["onClick"]),
          createElementVNode("view", utsMapOf({
            class: "qrcode-popup-cancel",
            onClick: () => {_ctx.closePopup('qrcodePopup')}
          }), [
            createElementVNode("text", utsMapOf({ class: "qrcode-popup-cancel-text" }), "暂不支付")
          ], 8 /* PROPS */, ["onClick"])
        ])
      ]),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["onClose"]),
    createVNode(_component_uni_pay_popup, utsMapOf({
      ref: "payConfirmPopup",
      type: "center",
      "safe-area": false,
      animation: false,
      "mask-click": false
    }), utsMapOf({
      default: withSlotCtx((): any[] => [
        createElementVNode("view", utsMapOf({ class: "pay-confirm-popup-content" }), [
          createElementVNode("view", utsMapOf({ class: "pay-confirm-popup-title" }), [
            createElementVNode("text", null, "请确认支付是否已完成")
          ]),
          createElementVNode("view", null, [
            createElementVNode("button", utsMapOf({
              type: "primary",
              onClick: () => {_ctx._getOrder()}
            }), "已完成支付", 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "pay-confirm-popup-refresh" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              onClick: () => {_ctx._afreshPayment()}
            }), "支付遇到问题，重新支付", 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({
            class: "pay-confirm-popup-cancel",
            onClick: () => {_ctx.closePopup('payConfirmPopup')}
          }), [
            createElementVNode("text", null, "暂不支付")
          ], 8 /* PROPS */, ["onClick"])
        ])
      ]),
      _: 1 /* STABLE */
    }), 512 /* NEED_PATCH */)
  ])
}
export type UniPayComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenUniModulesUniPayXComponentsUniPayUniPayStyles = [utsMapOf([["mobile-pay-popup", padStyleMapOf(utsMapOf([["width", "750rpx"], ["minHeight", "900rpx"], ["backgroundColor", "#f3f3f3"], ["borderTopLeftRadius", "30rpx"], ["borderTopRightRadius", "30rpx"], ["borderBottomRightRadius", 0], ["borderBottomLeftRadius", 0], ["overflow", "hidden"]]))], ["mobile-pay-popup-title", utsMapOf([[".mobile-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["paddingTop", "20rpx"], ["paddingRight", "20rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "20rpx"]])]])], ["text", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-title ", utsMapOf([["textAlign", "center"], ["fontWeight", "bold"], ["fontSize", "40rpx"]])], [".mobile-pay-popup .mobile-pay-popup-amount-box .mobile-pay-popup-amount ", utsMapOf([["color", "#e43d33"], ["fontSize", "60rpx"]])], [".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__content ", utsMapOf([["color", "#3b4144"], ["fontSize", "28rpx"]])], [".pc-pay-popup .pc-pay-popup-title ", utsMapOf([["textAlign", "center"], ["fontWeight", "bold"], ["fontSize", 20], ["lineHeight", "66px"]])], [".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box .pc-pay-popup-amount-box .pc-pay-popup-amount-tips ", utsMapOf([["textAlign", "center"], ["color", "#333333"], ["fontSize", 20]])], [".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box .pc-pay-popup-amount-box .pc-pay-popup-amount ", utsMapOf([["textAlign", "center"], ["color", "#dd524d"], ["fontWeight", "bold"], ["fontSize", 32]])], [".qrcode-popup-content .qrcode-popup-info .qrcode-popup-info-fee-box .qrcode-popup-info-fee ", utsMapOf([["color", "#FF0000"], ["fontSize", "60rpx"], ["fontWeight", "bold"], ["textAlign", "center"]])]])], ["mobile-pay-popup-amount-box", utsMapOf([[".mobile-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]])]])], ["mobile-pay-popup-amount", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-amount-box ", utsMapOf([["marginTop", "20rpx"]])]])], ["mobile-pay-popup-provider-list", utsMapOf([[".mobile-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["marginTop", "20rpx"]])]])], ["uni-list", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list ", utsMapOf([["display", "flex"], ["backgroundColor", "#ffffff"], ["position", "relative"], ["flexDirection", "column"]])]])], ["uni-list-item", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list ", utsMapOf([["display", "flex"], ["position", "relative"], ["justifyContent", "space-between"], ["alignItems", "center"], ["backgroundColor", "#ffffff"], ["flexDirection", "row"], ["borderBottomWidth", "2rpx"], ["borderBottomStyle", "solid"], ["borderBottomColor", "#f8f8f8"], ["backgroundColor:hover", "#f1f1f1"]])]])], ["uni-list-item__container", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["position", "relative"], ["display", "flex"], ["flexDirection", "row"], ["paddingTop", 12], ["paddingRight", 15], ["paddingBottom", 12], ["paddingLeft", 15], ["flex", 1], ["overflow", "hidden"]])]])], ["uni-list-item__header", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container ", utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"]])]])], ["image", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item .uni-list-item__container .uni-list-item__header ", utsMapOf([["width", "52rpx"], ["height", "52rpx"], ["marginRight", "18rpx"]])], [".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list .pc-pay-popup-logo ", utsMapOf([["width", 120]])]])], ["container--right", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["paddingRight", 0]])]])], ["uni-list-item__content", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["display", "flex"], ["paddingRight", 8], ["flex", 1], ["flexDirection", "column"], ["justifyContent", "space-between"], ["overflow", "hidden"]])]])], ["uni-list-item__content--center", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["justifyContent", "center"]])]])], ["arrowright", utsMapOf([[".mobile-pay-popup .mobile-pay-popup-provider-list .uni-list .uni-list-item ", utsMapOf([["borderTopWidth", "2rpx"], ["borderTopStyle", "solid"], ["borderTopColor", "#bbbbbb"], ["borderRightWidth", "2rpx"], ["borderRightStyle", "solid"], ["borderRightColor", "#bbbbbb"], ["width", "16rpx"], ["height", "16rpx"], ["marginRight", "30rpx"], ["transform", "rotate(45deg)"]])]])], ["pc-pay-popup", padStyleMapOf(utsMapOf([["width", 800], ["height", 600], ["backgroundColor", "#f3f3f3"], ["borderRadius", 10], ["overflow", "hidden"]]))], ["pc-pay-popup-title", utsMapOf([[".pc-pay-popup ", utsMapOf([["backgroundColor", "#ffffff"], ["height", 66]])]])], ["pc-pay-popup-flex", utsMapOf([[".pc-pay-popup ", utsMapOf([["width", "100%"], ["display", "flex"], ["flexDirection", "row"]])]])], ["pc-pay-popup-qrcode-box", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex ", utsMapOf([["height", 534], ["flex", 1], ["backgroundColor", "#ffffff"], ["display", "flex"], ["flexDirection", "column"], ["justifyContent", "center"], ["alignItems", "center"]])]])], ["pc-pay-popup-qrcode-image", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box ", utsMapOf([["width", 225], ["height", 225]])]])], ["pc-pay-popup-amount-tips", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box .pc-pay-popup-amount-box ", utsMapOf([["marginTop", 20]])]])], ["pc-pay-popup-amount", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box .pc-pay-popup-amount-box ", utsMapOf([["marginTop", 20]])]])], ["pc-pay-popup-complete-button", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-qrcode-box ", utsMapOf([["marginTop", 20]])]])], ["pc-pay-popup-provider-list", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex ", utsMapOf([["width", 300], ["display", "flex"], ["flexDirection", "column"]])]])], ["pc-pay-popup-provider-item", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list ", utsMapOf([["paddingTop", 20], ["paddingRight", 20], ["paddingBottom", 20], ["paddingLeft", 20], ["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["backgroundColor:hover", "#ffffff"]])], [".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list .active", utsMapOf([["backgroundColor", "#ffffff"]])]])], ["pc-pay-popup-provider-image", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list .pc-pay-popup-provider-item ", utsMapOf([["width", 60], ["height", 60]])]])], ["pc-pay-popup-provider-text", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list .pc-pay-popup-provider-item ", utsMapOf([["color", "#333333"], ["fontSize", 20], ["marginLeft", 10]])]])], ["pc-pay-popup-logo", utsMapOf([[".pc-pay-popup .pc-pay-popup-flex .pc-pay-popup-provider-list ", utsMapOf([["flex", 1], ["display", "flex"], ["flexDirection", "row"], ["alignItems", "center"], ["justifyContent", "center"]])]])], ["qrcode-popup-content", padStyleMapOf(utsMapOf([["width", "600rpx"], ["backgroundColor", "#ffffff"], ["borderRadius", "10rpx"], ["paddingTop", "40rpx"], ["paddingRight", "40rpx"], ["paddingBottom", "40rpx"], ["paddingLeft", "40rpx"], ["boxSizing", "border-box"], ["textAlign", "center"], ["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"], ["justifyContent", "center"]]))], ["qrcode-image", utsMapOf([[".qrcode-popup-content ", utsMapOf([["width", "450rpx"], ["height", "450rpx"]])]])], ["qrcode-popup-info", utsMapOf([[".qrcode-popup-content ", utsMapOf([["paddingTop", "20rpx"], ["paddingRight", "20rpx"], ["paddingBottom", "20rpx"], ["paddingLeft", "20rpx"], ["display", "flex"], ["flexDirection", "column"], ["alignItems", "center"]])]])], ["qrcode-popup-info-fee-box", utsMapOf([[".qrcode-popup-content .qrcode-popup-info ", utsMapOf([["display", "flex"], ["flexDirection", "row"], ["marginBottom", "6rpx"]])]])], ["qrcode-popup-info-fee-unit", utsMapOf([[".qrcode-popup-content .qrcode-popup-info .qrcode-popup-info-fee-box ", utsMapOf([["display", "flex"], ["flexDirection", "row"], ["alignItems", "flex-end"], ["paddingBottom", "10rpx"]])]])], ["qrcode-popup-btn-primary", utsMapOf([[".qrcode-popup-content ", utsMapOf([["width", "520rpx"]])]])], ["qrcode-popup-cancel", utsMapOf([[".qrcode-popup-content ", utsMapOf([["marginTop", "20rpx"], ["width", "520rpx"]])]])], ["qrcode-popup-cancel-text", utsMapOf([[".qrcode-popup-content .qrcode-popup-cancel ", utsMapOf([["textAlign", "center"]])]])], ["pay-confirm-popup-content", padStyleMapOf(utsMapOf([["width", "550rpx"], ["backgroundColor", "#ffffff"], ["borderRadius", "10rpx"], ["paddingTop", "40rpx"], ["paddingRight", "40rpx"], ["paddingBottom", "40rpx"], ["paddingLeft", "40rpx"]]))], ["pay-confirm-popup-title", utsMapOf([[".pay-confirm-popup-content ", utsMapOf([["textAlign", "center"], ["paddingTop", "20rpx"], ["paddingRight", 0], ["paddingBottom", "20rpx"], ["paddingLeft", 0], ["marginBottom", "30rpx"]])]])], ["pay-confirm-popup-refresh", utsMapOf([[".pay-confirm-popup-content ", utsMapOf([["marginTop", "20rpx"]])]])], ["pay-confirm-popup-cancel", utsMapOf([[".pay-confirm-popup-content ", utsMapOf([["marginTop", "20rpx"], ["textAlign", "center"]])]])]])]

import _easycom_uni_pay_popup from '@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue'

import { UniPayPopupComponentPublicInstance  } from "@/uni_modules/uni-pay-x/components/uni-pay-popup/uni-pay-popup.uvue"