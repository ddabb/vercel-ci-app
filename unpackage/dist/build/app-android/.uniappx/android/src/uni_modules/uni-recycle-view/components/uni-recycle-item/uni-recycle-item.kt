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
import io.dcloud.uniapp.extapi.createSelectorQuery as uni_createSelectorQuery;
open class GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onMounted(fun() {
            if (this.itemHeight == 0) {
                val cachedSize = this.getCachedSize(this.item);
                if (cachedSize == null) {
                    uni_createSelectorQuery().`in`(this).select(".uni-recycle-view-item").boundingClientRect().exec(fun(ret){
                        this.setCachedSize(this.item, (ret[0] as NodeInfo).height!!);
                    }
                    );
                }
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "uni-recycle-view-item", "style" to normalizeStyle(if (this.itemHeight != 0) {
            utsMapOf("height" to (this.itemHeight + "px"));
        } else {
            utsMapOf<String, Any?>();
        }
        )), utsArrayOf(
            renderSlot(_ctx.`$slots`, "default")
        ), 4);
    }
    open var itemHeight: Number by `$inject`;
    open var setCachedSize: (item: Any, size: Number) -> Unit by `$inject`;
    open var getCachedSize: (item: Any) -> Number? by `$inject`;
    open var item: Any by `$props`;
    companion object {
        var name = "uni-recycle-item";
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-recycle-view-item" to padStyleMapOf(utsMapOf("boxSizing" to "border-box", "overflow" to "hidden")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf("itemHeight" to utsMapOf("type" to "Number"), "setCachedSize" to utsMapOf("type" to "Function"), "getCachedSize" to utsMapOf("type" to "Function"));
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("item" to utsMapOf("required" to true)));
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
