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
open class GenPagesComponentListViewListViewRefresh : BasePage {
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
            setTimeout(fun(){
                this.list_show = true;
            }
            , 500);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return if (isTrue(_ctx.list_show)) {
            createElementVNode("list-view", utsMapOf("key" to 0, "id" to "listview", "style" to normalizeStyle(utsMapOf("flex" to "1")), "show-scrollbar" to "false", "refresher-enabled" to true, "refresher-triggered" to _ctx.refresherTriggered, "onRefresherrefresh" to _ctx.onRefresherrefresh, "onRefresherabort" to _ctx.onRefresherabort, "onRefresherrestore" to _ctx.onRefresherrestore, "onRefresherpulling" to _ctx.onRefresherpulling), utsArrayOf(
                createElementVNode("list-item", utsMapOf("class" to "item"), utsArrayOf(
                    createElementVNode("text", null, "向下滑动触发下拉刷新")
                )),
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.item_count, fun(index, __key, __index, _cached): Any {
                    return createElementVNode("list-item", utsMapOf("class" to "item"), utsArrayOf(
                        createElementVNode("text", null, "item-------" + toDisplayString(index), 1)
                    ));
                }), 256)
            ), 44, utsArrayOf(
                "refresher-triggered",
                "onRefresherrefresh",
                "onRefresherabort",
                "onRefresherrestore",
                "onRefresherpulling"
            ));
        } else {
            createCommentVNode("v-if", true);
        }
        ;
    }
    open var item_count: Number by `$data`;
    open var list_show: Boolean by `$data`;
    open var refresherTriggered: Boolean by `$data`;
    open var refresherrefreshTest: String by `$data`;
    open var onRefresherabortTest: String by `$data`;
    open var onRefresherrestoreTest: String by `$data`;
    open var onRefresherpullingTest: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("item_count" to 20, "list_show" to false, "refresherTriggered" to true, "refresherrefreshTest" to "", "onRefresherabortTest" to "", "onRefresherrestoreTest" to "", "onRefresherpullingTest" to "");
    }
    override fun `$initMethods`() {
        this.onRefresherrefresh = fun(e: UniRefresherEvent) {
            console.log("refresherrefresh-----下拉刷新被触发", e.detail.dy);
            this.refresherTriggered = true;
            this.checkEventTest(RefresherEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherrefresh");
            setTimeout(fun(){
                this.refresherTriggered = false;
            }
            , 1000);
        }
        ;
        this.onRefresherabort = fun(e: UniRefresherEvent) {
            console.log("onRefresherabort------下拉刷新被中止", e.detail);
            this.checkEventTest(RefresherEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherabort");
        }
        ;
        this.onRefresherrestore = fun(e: UniRefresherEvent) {
            console.log("onRefresherrestore------下拉刷新被复位", e.detail.dy);
            this.checkEventTest(RefresherEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherrestore");
        }
        ;
        this.onRefresherpulling = fun(e: UniRefresherEvent) {
            console.log("onRefresherpulling------拉刷新控件被下拉-dy=" + e.detail.dy);
            this.checkEventTest(RefresherEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, dy = e.detail.dy), "refresherpulling");
        }
        ;
        this.checkEventTest = fun(e: RefresherEventTest1, eventName: String) {
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
    open lateinit var checkEventTest: (e: RefresherEventTest1, eventName: String) -> Unit;
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
                return utsMapOf("item" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 0, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "backgroundColor" to "#ffffff", "borderRadius" to 5)), "button_item" to padStyleMapOf(utsMapOf("width" to 200)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
