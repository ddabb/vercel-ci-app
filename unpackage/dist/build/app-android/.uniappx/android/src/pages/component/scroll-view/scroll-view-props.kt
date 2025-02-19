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
open class GenPagesComponentScrollViewScrollViewProps : BasePage {
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
                while(i < 10){
                    val item = Item(id = "item" + i, label = "item" + i);
                    this.items.push(item);
                    i++;
                }
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_switch = resolveComponent("switch");
        val _component_slider = resolveComponent("slider");
        return createElementVNode("view", utsMapOf("class" to "page-scroll-view"), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "非下拉刷新的scroll-view属性示例")),
            if (isTrue(_ctx.scrollX)) {
                createElementVNode("scroll-view", utsMapOf("key" to 0, "direction" to "horizontal", "scroll-top" to _ctx.scrollTop, "scroll-left" to _ctx.scrollLeft, "upper-threshold" to _ctx.upperThreshold, "lower-threshold" to _ctx.lowerThreshold, "scroll-into-view" to _ctx.scrollIntoView, "enable-back-to-top" to _ctx.enableBackToTop, "scroll-with-animation" to _ctx.scrollWithAnimation, "style" to normalizeStyle(utsMapOf("flex-direction" to "row")), "class" to "uni-margin-wrap", "show-scrollbar" to _ctx.showScrollbar, "bounces" to _ctx.bounces, "onScrolltoupper" to _ctx.scrolltoupper, "onScrolltolower" to _ctx.scrolltolower, "onScroll" to _ctx.scroll, "onScrollend" to _ctx.scrollend, "ref" to "scrollViewX", "id" to "scrollViewX"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                            "item",
                            if (index == 9) {
                                "h-margin-right";
                            } else {
                                "";
                            }
                        )), "id" to ("horizontal_" + item.id)), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "uni-text"), toDisplayString(item.label), 1)
                        ), 10, utsArrayOf(
                            "id"
                        ));
                    }), 256)
                ), 44, utsArrayOf(
                    "scroll-top",
                    "scroll-left",
                    "upper-threshold",
                    "lower-threshold",
                    "scroll-into-view",
                    "enable-back-to-top",
                    "scroll-with-animation",
                    "show-scrollbar",
                    "bounces",
                    "onScrolltoupper",
                    "onScrolltolower",
                    "onScroll",
                    "onScrollend"
                ));
            } else {
                createElementVNode("scroll-view", utsMapOf("key" to 1, "direction" to "vertical", "scroll-top" to _ctx.scrollTop, "scroll-left" to _ctx.scrollLeft, "upper-threshold" to _ctx.upperThreshold, "lower-threshold" to _ctx.lowerThreshold, "scroll-into-view" to _ctx.scrollIntoView, "enable-back-to-top" to _ctx.enableBackToTop, "scroll-with-animation" to _ctx.scrollWithAnimation, "show-scrollbar" to _ctx.showScrollbar, "bounces" to _ctx.bounces, "onScrolltoupper" to _ctx.scrolltoupper, "onTouchmove" to _ctx.onTouchMove, "onScrolltolower" to _ctx.scrolltolower, "onScroll" to _ctx.scroll, "onScrollend" to _ctx.scrollend, "ref" to "scrollViewY", "id" to "scrollViewY", "class" to "uni-margin-wrap"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                            "item",
                            if (index == 9) {
                                "v-margin-bottom";
                            } else {
                                "";
                            }
                        )), "id" to item.id), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "uni-text"), toDisplayString(item.label), 1)
                        ), 10, utsArrayOf(
                            "id"
                        ));
                    }
                    ), 256)
                ), 40, utsArrayOf(
                    "scroll-top",
                    "scroll-left",
                    "upper-threshold",
                    "lower-threshold",
                    "scroll-into-view",
                    "enable-back-to-top",
                    "scroll-with-animation",
                    "show-scrollbar",
                    "bounces",
                    "onScrolltoupper",
                    "onTouchmove",
                    "onScrolltolower",
                    "onScroll",
                    "onScrollend"
                ));
            }
            ,
            createElementVNode("scroll-view", utsMapOf("class" to "uni-list", "showScrollbar" to true, "scroll-y" to true), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "点击状态栏回到顶部（仅iOS）"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.enableBackToTop, "onChange" to fun(){
                        _ctx.enableBackToTop = !_ctx.enableBackToTop;
                    }
                    ), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "是否显示滚动条"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.showScrollbar, "onChange" to fun(){
                        _ctx.showScrollbar = !_ctx.showScrollbar;
                    }
                    ), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "是否有反弹效果"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.bounces, "onChange" to fun(){
                        _ctx.bounces = !_ctx.bounces;
                    }
                    ), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "是否开启滚动时使用动画过渡"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.scrollWithAnimation, "onChange" to fun(){
                        _ctx.scrollWithAnimation = !_ctx.scrollWithAnimation;
                    }
                    ), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "是否横向滚动"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.scrollX, "onChange" to _ctx.changeDirectionX), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "是否竖向滚动"),
                    createVNode(_component_switch, utsMapOf("checked" to _ctx.scrollY, "onChange" to _ctx.changeDirectionY), null, 8, utsArrayOf(
                        "checked",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "拖动设置scroll-top")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                    createVNode(_component_slider, utsMapOf("max" to 1000, "min" to 0, "step" to 10, "value" to _ctx.scrollTop, "show-value" to true, "onChange" to _ctx.handleChangeScrollTop), null, 8, utsArrayOf(
                        "value",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "拖动设置scroll-left")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                    createVNode(_component_slider, utsMapOf("max" to 1000, "min" to 0, "step" to 10, "value" to _ctx.scrollLeft, "show-value" to true, "onChange" to _ctx.handleChangeScrollLeft), null, 8, utsArrayOf(
                        "value",
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "设置触发scrolltoupper的距离"),
                    createElementVNode("input", utsMapOf("class" to "uni-list-cell-input", "type" to "number", "value" to _ctx.upperThreshold, "onInput" to _ctx.handleUpperThresholdInput), null, 40, utsArrayOf(
                        "value",
                        "onInput"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("text", null, "设置触发scrolltolower的距离"),
                    createElementVNode("input", utsMapOf("class" to "uni-list-cell-input", "type" to "number", "value" to _ctx.lowerThreshold, "onInput" to _ctx.handleLowerThresholdInput), null, 40, utsArrayOf(
                        "value",
                        "onInput"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"), utsArrayOf(
                    createElementVNode("button", utsMapOf("type" to "primary", "class" to "button", "onClick" to _ctx.handleScrollIntoView), " 滚动到id为`item3`的子视图 ", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-padding"))
            ))
        ));
    }
    open var items: UTSArray<Item> by `$data`;
    open var scrollX: Boolean by `$data`;
    open var scrollY: Boolean by `$data`;
    open var bounces: Boolean by `$data`;
    open var scrollTop: Number by `$data`;
    open var scrollLeft: Number by `$data`;
    open var scrollChangeTop: Number by `$data`;
    open var scrollIntoView: String by `$data`;
    open var enableBackToTop: Boolean by `$data`;
    open var scrollWithAnimation: Boolean by `$data`;
    open var showScrollbar: Boolean by `$data`;
    open var upperThreshold: Number by `$data`;
    open var lowerThreshold: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("items" to utsArrayOf<Item>(), "scrollX" to false, "scrollY" to true, "bounces" to false, "scrollTop" to 0, "scrollLeft" to 0, "scrollChangeTop" to 0, "scrollIntoView" to "", "enableBackToTop" to false, "scrollWithAnimation" to false, "showScrollbar" to true, "upperThreshold" to 50, "lowerThreshold" to 50);
    }
    override fun `$initMethods`() {
        this.handleChangeScrollLeft = fun(e: UniSliderChangeEvent) {
            this.scrollLeft = e.detail.value;
        }
        ;
        this.handleChangeScrollTop = fun(e: UniSliderChangeEvent) {
            this.scrollTop = e.detail.value;
        }
        ;
        this.changeDirectionX = fun() {
            this.scrollX = !this.scrollX;
            if (this.scrollX) {
                this.scrollY = false;
            }
            this.scrollTop = 0;
            this.scrollLeft = 0;
        }
        ;
        this.changeDirectionY = fun() {
            this.scrollY = !this.scrollY;
            if (this.scrollY) {
                this.scrollX = false;
            }
            this.scrollTop = 0;
            this.scrollLeft = 0;
        }
        ;
        this.handleScrollIntoView = fun() {
            if (this.scrollX) {
                this.scrollIntoView = "horizontal_item3";
            } else {
                this.scrollIntoView = "item3";
            }
            setTimeout(fun(){
                this.scrollIntoView = "";
            }
            , 0);
        }
        ;
        this.handleUpperThresholdInput = fun(e: InputEvent) {
            val value = e.detail.value;
            if (value == "") {
                this.upperThreshold = 50;
            } else {
                this.upperThreshold = parseInt(e.detail.value);
            }
        }
        ;
        this.handleLowerThresholdInput = fun(e: InputEvent) {
            val value = e.detail.value;
            if (value == "") {
                this.lowerThreshold = 50;
            } else {
                this.lowerThreshold = parseInt(e.detail.value);
            }
        }
        ;
        this.scrolltoupper = fun() {
            console.log("滚动到顶部");
        }
        ;
        this.scrolltolower = fun() {
            console.log("滚动到底部");
        }
        ;
        this.scroll = fun(e: ScrollEvent) {
            this.scrollChangeTop = e.detail.scrollTop;
            console.log("scroll-top : " + e.detail.scrollTop + " scroll-left : " + e.detail.scrollLeft);
        }
        ;
        this.scrollend = fun() {
            console.log("滚动停止");
        }
        ;
        this.onTouchMove = fun() {
            console.log("TouchMove");
        }
        ;
        this.checkScrollHeight = fun(): Boolean {
            var element = this.`$refs`["scrollViewY"];
            if (element != null) {
                var scrollHeight = (element as UniElement).scrollHeight;
                console.log("checkScrollHeight" + scrollHeight);
                if (scrollHeight > 1900) {
                    return true;
                }
            }
            return false;
        }
        ;
        this.checkScrollWidth = fun(): Boolean {
            var element = this.`$refs`["scrollViewX"];
            if (element != null) {
                var scrollWidth = (element as UniElement).scrollWidth;
                console.log("checkScrollWidth---" + scrollWidth);
                if (scrollWidth > 1900) {
                    return true;
                }
            }
            return false;
        }
        ;
    }
    open lateinit var handleChangeScrollLeft: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var handleChangeScrollTop: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var changeDirectionX: () -> Unit;
    open lateinit var changeDirectionY: () -> Unit;
    open lateinit var handleScrollIntoView: () -> Unit;
    open lateinit var handleUpperThresholdInput: (e: InputEvent) -> Unit;
    open lateinit var handleLowerThresholdInput: (e: InputEvent) -> Unit;
    open lateinit var scrolltoupper: () -> Unit;
    open lateinit var scrolltolower: () -> Unit;
    open lateinit var scroll: (e: ScrollEvent) -> Unit;
    open lateinit var scrollend: () -> Unit;
    open lateinit var onTouchMove: () -> Unit;
    open lateinit var checkScrollHeight: () -> Boolean;
    open lateinit var checkScrollWidth: () -> Boolean;
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
                return utsMapOf("uni-margin-wrap" to padStyleMapOf(utsMapOf("height" to 250, "marginTop" to 0, "marginRight" to 25, "marginBottom" to 25, "marginLeft" to 25)), "item" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "height" to 250, "width" to "100%", "backgroundColor" to "#F0FFFF", "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#D2691E")), "uni-list" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 50)), "uni-slider" to padStyleMapOf(utsMapOf("justifyContent" to "center")), "uni-list-cell-input" to padStyleMapOf(utsMapOf("width" to 50, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#cccccc", "textAlign" to "center")), "button" to padStyleMapOf(utsMapOf("flex" to 1)), "v-margin-bottom" to padStyleMapOf(utsMapOf("marginBottom" to 50)), "h-margin-right" to padStyleMapOf(utsMapOf("marginRight" to 50)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
