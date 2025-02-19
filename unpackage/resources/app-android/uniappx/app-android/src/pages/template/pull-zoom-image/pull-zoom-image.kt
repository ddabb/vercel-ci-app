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
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
open class GenPagesTemplatePullZoomImagePullZoomImage : BasePage {
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
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("view", utsMapOf("onClick" to _ctx.back, "class" to "nav-back"), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "back-img", "src" to "/static/template/pull-zoom-image/back.png", "mode" to "widthFix"))
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "refresher-enabled" to true, "refresher-default-style" to "none", "onRefresherpulling" to _ctx.onRefresherpulling, "refresher-threshold" to 300, "refresher-max-drag-distance" to 299, "onScroll" to _ctx.onScroll, "rebound" to false), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "head-img-box-2", "ref" to "head-img-box-2"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "img", "ref" to "head-img-2", "src" to "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/pull-zoom-image-head-img.jpg", "mode" to "scaleToFill"), null, 512)
                ), 512),
                createElementVNode("view", utsMapOf("class" to "user-info", "ref" to "user-info"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "user-avatar", "src" to "/static/test-image/logo.png", "mode" to "widthFix")),
                    createElementVNode("view", utsMapOf("class" to "font-box"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "username"), "uni-app-x"),
                        createElementVNode("text", utsMapOf("class" to "slogan"), "一次开发，多端覆盖")
                    ))
                ), 512),
                createElementVNode("view", utsMapOf("class" to "list-box"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(30, fun(item, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to "item", "key" to index), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "text"), toDisplayString(item) + ". 占位", 1)
                        ));
                    }
                    ), 64)
                )),
                createElementVNode("view", utsMapOf("slot" to "refresher"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "head-img-box-1"), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "img", "ref" to "head-img-1", "src" to "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/pull-zoom-image-head-img.jpg", "mode" to "scaleToFill"), null, 512)
                    ))
                ))
            ), 44, utsArrayOf(
                "onRefresherpulling",
                "onScroll"
            ))
        ), 64);
    }
    open var `$elementMap`: Map<String, UniElement> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("\$elementMap" to Map<String, UniElement>());
    }
    override fun `$initMethods`() {
        this.onScroll = fun(e: ScrollEvent) {
            val scrollTop = e.detail.scrollTop;
            var y: Number = scrollTop - 110;
            var s: Number = (100 - scrollTop / 3) / 100;
            if (y < 0) {
                y = 0;
            }
            if (s < 0.7) {
                s = 0.7;
            }
            var x: Number = (1 - s) * -100;
            this.setElementStyle("user-info", "transform", "translate(" + x + "px, " + (y + (s - 1) * -50) + "px) scale(" + s + ")");
            this.setElementStyle("head-img-box-2", "transform", "translateY(" + y + "px)");
        }
        ;
        this.onRefresherpulling = fun(e: RefresherEvent) {
            var pullingDistance: Number = e.detail.dy;
            this.setElementStyle("head-img-1", "transform", "scale(" + (pullingDistance / 200 + 1) + ")");
            this.setElementStyle("head-img-2", "transform", "scale(" + (pullingDistance / 200 + 1) + ")");
        }
        ;
        this.setElementStyle = fun(refName: String, propertyName: String, propertyStyle: Any): Unit {
            var element: UniElement? = (this.`$data`["\$elementMap"] as Map<String, UniElement>).get(refName);
            if (element == null) {
                element = this.`$refs`[refName] as UniElement;
                (this.`$data`["\$elementMap"] as Map<String, UniElement>).set(refName, element);
            }
            element.style.setProperty(propertyName, propertyStyle);
        }
        ;
        this.back = fun() {
            uni_navigateBack(NavigateBackOptions(success = fun(result) {
                console.log("navigateBack success", result.errMsg);
            }
            , fail = fun(error) {
                console.log("navigateBack fail", error.errMsg);
            }
            , complete = fun(result) {
                console.log("navigateBack complete", result.errMsg);
            }
            ));
        }
        ;
    }
    open lateinit var onScroll: (e: ScrollEvent) -> Unit;
    open lateinit var onRefresherpulling: (e: RefresherEvent) -> Unit;
    open lateinit var setElementStyle: (refName: String, propertyName: String, propertyStyle: Any) -> Unit;
    open lateinit var back: () -> Unit;
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
                return utsMapOf("head-img-box-1" to padStyleMapOf(utsMapOf("position" to "relative", "height" to 300)), "head-img-box-2" to padStyleMapOf(utsMapOf("position" to "relative", "height" to 200, "zIndex" to 9)), "img" to utsMapOf(".head-img-box-1 " to utsMapOf("position" to "absolute", "left" to "-125rpx", "width" to "1000rpx", "height" to 600, "top" to 0), ".head-img-box-2 " to utsMapOf("position" to "absolute", "left" to "-125rpx", "width" to "1000rpx", "height" to 600, "bottom" to -100)), "user-info" to padStyleMapOf(utsMapOf("marginTop" to -110, "width" to "750rpx", "paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "flexDirection" to "row", "zIndex" to 10)), "user-avatar" to utsMapOf(".user-info " to utsMapOf("width" to 75, "height" to 75, "borderRadius" to 100, "borderWidth" to 3, "borderStyle" to "solid", "borderColor" to "#FFFFFF")), "font-box" to utsMapOf(".user-info " to utsMapOf("flexDirection" to "column", "justifyContent" to "space-around", "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "username" to utsMapOf(".user-info " to utsMapOf("fontSize" to 26, "color" to "#FFFFFF")), "slogan" to utsMapOf(".user-info " to utsMapOf("fontSize" to 16, "color" to "#FFFFFF")), "list-box" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "zIndex" to 1)), "item" to utsMapOf(".list-box " to utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "marginTop" to 5, "marginRight" to 5, "marginBottom" to 5, "marginLeft" to 5, "borderRadius" to 5, "borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "rgba(220,220,220,0.3)")), "text" to utsMapOf(".list-box " to utsMapOf("fontSize" to 14, "color" to "#666666", "lineHeight" to "20px")), "nav-back" to padStyleMapOf(utsMapOf("position" to "absolute", "top" to 30, "left" to 10, "borderRadius" to 100, "width" to 28, "height" to 28, "justifyContent" to "center", "alignItems" to "center", "zIndex" to 10)), "back-img" to utsMapOf(".nav-back " to utsMapOf("width" to 18, "height" to 18)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
