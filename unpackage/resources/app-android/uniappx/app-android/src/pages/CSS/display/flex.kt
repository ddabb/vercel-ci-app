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
open class GenPagesCSSDisplayFlex : BasePage {
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
        return createElementVNode("view", utsMapOf("class" to "page", "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "head"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "tip"), "下面有一个灰色区域，display默认值为flex"),
                createElementVNode("text", utsMapOf("class" to "tip"), "当前display值：" + toDisplayString(_ctx.display), 1)
            )),
            createElementVNode("view", utsMapOf("class" to "content", "style" to normalizeStyle(utsMapOf("display" to _ctx.display))), utsArrayOf(
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "aquamarine"))), "展示display区域", 4)
            ), 4),
            createElementVNode("button", utsMapOf("onClick" to _ctx.switchDisplay), "切换display属性", 8, utsArrayOf(
                "onClick"
            ))
        ), 4);
    }
    open var display: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("display" to "flex");
    }
    override fun `$initMethods`() {
        this.switchDisplay = fun() {
            this.display = if (("flex" == this.display)) {
                "none";
            } else {
                "flex";
            }
            ;
        }
        ;
    }
    open lateinit var switchDisplay: () -> Unit;
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("alignItems" to "center", "height" to "100%")), "head" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginBottom" to 10, "alignItems" to "center")), "tip" to padStyleMapOf(utsMapOf("color" to "#FF0000")), "content" to padStyleMapOf(utsMapOf("borderWidth" to 5, "borderStyle" to "dotted", "borderColor" to "#0000FF", "marginTop" to 50, "marginRight" to 0, "marginBottom" to 50, "marginLeft" to 0, "paddingTop" to 50, "paddingRight" to 50, "paddingBottom" to 50, "paddingLeft" to 50, "width" to 200, "height" to 200, "backgroundColor" to "#808080", "alignItems" to "center", "justifyContent" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
