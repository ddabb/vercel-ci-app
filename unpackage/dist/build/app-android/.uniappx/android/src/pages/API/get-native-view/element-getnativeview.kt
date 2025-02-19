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
import uts.sdk.modules.utsGetNativeView.checkWebViewNativeView;
import uts.sdk.modules.utsGetNativeView.checkInputNativeView;
import uts.sdk.modules.utsGetNativeView.checkTextareaNativeView;
import uts.sdk.modules.utsGetNativeView.checkViewNativeView;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIGetNativeViewElementGetnativeview : BasePage {
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
        return createElementVNode("view", utsMapOf("id" to "view", "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("input", utsMapOf("id" to "input", "value" to "input", "class" to "input")),
            createElementVNode("textarea", utsMapOf("id" to "textarea", "value" to "textarea", "class" to "textarea")),
            createElementVNode("web-view", utsMapOf("id" to "webview", "src" to "/hybrid/html/local.html", "class" to "web-view")),
            " // 注意：iOS平台真机运行时需要安装 Xcode 开发工具具备 UTS 开发环境，或提交自定基座打包后 checkNativeView 相关方法才会生效 ",
            createElementVNode("button", utsMapOf("class" to "button", "type" to "primary", "onClick" to _ctx.checkViewNativeView), "检测view标签原生View", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "type" to "primary", "onClick" to _ctx.checkInputNativeView), "检测input标签原生View", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "type" to "primary", "onClick" to _ctx.checkTextareaNativeView), "检测textarea标签原生View", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "type" to "primary", "onClick" to _ctx.checkWebViewNativeView), "检测webview标签原生View", 8, utsArrayOf(
                "onClick"
            ))
        ), 4);
    }
    override fun `$initMethods`() {
        this.checkViewNativeView = fun(): Boolean {
            var viewName = "ViewGroup";
            val msg = "检测view组件对应原生" + viewName;
            if (checkViewNativeView("view")) {
                this.showTip(msg + "成功");
                return true;
            }
            this.showTip(msg + "失败");
            return false;
        }
        ;
        this.checkInputNativeView = fun(): Boolean {
            var viewName = "AppCompatEditText";
            val msg = "检测input组件对应原生" + viewName;
            if (checkInputNativeView("input")) {
                this.showTip(msg + "成功");
                return true;
            }
            this.showTip(msg + "失败");
            return false;
        }
        ;
        this.checkTextareaNativeView = fun(): Boolean {
            var viewName = "AppCompatEditText";
            val msg = "检测textarea组件对应原生" + viewName;
            if (checkTextareaNativeView("textarea")) {
                this.showTip(msg + "成功");
                return true;
            }
            this.showTip(msg + "失败");
            return false;
        }
        ;
        this.checkWebViewNativeView = fun(): Boolean {
            var viewName = "WebView";
            val msg = "检测webview组件对应原生" + viewName;
            if (checkWebViewNativeView("webview")) {
                this.showTip(msg + "成功");
                return true;
            }
            this.showTip(msg + "失败");
            return false;
        }
        ;
        this.showTip = fun(title: String) {
            console.log("title===" + title);
            uni_showToast(ShowToastOptions(title = title, icon = "none"));
        }
        ;
    }
    open lateinit var checkViewNativeView: () -> Boolean;
    open lateinit var checkInputNativeView: () -> Boolean;
    open lateinit var checkTextareaNativeView: () -> Boolean;
    open lateinit var checkWebViewNativeView: () -> Boolean;
    open lateinit var showTip: (title: String) -> Unit;
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
                return utsMapOf("input" to padStyleMapOf(utsMapOf("width" to 300, "height" to 40, "borderRadius" to 4, "borderWidth" to 1, "borderColor" to "#000000", "borderStyle" to "solid", "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto")), "textarea" to padStyleMapOf(utsMapOf("width" to 300, "height" to 80, "borderRadius" to 4, "borderWidth" to 1, "borderColor" to "#000000", "borderStyle" to "solid", "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto")), "web-view" to padStyleMapOf(utsMapOf("width" to 300, "height" to 120, "marginTop" to 20, "marginRight" to "auto", "marginBottom" to 20, "marginLeft" to "auto", "borderRadius" to 4, "borderWidth" to 1, "borderColor" to "#000000", "borderStyle" to "solid")), "button" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 20, "marginBottom" to 10, "marginLeft" to 20)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
