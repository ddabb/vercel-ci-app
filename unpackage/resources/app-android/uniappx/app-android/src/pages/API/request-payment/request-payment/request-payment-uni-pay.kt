@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIFB90797;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLoad(fun(_: OnLoadOptions) {
            stat_instance.onLoad(this);
        }
        , __ins);
        onPageShow(fun() {
            stat_instance.onShow(this);
        }
        , __ins);
        onPageHide(fun() {
            stat_instance.onHide(this);
        }
        , __ins);
        onUnload(fun() {
            stat_instance.onUnload(this);
        }
        , __ins);
        onLoad(fun(options: OnLoadOptions) {
            console.log("onLoad: ", options);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_uni_pay_popup = resolveEasyComponent("uni-pay-popup", GenUniModulesUniPayXComponentsUniPayPopupUniPayPopupClass);
        val _component_uni_pay = resolveEasyComponent("uni-pay", GenUniModulesUniPayXComponentsUniPayUniPayClass);
        return createElementVNode("view", utsMapOf("class" to "app"), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "label"), "支付单号："),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("input", utsMapOf("class" to "input", "modelValue" to _ctx.out_trade_no, "onInput" to fun(`$event`: InputEvent){
                        _ctx.out_trade_no = `$event`.detail.value;
                    }
                    , "placeholder" to "点击发起支付会自动生成"), null, 40, utsArrayOf(
                        "modelValue",
                        "onInput"
                    ))
                ))
            )),
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "label"), "支付金额（单位分，100=1元）："),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("input", utsMapOf("class" to "input", "modelValue" to _ctx.total_fee, "onInput" to fun(`$event`: InputEvent){
                        _ctx.total_fee = looseToNumber(`$event`.detail.value);
                    }
                    ), null, 40, utsArrayOf(
                        "modelValue",
                        "onInput"
                    ))
                ))
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.open();
            }
            ), "打开收银台（弹窗模式）", 8, utsArrayOf(
                "onClick"
            )),
            if (isTrue(!_ctx.isPcCom)) {
                createElementVNode("view", utsMapOf("key" to 0), utsArrayOf(
                    createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.toPayDesk), "打开收银台（新页面模式）", 8, utsArrayOf(
                        "onClick"
                    ))
                ));
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.createOrder("wxpay");
            }
            ), "发起支付（微信）", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.createOrder("alipay");
            }
            ), "发起支付（支付宝）", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.createQRcode("alipay");
            }
            ), "APP扫码支付（支付宝）", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.getOrderPopup(true);
            }
            ), "查询支付状态", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to fun(){
                _ctx.pageTo("/uni_modules/uni-pay-x/pages/success/success?out_trade_no=test2024030501-1&order_no=test2024030501&total_fee=1&adpid=1000000001&return_url=/pages/API/request-payment/request-payment/order-detail");
            }
            ), "支付成功页面示例", 8, utsArrayOf(
                "onClick"
            )),
            createVNode(_component_uni_pay_popup, utsMapOf("ref" to "getOrderPopupRef", "type" to "center"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createElementVNode("scroll-view", utsMapOf("direction" to "vertical", "class" to "get-order-popup"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "label"), "插件支付单号："),
                        createElementVNode("view", utsMapOf("class" to "mt20"), utsArrayOf(
                            createElementVNode("input", utsMapOf("class" to "input pd2030", "modelValue" to _ctx.out_trade_no, "onInput" to fun(`$event`: InputEvent){
                                _ctx.out_trade_no = `$event`.detail.value;
                            }
                            , "placeholder" to "请输入"), null, 40, utsArrayOf(
                                "modelValue",
                                "onInput"
                            )),
                            createElementVNode("view", null, utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "tips"), "插件支付单号和第三方交易单号2选1填即可")
                            ))
                        )),
                        createElementVNode("view", utsMapOf("class" to "label"), "第三方交易单号："),
                        createElementVNode("view", utsMapOf("class" to "mt20"), utsArrayOf(
                            createElementVNode("input", utsMapOf("class" to "input pd2030", "modelValue" to _ctx.transaction_id, "onInput" to fun(`$event`: InputEvent){
                                _ctx.transaction_id = `$event`.detail.value;
                            }
                            , "placeholder" to "请输入"), null, 40, utsArrayOf(
                                "modelValue",
                                "onInput"
                            )),
                            createElementVNode("view", utsMapOf("class" to "tips"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "tips"), "可从支付宝账单（订单号）、微信账单（交易单号）中复制")
                            ))
                        )),
                        createElementVNode("view", utsMapOf("class" to "mt20"), utsArrayOf(
                            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.getOrder), "查询支付状态", 8, utsArrayOf(
                                "onClick"
                            ))
                        )),
                        if (isTrue(_ctx.getOrderRes["transaction_id"])) {
                            createElementVNode("view", utsMapOf("key" to 0, "class" to "mt20"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "table"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "订单描述")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(_ctx.getOrderRes["description"]), 1)
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "支付金额")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(_ctx.amountFormat(_ctx.getOrderRes.getNumber("total_fee"))), 1)
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "支付方式")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(_ctx.providerFormat(_ctx.getOrderRes["provider"] as String)), 1)
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "第三方交易单号")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(_ctx.getOrderRes["transaction_id"]), 1)
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "插件支付单号")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(_ctx.getOrderRes["out_trade_no"]), 1)
                                        ))
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "table-tr"), utsArrayOf(
                                        createElementVNode("view", utsMapOf("class" to "table-td label"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-left"), "回调状态")
                                        )),
                                        createElementVNode("view", utsMapOf("class" to "table-td"), utsArrayOf(
                                            createElementVNode("text", utsMapOf("class" to "text align-right"), toDisplayString(if (_ctx.getOrderRes.getBoolean("user_order_success") != null && _ctx.getOrderRes.getBoolean("user_order_success") == true) {
                                                "成功";
                                            } else {
                                                "异常";
                                            }), 1)
                                        ))
                                    ))
                                ))
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    ))
                );
            }
            ), "_" to 1), 512),
            createVNode(_component_uni_pay, utsMapOf("ref" to "payRef", "adpid" to _ctx.adpid, "height" to "900rpx", "return-url" to "/pages/API/request-payment/request-payment/order-detail", "logo" to "/static/logo.png", "onSuccess" to _ctx.onSuccess, "onCreate" to _ctx.onCreate, "onFail" to _ctx.onFail, "onCancel" to _ctx.onCancel), null, 8, utsArrayOf(
                "adpid",
                "onSuccess",
                "onCreate",
                "onFail",
                "onCancel"
            ))
        ));
    }
    open var total_fee: Number by `$data`;
    open var order_no: String by `$data`;
    open var out_trade_no: String by `$data`;
    open var description: String by `$data`;
    open var type: String by `$data`;
    open var openid: String by `$data`;
    open var custom: UTSJSONObject by `$data`;
    open var adpid: String by `$data`;
    open var transaction_id: String by `$data`;
    open var getOrderRes: UTSJSONObject by `$data`;
    open var h5Env: String by `$data`;
    open var isIosAppCom: Boolean by `$data`;
    open var isPcCom: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("total_fee" to 1, "order_no" to "", "out_trade_no" to "", "description" to "测试订单", "type" to "test", "openid" to "", "custom" to object : UTSJSONObject() {
            var a = "a"
            var b: Number = 1
        }, "adpid" to "1000000001", "transaction_id" to "", "getOrderRes" to UTSJSONObject(), "h5Env" to computed<String>(fun(): String {
            return "";
        }
        ), "isIosAppCom" to computed<Boolean>(fun(): Boolean {
            var info = uni_getSystemInfoSync();
            return if (info.uniPlatform == "app" && info.osName == "ios") {
                true;
            } else {
                false;
            }
            ;
        }
        ), "isPcCom" to computed<Boolean>(fun(): Boolean {
            var isPC = false;
            return isPC;
        }
        ));
    }
    override fun `$initMethods`() {
        this.open = fun() {
            this.order_no = "test" + Date.now();
            this.out_trade_no = "" + this.order_no + "-1";
            val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
            payInstance.open(let {
                object : UTSJSONObject() {
                    var total_fee = it.total_fee
                    var order_no = it.order_no
                    var out_trade_no = it.out_trade_no
                    var description = it.description
                    var type = it.type
                    var openid = it.openid
                    var custom = it.custom
                }
            });
        }
        ;
        this.createOrder = fun(provider: String) {
            this.order_no = "test" + Date.now();
            this.out_trade_no = "" + this.order_no + "-1";
            val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
            payInstance.createOrder(let {
                object : UTSJSONObject() {
                    var provider = provider
                    var total_fee = it.total_fee
                    var order_no = it.order_no
                    var out_trade_no = it.out_trade_no
                    var description = it.description
                    var type = it.type
                    var openid = it.openid
                    var custom = it.custom
                }
            });
        }
        ;
        this.createQRcode = fun(provider: String) {
            this.order_no = "test" + Date.now();
            this.out_trade_no = "" + this.order_no + "-1";
            val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
            payInstance.createOrder(let {
                object : UTSJSONObject() {
                    var provider = provider
                    var total_fee = it.total_fee
                    var order_no = it.order_no
                    var out_trade_no = it.out_trade_no
                    var description = it.description
                    var type = it.type
                    var qr_code = true
                    var openid = it.openid
                    var custom = it.custom
                }
            });
        }
        ;
        this.toPayDesk = fun() {
            this.order_no = "test" + Date.now();
            this.out_trade_no = "" + this.order_no + "-1";
            var options: UTSJSONObject = let {
                object : UTSJSONObject() {
                    var total_fee = it.total_fee
                    var order_no = it.order_no
                    var out_trade_no = it.out_trade_no
                    var description = it.description
                    var type = it.type
                    var openid = it.openid
                    var custom = it.custom
                }
            };
            var optionsStr = encodeURI(JSON.stringify(options));
            uni_navigateTo(NavigateToOptions(url = "/uni_modules/uni-pay-x/pages/pay-desk/pay-desk?options=" + optionsStr));
        }
        ;
        this.getOrderPopup = fun(key: Boolean) {
            val getOrderPopupInstance = this.`$refs`["getOrderPopupRef"] as UniPayPopupComponentPublicInstance;
            if (key) {
                getOrderPopupInstance.open();
            } else {
                getOrderPopupInstance.close();
            }
        }
        ;
        this.getOrder = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    this.getOrderRes = UTSJSONObject();
                    val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
                    var getOrderData: UTSJSONObject = object : UTSJSONObject() {
                        var await_notify = true
                    };
                    if (this.transaction_id != "") {
                        getOrderData["transaction_id"] = this.transaction_id;
                    } else if (this.out_trade_no != "") {
                        getOrderData["out_trade_no"] = this.out_trade_no;
                    }
                    var res = await(payInstance.getOrder(getOrderData));
                    if (res["errCode"] == 0) {
                        this.getOrderRes = res.getJSON("pay_order") as UTSJSONObject;
                        var obj: UTSJSONObject = object : UTSJSONObject() {
                            var `-1` = "已关闭"
                            var `1` = "已支付"
                            var `0` = "未支付"
                            var `2` = "已部分退款"
                            var `3` = "已全额退款"
                        };
                        var status = res["status"] as Number;
                        var statusStr = status + "";
                        var title = obj[statusStr] as String;
                        uni_showToast(ShowToastOptions(title = title, icon = "none"));
                    }
            });
        }
        ;
        this.refund = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
                    var res = await(payInstance.refund(let {
                        object : UTSJSONObject() {
                            var out_trade_no = it.out_trade_no
                        }
                    }));
                    if (res["errCode"] == 0) {
                        uni_showToast(ShowToastOptions(title = res["errMsg"] as String, icon = "none"));
                    }
            });
        }
        ;
        this.getRefund = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
                    var res = await(payInstance.getRefund(let {
                        object : UTSJSONObject() {
                            var out_trade_no = it.out_trade_no
                        }
                    }));
                    if (res["errCode"] == 0) {
                        uni_showModal(ShowModalOptions(content = res["errMsg"] as String, showCancel = false));
                    }
            });
        }
        ;
        this.closeOrder = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val payInstance = this.`$refs`["payRef"] as UniPayComponentPublicInstance;
                    var res = await(payInstance.closeOrder(let {
                        object : UTSJSONObject() {
                            var out_trade_no = it.out_trade_no
                        }
                    }));
                    if (res["errCode"] == 0) {
                        uni_showModal(ShowModalOptions(content = res["errMsg"] as String, showCancel = false));
                    }
            });
        }
        ;
        this.onCreate = fun(res: UTSJSONObject) {
            console.log("create: ", res);
        }
        ;
        this.onSuccess = fun(res: UTSJSONObject) {
            console.log("success: ", res);
            var user_order_success = res.getBoolean("user_order_success");
            if (user_order_success != null && user_order_success != true) {
            }
        }
        ;
        this.onFail = fun(err: UTSJSONObject) {
            console.log("fail: ", err);
        }
        ;
        this.onCancel = fun(err: UTSJSONObject) {
            console.log("cancel: ", err);
        }
        ;
        this.pageTo = fun(url: String) {
            uni_navigateTo(NavigateToOptions(url = url));
        }
        ;
        this.providerFormat = fun(provider: String?): String {
            if (provider == null) {
                return "";
            }
            var providerObj: UTSJSONObject = object : UTSJSONObject() {
                var wxpay = "微信支付"
                var alipay = "支付宝支付"
                var appleiap = "ios内购"
            };
            var providerStr = providerObj[provider] as String;
            return providerStr;
        }
        ;
        this.amountFormat = fun(totalFee: Number?): String {
            if (totalFee == null) {
                return "0";
            } else {
                return (totalFee / 100).toFixed(2);
            }
        }
        ;
    }
    open lateinit var open: () -> Unit;
    open lateinit var createOrder: (provider: String) -> Unit;
    open lateinit var createQRcode: (provider: String) -> Unit;
    open lateinit var toPayDesk: () -> Unit;
    open lateinit var getOrderPopup: (key: Boolean) -> Unit;
    open lateinit var getOrder: () -> UTSPromise<Unit>;
    open lateinit var refund: () -> UTSPromise<Unit>;
    open lateinit var getRefund: () -> UTSPromise<Unit>;
    open lateinit var closeOrder: () -> UTSPromise<Unit>;
    open lateinit var onCreate: (res: UTSJSONObject) -> Unit;
    open lateinit var onSuccess: (res: UTSJSONObject) -> Unit;
    open lateinit var onFail: (err: UTSJSONObject) -> Unit;
    open lateinit var onCancel: (err: UTSJSONObject) -> Unit;
    open lateinit var pageTo: (url: String) -> Unit;
    open lateinit var providerFormat: (provider: String?) -> String;
    open lateinit var amountFormat: (totalFee: Number?) -> String;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ), utsArrayOf(
                GenApp.styles
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("app" to padStyleMapOf(utsMapOf("paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx")), "input" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#f3f3f3", "paddingTop" to "10rpx", "paddingRight" to "10rpx", "paddingBottom" to "10rpx", "paddingLeft" to "10rpx", "width" to "100%", "boxSizing" to "border-box", "height" to "80rpx", "backgroundImage" to "none", "backgroundColor" to "#FFFFFF")), "button" to padStyleMapOf(utsMapOf("marginTop" to "20rpx")), "label" to utsMapOf("" to utsMapOf("marginTop" to "10rpx", "marginRight" to 0, "marginBottom" to "10rpx", "marginLeft" to 0), ".table " to utsMapOf("width" to "180rpx")), "tips" to padStyleMapOf(utsMapOf("marginTop" to "20rpx", "marginRight" to 0, "marginBottom" to "20rpx", "marginLeft" to 0, "fontSize" to "24rpx", "color" to "#565656")), "get-order-popup" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff", "paddingTop" to "30rpx", "paddingRight" to "30rpx", "paddingBottom" to "30rpx", "paddingLeft" to "30rpx", "height" to "900rpx", "borderRadius" to "20rpx", "width" to "690rpx")), "mt20" to padStyleMapOf(utsMapOf("marginTop" to "20rpx")), "pd2030" to padStyleMapOf(utsMapOf("paddingTop" to "20rpx", "paddingRight" to "30rpx", "paddingBottom" to "20rpx", "paddingLeft" to "30rpx")), "table-tr" to utsMapOf(".table " to utsMapOf("display" to "flex", "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center", "paddingTop" to "10rpx", "paddingRight" to 0, "paddingBottom" to "10rpx", "paddingLeft" to 0)), "table-td" to utsMapOf(".table " to utsMapOf("flex" to 1)), "align-left" to utsMapOf(".table " to utsMapOf("textAlign" to "left")), "align-right" to utsMapOf(".table " to utsMapOf("textAlign" to "right")), "text" to utsMapOf(".table " to utsMapOf("fontSize" to "24rpx")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
