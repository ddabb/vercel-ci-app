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
open class GenPagesTemplateSwiperList2SwiperList2 : BasePage {
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
            run {
                var i: Number = 0;
                while(i < 4){
                    this.swiperList.push(SwiperViewItem2(title = "Tab " + i));
                    i++;
                }
            }
        }
        , __ins);
        onReady(fun() {
            this.tabScrollView = this.`$refs`["tabScroll"] as UniElement;
            (this.`$refs`["swiper"] as UniElement).getBoundingClientRectAsync()!!.then(fun(res: DOMRect){
                this.swiperWidth = res.width;
                this.updateTabIndicator(this.swiperIndex, this.swiperIndex, 1);
            }
            );
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "swiper-list"), utsArrayOf(
            createElementVNode("scroll-view", utsMapOf("ref" to "tabScroll", "class" to "swiper-tabs", "direction" to "horizontal", "show-scrollbar" to false), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "flex-row", "style" to normalizeStyle(utsMapOf("align-self" to "flex-start"))), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, fun(item, index, __index, _cached): Any {
                        return createElementVNode("text", utsMapOf("ref_for" to true, "ref" to "swipertab", "class" to normalizeClass(utsArrayOf(
                            "swiper-tabs-item",
                            if (_ctx.swiperIndex == index) {
                                "swiper-tabs-item-active";
                            } else {
                                "";
                            }
                        )), "key" to index, "onClick" to fun(){
                            _ctx.onTabClick(index);
                        }
                        ), toDisplayString(item.title), 11, utsArrayOf(
                            "onClick"
                        ));
                    }
                    ), 128)
                ), 4)
            ), 512),
            createElementVNode("swiper", utsMapOf("ref" to "swiper", "class" to "swiper-view", "current" to _ctx.swiperIndex, "onTransition" to _ctx.onSwiperTransition, "onAnimationfinish" to _ctx.onSwiperAnimationfinish), utsArrayOf(
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.swiperList, fun(_, index, __index, _cached): Any {
                    return createElementVNode("swiper-item", utsMapOf("class" to "swiper-item", "key" to index), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "swiper-item-text"), toDisplayString(index), 1)
                    ));
                }
                ), 128)
            ), 40, utsArrayOf(
                "current",
                "onTransition",
                "onAnimationfinish"
            ))
        ));
    }
    open var swiperList: UTSArray<SwiperViewItem2> by `$data`;
    open var swiperIndex: Number by `$data`;
    open var tabScrollView: UniElement? by `$data`;
    open var animationFinishIndex: Number by `$data`;
    open var swiperWidth: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("swiperList" to utsArrayOf<SwiperViewItem2>(), "swiperIndex" to 0, "tabScrollView" to null as UniElement?, "animationFinishIndex" to 0, "swiperWidth" to 0);
    }
    override fun `$initMethods`() {
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
            if (current_index != move_to_index) {
                this.updateTabIndicator(current_index, move_to_index, percentage);
            }
        }
        ;
        this.onSwiperAnimationfinish = fun(e: SwiperAnimationFinishEvent) {
            this.setSwiperIndex(e.detail.current, true);
            this.animationFinishIndex = e.detail.current;
        }
        ;
        this.setSwiperIndex = fun(index: Number, updateIndicator: Boolean) {
            if (this.swiperIndex == index) {
                return;
            }
            this.swiperIndex = index;
            if (updateIndicator) {
                this.updateTabIndicator(index, index, 1);
            }
        }
        ;
        this.updateTabIndicator = fun(current_index: Number, move_to_index: Number, percentage: Number) {
            if (percentage == 0) {
                return;
            }
            val min_ratio: Number = 1;
            val max_ratio: Number = 1.3;
            val tabs = this.`$refs`["swipertab"] as UTSArray<UniElement>;
            val current_node = tabs[current_index];
            val move_to_node = tabs[move_to_index];
            val current_scale = lerpNumber2(min_ratio, max_ratio, 1 - percentage);
            current_node.style.setProperty("transform", "scale(" + current_scale + ")");
            val move_to_scale = lerpNumber2(min_ratio, max_ratio, percentage);
            move_to_node.style.setProperty("transform", "scale(" + move_to_scale + ")");
            val target_x = lerpNumber2(current_node.offsetLeft, move_to_node.offsetLeft, percentage);
            val center_x = target_x + move_to_node.offsetWidth / 2 - this.swiperWidth / 2;
            this.tabScrollView!!.scrollLeft = center_x;
        }
        ;
    }
    open lateinit var onTabClick: (index: Number) -> Unit;
    open lateinit var onSwiperTransition: (e: SwiperTransitionEvent) -> Unit;
    open lateinit var onSwiperAnimationfinish: (e: SwiperAnimationFinishEvent) -> Unit;
    open lateinit var setSwiperIndex: (index: Number, updateIndicator: Boolean) -> Unit;
    open lateinit var updateTabIndicator: (current_index: Number, move_to_index: Number, percentage: Number) -> Unit;
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
                return utsMapOf("flex-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "swiper-list" to padStyleMapOf(utsMapOf("flex" to 1)), "swiper-tabs-item" to padStyleMapOf(utsMapOf("color" to "#555555", "fontSize" to 16, "marginTop" to 15, "marginRight" to 25, "marginBottom" to 5, "marginLeft" to 25, "whiteSpace" to "nowrap")), "swiper-tabs-item-active" to padStyleMapOf(utsMapOf("color" to "#000000")), "swiper-view" to padStyleMapOf(utsMapOf("flex" to 1)), "swiper-item" to padStyleMapOf(utsMapOf("flex" to 1, "alignItems" to "center", "justifyContent" to "center")), "swiper-item-text" to padStyleMapOf(utsMapOf("fontSize" to 72, "fontWeight" to "bold")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
