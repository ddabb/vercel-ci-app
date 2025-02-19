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
open class GenPagesComponentListViewListView : BasePage {
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
                while(i < 10){
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
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass);
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass);
        val _component_navigator = resolveComponent("navigator");
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createElementVNode("list-view", utsMapOf("direction" to _ctx.scroll_direction, "rebound" to _ctx.bounces_boolean, "upper-threshold" to _ctx.upper_threshold_input, "lower-threshold" to _ctx.lower_threshold_input, "scroll-top" to _ctx.scroll_top_input, "scroll-left" to _ctx.scroll_left_input, "show-scrollbar" to _ctx.show_scrollbar_boolean, "scroll-into-view" to _ctx.scrollIntoView, "scroll-with-animation" to _ctx.scroll_with_animation_boolean, "refresher-enabled" to _ctx.refresher_enabled_boolean, "refresher-background" to _ctx.refresher_background_input, "refresher-triggered" to _ctx.refresher_triggered_boolean, "refresher-default-style" to _ctx.refresher_default_style_input, "onClick" to utsArrayOf(
                    _ctx.list_view_click,
                    _ctx.list_view_tap
                ), "onTouchstart" to _ctx.list_view_touchstart, "onTouchmove" to _ctx.list_view_touchmove, "onTouchcancel" to _ctx.list_view_touchcancel, "onTouchend" to _ctx.list_view_touchend, "onLongpress" to _ctx.list_view_longpress, "onRefresherpulling" to _ctx.list_view_refresherpulling, "onRefresherrefresh" to _ctx.list_view_refresherrefresh, "onRefresherrestore" to _ctx.list_view_refresherrestore, "onRefresherabort" to _ctx.list_view_refresherabort, "onScrolltoupper" to _ctx.list_view_scrolltoupper, "ref" to "listview", "onScrolltolower" to _ctx.list_view_scrolltolower, "onScroll" to _ctx.list_view_scroll, "onScrollend" to _ctx.list_view_scrollend, "style" to normalizeStyle(utsMapOf("width" to "100%")), "id" to "listview"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.scrollData, fun(key, __key, __index, _cached): Any {
                        return createElementVNode("list-item", utsMapOf("key" to key, "id" to key, "onClick" to utsArrayOf(
                            _ctx.list_item_click,
                            _ctx.list_item_tap
                        ), "onTouchstart" to _ctx.list_item_touchstart, "onTouchmove" to _ctx.list_item_touchmove, "onTouchcancel" to _ctx.list_item_touchcancel, "onTouchend" to _ctx.list_item_touchend, "onLongpress" to _ctx.list_item_longpress, "class" to "list-item"), utsArrayOf(
                            createElementVNode("text", null, toDisplayString(key), 1)
                        ), 40, utsArrayOf(
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
                    createElementVNode("list-item", utsMapOf("slot" to "refresher", "class" to "refresh-box"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "tip-text"), toDisplayString(_ctx.text[_ctx.state]), 1)
                    ))
                ), 44, utsArrayOf(
                    "direction",
                    "rebound",
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
                    "onScrollend"
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
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to true, "title" to "允许纵向滚动", "onChange" to _ctx.change_scroll_y_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "允许横向滚动", "onChange" to _ctx.change_scroll_x_boolean), null, 8, utsArrayOf(
                        "onChange"
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
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "0", "title" to "设置横向滚动条位置", "type" to "number", "onConfirm" to _ctx.confirm_scroll_left_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#FFF", "title" to "设置下拉刷新区域背景颜色", "type" to "text", "onConfirm" to _ctx.confirm_refresher_background_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_enum_data, utsMapOf("items" to _ctx.size_enum, "title" to "通过id位置跳转", "onChange" to _ctx.item_change_size_enum), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    )),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/list-view/list-view-refresh"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "button"), " list-view 下拉刷新 ")
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/list-view/list-view-multiplex"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "button"), " list-view 对list-item复用测试 ")
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/list-view/list-view-multiplex-input"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "button"), " list-view 复用测试（item中嵌入input） ")
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/list-view/list-view-multiplex-video"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "button"), " list-view 复用测试（item中嵌入video） ")
                        );
                    }
                    ), "_" to 1)),
                    createVNode(_component_navigator, utsMapOf("url" to "/pages/component/list-view/list-view-children-in-slot"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "button"), " list-view 测试插槽中子组件增删 ")
                        );
                    }
                    ), "_" to 1))
                ))
            ), 4)
        ), 64);
    }
    open var refresher_triggered_boolean: Boolean by `$data`;
    open var refresher_enabled_boolean: Boolean by `$data`;
    open var scroll_with_animation_boolean: Boolean by `$data`;
    open var show_scrollbar_boolean: Boolean by `$data`;
    open var bounces_boolean: Boolean by `$data`;
    open var scroll_y_boolean: Boolean by `$data`;
    open var scroll_x_boolean: Boolean by `$data`;
    open var scroll_direction: String by `$data`;
    open var upper_threshold_input: Number by `$data`;
    open var lower_threshold_input: Number by `$data`;
    open var scroll_top_input: Number by `$data`;
    open var scroll_left_input: Number by `$data`;
    open var refresher_background_input: String by `$data`;
    open var scrollData: UTSArray<String> by `$data`;
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
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("refresher_triggered_boolean" to false, "refresher_enabled_boolean" to false, "scroll_with_animation_boolean" to false, "show_scrollbar_boolean" to false, "bounces_boolean" to true, "scroll_y_boolean" to true, "scroll_x_boolean" to false, "scroll_direction" to "vertical", "upper_threshold_input" to 50, "lower_threshold_input" to 50, "scroll_top_input" to 0, "scroll_left_input" to 0, "refresher_background_input" to "#FFF", "scrollData" to utsArrayOf<String>(), "size_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "item---0"), ItemType(value = 3, name = "item---3")), "scrollIntoView" to "", "refresherrefresh" to false, "refresher_default_style_input" to "black", "text" to utsArrayOf(
            "继续下拉执行刷新",
            "释放立即刷新",
            "刷新中",
            ""
        ), "state" to 3, "reset" to true, "isScrollTest" to "", "isScrolltolowerTest" to "", "isScrolltoupperTest" to "", "scrollDetailTest" to null as UniScrollEventDetail?, "scrollEndDetailTest" to null as UniScrollEventDetail?);
    }
    override fun `$initMethods`() {
        this.list_view_click = fun() {
            console.log("组件被点击时触发");
        }
        ;
        this.list_view_touchstart = fun() {
            console.log("手指触摸动作开始");
        }
        ;
        this.list_view_touchmove = fun() {
            console.log("手指触摸后移动");
        }
        ;
        this.list_view_touchcancel = fun() {
            console.log("手指触摸动作被打断，如来电提醒，弹窗");
        }
        ;
        this.list_view_touchend = fun() {
            console.log("手指触摸动作结束");
        }
        ;
        this.list_view_tap = fun() {
            console.log("手指触摸后马上离开");
        }
        ;
        this.list_view_longpress = fun() {
            console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.list_view_refresherpulling = fun(e: RefresherEvent) {
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
        this.list_view_refresherrefresh = fun() {
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
        this.list_view_refresherrestore = fun() {
            this.refresherrefresh = false;
            this.state = 3;
            this.reset = true;
            console.log("下拉刷新被复位");
        }
        ;
        this.list_view_refresherabort = fun() {
            console.log("下拉刷新被中止");
        }
        ;
        this.list_view_scrolltoupper = fun(e: UniScrollToUpperEvent) {
            console.log("滚动到顶部/左边，会触发 scrolltoupper 事件  direction=" + e.detail.direction);
            this.checkEventTest(ScrollEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltoupper");
        }
        ;
        this.list_view_scrolltolower = fun(e: UniScrollToLowerEvent) {
            console.log("滚动到底部/右边，会触发 scrolltolower 事件  direction=" + e.detail.direction);
            this.checkEventTest(ScrollEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget, direction = e.detail.direction), "scrolltolower");
        }
        ;
        this.list_view_scroll = fun(e: UniScrollEvent) {
            console.log("滚动时触发，event.detail = {scrollLeft, scrollTop, scrollHeight, scrollWidth, deltaX, deltaY}");
            this.scrollDetailTest = e.detail;
            this.checkEventTest(ScrollEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget), "scroll");
        }
        ;
        this.list_view_scrollend = fun(e: UniScrollEvent) {
            console.log("滚动结束时触发", e.detail);
            this.scrollEndDetailTest = e.detail;
            this.checkEventTest(ScrollEventTest1(type = e.type, target = e.target, currentTarget = e.currentTarget), "scrollend");
        }
        ;
        this.list_item_click = fun() {
            console.log("list-item组件被点击时触发");
        }
        ;
        this.list_item_touchstart = fun() {
            console.log("手指触摸list-item组件动作开始");
        }
        ;
        this.list_item_touchmove = fun() {
            console.log("手指触摸list-item组件后移动");
        }
        ;
        this.list_item_touchcancel = fun() {
            console.log("手指触摸list-item组件动作被打断，如来电提醒，弹窗");
        }
        ;
        this.list_item_touchend = fun() {
            console.log("手指触摸list-item组件动作结束");
        }
        ;
        this.list_item_tap = fun() {
            console.log("手指触摸list-item组件后马上离开");
        }
        ;
        this.list_item_longpress = fun() {
            console.log("list-item组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
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
        this.change_scroll_y_boolean = fun(checked: Boolean) {
            this.scroll_y_boolean = checked;
            this.change_scroll_direction();
        }
        ;
        this.change_scroll_x_boolean = fun(checked: Boolean) {
            this.scroll_x_boolean = checked;
            this.change_scroll_direction();
        }
        ;
        this.change_scroll_direction = fun() {
            if (this.scroll_y_boolean && this.scroll_x_boolean || this.scroll_y_boolean) {
                this.scroll_direction = "vertical";
            } else if (!this.scroll_y_boolean && !this.scroll_x_boolean) {
                this.scroll_direction = "none";
            } else if (!this.scroll_y_boolean && this.scroll_x_boolean) {
                this.scroll_direction = "horizontal";
            }
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
        this.checkEventTest = fun(e: ScrollEventTest1, eventName: String) {
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
            var listElement = this.`$refs`["listview"] as UniElement;
            console.log("check_scroll_height--" + listElement.scrollHeight);
            if (listElement.scrollHeight > 2000) {
                return true;
            }
            return false;
        }
        ;
        this.check_scroll_width = fun(): Boolean {
            var listElement = this.`$refs`["listview"] as UniElement;
            console.log("check_scroll_width" + listElement.scrollWidth);
            if (listElement.scrollWidth > 2000) {
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
    }
    open lateinit var list_view_click: () -> Unit;
    open lateinit var list_view_touchstart: () -> Unit;
    open lateinit var list_view_touchmove: () -> Unit;
    open lateinit var list_view_touchcancel: () -> Unit;
    open lateinit var list_view_touchend: () -> Unit;
    open lateinit var list_view_tap: () -> Unit;
    open lateinit var list_view_longpress: () -> Unit;
    open lateinit var list_view_refresherpulling: (e: RefresherEvent) -> Unit;
    open lateinit var list_view_refresherrefresh: () -> Unit;
    open lateinit var list_view_refresherrestore: () -> Unit;
    open lateinit var list_view_refresherabort: () -> Unit;
    open lateinit var list_view_scrolltoupper: (e: UniScrollToUpperEvent) -> Unit;
    open lateinit var list_view_scrolltolower: (e: UniScrollToLowerEvent) -> Unit;
    open lateinit var list_view_scroll: (e: UniScrollEvent) -> Unit;
    open lateinit var list_view_scrollend: (e: UniScrollEvent) -> Unit;
    open lateinit var list_item_click: () -> Unit;
    open lateinit var list_item_touchstart: () -> Unit;
    open lateinit var list_item_touchmove: () -> Unit;
    open lateinit var list_item_touchcancel: () -> Unit;
    open lateinit var list_item_touchend: () -> Unit;
    open lateinit var list_item_tap: () -> Unit;
    open lateinit var list_item_longpress: () -> Unit;
    open lateinit var change_refresher_triggered_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_refresher_enabled_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_scroll_with_animation_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_show_scrollbar_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_bounces_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_scroll_y_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_scroll_x_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_scroll_direction: () -> Unit;
    open lateinit var confirm_upper_threshold_input: (value: Number) -> Unit;
    open lateinit var confirm_lower_threshold_input: (value: Number) -> Unit;
    open lateinit var confirm_scroll_top_input: (value: Number) -> Unit;
    open lateinit var confirm_scroll_left_input: (value: Number) -> Unit;
    open lateinit var confirm_refresher_background_input: (value: String) -> Unit;
    open lateinit var item_change_size_enum: (index: Number) -> Unit;
    open lateinit var setScrollIntoView: (id: String) -> Unit;
    open lateinit var checkEventTest: (e: ScrollEventTest1, eventName: String) -> Unit;
    open lateinit var check_scroll_height: () -> Boolean;
    open lateinit var check_scroll_width: () -> Boolean;
    open lateinit var change_refresher_style_boolean: (checked: Boolean) -> Unit;
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("maxHeight" to 250, "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "list-item" to utsMapOf(".main " to utsMapOf("width" to "100%", "height" to 250, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#666666", "backgroundColor" to "#66ccff", "alignItems" to "center", "justifyContent" to "center")), "tip-text" to padStyleMapOf(utsMapOf("color" to "#888888", "fontSize" to 12)), "refresh-box" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "flexDirection" to "row", "height" to 45, "width" to "100%")), "button" to padStyleMapOf(utsMapOf("marginTop" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
