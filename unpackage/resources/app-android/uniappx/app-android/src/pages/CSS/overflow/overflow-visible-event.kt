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
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesCSSOverflowOverflowVisibleEvent : BasePage {
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
            this.moveEl = uni_getElementById("parent");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("scroll-view", utsMapOf("id" to "scroll-view", "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "15px"))), "overflow=visible 父view（绿色），子view（红色），点击超出父view区域的部分也可触发事件。", 4),
                createElementVNode("view", utsMapOf("class" to "backgroundview"), utsArrayOf(
                    createElementVNode("view", utsMapOf("id" to "parent", "class" to "box-visible-border-radius"), utsArrayOf(
                        createElementVNode("view", utsMapOf("id" to "child", "style" to normalizeStyle(utsMapOf("width" to "50px", "height" to "150px", "background-color" to "red")), "onClick" to _ctx.handleClickOverflowPart, "onTouchmove" to _ctx.handleTouchMoveOverflowPart, "onTouchstart" to _ctx.handleTouchStartOverflowPart, "onTouchend" to _ctx.handleTouchEndOverflowPart), null, 44, utsArrayOf(
                            "onClick",
                            "onTouchmove",
                            "onTouchstart",
                            "onTouchend"
                        ))
                    ))
                )),
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "15px"))), "overflow=visible组件的子view （绿色）被position: absolute的view（红色）遮挡时，点击事件测试。", 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "300px", "height" to "300px", "background-color" to "white"))), utsArrayOf(
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("overflow" to "visible", "height" to "100px", "width" to "100%"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "green", "height" to "100px", "width" to "100%")), "onClick" to fun(){
                            _ctx.handleClick("green");
                        }
                        ), null, 12, utsArrayOf(
                            "onClick"
                        ))
                    ), 4),
                    createElementVNode("view", utsMapOf("id" to "absolute-view", "style" to normalizeStyle(utsMapOf("position" to "absolute", "background-color" to "red", "width" to "100px", "height" to "200px", "right" to "0px")), "onClick" to fun(){
                        _ctx.handleClick("red");
                    }
                    ), null, 12, utsArrayOf(
                        "onClick"
                    ))
                ), 4),
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "15px"))), "overflow=visible组件设置hover-class的测试", 4),
                createElementVNode("view", utsMapOf("class" to "backgroundview"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "box-visible-border-radius", "hover-class" to "hover-class"), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "red", "height" to "100px", "width" to "100px", "margin-left" to "20px", "margin-top" to "20px"))), null, 4)
                    ))
                )),
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "15px"))), "overflow=visible组件多层级设置测试", 4),
                createElementVNode("view", utsMapOf("class" to "backgroundview"), utsArrayOf(
                    createElementVNode("view", utsMapOf("id" to "deep-overflow", "style" to normalizeStyle(utsMapOf("overflow" to "visible"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("overflow" to "visible", "background-color" to "red", "width" to "100px", "height" to "100px")), "onClick" to fun(){
                            _ctx.handleClick("red");
                        }
                        ), null, 12, utsArrayOf(
                            "onClick"
                        ))
                    ), 4),
                    createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("overflow" to "visible"))), utsArrayOf(
                        createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("overflow" to "visible", "background-color" to "green", "width" to "100px", "height" to "100px"))), null, 4)
                    ), 4)
                ))
            ))
        ), 4);
    }
    open var jest_result: Boolean by `$data`;
    open var jest_click_x: Number by `$data`;
    open var jest_click_y: Number by `$data`;
    open var jest_parent_top: Number by `$data`;
    open var startX: Number by `$data`;
    open var startY: Number by `$data`;
    open var moveX: Number by `$data`;
    open var moveY: Number by `$data`;
    open var oldX: Number by `$data`;
    open var oldY: Number by `$data`;
    open var moveEl: UniElement? by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("jest_result" to false, "jest_click_x" to -1, "jest_click_y" to -1, "jest_parent_top" to -1.0, "startX" to 0, "startY" to 0, "moveX" to 0, "moveY" to 0, "oldX" to 0, "oldY" to 0, "moveEl" to null as UniElement?);
    }
    override fun `$initMethods`() {
        this.handleClickOverflowPart = fun() {
            console.log("click");
            this.jest_result = true;
            uni_showToast(ShowToastOptions(title = "点击红色区域"));
        }
        ;
        this.handleTouchStartOverflowPart = fun(e: UniTouchEvent) {
            this.startX = e.changedTouches[0].clientX;
            this.startY = e.changedTouches[0].clientY;
        }
        ;
        this.handleTouchMoveOverflowPart = fun(e: UniTouchEvent) {
            console.log("touchmove:" + e.touches[0].clientX + "," + e.touches[0].clientY);
            e.preventDefault();
            e.stopPropagation();
            val difX = e.changedTouches[0].clientX;
            val difY = e.changedTouches[0].clientY;
            this.moveX = difX - this.startX + this.oldX;
            this.moveY = difY - this.startY + this.oldY;
            this.moveEl?.style?.setProperty("transform", "translate(" + this.moveX + "px," + this.moveY + "px)");
        }
        ;
        this.handleTouchEndOverflowPart = fun(_: UniTouchEvent) {
            this.oldX = this.moveX;
            this.oldY = this.moveY;
        }
        ;
        this.handleClick = fun(str: String) {
            console.log("\u70B9\u51FB\u4E86 " + str + " view");
            if (str == "red") {
                this.jest_result = true;
            }
        }
        ;
        this.jest_getRect = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val rect = await(uni_getElementById("child")!!.getBoundingClientRectAsync()!!);
                    var ratio: Number = 1;
                    if (uni_getSystemInfoSync().platform == "android") {
                        ratio = uni_getSystemInfoSync().devicePixelRatio;
                    }
                    this.jest_click_x = rect.x * ratio + 30;
                    this.jest_click_y = rect.bottom * ratio - 30;
            });
        }
        ;
        this.jest_getParentRect = fun() {
            val transform = uni_getElementById("parent")?.style?.getPropertyValue("transform");
            if (transform != null) {
                var value = transform as String;
                value = value.split(",")[1].slice(0, -3);
                var ratio: Number = 1;
                if (uni_getSystemInfoSync().platform == "android") {
                    ratio = uni_getSystemInfoSync().devicePixelRatio;
                }
                this.jest_parent_top = Math.round((parseFloat(value) * ratio));
            }
        }
        ;
        this.jest_getAbsoluteViewRect = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val rect = await(uni_getElementById("absolute-view")!!.getBoundingClientRectAsync()!!);
                    val systemInfo = uni_getSystemInfoSync();
                    val titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight;
                    var ratio: Number = 1;
                    if (uni_getSystemInfoSync().platform == "android") {
                        ratio = uni_getSystemInfoSync().devicePixelRatio;
                    }
                    this.jest_click_x = rect.x * ratio + 30;
                    this.jest_click_y = (rect.top + titleBarHeight) * ratio + 30;
            });
        }
        ;
        this.jest_scrollToDeepOverflow = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    val scrollView = uni_getElementById("scroll-view") as UniScrollViewElement;
                    val rect = await(uni_getElementById("deep-overflow")!!.getBoundingClientRectAsync()!!);
                    scrollView.scrollTo(0, rect.top);
                    setTimeout(fun(){
                        val systemInfo = uni_getSystemInfoSync();
                        var ratio: Number = 1;
                        if (uni_getSystemInfoSync().platform == "android") {
                            ratio = uni_getSystemInfoSync().devicePixelRatio;
                        }
                        val titleBarHeight = systemInfo.screenHeight - systemInfo.windowHeight;
                        uni_getElementById("deep-overflow")!!.getBoundingClientRectAsync()!!.then(fun(afterRect: DOMRect){
                            this.jest_click_x = afterRect.x * ratio + 30;
                            this.jest_click_y = (afterRect.top + titleBarHeight) * ratio + 30;
                        }
                        );
                    }
                    , 200);
            });
        }
        ;
    }
    open lateinit var handleClickOverflowPart: () -> Unit;
    open lateinit var handleTouchStartOverflowPart: (e: UniTouchEvent) -> Unit;
    open lateinit var handleTouchMoveOverflowPart: (e: UniTouchEvent) -> Unit;
    open lateinit var handleTouchEndOverflowPart: (_: UniTouchEvent) -> Unit;
    open lateinit var handleClick: (str: String) -> Unit;
    open lateinit var jest_getRect: () -> UTSPromise<Unit>;
    open lateinit var jest_getParentRect: () -> Unit;
    open lateinit var jest_getAbsoluteViewRect: () -> UTSPromise<Unit>;
    open lateinit var jest_scrollToDeepOverflow: () -> UTSPromise<Unit>;
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
                return utsMapOf("backgroundview" to padStyleMapOf(utsMapOf("width" to 300, "height" to 300, "marginBottom" to 20, "backgroundColor" to "#FFFFFF", "justifyContent" to "center", "alignItems" to "center")), "box-visible-border-radius" to padStyleMapOf(utsMapOf("width" to 100, "height" to 100, "borderRadius" to 20, "overflow" to "visible", "backgroundColor" to "#008000")), "hover-class" to padStyleMapOf(utsMapOf("backgroundColor" to "#00FFFF")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
