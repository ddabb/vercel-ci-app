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
import uts.sdk.modules.nativeButton.NativeButton;
open class GenUniModulesNativeButtonComponentsNativeButtonNativeButton : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var text: String by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenUniModulesNativeButtonComponentsNativeButtonNativeButton) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenUniModulesNativeButtonComponentsNativeButtonNativeButton;
            val _cache = __ins.renderCache;
            var button: NativeButton? = null;
            val props = __props;
            fun emit(event: String, vararg do_not_transform_spread: Any?) {
                __ins.emit(event, *do_not_transform_spread);
            }
            fun genUpdateTextFn(value: String) {
                button?.updateText(value);
            }
            val updateText = ::genUpdateTextFn;
            watchEffect(fun(){
                val text = props.text;
                updateText(text);
            }
            );
            fun genOnviewinitFn(e: UniNativeViewInitEvent) {
                button = NativeButton(e.detail.element);
                updateText(props.text);
                emit("load");
            }
            val onviewinit = ::genOnviewinitFn;
            fun genOntapFn(e: UniNativeViewEvent) {
                emit("buttonTap", e);
            }
            val ontap = ::genOntapFn;
            fun genOnUnmountedFn() {
                button?.destroy();
            }
            val onUnmounted = ::genOnUnmountedFn;
            return fun(): Any? {
                return createElementVNode("native-view", utsMapOf("onInit" to onviewinit, "on:customClick" to ontap), null, 32);
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf())
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("load" to null, "buttonTap" to null);
        var props = normalizePropsOptions(utsMapOf("text" to utsMapOf("type" to "String", "required" to true)));
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
