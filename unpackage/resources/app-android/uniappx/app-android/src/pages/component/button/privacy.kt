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
import io.dcloud.uniapp.extapi.offPrivacyAuthorizationChange as uni_offPrivacyAuthorizationChange;
import io.dcloud.uniapp.extapi.onPrivacyAuthorizationChange as uni_onPrivacyAuthorizationChange;
import uts.sdk.modules.utsOpenSchema.openSchema;
import io.dcloud.uniapp.extapi.resetPrivacyAuthorization as uni_resetPrivacyAuthorization;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesComponentButtonPrivacy : BasePage {
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
        onUnmounted(fun() {
            uni_offPrivacyAuthorizationChange(this.number);
        }
        , __ins);
        onLoad(fun(_: OnLoadOptions) {
            this.number = uni_onPrivacyAuthorizationChange(fun(callback){
                uni_showToast(ShowToastOptions(title = "isPrivacyAgree:" + !callback.needAuthorization));
            }
            );
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "dialog-container"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "dialog-content"), utsArrayOf(
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "100%", "justify-content" to "center", "align-items" to "center", "background-color" to "#fff"))), utsArrayOf(
                    createElementVNode("image", utsMapOf("src" to default2, "style" to normalizeStyle(utsMapOf("margin-top" to "25px", "width" to "60px", "height" to "60px"))), null, 4)
                ), 4),
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("text-align" to "center", "padding-top" to "20px", "font-size" to "20px", "color" to "black", "background-color" to "#fff"))), " 个人信息保护指引", 4),
                createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1", "align-content" to "center", "padding-top" to "10px", "padding-left" to "25px", "padding-right" to "25px", "background-color" to "#fff")), "show-scrollbar" to "false"), utsArrayOf(
                    createElementVNode("rich-text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "14px", "color" to "red")), "nodes" to _ctx.htmlString, "onItemclick" to _ctx.itemClick), null, 44, utsArrayOf(
                        "nodes",
                        "onItemclick"
                    ))
                ), 4),
                createElementVNode("button", utsMapOf("class" to "button", "style" to normalizeStyle(utsMapOf("background-color" to "#fff")), "onClick" to _ctx.reject, "hover-class" to "button-hover1"), "不同意", 12, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "button", "style" to normalizeStyle(utsMapOf("background-color" to "royalblue")), "hover-class" to "button-hover2", "open-type" to "agreePrivacyAuthorization", "onClick" to _ctx.agree), "同意", 12, utsArrayOf(
                    "onClick"
                ))
            ))
        ));
    }
    open var number: Number by `$data`;
    open var htmlString: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("number" to 0, "htmlString" to "<span style=\"color:grey\">欢迎使用Hello uni-app x，我们将通过<a href=\"https://hx.dcloud.net.cn/license\" >《用户服务协议》</a></strong>及相关个人信息处理规则帮助你了解我们如何收集、处理个人信息。根据《常见类型移动互联网应用程序必要个人信息范围规定》。同意《基本功能数据处理规则》仅代表你同意使用浏览、搜索、下载等主要功能收集、处理相关必要个人信息及数据。此外，为了向你提供更多丰富、优质的服务，我们可能在你使用本产品的过程中提供电商购物、财经支付等扩展功能，如果你拒绝提供，你可能无法使用相应的扩展服务，但不影响你使用我们的基础服务。我们通过<a href=\"https://doc.dcloud.net.cn/markdown-share-docs/2e766f9cf1f8ca009c11875e447de5c8/\">《隐私政策》</a></strong>帮助你全面了解我们的服务及收集、处理个人信息的详细情况。</span>");
    }
    override fun `$initMethods`() {
        this.agree = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`));
        }
        ;
        this.reject = fun() {
            uni_resetPrivacyAuthorization();
            uni_closeDialogPage(CloseDialogPageOptions(dialogPage = this.`$page`));
        }
        ;
        this.itemClick = fun(e: RichTextItemClickEvent) {
            var ref1 = e.detail.href;
            if (ref1 != null) {
                openSchema(ref1);
            }
        }
        ;
    }
    open lateinit var agree: () -> Unit;
    open lateinit var reject: () -> Unit;
    open lateinit var itemClick: (e: RichTextItemClickEvent) -> Unit;
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
                return utsMapOf("dialog-container" to padStyleMapOf(utsMapOf("width" to "100%", "height" to "100%", "backgroundColor" to "rgba(0,0,0,0.3)", "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "dialog-content" to padStyleMapOf(utsMapOf("height" to "60%", "width" to "80%", "borderRadius" to 12)), "button" to padStyleMapOf(utsMapOf("borderWidth" to 0, "borderStyle" to "none", "borderColor" to "#000000", "borderRadius" to 0, "fontSize" to 15, "color" to "#D3D3D3", "textAlign" to "center", "lineHeight" to "40px")), "button-hover1" to padStyleMapOf(utsMapOf("color" to "#000000", "backgroundColor" to "#ffffff")), "button-hover2" to padStyleMapOf(utsMapOf("color" to "#000000", "backgroundColor" to "#4169E1")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
