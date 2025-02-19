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
import io.dcloud.uniapp.extapi.stopPullDownRefresh as uni_stopPullDownRefresh;
open class GenPagesTemplateLongListLongList : BasePage {
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
        onReady(fun() {
            this.pageScrollView = this.`$refs`["pageScrollView"] as UniElement;
            this.headerHeight = (this.`$refs`["header"] as UniElement).offsetHeight;
            this.tabScrollView = this.`$refs`["tabScroll"] as UniElement;
            this.indicatorNode = this.`$refs`["indicator"] as UniElement;
            (this.`$refs`["swiper"] as UniElement).getBoundingClientRectAsync()!!.then(fun(res: DOMRect): UTSPromise<Unit> {
                this.swiperWidth = res.width;
                return this.cacheTabItemsSize();
            }
            ).then(fun(){
                this.updateTabIndicator(this.swiperIndex, this.swiperIndex, 1);
            }
            );
        }
        , __ins);
        onPullDownRefresh(fun() {
            (this.`$refs`["longPage"]!! as UTSArray<ComponentPublicInstance>)[this.swiperIndex].`$callMethod`("refreshData", fun(){
                uni_stopPullDownRefresh();
            }
            );
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_long_page = resolveComponent("long-page");
        return createElementVNode("scroll-view", utsMapOf("ref" to "pageScrollView", "class" to "page", "rebound" to false, "onStartnestedscroll" to _ctx.onStartNestedScroll, "onNestedprescroll" to _ctx.onNestedPreScroll), utsArrayOf(
            createElementVNode("view", utsMapOf("ref" to "header", "class" to "search-bar"), utsArrayOf(
                createElementVNode("input", utsMapOf("placeholder" to "搜索...", "maxlength" to "-1"))
            ), 512),
            createElementVNode("view", utsMapOf("class" to "swiper-list"), utsArrayOf(
                createElementVNode("scroll-view", utsMapOf("ref" to "tabScroll", "class" to "swiper-tabs", "direction" to "horizontal", "show-scrollbar" to false), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "flex-row", "style" to normalizeStyle(utsMapOf("align-self" to "flex-start"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, fun(item, index, __index, _cached): Any {
                            return createElementVNode("text", utsMapOf("ref_for" to true, "ref" to "swipertab", "space" to "nbsp", "class" to normalizeClass(utsArrayOf(
                                "swiper-tabs-item",
                                if (_ctx.swiperIndex == index) {
                                    "swiper-tabs-item-active";
                                } else {
                                    "";
                                }
                            )), "key" to index, "onClick" to fun(){
                                _ctx.onTabClick(index);
                            }
                            ), toDisplayString(item.name), 11, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 128)
                    ), 4),
                    createElementVNode("view", utsMapOf("ref" to "indicator", "class" to "swiper-tabs-indicator"), null, 512)
                ), 512),
                createElementVNode("swiper", utsMapOf("ref" to "swiper", "class" to "swiper-view", "current" to _ctx.swiperIndex, "onTransition" to _ctx.onSwiperTransition, "onAnimationfinish" to _ctx.onSwiperAnimationfinish), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, fun(item, index, __index, _cached): Any {
                        return createElementVNode("swiper-item", utsMapOf("class" to "swiper-item", "key" to index), utsArrayOf(
                            createVNode(_component_long_page, utsMapOf("ref_for" to true, "ref" to "longPage", "type" to item.type, "preload" to item.preload), null, 8, utsArrayOf(
                                "type",
                                "preload"
                            ))
                        ));
                    }
                    ), 128)
                ), 40, utsArrayOf(
                    "current",
                    "onTransition",
                    "onAnimationfinish"
                ))
            ))
        ), 40, utsArrayOf(
            "onStartnestedscroll",
            "onNestedprescroll"
        ));
    }
    open var swiperList: UTSArray<SwiperViewItem3> by `$data`;
    open var swiperIndex: Number by `$data`;
    open var pageScrollView: UniElement? by `$data`;
    open var headerHeight: Number by `$data`;
    open var animationFinishIndex: Number by `$data`;
    open var tabScrollView: UniElement? by `$data`;
    open var indicatorNode: UniElement? by `$data`;
    open var swiperWidth: Number by `$data`;
    open var swiperTabsRect: UTSArray<SwiperTabsItem2> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("swiperList" to utsArrayOf<SwiperViewItem3>(SwiperViewItem3(type = "UpdatedDate", name = "最新上架", preload = true), SwiperViewItem3(type = "FreeHot", name = "免费热榜", preload = false), SwiperViewItem3(type = "PaymentHot", name = "付费热榜", preload = false), SwiperViewItem3(type = "HotList", name = "热门总榜", preload = false)), "swiperIndex" to 0, "pageScrollView" to null as UniElement?, "headerHeight" to 0, "animationFinishIndex" to 0, "tabScrollView" to null as UniElement?, "indicatorNode" to null as UniElement?, "swiperWidth" to 0, "swiperTabsRect" to utsArrayOf<SwiperTabsItem2>());
    }
    override fun `$initMethods`() {
        this.onStartNestedScroll = fun(_: StartNestedScrollEvent): Boolean {
            return true;
        }
        ;
        this.onNestedPreScroll = fun(event: NestedPreScrollEvent) {
            val deltaY = event.deltaY;
            val scrollTop = this.pageScrollView!!.scrollTop;
            if (deltaY > 0) {
                if (scrollTop < this.headerHeight) {
                    val difference = this.headerHeight - scrollTop - deltaY;
                    if (difference > 0) {
                        this.pageScrollView!!.scrollBy(event.deltaX, deltaY);
                        event.consumed(event.deltaX, deltaY);
                    } else {
                        val top: Number = deltaY + difference;
                        event.consumed(event.deltaX, top.toFloat());
                        this.pageScrollView!!.scrollBy(event.deltaX, top.toFloat());
                    }
                }
            } else if (deltaY < 0) {
                if (scrollTop > 0) {
                    event.consumed(event.deltaX, deltaY);
                    this.pageScrollView!!.scrollBy(event.deltaX, deltaY);
                }
            }
        }
        ;
        this.onTabClick = fun(index: Number) {
            this.setSwiperIndex(index, false);
        }
        ;
        this.onSwiperTransition = fun(e: SwiperTransitionEvent) {
            val offset_x = e.detail.dx;
            val current_offset_x = offset_x % this.swiperWidth;
            val current_offset_i = offset_x / this.swiperWidth;
            val current_index = this.animationFinishIndex + parseInt(current_offset_i + "");
            var move_to_index = current_index;
            if (current_offset_x > 0 && move_to_index < this.swiperList.length - 1) {
                move_to_index += 1;
            } else if (current_offset_x < 0 && move_to_index > 0) {
                move_to_index -= 1;
            }
            val percentage = Math.abs(current_offset_x) / this.swiperWidth;
            this.updateTabIndicator(current_index, move_to_index, percentage);
            this.initSwiperItemData(move_to_index);
        }
        ;
        this.onSwiperAnimationfinish = fun(e: SwiperAnimationFinishEvent) {
            this.setSwiperIndex(e.detail.current, true);
            this.animationFinishIndex = e.detail.current;
        }
        ;
        this.cacheTabItemsSize = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    this.swiperTabsRect.length = 0;
                    val tabs = this.`$refs`["swipertab"] as UTSArray<UniElement>;
                    run {
                        var i: Number = 0;
                        while(i < tabs.length){
                            val element = tabs[i];
                            val rect = await(element.getBoundingClientRectAsync()!!);
                            this.swiperTabsRect.push(SwiperTabsItem2(x = rect.left, w = rect.width));
                            i++;
                        }
                    }
            });
        }
        ;
        this.setSwiperIndex = fun(index: Number, updateIndicator: Boolean) {
            if (this.swiperIndex === index) {
                return;
            }
            this.swiperIndex = index;
            this.initSwiperItemData(index);
            if (updateIndicator) {
                this.updateTabIndicator(index, index, 1);
            }
        }
        ;
        this.updateTabIndicator = fun(current_index: Number, move_to_index: Number, percentage: Number) {
            val current_size = this.swiperTabsRect[current_index];
            val move_to_size = this.swiperTabsRect[move_to_index];
            val indicator_line_x = lerpNumber3(current_size.x, move_to_size.x, percentage);
            val indicator_line_w = lerpNumber3(current_size.w, move_to_size.w, percentage);
            val x = indicator_line_x + indicator_line_w / 2;
            this.indicatorNode?.style?.setProperty("transform", "translateX(" + x + "px) scaleX(" + indicator_line_w + ")");
            val scroll_x = x - this.swiperWidth / 2;
            this.tabScrollView!!.scrollLeft = scroll_x;
        }
        ;
        this.initSwiperItemData = fun(index: Number) {
            if (!this.swiperList[index].preload) {
                this.swiperList[index].preload = true;
                (this.`$refs`["longPage"]!! as UTSArray<ComponentPublicInstance>)[index].`$callMethod`("loadData", null);
            }
        }
        ;
    }
    open lateinit var onStartNestedScroll: (_: StartNestedScrollEvent) -> Boolean;
    open lateinit var onNestedPreScroll: (event: NestedPreScrollEvent) -> Unit;
    open lateinit var onTabClick: (index: Number) -> Unit;
    open lateinit var onSwiperTransition: (e: SwiperTransitionEvent) -> Unit;
    open lateinit var onSwiperAnimationfinish: (e: SwiperAnimationFinishEvent) -> Unit;
    open lateinit var cacheTabItemsSize: () -> UTSPromise<Unit>;
    open lateinit var setSwiperIndex: (index: Number, updateIndicator: Boolean) -> Unit;
    open lateinit var updateTabIndicator: (current_index: Number, move_to_index: Number, percentage: Number) -> Unit;
    open lateinit var initSwiperItemData: (index: Number) -> Unit;
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
                return utsMapOf("flex-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "page" to padStyleMapOf(utsMapOf("flex" to 1)), "search-bar" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "swiper-list" to padStyleMapOf(utsMapOf("height" to "100%")), "swiper-tabs" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff", "flexDirection" to "column")), "swiper-tabs-item" to padStyleMapOf(utsMapOf("color" to "#555555", "fontSize" to 16, "paddingTop" to 12, "paddingRight" to 25, "paddingBottom" to 12, "paddingLeft" to 25, "whiteSpace" to "nowrap")), "swiper-tabs-item-active" to padStyleMapOf(utsMapOf("color" to "#007AFF")), "swiper-tabs-indicator" to padStyleMapOf(utsMapOf("width" to 1, "height" to 2, "backgroundColor" to "#007AFF")), "swiper-view" to padStyleMapOf(utsMapOf("flex" to 1)), "swiper-item" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf("longPage" to GenPagesTemplateLongListLongListPageClass);
    }
}
