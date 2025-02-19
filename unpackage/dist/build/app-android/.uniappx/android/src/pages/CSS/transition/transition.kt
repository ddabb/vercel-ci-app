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
open class GenPagesCSSTransitionTransition : BasePage {
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
            this.styleMargin = uni_getElementById("styleMargin");
            this.stylePadding = uni_getElementById("stylePadding");
            this.styleBackground = uni_getElementById("styleBackground");
            this.styleBackground2 = uni_getElementById("styleBackground2");
            this.styleOpacity = uni_getElementById("styleOpacity");
            this.styleTransform = uni_getElementById("styleTransform");
            this.styleBorder = uni_getElementById("styleBorder");
            this.stylePosition = uni_getElementById("stylePosition");
            this.propertyStyleBackground = uni_getElementById("propertyStyleBackground");
            this.styleTransformWithOrigin = uni_getElementById("styleTransformWithOrigin");
            this.styleTransformWithWidth = uni_getElementById("styleTransformWithWidth");
            this.styleTransformTranslate = uni_getElementById("transformTranslate");
            this.styleTransformTranslateScale = uni_getElementById("styleTransformTranslateScale");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改宽度"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-width", "id" to "widthOrHeight", "onClick" to _ctx.changeWidthOrHeight), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改宽度(递增)"),
                createElementVNode("view", utsMapOf("class" to "width-progress transition-width", "id" to "widthProgress", "onClick" to _ctx.changeWidthProgress), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Margin"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-margin", "id" to "styleMargin", "onClick" to _ctx.changeMargin), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Padding"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-padding", "id" to "stylePadding", "onClick" to _ctx.changePadding), utsArrayOf(
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "black", "height" to "50px", "width" to "50px"))), null, 4)
                ), 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改background-color和opacity"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-background", "id" to "styleBackground", "onClick" to _ctx.changeBackground), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改background-color（rgba）"),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "base-style transition-background", "id" to "styleBackground2", "onClick" to _ctx.changeBackground2), null, 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4)
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改opacity渐隐渐现"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-opacity", "id" to "styleOpacity", "onClick" to _ctx.changeStyleOpacity), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "动态修改background-color和duration"),
                createElementVNode("view", utsMapOf("class" to "base-style", "id" to "propertyStyleBackground", "onClick" to _ctx.propertyChangeBackground), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Transform"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-transform", "id" to "styleTransform", "onClick" to _ctx.changeTransform), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改TransformTranslate"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-transform", "id" to "transformTranslate", "onClick" to _ctx.changeTransformTranslate), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container", "onTouchmove" to _ctx.handleTouchMove, "onTouchstart" to _ctx.handleTouchStart, "onTouchend" to _ctx.handleTouchEnd), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "在组件内滑动测试是否闪动"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-transform", "id" to "styleTransformTranslateScale"))
            ), 40, utsArrayOf(
                "onTouchmove",
                "onTouchstart",
                "onTouchend"
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Transform和宽"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-transform-width", "id" to "styleTransformWithWidth", "onClick" to _ctx.changeTransformWithWidth), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container", "onClick" to _ctx.changeTransformWithOrigin), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Transform（含transform-origin）"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-transform", "style" to normalizeStyle(utsMapOf("transform-origin" to "0 0")), "id" to "styleTransformWithOrigin"), null, 4)
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Border"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-border", "id" to "styleBorder", "onClick" to _ctx.changeBorder), null, 8, utsArrayOf(
                    "onClick"
                ))
            )),
            createElementVNode("view", utsMapOf("class" to "container"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "text"), "点击修改Position"),
                createElementVNode("view", utsMapOf("class" to "base-style transition-position", "id" to "stylePosition", "onClick" to _ctx.changestylePosition), null, 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 4);
    }
    open var isTranstionWidthOrHeight: Boolean by `$data`;
    open var widthOrHeight: UniElement? by `$data`;
    open var widthProgress: UniElement? by `$data`;
    open var progressWidth: Number by `$data`;
    open var isTranstionChangeMargin: Boolean by `$data`;
    open var styleMargin: UniElement? by `$data`;
    open var isTransitionStylePadding: Boolean by `$data`;
    open var stylePadding: UniElement? by `$data`;
    open var isTransitionstyleBackground: Boolean by `$data`;
    open var isTransitionstyleBackground2: Boolean by `$data`;
    open var isTransitionstyleOpacity: Boolean by `$data`;
    open var styleBackground: UniElement? by `$data`;
    open var styleBackground2: UniElement? by `$data`;
    open var styleOpacity: UniElement? by `$data`;
    open var isTransitionStyleTransform: Boolean by `$data`;
    open var styleTransform: UniElement? by `$data`;
    open var isTransitionStyleTransformWithWidth: Boolean by `$data`;
    open var styleTransformWithWidth: UniElement? by `$data`;
    open var isTransitionstyleBorder: Boolean by `$data`;
    open var styleBorder: UniElement? by `$data`;
    open var isTransitionstylePosition: Boolean by `$data`;
    open var stylePosition: UniElement? by `$data`;
    open var isSetTransition: Boolean by `$data`;
    open var isTransitionpropertystyleBackground: Boolean by `$data`;
    open var propertyStyleBackground: UniElement? by `$data`;
    open var isTransitionStyleTransformWithOrigin: Boolean by `$data`;
    open var styleTransformWithOrigin: UniElement? by `$data`;
    open var styleTransformTranslate: UniElement? by `$data`;
    open var isTransformTranslate: Boolean by `$data`;
    open var styleTransformTranslateScale: UniElement? by `$data`;
    open var startX: Number by `$data`;
    open var moveX: Number by `$data`;
    open var oldX: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("isTranstionWidthOrHeight" to false, "widthOrHeight" to null as UniElement?, "widthProgress" to null as UniElement?, "progressWidth" to 200, "isTranstionChangeMargin" to false, "styleMargin" to null as UniElement?, "isTransitionStylePadding" to false, "stylePadding" to null as UniElement?, "isTransitionstyleBackground" to false, "isTransitionstyleBackground2" to false, "isTransitionstyleOpacity" to false, "styleBackground" to null as UniElement?, "styleBackground2" to null as UniElement?, "styleOpacity" to null as UniElement?, "isTransitionStyleTransform" to false, "styleTransform" to null as UniElement?, "isTransitionStyleTransformWithWidth" to false, "styleTransformWithWidth" to null as UniElement?, "isTransitionstyleBorder" to false, "styleBorder" to null as UniElement?, "isTransitionstylePosition" to false, "stylePosition" to null as UniElement?, "isSetTransition" to false, "isTransitionpropertystyleBackground" to false, "propertyStyleBackground" to null as UniElement?, "isTransitionStyleTransformWithOrigin" to false, "styleTransformWithOrigin" to null as UniElement?, "styleTransformTranslate" to null as UniElement?, "isTransformTranslate" to false, "styleTransformTranslateScale" to null as UniElement?, "startX" to 0, "moveX" to 0, "oldX" to 0);
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
        this.changeMargin = fun() {
            this.styleMargin?.style?.setProperty("margin-top", if (this.isTranstionChangeMargin) {
                "0px";
            } else {
                "50px";
            }
            );
            this.styleMargin?.style?.setProperty("margin-left", if (this.isTranstionChangeMargin) {
                "0px";
            } else {
                "50px";
            }
            );
            this.isTranstionChangeMargin = !this.isTranstionChangeMargin;
        }
        ;
        this.changePadding = fun() {
            this.stylePadding?.style?.setProperty("padding-top", if (this.isTransitionStylePadding) {
                "0px";
            } else {
                "50px";
            }
            );
            this.stylePadding?.style?.setProperty("padding-left", if (this.isTransitionStylePadding) {
                "0px";
            } else {
                "50px";
            }
            );
            this.isTransitionStylePadding = !this.isTransitionStylePadding;
        }
        ;
        this.changeBackground = fun() {
            this.styleBackground?.style?.setProperty("background-color", if (this.isTransitionstyleBackground) {
                "brown";
            } else {
                "black";
            }
            );
            this.styleBackground?.style?.setProperty("opacity", if (this.isTransitionstyleBackground) {
                "1";
            } else {
                "0.5";
            }
            );
            this.isTransitionstyleBackground = !this.isTransitionstyleBackground;
        }
        ;
        this.changeBackground2 = fun() {
            this.styleBackground2?.style?.setProperty("background-color", if (this.isTransitionstyleBackground2) {
                "brown";
            } else {
                "rgba(0, 0, 0, 0.5)";
            }
            );
            this.isTransitionstyleBackground2 = !this.isTransitionstyleBackground2;
        }
        ;
        this.changeStyleOpacity = fun() {
            this.styleOpacity?.style?.setProperty("opacity", if (this.isTransitionstyleOpacity) {
                "1";
            } else {
                "0";
            }
            );
            this.styleOpacity?.style?.setProperty("transition-duration", "1000ms");
            this.isTransitionstyleOpacity = !this.isTransitionstyleOpacity;
        }
        ;
        this.propertyChangeBackground = fun() {
            if (!this.isSetTransition) {
                this.propertyStyleBackground?.style?.setProperty("transition-property", "background-color");
                this.propertyStyleBackground?.style?.setProperty("transition-duration", "1000ms");
                this.isSetTransition = true;
            }
            this.propertyStyleBackground?.style?.setProperty("background-color", if (this.isTransitionpropertystyleBackground) {
                "brown";
            } else {
                "black";
            }
            );
            this.isTransitionpropertystyleBackground = !this.isTransitionpropertystyleBackground;
        }
        ;
        this.changeTransform = fun() {
            this.styleTransform?.style?.setProperty("transform", if (this.isTransitionStyleTransform) {
                "rotate(0deg)";
            } else {
                "rotate(135deg)";
            }
            );
            this.isTransitionStyleTransform = !this.isTransitionStyleTransform;
        }
        ;
        this.changeTransformTranslate = fun() {
            val translate = if (this.isTransformTranslate) {
                "translate(0%,0%)";
            } else {
                "translate(100%,0%)";
            }
            ;
            this.styleTransformTranslate?.style?.setProperty("transform", translate);
            this.isTransformTranslate = !this.isTransformTranslate;
        }
        ;
        this.changeTransformWithWidth = fun() {
            this.styleTransformWithWidth?.style?.setProperty("transform", if (this.isTransitionStyleTransformWithWidth) {
                "rotate(0deg)";
            } else {
                "rotate(135deg)";
            }
            );
            this.styleTransformWithWidth?.style?.setProperty("width", if (this.isTransitionStyleTransformWithWidth) {
                "200px";
            } else {
                "100px";
            }
            );
            this.isTransitionStyleTransformWithWidth = !this.isTransitionStyleTransformWithWidth;
        }
        ;
        this.changeTransformWithOrigin = fun() {
            this.styleTransformWithOrigin?.style?.setProperty("transform", if (this.isTransitionStyleTransformWithOrigin) {
                "scaleX(1)";
            } else {
                "scaleX(0)";
            }
            );
            this.isTransitionStyleTransformWithOrigin = !this.isTransitionStyleTransformWithOrigin;
        }
        ;
        this.changeBorder = fun() {
            this.styleBorder?.style?.setProperty("border-color", if (this.isTransitionstyleBorder) {
                "brown";
            } else {
                "yellow";
            }
            );
            this.isTransitionstyleBorder = !this.isTransitionstyleBorder;
        }
        ;
        this.changestylePosition = fun() {
            this.stylePosition?.style?.setProperty("left", if (this.isTransitionstylePosition) {
                "0px";
            } else {
                "100px";
            }
            );
            this.isTransitionstylePosition = !this.isTransitionstylePosition;
        }
        ;
        this.handleTouchStart = fun(e: UniTouchEvent) {
            this.startX = e.changedTouches[0].clientX;
        }
        ;
        this.handleTouchMove = fun(e: UniTouchEvent) {
            console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY);
            e.preventDefault();
            e.stopPropagation();
            val difX = e.changedTouches[0].clientX;
            this.moveX = difX - this.startX + this.oldX;
            this.styleTransformTranslateScale?.style?.setProperty("transition-duration", "0ms");
            this.styleTransformTranslateScale?.style?.setProperty("transform", "translate(" + this.moveX + "px,0px) scale(0.5)");
        }
        ;
        this.handleTouchEnd = fun(_: UniTouchEvent) {
            this.oldX = this.moveX;
        }
        ;
    }
    open lateinit var changeWidthOrHeight: () -> Unit;
    open lateinit var changeWidthProgress: () -> Unit;
    open lateinit var changeMargin: () -> Unit;
    open lateinit var changePadding: () -> Unit;
    open lateinit var changeBackground: () -> Unit;
    open lateinit var changeBackground2: () -> Unit;
    open lateinit var changeStyleOpacity: () -> Unit;
    open lateinit var propertyChangeBackground: () -> Unit;
    open lateinit var changeTransform: () -> Unit;
    open lateinit var changeTransformTranslate: () -> Unit;
    open lateinit var changeTransformWithWidth: () -> Unit;
    open lateinit var changeTransformWithOrigin: () -> Unit;
    open lateinit var changeBorder: () -> Unit;
    open lateinit var changestylePosition: () -> Unit;
    open lateinit var handleTouchStart: (e: UniTouchEvent) -> Unit;
    open lateinit var handleTouchMove: (e: UniTouchEvent) -> Unit;
    open lateinit var handleTouchEnd: (_: UniTouchEvent) -> Unit;
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
                return utsMapOf("container" to padStyleMapOf(utsMapOf("marginTop" to 7, "marginRight" to 7, "marginBottom" to 7, "marginLeft" to 7, "backgroundColor" to "#FFFFFF")), "text" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginBottom" to 16)), "base-style" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "width-progress" to padStyleMapOf(utsMapOf("width" to 200, "height" to 200, "backgroundColor" to "#A52A2A")), "transform-bgColor" to padStyleMapOf(utsMapOf("transitionProperty" to "backgroundColor", "transitionDuration" to "0.5s")), "transition-width" to padStyleMapOf(utsMapOf("transitionProperty" to "width", "transitionDuration" to "1s")), "transition-margin" to padStyleMapOf(utsMapOf("transitionProperty" to "marginLeft,marginTop", "transitionDuration" to "1s")), "transition-padding" to padStyleMapOf(utsMapOf("transitionProperty" to "paddingLeft,paddingTop", "transitionDuration" to "1s")), "transition-background" to padStyleMapOf(utsMapOf("transitionProperty" to "backgroundColor,opacity", "transitionDuration" to "1s")), "transition-opacity" to padStyleMapOf(utsMapOf("transitionProperty" to "opacity", "transitionDuration" to "1s")), "transition-transform" to padStyleMapOf(utsMapOf("transitionProperty" to "transform", "transitionDuration" to "1s")), "transition-border" to padStyleMapOf(utsMapOf("borderWidth" to 5, "borderColor" to "#A52A2A", "borderStyle" to "solid", "transitionProperty" to "borderColor", "transitionDuration" to "1s")), "transition-position" to padStyleMapOf(utsMapOf("left" to 0, "transitionProperty" to "left", "transitionDuration" to "1s")), "transition-transform-width" to padStyleMapOf(utsMapOf("transitionProperty" to "transform,width", "transitionDuration" to "1s")), "@TRANSITION" to utsMapOf("transform-bgColor" to utsMapOf("property" to "backgroundColor", "duration" to "0.5s"), "transition-width" to utsMapOf("property" to "width", "duration" to "1s"), "transition-margin" to utsMapOf("property" to "marginLeft,marginTop", "duration" to "1s"), "transition-padding" to utsMapOf("property" to "paddingLeft,paddingTop", "duration" to "1s"), "transition-background" to utsMapOf("property" to "backgroundColor,opacity", "duration" to "1s"), "transition-opacity" to utsMapOf("property" to "opacity", "duration" to "1s"), "transition-transform" to utsMapOf("property" to "transform", "duration" to "1s"), "transition-border" to utsMapOf("property" to "borderColor", "duration" to "1s"), "transition-position" to utsMapOf("property" to "left", "duration" to "1s"), "transition-transform-width" to utsMapOf("property" to "transform,width", "duration" to "1s")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
