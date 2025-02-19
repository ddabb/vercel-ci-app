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
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesComponentNativeViewNativeView : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_native_button = resolveEasyComponent("native-button", GenUniModulesNativeButtonComponentsNativeButtonNativeButtonClass);
        val _component_native_time_picker = resolveEasyComponent("native-time-picker", GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePickerClass);
        return createElementVNode("view", null, utsArrayOf(
            createElementVNode("text", utsMapOf("class" to "tips"), "说明：如果本地无 uts 插件编译环境请提交打包自定义基座查看效果"),
            createVNode(_component_native_button, utsMapOf("class" to "native-button", "style" to normalizeStyle(utsMapOf("width" to "200px", "height" to "100px")), "text" to _ctx.buttonText, "onButtonTap" to _ctx.ontap, "onLoad" to _ctx.onload), null, 8, utsArrayOf(
                "style",
                "text",
                "onButtonTap",
                "onLoad"
            )),
            createVNode(_component_native_time_picker, utsMapOf("class" to "native-time-picker", "hour" to 2, "minute" to 3, "onChanged" to _ctx.onChanged), null, 8, utsArrayOf(
                "onChanged"
            ))
        ));
    }
    open var title: String by `$data`;
    open var buttonText: String by `$data`;
    open var isLoad: Boolean by `$data`;
    open var clickCount: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "Hello", "buttonText" to "native-button", "isLoad" to false, "clickCount" to 0);
    }
    override fun `$initMethods`() {
        this.ontap = fun(e: UniNativeViewEvent) {
            uni_showToast(ShowToastOptions(title = "按钮被点击了"));
            this.clickCount++;
            this.buttonText = "native-button" + this.clickCount;
        }
        ;
        this.onload = fun() {
            this.isLoad = true;
        }
        ;
        this.onChanged = fun(e: UniNativeViewEvent) {
            console.log("onchanged-----", e.detail);
        }
        ;
    }
    open lateinit var ontap: (e: UniNativeViewEvent) -> Unit;
    open lateinit var onload: () -> Unit;
    open lateinit var onChanged: (e: UniNativeViewEvent) -> Unit;
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
                return utsMapOf("tips" to padStyleMapOf(utsMapOf("fontSize" to 14, "color" to "#BEBEBE", "marginTop" to 25, "marginRight" to "auto", "marginBottom" to 25, "marginLeft" to "auto", "textAlign" to "center")), "native-button" to padStyleMapOf(utsMapOf("height" to 100, "width" to 100, "marginTop" to 25, "marginRight" to "auto", "marginBottom" to 25, "marginLeft" to "auto")), "native-time-picker" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to "auto", "marginBottom" to 25, "marginLeft" to "auto", "borderStyle" to "solid", "borderRadius" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
