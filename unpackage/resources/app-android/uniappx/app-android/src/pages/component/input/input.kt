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
open class GenPagesComponentInputInput : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-common-mt uni-padding-wrap"), utsArrayOf(
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置输入框的初始内容")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-default", "class" to "uni-input", "value" to "hello uni-app x"))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "type取值（不同输入法表现可能不一致）")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-type-text", "class" to "uni-input", "type" to "text", "placeholder" to "文本输入键盘"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-type-number", "class" to "uni-input", "type" to "number", "placeholder" to "数字输入键盘"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-type-digit", "class" to "uni-input", "type" to "digit", "placeholder" to "带小数点的数字输入键盘"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-type-tel", "class" to "uni-input", "type" to _ctx.inputTypeTel, "placeholder" to "电话输入键盘"), null, 8, utsArrayOf(
                            "type"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "密码输入框")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-password", "class" to "uni-input", "password" to _ctx.inputPassword, "value" to _ctx.inputPasswordValue), null, 8, utsArrayOf(
                            "password",
                            "value"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "无value设置的密码输入框")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "password" to true))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "占位符样式")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-placeholder1", "class" to "uni-input", "placeholder-style" to _ctx.inputPlaceHolderStyle, "placeholder" to "占位符文字颜色为红色"), null, 8, utsArrayOf(
                            "placeholder-style"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-placeholder2", "class" to "uni-input", "placeholder-class" to _ctx.inputPlaceHolderClass, "placeholder" to "占位符字体大小为10px"), null, 8, utsArrayOf(
                            "placeholder-class"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "placeholder-style" to _ctx.inputPlaceHolderStyle, "value" to "不设置placeholder只设置placeholder-style"), null, 8, utsArrayOf(
                            "placeholder-style"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-placeholder2", "style" to normalizeStyle(utsMapOf("font-family" to "AlimamaDaoLiTiOTF", "font-weight" to "bold", "text-align" to "right")), "class" to "uni-input", "placeholder-style" to _ctx.placeholderStyle, "placeholder" to "占位符以及内容右对齐"), null, 12, utsArrayOf(
                            "placeholder-style"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置禁用输入框")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-disable", "class" to "uni-input", "disabled" to true))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置最大输入长度")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-maxlength", "class" to "uni-input", "maxlength" to 10, "placeholder" to "最大输入长度为10", "value" to _ctx.inputMaxLengthValue, "onInput" to _ctx.onMaxLengthInput, "focus" to _ctx.inputMaxLengthFocus), null, 40, utsArrayOf(
                            "value",
                            "onInput",
                            "focus"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置光标与键盘的距离")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "cursor-spacing" to 1000, "placeholder" to "光标与键盘的距离为1000px"))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "自动获取焦点")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-focus", "class" to "uni-input", "focus" to _ctx.focus, "onKeyboardheightchange" to _ctx.inputFocusKeyBoardChange), null, 40, utsArrayOf(
                            "focus",
                            "onKeyboardheightchange"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "confirm-type取值（不同输入法表现可能不一致）")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-confirm-send", "class" to "uni-input", "confirmType" to "send", "placeholder" to "键盘右下角按钮显示为发送"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-confirm-search", "class" to "uni-input", "confirmType" to "search", "placeholder" to "键盘右下角按钮显示为搜索"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-confirm-next", "class" to "uni-input", "confirmType" to "next", "placeholder" to "键盘右下角按钮显示为下一个"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-confirm-go", "class" to "uni-input", "confirmType" to "go", "placeholder" to "键盘右下角按钮显示为前往"))
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-confirm-done", "class" to "uni-input", "confirmType" to "done", "placeholder" to "键盘右下角按钮显示为完成"))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "点击键盘右下角按钮时保持键盘不收起")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "confirm-hold" to true))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title", "onClick" to fun(){
                        _ctx.setCursor(4);
                    }
                    ), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置输入框聚焦时光标的位置（点这里）")
                    ), 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("ref" to "input", "class" to "uni-input", "value" to "0123456789", "focus" to _ctx.cursorInputFocus, "cursor" to _ctx.cursor, "onBlur" to _ctx.onCursorBlurChange), null, 40, utsArrayOf(
                            "focus",
                            "cursor",
                            "onBlur"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title", "onClick" to fun(){
                        _ctx.setSelection(0, 4);
                    }
                    ), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置输入框聚焦时光标的起始位置和结束位置（点这里）")
                    ), 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("ref" to "input2", "class" to "uni-input", "value" to "0123456789", "selection-start" to _ctx.selectionStart, "selection-end" to _ctx.selectionEnd, "focus" to _ctx.selectionInputFocus, "onBlur" to _ctx.onSelectionBlurChange), null, 40, utsArrayOf(
                            "selection-start",
                            "selection-end",
                            "focus",
                            "onBlur"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title", "style" to normalizeStyle(utsMapOf("flex-direction" to "row", "align-items" to "center"))), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置光标颜色为红色"),
                        createVNode(_component_switch, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "onChange" to _ctx.changeCursorColor, "checked" to (_ctx.cursor_color == "red")), null, 8, utsArrayOf(
                            "style",
                            "onChange",
                            "checked"
                        ))
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "uni-input-cursor-color", "class" to "uni-input", "cursor-color" to _ctx.cursor_color, "focus" to _ctx.cursorColorInputFocus, "onBlur" to _ctx.cursorColorInputBlur, "value" to "光标颜色"), null, 40, utsArrayOf(
                            "cursor-color",
                            "focus",
                            "onBlur"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "键盘弹起时，自动上推页面")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "adjust-position" to true))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title", "style" to normalizeStyle(utsMapOf("flex-direction" to "row", "align-items" to "center"))), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置hold-keyboard"),
                        createVNode(_component_switch, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "onChange" to _ctx.changeHoldKeyboard, "checked" to _ctx.holdKeyboard), null, 8, utsArrayOf(
                            "style",
                            "onChange",
                            "checked"
                        ))
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "hold-keyboard" to _ctx.holdKeyboard, "value" to "hold keyboard "), null, 8, utsArrayOf(
                            "hold-keyboard"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "input事件"),
                        if (isTrue(_ctx.inputEventDetail)) {
                            createElementVNode("text", utsMapOf("key" to 0, "class" to "uni-subtitle-text"), toDisplayString(_ctx.inputEventDetail), 1);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "onInput" to _ctx.onInput), null, 40, utsArrayOf(
                            "onInput"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "focus事件和blur事件"),
                        if (isTrue(_ctx.focusAndBlurEventDetail)) {
                            createElementVNode("text", utsMapOf("key" to 0, "class" to "uni-subtitle-text"), toDisplayString(_ctx.focusAndBlurEventDetail), 1);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "onFocus" to _ctx.onFocus, "onBlur" to _ctx.onBlur), null, 40, utsArrayOf(
                            "onFocus",
                            "onBlur"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "confirm事件"),
                        if (isTrue(_ctx.confirmEventDetail)) {
                            createElementVNode("text", utsMapOf("key" to 0, "class" to "uni-subtitle-text"), toDisplayString(_ctx.confirmEventDetail), 1);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "onConfirm" to _ctx.onConfirm), null, 40, utsArrayOf(
                            "onConfirm"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "keyboardheightchange事件"),
                        if (isTrue(_ctx.keyboardHeightChangeEventDetail)) {
                            createElementVNode("text", utsMapOf("key" to 0, "class" to "uni-subtitle-text"), toDisplayString(_ctx.keyboardHeightChangeEventDetail), 1);
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "onKeyboardheightchange" to _ctx.onKeyborardHeightChange, "focus" to _ctx.focusedForKeyboardHeightChangeTest), null, 40, utsArrayOf(
                            "onKeyboardheightchange",
                            "focus"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "带清除按钮的输入框")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "placeholder" to "带清除按钮的输入框", "value" to _ctx.inputClearValue, "onInput" to _ctx.clearInput), null, 40, utsArrayOf(
                            "value",
                            "onInput"
                        )),
                        if (isTrue(_ctx.showClearIcon)) {
                            createElementVNode("image", utsMapOf("key" to 0, "class" to "uni-icon", "src" to "/static/icons/clear.png", "onClick" to _ctx.clearIcon), null, 8, utsArrayOf(
                                "onClick"
                            ));
                        } else {
                            createCommentVNode("v-if", true);
                        }
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "可查看密码的输入框")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "placeholder" to "请输入密码", "password" to _ctx.showPassword), null, 8, utsArrayOf(
                            "password"
                        )),
                        createElementVNode("image", utsMapOf("class" to "uni-icon", "src" to if (!_ctx.showPassword) {
                            "/static/icons/eye-active.png";
                        } else {
                            "/static/icons/eye.png";
                        }
                        , "onClick" to _ctx.changePassword), null, 8, utsArrayOf(
                            "src",
                            "onClick"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "同时存在 v-model 和 value")
                    )),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("id" to "both-model-value", "class" to "uni-input", "modelValue" to _ctx.demoValue, "onInput" to fun(`$event`: InputEvent){
                            _ctx.demoValue = `$event`.detail.value;
                        }
                        , "value" to "456"), null, 40, utsArrayOf(
                            "modelValue",
                            "onInput"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title", "style" to normalizeStyle(utsMapOf("flex-direction" to "row", "align-items" to "center"))), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "设置adjust-position"),
                        createVNode(_component_switch, utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "10px")), "onChange" to _ctx.changeAdjustPosition, "checked" to _ctx.adjustPosition), null, 8, utsArrayOf(
                            "style",
                            "onChange",
                            "checked"
                        ))
                    ), 4),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "adjust-position" to _ctx.adjustPosition), null, 8, utsArrayOf(
                            "adjust-position"
                        ))
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "uni-title-text"), "输入内容的同步更新UI")
                    )),
                    createElementVNode("text", null, toDisplayString(_ctx.syncDisplayValue), 1),
                    createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "uni-input", "modelValue" to _ctx.syncDisplayValue, "onInput" to fun(`$event`: InputEvent){
                            _ctx.syncDisplayValue = `$event`.detail.value;
                        }
                        ), null, 40, utsArrayOf(
                            "modelValue",
                            "onInput"
                        ))
                    ))
                ))
            ))
        ), 4);
    }
    open var title: String by `$data`;
    open var showClearIcon: Boolean by `$data`;
    open var inputClearValue: String by `$data`;
    open var showPassword: Boolean by `$data`;
    open var cursor: Number by `$data`;
    open var cursorInputFocus: Boolean by `$data`;
    open var cursor_color: String by `$data`;
    open var cursorColorInputFocus: Boolean by `$data`;
    open var selectionStart: Number by `$data`;
    open var selectionEnd: Number by `$data`;
    open var selectionInputFocus: Boolean by `$data`;
    open var inputEventDetail: String by `$data`;
    open var focusAndBlurEventDetail: String by `$data`;
    open var confirmEventDetail: String by `$data`;
    open var keyboardHeightChangeEventDetail: String by `$data`;
    open var focus: Boolean by `$data`;
    open var inputPassword: Boolean by `$data`;
    open var inputTypeTel: String by `$data`;
    open var inputPlaceHolderStyle: String by `$data`;
    open var placeholderStyle: String by `$data`;
    open var inputPlaceHolderClass: String by `$data`;
    open var inputMaxLengthValue: String by `$data`;
    open var onMaxLengthInputValue: String by `$data`;
    open var inputMaxLengthFocus: Boolean by `$data`;
    open var inputPasswordValue: String by `$data`;
    open var inputFocusKeyBoardChangeValue: Boolean by `$data`;
    open var holdKeyboard: Boolean by `$data`;
    open var keyboardHeight: Number by `$data`;
    open var focusedForKeyboardHeightChangeTest: Boolean by `$data`;
    open var demoValue: String by `$data`;
    open var adjustPosition: Boolean by `$data`;
    open var syncDisplayValue: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "input", "showClearIcon" to false, "inputClearValue" to "", "showPassword" to true, "cursor" to -1, "cursorInputFocus" to false, "cursor_color" to "#3393E2", "cursorColorInputFocus" to false, "selectionStart" to -1, "selectionEnd" to -1, "selectionInputFocus" to false, "inputEventDetail" to "", "focusAndBlurEventDetail" to "", "confirmEventDetail" to "", "keyboardHeightChangeEventDetail" to "", "focus" to true, "inputPassword" to true, "inputTypeTel" to "tel", "inputPlaceHolderStyle" to "color:red", "placeholderStyle" to "font-family: AlimamaDaoLiTiOTF;font-weight: bold;text-align: right", "inputPlaceHolderClass" to "uni-input-placeholder-class" as String, "inputMaxLengthValue" to "", "onMaxLengthInputValue" to "", "inputMaxLengthFocus" to false, "inputPasswordValue" to "cipher", "inputFocusKeyBoardChangeValue" to true, "holdKeyboard" to false, "keyboardHeight" to 0, "focusedForKeyboardHeightChangeTest" to false, "demoValue" to "123", "adjustPosition" to false, "syncDisplayValue" to "");
    }
    override fun `$initMethods`() {
        this.inputFocusKeyBoardChange = fun(e: UniInputKeyboardHeightChangeEvent) {
            this.inputFocusKeyBoardChangeValue = e.detail.height > 50;
        }
        ;
        this.onMaxLengthInput = fun(event: UniInputEvent) {
            this.onMaxLengthInputValue = event.detail.value;
        }
        ;
        this.setCursor = fun(cursor: Number) {
            this.cursorInputFocus = true;
            this.cursor = cursor;
        }
        ;
        this.onCursorBlurChange = fun() {
            this.cursor = 0;
            this.cursorInputFocus = false;
        }
        ;
        this.setSelection = fun(selectionStart: Number, selectionEnd: Number) {
            this.selectionInputFocus = true;
            this.selectionStart = selectionStart;
            this.selectionEnd = selectionEnd;
        }
        ;
        this.onSelectionBlurChange = fun() {
            this.selectionEnd = 0;
            this.selectionInputFocus = false;
        }
        ;
        this.clearInput = fun(event: UniInputEvent) {
            this.inputClearValue = event.detail.value;
            if (event.detail.value.length > 0) {
                this.showClearIcon = true;
            } else {
                this.showClearIcon = false;
            }
        }
        ;
        this.clearIcon = fun() {
            this.inputClearValue = "";
            this.showClearIcon = false;
        }
        ;
        this.changePassword = fun() {
            this.showPassword = !this.showPassword;
        }
        ;
        this.onInput = fun(event: UniInputEvent) {
            console.log("键盘输入", JSON.stringify(event.detail));
            this.inputEventDetail = JSON.stringify(event.detail);
        }
        ;
        this.onFocus = fun(event: UniInputFocusEvent) {
            console.log("输入框聚焦", JSON.stringify(event.detail));
            this.focusAndBlurEventDetail = JSON.stringify(event.detail);
        }
        ;
        this.onBlur = fun(event: UniInputBlurEvent) {
            console.log("输入框失去焦点", JSON.stringify(event.detail));
            this.focusAndBlurEventDetail = JSON.stringify(event.detail);
        }
        ;
        this.onConfirm = fun(event: UniInputConfirmEvent) {
            console.log("点击完成按钮", JSON.stringify(event.detail));
            this.confirmEventDetail = JSON.stringify(event.detail);
        }
        ;
        this.onKeyborardHeightChange = fun(event: UniInputKeyboardHeightChangeEvent) {
            console.log("键盘高度发生变化", JSON.stringify(event.detail));
            this.keyboardHeightChangeEventDetail = JSON.stringify(event.detail);
            this.keyboardHeight = event.detail.height;
        }
        ;
        this.test_check_input_value = fun(): Number {
            return this.onMaxLengthInputValue.length;
        }
        ;
        this.changeCursorColor = fun(event: UniSwitchChangeEvent) {
            val checked = event.detail.value;
            if (checked) {
                this.cursor_color = "red";
            } else {
                this.cursor_color = "#3393E2";
            }
            this.cursorColorInputFocus = true;
        }
        ;
        this.cursorColorInputBlur = fun(event: UniInputBlurEvent) {
            this.cursorColorInputFocus = false;
        }
        ;
        this.changeHoldKeyboard = fun(event: UniSwitchChangeEvent) {
            val checked = event.detail.value;
            this.holdKeyboard = checked;
        }
        ;
        this.changeAdjustPosition = fun(event: UniSwitchChangeEvent) {
            val checked = event.detail.value;
            this.adjustPosition = checked;
        }
        ;
    }
    open lateinit var inputFocusKeyBoardChange: (e: UniInputKeyboardHeightChangeEvent) -> Unit;
    open lateinit var onMaxLengthInput: (event: UniInputEvent) -> Unit;
    open lateinit var setCursor: (cursor: Number) -> Unit;
    open lateinit var onCursorBlurChange: () -> Unit;
    open lateinit var setSelection: (selectionStart: Number, selectionEnd: Number) -> Unit;
    open lateinit var onSelectionBlurChange: () -> Unit;
    open lateinit var clearInput: (event: UniInputEvent) -> Unit;
    open lateinit var clearIcon: () -> Unit;
    open lateinit var changePassword: () -> Unit;
    open lateinit var onInput: (event: UniInputEvent) -> Unit;
    open lateinit var onFocus: (event: UniInputFocusEvent) -> Unit;
    open lateinit var onBlur: (event: UniInputBlurEvent) -> Unit;
    open lateinit var onConfirm: (event: UniInputConfirmEvent) -> Unit;
    open lateinit var onKeyborardHeightChange: (event: UniInputKeyboardHeightChangeEvent) -> Unit;
    open lateinit var test_check_input_value: () -> Number;
    open lateinit var changeCursorColor: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var cursorColorInputBlur: (event: UniInputBlurEvent) -> Unit;
    open lateinit var changeHoldKeyboard: (event: UniSwitchChangeEvent) -> Unit;
    open lateinit var changeAdjustPosition: (event: UniSwitchChangeEvent) -> Unit;
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
                return utsMapOf("input-wrapper" to padStyleMapOf(utsMapOf("display" to "flex", "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13, "marginTop" to 5, "marginRight" to 0, "marginBottom" to 5, "marginLeft" to 0, "flexDirection" to "row", "flexWrap" to "nowrap", "backgroundColor" to "#ffffff")), "uni-input" to padStyleMapOf(utsMapOf("height" to 28, "fontSize" to 15, "paddingTop" to 0, "paddingRight" to 0, "paddingBottom" to 0, "paddingLeft" to 0, "flex" to 1, "backgroundColor" to "#ffffff")), "uni-icon" to padStyleMapOf(utsMapOf("width" to 24, "height" to 24)), "uni-input-placeholder-class" to padStyleMapOf(utsMapOf("fontSize" to 10)), "@FONT-FACE" to utsMapOf("0" to utsMapOf("fontFamily" to "AlimamaDaoLiTiOTF", "src" to "url('/static/font/AlimamaDaoLiTi.otf')")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
