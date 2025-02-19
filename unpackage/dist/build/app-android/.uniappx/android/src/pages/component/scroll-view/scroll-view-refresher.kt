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
open class GenPagesComponentScrollViewScrollViewRefresher : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            var lists: UTSArray<String> = utsArrayOf();
            run {
                var i: Number = 0;
                while(i < 20){
                    lists.push("item---" + i);
                    i++;
                }
            }
            this.scrollData = lists;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "scroll-view 下拉刷新")),
            createElementVNode("scroll-view", utsMapOf("class" to "scroll", "refresher-enabled" to "true", "refresher-triggered" to _ctx.refresherTriggered, "onRefresherrefresh" to _ctx.onRefresherrefresh, "onRefresherabort" to _ctx.onRefresherabort, "onRefresherrestore" to _ctx.onRefresherrestore, "onRefresherpulling" to _ctx.onRefresherpulling, "onScrolltolower" to _ctx.onScrolltolower, "show-scrollbar" to _ctx.showScrollbar), utsArrayOf(
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, fun(key, __key, __index, _cached): Any {
                    return createElementVNode("view", utsMapOf("key" to key), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "scroll-item"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "scroll-item-title"), toDisplayString(key), 1)
                        ))
                    ));
                }
                ), 128)
            ), 40, utsArrayOf(
                "refresher-triggered",
                "onRefresherrefresh",
                "onRefresherabort",
                "onRefresherrestore",
                "onRefresherpulling",
                "onScrolltolower",
                "show-scrollbar"
            ))
        ));
    }
    open var scrollData: UTSArray<String> by `$data`;
    open var refresherTriggered: Boolean by `$data`;
    open var refresherrefresh: Boolean by `$data`;
    open var refresherrefreshTimes: Number by `$data`;
    open var showScrollbar: Boolean by `$data`;
    open var refresherrefreshTest: String by `$data`;
    open var onRefresherabortTest: String by `$data`;
    open var onRefresherrestoreTest: String by `$data`;
    open var onRefresherpullingTest: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("scrollData" to utsArrayOf<String>(), "refresherTriggered" to false, "refresherrefresh" to false, "refresherrefreshTimes" to 0, "showScrollbar" to false, "refresherrefreshTest" to "", "onRefresherabortTest" to "", "onRefresherrestoreTest" to "", "onRefresherpullingTest" to "");
    }
    override fun `$initMethods`() {
        this.onRefresherrefresh = fun(e: UniRefresherEvent) {
            this.refresherrefresh = true;
            console.log("onRefresherrefresh------下拉刷新触发");
            this.checkEventTest(RefresherEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherrefresh");
            this.refresherTriggered = true;
            this.refresherrefreshTimes++;
            setTimeout(fun(){
                this.refresherTriggered = false;
            }
            , 1500);
        }
        ;
        this.onRefresherabort = fun(e: UniRefresherEvent) {
            console.log("onRefresherabort------下拉刷新被中止");
            this.checkEventTest(RefresherEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherabort");
        }
        ;
        this.onRefresherrestore = fun(e: UniRefresherEvent) {
            this.refresherrefresh = false;
            console.log("onRefresherrestore------下拉刷新被复位");
            this.checkEventTest(RefresherEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherrestore");
        }
        ;
        this.onRefresherpulling = fun(e: UniRefresherEvent) {
            console.log("onRefresherpulling------拉刷新控件被下拉-dy=" + e.detail.dy);
            this.checkEventTest(RefresherEventTest(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherpulling");
        }
        ;
        this.onScrolltolower = fun(e: UniScrollToLowerEvent) {
            console.log("onScrolltolower 滚动到底部-----" + e.detail.direction);
        }
        ;
        this.checkEventTest = fun(e: RefresherEventTest, eventName: String) {
            val isPass = e.type === eventName && e.target is UniElement && e.currentTarget is UniElement && e.dy > 0;
            val result = if (isPass) {
                "" + eventName + ":Success";
            } else {
                "" + eventName + ":Fail";
            }
            ;
            when (eventName) {
                "refresherrefresh" -> 
                    this.refresherrefreshTest = result;
                "refresherpulling" -> 
                    this.onRefresherpullingTest = result;
                "refresherrestore" -> 
                    this.onRefresherrestoreTest = result;
                "refresherabort" -> 
                    this.onRefresherabortTest = result;
                else -> 
                    {}
            }
        }
        ;
    }
    open lateinit var onRefresherrefresh: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherabort: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherrestore: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherpulling: (e: UniRefresherEvent) -> Unit;
    open lateinit var onScrolltolower: (e: UniScrollToLowerEvent) -> Unit;
    open lateinit var checkEventTest: (e: RefresherEventTest, eventName: String) -> Unit;
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
                return utsMapOf("container" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column", "flex" to 1)), "scroll" to padStyleMapOf(utsMapOf("backgroundColor" to "#eeeeee", "position" to "relative", "width" to "100%", "flex" to 1, "display" to "flex", "flexDirection" to "column", "borderColor" to "#FF0000")), "scroll-item" to padStyleMapOf(utsMapOf("marginLeft" to 6, "marginRight" to 6, "marginTop" to 6, "backgroundColor" to "#ffffff", "borderRadius" to 4)), "scroll-item-title" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 60, "lineHeight" to "60px", "textAlign" to "center", "color" to "#555555")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
