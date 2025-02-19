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
open class GenPagesComponentSliderSlider : BasePage {
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
        val _component_slider = resolveComponent("slider", true);
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass);
        val _component_navigator = resolveComponent("navigator");
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createVNode(_component_slider, utsMapOf("disabled" to _ctx.disabled_boolean, "min" to _ctx.min_input, "max" to _ctx.max_input, "step" to _ctx.step_input, "value" to _ctx.value_input, "activeColor" to _ctx.activeColor_input, "backgroundColor" to _ctx.backgroundColor_input, "block-size" to _ctx.block_size_input, "block-color" to _ctx.block_color_input, "show-value" to _ctx.show_value_boolean, "valueColor" to _ctx.valueColor, "onClick" to utsArrayOf(
                    _ctx.slider_click,
                    _ctx.slider_tap
                ), "onTouchstart" to _ctx.slider_touchstart, "onTouchmove" to _ctx.slider_touchmove, "onTouchcancel" to _ctx.slider_touchcancel, "onTouchend" to _ctx.slider_touchend, "onLongpress" to _ctx.slider_longpress, "onChange" to _ctx.slider_change, "onChanging" to _ctx.slider_changing, "style" to normalizeStyle(utsMapOf("width" to "90%"))), null, 8, utsArrayOf(
                    "disabled",
                    "min",
                    "max",
                    "step",
                    "value",
                    "activeColor",
                    "backgroundColor",
                    "block-size",
                    "block-color",
                    "show-value",
                    "valueColor",
                    "onClick",
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchcancel",
                    "onTouchend",
                    "onLongpress",
                    "onChange",
                    "onChanging",
                    "style"
                ))
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createVNode(_component_page_head, utsMapOf("title" to "组件属性")),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否显示当前 value", "onChange" to _ctx.change_show_value_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否禁用", "onChange" to _ctx.change_disabled_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "0", "title" to "最小值(min)", "type" to "number", "onConfirm" to _ctx.confirm_min_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "100", "title" to "最大值(max)", "type" to "number", "onConfirm" to _ctx.confirm_max_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "1", "title" to "步长(step)，取值必须大于 0，并且可被(max - min)整除", "type" to "number", "onConfirm" to _ctx.confirm_step_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "0", "title" to "当前取值(value)", "type" to "number", "onConfirm" to _ctx.confirm_value_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#007aff", "title" to "滑块左侧已选择部分的线条颜色(active-color)", "type" to "text", "onConfirm" to _ctx.confirm_activeColor_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#e9e9e9", "title" to "背景条的颜色(background-color)", "type" to "text", "onConfirm" to _ctx.confirm_backgroundColor_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "28", "title" to "滑块的大小(block-size)，取值范围为 12 - 28", "type" to "number", "onConfirm" to _ctx.confirm_block_size_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#ffffff", "title" to "滑块颜色(block-color)", "type" to "text", "onConfirm" to _ctx.confirm_block_color_input), null, 8, utsArrayOf(
                        "onConfirm"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to "#888888", "title" to "Value颜色(value-color)", "type" to "text", "onConfirm" to _ctx.confirm_value_color_input), null, 8, utsArrayOf(
                        "onConfirm"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                    createVNode(_component_page_head, utsMapOf("title" to "默认及使用")),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "显示当前value"),
                    createElementVNode("view", null, utsArrayOf(
                        createVNode(_component_slider, utsMapOf("onChange" to _ctx.sliderChange, "value" to 50, "show-value" to true), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "设置步进:step=10跳动"),
                    createElementVNode("view", null, utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-row"), utsArrayOf(
                            createElementVNode("text", null, "0"),
                            createElementVNode("text", utsMapOf("class" to "m-l-a"), "100")
                        )),
                        createVNode(_component_slider, utsMapOf("onChange" to _ctx.sliderChange, "value" to 60, "step" to 10), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "浮点步进:step=0.01跳动"),
                    createElementVNode("view", null, utsArrayOf(
                        createVNode(_component_slider, utsMapOf("value" to 0.5, "min" to 0, "max" to 1, "step" to 0.01, "show-value" to true))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "设置最小/最大值"),
                    createElementVNode("view", null, utsArrayOf(
                        createVNode(_component_slider, utsMapOf("onChange" to _ctx.sliderChange, "value" to 100, "min" to 50, "max" to 200, "show-value" to true), null, 8, utsArrayOf(
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "不同颜色和大小的滑块"),
                    createElementVNode("view", null, utsArrayOf(
                        createVNode(_component_slider, utsMapOf("id" to "slider-custom-color-and-size", "onChange" to _ctx.sliderChange, "value" to _ctx.sliderValue, "backgroundColor" to _ctx.sliderBackgroundColor, "activeColor" to _ctx.sliderActiveColor, "activeBackgroundColor" to _ctx.sliderActiveColor, "blockColor" to _ctx.sliderBlockColor, "foreColor" to _ctx.sliderBlockColor, "block-size" to _ctx.sliderBlockSize), null, 8, utsArrayOf(
                            "onChange",
                            "value",
                            "backgroundColor",
                            "activeColor",
                            "activeBackgroundColor",
                            "blockColor",
                            "foreColor",
                            "block-size"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-title"), "暗黑模式"),
                    createElementVNode("view", null, utsArrayOf(
                        createVNode(_component_slider, utsMapOf("show-value" to true, "backgroundColor" to "rgba(32,32,32,0.5)", "valueColor" to "#555"))
                    )),
                    createVNode(_component_navigator, utsMapOf("url" to "./slider-in-swiper"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode("button", null, "slider in swiper")
                        );
                    }
                    ), "_" to 1))
                ))
            ), 4)
        ), 64);
    }
    open var sliderValue: Number by `$data`;
    open var sliderBlockSize: Number by `$data`;
    open var sliderBackgroundColor: String by `$data`;
    open var sliderActiveColor: String by `$data`;
    open var sliderBlockColor: String by `$data`;
    open var show_value_boolean: Boolean by `$data`;
    open var disabled_boolean: Boolean by `$data`;
    open var min_input: Number by `$data`;
    open var max_input: Number by `$data`;
    open var step_input: Number by `$data`;
    open var value_input: Number by `$data`;
    open var activeColor_input: String by `$data`;
    open var backgroundColor_input: String by `$data`;
    open var block_size_input: Number by `$data`;
    open var block_color_input: String by `$data`;
    open var valueColor: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("sliderValue" to 50, "sliderBlockSize" to 20, "sliderBackgroundColor" to "#000000", "sliderActiveColor" to "#FFCC33", "sliderBlockColor" to "#8A6DE9", "show_value_boolean" to false, "disabled_boolean" to false, "min_input" to 0, "max_input" to 100, "step_input" to 1, "value_input" to 0, "activeColor_input" to "#007aff", "backgroundColor_input" to "#e9e9e9", "block_size_input" to 28, "block_color_input" to "#ffffff", "valueColor" to "#888888");
    }
    override fun `$initMethods`() {
        this.sliderChange = fun(e: UniSliderChangeEvent) {
            console.log("value 发生变化：" + e.detail.value);
        }
        ;
        this.slider_click = fun() {
            console.log("组件被点击时触发");
        }
        ;
        this.slider_touchstart = fun() {
            console.log("手指触摸动作开始");
        }
        ;
        this.slider_touchmove = fun() {
            console.log("手指触摸后移动");
        }
        ;
        this.slider_touchcancel = fun() {
            console.log("手指触摸动作被打断，如来电提醒，弹窗");
        }
        ;
        this.slider_touchend = fun() {
            console.log("手指触摸动作结束");
        }
        ;
        this.slider_tap = fun() {
            console.log("手指触摸后马上离开");
        }
        ;
        this.slider_longpress = fun() {
            console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.slider_change = fun() {
            console.log("完成一次拖动后触发的事件，event.detail = {value: value}");
        }
        ;
        this.slider_changing = fun() {
            console.log("拖动过程中触发的事件，event.detail = {value: value}");
        }
        ;
        this.change_show_value_boolean = fun(checked: Boolean) {
            this.show_value_boolean = checked;
        }
        ;
        this.change_disabled_boolean = fun(checked: Boolean) {
            this.disabled_boolean = checked;
        }
        ;
        this.confirm_min_input = fun(value: Number) {
            this.min_input = value;
        }
        ;
        this.confirm_max_input = fun(value: Number) {
            this.max_input = value;
        }
        ;
        this.confirm_step_input = fun(value: Number) {
            this.step_input = value;
        }
        ;
        this.confirm_value_input = fun(value: Number) {
            this.value_input = value;
        }
        ;
        this.confirm_activeColor_input = fun(value: String) {
            this.activeColor_input = value;
        }
        ;
        this.confirm_backgroundColor_input = fun(value: String) {
            this.backgroundColor_input = value;
        }
        ;
        this.confirm_block_size_input = fun(value: Number) {
            this.block_size_input = value;
        }
        ;
        this.confirm_block_color_input = fun(value: String) {
            this.block_color_input = value;
        }
        ;
        this.confirm_value_color_input = fun(value: String) {
            this.valueColor = value;
        }
        ;
    }
    open lateinit var sliderChange: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var slider_click: () -> Unit;
    open lateinit var slider_touchstart: () -> Unit;
    open lateinit var slider_touchmove: () -> Unit;
    open lateinit var slider_touchcancel: () -> Unit;
    open lateinit var slider_touchend: () -> Unit;
    open lateinit var slider_tap: () -> Unit;
    open lateinit var slider_longpress: () -> Unit;
    open lateinit var slider_change: () -> Unit;
    open lateinit var slider_changing: () -> Unit;
    open lateinit var change_show_value_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_disabled_boolean: (checked: Boolean) -> Unit;
    open lateinit var confirm_min_input: (value: Number) -> Unit;
    open lateinit var confirm_max_input: (value: Number) -> Unit;
    open lateinit var confirm_step_input: (value: Number) -> Unit;
    open lateinit var confirm_value_input: (value: Number) -> Unit;
    open lateinit var confirm_activeColor_input: (value: String) -> Unit;
    open lateinit var confirm_backgroundColor_input: (value: String) -> Unit;
    open lateinit var confirm_block_size_input: (value: Number) -> Unit;
    open lateinit var confirm_block_color_input: (value: String) -> Unit;
    open lateinit var confirm_value_color_input: (value: String) -> Unit;
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "m-l-a" to padStyleMapOf(utsMapOf("marginLeft" to "auto")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
