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
open class GenComponentsBooleanDataBooleanData : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {
            this._checked = this.defaultValue;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_switch = resolveComponent("switch");
        return createElementVNode("view", utsMapOf("class" to "button-data-main uni-flex"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "uni-title", "style" to normalizeStyle(utsMapOf("width" to "80%"))), toDisplayString(_ctx.title), 5),
            createVNode(_component_switch, utsMapOf("checked" to _ctx._checked, "disabled" to _ctx.disabled, "onChange" to _ctx._change), null, 8, utsArrayOf(
                "checked",
                "disabled",
                "onChange"
            ))
        ));
    }
    open var title: String by `$props`;
    open var disabled: Boolean by `$props`;
    open var defaultValue: Boolean by `$props`;
    open var _checked: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("_checked" to false);
    }
    override fun `$initMethods`() {
        this._change = fun(e: UniSwitchChangeEvent) {
            this._checked = e.detail.value;
            this.`$emit`("change", this._checked);
        }
        ;
    }
    open lateinit var _change: (e: UniSwitchChangeEvent) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("button-data-main" to padStyleMapOf(utsMapOf("justifyContent" to "space-between", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "alignItems" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null);
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "disabled" to utsMapOf("type" to "Boolean", "default" to false), "defaultValue" to utsMapOf("type" to "Boolean", "default" to false)));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "disabled",
            "defaultValue"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
