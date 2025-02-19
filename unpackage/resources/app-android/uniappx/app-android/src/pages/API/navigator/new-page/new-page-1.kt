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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesAPINavigatorNewPageNewPage1 : BasePage {
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
            if (options["data"] != null) {
                this.data = options["data"]!!;
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
            createVNode(_component_page_head, utsMapOf("title" to "new-page-1")),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("text", null, "onLoad 接收到参数"),
                createElementVNode("text", null, "data: " + toDisplayString(_ctx.data), 1),
                createElementVNode("button", utsMapOf("onClick" to _ctx.navigateBackWithDelta2, "class" to "uni-btn"), " 回退到上上层页面 ", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 64);
    }
    open var data: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("data" to "");
    }
    override fun `$initMethods`() {
        this.getLifeCycleNum = fun(): Number {
            return state.lifeCycleNum;
        }
        ;
        this.navigateBackWithDelta2 = fun() {
            uni_navigateBack(NavigateBackOptions(delta = 2, success = fun(_) {
                console.log("回退上上层页面成功");
            }
            , fail = fun(error) {
                console.warn("\u56DE\u9000\u4E0A\u4E0A\u5C42\u9875\u9762\u5931\u8D25: " + error.errMsg);
            }
            ));
        }
        ;
        this.navigateToOnLoadWithType = fun(type: String) {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/onLoad?type=" + type));
        }
        ;
    }
    open lateinit var getLifeCycleNum: () -> Number;
    open lateinit var navigateBackWithDelta2: () -> Unit;
    open lateinit var navigateToOnLoadWithType: (type: String) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(), utsArrayOf(
                GenApp.styles
            ))
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
