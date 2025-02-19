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
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace;
open class GenPagesComponentCanvasCanvasContext : BasePage {
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
            uni_createCanvasContextAsync(CreateCanvasContextAsyncOptions(id = "canvas", component = this, success = fun(context: CanvasContext){
                this.canvasContext = context;
                this.renderingContext = context.getContext("2d")!!;
                this.canvas = this.renderingContext!!.canvas;
                hidpi1(this.canvas!!);
                this.canvasWidth = this.canvas!!.width;
                this.canvasHeight = this.canvas!!.height;
            }
            ));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "page", "id" to "page-canvas"), utsArrayOf(
            createElementVNode("canvas", utsMapOf("id" to "canvas", "class" to "canvas-element")),
            createElementVNode("scroll-view", utsMapOf("class" to "scroll-view", "scroll-y" to "true"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "grid-view"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.names, fun(name, index, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to "grid-item", "key" to index), utsArrayOf(
                            createElementVNode("button", utsMapOf("class" to "canvas-drawing-button", "onClick" to fun(){
                                _ctx.handleCanvasButton(name);
                            }
                            ), toDisplayString(name), 9, utsArrayOf(
                                "onClick"
                            ))
                        ));
                    }
                    ), 128)
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
    open var fontLoaded: Boolean by `$data`;
    open var names: UTSArray<String> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        val API_PATH = utsArrayOf(
            "arc",
            "arcTo",
            "bezierCurveTo",
            "quadraticCurve",
            "moveTo",
            "lineTo",
            "rect",
            "clip",
            "createPattern",
            "getSetImageData"
        );
        val API_DRAW = utsArrayOf(
            "stroke",
            "strokeRect",
            "strokeText",
            "fill",
            "fillRect",
            "fillText",
            "drawImage",
            "drawImageLocal",
            "clearRect"
        );
        val API_STATE = utsArrayOf(
            "beginPath",
            "closePath",
            "reset",
            "transform",
            "rotate",
            "resetTransform",
            "save",
            "restore",
            "scale",
            "translate",
            "fontTTF"
        );
        val API_PROPERTIES = utsArrayOf(
            "lineCap",
            "lineJoin",
            "lineWidth",
            "miterLimit",
            "fillStyle",
            "strokeStyle",
            "globalAlpha",
            "font",
            "setLineDash",
            "createLinearGradient",
            "createRadialGradient",
            "textAlign"
        );
        return utsMapOf("title" to "createCanvasContextAsync", "canvas" to null as UniCanvasElement?, "canvasContext" to null as CanvasContext?, "renderingContext" to null as CanvasRenderingContext2D?, "canvasWidth" to 0, "canvasHeight" to 0, "fontLoaded" to false, "names" to API_PATH.concat(API_DRAW, API_STATE, API_PROPERTIES, utsArrayOf(
            "measureText",
            "path2D"
        )).sort() as UTSArray<String>);
    }
    override fun `$initMethods`() {
        this.handleCanvasButton = fun(name: String) {
            this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
            this.renderingContext!!.save();
            when (name) {
                "arc" -> 
                    this.arc();
                "arcTo" -> 
                    this.arcTo();
                "beginPath" -> 
                    this.beginPath();
                "bezierCurveTo" -> 
                    this.bezierCurveTo();
                "clearRect" -> 
                    this.clearRect();
                "clip" -> 
                    this.clip();
                "closePath" -> 
                    this.closePath();
                "getSetImageData" -> 
                    this.getSetImageData();
                "createPattern" -> 
                    this.pattern();
                "createLinearGradient" -> 
                    this.createLinearGradient();
                "createRadialGradient" -> 
                    this.createRadialGradient();
                "fill" -> 
                    this.fill();
                "fillRect" -> 
                    this.fillRect();
                "fillText" -> 
                    this.fillText();
                "lineTo" -> 
                    this.lineTo();
                "moveTo" -> 
                    this.moveTo();
                "quadraticCurve" -> 
                    this.quadraticCurveTo();
                "rect" -> 
                    this.rect();
                "reset" -> 
                    this.reset();
                "resetTransform" -> 
                    this.resetTransform();
                "restore" -> 
                    this.restore();
                "rotate" -> 
                    this.rotate();
                "save" -> 
                    this.save();
                "scale" -> 
                    this.scale();
                "stroke" -> 
                    this.stroke();
                "strokeRect" -> 
                    this.strokeRect();
                "strokeText" -> 
                    this.strokeText();
                "transform" -> 
                    this.transform();
                "translate" -> 
                    this.translate();
                "drawImageLocal" -> 
                    this.drawImageLocal();
                "drawImage" -> 
                    this.drawImage();
                "measureText" -> 
                    this.measureText();
                "fillStyle" -> 
                    this.setFillStyle();
                "strokeStyle" -> 
                    this.setStrokeStyle();
                "globalAlpha" -> 
                    this.setGlobalAlpha();
                "font" -> 
                    this.setFontSize();
                "lineCap" -> 
                    this.setLineCap();
                "lineJoin" -> 
                    this.setLineJoin();
                "setLineDash" -> 
                    this.lineDash();
                "lineWidth" -> 
                    this.setLineWidth();
                "miterLimit" -> 
                    this.setMiterLimit();
                "textAlign" -> 
                    this.textAlign();
                "path2D" -> 
                    this.path2DMethods();
                "fontTTF" -> 
                    this.fontTTF();
                else -> 
                    {}
            }
            this.renderingContext!!.restore();
        }
        ;
        this.clearCanvasRect = fun() {
            this.renderingContext!!.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
        }
        ;
        this.arc = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.lineWidth = 2;
            context.arc(75, 75, 50, 0, Math.PI * 2, true);
            context.moveTo(110, 75);
            context.arc(75, 75, 35, 0, Math.PI, false);
            context.moveTo(65, 65);
            context.arc(60, 65, 5, 0, Math.PI * 2, true);
            context.moveTo(95, 65);
            context.arc(90, 65, 5, 0, Math.PI * 2, true);
            context.stroke();
        }
        ;
        this.arcTo = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(150, 20);
            context.arcTo(150, 100, 50, 20, 30);
            context.stroke();
            context.fillStyle = "blue";
            context.fillRect(150, 20, 10, 10);
            context.fillStyle = "red";
            context.fillRect(150, 100, 10, 10);
            context.fillRect(50, 20, 10, 10);
            context.setLineDash(utsArrayOf(
                5,
                5
            ));
            context.moveTo(150, 20);
            context.lineTo(150, 100);
            context.lineTo(50, 20);
            context.stroke();
            context.beginPath();
            context.arc(120, 38, 30, 0, 2 * Math.PI, true);
            context.stroke();
        }
        ;
        this.beginPath = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.strokeStyle = "blue";
            context.moveTo(20, 20);
            context.lineTo(200, 20);
            context.stroke();
            context.beginPath();
            context.strokeStyle = "green";
            context.moveTo(20, 20);
            context.lineTo(120, 120);
            context.stroke();
        }
        ;
        this.textAlign = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(150, 0);
            context.lineTo(150, 150);
            context.stroke();
            context.font = "30px serif";
            context.textAlign = "left";
            context.fillText("left-aligned", 150, 40);
            context.textAlign = "center";
            context.fillText("center-aligned", 150, 85);
            context.textAlign = "right";
            context.fillText("right-aligned", 150, 130);
        }
        ;
        this.getSetImageData = fun() {
            val context = this.renderingContext!!;
            context.moveTo(0, 70);
            context.lineTo(80, 0);
            context.lineTo(210, 110);
            context.lineTo(30, 110);
            context.lineTo(160, 0);
            context.lineTo(240, 70);
            context.closePath();
            context.fillStyle = "green";
            context.fill();
            var imageData = context.getImageData(0, 0, context.canvas.width / 2, context.canvas.height / 2);
            context.putImageData(imageData, context.canvas.width / 2, context.canvas.height / 2);
        }
        ;
        this.bezierCurveTo = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(50, 20);
            context.bezierCurveTo(230, 30, 150, 60, 50, 100);
            context.stroke();
            context.fillStyle = "blue";
            context.fillRect(50, 20, 10, 10);
            context.fillRect(50, 100, 10, 10);
            context.fillStyle = "red";
            context.fillRect(230, 30, 10, 10);
            context.fillRect(150, 70, 10, 10);
        }
        ;
        this.clearRect = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.fillStyle = "#ff6";
            context.fillRect(0, 0, 300, 150);
            context.beginPath();
            context.fillStyle = "blue";
            context.moveTo(20, 20);
            context.lineTo(180, 20);
            context.lineTo(130, 130);
            context.closePath();
            context.fill();
            context.clearRect(10, 10, 120, 100);
        }
        ;
        this.clip = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.arc(100, 75, 50, 0, Math.PI * 2, true);
            context.clip();
            context.fillStyle = "blue";
            context.fillRect(0, 0, 300, 150);
            context.fillStyle = "orange";
            context.fillRect(0, 0, 100, 100);
        }
        ;
        this.closePath = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.lineWidth = 10;
            context.moveTo(20, 20);
            context.lineTo(20, 100);
            context.lineTo(70, 100);
            context.closePath();
            context.stroke();
        }
        ;
        this.pattern = fun() {
            val context = this.renderingContext!!;
            val image = this.canvasContext!!.createImage();
            image.src = "/static/api.png";
            image.onload = fun(){
                context.save();
                this.clearCanvasRect();
                val pattern = context.createPattern(image, "repeat");
                context.fillStyle = pattern;
                context.fillRect(0, 0, 400, 400);
                context.restore();
            }
            ;
        }
        ;
        this.createLinearGradient = fun() {
            val context = this.renderingContext!!;
            val gradient = context.createLinearGradient(20, 0, 220, 0);
            gradient.addColorStop(0, "green");
            gradient.addColorStop(0.5, "cyan");
            gradient.addColorStop(1, "green");
            context.fillStyle = gradient;
            context.fillRect(20, 20, 200, 100);
        }
        ;
        this.createRadialGradient = fun() {
            val context = this.renderingContext!!;
            val gradient = context.createRadialGradient(110, 90, 30, 100, 100, 70);
            gradient.addColorStop(0, "pink");
            gradient.addColorStop(0.9, "white");
            gradient.addColorStop(1, "green");
            context.fillStyle = gradient;
            context.fillRect(20, 20, 160, 160);
        }
        ;
        this.fill = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.rect(20, 20, 150, 100);
            context.strokeStyle = "#00ff00";
            context.fill();
        }
        ;
        this.fillRect = fun() {
            val context = this.renderingContext!!;
            context.fillStyle = "green";
            context.fillRect(20, 10, 150, 100);
        }
        ;
        this.fillText = fun() {
            val context = this.renderingContext!!;
            context.strokeStyle = "#ff0000";
            context.beginPath();
            context.moveTo(0, 10);
            context.lineTo(300, 10);
            context.stroke();
            context.fillText("Hello World", 0, 30, 300);
            context.fillText("Hello World", 100, 30, 300);
            context.beginPath();
            context.moveTo(0, 30);
            context.lineTo(300, 30);
            context.stroke();
        }
        ;
        this.moveTo = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(0, 0);
            context.lineTo(300, 150);
            context.stroke();
        }
        ;
        this.lineTo = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(20, 20);
            context.lineTo(20, 100);
            context.lineTo(70, 100);
            context.stroke();
        }
        ;
        this.stroke = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(20, 20);
            context.lineTo(20, 100);
            context.lineTo(70, 100);
            context.strokeStyle = "#00ff00";
            context.stroke();
        }
        ;
        this.strokeRect = fun() {
            val context = this.renderingContext!!;
            context.strokeStyle = "green";
            context.strokeRect(20, 10, 160, 100);
        }
        ;
        this.strokeText = fun() {
            val context = this.renderingContext!!;
            context.font = "10px serif";
            context.strokeText("Hello world", 50, 90);
            context.font = "30px serif";
            context.strokeStyle = "blue";
            context.strokeText("Hello world", 50, 100);
        }
        ;
        this.rotate = fun() {
            val context = this.renderingContext!!;
            context.arc(0, 0, 5, 0, 2 * Math.PI, true);
            context.fillStyle = "blue";
            context.fill();
            context.fillStyle = "gray";
            context.fillRect(100, 0, 80, 20);
            context.rotate((45 * Math.PI) / 180);
            context.fillStyle = "red";
            context.fillRect(100, 0, 80, 20);
            context.setTransform(1, 0, 0, 1, 0, 0);
        }
        ;
        this.scale = fun() {
            val context = this.renderingContext!!;
            context.scale(9, 3);
            context.fillStyle = "red";
            context.fillRect(10, 10, 8, 20);
            context.setTransform(1, 0, 0, 1, 0, 0);
            context.fillStyle = "gray";
            context.fillRect(10, 10, 8, 20);
        }
        ;
        this.reset = fun() {
            val context = this.renderingContext!!;
            context.lineWidth = 10;
            context.strokeStyle = "#00ff00";
            context.strokeRect(50, 50, 150, 100);
            context.font = "50px serif";
            context.fillText("Rect!", 70, 110);
            context.lineWidth = 5;
            context.beginPath();
            context.arc(300, 100, 50, 0, 2 * Math.PI);
            context.stroke();
            context.font = "25px sans-serif";
            context.fillText("Circle!", 265, 100);
            hidpi1(this.canvas!!);
        }
        ;
        this.translate = fun() {
            val context = this.renderingContext!!;
            context.translate(110, 30);
            context.fillStyle = "red";
            context.fillRect(0, 0, 80, 80);
            context.setTransform(1, 0, 0, 1, 0, 0);
            context.fillStyle = "gray";
            context.fillRect(0, 0, 80, 80);
        }
        ;
        this.save = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.strokeStyle = "#00ff00";
            context.scale(2, 2);
            context.strokeStyle = "#ff0000";
            context.rect(0, 0, 100, 100);
            context.stroke();
            context.restore();
            context.save();
            context.rect(0, 0, 50, 50);
            context.stroke();
        }
        ;
        this.restore = fun() {
            val context = this.renderingContext!!;
            utsArrayOf(
                3,
                2,
                1
            ).forEach(fun(item){
                context.save();
                context.beginPath();
                context.scale(item, item);
                context.rect(10, 10, 100, 100);
                context.stroke();
                context.restore();
            }
            );
        }
        ;
        this.drawImageLocal = fun() {
            val context = this.renderingContext!!;
            val image = this.canvasContext!!.createImage();
            image.src = "/static/uni.png";
            image.onload = fun(){
                context.drawImage(image, 0, 0, 100, 100);
            }
            ;
        }
        ;
        this.drawImage = fun() {
            val context = this.renderingContext!!;
            val image = this.canvasContext!!.createImage();
            image.src = "https://web-ext-storage.dcloud.net.cn/uni-app-x/hello-uniappx-qrcode.png";
            image.onload = fun(){
                context.drawImage(image, 0, 0, 100, 100);
            }
            ;
        }
        ;
        this.rect = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.rect(20, 20, 150, 100);
            context.stroke();
        }
        ;
        this.quadraticCurveTo = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            context.moveTo(50, 20);
            context.quadraticCurveTo(230, 30, 50, 100);
            context.stroke();
            context.fillStyle = "blue";
            context.beginPath();
            context.arc(50, 20, 5, 0, 2 * Math.PI, true);
            context.arc(50, 100, 5, 0, 2 * Math.PI, true);
            context.fill();
            context.fillStyle = "red";
            context.beginPath();
            context.arc(230, 30, 5, 0, 2 * Math.PI, true);
            context.fill();
        }
        ;
        this.resetTransform = fun() {
            val context = this.renderingContext!!;
            context.rotate((45 * Math.PI) / 180);
            context.fillRect(60, 0, 100, 30);
            context.resetTransform();
            context.fillStyle = "red";
            context.fillRect(60, 0, 100, 30);
        }
        ;
        this.transform = fun() {
            val context = this.renderingContext!!;
            context.transform(1, 0.2, 0.8, 1, 0, 0);
            context.fillRect(0, 0, 100, 100);
        }
        ;
        this.setFillStyle = fun() {
            val context = this.renderingContext!!;
            utsArrayOf(
                "#fef957",
                "rgb(242,159,63)",
                "rgb(242,117,63)",
                "#e87e51"
            ).forEach(fun(item: String, index: Number){
                context.fillStyle = item;
                context.beginPath();
                context.rect(0 + 75 * index, 0, 50, 50);
                context.fill();
            }
            );
        }
        ;
        this.setStrokeStyle = fun() {
            val context = this.renderingContext!!;
            utsArrayOf(
                "#fef957",
                "rgb(242,159,63)",
                "rgb(242,117,63)",
                "#e87e51"
            ).forEach(fun(item: String, index: Number){
                context.strokeStyle = item;
                context.beginPath();
                context.rect(0 + 75 * index, 0, 50, 50);
                context.stroke();
            }
            );
        }
        ;
        this.setGlobalAlpha = fun() {
            val context = this.renderingContext!!;
            context.fillStyle = "#000000";
            utsArrayOf(
                1,
                0.5,
                0.1
            ).forEach(fun(item: Number, index: Number){
                context.globalAlpha = item;
                context.beginPath();
                context.rect(0 + 75 * index, 0, 50, 50);
                context.fill();
            }
            );
            context.globalAlpha = 1;
        }
        ;
        this.setFontSize = fun() {
            val context = this.renderingContext!!;
            utsArrayOf(
                10,
                20,
                30,
                40
            ).forEach(fun(item: Number, index: Number){
                context.font = item + "px serif";
                context.fillText("Hello, world", 20, 20 + 40 * index);
            }
            );
        }
        ;
        this.setLineCap = fun() {
            val context = this.renderingContext!!;
            context.lineWidth = 10;
            utsArrayOf(
                "butt",
                "round",
                "square"
            ).forEach(fun(item: String, index: Number){
                context.beginPath();
                context.lineCap = item as String;
                context.moveTo(20, 20 + 20 * index);
                context.lineTo(100, 20 + 20 * index);
                context.stroke();
            }
            );
        }
        ;
        this.setLineJoin = fun() {
            val context = this.renderingContext!!;
            context.lineWidth = 10;
            utsArrayOf(
                "bevel",
                "round",
                "miter"
            ).forEach(fun(item: String, index: Number){
                context.beginPath();
                context.lineJoin = item as String;
                context.moveTo(20 + 80 * index, 20);
                context.lineTo(100 + 80 * index, 50);
                context.lineTo(20 + 80 * index, 100);
                context.stroke();
            }
            );
        }
        ;
        this.setLineWidth = fun() {
            val context = this.renderingContext!!;
            utsArrayOf(
                2,
                4,
                6,
                8,
                10
            ).forEach(fun(item: Number, index: Number){
                context.beginPath();
                context.lineWidth = item;
                context.moveTo(20, 20 + 20 * index);
                context.lineTo(100, 20 + 20 * index);
                context.stroke();
            }
            );
        }
        ;
        this.lineDash = fun() {
            val context = this.renderingContext!!;
            context.setLineDash(utsArrayOf(
                4,
                16
            ));
            context.beginPath();
            context.moveTo(0, 50);
            context.lineTo(300, 50);
            context.stroke();
            context.beginPath();
            context.strokeStyle = "red";
            context.lineDashOffset = 4;
            context.moveTo(0, 100);
            context.lineTo(300, 100);
            context.stroke();
        }
        ;
        this.setMiterLimit = fun() {
            val context = this.renderingContext!!;
            context.lineWidth = 4;
            utsArrayOf(
                2,
                4,
                6,
                8,
                10
            ).forEach(fun(item: Number, index: Number){
                context.beginPath();
                context.miterLimit = item;
                context.moveTo(20 + 80 * index, 20);
                context.lineTo(100 + 80 * index, 50);
                context.lineTo(20 + 80 * index, 100);
                context.stroke();
            }
            );
        }
        ;
        this.measureText = fun() {
            val context = this.renderingContext!!;
            val text = "uni-app x，是下一代 uni-app，是一个跨平台应用开发引擎";
            context.font = "20px 宋体";
            context.fillStyle = "red";
            context.fillText(text, 0, 60);
            val textMetrics = context.measureText(text);
            context.strokeText(text, 40, 100);
            context.fillText("measure text width:" + textMetrics.width, 40, 80);
        }
        ;
        this.path2DMethods = fun() {
            val context = this.renderingContext!!;
            context.beginPath();
            val path2D = this.canvasContext!!.createPath2D();
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
            val path2DRect = this.canvasContext!!.createPath2D();
            path2DRect.rect(10, 10, 100, 20);
            context.fill(path2DRect);
        }
        ;
        this.fontTTF = fun() {
            val context = this.renderingContext!!;
            val fontMap = Map<String, UTSJSONObject>(utsArrayOf(
                utsArrayOf(
                    "AlimamaDaoLiTiOTF",
                    object : UTSJSONObject() {
                        var path = "/static/font/AlimamaDaoLiTi.otf"
                        var text = "阿里妈妈刀隶体字体otf加载成功"
                    }
                ),
                utsArrayOf(
                    "AlimamaDaoLiTiWOFF",
                    object : UTSJSONObject() {
                        var path = "/static/font/AlimamaDaoLiTi.woff"
                        var text = "阿里妈妈刀隶体字体Woff加载成功"
                    }
                ),
                utsArrayOf(
                    "iconfont-star",
                    object : UTSJSONObject() {
                        var path = "/static/fonts/icon-star.ttf"
                        var text = "\ue879"
                    }
                )
            ));
            var yOffset: Number = 0;
            var drawFont = fun(key: String, value: UTSJSONObject){
                console.log("" + key + "\u5B57\u4F53\u52A0\u8F7D\u6210\u529F");
                context.save();
                val text = value["text"] as String;
                context.font = "20px " + key;
                context.fillStyle = "red";
                yOffset += 25;
                context.fillText(text, 0, yOffset);
                yOffset += 25;
                context.strokeText(text, 0, yOffset);
                context.restore();
            }
            ;
            fontMap.forEach(fun(value: UTSJSONObject, key: String){
                console.log("key:" + key + " value:" + value["path"]);
                if (this.fontLoaded) {
                    drawFont(key, value);
                } else {
                    uni_loadFontFace(LoadFontFaceOptions(family = key, source = "url('" + value["path"] + "')", success = fun(_){
                        drawFont(key, value);
                    }
                    ));
                }
            }
            );
            this.fontLoaded = true;
        }
        ;
    }
    open lateinit var handleCanvasButton: (name: String) -> Unit;
    open lateinit var clearCanvasRect: () -> Unit;
    open lateinit var arc: () -> Unit;
    open lateinit var arcTo: () -> Unit;
    open lateinit var beginPath: () -> Unit;
    open lateinit var textAlign: () -> Unit;
    open lateinit var getSetImageData: () -> Unit;
    open lateinit var bezierCurveTo: () -> Unit;
    open lateinit var clearRect: () -> Unit;
    open lateinit var clip: () -> Unit;
    open lateinit var closePath: () -> Unit;
    open lateinit var pattern: () -> Unit;
    open lateinit var createLinearGradient: () -> Unit;
    open lateinit var createRadialGradient: () -> Unit;
    open lateinit var fill: () -> Unit;
    open lateinit var fillRect: () -> Unit;
    open lateinit var fillText: () -> Unit;
    open lateinit var moveTo: () -> Unit;
    open lateinit var lineTo: () -> Unit;
    open lateinit var stroke: () -> Unit;
    open lateinit var strokeRect: () -> Unit;
    open lateinit var strokeText: () -> Unit;
    open lateinit var rotate: () -> Unit;
    open lateinit var scale: () -> Unit;
    open lateinit var reset: () -> Unit;
    open lateinit var translate: () -> Unit;
    open lateinit var save: () -> Unit;
    open lateinit var restore: () -> Unit;
    open lateinit var drawImageLocal: () -> Unit;
    open lateinit var drawImage: () -> Unit;
    open lateinit var rect: () -> Unit;
    open lateinit var quadraticCurveTo: () -> Unit;
    open lateinit var resetTransform: () -> Unit;
    open lateinit var transform: () -> Unit;
    open lateinit var setFillStyle: () -> Unit;
    open lateinit var setStrokeStyle: () -> Unit;
    open lateinit var setGlobalAlpha: () -> Unit;
    open lateinit var setFontSize: () -> Unit;
    open lateinit var setLineCap: () -> Unit;
    open lateinit var setLineJoin: () -> Unit;
    open lateinit var setLineWidth: () -> Unit;
    open lateinit var lineDash: () -> Unit;
    open lateinit var setMiterLimit: () -> Unit;
    open lateinit var measureText: () -> Unit;
    open lateinit var path2DMethods: () -> Unit;
    open lateinit var fontTTF: () -> Unit;
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("flex" to 1)), "scroll-view" to padStyleMapOf(utsMapOf("flex" to 1)), "canvas-element" to padStyleMapOf(utsMapOf("width" to "100%", "height" to 250, "backgroundColor" to "#ffffff")), "grid-view" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "flexDirection" to "row", "flexWrap" to "wrap")), "grid-item" to padStyleMapOf(utsMapOf("width" to "50%", "paddingTop" to 5, "paddingRight" to 5, "paddingBottom" to 5, "paddingLeft" to 5)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
