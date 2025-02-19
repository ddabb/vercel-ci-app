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
open class GenPagesTemplateCustomRefresherCustomRefresher : BasePage {
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
        val _component_refresh_box = resolveComponent("refresh-box");
        return createElementVNode("list-view", utsMapOf("class" to "list-view", "refresher-enabled" to true, "refresher-triggered" to _ctx.refresherTriggered, "refresher-default-style" to "none", "onRefresherpulling" to _ctx.onRefresherpulling, "onRefresherrefresh" to _ctx.onRefresherrefresh, "onRefresherrestore" to _ctx.onRefreshrestore, "refresher-threshold" to _ctx.refresherThreshold, "refresher-max-drag-distance" to "200px"), utsArrayOf(
            createElementVNode("sticky-header", null, utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "header"), utsArrayOf(
                    createElementVNode("text", null, "sticky header")
                ))
            )),
            createElementVNode(Fragment, null, RenderHelpers.renderList(20, fun(i, __key, __index, _cached): Any {
                return createElementVNode("list-item", utsMapOf("class" to "content-item"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "item-" + toDisplayString(i), 1)
                ));
            }
            ), 64),
            createVNode(_component_refresh_box, utsMapOf("slot" to "refresher", "state" to _ctx.state, "pullingDistance" to _ctx.pullingDistance), null, 8, utsArrayOf(
                "state",
                "pullingDistance"
            ))
        ), 40, utsArrayOf(
            "refresher-triggered",
            "onRefresherpulling",
            "onRefresherrefresh",
            "onRefresherrestore",
            "refresher-threshold"
        ));
    }
    open var refresherTriggered: Boolean by `$data`;
    open var refresherThreshold: Number by `$data`;
    open var pullingDistance: Number by `$data`;
    open var resetting: Boolean by `$data`;
    open var state: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("refresherTriggered" to false, "refresherThreshold" to 40, "pullingDistance" to 0, "resetting" to false, "state" to computed<Number>(fun(): Number {
            if (this.resetting) {
                return 3;
            }
            if (this.refresherTriggered) {
                return 2;
            }
            if (this.pullingDistance > this.refresherThreshold) {
                return 1;
            } else {
                return 0;
            }
        }
        ));
    }
    override fun `$initMethods`() {
        this.onRefresherpulling = fun(e: RefresherEvent) {
            this.pullingDistance = e.detail.dy;
        }
        ;
        this.onRefresherrefresh = fun() {
            this.refresherTriggered = true;
            setTimeout(fun(){
                this.refresherTriggered = false;
                this.resetting = true;
            }
            , 1500);
        }
        ;
        this.onRefreshrestore = fun() {
            this.pullingDistance = 0;
            this.resetting = false;
        }
        ;
    }
    open lateinit var onRefresherpulling: (e: RefresherEvent) -> Unit;
    open lateinit var onRefresherrefresh: () -> Unit;
    open lateinit var onRefreshrestore: () -> Unit;
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
                return utsMapOf("list-view" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#f5f5f5")), "header" to padStyleMapOf(utsMapOf("justifyContent" to "center", "height" to 50, "backgroundColor" to "#f5f5f5", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15)), "content-item" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 5, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "backgroundColor" to "#ffffff", "borderRadius" to 5)), "text" to padStyleMapOf(utsMapOf("fontSize" to 14, "color" to "#666666", "lineHeight" to "20px")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf("refreshBox" to GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxClass);
    }
}
