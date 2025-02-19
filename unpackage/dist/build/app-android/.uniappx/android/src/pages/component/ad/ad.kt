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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesComponentAdAd : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("view", null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "信息流广告")),
            createElementVNode("ad", utsMapOf("adpid" to "1111111111", "style" to normalizeStyle(utsMapOf("width" to "100%")), "onLoad" to _ctx.loadFun, "onError" to _ctx.errorFun), null, 44, utsArrayOf(
                "onLoad",
                "onError"
            )),
            if (isTrue(_ctx.tips)) {
                createElementVNode("view", utsMapOf("key" to 0, "class" to "uni-center"), "信息流广告加载失败，请退出当前页面重试。");
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            createElementVNode("button", utsMapOf("onClick" to _ctx.pushList), "列表-信息流", 8, utsArrayOf(
                "onClick"
            ))
        ));
    }
    open var tips: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("tips" to false);
    }
    override fun `$initMethods`() {
        this.pushList = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/component/ad/list-view-ad"));
        }
        ;
        this.loadFun = fun() {
            uni_showToast(ShowToastOptions(position = "bottom", title = "信息流广告加载成功"));
        }
        ;
        this.errorFun = fun() {
            this.tips = true;
        }
        ;
    }
    open lateinit var pushList: () -> Unit;
    open lateinit var loadFun: () -> Unit;
    open lateinit var errorFun: () -> Unit;
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
