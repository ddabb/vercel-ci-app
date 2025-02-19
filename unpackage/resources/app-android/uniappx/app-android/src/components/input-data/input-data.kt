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
open class GenComponentsInputDataInputData : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {
            when (this.type) {
                "number" -> 
                    this.inputType = "number";
            }
            this.inputClearValue = this.getValue(this.defaultValue);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-title uni-common-mt"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), toDisplayString(_ctx.title), 1)
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "input-wrapper"), utsArrayOf(
                createElementVNode("input", utsMapOf("class" to "uni-input", "type" to _ctx.inputType, "value" to _ctx.inputClearValue, "placeholder" to _ctx.title, "maxlength" to "-1", "onInput" to _ctx.input, "onBlur" to _ctx.blur, "onFocus" to _ctx.focus), null, 40, utsArrayOf(
                    "type",
                    "value",
                    "placeholder",
                    "onInput",
                    "onBlur",
                    "onFocus"
                )),
                if (isTrue(_ctx.showClearIcon)) {
                    createElementVNode("image", utsMapOf("key" to 0, "class" to "input-wrapper_image", "src" to "/static/icons/clear.png", "onTouchstart" to _ctx.clearIcon), null, 40, utsArrayOf(
                        "onTouchstart"
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
            ))
        ), 64);
    }
    open var title: String by `$props`;
    open var type: String by `$props`;
    open var defaultValue: String by `$props`;
    open var inputClearValue: Any by `$data`;
    open var showClearIcon: Boolean by `$data`;
    open var inputType: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("inputClearValue" to "" as Any, "showClearIcon" to false, "inputType" to "text");
    }
    override fun `$initMethods`() {
        this.input = fun(event: InputEvent) {
            this.inputClearValue = event.detail.value;
            if ((this.inputClearValue as String).length > 0) {
                this.showClearIcon = true;
            } else {
                this.showClearIcon = false;
            }
            this.`$emit`("confirm", this.getValue(this.inputClearValue));
        }
        ;
        this.clearIcon = fun() {
            this.inputClearValue = "";
            this.showClearIcon = false;
            this.`$emit`("confirm", this.getValue(this.inputClearValue));
        }
        ;
        this.blur = fun() {
            this.showClearIcon = false;
        }
        ;
        this.focus = fun() {
            var inputValue = this.inputClearValue;
            if (UTSAndroid.`typeof`( inputValue) !== "string") {
                inputValue = inputValue.toString();
            }
            if ((inputValue as String).length > 0) {
                this.showClearIcon = true;
            } else {
                this.showClearIcon = false;
            }
        }
        ;
        this.getValue = fun(value: Any): Any {
            when (this.type) {
                "number" -> 
                    return parseFloat(value as String);
            }
            return value;
        }
        ;
    }
    open lateinit var input: (event: InputEvent) -> Unit;
    open lateinit var clearIcon: () -> Unit;
    open lateinit var blur: () -> Unit;
    open lateinit var focus: () -> Unit;
    open lateinit var getValue: (value: Any) -> Any;
    companion object {
        var name = "input-data";
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("input-wrapper" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "rgba(0,0,0,0.08)", "flexDirection" to "row", "justifyContent" to "center", "paddingTop" to 0, "paddingRight" to 0, "paddingBottom" to 0, "paddingLeft" to 0, "marginTop" to 0, "marginRight" to 10, "marginBottom" to 0, "marginLeft" to 10, "flexWrap" to "nowrap", "backgroundColor" to "#ffffff")), "input-wrapper_image" to padStyleMapOf(utsMapOf("width" to 22, "height" to 22, "alignSelf" to "center", "marginRight" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf("confirm" to null);
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "required" to true), "type" to utsMapOf("type" to "String", "required" to true), "defaultValue" to utsMapOf("type" to "String", "required" to true, "default" to "")));
        var propsNeedCastKeys = utsArrayOf(
            "defaultValue"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
