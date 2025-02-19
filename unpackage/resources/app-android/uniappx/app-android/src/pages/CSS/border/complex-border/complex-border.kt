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
open class GenPagesCSSBorderComplexBorderComplexBorder : BasePage {
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
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-grow" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("text", null, "圆角 : 各边之间 不同width && 不同颜色 && 不同圆角"),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "250px", "height" to "250px", "background-color" to "gray", "justify-content" to "center", "align-items" to "center"))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "border-circle"))
                ), 4)
            )),
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("text", null, "直角 : 各边之间 不同width && 不同颜色 "),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "250px", "height" to "250px", "background-color" to "gray", "justify-content" to "center", "align-items" to "center"))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "border-rect"))
                ), 4)
            ))
        ), 4);
    }
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
                return utsMapOf("common" to padStyleMapOf(utsMapOf("width" to 250, "height" to 250, "backgroundColor" to "#808080")), "border-circle" to padStyleMapOf(utsMapOf("width" to 125, "height" to 125, "backgroundColor" to "#00dd00", "borderWidth" to 10, "borderStyle" to "solid", "borderColor" to "#000000", "borderBottomWidth" to 20, "borderBottomColor" to "#ff0000", "borderBottomRightRadius" to 25, "borderBottomLeftRadius" to 15, "borderRadius" to 5, "borderRightColor" to "#FFDC02")), "border-rect" to padStyleMapOf(utsMapOf("width" to 125, "height" to 125, "borderStyle" to "solid", "backgroundColor" to "#00dd00", "borderWidth" to 10, "borderColor" to "#000000", "borderBottomWidth" to 20, "borderBottomColor" to "#ff0000", "borderRightColor" to "#FFDC02")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
