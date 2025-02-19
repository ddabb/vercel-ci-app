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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.setNavigationBarColor as uni_setNavigationBarColor;
open class GenPagesTemplateNavbarLiteNavbarLite : BasePage {
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
            this.calcInputRemainHeight();
        }
        , __ins);
        onResize(fun(_: OnResizeOptions) {
            this.calcInputRemainHeight();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_uni_navbar_lite = resolveEasyComponent("uni-navbar-lite", GenComponentsUniNavbarLiteUniNavbarLiteClass);
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        return createElementVNode("view", utsMapOf("class" to "content"), utsArrayOf(
            createVNode(_component_uni_navbar_lite, utsMapOf("status-bar" to true, "title" to _ctx.title, "is-left" to _ctx.isLeft, "text-color" to _ctx.navigationBarTextColor), null, 8, utsArrayOf(
                "title",
                "is-left",
                "text-color"
            )),
            createElementVNode("view", utsMapOf("class" to "content-item", "onClick" to _ctx.onClick), utsArrayOf(
                createElementVNode("text", null, "点击此处，将标题切换为" + toDisplayString(if (_ctx.isLeft) {
                    "居中";
                } else {
                    "左侧";
                }
                ) + "显示", 1)
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("view", utsMapOf("class" to "content-item", "onClick" to _ctx.setNavigationBarColor1), utsArrayOf(
                createElementVNode("text", null, "设置自定义导航栏前景色白色")
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("view", utsMapOf("class" to "content-item", "onClick" to _ctx.setNavigationBarColor2), utsArrayOf(
                createElementVNode("text", null, "设置自定义导航栏前景色黑色")
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("align-items" to "center", "height" to "60px"))), utsArrayOf(
                createElementVNode("text", null, "测试输入框上推页面"),
                createVNode(_component_radio_group, utsMapOf("onChange" to _ctx.ChangeView, "style" to normalizeStyle(utsMapOf("flex-direction" to "row"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createVNode(_component_radio, utsMapOf("value" to "0", "checked" to true), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("text", null, "scroll-view")
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_radio, utsMapOf("value" to "1"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("text", null, "list-view")
                            );
                        }
                        ), "_" to 1)),
                        createVNode(_component_radio, utsMapOf("value" to "2"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("text", null, "web-view")
                            );
                        }
                        ), "_" to 1))
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "onChange",
                    "style"
                ))
            ), 4),
            if (_ctx.indexView == 0) {
                createElementVNode("scroll-view", utsMapOf("key" to 0, "class" to "scroll-view", "scroll-y" to true, "refresher-enabled" to false), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(10, fun(item, __key, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to "content-item"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "cell-item"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "text"), "内容：" + toDisplayString(item), 1),
                                createElementVNode("input", utsMapOf("class" to "text", "style" to normalizeStyle(utsMapOf("margin-top" to "8px")), "placeholder" to "备注输入框:"), null, 4)
                            ))
                        ));
                    }), 64)
                ));
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            if (_ctx.indexView == 1) {
                createElementVNode("list-view", utsMapOf("key" to 1, "class" to "scroll-view"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(10, fun(item, __key, __index, _cached): Any {
                        return createElementVNode("list-item", utsMapOf("class" to "content-item"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "cell-item"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "text"), "列表项内容：" + toDisplayString(item), 1),
                                createElementVNode("input", utsMapOf("class" to "text", "style" to normalizeStyle(utsMapOf("margin-top" to "8px")), "placeholder" to "备注输入框:"), null, 4)
                            ))
                        ));
                    }), 64)
                ));
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            if (_ctx.indexView == 2) {
                createElementVNode("web-view", utsMapOf("key" to 2, "src" to "/hybrid/html/local.html", "id" to "webv", "class" to "scroll-view"));
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsArrayOf(
                utsMapOf("position" to "relative", "background-color" to "white", "z-index" to "1000"),
                utsMapOf("bottom" to _ctx.inputBottom)
            ))), utsArrayOf(
                createElementVNode("input", utsMapOf("id" to "input", "placeholder" to "滚动视图外的居底输入框,不上推,手动控制输入框top", "adjust-position" to "false", "onBlur" to _ctx.onInputBlur, "onKeyboardheightchange" to _ctx.onInputKeyboardChange), null, 40, utsArrayOf(
                    "onBlur",
                    "onKeyboardheightchange"
                ))
            ), 4)
        ));
    }
    open var title: String by `$data`;
    open var isLeft: Boolean by `$data`;
    open var navigationBarTextColor: String by `$data`;
    open var indexView: Number by `$data`;
    open var windowHeight: Number by `$data`;
    open var inputRemainHeight: Number by `$data`;
    open var inputBottom: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "Hello uni-app", "isLeft" to false, "navigationBarTextColor" to "#000", "indexView" to 0, "windowHeight" to 0, "inputRemainHeight" to 0, "inputBottom" to "0px");
    }
    override fun `$initMethods`() {
        this.onClick = fun() {
            this.isLeft = !this.isLeft;
        }
        ;
        this.setNavigationBarColor1 = fun() {
            uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#ffffff", backgroundColor = "#0000", success = fun(_){
                this.navigationBarTextColor = "#fff";
                console.log("setNavigationBarColor success");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_){
                console.log("setNavigationBarColor fail");
                this.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_){
                console.log("setNavigationBarColor complete");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.setNavigationBarColor2 = fun() {
            uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#000000", backgroundColor = "#0000", success = fun(_){
                this.navigationBarTextColor = "#000";
                console.log("setNavigationBarColor success");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_){
                console.log("setNavigationBarColor fail");
                this.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_){
                console.log("setNavigationBarColor complete");
                this.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.ChangeView = fun(e: UniRadioGroupChangeEvent) {
            this.indexView = parseInt(e.detail.value);
        }
        ;
        this.onInputBlur = fun(_: UniInputBlurEvent) {
            this.inputBottom = "0px";
        }
        ;
        this.onInputKeyboardChange = fun(e: UniInputKeyboardHeightChangeEvent) {
            var bottom = if ((this.inputRemainHeight > e.detail.height)) {
                0;
            } else {
                (e.detail.height - this.inputRemainHeight);
            }
            ;
            this.inputBottom = "" + bottom + "px";
        }
        ;
        this.getLifeCycleNum = fun(): Number {
            return state.lifeCycleNum;
        }
        ;
        this.setLifeCycleNum = fun(num: Number) {
            uni.UNIFB90797.setLifeCycleNum(num);
        }
        ;
        this.calcInputRemainHeight = fun(): UTSPromise<Unit> {
            return wrapUTSPromise(suspend {
                    var windowHeight = uni_getWindowInfo().windowHeight;
                    val rect = await(uni_getElementById("input")!!.getBoundingClientRectAsync()!!);
                    this.inputRemainHeight = windowHeight - rect.bottom;
            });
        }
        ;
    }
    open lateinit var onClick: () -> Unit;
    open lateinit var setNavigationBarColor1: () -> Unit;
    open lateinit var setNavigationBarColor2: () -> Unit;
    open lateinit var ChangeView: (e: UniRadioGroupChangeEvent) -> Unit;
    open lateinit var onInputBlur: (_: UniInputBlurEvent) -> Unit;
    open lateinit var onInputKeyboardChange: (e: UniInputKeyboardHeightChangeEvent) -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
    open lateinit var setLifeCycleNum: (num: Number) -> Unit;
    open lateinit var calcInputRemainHeight: () -> UTSPromise<Unit>;
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
                return utsMapOf("content" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column", "flex" to 1)), "scroll-view" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#f5f5f5", "paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "content-item" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginTop" to 5, "marginRight" to 10, "marginBottom" to 5, "marginLeft" to 10, "backgroundColor" to "#ffffff", "borderRadius" to 5)), "cell-item" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column")), "text" to padStyleMapOf(utsMapOf("fontSize" to 14, "color" to "#666666")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
