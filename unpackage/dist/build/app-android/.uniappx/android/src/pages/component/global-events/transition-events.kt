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
open class GenPagesComponentGlobalEventsTransitionEvents : BasePage {
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
            var that = this;
            open class ThreadRunnable : Runnable {
                override fun run() {
                    that.isShow = true;
                }
            }
            Thread(ThreadRunnable()).start();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return if (isTrue(_ctx.isShow)) {
            createElementVNode("scroll-view", utsMapOf("key" to 0, "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "transition-transform", "id" to "transition-transform", "onTransitionend" to _ctx.onEnd, "src" to "/static/uni.png"), null, 40, utsArrayOf(
                    "onTransitionend"
                )),
                createElementVNode("text", utsMapOf("class" to "adjust"), "对图片设置transform进行旋转，在旋转完成的transitionend事件后，继续旋转"),
                createElementVNode("button", utsMapOf("class" to "adjust", "onClick" to _ctx.switchBtn), toDisplayString(_ctx.buttonValue), 9, utsArrayOf(
                    "onClick"
                ))
            ), 4);
        } else {
            createCommentVNode("v-if", true);
        }
        ;
    }
    open var times: Number by `$data`;
    open var element: UniElement? by `$data`;
    open var isStart: Boolean by `$data`;
    open var buttonValue: String by `$data`;
    open var onTransitionEndTriggr: Boolean by `$data`;
    open var isShow: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("times" to 0, "element" to null as UniElement?, "isStart" to false, "buttonValue" to "开启图片旋转", "onTransitionEndTriggr" to false, "isShow" to false);
    }
    override fun `$initMethods`() {
        this.switchBtn = fun() {
            if (!this.isStart) {
                if (this.element == null) {
                    this.element = uni_getElementById("transition-transform");
                }
                this.buttonValue = "关闭图片旋转";
                this.times = this.times + 1;
                this.element!!.style.setProperty("transition-duration", "2000ms");
                this.element!!.style.setProperty("transform", "rotate(" + this.times * 360 + "deg)");
                this.isStart = true;
            } else {
                this.isStart = false;
                this.times = 0;
                this.onTransitionEndTriggr = false;
                this.buttonValue = "开启图片旋转";
                this.element!!.style.setProperty("transition-duration", "0ms");
                this.element!!.style.setProperty("transform", "rotate(" + this.times * 360 + "deg)");
            }
        }
        ;
        this.onEnd = fun() {
            if (this.isStart) {
                this.times = this.times + 1;
                this.element!!.style.setProperty("transform", "rotate(" + this.times * 360 + "deg)");
                this.onTransitionEndTriggr = true;
            }
        }
        ;
    }
    open lateinit var switchBtn: () -> Unit;
    open lateinit var onEnd: () -> Unit;
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
                return utsMapOf("adjust" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "transition-transform" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "marginTop" to 25, "marginRight" to "auto", "marginBottom" to 25, "marginLeft" to "auto", "borderRadius" to 100, "transitionDuration" to "2000ms", "transitionProperty" to "transform", "transitionTimingFunction" to "linear", "transform" to "rotate(0deg)")), "@TRANSITION" to utsMapOf("transition-transform" to utsMapOf("duration" to "2000ms", "property" to "transform", "timingFunction" to "linear")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
