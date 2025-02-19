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
open class GenPagesAPIElementGetAttributeElementGetAttribute : BasePage {
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
            this.boxTarget = this.`$refs`["box"] as UniElement;
            this.scrollViewTarget = this.`$refs`["scrollView"] as UniElement;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", null, utsArrayOf(
            createElementVNode("view", utsMapOf("id" to "box", "ref" to "box", "style" to normalizeStyle(utsMapOf("padding" to "20rpx"))), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "uni-title-text"), "元素的id：" + toDisplayString(_ctx.attrId), 1),
                createElementVNode("text", utsMapOf("class" to "uni-title-text"), "元素的背景色样式值：" + toDisplayString(_ctx.propertyValue), 1),
                createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "小程序端：getAttribute 获取元素的属性值，目前仅支持id、style"),
                createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "App端：getAttribute 不支持获取 class、style 属性")
            ), 4),
            createElementVNode("button", utsMapOf("onClick" to _ctx.getAttributeId), "getAttribute获取元素的id", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("onClick" to _ctx.setStyle), "setProperty设置背景色", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("onClick" to _ctx.getPropertyValue), "getPropertyValue获取背景色值", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("scroll-view", utsMapOf("ref" to "scrollView", "class" to "scroll-view_H", "direction" to "horizontal"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "scroll-view-item_H uni-bg-red"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "A")
                )),
                createElementVNode("view", utsMapOf("class" to "scroll-view-item_H uni-bg-green"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "B")
                )),
                createElementVNode("view", utsMapOf("class" to "scroll-view-item_H uni-bg-blue"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), "C")
                ))
            ), 512),
            createElementVNode("button", utsMapOf("onClick" to _ctx.scrollTo), "scrollTo设置left滚动200px", 8, utsArrayOf(
                "onClick"
            ))
        ));
    }
    open var boxTarget: UniElement? by `$data`;
    open var scrollViewTarget: UniElement? by `$data`;
    open var attrId: String by `$data`;
    open var attrStyle: String by `$data`;
    open var propertyValue: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("boxTarget" to null as UniElement?, "scrollViewTarget" to null as UniElement?, "attrId" to "", "attrStyle" to "", "propertyValue" to "");
    }
    override fun `$initMethods`() {
        this.scrollTo = fun() {
            this.scrollViewTarget!!.scrollTo(200, 0);
        }
        ;
        this.getAttributeId = fun() {
            this.attrId = this.boxTarget!!.getAttribute("id") ?: "";
        }
        ;
        this.setStyle = fun() {
            this.boxTarget!!.style.setProperty("background-color", "#FFF000");
        }
        ;
        this.getPropertyValue = fun() {
            this.propertyValue = this.boxTarget!!.style.getPropertyValue("background-color") as String;
        }
        ;
        this.getAttributeStyle = fun() {
            this.attrStyle = this.boxTarget!!.getAttribute("style") ?: "";
        }
        ;
    }
    open lateinit var scrollTo: () -> Unit;
    open lateinit var getAttributeId: () -> Unit;
    open lateinit var setStyle: () -> Unit;
    open lateinit var getPropertyValue: () -> Unit;
    open lateinit var getAttributeStyle: () -> Unit;
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
                return utsMapOf("scroll-view_H" to padStyleMapOf(utsMapOf("width" to "100%", "flexDirection" to "row", "marginTop" to "30rpx")), "scroll-view-item_H" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 150, "justifyContent" to "center", "alignItems" to "center")), "text" to padStyleMapOf(utsMapOf("fontSize" to 18, "color" to "#ffffff")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
