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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch;
import io.dcloud.uniapp.extapi.redirectTo as uni_redirectTo;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab;
open class GenPagesAPINavigatorNavigator : BasePage {
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
            this.onLoadTime = Date.now();
            console.log("onLoad", this.onLoadTime);
        }
        , __ins);
        onPageShow(fun() {
            this.onShowTime = Date.now();
            console.log("onShow", this.onShowTime);
        }
        , __ins);
        onReady(fun() {
            this.onReadyTime = Date.now();
            console.log("onReady", this.onReadyTime);
        }
        , __ins);
        onPageHide(fun() {
            this.onHideTime = Date.now();
            console.log("onHide", this.onHideTime);
        }
        , __ins);
        onBackPress(fun(options: OnBackPressOptions): Boolean? {
            console.log("onBackPress", Date.now());
            console.log("onBackPress from", options.from);
            return null;
        }
        , __ins);
        onUnload(fun() {
            console.log("onUnload", Date.now());
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to "navigate")),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt uni-common-mb"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onLoad触发时间戳:"),
                        createElementVNode("text", null, toDisplayString(_ctx.onLoadTime), 1)
                    )),
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onShow触发时间戳:"),
                        createElementVNode("text", null, toDisplayString(_ctx.onShowTime), 1)
                    )),
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onReady触发时间戳:"),
                        createElementVNode("text", null, toDisplayString(_ctx.onReadyTime), 1)
                    )),
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onHide触发时间戳:"),
                        createElementVNode("text", null, toDisplayString(_ctx.onHideTime), 1)
                    )),
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onBackPress触发时间戳:"),
                        createElementVNode("text", null, "见控制台")
                    )),
                    createElementVNode("view", utsMapOf("class" to "direction-row"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "label"), "onUnload触发时间戳:"),
                        createElementVNode("text", null, "见控制台")
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                        createElementVNode("button", utsMapOf("onClick" to _ctx.navigateTo, "class" to "uni-btn"), " 跳转新页面，并传递数据 ", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("onClick" to _ctx.navigateBack, "class" to "uni-btn"), "返回上一页", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("onClick" to _ctx.redirectTo, "class" to "uni-btn"), "在当前页面打开", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("onClick" to _ctx.switchTab, "class" to "uni-btn"), "切换到模板选项卡", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("onClick" to _ctx.reLaunch, "class" to "uni-btn"), " 关闭所有页面，打开首页 ", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode("button", utsMapOf("onClick" to _ctx.navigateToErrorPage, "class" to "uni-btn"), " 打开不存在的页面 ", 8, utsArrayOf(
                            "onClick"
                        )),
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.animationTypeList, fun(item, _, __index, _cached): Any {
                            return createElementVNode("button", utsMapOf("onClick" to fun(){
                                _ctx.navigateToAnimationType(item);
                            }
                            , "class" to "uni-btn"), "navigateTo动画(" + toDisplayString(item) + ")", 9, utsArrayOf(
                                "onClick"
                            ));
                        }
                        ), 256)
                    ))
                ))
            ))
        ), 4);
    }
    open var onLoadTime: Number by `$data`;
    open var onShowTime: Number by `$data`;
    open var onReadyTime: Number by `$data`;
    open var onHideTime: Number by `$data`;
    open var animationTypeList: UTSArray<String> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("onLoadTime" to 0, "onShowTime" to 0, "onReadyTime" to 0, "onHideTime" to 0, "animationTypeList" to utsArrayOf(
            "slide-in-right",
            "slide-in-left",
            "slide-in-top",
            "slide-in-bottom",
            "pop-in",
            "fade-in",
            "zoom-out",
            "zoom-fade-out",
            "none"
        ));
    }
    override fun `$initMethods`() {
        this.reLaunch = fun() {
            uni_reLaunch(ReLaunchOptions(url = "/pages/tabBar/component", success = fun(result) {
                console.log("reLaunch success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("reLaunch fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("reLaunch complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateTo = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", success = fun(result) {
                console.log("navigateTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("navigateTo fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("navigateTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToAnimationType = fun(animationType: AnimationType) {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", animationType = animationType, success = fun(result) {
                console.log("navigateTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("navigateTo fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("navigateTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToErrorPage = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/error-page/error-page", success = fun(result) {
                console.log("navigateTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , fail = fun(error) {
                console.log("navigateTo fail", error.errMsg);
                uni_showToast(ShowToastOptions(title = error.errMsg, icon = "none"));
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , complete = fun(result) {
                console.log("navigateTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToDebounce = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=debounce", success = fun(result) {
                console.log("navigateTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("navigateTo fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("navigateTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=debounce", success = fun(result) {
                console.log("navigateTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , fail = fun(error) {
                console.log("navigateTo fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , complete = fun(result) {
                console.log("navigateTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToRelativePath1 = fun() {
            uni_navigateTo(NavigateToOptions(url = "new-page/new-page-1?data=new-page/new-page-1", success = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToRelativePath2 = fun() {
            uni_navigateTo(NavigateToOptions(url = "./new-page/new-page-1?data=./new-page/new-page-1", success = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateToRelativePath3 = fun() {
            uni_navigateTo(NavigateToOptions(url = "../navigator/new-page/new-page-1?data=../navigator/new-page/new-page-1", success = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(_) {
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateBack = fun() {
            uni_navigateBack(NavigateBackOptions(success = fun(result) {
                console.log("navigateBack success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("navigateBack fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("navigateBack complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.navigateBackWithDelta1 = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1", success = fun(_) {
                uni_navigateBack(NavigateBackOptions(delta = 1, success = fun(result) {
                    console.log("navigateBack success", result.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                }
                , fail = fun(error) {
                    console.log("navigateBack fail", error.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
                }
                , complete = fun(result) {
                    console.log("navigateBack complete", result.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                }
                ));
            }
            ));
        }
        ;
        this.navigateBackWithDelta100 = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/navigator/new-page/new-page-1", success = fun(_) {
                uni_navigateBack(NavigateBackOptions(delta = 100, success = fun(result) {
                    console.log("navigateBack success", result.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                }
                , fail = fun(error) {
                    console.log("navigateBack fail", error.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
                }
                , complete = fun(result) {
                    console.log("navigateBack complete", result.errMsg);
                    uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                }
                ));
            }
            ));
        }
        ;
        this.redirectTo = fun() {
            uni_redirectTo(RedirectToOptions(url = "/pages/API/navigator/new-page/new-page-1?data=Hello", success = fun(result) {
                console.log("redirectTo success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("redirectTo fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("redirectTo complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.switchTab = fun() {
            uni_switchTab(SwitchTabOptions(url = "/pages/tabBar/template", success = fun(result) {
                console.log("switchTab success", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(error) {
                console.log("switchTab fail", error.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
            }
            , complete = fun(result) {
                console.log("switchTab complete", result.errMsg);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
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
    }
    open lateinit var reLaunch: () -> Unit;
    open lateinit var navigateTo: () -> Unit;
    open lateinit var navigateToAnimationType: (animationType: AnimationType) -> Unit;
    open lateinit var navigateToErrorPage: () -> Unit;
    open lateinit var navigateToDebounce: () -> Unit;
    open lateinit var navigateToRelativePath1: () -> Unit;
    open lateinit var navigateToRelativePath2: () -> Unit;
    open lateinit var navigateToRelativePath3: () -> Unit;
    open lateinit var navigateBack: () -> Unit;
    open lateinit var navigateBackWithDelta1: () -> Unit;
    open lateinit var navigateBackWithDelta100: () -> Unit;
    open lateinit var redirectTo: () -> Unit;
    open lateinit var switchTab: () -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
    open lateinit var setLifeCycleNum: (num: Number) -> Unit;
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
                return utsMapOf("direction-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "label" to padStyleMapOf(utsMapOf("width" to 190)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
