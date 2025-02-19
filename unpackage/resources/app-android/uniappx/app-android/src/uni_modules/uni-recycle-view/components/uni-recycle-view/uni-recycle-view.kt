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
open class GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        provide("itemHeight", this.itemHeight);
        provide("setCachedSize", fun(item: Any, size: Number){
            if (this.itemHeight != 0) {
                return;
            }
            if (!this.hasDefaultSize) {
                this.defaultItemSize = size;
                this.hasDefaultSize = true;
            }
            this.cachedSize.set(item, size);
        }
        );
        provide("getCachedSize", fun(item: Any): Number? {
            return this.cachedSize.get(item);
        }
        );
        onCreated(fun() {
            if (this.itemHeight != 0) {
                this.defaultItemSize = this.itemHeight;
            }
            this.placeholderHeight = this.list.length * this.defaultItemSize;
        }
        , __ins);
        onMounted(fun() {
            nextTick(fun(){
                uni_createSelectorQuery().`in`(this).select(".uni-recycle-view-main").boundingClientRect().exec(fun(ret){
                    this.scrollElementHeight = (ret[0] as NodeInfo).height!!;
                    this.rearrange(0);
                    this.initialized = true;
                }
                );
            }
            );
        }
        , __ins);
        this.`$watch`(fun(): Any? {
            return this.list;
        }
        , fun(list: UTSArray<Any>) {
            this.cachedSize.forEach(fun(_: Number, key: Any){
                if (!list.includes(key)) {
                    this.cachedSize.`delete`(key);
                }
            }
            );
        }
        , WatchOptions(deep = true));
        this.`$watch`(fun(): Any? {
            return this.defaultItemSize;
        }
        , fun() {
            this.rearrange(this.lastScrollTop);
        }
        );
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("scroll-view", utsMapOf("class" to "uni-recycle-view-main", "ref" to "scroll", "type" to _ctx.type, "direction" to _ctx.direction, "associative-container" to _ctx.associativeContainer, "enable-back-to-top" to _ctx.enableBackToTop, "bounces" to _ctx.bounces, "upper-threshold" to _ctx.upperThreshold, "lower-threshold" to _ctx.lowerThreshold, "scroll-top" to _ctx.scrollTop, "scroll-left" to _ctx.scrollLeft, "scroll-into-view" to _ctx.scrollIntoView, "scroll-with-animation" to _ctx.scrollWithAnimation, "refresher-enabled" to _ctx.refresherEnabled, "refresher-threshold" to _ctx.refresherThreshold, "refresher-max-drag-distance" to _ctx.refresherMaxDragDistance, "refresher-default-style" to _ctx.refresherDefaultStyle, "refresher-background" to _ctx.refresherBackground, "refresher-triggered" to _ctx.refresherTriggered, "show-scrollbar" to _ctx.showScrollbar, "custom-nested-scroll" to _ctx.customNestedScroll, "nested-scroll-child" to _ctx.nestedScrollChild, "onScroll" to _ctx.onScroll, "onScrollend" to _ctx.onScrollEnd, "onScrolltolower" to _ctx.onScrollToLower, "onScrolltoupper" to _ctx.onScrollToUpper, "onRefresherabort" to _ctx.onRefresherAbort, "onRefresherpulling" to _ctx.onRefresherPulling, "onRefresherrefresh" to _ctx.onRefresherRefresh, "onRefresherrestore" to _ctx.onRefresherRestore), utsArrayOf(
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to (_ctx.placeholderHeight + "px"))), "class" to "uni-recycle-view-placeholder"), utsArrayOf(
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("top" to (_ctx.containerTop + "px"))), "class" to "uni-recycle-view-container"), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "default", utsMapOf("items" to _ctx.items))
                ), 4)
            ), 4)
        ), 40, utsArrayOf(
            "type",
            "direction",
            "associative-container",
            "enable-back-to-top",
            "bounces",
            "upper-threshold",
            "lower-threshold",
            "scroll-top",
            "scroll-left",
            "scroll-into-view",
            "scroll-with-animation",
            "refresher-enabled",
            "refresher-threshold",
            "refresher-max-drag-distance",
            "refresher-default-style",
            "refresher-background",
            "refresher-triggered",
            "show-scrollbar",
            "custom-nested-scroll",
            "nested-scroll-child",
            "onScroll",
            "onScrollend",
            "onScrolltolower",
            "onScrolltoupper",
            "onRefresherabort",
            "onRefresherpulling",
            "onRefresherrefresh",
            "onRefresherrestore"
        ));
    }
    open var type: String by `$props`;
    open var direction: String by `$props`;
    open var associativeContainer: String by `$props`;
    open var enableBackToTop: Boolean by `$props`;
    open var bounces: Boolean by `$props`;
    open var upperThreshold: Number by `$props`;
    open var lowerThreshold: Number by `$props`;
    open var scrollTop: Number by `$props`;
    open var scrollLeft: Number by `$props`;
    open var scrollIntoView: String by `$props`;
    open var scrollWithAnimation: Boolean by `$props`;
    open var refresherEnabled: Boolean by `$props`;
    open var refresherThreshold: Number by `$props`;
    open var refresherMaxDragDistance: Number? by `$props`;
    open var refresherDefaultStyle: String by `$props`;
    open var refresherBackground: String by `$props`;
    open var refresherTriggered: Boolean by `$props`;
    open var showScrollbar: Boolean by `$props`;
    open var customNestedScroll: Boolean by `$props`;
    open var nestedScrollChild: String by `$props`;
    open var list: UTSArray<Any> by `$props`;
    open var itemHeight: Number by `$props`;
    open var items: UTSArray<Any> by `$data`;
    open var containerTop: Number by `$data`;
    open var scrollElementHeight: Number by `$data`;
    open var placeholderHeight: Number by `$data`;
    open var offsetThreshold: UTSArray<Number> by `$data`;
    open var cachedSize: Map<Any, Number> by `$data`;
    open var initialized: Boolean by `$data`;
    open var hasDefaultSize: Boolean by `$data`;
    open var defaultItemSize: Number by `$data`;
    open var lastScrollTop: Number by `$data`;
    open var rearrangeQueue: UTSArray<Number> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("items" to utsArrayOf<Any>(), "containerTop" to 0, "scrollElementHeight" to 0, "placeholderHeight" to 0, "offsetThreshold" to utsArrayOf(
            0,
            0,
            0,
            0
        ), "cachedSize" to Map<Any, Number>(), "initialized" to false, "hasDefaultSize" to false, "defaultItemSize" to 40, "lastScrollTop" to 0, "rearrangeQueue" to utsArrayOf<Number>());
    }
    override fun `$initMethods`() {
        this.onScrollEnd = fun(e: UniScrollEvent) {
            this.`$emit`("scrollend", e);
        }
        ;
        this.onScrollToLower = fun(e: UniScrollToLowerEvent) {
            this.`$emit`("scrolltolower", e);
        }
        ;
        this.onScrollToUpper = fun(e: UniScrollToUpperEvent) {
            this.`$emit`("scrolltoupper", e);
        }
        ;
        this.onRefresherAbort = fun(e: UniRefresherEvent) {
            this.`$emit`("refresherabort", e);
        }
        ;
        this.onRefresherPulling = fun(e: UniRefresherEvent) {
            this.`$emit`("refresherpulling", e);
        }
        ;
        this.onRefresherRefresh = fun(e: UniRefresherEvent) {
            this.`$emit`("refresherrefresh", e);
        }
        ;
        this.onRefresherRestore = fun(e: UniRefresherEvent) {
            this.`$emit`("refresherrestore", e);
        }
        ;
        this.onScroll = fun(e: UniScrollEvent) {
            this.`$emit`("scroll", e);
            if (!this.initialized) {
                return;
            }
            val scrollTop = e.detail.scrollTop;
            if (scrollTop === this.lastScrollTop || scrollTop < 0) {
                return;
            }
            this.lastScrollTop = scrollTop;
            if (scrollTop < this.offsetThreshold[1] || scrollTop > this.offsetThreshold[2]) {
                this.queue(scrollTop);
            }
        }
        ;
        this.queue = fun(scrollTop: Number) {
            this.rearrangeQueue.push(scrollTop);
            setTimeout(fun(){
                this.flush();
            }
            , 50);
        }
        ;
        this.flush = fun() {
            val queueLength = this.rearrangeQueue.length;
            if (queueLength == 0) {
                return;
            }
            val lastScrollTop = this.rearrangeQueue[queueLength - 1];
            this.rearrange(lastScrollTop);
            this.rearrangeQueue = utsArrayOf<Number>();
        }
        ;
        this.rearrange = fun(scrollTop: Number) {
            this.offsetThreshold[0] = Math.max(scrollTop - this.scrollElementHeight * 5, 0);
            this.offsetThreshold[1] = Math.max(scrollTop - this.scrollElementHeight * 3, 0);
            this.offsetThreshold[2] = Math.min(scrollTop + this.scrollElementHeight * 4, this.placeholderHeight);
            this.offsetThreshold[3] = Math.min(scrollTop + this.scrollElementHeight * 6, this.placeholderHeight);
            val offsetStart = this.offsetThreshold[0];
            val offsetEnd = this.offsetThreshold[3];
            val items = utsArrayOf<Any>();
            val defaultItemSize = this.defaultItemSize;
            val cachedSize = this.cachedSize;
            val list = this.list;
            var tempTotalHeight: Number = 0;
            var containerTop: Number = 0;
            var start = false;
            var end = false;
            run {
                var i: Number = 0;
                while(i < list.length){
                    val item = list[i];
                    var itemSize = defaultItemSize;
                    val cachedItemSize = cachedSize.get(item);
                    if (cachedItemSize != null) {
                        itemSize = cachedItemSize;
                    }
                    tempTotalHeight += itemSize;
                    if (end) {
                        i++;
                        continue;
                    }
                    if (tempTotalHeight < offsetStart) {
                        containerTop = tempTotalHeight;
                    } else if (tempTotalHeight >= offsetStart && tempTotalHeight <= offsetEnd) {
                        if (start == false) {
                            start = true;
                        }
                        items.push(item);
                    } else {
                        if (!end) {
                            end = true;
                        }
                    }
                    i++;
                }
            }
            this.placeholderHeight = tempTotalHeight;
            this.items = items;
            this.containerTop = containerTop;
        }
        ;
    }
    open lateinit var onScrollEnd: (e: UniScrollEvent) -> Unit;
    open lateinit var onScrollToLower: (e: UniScrollToLowerEvent) -> Unit;
    open lateinit var onScrollToUpper: (e: UniScrollToUpperEvent) -> Unit;
    open lateinit var onRefresherAbort: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherPulling: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherRefresh: (e: UniRefresherEvent) -> Unit;
    open lateinit var onRefresherRestore: (e: UniRefresherEvent) -> Unit;
    open lateinit var onScroll: (e: UniScrollEvent) -> Unit;
    open lateinit var queue: (scrollTop: Number) -> Unit;
    open lateinit var flush: () -> Unit;
    open lateinit var rearrange: (scrollTop: Number) -> Unit;
    companion object {
        var name = "uni-recycle-view";
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-recycle-view-placeholder" to padStyleMapOf(utsMapOf("position" to "relative", "overflow" to "hidden")), "uni-recycle-view-container" to padStyleMapOf(utsMapOf("position" to "absolute", "width" to "100%")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("scroll" to null, "scrollend" to null, "scrolltolower" to null, "scrolltoupper" to null, "refresherabort" to null, "refresherpulling" to null, "refresherrefresh" to null, "refresherrestore" to null);
        var props = normalizePropsOptions(utsMapOf("type" to utsMapOf("type" to "String", "default" to ""), "direction" to utsMapOf("type" to "String", "default" to "vertical"), "associativeContainer" to utsMapOf("type" to "String", "default" to ""), "enableBackToTop" to utsMapOf("type" to "Boolean", "default" to false), "bounces" to utsMapOf("type" to "Boolean", "default" to true), "upperThreshold" to utsMapOf("type" to "Number", "default" to 50), "lowerThreshold" to utsMapOf("type" to "Number", "default" to 50), "scrollTop" to utsMapOf("type" to "Number", "default" to 0), "scrollLeft" to utsMapOf("type" to "Number", "default" to 0), "scrollIntoView" to utsMapOf("type" to "String", "default" to ""), "scrollWithAnimation" to utsMapOf("type" to "Boolean", "default" to false), "refresherEnabled" to utsMapOf("type" to "Boolean", "default" to false), "refresherThreshold" to utsMapOf("type" to "Number", "default" to 45), "refresherMaxDragDistance" to utsMapOf("type" to "Number"), "refresherDefaultStyle" to utsMapOf("type" to "String", "default" to "black"), "refresherBackground" to utsMapOf("type" to "String", "default" to "transparent"), "refresherTriggered" to utsMapOf("type" to "Boolean", "default" to false), "showScrollbar" to utsMapOf("type" to "Boolean", "default" to true), "customNestedScroll" to utsMapOf("type" to "Boolean", "default" to false), "nestedScrollChild" to utsMapOf("type" to "String", "default" to ""), "list" to utsMapOf("type" to "Array", "default" to utsArrayOf<Any>()), "itemHeight" to utsMapOf("type" to "Number", "default" to 0)));
        var propsNeedCastKeys = utsArrayOf(
            "type",
            "direction",
            "associativeContainer",
            "enableBackToTop",
            "bounces",
            "upperThreshold",
            "lowerThreshold",
            "scrollTop",
            "scrollLeft",
            "scrollIntoView",
            "scrollWithAnimation",
            "refresherEnabled",
            "refresherThreshold",
            "refresherDefaultStyle",
            "refresherBackground",
            "refresherTriggered",
            "showScrollbar",
            "customNestedScroll",
            "nestedScrollChild",
            "list",
            "itemHeight"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
