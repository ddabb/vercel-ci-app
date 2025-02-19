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
import io.dcloud.uniapp.extapi.setNavigationBarColor as uni_setNavigationBarColor;
open class GenPagesAPISetNavigationBarColorSetNavigationBarColor : BasePage {
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
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "setNavigationBarColor")),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("button", utsMapOf("onClick" to _ctx.setNavigationBarColor1, "class" to "uni-btn"), " 设置导航条背景绿色，标题白色 ", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("onClick" to _ctx.setNavigationBarColor2, "class" to "uni-btn"), " 设置导航条背景红色，标题黑色 ", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("onClick" to _ctx.goNavbarLite, "class" to "uni-btn"), " 跳转自定义导航栏页面 ", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 64);
    }
    override fun `$initMethods`() {
        this.setNavigationBarColor1 = fun() {
            uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#ffffff", backgroundColor = "#00ff00", success = fun(_){
                console.log("setNavigationBarColor success");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_){
                console.log("setNavigationBarColor fail");
                this.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_){
                console.log("setNavigationBarColor complete");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.setNavigationBarColor2 = fun() {
            uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#000000", backgroundColor = "#ff0000", success = fun(_){
                console.log("setNavigationBarColor success");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_){
                console.log("setNavigationBarColor fail");
                this.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_){
                console.log("setNavigationBarColor complete");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.getLifeCycleNum = fun(): Number {
            return state.lifeCycleNum;
        }
        ;
        this.setLifeCycleNum = fun(num: Number) {
            uni.UNIFB90797.setLifeCycleNum(num);
        }
        ;
        this.goNavbarLite = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/template/navbar-lite/navbar-lite"));
        }
        ;
    }
    open lateinit var setNavigationBarColor1: () -> Unit;
    open lateinit var setNavigationBarColor2: () -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
    open lateinit var setLifeCycleNum: (num: Number) -> Unit;
    open lateinit var goNavbarLite: () -> Unit;
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
