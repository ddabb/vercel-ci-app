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
import io.dcloud.uniapp.extapi.createWebviewContext as uni_createWebviewContext;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentWebViewWebViewWebViewLocal : BasePage {
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
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("web-view", utsMapOf("id" to "web-view", "ref" to "web-view", "class" to "web-view", "src" to "/hybrid/html/local.html", "onMessage" to _ctx.message, "onError" to _ctx.error, "onLoading" to _ctx.loading, "onLoad" to _ctx.load, "onDownload" to _ctx.download), null, 40, utsArrayOf(
            "onMessage",
            "onError",
            "onLoading",
            "onLoad",
            "onDownload"
        ));
    }
    open var loadError: Boolean by `$data`;
    open var loadFinish: Boolean by `$data`;
    open var autoTest: Boolean by `$data`;
    open var eventMessage: UTSJSONObject? by `$data`;
    open var eventDownload: UTSJSONObject? by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("loadError" to false, "loadFinish" to false, "autoTest" to false, "eventMessage" to null as UTSJSONObject?, "eventDownload" to null as UTSJSONObject?);
    }
    override fun `$initMethods`() {
        this.message = fun(event: UniWebViewMessageEvent) {
            console.log(JSON.stringify(event.detail));
            var contentStr = JSON.stringify(event.detail);
            uni_showModal(ShowModalOptions(content = contentStr, showCancel = false));
            if (this.autoTest) {
                this.eventMessage = object : UTSJSONObject() {
                    var tagName = event.target?.tagName
                    var type = event.type
                    var data = event.detail.data
                };
            }
        }
        ;
        this.error = fun(event: UniWebViewErrorEvent) {
            this.loadError = true;
            console.log(JSON.stringify(event.detail));
        }
        ;
        this.loading = fun(event: UniWebViewLoadingEvent) {
            console.log(JSON.stringify(event.detail));
        }
        ;
        this.load = fun(event: UniWebViewLoadEvent) {
            this.loadFinish = true;
            console.log(JSON.stringify(event.detail));
        }
        ;
        this.download = fun(event: UniWebViewDownloadEvent) {
            console.log(JSON.stringify(event.detail));
            if (this.autoTest) {
                val arr = event.detail.userAgent.split(" ");
                this.eventDownload = object : UTSJSONObject() {
                    var tagName = event.target?.tagName
                    var type = event.type
                    var url = event.detail.url
                    var userAgent = arr[arr.length - 1]
                    var contentDisposition = event.detail.contentDisposition
                    var mimetype = event.detail.mimetype
                    var isContentLengthValid = Math.trunc(event.detail.contentLength / 1024 / 1024) > 1
                };
            }
        }
        ;
        this.testEventDownload = fun() {
            uni_createWebviewContext("web-view", null)?.evalJS("document.getElementsByTagName('a')[0].click()");
        }
        ;
        this.testEventMessage = fun() {
            uni_createWebviewContext("web-view", null)?.evalJS("document.getElementById('postMessage').click()");
        }
        ;
    }
    open lateinit var message: (event: UniWebViewMessageEvent) -> Unit;
    open lateinit var error: (event: UniWebViewErrorEvent) -> Unit;
    open lateinit var loading: (event: UniWebViewLoadingEvent) -> Unit;
    open lateinit var load: (event: UniWebViewLoadEvent) -> Unit;
    open lateinit var download: (event: UniWebViewDownloadEvent) -> Unit;
    open lateinit var testEventDownload: () -> Unit;
    open lateinit var testEventMessage: () -> Unit;
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
                return utsMapOf("web-view" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
