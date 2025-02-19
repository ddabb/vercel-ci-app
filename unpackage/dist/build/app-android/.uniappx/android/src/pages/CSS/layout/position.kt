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
open class GenPagesCSSLayoutPosition : BasePage {
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
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-grow" to "1"))), utsArrayOf(
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("text", null, "position: fixed"),
                    createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "250px", "height" to "250px", "background-color" to "gray"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("class" to "common fixed", "style" to normalizeStyle(utsMapOf("position" to "fixed"))), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "text"), "fixed")
                        ), 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("text", null, "position: relative"),
                    createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "250px", "height" to "250px", "background-color" to "gray"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("class" to "common", "style" to normalizeStyle(utsMapOf("position" to "relative"))), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "text"), "relative")
                        ), 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("text", null, "position: absolute"),
                    createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "250px", "height" to "250px", "background-color" to "gray"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("class" to "common", "style" to normalizeStyle(utsMapOf("position" to "absolute"))), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "text"), "absolute")
                        ), 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "red"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "green"))), null, 4),
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "50px", "background-color" to "blue"))), null, 4)
                    ), 4)
                ))
            ), 4)
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
                return utsMapOf("common" to padStyleMapOf(utsMapOf("width" to 50, "height" to 50, "backgroundColor" to "#008000", "top" to 25, "left" to 25, "justifyContent" to "center", "alignItems" to "center")), "text" to padStyleMapOf(utsMapOf("whiteSpace" to "nowrap", "width" to "100%")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
