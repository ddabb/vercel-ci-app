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
open class GenPagesComponentButtonButtonstatus : BasePage {
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
        return createElementVNode("scroll-view", utsMapOf("direction" to "vertical", "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "main"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[0].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " type-default ", 46, utsArrayOf(
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
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[1].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " type-primary ", 46, utsArrayOf(
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
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[2].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " type-warn ", 46, utsArrayOf(
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
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[0].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " size-default ", 46, utsArrayOf(
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
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[1].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " size-mini ", 46, utsArrayOf(
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
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to true, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " plain-true ", 46, utsArrayOf(
                        "disabled",
                        "size",
                        "type",
                        "onClick",
                        "onTouchstart",
                        "onTouchmove",
                        "onTouchcancel",
                        "onTouchend",
                        "onLongpress",
                        "hover-class"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to _ctx.disabled_boolean, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to false, "onClick" to utsArrayOf(
                        _ctx.button_click,
                        _ctx.button_tap
                    ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                        "btn",
                        if (_ctx.default_style) {
                            "custom-btn";
                        } else {
                            "";
                        }
                    )), "hover-class" to if (_ctx.default_style) {
                        "is-hover";
                    } else {
                        "button-hover";
                    }
                    ), " plain-false ", 46, utsArrayOf(
                        "disabled",
                        "size",
                        "type",
                        "onClick",
                        "onTouchstart",
                        "onTouchmove",
                        "onTouchcancel",
                        "onTouchend",
                        "onLongpress",
                        "hover-class"
                    ))
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px", "position" to "relative", "text-align" to "left", "padding" to "5px", "color" to "#ffffff", "background-color" to "#1AAD19", "font-size" to "10px", "line-height" to "2")), "disabled" to _ctx.disabled_boolean), " custom-btn ", 12, utsArrayOf(
                    "disabled"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px", "font-size" to "15px", "color" to "red")), "type" to "warn", "plain" to "true", "disabled" to _ctx.disabled_boolean), " custom-btn-plain-warn ", 12, utsArrayOf(
                    "disabled"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "type" to "primary", "size" to "default", "disabled" to _ctx.disabled_boolean, "hover-class" to "none"), "hover-class none", 12, utsArrayOf(
                    "disabled"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "type" to "primary", "size" to "default", "disabled" to _ctx.disabled_boolean), "uni-app x", 12, utsArrayOf(
                    "disabled"
                )),
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "type" to "primary", "onClick" to fun(){
                    _ctx.change_disabled_boolean(!_ctx.disabled_boolean);
                }
                ), "修改disabled为" + toDisplayString(!_ctx.disabled_boolean), 13, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to false, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                    _ctx.button_click,
                    _ctx.button_tap
                ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                    "btn",
                    if (_ctx.default_style) {
                        "custom-btn";
                    } else {
                        "";
                    }
                )), "hover-class" to if (_ctx.default_style) {
                    "is-hover";
                } else {
                    "button-hover";
                }
                ), " disable-false ", 46, utsArrayOf(
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
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("button", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "10px")), "disabled" to true, "size" to _ctx.size_enum[_ctx.size_enum_current].name, "type" to _ctx.type_enum[_ctx.type_enum_current].name, "plain" to _ctx.plain_boolean, "onClick" to utsArrayOf(
                    _ctx.button_click,
                    _ctx.button_tap
                ), "onTouchstart" to _ctx.button_touchstart, "onTouchmove" to _ctx.button_touchmove, "onTouchcancel" to _ctx.button_touchcancel, "onTouchend" to _ctx.button_touchend, "onLongpress" to _ctx.button_longpress, "class" to normalizeClass(utsArrayOf(
                    "btn",
                    if (_ctx.default_style) {
                        "custom-btn";
                    } else {
                        "";
                    }
                )), "hover-class" to if (_ctx.default_style) {
                    "is-hover";
                } else {
                    "button-hover";
                }
                ), " disable-true ", 46, utsArrayOf(
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
            ))
        ), 4);
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
        return utsMapOf("plain_boolean" to false, "disabled_boolean" to false, "default_style" to false, "size_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "default"), ItemType(value = 1, name = "mini")), "size_enum_current" to 0, "type_enum" to utsArrayOf<ItemType>(ItemType(value = 0, name = "default"), ItemType(value = 1, name = "primary"), ItemType(value = 2, name = "warn")), "type_enum_current" to 0, "count" to 0, "text" to "uni-app-x");
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
                return utsMapOf("main" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0, "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "rgba(0,0,0,0.06)", "flexDirection" to "column", "justifyContent" to "center")), "list-item" to utsMapOf(".main " to utsMapOf("width" to "100%", "height" to 100, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#666666")), "custom-btn" to padStyleMapOf(utsMapOf("color" to "#ffffff", "backgroundColor" to "#1AAD19", "borderColor" to "#1AAD19", "borderRadius" to 5, "borderWidth" to 0.5, "height" to 53)), "is-hover" to padStyleMapOf(utsMapOf("color" to "rgba(255,255,255,0.6)", "backgroundColor" to "#179b16", "borderColor" to "#179b16")), "container" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 60)), "button-hover" to padStyleMapOf(utsMapOf("color" to "rgba(0,0,0,0.6)", "backgroundColor" to "#dedede")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
