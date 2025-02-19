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
import uts.sdk.modules.nativeTimePicker.NativeTimePicker;
open class GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onUnmounted(fun() {}, __ins);
        this.`$watch`(fun(): Any? {
            return this.hour;
        }
        , fun(newValue: Number, oldValue: Number) {
            if (newValue < 23 && newValue >= 0) {
                this.hourValue = newValue;
                this.picker?.setHour(this.hourValue);
            }
        }
        , WatchOptions(immediate = true));
        this.`$watch`(fun(): Any? {
            return this.minute;
        }
        , fun(newValue: Number, oldValue: Number) {
            if (newValue < 59 && newValue >= 0) {
                this.minuteValue = newValue;
                this.picker?.setMinute(this.minuteValue);
            }
        }
        , WatchOptions(immediate = true));
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "def-picker"), utsArrayOf(
            createElementVNode("native-view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "100%", "height" to "100%")), "onInit" to _ctx.onviewinit, "onTimechanged" to _ctx.ontimechanged), null, 44, utsArrayOf(
                "onInit",
                "onTimechanged"
            ))
        ));
    }
    open var hour: Number by `$props`;
    open var minute: Number by `$props`;
    open var picker: NativeTimePicker? by `$data`;
    open var hourValue: Number by `$data`;
    open var minuteValue: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("picker" to null as NativeTimePicker?, "hourValue" to 0 as Number, "minuteValue" to 0 as Number);
    }
    override fun `$initMethods`() {
        this.onviewinit = fun(e: UniNativeViewInitEvent) {
            this.picker = NativeTimePicker(e.detail.element, this.hourValue, this.minuteValue);
            this.`$emit`("load");
        }
        ;
        this.ontimechanged = fun(e: UniNativeViewEvent) {
            this.`$emit`("changed", e);
        }
        ;
    }
    open lateinit var onviewinit: (e: UniNativeViewInitEvent) -> Unit;
    open lateinit var ontimechanged: (e: UniNativeViewEvent) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("def-picker" to padStyleMapOf(utsMapOf("minWidth" to 300, "minHeight" to 380, "maxWidth" to 400, "maxHeight" to 400)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("hour" to utsMapOf("type" to "Number", "default" to 0), "minute" to utsMapOf("type" to "Number", "default" to 0)));
        var propsNeedCastKeys = utsArrayOf(
            "hour",
            "minute"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
