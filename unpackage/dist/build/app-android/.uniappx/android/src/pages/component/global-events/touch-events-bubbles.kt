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
open class GenPagesComponentGlobalEventsTouchEventsBubbles : BasePage {
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
        onReady(fun() {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "事件冒泡测试")),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "view-box", "id" to "view1", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "mid-view", "id" to "view1-2", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "icon", "id" to "view1-3", "src" to default2, "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), null, 40, utsArrayOf(
                            "onTouchstart",
                            "onTouchmove",
                            "onTouchend"
                        ))
                    ), 40, utsArrayOf(
                        "onTouchstart",
                        "onTouchmove",
                        "onTouchend"
                    ))
                ), 40, utsArrayOf(
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchend"
                )),
                createElementVNode("view", utsMapOf("class" to "view-box", "id" to "view2", "onTouchstart" to _ctx.onTouchStart, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "mid-view", "id" to "view2-2", "onTouchend" to _ctx.onTouchEnd), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "beige")), "class" to "icon", "id" to "view2-3", "onTouchstart" to _ctx.onTouchStart, "onTouchend" to _ctx.onTouchEnd), null, 44, utsArrayOf(
                            "onTouchstart",
                            "onTouchend"
                        ))
                    ), 40, utsArrayOf(
                        "onTouchend"
                    ))
                ), 40, utsArrayOf(
                    "onTouchstart",
                    "onTouchmove",
                    "onTouchend"
                ))
            ))
        ), 4);
    }
    open var iconRect: DOMRect? by `$data`;
    open var viewEleRect: DOMRect? by `$data`;
    open var touchstartValue: UTSArray<String> by `$data`;
    open var touchmoveValue: UTSArray<String> by `$data`;
    open var touchendValue: UTSArray<String> by `$data`;
    open var ret1: Boolean by `$data`;
    open var ret2: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("iconRect" to null as DOMRect?, "viewEleRect" to null as DOMRect?, "touchstartValue" to utsArrayOf<String>(), "touchmoveValue" to utsArrayOf<String>(), "touchendValue" to utsArrayOf<String>(), "ret1" to false, "ret2" to false);
    }
    override fun `$initMethods`() {
        this.clearValue = fun() {
            this.touchstartValue = utsArrayOf();
            this.touchmoveValue = utsArrayOf();
            this.touchendValue = utsArrayOf();
        }
        ;
        this.isPassTest1 = fun() {
            var touchStart = this.touchstartValue.join("");
            var touchMove = this.touchmoveValue.join("");
            var touchEnd = this.touchendValue.join("");
            console.log("touchStart: ", touchStart);
            console.log("touchMove: ", touchMove);
            console.log("touchEnd: ", touchEnd);
            var result = touchStart == "view1-3view1-2view1" && touchMove == "view1-3view1-2view1" && touchEnd == "view1-3view1-2view1";
            console.log("isPassTest1", result);
            this.ret1 = result;
            this.clearValue();
        }
        ;
        this.isPassTest2 = fun() {
            var touchStart = this.touchstartValue.join("");
            var touchMove = this.touchmoveValue.join("");
            var touchEnd = this.touchendValue.join("");
            console.log("touchStart: ", touchStart);
            console.log("touchMove: ", touchMove);
            console.log("touchEnd: ", touchEnd);
            var result = touchStart == "view2-3view2" && touchMove == "view2" && touchEnd == "view2-3view2-2view2";
            console.log("isPassTest2", result);
            this.ret2 = result;
            this.clearValue();
        }
        ;
        this.onTouchStart = fun(e: TouchEvent) {
            var _id = e.currentTarget!!.attributes.get("id") as String;
            if (!this.touchstartValue.includes(_id)) {
                this.touchstartValue.push(_id);
            }
            console.log("onTouchStart", e.currentTarget!!.attributes.get("id"));
        }
        ;
        this.onTouchMove = fun(e: TouchEvent) {
            var _id = e.currentTarget!!.attributes.get("id") as String;
            if (!this.touchmoveValue.includes(_id)) {
                this.touchmoveValue.push(_id);
            }
            console.log("onTouchMove", e.currentTarget!!.attributes.get("id"));
        }
        ;
        this.onTouchEnd = fun(e: TouchEvent) {
            var _id = e.currentTarget!!.attributes.get("id") as String;
            if (!this.touchendValue.includes(_id)) {
                this.touchendValue.push(_id);
            }
        }
        ;
    }
    open lateinit var clearValue: () -> Unit;
    open lateinit var isPassTest1: () -> Unit;
    open lateinit var isPassTest2: () -> Unit;
    open lateinit var onTouchStart: (e: TouchEvent) -> Unit;
    open lateinit var onTouchMove: (e: TouchEvent) -> Unit;
    open lateinit var onTouchEnd: (e: TouchEvent) -> Unit;
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
                return utsMapOf("container" to padStyleMapOf(utsMapOf("width" to "100%", "height" to "80%", "flexDirection" to "column", "alignItems" to "center", "justifyContent" to "space-between")), "view-box" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "alignItems" to "center", "justifyContent" to "center", "borderStyle" to "solid")), "mid-view" to padStyleMapOf(utsMapOf("width" to 150, "height" to 150, "alignItems" to "center", "justifyContent" to "center", "backgroundColor" to "#00FFFF")), "icon" to padStyleMapOf(utsMapOf("width" to 100, "height" to 100)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
