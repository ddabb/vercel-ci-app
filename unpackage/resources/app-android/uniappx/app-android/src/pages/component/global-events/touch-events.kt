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
open class GenPagesComponentGlobalEventsTouchEvents : BasePage {
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
            this.icon = uni_getElementById("icon");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "拖拽图标测试相关事件(在小程序上本示例会卡顿,小程序上应使用movable-view)")),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "view-box", "onTouchstart" to _ctx.onViewTouchStart), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "icon", "id" to "icon", "src" to default2, "onTouchstart" to _ctx.onTouchStart, "onTouchcancel" to _ctx.onTouchCancel, "onTouchmove" to _ctx.onTouchMove, "onTouchend" to _ctx.onTouchEnd), null, 40, utsArrayOf(
                        "onTouchstart",
                        "onTouchcancel",
                        "onTouchmove",
                        "onTouchend"
                    ))
                ), 40, utsArrayOf(
                    "onTouchstart"
                ))
            )),
            if (_ctx.touchEvent != null) {
                createElementVNode("view", utsMapOf("key" to 0), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "title1"), "touches: "),
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.touchEvent!!.touches, fun(touch, index, __index, _cached): Any {
                        return createElementVNode(Fragment, utsMapOf("key" to index), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "title2"), "touch[" + toDisplayString(index) + "]:", 1),
                            createElementVNode("text", null, "identifier: " + toDisplayString(touch.identifier), 1),
                            createElementVNode("text", null, "pageX: " + toDisplayString(touch.pageX) + ", pageY: " + toDisplayString(touch.pageY), 1),
                            createElementVNode("text", null, "clientX: " + toDisplayString(touch.clientX) + ", clientY: " + toDisplayString(touch.clientY), 1),
                            createElementVNode("text", null, "screenX: " + toDisplayString(touch.screenX) + ", screenY: " + toDisplayString(touch.screenY), 1)
                        ), 64);
                    }), 128)
                ));
            } else {
                createCommentVNode("v-if", true);
            }
        ), 4);
    }
    open var move: Boolean by `$data`;
    open var posX: Number by `$data`;
    open var posY: Number by `$data`;
    open var lastX: Number by `$data`;
    open var lastY: Number by `$data`;
    open var touchEvent: TouchEvent? by `$data`;
    open var icon: UniElement? by `$data`;
    open var touchTargets: String by `$data`;
    open var touchTargetsCount: Number by `$data`;
    open var iconRect: DOMRect? by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("move" to false, "posX" to 0, "posY" to 0, "lastX" to 0, "lastY" to 0, "touchEvent" to null as TouchEvent?, "icon" to null as UniElement?, "touchTargets" to "", "touchTargetsCount" to 0, "iconRect" to null as DOMRect?);
    }
    override fun `$initMethods`() {
        this.onViewTouchStart = fun(e: TouchEvent) {
            this.touchTargets += e.target!!.tagName + e.currentTarget!!.tagName;
            this.touchTargetsCount++;
        }
        ;
        this.onTouchStart = fun(e: TouchEvent) {
            this.touchTargetsCount++;
            this.touchTargets += e.target!!.tagName + e.currentTarget!!.tagName;
            this.touchEvent = e;
            if (!this.move) {
                this.move = true;
                this.posX = e.touches[0].screenX;
                this.posY = e.touches[0].screenY;
            }
        }
        ;
        this.onTouchMove = fun(e: TouchEvent) {
            e.preventDefault();
            this.touchEvent = e;
            var p = e.touches[0];
            if (p.screenX == this.lastX && p.screenY == this.lastY) {
                return;
            }
            var x = p.screenX - this.posX;
            var y = p.screenY - this.posY;
            this.lastX = p.screenX;
            this.lastY = p.screenY;
            this.icon?.style?.setProperty("transform", "translate(" + x + "px," + y + "px)");
        }
        ;
        this.onTouchEnd = fun(e: TouchEvent) {
            if (e.touches.length == 0) {
                this.resetIcon();
                this.touchEvent = null;
            }
        }
        ;
        this.onTouchCancel = fun(_: TouchEvent) {
            this.resetIcon();
            this.touchEvent = null;
        }
        ;
        this.resetIcon = fun() {
            this.move = false;
            this.posX = 0;
            this.posY = 0;
            this.icon?.style?.setProperty("transform", "translate(0px,0px)");
        }
        ;
    }
    open lateinit var onViewTouchStart: (e: TouchEvent) -> Unit;
    open lateinit var onTouchStart: (e: TouchEvent) -> Unit;
    open lateinit var onTouchMove: (e: TouchEvent) -> Unit;
    open lateinit var onTouchEnd: (e: TouchEvent) -> Unit;
    open lateinit var onTouchCancel: (_: TouchEvent) -> Unit;
    open lateinit var resetIcon: () -> Unit;
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
                return utsMapOf("container" to padStyleMapOf(utsMapOf("width" to "100%", "flexDirection" to "column", "alignItems" to "center")), "view-box" to padStyleMapOf(utsMapOf("width" to 300, "height" to 300, "alignItems" to "center", "justifyContent" to "center", "borderStyle" to "solid")), "icon" to padStyleMapOf(utsMapOf("width" to 100, "height" to 100)), "title1" to padStyleMapOf(utsMapOf("marginTop" to 10, "fontSize" to 18)), "title2" to padStyleMapOf(utsMapOf("marginTop" to 5, "fontSize" to 16)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
