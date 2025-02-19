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
import io.dcloud.uniapp.extapi.connectSocket as uni_connectSocket;
import io.dcloud.uniapp.extapi.getDeviceInfo as uni_getDeviceInfo;
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIWebsocketSocketTask : BasePage {
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
            uni_hideLoading();
            var task = this.socketTask;
            if (task != null) {
                task.close(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
                    console.log("uni.closeSocket success", res);
                }
                , fail = fun(err: Any){
                    console.log("uni.closeSocket fail", err);
                }
                ));
            }
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
                    createElementVNode("text", utsMapOf("class" to "websocket-tips"), "发送消息后会收到一条服务器返回的消息（与发送的消息内容一致）")
                ))
            ))
        ), 64);
    }
    open var connected: Boolean by `$data`;
    open var connecting: Boolean by `$data`;
    open var socketTask: SocketTask? by `$data`;
    open var msg: String by `$data`;
    open var platform: String by `$data`;
    open var jest_result: Number by `$data`;
    open var showMsg: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("connected" to false, "connecting" to false, "socketTask" to null as SocketTask?, "msg" to "", "platform" to "", "jest_result" to 0, "showMsg" to computed<String>(fun(): String {
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
            this.socketTask = uni_connectSocket(ConnectSocketOptions(url = "ws://websocket.dcloud.net.cn", success = fun(res: Any){
                console.log("uni.connectSocket success", res);
            }
            , fail = fun(err: Any){
                console.log("uni.connectSocket fail", err);
            }
            ));
            this.socketTask?.onOpen(fun(res: Any){
                this.connecting = false;
                this.connected = true;
                uni_hideLoading();
                uni_showToast(ShowToastOptions(icon = "none", title = "连接成功"));
                console.log("onOpen", res);
            }
            );
            this.socketTask?.onError(fun(err: Any){
                this.connecting = false;
                this.connected = false;
                uni_hideLoading();
                uni_showModal(ShowModalOptions(content = "连接失败，可能是websocket服务不可用，请稍后再试", showCancel = false));
                console.log("onError", err);
            }
            );
            this.socketTask?.onMessage(fun(res: OnSocketMessageCallbackResult){
                this.msg = res.data as String;
                console.log("onMessage", res);
            }
            );
            this.socketTask?.onClose(fun(res: Any){
                this.connected = false;
                this.socketTask = null;
                this.msg = "";
                console.log("onClose", res);
            }
            );
        }
        ;
        this.send = fun() {
            val data = "from " + this.platform + " : " + parseInt(Math.random() * 10000 + "").toString(10);
            this.socketTask?.send(SendSocketMessageOptions(data = data, success = fun(res: Any){
                console.log(res);
            }
            , fail = fun(err: Any){
                console.log(err);
            }
            ));
        }
        ;
        this.close = fun() {
            this.socketTask?.close(CloseSocketOptions(code = 1000, reason = "close reason from client", success = fun(res: Any){
                console.log("uni.closeSocket success", res);
            }
            , fail = fun(err: Any){
                console.log("uni.closeSocket fail", err);
            }
            ));
        }
        ;
        this.jest_connectSocket = fun() {
            this.socketTask = uni_connectSocket(ConnectSocketOptions(url = "ws://websocket.dcloud.net.cn", success = fun(_){
                this.jest_result++;
            }
            , fail = fun(_){
                this.jest_result = 0;
            }
            ));
            this.socketTask?.onOpen(fun(_){
                val data = "from " + this.platform + " : " + parseInt(Math.random() * 10000 + "").toString(10);
                this.socketTask?.send(SendSocketMessageOptions(data = data, success = fun(_){
                    this.jest_result++;
                }
                , fail = fun(_){
                    this.jest_result = 0;
                }
                ));
            }
            );
            this.socketTask?.onError(fun(_){
                this.jest_result = 0;
            }
            );
        }
        ;
    }
    open lateinit var connect: () -> Unit;
    open lateinit var send: () -> Unit;
    open lateinit var close: () -> Unit;
    open lateinit var jest_connectSocket: () -> Unit;
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
