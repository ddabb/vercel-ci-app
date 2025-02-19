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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
open class GenPagesComponentTextareaTextarea : BasePage {
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
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass);
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createElementVNode("textarea", utsMapOf("value" to _ctx.default_value, "class" to "uni-textarea", "auto-focus" to true, "focus" to _ctx.focus_boolean, "confirm-hold" to _ctx.confirm_hold_boolean, "auto-height" to _ctx.auto_height_boolean, "fixed" to _ctx.fixed_boolean, "show-confirm-bar" to _ctx.show_confirm_bar_boolean, "adjust-position" to _ctx.adjust_position_boolean, "cursor-color" to _ctx.cursor_color, "cursor" to _ctx.cursor, "placeholder" to _ctx.placeholder_value, "inputmode" to _ctx.inputmode_enum[_ctx.inputmode_enum_current].name, "confirm-type" to _ctx.confirm_type_list[_ctx.confirm_type_current].name, "disabled" to _ctx.disabled, "onClick" to utsArrayOf(
                    _ctx.textarea_click,
                    _ctx.textarea_tap
                ), "onTouchstart" to _ctx.textarea_touchstart, "onTouchmove" to _ctx.textarea_touchmove, "onTouchcancel" to _ctx.textarea_touchcancel, "onTouchend" to _ctx.textarea_touchend, "onLongpress" to _ctx.textarea_longpress, "onConfirm" to _ctx.textarea_confirm, "onInput" to _ctx.textarea_input, "onLinechange" to _ctx.textarea_linechange, "onBlur" to _ctx.textarea_blur, "onKeyboardheightchange" to _ctx.textarea_keyboardheightchange, "onFocus" to _ctx.textarea_focus, "style" to normalizeStyle(utsMapOf("padding" to "10px", "border" to "1px solid #666", "height" to "200px"))), null, 44, utsArrayOf(
                    "value",
                    "focus",
                    "confirm-hold",
                    "auto-height",
                    "fixed",
                    "show-confirm-bar",
                    "adjust-position",
                    "cursor-color",
                    "cursor",
                    "placeholder",
                    "inputmode",
                    "confirm-type",
                    "disabled",
                    "onClick",
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchcancel",
                    "onTouchend",
                    "onLongpress",
                    "onConfirm",
                    "onInput",
                    "onLinechange",
                    "onBlur",
                    "onKeyboardheightchange",
                    "onFocus"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "键盘弹起时，是否自动上推页面（限非 Web 平台）", "onChange" to _ctx.change_adjust_position_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否自动增高，设置auto-height时，style.height不生效", "onChange" to _ctx.change_auto_height_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to _ctx.focus_boolean, "title" to "获取焦点", "onChange" to _ctx.change_focus_boolean), null, 8, utsArrayOf(
                    "defaultValue",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to true, "title" to "首次自动获取焦点", "onChange" to _ctx.change_auto_focus_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "改变光标颜色为透明", "onChange" to _ctx.change_cursor_color_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "设置禁用输入框", "onChange" to _ctx.change_disabled_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("items" to _ctx.confirm_type_list, "title" to "confirm-type，设置键盘右下角按钮。（Android仅支持return）", "onChange" to _ctx.radio_change_confirm_type), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "点击软键盘右下角按钮时是否保持键盘不收起(confirm-type为return时必然不收起)", "onChange" to _ctx.change_confirm_hold_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_enum_data, utsMapOf("items" to _ctx.inputmode_enum, "title" to "input-mode，控制软键盘类型。（仅限 Web 平台符合条件的高版本浏览器或webview）。", "onChange" to _ctx.radio_change_inputmode_enum), null, 8, utsArrayOf(
                    "items",
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否显示键盘上方带有“完成”按钮那一栏（仅限小程序平台）", "onChange" to _ctx.change_show_confirm_bar_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "如果 textarea 是在一个 position:fixed 的区域，需要显示指定属性 fixed 为 true（仅限小程序平台）", "onChange" to _ctx.change_fixed_boolean), null, 8, utsArrayOf(
                    "onChange"
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", null, "maxlength 输入最大长度为10")
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("id" to "textarea-instance-maxlength", "class" to "textarea-instance", "value" to _ctx.textareaMaxLengthValue, "maxlength" to 10), null, 8, utsArrayOf(
                        "value"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", null, "cursor-spacing、placeholder-class、placeholder-style例子")
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("id" to "textarea-height-exception", "class" to "textarea-instance", "placeholder" to "底部textarea测试键盘遮挡", "placeholder-class" to "placeholder", "placeholder-style" to "background-color:red", "cursor-spacing" to 300))
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", utsMapOf("onClick" to fun(){
                        _ctx.setSelection(2, 5);
                    }
                    ), "设置输入框聚焦时光标的起始位置和结束位置（点击生效）", 8, utsArrayOf(
                        "onClick"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("id" to "textarea-instance-2", "class" to "textarea-instance", "value" to "Hello UniApp X Textarea TestCase", "selection-start" to _ctx.selectionStart, "selection-end" to _ctx.selectionEnd, "onBlur" to _ctx.onSelectionBlurChange), null, 40, utsArrayOf(
                        "selection-start",
                        "selection-end",
                        "onBlur"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", null, "设置hold-keyboard"),
                    createVNode(_component_switch, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "onChange" to _ctx.changeHoldKeyboard, "checked" to _ctx.hold_keyboard), null, 8, utsArrayOf(
                        "style",
                        "onChange",
                        "checked"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("class" to "textarea-instance", "hold-keyboard" to _ctx.hold_keyboard), null, 8, utsArrayOf(
                        "hold-keyboard"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", null, "同时存在 v-model 和 value")
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("id" to "both-model-value", "class" to "textarea-instance", "modelValue" to _ctx.defaultModel, "onInput" to fun(`$event`: InputEvent){
                        _ctx.defaultModel = `$event`.detail.value;
                    }
                    , "value" to "456"), null, 40, utsArrayOf(
                        "modelValue",
                        "onInput"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "title-wrap"), utsArrayOf(
                    createElementVNode("view", null, "设置adjust-position"),
                    createVNode(_component_switch, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "onChange" to _ctx.changeAdjustPosition, "checked" to _ctx.adjust_position), null, 8, utsArrayOf(
                        "style",
                        "onChange",
                        "checked"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "textarea-wrap"), utsArrayOf(
                    createElementVNode("textarea", utsMapOf("class" to "textarea-instance", "adjust-position" to _ctx.adjust_position), null, 8, utsArrayOf(
                        "adjust-position"
                    ))
                ))
            ))
        ), 4);
    }
    open var adjust_position_boolean: Boolean by `$data`;
    open var show_confirm_bar_boolean: Boolean by `$data`;
    open var fixed_boolean: Boolean by `$data`;
    open var auto_height_boolean: Boolean by `$data`;
    open var confirm_hold_boolean: Boolean by `$data`;
    open var focus_boolean: Boolean by `$data`;
    open var auto_focus_boolean: Boolean by `$data`;
    open var default_value: String by `$data`;
    open var inputmode_enum: UTSArray<ItemType> by `$data`;
    open var confirm_type_list: UTSArray<ItemType> by `$data`;
    open var cursor_color: String by `$data`;
    open var cursor: Number by `$data`;
    open var inputmode_enum_current: Number by `$data`;
    open var confirm_type_current: Number by `$data`;
    open var placeholder_value: String by `$data`;
    open var defaultModel: String by `$data`;
    open var textareaMaxLengthValue: String by `$data`;
    open var selectionStart: Number by `$data`;
    open var selectionEnd: Number by `$data`;
    open var hold_keyboard: Boolean by `$data`;
    open var adjust_position: Boolean by `$data`;
    open var disabled: Boolean by `$data`;
    open var jest_result: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("adjust_position_boolean" to false, "show_confirm_bar_boolean" to false, "fixed_boolean" to false, "auto_height_boolean" to false, "confirm_hold_boolean" to false, "focus_boolean" to true, "auto_focus_boolean" to false, "default_value" to "1\n2\n3\n4\n5\n6", "inputmode_enum" to utsArrayOf<ItemType>(ItemType(value = 1, name = "text"), ItemType(value = 2, name = "decimal"), ItemType(value = 3, name = "numeric"), ItemType(value = 4, name = "tel"), ItemType(value = 5, name = "search"), ItemType(value = 6, name = "email"), ItemType(value = 7, name = "url"), ItemType(value = 0, name = "none")), "confirm_type_list" to utsArrayOf<ItemType>(ItemType(value = 0, name = "return"), ItemType(value = 1, name = "done"), ItemType(value = 2, name = "send"), ItemType(value = 3, name = "search"), ItemType(value = 4, name = "next"), ItemType(value = 5, name = "go")), "cursor_color" to "#3393E2", "cursor" to 0, "inputmode_enum_current" to 0, "confirm_type_current" to 0, "placeholder_value" to "请输入", "defaultModel" to "123", "textareaMaxLengthValue" to "", "selectionStart" to -1, "selectionEnd" to -1, "hold_keyboard" to false, "adjust_position" to false, "disabled" to false, "jest_result" to false);
    }
    override fun `$initMethods`() {
        this.textarea_click = fun() {
            console.log("组件被点击时触发");
        }
        ;
        this.textarea_touchstart = fun() {
            console.log("手指触摸动作开始");
        }
        ;
        this.textarea_touchmove = fun() {
            console.log("手指触摸后移动");
        }
        ;
        this.textarea_touchcancel = fun() {
            console.log("手指触摸动作被打断，如来电提醒，弹窗");
        }
        ;
        this.textarea_touchend = fun() {
            console.log("手指触摸动作结束");
        }
        ;
        this.textarea_tap = fun() {
            console.log("手指触摸后马上离开");
        }
        ;
        this.textarea_longpress = fun() {
            console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.textarea_confirm = fun() {
            console.log("点击完成时， 触发 confirm 事件，event.detail = {value: value}");
        }
        ;
        this.textarea_input = fun() {
            console.log("当键盘输入时，触发 input 事件，event.detail = {value, cursor}， @input 处理函数的返回值并不会反映到 textarea 上");
            this.jest_result = true;
        }
        ;
        this.textarea_linechange = fun() {
            console.log("输入框行数变化时调用，event.detail = {height: 0, height: 0, lineCount: 0}");
        }
        ;
        this.textarea_blur = fun() {
            console.log("输入框失去焦点时触发，event.detail = {value, cursor}");
        }
        ;
        this.textarea_keyboardheightchange = fun() {
            console.log("键盘高度发生变化的时候触发此事件，event.detail = {height: height, duration: duration}");
        }
        ;
        this.textarea_focus = fun() {
            console.log("输入框聚焦时触发，event.detail = { value, height }，height 为键盘高度");
        }
        ;
        this.change_adjust_position_boolean = fun(checked: Boolean) {
            this.adjust_position_boolean = checked;
        }
        ;
        this.change_show_confirm_bar_boolean = fun(checked: Boolean) {
            this.show_confirm_bar_boolean = checked;
        }
        ;
        this.change_fixed_boolean = fun(checked: Boolean) {
            this.fixed_boolean = checked;
        }
        ;
        this.change_auto_height_boolean = fun(checked: Boolean) {
            this.auto_height_boolean = checked;
        }
        ;
        this.change_confirm_hold_boolean = fun(checked: Boolean) {
            this.confirm_hold_boolean = checked;
        }
        ;
        this.change_focus_boolean = fun(checked: Boolean) {
            this.focus_boolean = checked;
        }
        ;
        this.change_auto_focus_boolean = fun(checked: Boolean) {
            this.auto_focus_boolean = checked;
        }
        ;
        this.change_cursor_color_boolean = fun(checked: Boolean) {
            if (checked) {
                this.cursor_color = "transparent";
            } else {
                this.cursor_color = "#3393E2";
            }
        }
        ;
        this.radio_change_inputmode_enum = fun(checked: Number) {
            this.inputmode_enum_current = checked;
        }
        ;
        this.radio_change_confirm_type = fun(checked: Number) {
            this.confirm_type_current = checked;
        }
        ;
        this.setSelection = fun(selectionStart: Number, selectionEnd: Number) {
            uni_getElementById("textarea-instance-2")?.focus();
            this.selectionStart = selectionStart;
            this.selectionEnd = selectionEnd;
        }
        ;
        this.onSelectionBlurChange = fun() {
            this.selectionEnd = 0;
        }
        ;
        this.changeHoldKeyboard = fun(event: UniSwitchChangeEvent) {
            val checked = event.detail.value;
            this.hold_keyboard = checked;
        }
        ;
        this.changeAdjustPosition = fun(event: UniSwitchChangeEvent) {
            val checked = event.detail.value;
            this.adjust_position = checked;
        }
        ;
        this.change_disabled_boolean = fun(checked: Boolean) {
            this.disabled = checked;
        }
        ;
    }
    open lateinit var textarea_click: () -> Unit;
    open lateinit var textarea_touchstart: () -> Unit;
    open lateinit var textarea_touchmove: () -> Unit;
    open lateinit var textarea_touchcancel: () -> Unit;
    open lateinit var textarea_touchend: () -> Unit;
    open lateinit var textarea_tap: () -> Unit;
    open lateinit var textarea_longpress: () -> Unit;
    open lateinit var textarea_confirm: () -> Unit;
    open lateinit var textarea_input: () -> Unit;
    open lateinit var textarea_linechange: () -> Unit;
    open lateinit var textarea_blur: () -> Unit;
    open lateinit var textarea_keyboardheightchange: () -> Unit;
    open lateinit var textarea_focus: () -> Unit;
    open lateinit var change_adjust_position_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_show_confirm_bar_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_fixed_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_auto_height_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_confirm_hold_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_focus_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_auto_focus_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_cursor_color_boolean: (checked: Boolean) -> Unit;
    open lateinit var radio_change_inputmode_enum: (checked: Number) -> Unit;
    open lateinit var radio_change_confirm_type: (checked: Number) -> Unit;
    open lateinit var setSelection: (selectionStart: Number, selectionEnd: Number) -> Unit;
    open lateinit var onSelectionBlurChange: () -> Unit;
    open lateinit var changeHoldKeyboard: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var changeAdjustPosition: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var change_disabled_boolean: (checked: Boolean) -> Unit;
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("minHeight" to 100, "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "textarea-wrap" to padStyleMapOf(utsMapOf("flexDirection" to "row", "justifyContent" to "center")), "title-wrap" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "marginLeft" to 10)), "textarea-instance" to padStyleMapOf(utsMapOf("flex" to 1, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#666666", "marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "placeholder" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFF00")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
