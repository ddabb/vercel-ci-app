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
import io.dcloud.uniapp.extapi.closeSocket as uni_closeSocket;
import io.dcloud.uniapp.extapi.connectSocket as uni_connectSocket;
import io.dcloud.uniapp.extapi.getDeviceInfo as uni_getDeviceInfo;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.onSocketClose as uni_onSocketClose;
import io.dcloud.uniapp.extapi.onSocketError as uni_onSocketError;
import io.dcloud.uniapp.extapi.onSocketMessage as uni_onSocketMessage;
import io.dcloud.uniapp.extapi.onSocketOpen as uni_onSocketOpen;
import io.dcloud.uniapp.extapi.sendSocketMessage as uni_sendSocketMessage;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIWebsocketWebsocket : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            this.platform = uni_getDeviceInfo(null).platform as String;
        }
        , __ins);
        onUnload(fun() {
            uni_closeSocket(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
                console.log("uni.closeSocket success", res);
            }
            , fail = fun(err: Any){
                console.log("uni.closeSocket fail", err);
            }
            ));
            uni_hideLoading();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "websocket通讯示例")),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "websocket-msg"), toDisplayString(_ctx.showMsg), 1),
                    createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.connect), " 连接websocket服务 ", 8, utsArrayOf(
                        "onClick"
                    )),
                    withDirectives(createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.send), " 发送一条消息 ", 8, utsArrayOf(
                        "onClick"
                    )), utsArrayOf(
                        utsArrayOf(
                            vShow,
                            _ctx.connected
                        )
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.close), " 断开websocket服务 ", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("text", utsMapOf("class" to "websocket-tips"), "发送消息后会收到一条服务器返回的消息（与发送的消息内容一致）"),
                    createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "primary", "onClick" to _ctx.goSocketTask), " 跳转 socketTask 示例 ", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            ))
        ), 64);
    }
    open var connected: Boolean by `$data`;
    open var connecting: Boolean by `$data`;
    open var msg: String by `$data`;
    open var roomId: String by `$data`;
    open var platform: String by `$data`;
    open var showMsg: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("connected" to false, "connecting" to false, "msg" to "", "roomId" to "", "platform" to "", "showMsg" to computed<String>(fun(): String {
            if (this.connected) {
                if (this.msg.length > 0) {
                    return "收到消息：" + this.msg;
                } else {
                    return "等待接收消息";
                }
            } else {
                return "尚未连接";
            }
        }
        ));
    }
    override fun `$initMethods`() {
        this.connect = fun() {
            if (this.connected || this.connecting) {
                uni_showModal(ShowModalOptions(content = "正在连接或者已经连接，请勿重复连接", showCancel = false));
                return;
            }
            this.connecting = true;
            uni_showLoading(ShowLoadingOptions(title = "连接中..."));
            uni_connectSocket(ConnectSocketOptions(url = "ws://websocket.dcloud.net.cn", header = null, protocols = null, success = fun(res: Any){
                console.log("uni.connectSocket success", res);
            }
            , fail = fun(err: Any){
                console.log("uni.connectSocket fail", err);
            }
            ));
            uni_onSocketOpen(fun(res){
                this.connecting = false;
                this.connected = true;
                uni_hideLoading();
                uni_showToast(ShowToastOptions(icon = "none", title = "连接成功"));
                console.log("onOpen", res);
            }
            );
            uni_onSocketError(fun(err){
                this.connecting = false;
                this.connected = false;
                uni_hideLoading();
                uni_showModal(ShowModalOptions(content = "连接失败，可能是websocket服务不可用，请稍后再试", showCancel = false));
                console.log("onError", err);
            }
            );
            uni_onSocketMessage(fun(res){
                this.msg = res.data as String;
                console.log("onMessage", res);
            }
            );
            uni_onSocketClose(fun(res){
                this.connected = false;
                this.msg = "";
                console.log("onClose", res);
            }
            );
        }
        ;
        this.send = fun() {
            uni_sendSocketMessage(SendSocketMessageOptions(data = "from " + this.platform + " : " + parseInt((Math.random() * 10000).toString(10)).toString(10), success = fun(res: Any){
                console.log(res);
            }
            , fail = fun(err: Any){
                console.log(err);
            }
            ));
        }
        ;
        this.close = fun() {
            uni_closeSocket(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
                console.log("uni.closeSocket success", res);
            }
            , fail = fun(err: Any){
                console.log("uni.closeSocket fail", err);
            }
            ));
        }
        ;
        this.goSocketTask = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/websocket/socketTask"));
        }
        ;
    }
    open lateinit var connect: () -> Unit;
    open lateinit var send: () -> Unit;
    open lateinit var close: () -> Unit;
    open lateinit var goSocketTask: () -> Unit;
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
                return utsMapOf("uni-btn-v" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "marginTop" to 10, "marginRight" to 0, "marginBottom" to 10, "marginLeft" to 0)), "websocket-msg" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingRight" to 0, "paddingBottom" to 40, "paddingLeft" to 0, "textAlign" to "center", "fontSize" to 14, "lineHeight" to "40px", "color" to "#666666")), "websocket-tips" to padStyleMapOf(utsMapOf("paddingTop" to 40, "paddingRight" to 0, "paddingBottom" to 40, "paddingLeft" to 0, "textAlign" to "center", "fontSize" to 14, "lineHeight" to "24px", "color" to "#666666")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
