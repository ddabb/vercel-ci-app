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
import uts.sdk.modules.utsGetNativeView.canWebViewGoBack;
import uts.sdk.modules.utsGetNativeView.canWebViewGoForward;
import uts.sdk.modules.utsGetNativeView.hasNativeView;
import io.dcloud.uniapp.extapi.createWebviewContext as uni_createWebviewContext;
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentWebViewWebView : BasePage {
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
        onReady(fun() {
            this.webviewContext = uni_createWebviewContext("web-view", this);
            this.webviewElement = uni_getElementById("web-view") as UniWebViewElement;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("class" to "uni-flex-item"), utsArrayOf(
            createElementVNode("web-view", utsMapOf("id" to "web-view", "class" to "uni-flex-item", "style" to normalizeStyle(utsMapOf("pointer-events" to _ctx.pointerEvents)), "src" to _ctx.src, "webview-styles" to _ctx.webview_styles, "horizontalScrollBarAccess" to _ctx.horizontalScrollBarAccess, "verticalScrollBarAccess" to _ctx.verticalScrollBarAccess, "onMessage" to _ctx.message, "onError" to _ctx.error, "onLoading" to _ctx.loading, "onLoad" to _ctx.load, "onDownload" to _ctx.download, "onTouchstart" to _ctx.touchstart, "onClick" to _ctx.tap), null, 44, utsArrayOf(
                "src",
                "webview-styles",
                "horizontalScrollBarAccess",
                "verticalScrollBarAccess",
                "onMessage",
                "onError",
                "onLoading",
                "onLoad",
                "onDownload",
                "onTouchstart",
                "onClick"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("input", utsMapOf("class" to "uni-input", "confirmType" to "go", "placeholder" to "输入网址跳转", "onConfirm" to _ctx.confirm, "maxlength" to "-1"), null, 40, utsArrayOf(
                        "onConfirm"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-row uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("class" to "uni-flex-item", "type" to "primary", "disabled" to !_ctx.canGoBack, "onClick" to _ctx.back), "后退", 8, utsArrayOf(
                        "disabled",
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "margin-left-5 uni-flex-item", "type" to "primary", "disabled" to !_ctx.canGoForward, "onClick" to _ctx.forward), "前进", 8, utsArrayOf(
                        "disabled",
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-row uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("class" to "uni-flex-item", "type" to "primary", "onClick" to _ctx.reload), "重新加载", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "margin-left-5 uni-flex-item", "type" to "primary", "onClick" to _ctx.stop), "停止加载", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.nativeToWeb), "原生和Web通信", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-row uni-btn-v"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-row uni-flex-item align-items-center"), utsArrayOf(
                        createElementVNode("text", null, "显示横向滚动条"),
                        createVNode(_component_switch, utsMapOf("checked" to true, "onChange" to _ctx.changeHorizontalScrollBarAccess), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-row uni-flex-item align-items-center"), utsArrayOf(
                        createElementVNode("text", null, "显示竖向滚动条"),
                        createVNode(_component_switch, utsMapOf("checked" to true, "onChange" to _ctx.changeVerticalScrollBarAccess), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    ))
                ))
            ))
        ));
    }
    open var src: String by `$data`;
    open var webview_styles: UTSJSONObject by `$data`;
    open var webviewContext: WebviewContext? by `$data`;
    open var webviewElement: UniWebViewElement? by `$data`;
    open var loadError: Boolean by `$data`;
    open var horizontalScrollBarAccess: Boolean by `$data`;
    open var verticalScrollBarAccess: Boolean by `$data`;
    open var canGoBack: Boolean by `$data`;
    open var canGoForward: Boolean by `$data`;
    open var autoTest: Boolean by `$data`;
    open var eventLoading: UTSJSONObject? by `$data`;
    open var eventLoad: UTSJSONObject? by `$data`;
    open var eventError: UTSJSONObject? by `$data`;
    open var pointerEvents: String by `$data`;
    open var isTouchEnable: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("src" to "https://www.dcloud.io", "webview_styles" to object : UTSJSONObject() {
            var progress = object : UTSJSONObject() {
                var color = "#FF3333"
            }
        }, "webviewContext" to null as WebviewContext?, "webviewElement" to null as UniWebViewElement?, "loadError" to false, "horizontalScrollBarAccess" to true, "verticalScrollBarAccess" to true, "canGoBack" to false, "canGoForward" to false, "autoTest" to false, "eventLoading" to null as UTSJSONObject?, "eventLoad" to null as UTSJSONObject?, "eventError" to null as UTSJSONObject?, "pointerEvents" to "auto", "isTouchEnable" to false);
    }
    override fun `$initMethods`() {
        this.getPackageName = fun(): String {
            var packageName: String = "";
            return packageName;
        }
        ;
        this.isProd = fun(): Boolean {
            if (this.getPackageName() == "io.dcloud.hellouniappx") {
                return true;
            }
            return false;
        }
        ;
        this.back = fun() {
            this.webviewContext?.back();
        }
        ;
        this.forward = fun() {
            this.webviewContext?.forward();
        }
        ;
        this.reload = fun() {
            this.webviewContext?.reload();
        }
        ;
        this.stop = fun() {
            this.webviewContext?.stop();
        }
        ;
        this.nativeToWeb = fun() {
            this.webviewContext?.evalJS("alert('hello uni-app x')");
        }
        ;
        this.message = fun(event: UniWebViewMessageEvent) {
            console.log(JSON.stringify(event.detail));
        }
        ;
        this.error = fun(event: UniWebViewErrorEvent) {
            this.loadError = true;
            console.log(JSON.stringify(event.detail));
            if (this.autoTest) {
                this.eventError = object : UTSJSONObject() {
                    var tagName = event.target?.tagName
                    var type = event.type
                    var errCode = event.detail.errCode
                    var errMsg = event.detail.errMsg
                    var url = event.detail.url
                    var fullUrl = event.detail.fullUrl
                    var src = event.detail.src
                };
            }
        }
        ;
        this.loading = fun(event: UniWebViewLoadingEvent) {
            console.log(JSON.stringify(event.detail));
            if (this.autoTest) {
                this.eventLoading = object : UTSJSONObject() {
                    var tagName = event.target?.tagName
                    var type = event.type
                    var src = event.detail.src
                };
            }
        }
        ;
        this.load = fun(event: UniWebViewLoadEvent) {
            console.log(JSON.stringify(event.detail));
            this.canGoBack = canWebViewGoBack("web-view");
            this.canGoForward = canWebViewGoForward("web-view");
            if (this.autoTest) {
                this.eventLoad = object : UTSJSONObject() {
                    var tagName = event.target?.tagName
                    var type = event.type
                    var src = event.detail.src
                };
            }
        }
        ;
        this.download = fun(event: UniWebViewDownloadEvent) {
            console.log(JSON.stringify(event.detail));
            uni_showModal(ShowModalOptions(content = "下载链接: " + event.detail.url + "\n文件大小: " + event.detail.contentLength / 1024 + "KB", showCancel = false));
        }
        ;
        this.confirm = fun(event: UniInputConfirmEvent) {
            var url = event.detail.value;
            if (!url.startsWith("https://") && !url.startsWith("http://")) {
                url = "https://" + url;
            }
            this.src = url;
        }
        ;
        this.changeHorizontalScrollBarAccess = fun(event: UniSwitchChangeEvent) {
            this.horizontalScrollBarAccess = event.detail.value;
        }
        ;
        this.changeVerticalScrollBarAccess = fun(event: UniSwitchChangeEvent) {
            this.verticalScrollBarAccess = event.detail.value;
        }
        ;
        this.touchstart = fun(event: UniTouchEvent) {
            if (this.autoTest) {
                this.isTouchEnable = event.touches[0].clientX > 0 && event.touches[0].clientY > 0;
            }
        }
        ;
        this.tap = fun(event: UniPointerEvent) {
            if (this.autoTest) {
                this.isTouchEnable = event.clientX > 0 && event.clientY > 0;
            }
        }
        ;
        this.getWindowInfo = fun(): GetWindowInfoResult {
            return uni_getWindowInfo();
        }
        ;
        this.checkNativeWebView = fun(): Boolean {
            return hasNativeView("web-view");
        }
        ;
    }
    open lateinit var getPackageName: () -> String;
    open lateinit var isProd: () -> Boolean;
    open lateinit var back: () -> Unit;
    open lateinit var forward: () -> Unit;
    open lateinit var reload: () -> Unit;
    open lateinit var stop: () -> Unit;
    open lateinit var nativeToWeb: () -> Unit;
    open lateinit var message: (event: UniWebViewMessageEvent) -> Unit;
    open lateinit var error: (event: UniWebViewErrorEvent) -> Unit;
    open lateinit var loading: (event: UniWebViewLoadingEvent) -> Unit;
    open lateinit var load: (event: UniWebViewLoadEvent) -> Unit;
    open lateinit var download: (event: UniWebViewDownloadEvent) -> Unit;
    open lateinit var confirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var changeHorizontalScrollBarAccess: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var changeVerticalScrollBarAccess: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var touchstart: (event: UniTouchEvent) -> Unit;
    open lateinit var tap: (event: UniPointerEvent) -> Unit;
    open lateinit var getWindowInfo: () -> GetWindowInfoResult;
    open lateinit var checkNativeWebView: () -> Boolean;
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
                return utsMapOf("margin-left-5" to padStyleMapOf(utsMapOf("marginLeft" to 5)), "align-items-center" to padStyleMapOf(utsMapOf("alignItems" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
