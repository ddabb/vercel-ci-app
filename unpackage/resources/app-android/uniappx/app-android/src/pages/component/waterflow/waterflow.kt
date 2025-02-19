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
open class GenPagesComponentWaterflowWaterflow : BasePage {
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
            this.scrollData = utsArrayOf<flowItemData>(flowItemData(height = 300, text = "item---0"), flowItemData(height = 150, text = "item---1"), flowItemData(height = 120, text = "item---2"), flowItemData(height = 100, text = "item---3"), flowItemData(height = 100, text = "item---4"), flowItemData(height = 150, text = "item---5"), flowItemData(height = 140, text = "item---6"), flowItemData(height = 190, text = "item---7"), flowItemData(height = 160, text = "item---8"), flowItemData(height = 120, text = "item---9"), flowItemData(height = 109, text = "item---10"), flowItemData(height = 102, text = "item---11"), flowItemData(height = 123, text = "item---12"), flowItemData(height = 156, text = "item---13"), flowItemData(height = 177, text = "item---14"), flowItemData(height = 105, text = "item---15"), flowItemData(height = 110, text = "item---16"), flowItemData(height = 90, text = "item---17"), flowItemData(height = 130, text = "item---18"), flowItemData(height = 140, text = "item---19"));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass);
        val _component_slider = resolveComponent("slider");
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createElementVNode("waterflow", utsMapOf("cross-axis-count" to _ctx.cross_axis_count, "main-axis-gap" to _ctx.main_axis_gap, "cross-axis-gap" to _ctx.cross_axis_gap, "bounces" to _ctx.bounces_boolean, "upper-threshold" to _ctx.upper_threshold_input, "lower-threshold" to _ctx.lower_threshold_input, "scroll-top" to _ctx.scroll_top_input, "scroll-left" to _ctx.scroll_left_input, "show-scrollbar" to _ctx.show_scrollbar_boolean, "scroll-into-view" to _ctx.scrollIntoView, "scroll-with-animation" to _ctx.scroll_with_animation_boolean, "refresher-enabled" to _ctx.refresher_enabled_boolean, "refresher-background" to _ctx.refresher_background_input, "refresher-triggered" to _ctx.refresher_triggered_boolean, "refresher-default-style" to _ctx.refresher_default_style_input, "onClick" to utsArrayOf(
                    _ctx.waterflow_click,
                    _ctx.waterflow_tap
                ), "onTouchstart" to _ctx.waterflow_touchstart, "onTouchmove" to _ctx.waterflow_touchmove, "onTouchcancel" to _ctx.waterflow_touchcancel, "onTouchend" to _ctx.waterflow_touchend, "onLongpress" to _ctx.waterflow_longpress, "onRefresherpulling" to _ctx.waterflow_refresherpulling, "onRefresherrefresh" to _ctx.waterflow_refresherrefresh, "onRefresherrestore" to _ctx.waterflow_refresherrestore, "onRefresherabort" to _ctx.waterflow_refresherabort, "onScrolltoupper" to _ctx.waterflow_scrolltoupper, "ref" to "waterflow", "onScrolltolower" to _ctx.waterflow_scrolltolower, "onScroll" to _ctx.waterflow_scroll, "onScrollend" to _ctx.waterflow_scrollend, "style" to normalizeStyle(utsMapOf("width" to "100%")), "id" to "waterflow", "padding" to _ctx.waterflowPadding), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, fun(item, index, __index, _cached): Any {
                        return createElementVNode("flow-item", utsMapOf("key" to index, "id" to item.text, "onClick" to utsArrayOf(
                            _ctx.flow_item_click,
                            _ctx.flow_item_tap
                        ), "style" to normalizeStyle(utsMapOf("height" to item.height)), "onTouchstart" to _ctx.flow_item_touchstart, "onTouchmove" to _ctx.flow_item_touchmove, "onTouchcancel" to _ctx.flow_item_touchcancel, "onTouchend" to _ctx.flow_item_touchend, "onLongpress" to _ctx.flow_item_longpress, "class" to "flow-item", "type" to "1"), utsArrayOf(
                            createElementVNode("text", null, toDisplayString(item.text), 1)
                        ), 44, utsArrayOf(
                            "id",
                            "onClick",
                            "onTouchstart",
                            "onTouchmove",
                            "onTouchcancel",
                            "onTouchend",
                            "onLongpress"
                        ));
                    }
                    ), 128),
                    createElementVNode("flow-item", utsMapOf("slot" to "refresher", "id" to "refresher", "type" to "2", "class" to "refresh-box"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "tip-text"), toDisplayString(_ctx.text[_ctx.state]), 1)
                    )),
                    withDirectives(createElementVNode("flow-item", utsMapOf("slot" to "load-more", "id" to "loadmore", "type" to "6", "class" to "load-more-box"), utsArrayOf(
                        createElementVNode("text", null, "加载更多")
                    ), 512), utsArrayOf(
                        utsArrayOf(
                            vShow,
                            _ctx.isLoadMore
                        )
                    ))
                ), 44, utsArrayOf(
                    "cross-axis-count",
                    "main-axis-gap",
                    "cross-axis-gap",
                    "bounces",
                    "upper-threshold",
                    "lower-threshold",
                    "scroll-top",
                    "scroll-left",
                    "show-scrollbar",
                    "scroll-into-view",
                    "scroll-with-animation",
                    "refresher-enabled",
                    "refresher-background",
                    "refresher-triggered",
                    "refresher-default-style",
                    "onClick",
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchcancel",
                    "onTouchend",
                    "onLongpress",
                    "onRefresherpulling",
                    "onRefresherrefresh",
                    "onRefresherrestore",
                    "onRefresherabort",
                    "onScrolltoupper",
                    "onScrolltolower",
                    "onScroll",
                    "onScrollend",
                    "padding"
                ))
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "direction" to "vertical"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "设置当前下拉刷新状态，true 表示下拉刷新已经被触发，false 表示下拉刷新未被触发", "onChange" to _ctx.change_refresher_triggered_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "开启下拉刷新", "onChange" to _ctx.change_refresher_enabled_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "开启自定义样式", "onChange" to _ctx.change_refresher_style_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否在设置滚动条位置时使用滚动动画，设置false没有滚动动画", "onChange" to _ctx.change_scroll_with_animation_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "控制是否出现滚动条", "onChange" to _ctx.change_show_scrollbar_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to true, "title" to "控制是否回弹效果", "onChange" to _ctx.change_bounces_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to true, "title" to "是否显示加载更多", "onChange" to _ctx.change_load_more_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "2", "title" to "设置cross-axis-count，触发 scrolltoupper 事件", "type" to "number", "onConfirm" to _ctx.handleChangeCrossAxisCount), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("text", null, "拖动设置cross-axis-gap")
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                        createVNode(_component_slider, utsMapOf("max" to 20, "min" to 0, "step" to 1, "value" to _ctx.cross_axis_gap, "show-value" to true, "onChange" to _ctx.handleChangeCrossAxisGap), null, 8, utsArrayOf(
                            "value",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                        createElementVNode("text", null, "拖动设置main-axis-gap")
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-slider uni-list-cell-padding"), utsArrayOf(
                        createVNode(_component_slider, utsMapOf("max" to 20, "min" to 0, "step" to 1, "value" to _ctx.main_axis_gap, "show-value" to true, "onChange" to _ctx.handleChangeMainAxisGap), null, 8, utsArrayOf(
                            "value",
                            "onChange"
                        ))
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "50", "title" to "距顶部/左边多远时（单位px），触发 scrolltoupper 事件", "type" to "number", "onConfirm" to _ctx.confirm_upper_threshold_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "50", "title" to "距底部/右边多远时（单位px），触发 scrolltolower 事件", "type" to "number", "onConfirm" to _ctx.confirm_lower_threshold_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "0", "title" to "设置竖向滚动条位置", "type" to "number", "onConfirm" to _ctx.confirm_scroll_top_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#FFF", "title" to "设置下拉刷新区域背景颜色", "type" to "text", "onConfirm" to _ctx.confirm_refresher_background_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_enum_data, utsMapOf("items" to _ctx.size_enum, "title" to "通过id位置跳转", "onChange" to _ctx.item_change_size_enum), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    ))
                ))
            ), 4)
        ), 64);
    }
    open var refresher_triggered_boolean: Boolean by `$data`;
    open var refresher_enabled_boolean: Boolean by `$data`;
    open var scroll_with_animation_boolean: Boolean by `$data`;
    open var show_scrollbar_boolean: Boolean by `$data`;
    open var bounces_boolean: Boolean by `$data`;
    open var upper_threshold_input: Number by `$data`;
    open var lower_threshold_input: Number by `$data`;
    open var scroll_top_input: Number by `$data`;
    open var scroll_left_input: Number by `$data`;
    open var refresher_background_input: String by `$data`;
    open var scrollData: UTSArray<flowItemData> by `$data`;
    open var size_enum: UTSArray<ItemType> by `$data`;
    open var scrollIntoView: String by `$data`;
    open var refresherrefresh: Boolean by `$data`;
    open var refresher_default_style_input: String by `$data`;
    open var text: UTSArray<String> by `$data`;
    open var state: Number by `$data`;
    open var reset: Boolean by `$data`;
    open var isScrollTest: String by `$data`;
    open var isScrolltolowerTest: String by `$data`;
    open var isScrolltoupperTest: String by `$data`;
    open var scrollDetailTest: UniScrollEventDetail? by `$data`;
    open var scrollEndDetailTest: UniScrollEventDetail? by `$data`;
    open var cross_axis_count: Number by `$data`;
    open var main_axis_gap: Number by `$data`;
    open var cross_axis_gap: Number by `$data`;
    open var waterflowPadding: UTSArray<Number> by `$data`;
    open var loadMore: Boolean
        @JvmName("getLoadMore0")
        get() {
            return this.`$data`["loadMore"] as Boolean;
        }
        @JvmName("setLoadMore0")
        set(value) {
            this.`$data`["loadMore"] = value;
        }
    open var isLoadMore: Boolean
        @JvmName("getIsLoadMore1")
        get() {
            return this.`$data`["isLoadMore"] as Boolean;
        }
        @JvmName("setIsLoadMore1")
        set(value) {
            this.`$data`["isLoadMore"] = value;
        }
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("refresher_triggered_boolean" to false, "refresher_enabled_boolean" to false, "scroll_with_animation_boolean" to false, "show_scrollbar_boolean" to false, "bounces_boolean" to true, "upper_threshold_input" to 50, "lower_threshold_input" to 50, "scroll_top_input" to 0, "scroll_left_input" to 0, "refresher_background_input" to "#FFF", "scrollData" to utsArrayOf<flowItemData>(), "size_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "item---0"), ItemType(value = 3, name = "item---3")), "scrollIntoView" to "", "refresherrefresh" to false, "refresher_default_style_input" to "black", "text" to utsArrayOf(
            "继续下拉执行刷新",
            "释放立即刷新",
            "刷新中",
            ""
        ), "state" to 3, "reset" to true, "isScrollTest" to "", "isScrolltolowerTest" to "", "isScrolltoupperTest" to "", "scrollDetailTest" to null as UniScrollEventDetail?, "scrollEndDetailTest" to null as UniScrollEventDetail?, "cross_axis_count" to 2, "main_axis_gap" to 2, "cross_axis_gap" to 2, "waterflowPadding" to utsArrayOf<Number>(10, 5, 10, 5), "loadMore" to true, "isLoadMore" to true);
    }
    override fun `$initMethods`() {
        this.waterflow_click = fun() {
            console.log("组件被点击时触发");
        }
        ;
        this.waterflow_touchstart = fun() {
            console.log("手指触摸动作开始");
        }
        ;
        this.waterflow_touchmove = fun() {
            console.log("手指触摸后移动");
        }
        ;
        this.waterflow_touchcancel = fun() {
            console.log("手指触摸动作被打断，如来电提醒，弹窗");
        }
        ;
        this.waterflow_touchend = fun() {
            console.log("手指触摸动作结束");
        }
        ;
        this.waterflow_tap = fun() {
            console.log("手指触摸后马上离开");
        }
        ;
        this.waterflow_longpress = fun() {
            console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.waterflow_refresherpulling = fun(e: RefresherEvent) {
            console.log("下拉刷新控件被下拉");
            if (this.reset) {
                if (e.detail.dy > 45) {
                    this.state = 1;
                } else {
                    this.state = 0;
                }
            }
        }
        ;
        this.waterflow_refresherrefresh = fun() {
            console.log("下拉刷新被触发 ");
            this.refresherrefresh = true;
            this.refresher_triggered_boolean = true;
            this.state = 2;
            this.reset = false;
            setTimeout(fun(){
                this.refresher_triggered_boolean = false;
            }
            , 1500);
        }
        ;
        this.waterflow_refresherrestore = fun() {
            this.refresherrefresh = false;
            this.state = 3;
            this.reset = true;
            console.log("下拉刷新被复位");
        }
        ;
        this.waterflow_refresherabort = fun() {
            console.log("下拉刷新被中止");
        }
        ;
        this.waterflow_scrolltoupper = fun(e: UniScrollToUpperEvent) {
            console.log("滚动到顶部/左边，会触发 scrolltoupper 事件  direction=" + e.detail.direction);
            this.checkEventTest(ScrollEventTest2(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltoupper");
        }
        ;
        this.waterflow_scrolltolower = fun(e: UniScrollToLowerEvent) {
            console.log("滚动到底部/右边，会触发 scrolltolower 事件  direction=" + e.detail.direction);
            this.checkEventTest(ScrollEventTest2(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltolower");
        }
        ;
        this.waterflow_scroll = fun(e: UniScrollEvent) {
            console.log("滚动时触发，event.detail = ", e.detail);
            this.scrollDetailTest = e.detail;
            this.checkEventTest(ScrollEventTest2(type = e.type, target = e.target, currentTarget = e.currentTarget), "scroll");
        }
        ;
        this.waterflow_scrollend = fun(e: UniScrollEvent) {
            console.log("滚动结束时触发", e.detail);
            this.scrollEndDetailTest = e.detail;
            this.checkEventTest(ScrollEventTest2(type = e.type, target = e.target, currentTarget = e.currentTarget), "scrollend");
        }
        ;
        this.flow_item_click = fun() {
            console.log("flow-item组件被点击时触发");
        }
        ;
        this.flow_item_touchstart = fun() {
            console.log("手指触摸flow-item组件动作开始");
        }
        ;
        this.flow_item_touchmove = fun() {
            console.log("手指触摸flow-item组件后移动");
        }
        ;
        this.flow_item_touchcancel = fun() {
            console.log("手指触摸flow-item组件动作被打断，如来电提醒，弹窗");
        }
        ;
        this.flow_item_touchend = fun() {
            console.log("手指触摸flow-item组件动作结束");
        }
        ;
        this.flow_item_tap = fun() {
            console.log("手指触摸flow-item组件后马上离开");
        }
        ;
        this.flow_item_longpress = fun() {
            console.log("flow-item组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.change_refresher_triggered_boolean = fun(checked: Boolean) {
            this.refresher_triggered_boolean = checked;
        }
        ;
        this.change_refresher_enabled_boolean = fun(checked: Boolean) {
            this.refresher_enabled_boolean = checked;
        }
        ;
        this.change_scroll_with_animation_boolean = fun(checked: Boolean) {
            this.scroll_with_animation_boolean = checked;
        }
        ;
        this.change_show_scrollbar_boolean = fun(checked: Boolean) {
            this.show_scrollbar_boolean = checked;
        }
        ;
        this.change_bounces_boolean = fun(checked: Boolean) {
            this.bounces_boolean = checked;
        }
        ;
        this.confirm_upper_threshold_input = fun(value: Number) {
            this.upper_threshold_input = value;
        }
        ;
        this.confirm_lower_threshold_input = fun(value: Number) {
            this.lower_threshold_input = value;
        }
        ;
        this.confirm_scroll_top_input = fun(value: Number) {
            this.scroll_top_input = value;
        }
        ;
        this.confirm_scroll_left_input = fun(value: Number) {
            this.scroll_left_input = value;
        }
        ;
        this.confirm_refresher_background_input = fun(value: String) {
            this.refresher_background_input = value;
        }
        ;
        this.item_change_size_enum = fun(index: Number) {
            this.scrollIntoView = "item---" + index;
        }
        ;
        this.setScrollIntoView = fun(id: String) {
            this.scrollIntoView = id;
        }
        ;
        this.checkEventTest = fun(e: ScrollEventTest2, eventName: String) {
            val isPass = e.type === eventName && e.target is UniElement && e.currentTarget is UniElement;
            val result = if (isPass) {
                "" + eventName + ":Success";
            } else {
                "" + eventName + ":Fail";
            }
            ;
            when (eventName) {
                "scroll" -> 
                    this.isScrollTest = result;
                "scrolltolower" -> 
                    this.isScrolltolowerTest = result + ("-" + e.direction);
                "scrolltoupper" -> 
                    this.isScrolltoupperTest = result + ("-" + e.direction);
                else -> 
                    {}
            }
        }
        ;
        this.check_scroll_height = fun(): Boolean {
            var listElement = this.`$refs`["waterflow"] as UniElement;
            console.log("check_scroll_height--" + listElement.scrollHeight);
            if (listElement.scrollHeight > 1400) {
                return true;
            }
            return false;
        }
        ;
        this.change_refresher_style_boolean = fun(checked: Boolean) {
            if (checked) {
                this.refresher_default_style_input = "none";
            } else {
                this.refresher_default_style_input = "black";
            }
        }
        ;
        this.change_load_more_boolean = fun(checked: Boolean) {
            this.isLoadMore = checked;
        }
        ;
        this.handleChangeCrossAxisCount = fun(value: Number) {
            if (value < 2) {
                uni_showToast(ShowToastOptions(title = "cross-axis-count 最小值为 2 请重新设置"));
                return;
            }
            this.cross_axis_count = value;
        }
        ;
        this.handleChangeCrossAxisGap = fun(e: UniSliderChangeEvent) {
            this.cross_axis_gap = e.detail.value;
        }
        ;
        this.handleChangeMainAxisGap = fun(e: UniSliderChangeEvent) {
            this.main_axis_gap = e.detail.value;
        }
        ;
        this.testModifyWaterflowProps = fun() {
            this.cross_axis_count = 4;
            this.main_axis_gap = 6;
            this.cross_axis_gap = 6;
            this.waterflowPadding = utsArrayOf<Number>(5, 10, 5, 10);
        }
        ;
    }
    open lateinit var waterflow_click: () -> Unit;
    open lateinit var waterflow_touchstart: () -> Unit;
    open lateinit var waterflow_touchmove: () -> Unit;
    open lateinit var waterflow_touchcancel: () -> Unit;
    open lateinit var waterflow_touchend: () -> Unit;
    open lateinit var waterflow_tap: () -> Unit;
    open lateinit var waterflow_longpress: () -> Unit;
    open lateinit var waterflow_refresherpulling: (e: RefresherEvent) -> Unit;
    open lateinit var waterflow_refresherrefresh: () -> Unit;
    open lateinit var waterflow_refresherrestore: () -> Unit;
    open lateinit var waterflow_refresherabort: () -> Unit;
    open lateinit var waterflow_scrolltoupper: (e: UniScrollToUpperEvent) -> Unit;
    open lateinit var waterflow_scrolltolower: (e: UniScrollToLowerEvent) -> Unit;
    open lateinit var waterflow_scroll: (e: UniScrollEvent) -> Unit;
    open lateinit var waterflow_scrollend: (e: UniScrollEvent) -> Unit;
    open lateinit var flow_item_click: () -> Unit;
    open lateinit var flow_item_touchstart: () -> Unit;
    open lateinit var flow_item_touchmove: () -> Unit;
    open lateinit var flow_item_touchcancel: () -> Unit;
    open lateinit var flow_item_touchend: () -> Unit;
    open lateinit var flow_item_tap: () -> Unit;
    open lateinit var flow_item_longpress: () -> Unit;
    open lateinit var change_refresher_triggered_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_refresher_enabled_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_scroll_with_animation_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_show_scrollbar_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_bounces_boolean: (checked: Boolean) -> Unit;
    open lateinit var confirm_upper_threshold_input: (value: Number) -> Unit;
    open lateinit var confirm_lower_threshold_input: (value: Number) -> Unit;
    open lateinit var confirm_scroll_top_input: (value: Number) -> Unit;
    open lateinit var confirm_scroll_left_input: (value: Number) -> Unit;
    open lateinit var confirm_refresher_background_input: (value: String) -> Unit;
    open lateinit var item_change_size_enum: (index: Number) -> Unit;
    open lateinit var setScrollIntoView: (id: String) -> Unit;
    open lateinit var checkEventTest: (e: ScrollEventTest2, eventName: String) -> Unit;
    open lateinit var check_scroll_height: () -> Boolean;
    open lateinit var change_refresher_style_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_load_more_boolean: (checked: Boolean) -> Unit;
    open lateinit var handleChangeCrossAxisCount: (value: Number) -> Unit;
    open lateinit var handleChangeCrossAxisGap: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var handleChangeMainAxisGap: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var testModifyWaterflowProps: () -> Unit;
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("maxHeight" to 250, "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "flow-item" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 200, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#666666", "backgroundColor" to "#66ccff", "alignItems" to "center", "justifyContent" to "center")), "tip-text" to padStyleMapOf(utsMapOf("color" to "#888888", "fontSize" to 12)), "refresh-box" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "flexDirection" to "row", "height" to 45, "width" to "100%")), "load-more-box" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "flexDirection" to "row", "height" to 45, "width" to "100%", "borderStyle" to "solid")), "button" to padStyleMapOf(utsMapOf("marginTop" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
