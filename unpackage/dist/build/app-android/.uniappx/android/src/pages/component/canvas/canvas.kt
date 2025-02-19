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
import io.dcloud.uniapp.extapi.createCanvasContextAsync as uni_createCanvasContextAsync;
open class GenPagesComponentCanvasCanvas : BasePage {
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
        onLoad(fun(_: OnLoadOptions) {
            uni_createCanvasContextAsync(CreateCanvasContextAsyncOptions(id = "canvas", component = this, success = fun(context: CanvasContext){
                this.canvasContext = context;
                this.renderingContext = context.getContext("2d")!!;
                this.canvas = this.renderingContext!!.canvas;
                hidpi(this.canvas!!);
                this.canvasWidth = this.canvas!!.width;
                this.canvasHeight = this.canvas!!.height;
                this.testCanvasContext = true;
            }
            ));
        }
        , __ins);
        onReady(fun() {
            this.testToDataURLResult = this.canvasContext!!.toDataURL().startsWith("data:image/png;base64");
        }
        , __ins);
        onUnload(fun() {
            if (this.taskId > 0) {
                this.stopAnimationFrame();
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_navigator = resolveComponent("navigator");
        return createElementVNode("view", utsMapOf("class" to "page", "id" to "page-canvas"), utsArrayOf(
            createElementVNode("canvas", utsMapOf("id" to "canvas", "class" to "canvas-element")),
            createElementVNode("scroll-view", utsMapOf("class" to "scroll-view"), utsArrayOf(
                createElementVNode("button", utsMapOf("class" to "canvas-drawing-button", "id" to "toDataURL", "onClick" to _ctx.canvasToDataURL), "canvasToDataURL", 8, utsArrayOf(
                    "onClick"
                )),
                if (_ctx.dataBase64.length > 0) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "text-group"), utsArrayOf(
                        createElementVNode("text", null, "canvasToDataURL:"),
                        createElementVNode("text", null, toDisplayString(_ctx.dataBase64.slice(0, 22)) + "...", 1)
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
                ,
                createElementVNode("button", utsMapOf("onClick" to _ctx.onCreateImage), "createImage", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("onClick" to _ctx.onCreatePath2D), "createPath2D", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("onClick" to _ctx.startAnimationFrame), "requestAnimationFrame", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("onClick" to _ctx.stopAnimationFrame), "cancelAnimationFrame", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "8px 10px"))), "CanvasContext API 演示", 4),
                createVNode(_component_navigator, utsMapOf("url" to "./canvas-context"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("button", null, "CanvasContext API")
                    );
                }
                ), "_" to 1)),
                createElementVNode("view", utsMapOf("class" to "text-group"), utsArrayOf(
                    createElementVNode("text", null, "获取 CanvasContext 结果："),
                    createElementVNode("text", utsMapOf("id" to "testCanvasContext"), toDisplayString(_ctx.testCanvasContext), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "text-group"), utsArrayOf(
                    createElementVNode("text", null, "测试 ToDataURL 结果："),
                    createElementVNode("text", utsMapOf("id" to "testToDataURLResult"), toDisplayString(_ctx.testToDataURLResult), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "text-group"), utsArrayOf(
                    createElementVNode("text", null, "测试 createImage 结果："),
                    createElementVNode("text", utsMapOf("id" to "testCreateImage"), toDisplayString(_ctx.testCreateImage), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "text-group"), utsArrayOf(
                    createElementVNode("text", null, "测试 createPath2D 结果："),
                    createElementVNode("text", utsMapOf("id" to "testCreatePath2D"), toDisplayString(_ctx.testCreatePath2D), 1)
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var canvas: UniCanvasElement? by `$data`;
    open var canvasContext: CanvasContext? by `$data`;
    open var renderingContext: CanvasRenderingContext2D? by `$data`;
    open var canvasWidth: Number by `$data`;
    open var canvasHeight: Number by `$data`;
    open var dataBase64: String by `$data`;
    open var taskId: Number by `$data`;
    open var lastTime: Number by `$data`;
    open var frameCount: Number by `$data`;
    open var testCanvasContext: Boolean by `$data`;
    open var testToBlobResult: Boolean by `$data`;
    open var testToDataURLResult: Boolean by `$data`;
    open var testCreateCanvasContextAsyncSuccess: Boolean by `$data`;
    open var testCreateImage: Boolean by `$data`;
    open var testCreatePath2D: Boolean by `$data`;
    open var testFrameCount: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "Context2D", "canvas" to null as UniCanvasElement?, "canvasContext" to null as CanvasContext?, "renderingContext" to null as CanvasRenderingContext2D?, "canvasWidth" to 0, "canvasHeight" to 0, "dataBase64" to "", "taskId" to 0, "lastTime" to 0, "frameCount" to 0, "testCanvasContext" to false, "testToBlobResult" to false, "testToDataURLResult" to false, "testCreateCanvasContextAsyncSuccess" to false, "testCreateImage" to false, "testCreatePath2D" to false, "testFrameCount" to 0);
    }
    override fun `$initMethods`() {
        this.canvasToDataURL = fun() {
            this.dataBase64 = this.canvasContext!!.toDataURL();
        }
        ;
        this.onCreateImage = fun() {
            this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
            var image = this.canvasContext!!.createImage();
            image.src = "/static/logo.png";
            image.onload = fun(){
                this.testCreateImage = true;
                this.renderingContext?.drawImage(image, 0, 0, 100, 100);
            }
            ;
        }
        ;
        this.onCreatePath2D = fun() {
            this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
            val context = this.renderingContext!!;
            var path2D = this.canvasContext!!.createPath2D();
            this.testCreatePath2D = true;
            val amplitude: Number = 64;
            val wavelength: Number = 64;
            run {
                var i: Number = 0;
                while(i < 5){
                    val x1 = 0 + (i * wavelength);
                    val y1: Number = 128;
                    val x2 = x1 + wavelength / 4;
                    val y2 = y1 - amplitude;
                    val x3 = x1 + 3 * wavelength / 4;
                    val y3 = y1 + amplitude;
                    val x4 = x1 + wavelength;
                    val y4 = y1;
                    context.moveTo(x1, y1);
                    path2D.bezierCurveTo(x2, y2, x3, y3, x4, y4);
                    i++;
                }
            }
            context.stroke(path2D);
        }
        ;
        this.startAnimationFrame = fun() {
            this.taskId = this.canvasContext!!.requestAnimationFrame(fun(timestamp: Number){
                this.testFrameCount++;
                this.updateFPS(timestamp);
                this.startAnimationFrame();
            }
            );
        }
        ;
        this.stopAnimationFrame = fun() {
            this.canvasContext!!.cancelAnimationFrame(this.taskId);
            this.taskId = 0;
        }
        ;
        this.updateFPS = fun(timestamp: Number) {
            this.frameCount++;
            if (timestamp - this.lastTime >= 1000) {
                val timeOfFrame = ((1000 as Number) / this.frameCount);
                this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
                this.renderingContext!!.fillText("" + this.frameCount + " / " + timeOfFrame.toFixed(3) + "ms", 10, 18);
                this.frameCount = 0;
                this.lastTime = timestamp;
            }
        }
        ;
    }
    open lateinit var canvasToDataURL: () -> Unit;
    open lateinit var onCreateImage: () -> Unit;
    open lateinit var onCreatePath2D: () -> Unit;
    open lateinit var startAnimationFrame: () -> Unit;
    open lateinit var stopAnimationFrame: () -> Unit;
    open lateinit var updateFPS: (timestamp: Number) -> Unit;
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("flex" to 1, "height" to "100%", "overflow" to "hidden")), "scroll-view" to padStyleMapOf(utsMapOf("flex" to 1)), "canvas-element" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 250, "backgroundColor" to "#ffffff")), "btn-to-image" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10)), "text-group" to padStyleMapOf(utsMapOf("display" to "flex", "flexFlow" to "row nowrap", "justifyContent" to "space-between", "alignItems" to "center", "paddingTop" to 8, "paddingRight" to 10, "paddingBottom" to 8, "paddingLeft" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
