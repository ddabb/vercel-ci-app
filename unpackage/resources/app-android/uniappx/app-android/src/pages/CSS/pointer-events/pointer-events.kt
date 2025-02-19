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
open class GenPagesCSSPointerEventsPointerEvents : BasePage {
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
            this.widthOrHeight = uni_getElementById("widthOrHeight");
            this.widthProgress = uni_getElementById("widthProgress");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "container1"), utsArrayOf(
                    createElementVNode("text", null, "控制父视图pointer-events打开时可以点击"),
                    createVNode(_component_switch, utsMapOf("checked" to true, "onChange" to _ctx.onChange1), null, 8, utsArrayOf(
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "container", "style" to normalizeStyle(utsMapOf("pointer-events" to _ctx.pointerEvents1))), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "点击修改宽度"),
                    createElementVNode("view", utsMapOf("class" to "base-style transition-width", "id" to "widthOrHeight", "onClick" to _ctx.changeWidthOrHeight), null, 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4),
                createElementVNode("view", utsMapOf("class" to "container1"), utsArrayOf(
                    createElementVNode("text", null, "控制遮罩层pointer-events关闭时可以点击"),
                    createVNode(_component_switch, utsMapOf("checked" to true, "onChange" to _ctx.onChange2), null, 8, utsArrayOf(
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "点击修改宽度(递增)"),
                    createElementVNode("view", utsMapOf("class" to "width-progress transition-width", "id" to "widthProgress", "onClick" to _ctx.changeWidthProgress), null, 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to "mask", "style" to normalizeStyle(utsMapOf("pointer-events" to _ctx.pointerEvents2))), null, 4)
                ))
            ))
        ), 4);
    }
    open var isTranstionWidthOrHeight: Boolean by `$data`;
    open var widthOrHeight: UniElement? by `$data`;
    open var widthProgress: UniElement? by `$data`;
    open var progressWidth: Number by `$data`;
    open var pointerEvents1: String by `$data`;
    open var pointerEvents2: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("isTranstionWidthOrHeight" to false, "widthOrHeight" to null as UniElement?, "widthProgress" to null as UniElement?, "progressWidth" to 200, "pointerEvents1" to "auto", "pointerEvents2" to "auto");
    }
    override fun `$initMethods`() {
        this.changeWidthOrHeight = fun() {
            this.widthOrHeight?.style?.setProperty("width", if (this.isTranstionWidthOrHeight) {
                "200px";
            } else {
                "300px";
            }
            );
            this.isTranstionWidthOrHeight = !this.isTranstionWidthOrHeight;
        }
        ;
        this.changeWidthProgress = fun() {
            this.progressWidth += 20;
            this.widthProgress?.style?.setProperty("width", this.progressWidth + "px");
        }
        ;
        this.onChange1 = fun(e: UniSwitchChangeEvent) {
            this.pointerEvents1 = if (e.detail.value) {
                "auto";
            } else {
                "none";
            }
            ;
        }
        ;
        this.onChange2 = fun(e: UniSwitchChangeEvent) {
            this.pointerEvents2 = if (e.detail.value) {
                "auto";
            } else {
                "none";
            }
            ;
        }
        ;
    }
    open lateinit var changeWidthOrHeight: () -> Unit;
    open lateinit var changeWidthProgress: () -> Unit;
    open lateinit var onChange1: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var onChange2: (e: UniSwitchChangeEvent) -> Unit;
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
                return utsMapOf("container1" to padStyleMapOf(utsMapOf("marginTop" to 7, "marginRight" to 0, "marginBottom" to 7, "marginLeft" to 7, "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "container" to padStyleMapOf(utsMapOf("marginTop" to 7, "marginRight" to 7, "marginBottom" to 7, "marginLeft" to 7, "backgroundColor" to "#FFFFFF")), "text" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginBottom" to 16)), "base-style" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "width-progress" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "transition-width" to padStyleMapOf(utsMapOf("transitionProperty" to "width", "transitionDuration" to "1s")), "mask" to padStyleMapOf(utsMapOf("position" to "absolute", "bottom" to 0, "left" to 0, "width" to "100%", "height" to 200, "backgroundColor" to "rgba(0,0,0,0.5)")), "@TRANSITION" to utsMapOf("transition-width" to utsMapOf("property" to "width", "duration" to "1s")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
