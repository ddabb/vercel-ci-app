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
open class GenComponentsEnumDataEnumData : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-title uni-common-mt"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), toDisplayString(_ctx.title), 1)
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "uni-list uni-common-pl"), utsArrayOf(
                createVNode(_component_radio_group, utsMapOf("onChange" to _ctx._change), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                            return createVNode(_component_radio, utsMapOf("class" to normalizeClass(utsArrayOf(
                                "uni-list-cell uni-list-cell-pd radio",
                                if (index < _ctx.items.length - 1) {
                                    "uni-list-cell-line";
                                } else {
                                    "";
                                }
                            )), "key" to item.name, "value" to (item.value + "")), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    toDisplayString(item.name)
                                );
                            }
                            ), "_" to 2), 1032, utsArrayOf(
                                "class",
                                "value"
                            ));
                        }
                        ), 128)
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "onChange"
                ))
            ))
        ), 64);
    }
    open var title: String by `$props`;
    open var items: UTSArray<ItemType> by `$props`;
    open var current: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("current" to 0);
    }
    override fun `$initMethods`() {
        this._change = fun(e: RadioGroupChangeEvent) {
            val selected = this.items.find(fun(item: ItemType): Boolean {
                return item.value.toString(10) == e.detail.value;
            }
            );
            if (selected != null) {
                this.`$emit`("change", selected.value);
                uni_showToast(ShowToastOptions(icon = "none", title = "当前选中:" + selected.name));
            }
        }
        ;
    }
    open lateinit var _change: (e: RadioGroupChangeEvent) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf())
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("change" to null);
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "items" to utsMapOf("type" to "Array", "required" to true)));
        var propsNeedCastKeys = utsArrayOf(
            "title"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
