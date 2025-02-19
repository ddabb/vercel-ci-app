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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
open class GenPagesComponentButtonButton : BasePage {
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
            this.text = "uni-app-x";
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        val _component_enum_data = resolveEasyComponent("enum-data", GenComponentsEnumDataEnumDataClass);
        val _component_input_data = resolveEasyComponent("input-data", GenComponentsInputDataInputDataClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createElementVNode("button", utsMapOf("id" to "testButton", "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                    _ctx.button_click,
                    _ctx.button_tap
                ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                    "btn",
                    if (_ctx.default_style) {
                        if (_ctx.disabled_boolean) {
                            "custom-btn-disable";
                        } else {
                            "custom-btn";
                        };
                    } else {
                        "";
                    }
                )), "hover-class" to if (_ctx.default_style) {
                    "is-hover";
                } else {
                    "button-hover";
                }
                ), toDisplayString(_ctx.text), 43, utsArrayOf(
                    "disabled",
                    "size",
                    "type",
                    "plain",
                    "onClick",
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchcancel",
                    "onTouchend",
                    "onLongpress",
                    "hover-class"
                ))
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "按钮是否镂空，背景色透明", "onChange" to _ctx.change_plain_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否禁用", "onChange" to _ctx.change_disabled_boolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "修改默认样式和点击效果(高优先)", "onChange" to _ctx.change_default_style), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_enum_data, utsMapOf("items" to _ctx.size_enum, "title" to "按钮的大小", "onChange" to _ctx.radio_change_size_enum), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    )),
                    createVNode(_component_enum_data, utsMapOf("items" to _ctx.type_enum, "title" to "按钮的类型", "onChange" to _ctx.radio_change_type_enum), null, 8, utsArrayOf(
                        "items",
                        "onChange"
                    )),
                    createVNode(_component_input_data, utsMapOf("defaultValue" to _ctx.text, "title" to "按钮的文案", "type" to "text", "onConfirm" to _ctx.confirm_text_input), null, 8, utsArrayOf(
                        "defaultValue",
                        "onConfirm"
                    )),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "10px"))), null, 4),
                    createElementVNode("button", utsMapOf("onClick" to _ctx.navigateToChild), "更多示例", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "10px"))), null, 4),
                    createElementVNode("button", utsMapOf("onClick" to _ctx.openPrivacyDialog), "open-type实现App隐私政策弹框", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "10px"))), null, 4)
                ))
            ), 4)
        ), 64);
    }
    open var plain_boolean: Boolean by `$data`;
    open var disabled_boolean: Boolean by `$data`;
    open var default_style: Boolean by `$data`;
    open var size_enum: UTSArray<ItemType> by `$data`;
    open var size_enum_current: Number by `$data`;
    open var type_enum: UTSArray<ItemType> by `$data`;
    open var type_enum_current: Number by `$data`;
    open var count: Number by `$data`;
    open var text: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("plain_boolean" to false, "disabled_boolean" to false, "default_style" to false, "size_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "default"), ItemType(value = 1, name = "mini")), "size_enum_current" to 0, "type_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "default"), ItemType(value = 1, name = "primary"), ItemType(value = 2, name = "warn")), "type_enum_current" to 0, "count" to 0, "text" to "");
    }
    override fun `$initMethods`() {
        this.button_click = fun() {
            console.log("组件被点击时触发");
            this.count++;
        }
        ;
        this.button_touchstart = fun() {
            console.log("手指触摸动作开始");
        }
        ;
        this.button_touchmove = fun() {
            console.log("手指触摸后移动");
        }
        ;
        this.button_touchcancel = fun() {
            console.log("手指触摸动作被打断，如来电提醒，弹窗");
        }
        ;
        this.button_touchend = fun() {
            console.log("手指触摸动作结束");
        }
        ;
        this.button_tap = fun() {
            console.log("手指触摸后马上离开");
        }
        ;
        this.button_longpress = fun() {
            console.log("如果一个组件被绑定了 longpress 事件，那么当用户长按这个组件时，该事件将会被触发。");
        }
        ;
        this.change_plain_boolean = fun(checked: Boolean) {
            this.plain_boolean = checked;
        }
        ;
        this.change_disabled_boolean = fun(checked: Boolean) {
            this.disabled_boolean = checked;
        }
        ;
        this.change_default_style = fun(checked: Boolean) {
            this.default_style = checked;
        }
        ;
        this.radio_change_size_enum = fun(checked: Number) {
            this.size_enum_current = checked;
        }
        ;
        this.radio_change_type_enum = fun(checked: Number) {
            this.type_enum_current = checked;
        }
        ;
        this.confirm_text_input = fun(value: String) {
            this.text = value;
        }
        ;
        this.navigateToChild = fun() {
            uni_navigateTo(NavigateToOptions(url = "buttonstatus"));
        }
        ;
        this.openPrivacyDialog = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/component/button/privacy"));
        }
        ;
        this.checkUniButtonElement = fun(): Boolean {
            val button = uni_getElementById("testButton");
            if (button != null && button is UniButtonElement) {
                return true;
            }
            return false;
        }
        ;
    }
    open lateinit var button_click: () -> Unit;
    open lateinit var button_touchstart: () -> Unit;
    open lateinit var button_touchmove: () -> Unit;
    open lateinit var button_touchcancel: () -> Unit;
    open lateinit var button_touchend: () -> Unit;
    open lateinit var button_tap: () -> Unit;
    open lateinit var button_longpress: () -> Unit;
    open lateinit var change_plain_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_disabled_boolean: (checked: Boolean) -> Unit;
    open lateinit var change_default_style: (checked: Boolean) -> Unit;
    open lateinit var radio_change_size_enum: (checked: Number) -> Unit;
    open lateinit var radio_change_type_enum: (checked: Number) -> Unit;
    open lateinit var confirm_text_input: (value: String) -> Unit;
    open lateinit var navigateToChild: () -> Unit;
    open lateinit var openPrivacyDialog: () -> Unit;
    open lateinit var checkUniButtonElement: () -> Boolean;
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "row", "justifyContent" to "center")), "custom-btn" to padStyleMapOf(utsMapOf("color" to "#ffffff", "backgroundColor" to "#1AAD19", "borderColor" to "#1AAD19")), "custom-btn-disable" to padStyleMapOf(utsMapOf("color" to "rgba(255,255,255,0.7)", "backgroundColor" to "rgba(26,173,25,0.7)", "borderColor" to "rgba(26,173,25,0.7)")), "is-hover" to padStyleMapOf(utsMapOf("color" to "rgba(255,255,255,0.6)", "backgroundColor" to "#179b16", "borderColor" to "#179b16")), "button-hover" to padStyleMapOf(utsMapOf("color" to "rgba(0,0,0,0.6)", "backgroundColor" to "#dedede")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
