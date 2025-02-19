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
open class GenPagesAPIDialogPageDialog4 : BasePage {
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
        onPageShow(fun() {
            console.log("dialog 4 onShow");
            setLifeCycleNum(state.lifeCycleNum + 1);
        }
        , __ins);
        onUnload(fun() {
            console.log("dialog 4 onUnload");
            setLifeCycleNum(state.lifeCycleNum - 5);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "dialog-container"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "dialog-content"), utsArrayOf(
                createElementVNode("text", null, "title: " + toDisplayString(_ctx.title), 1),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.closeDialog), " closeDialog ", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.closeThisDialog), " closeThisDialog ", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "mt-10", "onClick" to _ctx.openDialog3), " open dialog 3 ", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "dialog 4");
    }
    override fun `$initMethods`() {
        this.closeDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
                console.log("closeDialog success", res);
            }
            , fail = fun(err) {
                console.log("closeDialog fail", err);
            }
            , complete = fun(res) {
                console.log("closeDialog complete", res);
            }
            ));
        }
        ;
        this.closeThisDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`, success = fun(res) {
                console.log("closeThisDialog success", res);
            }
            , fail = fun(err) {
                console.log("closeThisDialog fail", err);
            }
            , complete = fun(res) {
                console.log("closeThisDialog complete", res);
            }
            ));
        }
        ;
        this.openDialog3 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-3"));
        }
        ;
    }
    open lateinit var closeDialog: () -> Unit;
    open lateinit var closeThisDialog: () -> Unit;
    open lateinit var openDialog3: () -> Unit;
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
