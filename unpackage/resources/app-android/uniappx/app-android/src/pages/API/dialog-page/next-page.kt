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
import io.dcloud.uniapp.extapi.closeDialogPage as uni_closeDialogPage;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIDialogPageNextPage : BasePage {
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
            console.log("dialogPage parent onLoad");
        }
        , __ins);
        onPageShow(fun() {
            console.log("dialogPage parent onShow");
        }
        , __ins);
        onReady(fun() {
            console.log("dialogPage parent onReady");
        }
        , __ins);
        onPageHide(fun() {
            console.log("dialogPage parent onHide");
        }
        , __ins);
        onUnload(fun() {
            console.log("dialogPage parent onUnload");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "onClick" to _ctx.openDialog1), "open dialog1", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "onClick" to _ctx.openDialog2), "open dialog2", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "onClick" to _ctx.openDialogPage1ToHomePage), "open dialog page 1 to home page", 8, utsArrayOf(
                "onClick"
            ))
        ));
    }
    override fun `$initMethods`() {
        this.openDialog1 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-1?name=dialog1", success = fun(res) {
                console.log("openDialog1 success", res);
            }
            , fail = fun(err) {
                console.log("openDialog1 fail", err);
            }
            , complete = fun(res) {
                console.log("openDialog1 complete", res);
            }
            ));
        }
        ;
        this.openDialog2 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-2", disableEscBack = true, success = fun(res) {
                console.log("openDialog2 success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("openDialog2 fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("openDialog2 complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.closeDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
                console.log("closeDialog success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("closeDialog fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("closeDialog complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.openDialogPage1ToHomePage = fun() {
            val pages = getCurrentPages();
            uni_openDialogPage(OpenDialogPageOptions(parentPage = pages[0], url = "/pages/API/dialog-page/dialog-1?name=dialog1", success = fun(res) {
                console.log("openDialogPage1ToHomePage success", res);
                uni_showToast(ShowToastOptions(title = "在首页打开了 dialogPage"));
            }
            , fail = fun(err) {
                console.log("openDialogPage1ToHomePage fail", err);
            }
            , complete = fun(res) {
                console.log("openDialogPage1ToHomePage complete", res);
            }
            ));
        }
        ;
        this.setLifeCycleNum = fun(value: Number) {
            uni.UNIFB90797.setLifeCycleNum(value);
        }
        ;
        this.getLifeCycleNum = fun(): Number {
            return state.lifeCycleNum;
        }
        ;
    }
    open lateinit var openDialog1: () -> Unit;
    open lateinit var openDialog2: () -> Unit;
    open lateinit var closeDialog: () -> Unit;
    open lateinit var openDialogPage1ToHomePage: () -> Unit;
    open lateinit var setLifeCycleNum: (value: Number) -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
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
