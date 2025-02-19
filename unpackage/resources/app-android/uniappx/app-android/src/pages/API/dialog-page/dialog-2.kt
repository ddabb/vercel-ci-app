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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
open class GenPagesAPIDialogPageDialog2 : BasePage {
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
            console.log("dialog 2 onLoad", options);
            setLifeCycleNum(state.lifeCycleNum + 1);
        }
        , __ins);
        onPageShow(fun() {
            console.log("dialog 2 onShow");
            setLifeCycleNum(state.lifeCycleNum + 1);
        }
        , __ins);
        onReady(fun() {
            console.log("dialog 2 onReady");
            setLifeCycleNum(state.lifeCycleNum + 1);
        }
        , __ins);
        onPageHide(fun() {
            console.log("dialog 2 onHide");
            setLifeCycleNum(state.lifeCycleNum - 1);
        }
        , __ins);
        onUnload(fun() {
            console.log("dialog 2 onUnload");
            setLifeCycleNum(state.lifeCycleNum - 5);
        }
        , __ins);
        onBackPress(fun(options: OnBackPressOptions): Boolean? {
            setLifeCycleNum(state.lifeCycleNum + 1);
            return false;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("id" to "dialog2", "class" to "dialog-container"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "dialog-content"), utsArrayOf(
                createElementVNode("text", null, "title: " + toDisplayString(_ctx.title), 1),
                createElementVNode("text", utsMapOf("class" to "mt-10"), "onBackPress return false"),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.goNextPage), "go next page", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.openDialog1), "openDialog1", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.closeDialog), "closeDialog", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.closeThisDialog), "closeThisDialog", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.back), "back", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "dialog 2");
    }
    override fun `$initMethods`() {
        this.goNextPage = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/dialog-page/next-page"));
        }
        ;
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
        this.closeDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
                console.log("closeDialog success", res);
                setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("closeDialog fail", err);
                setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("closeDialog complete", res);
                setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.closeThisDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`, success = fun(res) {
                console.log("closeThisDialog success", res);
                setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("closeThisDialog fail", err);
                setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("closeThisDialog complete", res);
                setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.back = fun() {
            uni_navigateBack(null);
        }
        ;
    }
    open lateinit var goNextPage: () -> Unit;
    open lateinit var openDialog1: () -> Unit;
    open lateinit var closeDialog: () -> Unit;
    open lateinit var closeThisDialog: () -> Unit;
    open lateinit var back: () -> Unit;
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
                return utsMapOf("dialog-container" to padStyleMapOf(utsMapOf("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to padStyleMapOf(utsMapOf("width" to "80%", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#ffffff", "borderRadius" to 6)), "mt-10" to padStyleMapOf(utsMapOf("marginTop" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
