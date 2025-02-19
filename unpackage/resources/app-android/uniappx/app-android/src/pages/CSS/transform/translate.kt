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
open class GenPagesCSSTransformTranslate : BasePage {
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
        return createElementVNode("scroll-view", utsMapOf("class" to "page"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "trace"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "base reserve"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "translateX(80%)"),
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "转变前位置")
                )),
                createElementVNode("view", utsMapOf("class" to "base reserve"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "translateY(50px)"),
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "转变前位置")
                )),
                createElementVNode("view", utsMapOf("class" to "base reserve"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "translate(-50%,50%)"),
                    createElementVNode("text", utsMapOf("class" to "reserve-text"), "转变前位置")
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "base transform", "style" to normalizeStyle(utsMapOf("transform" to "translateX(80%)"))), utsArrayOf(
                createElementVNode("text", null, "translateX(80%)"),
                createElementVNode("text", null, "转变后位置")
            ), 4),
            createElementVNode("view", utsMapOf("class" to "base transform", "style" to normalizeStyle(utsMapOf("transform" to "translateY(50px)"))), utsArrayOf(
                createElementVNode("text", null, "translateY(50px)"),
                createElementVNode("text", null, "转变后位置")
            ), 4),
            createElementVNode("view", utsMapOf("class" to "base transform", "style" to normalizeStyle(utsMapOf("transform" to "translate(-50%, 50%)"))), utsArrayOf(
                createElementVNode("text", null, "translate(-50%,50%)"),
                createElementVNode("text", null, "转变后位置")
            ), 4)
        ));
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("flex" to 1, "alignItems" to "center")), "trace" to padStyleMapOf(utsMapOf("position" to "absolute", "top" to 0, "left" to 0, "width" to "100%", "alignItems" to "center")), "base" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10, "width" to 150, "height" to 150, "alignItems" to "center", "justifyContent" to "center")), "reserve" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "dotted", "borderColor" to "#558888", "backgroundColor" to "#DDDDDD")), "reserve-text" to padStyleMapOf(utsMapOf("color" to "#CCCCCC")), "transform" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#0000FF", "backgroundColor" to "rgba(0,255,255,0.5)")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
