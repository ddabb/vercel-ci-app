@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIFB90797;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.dom.node.PageNode;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.interfaces.INodeData;
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
import uts.sdk.modules.uniStat.ReportOptions as ReportOptions;
import uts.sdk.modules.uniStat.Stat;
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.getAppBaseInfo as uni_getAppBaseInfo;
import io.dcloud.uniapp.extapi.getPrivacySetting as uni_getPrivacySetting;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
import uts.sdk.modules.utsOpenSchema.openSchema as utsOpenSchema;
import io.dcloud.uniapp.extapi.removeStorageSync as uni_removeStorageSync;
import uts.sdk.modules.uniStat.report as uni_report;
import io.dcloud.uniapp.extapi.setStorageSync as uni_setStorageSync;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
val runBlock1 = run {
    __uniConfig.getAppStyles = fun(): Map<String, Map<String, Map<String, Any>>> {
        return GenApp.styles;
    }
    ;
}
open class TestConsole {
    constructor(){
        console.log("test main.uts console.log");
    }
}
val ts = TestConsole();
val stat_instance = Stat.getInstance();
val uniStat = definePlugin(VuePlugin(install = fun(app: VueApp, options: UTSJSONObject) {
    if (Stat.no_space) {
        return;
    }
    stat_instance.init(options);
}
));
open class SafeArea (
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var right: Number,
    @JsonNotNull
    open var bottom: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SafeAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SafeAreaReactiveObject : SafeArea, IUTSReactive<SafeArea> {
    override var __v_raw: SafeArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SafeArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(top = __v_raw.top, right = __v_raw.right, bottom = __v_raw.bottom, left = __v_raw.left, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SafeAreaReactiveObject {
        return SafeAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var right: Number
        get() {
            return trackReactiveGet(__v_raw, "right", __v_raw.right, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("right")) {
                return;
            }
            val oldValue = __v_raw.right;
            __v_raw.right = value;
            triggerReactiveSet(__v_raw, "right", oldValue, value);
        }
    override var bottom: Number
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
open class State (
    @JsonNotNull
    open var lifeCycleNum: Number,
    @JsonNotNull
    open var statusBarHeight: Number,
    @JsonNotNull
    open var safeArea: SafeArea,
    @JsonNotNull
    open var devicePixelRatio: Number,
    @JsonNotNull
    open var eventCallbackNum: Number,
    @JsonNotNull
    open var noMatchLeftWindow: Boolean = false,
    @JsonNotNull
    open var active: String,
    @JsonNotNull
    open var leftWinActive: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return StateReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class StateReactiveObject : State, IUTSReactive<State> {
    override var __v_raw: State;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: State, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(lifeCycleNum = __v_raw.lifeCycleNum, statusBarHeight = __v_raw.statusBarHeight, safeArea = __v_raw.safeArea, devicePixelRatio = __v_raw.devicePixelRatio, eventCallbackNum = __v_raw.eventCallbackNum, noMatchLeftWindow = __v_raw.noMatchLeftWindow, active = __v_raw.active, leftWinActive = __v_raw.leftWinActive) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): StateReactiveObject {
        return StateReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var lifeCycleNum: Number
        get() {
            return trackReactiveGet(__v_raw, "lifeCycleNum", __v_raw.lifeCycleNum, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lifeCycleNum")) {
                return;
            }
            val oldValue = __v_raw.lifeCycleNum;
            __v_raw.lifeCycleNum = value;
            triggerReactiveSet(__v_raw, "lifeCycleNum", oldValue, value);
        }
    override var statusBarHeight: Number
        get() {
            return trackReactiveGet(__v_raw, "statusBarHeight", __v_raw.statusBarHeight, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("statusBarHeight")) {
                return;
            }
            val oldValue = __v_raw.statusBarHeight;
            __v_raw.statusBarHeight = value;
            triggerReactiveSet(__v_raw, "statusBarHeight", oldValue, value);
        }
    override var safeArea: SafeArea
        get() {
            return trackReactiveGet(__v_raw, "safeArea", __v_raw.safeArea, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("safeArea")) {
                return;
            }
            val oldValue = __v_raw.safeArea;
            __v_raw.safeArea = value;
            triggerReactiveSet(__v_raw, "safeArea", oldValue, value);
        }
    override var devicePixelRatio: Number
        get() {
            return trackReactiveGet(__v_raw, "devicePixelRatio", __v_raw.devicePixelRatio, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("devicePixelRatio")) {
                return;
            }
            val oldValue = __v_raw.devicePixelRatio;
            __v_raw.devicePixelRatio = value;
            triggerReactiveSet(__v_raw, "devicePixelRatio", oldValue, value);
        }
    override var eventCallbackNum: Number
        get() {
            return trackReactiveGet(__v_raw, "eventCallbackNum", __v_raw.eventCallbackNum, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("eventCallbackNum")) {
                return;
            }
            val oldValue = __v_raw.eventCallbackNum;
            __v_raw.eventCallbackNum = value;
            triggerReactiveSet(__v_raw, "eventCallbackNum", oldValue, value);
        }
    override var noMatchLeftWindow: Boolean
        get() {
            return trackReactiveGet(__v_raw, "noMatchLeftWindow", __v_raw.noMatchLeftWindow, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("noMatchLeftWindow")) {
                return;
            }
            val oldValue = __v_raw.noMatchLeftWindow;
            __v_raw.noMatchLeftWindow = value;
            triggerReactiveSet(__v_raw, "noMatchLeftWindow", oldValue, value);
        }
    override var active: String
        get() {
            return trackReactiveGet(__v_raw, "active", __v_raw.active, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("active")) {
                return;
            }
            val oldValue = __v_raw.active;
            __v_raw.active = value;
            triggerReactiveSet(__v_raw, "active", oldValue, value);
        }
    override var leftWinActive: String
        get() {
            return trackReactiveGet(__v_raw, "leftWinActive", __v_raw.leftWinActive, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("leftWinActive")) {
                return;
            }
            val oldValue = __v_raw.leftWinActive;
            __v_raw.leftWinActive = value;
            triggerReactiveSet(__v_raw, "leftWinActive", oldValue, value);
        }
}
val state = reactive(State(lifeCycleNum = 0, statusBarHeight = 0, devicePixelRatio = 1, eventCallbackNum = 0, noMatchLeftWindow = true, active = "componentPage", leftWinActive = "/pages/component/view/view", safeArea = SafeArea(top = 0, right = 0, bottom = 0, left = 0, width = 0, height = 0)));
val setLifeCycleNum = fun(num: Number){
    state.lifeCycleNum = num;
}
;
val setEventCallbackNum = fun(num: Number){
    state.eventCallbackNum = num;
}
;
val setStatusBarHeight = fun(height: Number){
    state.statusBarHeight = height;
}
;
val setSafeArea = fun(value: SafeArea){
    state.safeArea = value;
}
;
val setDevicePixelRatio = fun(devicePixelRatio: Number){
    state.devicePixelRatio = devicePixelRatio;
}
;
var firstBackTime: Number = 0;
open class GenGlobalData {
    open var str = "default globalData str";
    open var num: Number = 0;
    open var bool = false;
    open var obj = object : UTSJSONObject() {
        var str = "default globalData obj str"
        var num: Number = 0
        var bool = false
    };
    open var `null` = null as String?;
    open var arr = utsArrayOf<Number>();
    open var mySet = Set<String>();
    open var myMap = Map<String, Any>();
    open var func = fun(): String {
        return "globalData func";
    }
    ;
    open var launchOptions = OnLaunchOptions(path = "");
    open var onShowOption = OnShowOptions(path = "");
}
open class GenApp : BaseApp {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLaunch(fun(res: OnLaunchOptions) {
            this.globalData.launchOptions = res;
            setLifeCycleNum(state.lifeCycleNum + 1000);
            console.log("App Launch");
            uni_report(ReportOptions(name = "uni-app-launch", options = res, success = fun(res_data) {
                console.log(res_data);
            }
            , fail = fun(err) {
                console.log(err);
            }
            ));
            if ("production" !== "development") {
                uni_getPrivacySetting(GetPrivacySettingOptions(success = fun(res1) {
                    if (res1.needAuthorization) {
                        uni_openDialogPage(OpenDialogPageOptions(url = "/pages/component/button/privacy"));
                    }
                }
                ));
            }
        }
        , __ins);
        onAppShow(fun(res: OnShowOptions) {
            this.globalData.onShowOption = res;
            var url = this.getRedirectUrl(res.appScheme, res.appLink);
            if (null != url) {
                uni_navigateTo(NavigateToOptions(url = url));
            }
            setLifeCycleNum(state.lifeCycleNum + 100);
            console.log("App Show");
            uni_report(ReportOptions(name = "uni-app-show", success = fun(res_data) {
                console.log(res_data);
            }
            , fail = fun(err) {
                console.log(err);
            }
            ));
        }
        , __ins);
        onAppHide(fun() {
            setLifeCycleNum(state.lifeCycleNum - 100);
            console.log("App Hide");
            uni_report(ReportOptions(name = "uni-app-hide", success = fun(res) {
                console.log(res);
            }
            , fail = fun(err) {
                console.log(err);
            }
            ));
        }
        , __ins);
        onLastPageBackPress(fun() {
            setLifeCycleNum(state.lifeCycleNum - 1000);
            console.log("App LastPageBackPress");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , __ins);
        onExit(fun() {
            console.log("App Exit");
        }
        , __ins);
        onError(fun(err: Any) {
            uni_report(ReportOptions(name = "uni-app-error", options = err, success = fun(res) {
                console.log(res);
            }
            , fail = fun(err) {
                console.log(err);
            }
            ));
        }
        , __ins);
    }
    open val globalData: GenGlobalData
        get() {
            return getApp().globalData;
        }
    override fun `$initMethods`() {
        this.increasetLifeCycleNum = fun() {
            setLifeCycleNum(state.lifeCycleNum + 100);
            console.log("App increasetLifeCycleNum");
        }
        ;
        this.getRedirectUrl = fun(scheme: String?, ulink: String?): String? {
            var url: String? = null;
            if (null != scheme && scheme.length > 0) {
                val PATHPRE = "redirect";
                var parts: String? = null;
                var pos = scheme.search("//");
                if (pos > 0) {
                    parts = scheme.substring(pos + 2);
                }
                if (null != parts && parts.startsWith(PATHPRE)) {
                    url = parts.substring(PATHPRE.length);
                }
            } else if (null != ulink && ulink.length > 0) {
                val PATH = "ulink/redirect.html";
                var parts = ulink.split("?");
                if (parts.length > 1 && parts[0].endsWith(PATH) && parts[1].length > 0) {
                    parts[1].split("&").forEach(fun(e){
                        var params = e.split("=");
                        if (params.length > 1 && params[0].length > 0 && params[1].length > 0) {
                            if ("url" == params[0]) {
                                if (null == url) {
                                    url = decodeURIComponent(params[1]);
                                }
                            }
                        }
                    }
                    );
                }
            }
            return url;
        }
        ;
    }
    open lateinit var increasetLifeCycleNum: () -> Unit;
    open lateinit var getRedirectUrl: (scheme: String?, ulink: String?) -> String?;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-padding-wrap" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 15)), "uni-title" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 0, "paddingBottom" to 10, "paddingLeft" to 0)), "uni-title-text" to padStyleMapOf(utsMapOf("fontSize" to 15, "fontWeight" to "bold")), "uni-subtitle-text" to padStyleMapOf(utsMapOf("color" to "#888888", "fontSize" to 12, "fontWeight" to "bold", "marginTop" to 5)), "uni-common-mb" to padStyleMapOf(utsMapOf("marginBottom" to 15)), "uni-common-pb" to padStyleMapOf(utsMapOf("paddingBottom" to 15)), "uni-common-pl" to padStyleMapOf(utsMapOf("paddingLeft" to 15)), "uni-common-mt" to padStyleMapOf(utsMapOf("marginTop" to 15)), "uni-hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "lineHeight" to "22px")), "uni-list" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF", "position" to "relative", "display" to "flex", "flexDirection" to "column", "borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell" to padStyleMapOf(utsMapOf("position" to "relative", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignItems" to "center")), "uni-list-cell-padding" to padStyleMapOf(utsMapOf("paddingTop" to 16, "paddingRight" to 16, "paddingBottom" to 16, "paddingLeft" to 16)), "uni-list-cell-line" to padStyleMapOf(utsMapOf("borderBottomWidth" to 1, "borderBottomStyle" to "solid", "borderBottomColor" to "#c8c7cc")), "uni-list-cell-hover" to padStyleMapOf(utsMapOf("backgroundColor" to "#eeeeee")), "uni-list-cell-pd" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingRight" to 15, "paddingBottom" to 11, "paddingLeft" to 0)), "uni-list-cell-left" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to 15, "paddingBottom" to 0, "paddingLeft" to 10)), "uni-list-cell-db" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-list-cell-right" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-list-cell-db-text" to padStyleMapOf(utsMapOf("width" to "100%")), "uni-label" to padStyleMapOf(utsMapOf("width" to 105)), "uni-input" to padStyleMapOf(utsMapOf("height" to 25, "paddingTop" to 8, "paddingRight" to 13, "paddingBottom" to 8, "paddingLeft" to 13, "fontSize" to 14, "backgroundImage" to "none", "backgroundColor" to "#FFFFFF", "flex" to 1, "boxSizing" to "content-box")), "uni-flex" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-flex-item" to padStyleMapOf(utsMapOf("flex" to 1)), "uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "uni-bg-red" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#F76260")), "uni-bg-green" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#09BB07")), "uni-bg-blue" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#007AFF")), "uni-btn-v" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 0, "paddingBottom" to 5, "paddingLeft" to 0)), "uni-btn" to padStyleMapOf(utsMapOf("marginTop" to 10)), "uni-link" to padStyleMapOf(utsMapOf("color" to "#576B95", "fontSize" to 13)), "uni-center" to padStyleMapOf(utsMapOf("flexDirection" to "row", "justifyContent" to "center")), "uni-textarea" to padStyleMapOf(utsMapOf("paddingTop" to 9, "paddingRight" to 9, "paddingBottom" to 9, "paddingLeft" to 9, "lineHeight" to 1.6, "fontSize" to 14)), "uni-icon-size" to padStyleMapOf(utsMapOf("width" to 14, "height" to 14)), "uni-container" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "backgroundColor" to "#f8f8f8")), "uni-header-logo" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "flexDirection" to "column", "justifyContent" to "center", "alignItems" to "center", "marginTop" to 5)), "uni-header-image" to padStyleMapOf(utsMapOf("width" to 80, "height" to 80)), "uni-text-box" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "hello-text" to padStyleMapOf(utsMapOf("color" to "#7A7E83", "fontSize" to 14, "lineHeight" to "20px")), "uni-panel" to padStyleMapOf(utsMapOf("marginBottom" to 12)), "text-disabled" to padStyleMapOf(utsMapOf("!color" to "#a0a0a0")), "uni-panel-h" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff", "!flexDirection" to "row", "!justifyContent" to "space-between", "!alignItems" to "center", "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12)), "uni-panel-h-on" to padStyleMapOf(utsMapOf("backgroundColor" to "#f0f0f0")), "uni-panel-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "uni-navigate-item" to padStyleMapOf(utsMapOf("flexDirection" to "row", "alignItems" to "center", "backgroundColor" to "#FFFFFF", "borderTopStyle" to "solid", "borderTopColor" to "#f0f0f0", "borderTopWidth" to 1, "paddingTop" to 12, "paddingRight" to 12, "paddingBottom" to 12, "paddingLeft" to 12, "justifyContent" to "space-between", "backgroundColor:active" to "#f8f8f8")), "is--active" to padStyleMapOf(utsMapOf("backgroundColor" to "#f8f8f8")), "uni-navigate-text" to padStyleMapOf(utsMapOf("color" to "#000000", "fontSize" to 14, "fontWeight" to "normal")), "left-win-active" to padStyleMapOf(utsMapOf("!color" to "#007AFF")), "page-scroll-view" to padStyleMapOf(utsMapOf("flex" to 1)));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
val pages = utsArrayOf<UTSJSONObject>(object : UTSJSONObject() {
    var path = "pages/tabBar/component"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "内置组件"
        var backgroundColorContent = "#f8f8f8"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/view/view"
    var group = "0,1,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "view | 基本视图容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/scroll-view/scroll-view"
    var group = "0,1,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "scroll-view | 可滚动视图容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/scroll-view/scroll-view-refresher"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "scroll-view-refresher"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/scroll-view/scroll-view-props"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "非下拉刷新的scroll-view属性示例"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/scroll-view/scroll-view-refresher-props"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "下拉刷新的scroll-view属性示例"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/scroll-view/scroll-view-custom-refresher-props"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "自定义下拉刷新的scroll-view属性示例"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/swiper/swiper"
    var group = "0,1,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "swiper | 滑块视图容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view"
    var group = "0,1,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view | 列表容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view-refresh"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view-refresh"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view-multiplex"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view-multiplex"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view-multiplex-input"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view复用input"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view-multiplex-video"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view-multiplex-video"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/list-view-children-in-slot"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "list-view-children-in-slot"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/sticky-section/sticky-section"
    var group = "0,1,8,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "sticky-section | 吸顶布局容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/sticky-header/sticky-header"
    var group = "0,1,8,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "sticky-header | 吸顶布局容器"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/text/text"
    var group = "0,2,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "text | 文本"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/text/text-props"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "text-props"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/rich-text/rich-text"
    var group = "0,2,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "rich-text | 富文本"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/rich-text/rich-text-tags"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "rich-text-tags"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/rich-text/rich-text-complex"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "rich-text-complex"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/progress/progress"
    var group = "0,2,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "progress | 进度条"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/form/form"
    var group = "0,3,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "form | 表单"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/button/button"
    var group = "0,3,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "button | 按钮"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/button/buttonstatus"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "buttonstatus"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/radio/radio"
    var group = "0,3,8"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "radio | 单选框"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/checkbox/checkbox"
    var group = "0,3,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "checkbox | 多选框"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/input/input"
    var group = "0,3,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "input | 输入框"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/textarea/textarea"
    var group = "0,3,11"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "textarea | 多行输入框"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/slider/slider"
    var group = "0,3,9"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "slider | 滑动选择器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/slider/slider-in-swiper"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "slider-in-swiper"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/slider/slider-maxValue"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "slider-maxValue-test"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/picker-view/picker-view"
    var group = "0,3,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "picker-view | 嵌入页面的滚动选择器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/switch/switch"
    var group = "0,3,10"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "switch | 开关选择器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/image/image"
    var group = "0,5,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "image | 图片"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/image/image-format"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "image-format"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/image/image-mode"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "image-mode"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/image/image-path"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "image-path"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/image/image-large"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "大图测试"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/video/video"
    var group = "0,5,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "video | 视频"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/video/video-format"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "video-format"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/navigator/navigator"
    var group = "0,4,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "navigator | 页面链接"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/navigator/navigate"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "navigatePage"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/navigator/redirect"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "redirectPage"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/web-view/web-view"
    var group = "0,9"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "web-view"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/web-view/web-view/web-view-local"
    var group = "0,9"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "本地网页"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/unicloud-db/unicloud-db/contacts/list"
    var group = "0,11"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "联系人"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/component/unicloud-db/unicloud-db/contacts/add"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "新增联系人"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/unicloud-db/unicloud-db/contacts/edit"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "编辑联系人"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/unicloud-db/unicloud-db/contacts/detail"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = ""
    }
}, object : UTSJSONObject() {
    var path = "pages/component/unicloud-db/unicloud-db/mixin-datacom/mixin-datacom"
    var group = "0,11"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "mixinDatacom"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/global-properties/global-properties"
    var group = "0,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "全局属性"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/global-events/global-events"
    var group = "0,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "全局事件"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/global-events/transition-events"
    var group = "0,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "Transition Events"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/global-events/touch-events"
    var group = "0,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "Touch Events"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/global-events/touch-events-bubbles"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "Touch Events bubbles"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/nested-scroll-header/nested-scroll-header"
    var group = "0,1,9,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "nested-scroll-header"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/nested-scroll-body/nested-scroll-body"
    var group = "0,1,9,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "nested-scroll-body"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/swiper/swiper-list-view"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "swiper嵌套list-view"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/map/map"
    var group = "0,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "map | 地图"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/list-view/issue-2199"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "issue-2199"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/canvas/canvas"
    var group = "0,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "canvas | 画布"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/canvas/canvas-context"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createCanvasContextAsync"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/canvas/canvas/ball"
    var group = "0,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "ball"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/canvas/canvas/doodle"
    var group = "0,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "涂鸦"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/native-view/native-view"
    var group = "0,2,4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "native-view"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/ad/ad"
    var group = "0,8"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "ad | 信息流广告"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/waterflow/waterflow"
    var group = "0,1,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "waterflow | 瀑布流容器"
    }
}, object : UTSJSONObject() {
    var path = "pages/component/ad/list-view-ad"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "ad | 信息流广告"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/tabBar/API"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "接口"
        var backgroundColorContent = "#f8f8f8"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-app/get-app"
    var group = "1,0,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getApp | 获取当前应用实例"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/exit/exit"
    var group = "1,1,5"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "exit | 退出应用"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/install-apk/install-apk"
    var group = "1,6,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "installApk | 安装 APK"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-current-pages/get-current-pages"
    var group = "1,0,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getCurrentPages | 获取当前页面栈"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-current-pages/set-page-style-disable-pull-down-refresh"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "setPageStyle pull default false"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-launch-options-sync/get-launch-options-sync"
    var group = "1,1,4,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getLaunchOptionsSync | 获取启动参数"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-enter-options-sync/get-enter-options-sync"
    var group = "1,1,4,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getEnterOptionsSync | 获取本次启动时的参数"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/animation-frame/animation-frame"
    var group = "1,0,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "animationFrame | 动画帧"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/navigator/navigator"
    var group = "1,2,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "navigator | 页面跳转"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/set-navigation-bar-color/set-navigation-bar-color"
    var group = "1,2,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "setNavigationBarColor | 设置导航条颜色"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/set-navigation-bar-title/set-navigation-bar-title"
    var group = "1,2,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "setNavigationBarTitle | 设置导航条标题"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/set-page-backgroundColorContent/set-page-backgroundColorContent"
    var group = "1,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "设置页面容器背景色"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/navigator/new-page/new-page-1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "新页面-1"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/navigator/new-page/new-page-3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "新页面-3"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/navigator/new-page/onLoad"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "onLoad 生命周期测试"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/pull-down-refresh/pull-down-refresh"
    var group = "1,2,5"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "pullDownRefresh | 页面下拉刷新"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/API/storage/storage"
    var group = "1,10"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "storage | key-value本地数据存储"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-file-system-manager/get-file-system-manager"
    var group = "1,11,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getFileSystemManager | 获取文件管理器"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/env/env"
    var group = "1,1,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "env | 环境变量"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/show-action-sheet/show-action-sheet"
    var group = "1,4,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "showActionSheet | 弹出操作菜单"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/show-modal/show-modal"
    var group = "1,4,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "showModal | 显示模态弹窗"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/show-loading/show-loading"
    var group = "1,4,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "showLoading | 显示 loading 提示框"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/show-toast/show-toast"
    var group = "1,4,4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "showToast | 显示消息提示框"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/load-font-face/load-font-face"
    var group = "1,4,5"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "loadFontFace | 动态加载字体"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/load-font-face/load-font-face-child"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "动态加载字体-子页面"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-location/get-location"
    var group = "1,9,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getLocation | 获取当前位置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/open-location/open-location"
    var group = "1,9,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "openLocation | 使用地图查看位置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/choose-location/choose-location"
    var group = "1,9,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "chooseLocation | 使用地图选择位置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/interceptor/interceptor"
    var group = "1,1,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "interceptor | 拦截器"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/interceptor/page1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "拦截器测试页面 1"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/interceptor/page2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "拦截器测试页面 2"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/request/request"
    var group = "1,5,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "request | 发起网络请求"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/upload-file/upload-file"
    var group = "1,5,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "uploadFile | 上传文件"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/download-file/download-file"
    var group = "1,5,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "downloadFile | 下载文件"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/websocket/socketTask"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "socketTask"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/websocket/websocket"
    var group = "1,5,4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "websocket"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/unicloud/unicloud/cloud-function"
    var group = "1,19,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "cloud function | 云函数"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/unicloud/unicloud/cloud-object"
    var group = "1,19,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "cloud object | 云对象"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-system-info/get-system-info"
    var group = "1,6,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getSystemInfo | 获取系统信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-device-info/get-device-info"
    var group = "1,6,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getDeviceInfo | 获取设备信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-app-base-info/get-app-base-info"
    var group = "1,6,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getAppBaseInfo | 获取APP基础信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-system-setting/get-system-setting"
    var group = "1,6,5"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getSystemSetting | 获取系统设置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/element-takesnapshot/element-takesnapshot"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "takeSnapshot | 截图"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/element-get-bounding-client-rect-async/element-get-bounding-client-rect-async"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getBoundingClientRectAsync | 异步获取元素信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/element-get-attribute/element-get-attribute"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getAttribute | 获取元素的属性值"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-app-authorize-setting/get-app-authorize-setting"
    var group = "1,6,4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getAppAuthorizeSetting | 获取APP授权设置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/preview-image/preview-image"
    var group = "1,7,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "previewImage | 图片预览"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/choose-image/choose-image"
    var group = "1,7,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "chooseImage | 拍照或从相册选择图片"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-image-info/get-image-info"
    var group = "1,7,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getImageInfo | 获取图片信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/compress-image/compress-image"
    var group = "1,7,4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "compressImage | 压缩图片"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/choose-video/choose-video"
    var group = "1,7,5"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "chooseVideo | 拍摄视频或从相册中选择视频"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/compress-video/compress-video"
    var group = "1,7,8"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "compressVideo | 压缩视频"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-network-type/get-network-type"
    var group = "1,5,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getNetworkType | 获取网络类型"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/page-scroll-to/page-scroll-to"
    var group = "1,2,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "pageScrollTo | 将页面滚动到指定位置"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/event-bus/event-bus"
    var group = "1,1,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "eventBus | 事件总线"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/unicloud/unicloud/cloud-storage"
    var group = "1,19,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "cloud storage | 云存储"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/unicloud/unicloud/database"
    var group = "1,19,3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "database | 数据库"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-battery-info/get-battery-info"
    var group = "1,6,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getBatteryInfo | 获取电池电量信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-window-info/get-window-info"
    var group = "1,6,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getWindowInfo | 获取窗口信息"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-window-info/window-area"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "window area"
        var navigationStyle = "custom"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/element-draw/element-draw"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getDrawableContext | 获取绘制对象"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/facial-recognition-meta-info/facial-recognition-meta-info"
    var group = "1,12,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "facialRecognitionMetaInfo | 金融级实人认证"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-univerify-manager/get-univerify-manager"
    var group = "1,12,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getUniverifyManager | App一键登录"
        var navigationBarTextStyle = "white"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-univerify-manager/univerify-custom-page"
    var style = object : UTSJSONObject() {
        var navigationBarTextStyle = "black"
        var navigationStyle = "custom"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-univerify-manager/full-webview-page"
    var style = object : UTSJSONObject() {
        var navigationBarTextStyle = "white"
        var navigationStyle = "custom"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/rpx2px/rpx2px"
    var group = "1,4,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "rpx2px | 将rpx单位值转换成px"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-request-permission-listener/create-request-permission-listener"
    var group = "1,6,15"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createRequestPermissionListener | 监听权限申请"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/request-payment/request-payment"
    var group = "1,14,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "requestPayment | 支付（requestPayment）"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-rewarded-video-ad/create-rewarded-video-ad"
    var group = "1,13,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createRewardedVideoAd | 激励视频广告"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/request-payment/request-payment/request-payment-uni-pay"
    var group = "1,14"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "uni-pay示例"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/request-payment/request-payment/order-detail"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "订单详情示例"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-inner-audio-context/create-inner-audio-context"
    var group = "1,7,9"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createInnerAudioContext | 音频"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-inner-audio-context/inner-audio-format"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "inner-audio-format"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-inner-audio-context/inner-audio-path"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "inner-audio-path"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-inner-audio-context/inner-audio-mult"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "inner-audio-mult"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/theme-change/theme-change"
    var group = "1,4,7"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "themeChange | 主题切换"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-element-by-id/get-element-by-id"
    var group = "1,3,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getElementById | 通过 id 获取 element"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-element-by-id/get-element-by-id-multiple-root-node"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "获取节点-多根节点"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-selector-query/create-selector-query"
    var group = "1,3,2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createSelectorQuery | 创建 SelectorQuery 实例"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-selector-query/create-selector-query-onScroll"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createSelectorQuery"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-native-view/element-getnativeview"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getNativeView | 获取原生 View"
        var backgroundColor = "#F8F8F8"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/resize-observer/resize-observer"
    var group = "1,30"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "UniResizeObserver"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/provider/provider"
    var group = "1,1,6"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "provider | 服务提供商"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/privacy/privacy"
    var group = "1,1,8"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "privacy | 隐私信息授权"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/uni-push/uni-push"
    var group = "1,16,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "推送"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/report/report"
    var group = "1,17,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "report | 统计采集上报"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/dialog-page"
    var group = "1,2,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogPage"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/next-page"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogNextPage"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/dialog-1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogPage1"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/dialog-2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogPage2"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/dialog-3"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogPage3"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/dialog-page/dialog-4"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "dialogPage4"
        var navigationBarTextStyle = "black"
    }
}, object : UTSJSONObject() {
    var path = "pages/API/create-interstitial-ad/create-interstitial-ad"
    var group = "1,13,1"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "createInterstitialAd | 插屏广告"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/get-background-audio-manager/get-background-audio-manager"
    var group = "1,7,10"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "getBackgroundAudioManager | 背景音频"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/API/share-with-system/share-with-system"
    var group = "1,15,0"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "shareWithSystem"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/tabBar/CSS"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "CSS"
        var backgroundColorContent = "#f8f8f8"
    }
}, object : UTSJSONObject() {
    var path = "pages/tabBar/template"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "模板"
        var backgroundColorContent = "#f8f8f8"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/list-news/list-news"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "列表到详情示例（吸顶）"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/list-news/detail/detail"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "详情示例"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/drop-card/drop-card"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "drop-card"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/swiper-list/swiper-list"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "swiper-list"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/swiper-list2/swiper-list2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "swiper-list2"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/slider-100/slider-100"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "slider x 100"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/swiper-vertical-video/swiper-vertical-video"
    var style = object : UTSJSONObject() {
        var navigationStyle = "custom"
        var backgroundColorContent = "#000000"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/scroll-sticky/scroll-sticky"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "scroll-view自定义滚动吸顶"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/scroll-fold-nav/scroll-fold-nav"
    var style = object : UTSJSONObject() {
        var navigationStyle = "custom"
        var navigationBarTextStyle = "black"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/custom-refresher/custom-refresher"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "自定义下拉刷新"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/half-screen/half-screen"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "半屏弹窗"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/long-list/long-list"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "Android顶部搜索框随时下移长列表"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/template/long-list2/long-list2"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "顶部banner长列表嵌套滚动示例"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/template/long-list-nested/long-list-nested"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "顶部banner长列表嵌套滚动示例"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/template/long-waterflow-nested/long-waterflow-nested"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "顶部banner瀑布流长列表嵌套滚动示例"
        var enablePullDownRefresh = true
    }
}, object : UTSJSONObject() {
    var path = "pages/template/pull-zoom-image/pull-zoom-image"
    var style = object : UTSJSONObject() {
        var navigationStyle = "custom"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/navbar-lite/navbar-lite"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "自定义导航栏"
        var navigationStyle = "custom"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/custom-tab-bar/custom-tab-bar"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "自定义TabBar"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/calendar/calendar"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "日历"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/schema/schema"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "打开schema示例"
    }
}, object : UTSJSONObject() {
    var path = "uni_modules/uni-pay-x/pages/success/success"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = ""
        var backgroundColor = "#F8F8F8"
        var navigationBarBackgroundColor = "#007aff"
        var navigationBarTextStyle = "white"
    }
}, object : UTSJSONObject() {
    var path = "uni_modules/uni-pay-x/pages/ad-interactive-webview/ad-interactive-webview"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "ad"
        var backgroundColor = "#F8F8F8"
    }
}, object : UTSJSONObject() {
    var path = "uni_modules/uni-pay-x/pages/pay-desk/pay-desk"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "收银台"
        var backgroundColor = "#F8F8F8"
    }
}, object : UTSJSONObject() {
    var path = "pages/template/custom-long-list/custom-long-list"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = "自定义虚拟长列表"
        var enablePullDownRefresh = false
    }
}, object : UTSJSONObject() {
    var path = "pages/template/test-background-color-content/test-background-color-content"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = ""
        var backgroundColorContent = "#fffae8"
    }
}, object : UTSJSONObject() {
    var path = "uni_modules/uni-openLocation/pages/openLocation/openLocation"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = " "
        var navigationStyle = "custom"
        var disableSwipeBack = false
    }
}, object : UTSJSONObject() {
    var path = "pages/component/button/privacy"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = ""
    }
}, object : UTSJSONObject() {
    var path = "uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup"
    var style = object : UTSJSONObject() {
        var navigationBarTitleText = ""
    }
});
val subPackages = utsArrayOf<UTSJSONObject>(object : UTSJSONObject() {
    var root = "pages/API/save-image-to-photos-album"
    var pages = utsArrayOf(
        object : UTSJSONObject() {
            var path = "save-image-to-photos-album"
            var group = "1,7,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "saveImageToPhotosAlbum | 保存图片到相册"
            }
        }
    )
}, object : UTSJSONObject() {
    var root = "pages/API/save-video-to-photos-album"
    var pages = utsArrayOf(
        object : UTSJSONObject() {
            var path = "save-video-to-photos-album"
            var group = "1,7,6"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "saveVideoToPhotosAlbum | 保存视频到相册"
            }
        }
    )
}, object : UTSJSONObject() {
    var root = "pages/API/get-video-info"
    var pages = utsArrayOf(
        object : UTSJSONObject() {
            var path = "get-video-info"
            var group = "1,7,7"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "getVideoInfo | 获取视频信息"
            }
        }
    )
}, object : UTSJSONObject() {
    var root = "pages/CSS"
    var pages = utsArrayOf(
        object : UTSJSONObject() {
            var path = "background/background-color"
            var group = "2,8,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "background-color"
            }
        },
        object : UTSJSONObject() {
            var path = "background/background-image"
            var group = "2,8,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "background-image"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-bottom"
            var group = "2,13,22"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-bottom"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-color"
            var group = "2,13,11"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-color"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-left"
            var group = "2,13,23"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-left"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-radius"
            var group = "2,13,16"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-radius"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-right"
            var group = "2,13,24"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-right"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-style"
            var group = "2,13,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-style"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-top"
            var group = "2,13,21"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-top"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-width"
            var group = "2,13,6"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border-width"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border"
            var group = "2,13,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border"
            }
        },
        object : UTSJSONObject() {
            var path = "border/complex-border/complex-border"
            var group = "2,13"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border属性组合示例"
            }
        },
        object : UTSJSONObject() {
            var path = "border/dynamic-border"
            var group = "2,13"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border动态修改"
            }
        },
        object : UTSJSONObject() {
            var path = "border/border-update"
            var group = "2,13"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "border更新样式"
            }
        },
        object : UTSJSONObject() {
            var path = "box-shadow/box-shadow"
            var group = "2,15"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "box-shadow"
            }
        },
        object : UTSJSONObject() {
            var path = "display/flex"
            var group = "2,5"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex"
            }
        },
        object : UTSJSONObject() {
            var path = "display/none"
            var group = "2,5"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "none"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/align-content"
            var group = "2,7,6"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "align-content"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/align-items"
            var group = "2,7,4"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "align-items"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex-basis"
            var group = "2,7,9"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex-basis"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex-direction"
            var group = "2,7,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex-direction"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex-flow"
            var group = "2,7,10"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex-flow"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex-grow"
            var group = "2,7,7"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex-grow"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex-shrink"
            var group = "2,7,8"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex-shrink"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/flex"
            var group = "2,7,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "flex"
            }
        },
        object : UTSJSONObject() {
            var path = "flex/justify-content"
            var group = "2,7,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "justify-content"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/height"
            var group = "2,1,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "height"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/max-height"
            var group = "2,1,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "max-height"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/max-width"
            var group = "2,0,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "max-width"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/min-height"
            var group = "2,1,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "min-height"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/min-width"
            var group = "2,0,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "min-width"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/position"
            var group = "2,9,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "position"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/width"
            var group = "2,0,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "width"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/z-index"
            var group = "2,10"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "z-index"
            }
        },
        object : UTSJSONObject() {
            var path = "layout/visibility"
            var group = "2,6"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "visibility"
            }
        },
        object : UTSJSONObject() {
            var path = "margin/margin-bottom"
            var group = "2,2,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "margin-bottom"
            }
        },
        object : UTSJSONObject() {
            var path = "margin/margin-left"
            var group = "2,2,3"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "margin-left"
            }
        },
        object : UTSJSONObject() {
            var path = "margin/margin-right"
            var group = "2,2,4"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "margin-right"
            }
        },
        object : UTSJSONObject() {
            var path = "margin/margin-top"
            var group = "2,2,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "margin-top"
            }
        },
        object : UTSJSONObject() {
            var path = "margin/margin"
            var group = "2,2,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "margin"
            }
        },
        object : UTSJSONObject() {
            var path = "overflow/overflow"
            var group = "2,11"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "overflow"
            }
        },
        object : UTSJSONObject() {
            var path = "padding/padding-bottom"
            var group = "2,3,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "padding-bottom"
            }
        },
        object : UTSJSONObject() {
            var path = "padding/padding-left"
            var group = "2,3,3"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "padding-left"
            }
        },
        object : UTSJSONObject() {
            var path = "padding/padding-right"
            var group = "2,3,4"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "padding-right"
            }
        },
        object : UTSJSONObject() {
            var path = "padding/padding-top"
            var group = "2,3,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "padding-top"
            }
        },
        object : UTSJSONObject() {
            var path = "padding/padding"
            var group = "2,3,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "padding"
            }
        },
        object : UTSJSONObject() {
            var path = "text/color"
            var group = "2,14,0"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "color"
            }
        },
        object : UTSJSONObject() {
            var path = "text/font-family"
            var group = "2,14,2"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "font-family"
            }
        },
        object : UTSJSONObject() {
            var path = "text/font-size"
            var group = "2,14,1"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "font-size"
            }
        },
        object : UTSJSONObject() {
            var path = "text/font-style"
            var group = "2,14,3"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "font-style"
            }
        },
        object : UTSJSONObject() {
            var path = "text/font-weight"
            var group = "2,14,4"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "font-weight"
            }
        },
        object : UTSJSONObject() {
            var path = "text/letter-spacing"
            var group = "2,14,14"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "letter-spacing"
            }
        },
        object : UTSJSONObject() {
            var path = "text/font-family-icon"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "font-family: uni-icon"
            }
        },
        object : UTSJSONObject() {
            var path = "text/line-height"
            var group = "2,14,12"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "line-height"
            }
        },
        object : UTSJSONObject() {
            var path = "text/text-align"
            var group = "2,14,10"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "text-align"
            }
        },
        object : UTSJSONObject() {
            var path = "text/text-overflow"
            var group = "2,14,11"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "text-overflow"
            }
        },
        object : UTSJSONObject() {
            var path = "text/text-decoration-line"
            var group = "2,14,6"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "text-decoration-line"
            }
        },
        object : UTSJSONObject() {
            var path = "transition/transition"
            var group = "2,16"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "transition"
            }
        },
        object : UTSJSONObject() {
            var path = "pointer-events/pointer-events"
            var group = "2,18"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "pointer-events"
            }
        },
        object : UTSJSONObject() {
            var path = "transform/translate"
            var group = "2,17"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "translate"
            }
        },
        object : UTSJSONObject() {
            var path = "transform/scale"
            var group = "2,17"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "scale"
            }
        },
        object : UTSJSONObject() {
            var path = "transform/rotate"
            var group = "2,17"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "rotate"
            }
        },
        object : UTSJSONObject() {
            var path = "variable/variable"
            var group = "2,20"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "css 变量"
            }
        },
        object : UTSJSONObject() {
            var path = "overflow/overflow-visible-event"
            var group = "2,11"
            var style = object : UTSJSONObject() {
                var navigationBarTitleText = "overflow-visible-event"
            }
        }
    )
});
val groups = utsArrayOf<UTSJSONObject>(object : UTSJSONObject() {
    var id = "component"
    var name = "组件"
    var children = utsArrayOf(
        object : UTSJSONObject() {
            var id = "component.global-properties-events"
            var name = "全局属性和事件"
        },
        object : UTSJSONObject() {
            var id = "component.view-container"
            var name = "视图容器"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "component.view-container.view"
                    var name = "view"
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.scroll-view"
                    var name = "scroll-view"
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.swiper"
                    var name = "swiper"
                },
                null,
                object : UTSJSONObject() {
                    var id = "component.view-container.movable"
                    var name = "movable"
                    var children = utsArrayOf(
                        null,
                        object : UTSJSONObject() {
                            var id = "component.view-container.movable.movable-view"
                            var name = "movable-view"
                        }
                    )
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.cover"
                    var name = "cover"
                    var children = utsArrayOf(
                        object : UTSJSONObject() {
                            var id = "component.view-container.cover.cover-view"
                            var name = "cover-view"
                        }
                    )
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.list-view"
                    var name = "list-view"
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.waterflow"
                    var name = "waterflow"
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.sticky"
                    var name = "sticky"
                    var children = utsArrayOf(
                        object : UTSJSONObject() {
                            var id = "component.view-container.sticky.sticky-header"
                            var name = "sticky-header"
                        },
                        object : UTSJSONObject() {
                            var id = "component.view-container.sticky.sticky-section"
                            var name = "sticky-section"
                        }
                    )
                },
                object : UTSJSONObject() {
                    var id = "component.view-container.nested-scroll"
                    var name = "nested-scroll"
                    var children = utsArrayOf(
                        object : UTSJSONObject() {
                            var id = "component.view-container.nested-scroll.nested-scroll-header"
                            var name = "nested-scroll-header"
                        },
                        object : UTSJSONObject() {
                            var id = "component.view-container.nested-scroll.nested-scroll-body"
                            var name = "nested-scroll-body"
                        }
                    )
                }
            )
        },
        object : UTSJSONObject() {
            var id = "component.basic-content"
            var name = "基础内容"
            var children = utsArrayOf(
                null,
                object : UTSJSONObject() {
                    var id = "component.basic-content.text"
                    var name = "text"
                },
                object : UTSJSONObject() {
                    var id = "component.basic-content.rich-text"
                    var name = "rich-text"
                },
                object : UTSJSONObject() {
                    var id = "component.basic-content.progress"
                    var name = "progress"
                },
                object : UTSJSONObject() {
                    var id = "component.basic-content.native-view"
                    var name = "native-view"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "component.form-component"
            var name = "表单组件"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "component.form-component.button"
                    var name = "button"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.checkbox"
                    var name = "checkbox"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.form"
                    var name = "form"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.input"
                    var name = "input"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.editor"
                    var name = "editor"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.label"
                    var name = "label"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.picker"
                    var name = "picker"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.picker-view"
                    var name = "picker-view"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.radio"
                    var name = "radio"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.slider"
                    var name = "slider"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.switch"
                    var name = "switch"
                },
                object : UTSJSONObject() {
                    var id = "component.form-component.textarea"
                    var name = "textarea"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "component.navigation"
            var name = "导航"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "component.navigation.navigator"
                    var name = "navigator"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "component.media"
            var name = "媒体组件"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "component.media.image"
                    var name = "image"
                },
                object : UTSJSONObject() {
                    var id = "component.media.video"
                    var name = "video"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "component.map"
            var name = "地图"
        },
        object : UTSJSONObject() {
            var id = "component.canvas"
            var name = "画布"
        },
        object : UTSJSONObject() {
            var id = "component.ad"
            var name = "广告"
        },
        object : UTSJSONObject() {
            var id = "component.web-view"
            var name = "网页"
        },
        object : UTSJSONObject() {
            var id = "component.page-meta"
            var name = "page-meta"
        },
        object : UTSJSONObject() {
            var id = "component.unicloud"
            var name = "unicloud"
        }
    )
}, object : UTSJSONObject() {
    var id = "API"
    var name = "API"
    var children = utsArrayOf(
        object : UTSJSONObject() {
            var id = "api.global"
            var name = "全局"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.global.getApp"
                    var name = "getApp"
                },
                object : UTSJSONObject() {
                    var id = "api.global.getCurrentPages"
                    var name = "getCurrentPages"
                },
                object : UTSJSONObject() {
                    var id = "api.global.animationFrame"
                    var name = "animationFrame"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.base"
            var name = "基础"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.base.env"
                    var name = "env"
                },
                object : UTSJSONObject() {
                    var id = "api.base.eventBus"
                    var name = "eventBus"
                },
                null,
                object : UTSJSONObject() {
                    var id = "api.base.interceptor"
                    var name = "interceptor"
                },
                object : UTSJSONObject() {
                    var id = "api.base.launch"
                    var name = "启动"
                    var children = utsArrayOf(
                        object : UTSJSONObject() {
                            var id = "api.base.launch.getLaunchOptionsSync"
                            var name = "getLaunchOptionsSync"
                        },
                        object : UTSJSONObject() {
                            var id = "api.base.launch.getEnterOptionsSync"
                            var name = "getEnterOptionsSync"
                        }
                    )
                },
                object : UTSJSONObject() {
                    var id = "api.base.exit"
                    var name = "exit"
                },
                object : UTSJSONObject() {
                    var id = "api.base.provider"
                    var name = "provider"
                },
                null,
                object : UTSJSONObject() {
                    var id = "api.base.privacy"
                    var name = "privacy"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.page"
            var name = "页面和路由"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.page.navigator"
                    var name = "navigator"
                },
                object : UTSJSONObject() {
                    var id = "api.page.dialogPage"
                    var name = "dialogPage"
                },
                object : UTSJSONObject() {
                    var id = "api.page.setNavigationBarColor"
                    var name = "setNavigationBarColor"
                },
                object : UTSJSONObject() {
                    var id = "api.page.setNavigationBarTitle"
                    var name = "setNavigationBarTitle"
                },
                null,
                object : UTSJSONObject() {
                    var id = "api.page.pullDownRefresh"
                    var name = "pullDownRefresh"
                },
                object : UTSJSONObject() {
                    var id = "api.page.pageScrollTo"
                    var name = "pageScrollTo"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.dom"
            var name = "element 和 node"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.dom.getElementById"
                    var name = "getElementById"
                },
                null,
                object : UTSJSONObject() {
                    var id = "api.dom.createSelectorQuery"
                    var name = "createSelectorQuery"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.ui"
            var name = "界面"
            var children = utsArrayOf(
                null,
                object : UTSJSONObject() {
                    var id = "api.ui.showActionSheet"
                    var name = "showActionSheet"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.showModal"
                    var name = "showModal"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.showLoading"
                    var name = "showLoading"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.showToast"
                    var name = "showToast"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.loadFontFace"
                    var name = "loadFontFace"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.rpx2px"
                    var name = "rpx2px"
                },
                object : UTSJSONObject() {
                    var id = "api.ui.themeChange"
                    var name = "themeChange"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.network"
            var name = "网络"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.network.request"
                    var name = "request"
                },
                object : UTSJSONObject() {
                    var id = "api.network.uploadFile"
                    var name = "uploadFile"
                },
                object : UTSJSONObject() {
                    var id = "api.network.downloadFile"
                    var name = "downloadFile"
                },
                object : UTSJSONObject() {
                    var id = "api.network.getNetworkType"
                    var name = "getNetworkType"
                },
                object : UTSJSONObject() {
                    var id = "api.network.websocket"
                    var name = "websocket"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.device"
            var name = "设备"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.device.getSystemInfo"
                    var name = "getSystemInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getDeviceInfo"
                    var name = "getDeviceInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getWindowInfo"
                    var name = "getWindowInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getAppBaseInfo"
                    var name = "getAppBaseInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getAppAuthorizeSetting"
                    var name = "getAppAuthorizeSetting"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getSystemSetting"
                    var name = "getSystemSetting"
                },
                object : UTSJSONObject() {
                    var id = "api.device.installApk"
                    var name = "installApk"
                },
                object : UTSJSONObject() {
                    var id = "api.device.getBatteryInfo"
                    var name = "getBatteryInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.device.makePhoneCall"
                    var name = "makePhoneCall"
                },
                object : UTSJSONObject() {
                    var id = "api.device.clipboard"
                    var name = "clipboard"
                },
                object : UTSJSONObject() {
                    var id = "api.device.compass"
                    var name = "compass"
                },
                null,
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "api.device.createRequestPermissionListener"
                    var name = "createRequestPermissionListener"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.media"
            var name = "媒体"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.media.chooseImage"
                    var name = "chooseImage"
                },
                object : UTSJSONObject() {
                    var id = "api.media.previewImage"
                    var name = "previewImage"
                },
                object : UTSJSONObject() {
                    var id = "api.media.saveImageToPhotosAlbum"
                    var name = "saveImageToPhotosAlbum"
                },
                object : UTSJSONObject() {
                    var id = "api.media.getImageInfo"
                    var name = "getImageInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.media.compressImage"
                    var name = "compressImage"
                },
                object : UTSJSONObject() {
                    var id = "api.media.chooseVideo"
                    var name = "chooseVideo"
                },
                object : UTSJSONObject() {
                    var id = "api.media.saveVideoToPhotosAlbum"
                    var name = "saveVideoToPhotosAlbum"
                },
                object : UTSJSONObject() {
                    var id = "api.media.getVideoInfo"
                    var name = "getVideoInfo"
                },
                object : UTSJSONObject() {
                    var id = "api.media.compressVideo"
                    var name = "compressVideo"
                },
                object : UTSJSONObject() {
                    var id = "api.media.createInnerAudioContext"
                    var name = "createInnerAudioContext"
                },
                object : UTSJSONObject() {
                    var id = "api.media.getBackgroundAudioManager"
                    var name = "getBackgroundAudioManager"
                }
            )
        },
        null,
        object : UTSJSONObject() {
            var id = "api.location"
            var name = "位置"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.location.getLocation"
                    var name = "getLocation"
                },
                object : UTSJSONObject() {
                    var id = "api.location.openLocation"
                    var name = "openLocation"
                },
                object : UTSJSONObject() {
                    var id = "api.location.chooseLocation"
                    var name = "chooseLocation"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.storage"
            var name = "数据存储"
        },
        object : UTSJSONObject() {
            var id = "api.file"
            var name = "文件"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.file.getFileSystemManager"
                    var name = "getFileSystemManager"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.loginVerify"
            var name = "登录与认证"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.loginVerify.getUniverifyManager"
                    var name = "getUniverifyManager"
                },
                object : UTSJSONObject() {
                    var id = "api.loginVerify.facialRecognitionMetaInfo"
                    var name = "facialRecognitionMetaInfo"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.ad"
            var name = "广告"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.ad.createRewardedVideoAd"
                    var name = "createRewardedVideoAd"
                },
                object : UTSJSONObject() {
                    var id = "api.ad.createInterstitialAd"
                    var name = "createInterstitialAd"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.payment"
            var name = "支付"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.payment.requestPayment"
                    var name = "requestPayment"
                },
                object : UTSJSONObject() {
                    var id = "api.payment.virtualPayment"
                    var name = "virtualPayment"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.share"
            var name = "分享"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.share.shareWithSystem"
                    var name = "shareWithSystem"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.push"
            var name = "推送"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.push.uni-push"
                    var name = "push"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "api.stat"
            var name = "统计"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.stat.report"
                    var name = "report"
                }
            )
        },
        null,
        object : UTSJSONObject() {
            var id = "api.unicloud"
            var name = "uniCloud客户端API"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "api.unicloud.cloudFunction"
                    var name = "cloudFunction"
                },
                object : UTSJSONObject() {
                    var id = "api.unicloud.cloudObject"
                    var name = "cloudObject"
                },
                object : UTSJSONObject() {
                    var id = "api.unicloud.cloudStorage"
                    var name = "cloudStorage"
                },
                object : UTSJSONObject() {
                    var id = "api.unicloud.database"
                    var name = "database"
                }
            )
        },
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        object : UTSJSONObject() {
            var id = "api.elementInstance"
            var name = "UniElement 实例"
        }
    )
}, object : UTSJSONObject() {
    var id = "CSS"
    var name = "组件"
    var children = utsArrayOf(
        object : UTSJSONObject() {
            var id = "css.properties.width"
            var name = "width"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.width.width"
                    var name = "width"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.width.min-width"
                    var name = "min-width"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.width.max-width"
                    var name = "max-width"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.height"
            var name = "height"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.height.height"
                    var name = "height"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.height.min-height"
                    var name = "min-height"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.height.max-height"
                    var name = "max-height"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.margin"
            var name = "margin"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.margin.margin"
                    var name = "margin"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.margin.margin-top"
                    var name = "margin-top"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.margin.margin-bottom"
                    var name = "margin-bottom"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.margin.margin-left"
                    var name = "margin-left"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.margin.margin-right"
                    var name = "margin-right"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.padding"
            var name = "padding"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.padding.padding"
                    var name = "padding"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.padding.padding-top"
                    var name = "padding-top"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.padding.padding-bottom"
                    var name = "padding-bottom"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.padding.padding-left"
                    var name = "padding-left"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.padding.padding-right"
                    var name = "padding-right"
                }
            )
        },
        null,
        object : UTSJSONObject() {
            var id = "display"
            var name = "display"
        },
        object : UTSJSONObject() {
            var id = "css.properties.visibility"
            var name = "visibility"
        },
        object : UTSJSONObject() {
            var id = "css.properties.flex"
            var name = "flex"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex"
                    var name = "flex"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex-direction"
                    var name = "flex-direction"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.justify-content"
                    var name = "justify-content"
                },
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.flex.align-items"
                    var name = "align-items"
                },
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.flex.align-content"
                    var name = "align-content"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex-grow"
                    var name = "flex-grow"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex-shrink"
                    var name = "flex-shrink"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex-basis"
                    var name = "flex-basis"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.flex.flex-flow"
                    var name = "flex-flow"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.background"
            var name = "background"
            var children = utsArrayOf(
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.background.background-color"
                    var name = "background-color"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.background.background-image"
                    var name = "background-image"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.position"
            var name = "position"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.position.position"
                    var name = "position"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.z-index"
            var name = "z-index"
        },
        object : UTSJSONObject() {
            var id = "overflow"
            var name = "overflow"
        },
        null,
        object : UTSJSONObject() {
            var id = "css.properties.border"
            var name = "border"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.border.border"
                    var name = "border"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-style"
                    var name = "border-style"
                },
                null,
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-width"
                    var name = "border-width"
                },
                null,
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-color"
                    var name = "border-color"
                },
                null,
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-radius"
                    var name = "border-radius"
                },
                null,
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-top"
                    var name = "border-top"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-bottom"
                    var name = "border-bottom"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-left"
                    var name = "border-left"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.border.border-right"
                    var name = "border-right"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.text"
            var name = "text"
            var children = utsArrayOf(
                object : UTSJSONObject() {
                    var id = "css.properties.text.color"
                    var name = "color"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.font-size"
                    var name = "font-size"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.font-family"
                    var name = "font-family"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.font-style"
                    var name = "font-style"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.font-weight"
                    var name = "font-weight"
                },
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.text.text-decoration-line"
                    var name = "text-decoration-line"
                },
                null,
                null,
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.text.text-align"
                    var name = "text-align"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.text-overflow"
                    var name = "text-overflow"
                },
                object : UTSJSONObject() {
                    var id = "css.properties.text.line-height"
                    var name = "line-height"
                },
                null,
                object : UTSJSONObject() {
                    var id = "css.properties.text.letter-spacing"
                    var name = "letter-spacing"
                }
            )
        },
        object : UTSJSONObject() {
            var id = "css.properties.box-shadow"
            var name = "box-shadow"
        },
        object : UTSJSONObject() {
            var id = "css.properties.transition"
            var name = "transition"
        },
        object : UTSJSONObject() {
            var id = "css.properties.transform"
            var name = "transform"
        },
        object : UTSJSONObject() {
            var id = "css.properties.pointer-events"
            var name = "pointer-events"
        },
        null,
        object : UTSJSONObject() {
            var id = "variable"
            var name = "variable"
        }
    )
});
open class Group (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    open var children: UTSArray<(Group?)>? = null,
) : UTSObject()
open class PageGroup (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var index: Number,
) : UTSObject()
open class Page (
    @JsonNotNull
    open var path: String,
    @JsonNotNull
    open var style: UTSJSONObject,
    open var group: String? = null,
) : UTSObject()
open class MenuItem (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var index: Number,
    @JsonNotNull
    open var path: String,
    @JsonNotNull
    open var style: UTSJSONObject,
    open var group: String? = null,
    @JsonNotNull
    open var items: UTSArray<MenuItem>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return MenuItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class MenuItemReactiveObject : MenuItem, IUTSReactive<MenuItem> {
    override var __v_raw: MenuItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: MenuItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, name = __v_raw.name, index = __v_raw.index, path = __v_raw.path, style = __v_raw.style, group = __v_raw.group, items = __v_raw.items) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): MenuItemReactiveObject {
        return MenuItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var index: Number
        get() {
            return trackReactiveGet(__v_raw, "index", __v_raw.index, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("index")) {
                return;
            }
            val oldValue = __v_raw.index;
            __v_raw.index = value;
            triggerReactiveSet(__v_raw, "index", oldValue, value);
        }
    override var path: String
        get() {
            return trackReactiveGet(__v_raw, "path", __v_raw.path, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("path")) {
                return;
            }
            val oldValue = __v_raw.path;
            __v_raw.path = value;
            triggerReactiveSet(__v_raw, "path", oldValue, value);
        }
    override var style: UTSJSONObject
        get() {
            return trackReactiveGet(__v_raw, "style", __v_raw.style, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("style")) {
                return;
            }
            val oldValue = __v_raw.style;
            __v_raw.style = value;
            triggerReactiveSet(__v_raw, "style", oldValue, value);
        }
    override var group: String?
        get() {
            return trackReactiveGet(__v_raw, "group", __v_raw.group, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("group")) {
                return;
            }
            val oldValue = __v_raw.group;
            __v_raw.group = value;
            triggerReactiveSet(__v_raw, "group", oldValue, value);
        }
    override var items: UTSArray<MenuItem>
        get() {
            return trackReactiveGet(__v_raw, "items", __v_raw.items, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("items")) {
                return;
            }
            val oldValue = __v_raw.items;
            __v_raw.items = value;
            triggerReactiveSet(__v_raw, "items", oldValue, value);
        }
}
val runBlock2 = run {
    subPackages.forEach(fun(subPackage){
        (subPackage["pages"] as UTSArray<UTSJSONObject>).forEach(fun(page){
            pages.push(object : UTSJSONObject() {
                var path = "" + subPackage["root"] + "/" + page["path"]
                var style = page["style"] as UTSJSONObject
                var group = page["group"]
            });
        }
        );
    }
    );
}
fun generateMenu(tabBarType: String): UTSArray<MenuItem> {
    var res: UTSArray<MenuItem> = utsArrayOf();
    val tabBarPages = JSON.parse<UTSArray<Page>>(JSON.stringify(pages))!!.filter(fun(page: Page): Boolean {
        return page.path.startsWith(tabBarType) && hasPageGroup(page.group);
    }
    );
    val groupTree = JSON.parse<UTSArray<(Group?)>>(JSON.stringify(groups));
    tabBarPages.forEach(fun(page){
        var menuItemArr: UTSArray<MenuItem> = res;
        var currentMenu: MenuItem? = null;
        val groupIndexList = page.group!!.split(",").map(fun(index: String): Number {
            return parseInt(index);
        }
        );
        var currentGroups: UTSArray<(Group?)>? = groupTree;
        val pageGroups: UTSArray<PageGroup> = utsArrayOf();
        groupIndexList.forEach(fun(groupIndex, index){
            if (index > 0) {
                pageGroups.push(PageGroup(id = currentGroups!![groupIndex]!!.id, name = currentGroups!![groupIndex]!!.name, index = groupIndex));
            }
            currentGroups = currentGroups!![groupIndex]!!.children;
        }
        );
        val lastGroup = pageGroups[pageGroups.length - 1];
        var hasPageGroup = false;
        if (page.path.endsWith(camelToDash(lastGroup.name)) && pageGroups.length > 1) {
            hasPageGroup = true;
            pageGroups.pop();
        }
        val groupLength = pageGroups.length;
        pageGroups.forEach(fun(group, groupIndex){
            val index = group.index;
            val id = group.id;
            val name = group.name;
            val validIndex = index;
            fillMenuArrayWithEmptyMenuItem(menuItemArr, validIndex);
            if (menuItemArr[validIndex].name == "empty") {
                menuItemArr[validIndex] = MenuItem(id = id.split(".").slice(-1)[0], name = name, index = validIndex, path = "", style = UTSJSONObject(), group = "", items = utsArrayOf<MenuItem>());
            }
            currentMenu = menuItemArr[validIndex];
            if (groupIndex < groupLength - 1) {
                menuItemArr = menuItemArr[validIndex].items;
            }
        }
        );
        val pageMenuItem = MenuItem(id = page.path, name = page.style["navigationBarTitleText"] as String, index = lastGroup.index, path = page.path, style = page.style, group = page.group, items = utsArrayOf<MenuItem>());
        if (hasPageGroup) {
            val pageIndex = lastGroup.index;
            fillMenuArrayWithEmptyMenuItem(currentMenu!!.items, pageIndex);
            if (currentMenu!!.items[pageIndex].name == "empty") {
                currentMenu!!.items[pageIndex] = pageMenuItem;
            } else {
                currentMenu!!.items.push(pageMenuItem);
            }
        } else {
            currentMenu!!.items.push(pageMenuItem);
        }
    }
    );
    return removeEmptyItem(res);
}
fun hasPageGroup(value: String?): Boolean {
    return value != null;
}
fun camelToDash(camelStr: String): String {
    return camelStr.replace(UTSRegExp("([A-Z])", "g"), "-\$1").toLowerCase();
}
fun fillMenuArrayWithEmptyMenuItem(arr: UTSArray<MenuItem>, index: Number): Unit {
    val len = arr.length;
    run {
        var i: Number = 0;
        while(i <= index - (len - 1)){
            arr.push(MenuItem(id = "", name = "empty", index = i, path = "", style = UTSJSONObject(), group = "", items = utsArrayOf<MenuItem>()));
            i++;
        }
    }
}
fun removeEmptyItem(arr: UTSArray<MenuItem>): UTSArray<MenuItem> {
    val res = arr.filter(fun(item: MenuItem): Boolean {
        return item.name !== "empty";
    }
    );
    res.forEach(fun(menuItem){
        addSetTabBarPage(menuItem);
        menuItem.items = removeEmptyItem(menuItem.items);
    }
    );
    return res;
}
fun addSetTabBarPage(menuItem: MenuItem) {
    val id = menuItem.id;
    val name = menuItem.name;
    if (id == "page" && name == "页面和路由") {
        menuItem.items.push(MenuItem(id = "set-tab-bar", name = "设置 TabBar", index = 0, path = "set-tab-bar", style = object : UTSJSONObject() {
            var navigationBarTitleText = "设置 TabBar"
        }, group = null, items = utsArrayOf()));
    }
}
open class StoreListItem (
    @JsonNotNull
    open var enable: Boolean = false,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var scheme: String,
    @JsonNotNull
    open var priority: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return StoreListItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class StoreListItemReactiveObject : StoreListItem, IUTSReactive<StoreListItem> {
    override var __v_raw: StoreListItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: StoreListItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(enable = __v_raw.enable, id = __v_raw.id, name = __v_raw.name, scheme = __v_raw.scheme, priority = __v_raw.priority) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): StoreListItemReactiveObject {
        return StoreListItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var enable: Boolean
        get() {
            return trackReactiveGet(__v_raw, "enable", __v_raw.enable, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("enable")) {
                return;
            }
            val oldValue = __v_raw.enable;
            __v_raw.enable = value;
            triggerReactiveSet(__v_raw, "enable", oldValue, value);
        }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var scheme: String
        get() {
            return trackReactiveGet(__v_raw, "scheme", __v_raw.scheme, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("scheme")) {
                return;
            }
            val oldValue = __v_raw.scheme;
            __v_raw.scheme = value;
            triggerReactiveSet(__v_raw, "scheme", oldValue, value);
        }
    override var priority: Number
        get() {
            return trackReactiveGet(__v_raw, "priority", __v_raw.priority, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("priority")) {
                return;
            }
            val oldValue = __v_raw.priority;
            __v_raw.priority = value;
            triggerReactiveSet(__v_raw, "priority", oldValue, value);
        }
}
open class UniUpgradeCenterResult (
    @JsonNotNull
    open var _id: String,
    @JsonNotNull
    open var appid: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var title: String,
    @JsonNotNull
    open var contents: String,
    @JsonNotNull
    open var url: String,
    @JsonNotNull
    open var platform: UTSArray<String>,
    @JsonNotNull
    open var version: String,
    @JsonNotNull
    open var uni_platform: String,
    @JsonNotNull
    open var stable_publish: Boolean = false,
    @JsonNotNull
    open var is_mandatory: Boolean = false,
    open var is_silently: Boolean? = null,
    @JsonNotNull
    open var create_env: String,
    @JsonNotNull
    open var create_date: Number,
    @JsonNotNull
    open var message: String,
    @JsonNotNull
    open var code: Number,
    @JsonNotNull
    open var type: String,
    open var store_list: UTSArray<StoreListItem>? = null,
    open var min_uni_version: String? = null,
) : UTSObject()
fun `default`(): UTSPromise<UniUpgradeCenterResult> {
    return UTSPromise<UniUpgradeCenterResult>(fun(resolve, reject){
        val systemInfo = uni_getSystemInfoSync();
        val appId = systemInfo.appId;
        val appVersion = systemInfo.appVersion;
        if (UTSAndroid.`typeof`( appId) === "string" && UTSAndroid.`typeof`( appVersion) === "string" && appId.length > 0 && appVersion.length > 0) {
            var data: UTSJSONObject = UTSJSONObject(Map<String, Any?>(utsArrayOf(
                utsArrayOf(
                    "action",
                    "checkVersion"
                ),
                utsArrayOf(
                    "appid",
                    appId
                ),
                utsArrayOf(
                    "appVersion",
                    appVersion
                ),
                utsArrayOf(
                    "is_uniapp_x",
                    true
                ),
                utsArrayOf(
                    "wgtVersion",
                    "0.0.0.0.0.1"
                )
            )));
            try {
                uniCloud.callFunction(UniCloudCallFunctionOptions(name = "uni-upgrade-center", data = data)).then(fun(res){
                    val code = res.result["code"];
                    val codeIsNumber = utsArrayOf(
                        "Int",
                        "Long",
                        "number"
                    ).includes(UTSAndroid.`typeof`( code));
                    if (codeIsNumber) {
                        if ((code as Number) == 0) {
                            reject(object : UTSJSONObject() {
                                var code = res.result["code"]
                                var message = res.result["message"]
                            });
                        } else if ((code as Number) < 0) {
                            reject(object : UTSJSONObject() {
                                var code = res.result["code"]
                                var message = res.result["message"]
                            });
                        } else {
                            val result = JSON.parse<UniUpgradeCenterResult>(JSON.stringify(res.result)) as UniUpgradeCenterResult;
                            resolve(result);
                        }
                    }
                }).`catch`<Unit>(fun(err: Any?){
                    val error = err as UniCloudError;
                    if (error.errMsg == "未匹配到云函数[uni-upgrade-center]") {
                        error.errMsg = "【uni-upgrade-center-app】未配置uni-upgrade-center，无法升级。参考: https://uniapp.dcloud.net.cn/uniCloud/upgrade-center.html";
                    }
                    reject(error.errMsg);
                });
            } catch (e: Throwable) {
                reject(e.message);
            }
        } else {
            reject("invalid appid or appVersion");
        }
    }
    );
}
val platform_iOS: String = "iOS";
val platform_Android: String = "Android";
val PACKAGE_INFO_KEY = "__package_info__";
fun default1(): UTSPromise<UniUpgradeCenterResult> {
    return UTSPromise<UniUpgradeCenterResult>(fun(resolve, reject){
        `default`().then(fun(uniUpgradeCenterResult): UTSPromise<Unit> {
            return wrapUTSPromise(suspend w@{
                    val code = uniUpgradeCenterResult.code;
                    val message = uniUpgradeCenterResult.message;
                    val url = uniUpgradeCenterResult.url;
                    if (code > 0) {
                        val tcbRes = await(uniCloud.getTempFileURL(UniCloudGetTempFileURLOptions(fileList = utsArrayOf(
                            url
                        ))));
                        if (UTSAndroid.`typeof`( tcbRes.fileList[0].tempFileURL) !== "undefined") {
                            uniUpgradeCenterResult.url = tcbRes.fileList[0].tempFileURL;
                        }
                        uni_setStorageSync(PACKAGE_INFO_KEY, uniUpgradeCenterResult);
                        uni_openDialogPage(OpenDialogPageOptions(url = "/uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup?local_storage_key=" + PACKAGE_INFO_KEY, disableEscBack = true, fail = fun(err){
                            console.error("更新弹框跳转失败", err);
                            uni_removeStorageSync(PACKAGE_INFO_KEY);
                        }));
                        return@w resolve(uniUpgradeCenterResult);
                    } else if (code < 0) {
                        console.error(message);
                        return@w reject(uniUpgradeCenterResult);
                    }
                    return@w resolve(uniUpgradeCenterResult);
            });
        }
        ).`catch`(fun(err){
            reject(err);
        }
        );
    }
    );
}
val GenComponentsULinkULinkClass = CreateVueComponent(GenComponentsULinkULink::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsULinkULink.name, inheritAttrs = GenComponentsULinkULink.inheritAttrs, inject = GenComponentsULinkULink.inject, props = GenComponentsULinkULink.props, propsNeedCastKeys = GenComponentsULinkULink.propsNeedCastKeys, emits = GenComponentsULinkULink.emits, components = GenComponentsULinkULink.components, styles = GenComponentsULinkULink.styles);
}
, fun(instance): GenComponentsULinkULink {
    return GenComponentsULinkULink(instance);
}
);
fun `$dispatch`(context: ComponentPublicInstance, componentName: String, eventName: String, vararg spreadParams: Any) {
    var params = UTSArray(*spreadParams);
    var parent = context.`$parent`;
    var name = parent?.`$options`?.name;
    while(parent != null && (name == null || componentName != name)){
        parent = parent.`$parent`;
        if (parent != null) {
            name = parent.`$options`.name;
        }
    }
    if (parent != null) {
        parent.`$callMethod`(eventName, *params.toTypedArray());
    }
}
val GenComponentsUniCollapseItemUniCollapseItemClass = CreateVueComponent(GenComponentsUniCollapseItemUniCollapseItem::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsUniCollapseItemUniCollapseItem.name, inheritAttrs = GenComponentsUniCollapseItemUniCollapseItem.inheritAttrs, inject = GenComponentsUniCollapseItemUniCollapseItem.inject, props = GenComponentsUniCollapseItemUniCollapseItem.props, propsNeedCastKeys = GenComponentsUniCollapseItemUniCollapseItem.propsNeedCastKeys, emits = GenComponentsUniCollapseItemUniCollapseItem.emits, components = GenComponentsUniCollapseItemUniCollapseItem.components, styles = GenComponentsUniCollapseItemUniCollapseItem.styles);
}
, fun(instance): GenComponentsUniCollapseItemUniCollapseItem {
    return GenComponentsUniCollapseItemUniCollapseItem(instance);
}
);
val GenComponentsUniCollapseUniCollapseClass = CreateVueComponent(GenComponentsUniCollapseUniCollapse::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsUniCollapseUniCollapse.name, inheritAttrs = GenComponentsUniCollapseUniCollapse.inheritAttrs, inject = GenComponentsUniCollapseUniCollapse.inject, props = GenComponentsUniCollapseUniCollapse.props, propsNeedCastKeys = GenComponentsUniCollapseUniCollapse.propsNeedCastKeys, emits = GenComponentsUniCollapseUniCollapse.emits, components = GenComponentsUniCollapseUniCollapse.components, styles = GenComponentsUniCollapseUniCollapse.styles);
}
, fun(instance): GenComponentsUniCollapseUniCollapse {
    return GenComponentsUniCollapseUniCollapse(instance);
}
);
val menu = generateMenu("pages/component");
val GenPagesTabBarComponentClass = CreateVueComponent(GenPagesTabBarComponent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTabBarComponent.inheritAttrs, inject = GenPagesTabBarComponent.inject, props = GenPagesTabBarComponent.props, propsNeedCastKeys = GenPagesTabBarComponent.propsNeedCastKeys, emits = GenPagesTabBarComponent.emits, components = GenPagesTabBarComponent.components, styles = GenPagesTabBarComponent.styles);
}
, fun(instance): GenPagesTabBarComponent {
    return GenPagesTabBarComponent(instance);
}
);
open class ItemType (
    @JsonNotNull
    open var value: Number,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemTypeReactiveObject : ItemType, IUTSReactive<ItemType> {
    override var __v_raw: ItemType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemTypeReactiveObject {
        return ItemTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: Number
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenComponentsPageHeadPageHeadClass = CreateVueComponent(GenComponentsPageHeadPageHead::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsPageHeadPageHead.name, inheritAttrs = GenComponentsPageHeadPageHead.inheritAttrs, inject = GenComponentsPageHeadPageHead.inject, props = GenComponentsPageHeadPageHead.props, propsNeedCastKeys = GenComponentsPageHeadPageHead.propsNeedCastKeys, emits = GenComponentsPageHeadPageHead.emits, components = GenComponentsPageHeadPageHead.components, styles = GenComponentsPageHeadPageHead.styles);
}
, fun(instance): GenComponentsPageHeadPageHead {
    return GenComponentsPageHeadPageHead(instance);
}
);
val GenComponentsBooleanDataBooleanDataClass = CreateVueComponent(GenComponentsBooleanDataBooleanData::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsBooleanDataBooleanData.inheritAttrs, inject = GenComponentsBooleanDataBooleanData.inject, props = GenComponentsBooleanDataBooleanData.props, propsNeedCastKeys = GenComponentsBooleanDataBooleanData.propsNeedCastKeys, emits = GenComponentsBooleanDataBooleanData.emits, components = GenComponentsBooleanDataBooleanData.components, styles = GenComponentsBooleanDataBooleanData.styles);
}
, fun(instance): GenComponentsBooleanDataBooleanData {
    return GenComponentsBooleanDataBooleanData(instance);
}
);
val GenComponentsEnumDataEnumDataClass = CreateVueComponent(GenComponentsEnumDataEnumData::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsEnumDataEnumData.inheritAttrs, inject = GenComponentsEnumDataEnumData.inject, props = GenComponentsEnumDataEnumData.props, propsNeedCastKeys = GenComponentsEnumDataEnumData.propsNeedCastKeys, emits = GenComponentsEnumDataEnumData.emits, components = GenComponentsEnumDataEnumData.components, styles = GenComponentsEnumDataEnumData.styles);
}
, fun(instance): GenComponentsEnumDataEnumData {
    return GenComponentsEnumDataEnumData(instance);
}
);
val GenPagesComponentViewViewClass = CreateVueComponent(GenPagesComponentViewView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentViewView.inheritAttrs, inject = GenPagesComponentViewView.inject, props = GenPagesComponentViewView.props, propsNeedCastKeys = GenPagesComponentViewView.propsNeedCastKeys, emits = GenPagesComponentViewView.emits, components = GenPagesComponentViewView.components, styles = GenPagesComponentViewView.styles);
}
, fun(instance): GenPagesComponentViewView {
    return GenPagesComponentViewView(instance);
}
);
open class ScrollEventTest (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
    open var direction: String? = null,
) : UTSObject()
val GenPagesComponentScrollViewScrollViewClass = CreateVueComponent(GenPagesComponentScrollViewScrollView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentScrollViewScrollView.inheritAttrs, inject = GenPagesComponentScrollViewScrollView.inject, props = GenPagesComponentScrollViewScrollView.props, propsNeedCastKeys = GenPagesComponentScrollViewScrollView.propsNeedCastKeys, emits = GenPagesComponentScrollViewScrollView.emits, components = GenPagesComponentScrollViewScrollView.components, styles = GenPagesComponentScrollViewScrollView.styles);
}
, fun(instance): GenPagesComponentScrollViewScrollView {
    return GenPagesComponentScrollViewScrollView(instance);
}
);
open class RefresherEventTest (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
    @JsonNotNull
    open var dy: Number,
) : UTSObject()
val GenPagesComponentScrollViewScrollViewRefresherClass = CreateVueComponent(GenPagesComponentScrollViewScrollViewRefresher::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentScrollViewScrollViewRefresher.inheritAttrs, inject = GenPagesComponentScrollViewScrollViewRefresher.inject, props = GenPagesComponentScrollViewScrollViewRefresher.props, propsNeedCastKeys = GenPagesComponentScrollViewScrollViewRefresher.propsNeedCastKeys, emits = GenPagesComponentScrollViewScrollViewRefresher.emits, components = GenPagesComponentScrollViewScrollViewRefresher.components, styles = GenPagesComponentScrollViewScrollViewRefresher.styles);
}
, fun(instance): GenPagesComponentScrollViewScrollViewRefresher {
    return GenPagesComponentScrollViewScrollViewRefresher(instance);
}
);
open class Item (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var label: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemReactiveObject : Item, IUTSReactive<Item> {
    override var __v_raw: Item;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, label = __v_raw.label) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemReactiveObject {
        return ItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
}
val GenPagesComponentScrollViewScrollViewPropsClass = CreateVueComponent(GenPagesComponentScrollViewScrollViewProps::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentScrollViewScrollViewProps.inheritAttrs, inject = GenPagesComponentScrollViewScrollViewProps.inject, props = GenPagesComponentScrollViewScrollViewProps.props, propsNeedCastKeys = GenPagesComponentScrollViewScrollViewProps.propsNeedCastKeys, emits = GenPagesComponentScrollViewScrollViewProps.emits, components = GenPagesComponentScrollViewScrollViewProps.components, styles = GenPagesComponentScrollViewScrollViewProps.styles);
}
, fun(instance): GenPagesComponentScrollViewScrollViewProps {
    return GenPagesComponentScrollViewScrollViewProps(instance);
}
);
open class Item1 (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var label: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item1ReactiveObject : Item1, IUTSReactive<Item1> {
    override var __v_raw: Item1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, label = __v_raw.label) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item1ReactiveObject {
        return Item1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
}
val GenPagesComponentScrollViewScrollViewRefresherPropsClass = CreateVueComponent(GenPagesComponentScrollViewScrollViewRefresherProps::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentScrollViewScrollViewRefresherProps.inheritAttrs, inject = GenPagesComponentScrollViewScrollViewRefresherProps.inject, props = GenPagesComponentScrollViewScrollViewRefresherProps.props, propsNeedCastKeys = GenPagesComponentScrollViewScrollViewRefresherProps.propsNeedCastKeys, emits = GenPagesComponentScrollViewScrollViewRefresherProps.emits, components = GenPagesComponentScrollViewScrollViewRefresherProps.components, styles = GenPagesComponentScrollViewScrollViewRefresherProps.styles);
}
, fun(instance): GenPagesComponentScrollViewScrollViewRefresherProps {
    return GenPagesComponentScrollViewScrollViewRefresherProps(instance);
}
);
val GenPagesComponentScrollViewRefreshBoxRefreshBoxClass = CreateVueComponent(GenPagesComponentScrollViewRefreshBoxRefreshBox::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesComponentScrollViewRefreshBoxRefreshBox.inheritAttrs, inject = GenPagesComponentScrollViewRefreshBoxRefreshBox.inject, props = GenPagesComponentScrollViewRefreshBoxRefreshBox.props, propsNeedCastKeys = GenPagesComponentScrollViewRefreshBoxRefreshBox.propsNeedCastKeys, emits = GenPagesComponentScrollViewRefreshBoxRefreshBox.emits, components = GenPagesComponentScrollViewRefreshBoxRefreshBox.components, styles = GenPagesComponentScrollViewRefreshBoxRefreshBox.styles);
}
, fun(instance): GenPagesComponentScrollViewRefreshBoxRefreshBox {
    return GenPagesComponentScrollViewRefreshBoxRefreshBox(instance);
}
);
val GenPagesComponentScrollViewScrollViewCustomRefresherPropsClass = CreateVueComponent(GenPagesComponentScrollViewScrollViewCustomRefresherProps::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentScrollViewScrollViewCustomRefresherProps.inheritAttrs, inject = GenPagesComponentScrollViewScrollViewCustomRefresherProps.inject, props = GenPagesComponentScrollViewScrollViewCustomRefresherProps.props, propsNeedCastKeys = GenPagesComponentScrollViewScrollViewCustomRefresherProps.propsNeedCastKeys, emits = GenPagesComponentScrollViewScrollViewCustomRefresherProps.emits, components = GenPagesComponentScrollViewScrollViewCustomRefresherProps.components, styles = GenPagesComponentScrollViewScrollViewCustomRefresherProps.styles);
}
, fun(instance): GenPagesComponentScrollViewScrollViewCustomRefresherProps {
    return GenPagesComponentScrollViewScrollViewCustomRefresherProps(instance);
}
);
open class SwiperEventTest (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
) : UTSObject()
val GenPagesComponentSwiperSwiperClass = CreateVueComponent(GenPagesComponentSwiperSwiper::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSwiperSwiper.inheritAttrs, inject = GenPagesComponentSwiperSwiper.inject, props = GenPagesComponentSwiperSwiper.props, propsNeedCastKeys = GenPagesComponentSwiperSwiper.propsNeedCastKeys, emits = GenPagesComponentSwiperSwiper.emits, components = GenPagesComponentSwiperSwiper.components, styles = GenPagesComponentSwiperSwiper.styles);
}
, fun(instance): GenPagesComponentSwiperSwiper {
    return GenPagesComponentSwiperSwiper(instance);
}
);
val GenComponentsInputDataInputDataClass = CreateVueComponent(GenComponentsInputDataInputData::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsInputDataInputData.name, inheritAttrs = GenComponentsInputDataInputData.inheritAttrs, inject = GenComponentsInputDataInputData.inject, props = GenComponentsInputDataInputData.props, propsNeedCastKeys = GenComponentsInputDataInputData.propsNeedCastKeys, emits = GenComponentsInputDataInputData.emits, components = GenComponentsInputDataInputData.components, styles = GenComponentsInputDataInputData.styles);
}
, fun(instance): GenComponentsInputDataInputData {
    return GenComponentsInputDataInputData(instance);
}
);
open class ScrollEventTest1 (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
    open var direction: String? = null,
) : UTSObject()
val GenPagesComponentListViewListViewClass = CreateVueComponent(GenPagesComponentListViewListView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListView.inheritAttrs, inject = GenPagesComponentListViewListView.inject, props = GenPagesComponentListViewListView.props, propsNeedCastKeys = GenPagesComponentListViewListView.propsNeedCastKeys, emits = GenPagesComponentListViewListView.emits, components = GenPagesComponentListViewListView.components, styles = GenPagesComponentListViewListView.styles);
}
, fun(instance): GenPagesComponentListViewListView {
    return GenPagesComponentListViewListView(instance);
}
);
open class RefresherEventTest1 (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
    @JsonNotNull
    open var dy: Number,
) : UTSObject()
val GenPagesComponentListViewListViewRefreshClass = CreateVueComponent(GenPagesComponentListViewListViewRefresh::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListViewRefresh.inheritAttrs, inject = GenPagesComponentListViewListViewRefresh.inject, props = GenPagesComponentListViewListViewRefresh.props, propsNeedCastKeys = GenPagesComponentListViewListViewRefresh.propsNeedCastKeys, emits = GenPagesComponentListViewListViewRefresh.emits, components = GenPagesComponentListViewListViewRefresh.components, styles = GenPagesComponentListViewListViewRefresh.styles);
}
, fun(instance): GenPagesComponentListViewListViewRefresh {
    return GenPagesComponentListViewListViewRefresh(instance);
}
);
val GenPagesComponentListViewListViewMultiplexClass = CreateVueComponent(GenPagesComponentListViewListViewMultiplex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListViewMultiplex.inheritAttrs, inject = GenPagesComponentListViewListViewMultiplex.inject, props = GenPagesComponentListViewListViewMultiplex.props, propsNeedCastKeys = GenPagesComponentListViewListViewMultiplex.propsNeedCastKeys, emits = GenPagesComponentListViewListViewMultiplex.emits, components = GenPagesComponentListViewListViewMultiplex.components, styles = GenPagesComponentListViewListViewMultiplex.styles);
}
, fun(instance): GenPagesComponentListViewListViewMultiplex {
    return GenPagesComponentListViewListViewMultiplex(instance);
}
);
val GenPagesComponentListViewListViewMultiplexInputClass = CreateVueComponent(GenPagesComponentListViewListViewMultiplexInput::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListViewMultiplexInput.inheritAttrs, inject = GenPagesComponentListViewListViewMultiplexInput.inject, props = GenPagesComponentListViewListViewMultiplexInput.props, propsNeedCastKeys = GenPagesComponentListViewListViewMultiplexInput.propsNeedCastKeys, emits = GenPagesComponentListViewListViewMultiplexInput.emits, components = GenPagesComponentListViewListViewMultiplexInput.components, styles = GenPagesComponentListViewListViewMultiplexInput.styles);
}
, fun(instance): GenPagesComponentListViewListViewMultiplexInput {
    return GenPagesComponentListViewListViewMultiplexInput(instance);
}
);
val GenPagesComponentListViewListViewMultiplexVideoClass = CreateVueComponent(GenPagesComponentListViewListViewMultiplexVideo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListViewMultiplexVideo.inheritAttrs, inject = GenPagesComponentListViewListViewMultiplexVideo.inject, props = GenPagesComponentListViewListViewMultiplexVideo.props, propsNeedCastKeys = GenPagesComponentListViewListViewMultiplexVideo.propsNeedCastKeys, emits = GenPagesComponentListViewListViewMultiplexVideo.emits, components = GenPagesComponentListViewListViewMultiplexVideo.components, styles = GenPagesComponentListViewListViewMultiplexVideo.styles);
}
, fun(instance): GenPagesComponentListViewListViewMultiplexVideo {
    return GenPagesComponentListViewListViewMultiplexVideo(instance);
}
);
val GenPagesComponentListViewListViewWrapperClass = CreateVueComponent(GenPagesComponentListViewListViewWrapper::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesComponentListViewListViewWrapper.inheritAttrs, inject = GenPagesComponentListViewListViewWrapper.inject, props = GenPagesComponentListViewListViewWrapper.props, propsNeedCastKeys = GenPagesComponentListViewListViewWrapper.propsNeedCastKeys, emits = GenPagesComponentListViewListViewWrapper.emits, components = GenPagesComponentListViewListViewWrapper.components, styles = GenPagesComponentListViewListViewWrapper.styles);
}
, fun(instance): GenPagesComponentListViewListViewWrapper {
    return GenPagesComponentListViewListViewWrapper(instance);
}
);
val GenPagesComponentListViewListViewChildrenInSlotClass = CreateVueComponent(GenPagesComponentListViewListViewChildrenInSlot::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewListViewChildrenInSlot.inheritAttrs, inject = GenPagesComponentListViewListViewChildrenInSlot.inject, props = GenPagesComponentListViewListViewChildrenInSlot.props, propsNeedCastKeys = GenPagesComponentListViewListViewChildrenInSlot.propsNeedCastKeys, emits = GenPagesComponentListViewListViewChildrenInSlot.emits, components = GenPagesComponentListViewListViewChildrenInSlot.components, styles = GenPagesComponentListViewListViewChildrenInSlot.styles);
}
, fun(instance): GenPagesComponentListViewListViewChildrenInSlot {
    return GenPagesComponentListViewListViewChildrenInSlot(instance);
}
);
open class sectionData (
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var list: UTSArray<sectionListItem>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return sectionDataReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class sectionDataReactiveObject : sectionData, IUTSReactive<sectionData> {
    override var __v_raw: sectionData;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: sectionData, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(name = __v_raw.name, list = __v_raw.list) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): sectionDataReactiveObject {
        return sectionDataReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var list: UTSArray<sectionListItem>
        get() {
            return trackReactiveGet(__v_raw, "list", __v_raw.list, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("list")) {
                return;
            }
            val oldValue = __v_raw.list;
            __v_raw.list = value;
            triggerReactiveSet(__v_raw, "list", oldValue, value);
        }
}
open class sectionListItem (
    @JsonNotNull
    open var text: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return sectionListItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class sectionListItemReactiveObject : sectionListItem, IUTSReactive<sectionListItem> {
    override var __v_raw: sectionListItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: sectionListItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(text = __v_raw.text) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): sectionListItemReactiveObject {
        return sectionListItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var text: String
        get() {
            return trackReactiveGet(__v_raw, "text", __v_raw.text, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("text")) {
                return;
            }
            val oldValue = __v_raw.text;
            __v_raw.text = value;
            triggerReactiveSet(__v_raw, "text", oldValue, value);
        }
}
val GenPagesComponentStickySectionStickySectionClass = CreateVueComponent(GenPagesComponentStickySectionStickySection::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentStickySectionStickySection.inheritAttrs, inject = GenPagesComponentStickySectionStickySection.inject, props = GenPagesComponentStickySectionStickySection.props, propsNeedCastKeys = GenPagesComponentStickySectionStickySection.propsNeedCastKeys, emits = GenPagesComponentStickySectionStickySection.emits, components = GenPagesComponentStickySectionStickySection.components, styles = GenPagesComponentStickySectionStickySection.styles);
}
, fun(instance): GenPagesComponentStickySectionStickySection {
    return GenPagesComponentStickySectionStickySection(instance);
}
);
val GenPagesComponentStickyHeaderStickyHeaderClass = CreateVueComponent(GenPagesComponentStickyHeaderStickyHeader::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentStickyHeaderStickyHeader.inheritAttrs, inject = GenPagesComponentStickyHeaderStickyHeader.inject, props = GenPagesComponentStickyHeaderStickyHeader.props, propsNeedCastKeys = GenPagesComponentStickyHeaderStickyHeader.propsNeedCastKeys, emits = GenPagesComponentStickyHeaderStickyHeader.emits, components = GenPagesComponentStickyHeaderStickyHeader.components, styles = GenPagesComponentStickyHeaderStickyHeader.styles);
}
, fun(instance): GenPagesComponentStickyHeaderStickyHeader {
    return GenPagesComponentStickyHeaderStickyHeader(instance);
}
);
val GenPagesComponentTextTextClass = CreateVueComponent(GenPagesComponentTextText::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentTextText.inheritAttrs, inject = GenPagesComponentTextText.inject, props = GenPagesComponentTextText.props, propsNeedCastKeys = GenPagesComponentTextText.propsNeedCastKeys, emits = GenPagesComponentTextText.emits, components = GenPagesComponentTextText.components, styles = GenPagesComponentTextText.styles);
}
, fun(instance): GenPagesComponentTextText {
    return GenPagesComponentTextText(instance);
}
);
val GenPagesComponentTextTextPropsClass = CreateVueComponent(GenPagesComponentTextTextProps::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentTextTextProps.inheritAttrs, inject = GenPagesComponentTextTextProps.inject, props = GenPagesComponentTextTextProps.props, propsNeedCastKeys = GenPagesComponentTextTextProps.propsNeedCastKeys, emits = GenPagesComponentTextTextProps.emits, components = GenPagesComponentTextTextProps.components, styles = GenPagesComponentTextTextProps.styles);
}
, fun(instance): GenPagesComponentTextTextProps {
    return GenPagesComponentTextTextProps(instance);
}
);
val GenPagesComponentRichTextRichTextClass = CreateVueComponent(GenPagesComponentRichTextRichText::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentRichTextRichText.inheritAttrs, inject = GenPagesComponentRichTextRichText.inject, props = GenPagesComponentRichTextRichText.props, propsNeedCastKeys = GenPagesComponentRichTextRichText.propsNeedCastKeys, emits = GenPagesComponentRichTextRichText.emits, components = GenPagesComponentRichTextRichText.components, styles = GenPagesComponentRichTextRichText.styles);
}
, fun(instance): GenPagesComponentRichTextRichText {
    return GenPagesComponentRichTextRichText(instance);
}
);
val GenPagesComponentRichTextRichTextTagsClass = CreateVueComponent(GenPagesComponentRichTextRichTextTags::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentRichTextRichTextTags.inheritAttrs, inject = GenPagesComponentRichTextRichTextTags.inject, props = GenPagesComponentRichTextRichTextTags.props, propsNeedCastKeys = GenPagesComponentRichTextRichTextTags.propsNeedCastKeys, emits = GenPagesComponentRichTextRichTextTags.emits, components = GenPagesComponentRichTextRichTextTags.components, styles = GenPagesComponentRichTextRichTextTags.styles);
}
, fun(instance): GenPagesComponentRichTextRichTextTags {
    return GenPagesComponentRichTextRichTextTags(instance);
}
);
open class TagInfo (
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var html: UTSArray<UTSJSONObject>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return TagInfoReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class TagInfoReactiveObject : TagInfo, IUTSReactive<TagInfo> {
    override var __v_raw: TagInfo;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: TagInfo, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(name = __v_raw.name, html = __v_raw.html) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): TagInfoReactiveObject {
        return TagInfoReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var html: UTSArray<UTSJSONObject>
        get() {
            return trackReactiveGet(__v_raw, "html", __v_raw.html, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("html")) {
                return;
            }
            val oldValue = __v_raw.html;
            __v_raw.html = value;
            triggerReactiveSet(__v_raw, "html", oldValue, value);
        }
}
val GenPagesComponentRichTextRichTextComplexClass = CreateVueComponent(GenPagesComponentRichTextRichTextComplex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentRichTextRichTextComplex.inheritAttrs, inject = GenPagesComponentRichTextRichTextComplex.inject, props = GenPagesComponentRichTextRichTextComplex.props, propsNeedCastKeys = GenPagesComponentRichTextRichTextComplex.propsNeedCastKeys, emits = GenPagesComponentRichTextRichTextComplex.emits, components = GenPagesComponentRichTextRichTextComplex.components, styles = GenPagesComponentRichTextRichTextComplex.styles);
}
, fun(instance): GenPagesComponentRichTextRichTextComplex {
    return GenPagesComponentRichTextRichTextComplex(instance);
}
);
val GenPagesComponentProgressProgressClass = CreateVueComponent(GenPagesComponentProgressProgress::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentProgressProgress.inheritAttrs, inject = GenPagesComponentProgressProgress.inject, props = GenPagesComponentProgressProgress.props, propsNeedCastKeys = GenPagesComponentProgressProgress.propsNeedCastKeys, emits = GenPagesComponentProgressProgress.emits, components = GenPagesComponentProgressProgress.components, styles = GenPagesComponentProgressProgress.styles);
}
, fun(instance): GenPagesComponentProgressProgress {
    return GenPagesComponentProgressProgress(instance);
}
);
val GenPagesComponentFormFormClass = CreateVueComponent(GenPagesComponentFormForm::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentFormForm.inheritAttrs, inject = GenPagesComponentFormForm.inject, props = GenPagesComponentFormForm.props, propsNeedCastKeys = GenPagesComponentFormForm.propsNeedCastKeys, emits = GenPagesComponentFormForm.emits, components = GenPagesComponentFormForm.components, styles = GenPagesComponentFormForm.styles);
}
, fun(instance): GenPagesComponentFormForm {
    return GenPagesComponentFormForm(instance);
}
);
val GenPagesComponentButtonButtonClass = CreateVueComponent(GenPagesComponentButtonButton::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentButtonButton.inheritAttrs, inject = GenPagesComponentButtonButton.inject, props = GenPagesComponentButtonButton.props, propsNeedCastKeys = GenPagesComponentButtonButton.propsNeedCastKeys, emits = GenPagesComponentButtonButton.emits, components = GenPagesComponentButtonButton.components, styles = GenPagesComponentButtonButton.styles);
}
, fun(instance): GenPagesComponentButtonButton {
    return GenPagesComponentButtonButton(instance);
}
);
val GenPagesComponentButtonButtonstatusClass = CreateVueComponent(GenPagesComponentButtonButtonstatus::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentButtonButtonstatus.inheritAttrs, inject = GenPagesComponentButtonButtonstatus.inject, props = GenPagesComponentButtonButtonstatus.props, propsNeedCastKeys = GenPagesComponentButtonButtonstatus.propsNeedCastKeys, emits = GenPagesComponentButtonButtonstatus.emits, components = GenPagesComponentButtonButtonstatus.components, styles = GenPagesComponentButtonButtonstatus.styles);
}
, fun(instance): GenPagesComponentButtonButtonstatus {
    return GenPagesComponentButtonButtonstatus(instance);
}
);
open class ItemType1 (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType1ReactiveObject : ItemType1, IUTSReactive<ItemType1> {
    override var __v_raw: ItemType1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType1ReactiveObject {
        return ItemType1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesComponentRadioRadioClass = CreateVueComponent(GenPagesComponentRadioRadio::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentRadioRadio.inheritAttrs, inject = GenPagesComponentRadioRadio.inject, props = GenPagesComponentRadioRadio.props, propsNeedCastKeys = GenPagesComponentRadioRadio.propsNeedCastKeys, emits = GenPagesComponentRadioRadio.emits, components = GenPagesComponentRadioRadio.components, styles = GenPagesComponentRadioRadio.styles);
}
, fun(instance): GenPagesComponentRadioRadio {
    return GenPagesComponentRadioRadio(instance);
}
);
open class ItemType2 (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var checked: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType2ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType2ReactiveObject : ItemType2, IUTSReactive<ItemType2> {
    override var __v_raw: ItemType2;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType2, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name, checked = __v_raw.checked) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType2ReactiveObject {
        return ItemType2ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var checked: Boolean
        get() {
            return trackReactiveGet(__v_raw, "checked", __v_raw.checked, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("checked")) {
                return;
            }
            val oldValue = __v_raw.checked;
            __v_raw.checked = value;
            triggerReactiveSet(__v_raw, "checked", oldValue, value);
        }
}
val GenPagesComponentCheckboxCheckboxClass = CreateVueComponent(GenPagesComponentCheckboxCheckbox::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentCheckboxCheckbox.inheritAttrs, inject = GenPagesComponentCheckboxCheckbox.inject, props = GenPagesComponentCheckboxCheckbox.props, propsNeedCastKeys = GenPagesComponentCheckboxCheckbox.propsNeedCastKeys, emits = GenPagesComponentCheckboxCheckbox.emits, components = GenPagesComponentCheckboxCheckbox.components, styles = GenPagesComponentCheckboxCheckbox.styles);
}
, fun(instance): GenPagesComponentCheckboxCheckbox {
    return GenPagesComponentCheckboxCheckbox(instance);
}
);
val GenPagesComponentInputInputClass = CreateVueComponent(GenPagesComponentInputInput::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentInputInput.inheritAttrs, inject = GenPagesComponentInputInput.inject, props = GenPagesComponentInputInput.props, propsNeedCastKeys = GenPagesComponentInputInput.propsNeedCastKeys, emits = GenPagesComponentInputInput.emits, components = GenPagesComponentInputInput.components, styles = GenPagesComponentInputInput.styles);
}
, fun(instance): GenPagesComponentInputInput {
    return GenPagesComponentInputInput(instance);
}
);
val GenPagesComponentTextareaTextareaClass = CreateVueComponent(GenPagesComponentTextareaTextarea::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentTextareaTextarea.inheritAttrs, inject = GenPagesComponentTextareaTextarea.inject, props = GenPagesComponentTextareaTextarea.props, propsNeedCastKeys = GenPagesComponentTextareaTextarea.propsNeedCastKeys, emits = GenPagesComponentTextareaTextarea.emits, components = GenPagesComponentTextareaTextarea.components, styles = GenPagesComponentTextareaTextarea.styles);
}
, fun(instance): GenPagesComponentTextareaTextarea {
    return GenPagesComponentTextareaTextarea(instance);
}
);
val GenPagesComponentSliderSliderClass = CreateVueComponent(GenPagesComponentSliderSlider::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSliderSlider.inheritAttrs, inject = GenPagesComponentSliderSlider.inject, props = GenPagesComponentSliderSlider.props, propsNeedCastKeys = GenPagesComponentSliderSlider.propsNeedCastKeys, emits = GenPagesComponentSliderSlider.emits, components = GenPagesComponentSliderSlider.components, styles = GenPagesComponentSliderSlider.styles);
}
, fun(instance): GenPagesComponentSliderSlider {
    return GenPagesComponentSliderSlider(instance);
}
);
open class SwiperTabsItem (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItemReactiveObject : SwiperTabsItem, IUTSReactive<SwiperTabsItem> {
    override var __v_raw: SwiperTabsItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItemReactiveObject {
        return SwiperTabsItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem (
    @JsonNotNull
    open var title: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItemReactiveObject : SwiperViewItem, IUTSReactive<SwiperViewItem> {
    override var __v_raw: SwiperViewItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(title = __v_raw.title) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItemReactiveObject {
        return SwiperViewItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
}
fun lerpNumber(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesComponentSliderSliderInSwiperClass = CreateVueComponent(GenPagesComponentSliderSliderInSwiper::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSliderSliderInSwiper.inheritAttrs, inject = GenPagesComponentSliderSliderInSwiper.inject, props = GenPagesComponentSliderSliderInSwiper.props, propsNeedCastKeys = GenPagesComponentSliderSliderInSwiper.propsNeedCastKeys, emits = GenPagesComponentSliderSliderInSwiper.emits, components = GenPagesComponentSliderSliderInSwiper.components, styles = GenPagesComponentSliderSliderInSwiper.styles);
}
, fun(instance): GenPagesComponentSliderSliderInSwiper {
    return GenPagesComponentSliderSliderInSwiper(instance);
}
);
val GenPagesComponentSliderSliderMaxValueClass = CreateVueComponent(GenPagesComponentSliderSliderMaxValue::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSliderSliderMaxValue.inheritAttrs, inject = GenPagesComponentSliderSliderMaxValue.inject, props = GenPagesComponentSliderSliderMaxValue.props, propsNeedCastKeys = GenPagesComponentSliderSliderMaxValue.propsNeedCastKeys, emits = GenPagesComponentSliderSliderMaxValue.emits, components = GenPagesComponentSliderSliderMaxValue.components, styles = GenPagesComponentSliderSliderMaxValue.styles);
}
, fun(instance): GenPagesComponentSliderSliderMaxValue {
    return GenPagesComponentSliderSliderMaxValue(instance);
}
);
val GenPagesComponentPickerViewPickerViewClass = CreateVueComponent(GenPagesComponentPickerViewPickerView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentPickerViewPickerView.inheritAttrs, inject = GenPagesComponentPickerViewPickerView.inject, props = GenPagesComponentPickerViewPickerView.props, propsNeedCastKeys = GenPagesComponentPickerViewPickerView.propsNeedCastKeys, emits = GenPagesComponentPickerViewPickerView.emits, components = GenPagesComponentPickerViewPickerView.components, styles = GenPagesComponentPickerViewPickerView.styles);
}
, fun(instance): GenPagesComponentPickerViewPickerView {
    return GenPagesComponentPickerViewPickerView(instance);
}
);
val GenPagesComponentSwitchSwitchClass = CreateVueComponent(GenPagesComponentSwitchSwitch::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSwitchSwitch.inheritAttrs, inject = GenPagesComponentSwitchSwitch.inject, props = GenPagesComponentSwitchSwitch.props, propsNeedCastKeys = GenPagesComponentSwitchSwitch.propsNeedCastKeys, emits = GenPagesComponentSwitchSwitch.emits, components = GenPagesComponentSwitchSwitch.components, styles = GenPagesComponentSwitchSwitch.styles);
}
, fun(instance): GenPagesComponentSwitchSwitch {
    return GenPagesComponentSwitchSwitch(instance);
}
);
val GenPagesComponentImageImageClass = CreateVueComponent(GenPagesComponentImageImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentImageImage.inheritAttrs, inject = GenPagesComponentImageImage.inject, props = GenPagesComponentImageImage.props, propsNeedCastKeys = GenPagesComponentImageImage.propsNeedCastKeys, emits = GenPagesComponentImageImage.emits, components = GenPagesComponentImageImage.components, styles = GenPagesComponentImageImage.styles);
}
, fun(instance): GenPagesComponentImageImage {
    return GenPagesComponentImageImage(instance);
}
);
val GenPagesComponentImageImageFormatClass = CreateVueComponent(GenPagesComponentImageImageFormat::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentImageImageFormat.inheritAttrs, inject = GenPagesComponentImageImageFormat.inject, props = GenPagesComponentImageImageFormat.props, propsNeedCastKeys = GenPagesComponentImageImageFormat.propsNeedCastKeys, emits = GenPagesComponentImageImageFormat.emits, components = GenPagesComponentImageImageFormat.components, styles = GenPagesComponentImageImageFormat.styles);
}
, fun(instance): GenPagesComponentImageImageFormat {
    return GenPagesComponentImageImageFormat(instance);
}
);
open class ImageFormat (
    @JsonNotNull
    open var format: String,
    @JsonNotNull
    open var src: String,
    open var errorImage: String? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ImageFormatReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ImageFormatReactiveObject : ImageFormat, IUTSReactive<ImageFormat> {
    override var __v_raw: ImageFormat;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ImageFormat, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(format = __v_raw.format, src = __v_raw.src, errorImage = __v_raw.errorImage) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ImageFormatReactiveObject {
        return ImageFormatReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var format: String
        get() {
            return trackReactiveGet(__v_raw, "format", __v_raw.format, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("format")) {
                return;
            }
            val oldValue = __v_raw.format;
            __v_raw.format = value;
            triggerReactiveSet(__v_raw, "format", oldValue, value);
        }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
    override var errorImage: String?
        get() {
            return trackReactiveGet(__v_raw, "errorImage", __v_raw.errorImage, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("errorImage")) {
                return;
            }
            val oldValue = __v_raw.errorImage;
            __v_raw.errorImage = value;
            triggerReactiveSet(__v_raw, "errorImage", oldValue, value);
        }
}
val GenPagesComponentImageImageModeClass = CreateVueComponent(GenPagesComponentImageImageMode::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentImageImageMode.inheritAttrs, inject = GenPagesComponentImageImageMode.inject, props = GenPagesComponentImageImageMode.props, propsNeedCastKeys = GenPagesComponentImageImageMode.propsNeedCastKeys, emits = GenPagesComponentImageImageMode.emits, components = GenPagesComponentImageImageMode.components, styles = GenPagesComponentImageImageMode.styles);
}
, fun(instance): GenPagesComponentImageImageMode {
    return GenPagesComponentImageImageMode(instance);
}
);
open class ImageMode (
    @JsonNotNull
    open var mode: String,
    @JsonNotNull
    open var description: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ImageModeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ImageModeReactiveObject : ImageMode, IUTSReactive<ImageMode> {
    override var __v_raw: ImageMode;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ImageMode, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(mode = __v_raw.mode, description = __v_raw.description) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ImageModeReactiveObject {
        return ImageModeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var mode: String
        get() {
            return trackReactiveGet(__v_raw, "mode", __v_raw.mode, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("mode")) {
                return;
            }
            val oldValue = __v_raw.mode;
            __v_raw.mode = value;
            triggerReactiveSet(__v_raw, "mode", oldValue, value);
        }
    override var description: String
        get() {
            return trackReactiveGet(__v_raw, "description", __v_raw.description, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("description")) {
                return;
            }
            val oldValue = __v_raw.description;
            __v_raw.description = value;
            triggerReactiveSet(__v_raw, "description", oldValue, value);
        }
}
val default2 = "/assets/logo.abb6eead.png";
val appid = uni_getAppBaseInfo(null).appId;
val GenPagesComponentImageImagePathClass = CreateVueComponent(GenPagesComponentImageImagePath::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentImageImagePath.inheritAttrs, inject = GenPagesComponentImageImagePath.inject, props = GenPagesComponentImageImagePath.props, propsNeedCastKeys = GenPagesComponentImageImagePath.propsNeedCastKeys, emits = GenPagesComponentImageImagePath.emits, components = GenPagesComponentImageImagePath.components, styles = GenPagesComponentImageImagePath.styles);
}
, fun(instance): GenPagesComponentImageImagePath {
    return GenPagesComponentImageImagePath(instance);
}
);
open class ImagePath (
    @JsonNotNull
    open var src: String,
    open var errorImage: String? = null,
    @JsonNotNull
    open var description: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ImagePathReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ImagePathReactiveObject : ImagePath, IUTSReactive<ImagePath> {
    override var __v_raw: ImagePath;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ImagePath, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(src = __v_raw.src, errorImage = __v_raw.errorImage, description = __v_raw.description) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ImagePathReactiveObject {
        return ImagePathReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
    override var errorImage: String?
        get() {
            return trackReactiveGet(__v_raw, "errorImage", __v_raw.errorImage, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("errorImage")) {
                return;
            }
            val oldValue = __v_raw.errorImage;
            __v_raw.errorImage = value;
            triggerReactiveSet(__v_raw, "errorImage", oldValue, value);
        }
    override var description: String
        get() {
            return trackReactiveGet(__v_raw, "description", __v_raw.description, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("description")) {
                return;
            }
            val oldValue = __v_raw.description;
            __v_raw.description = value;
            triggerReactiveSet(__v_raw, "description", oldValue, value);
        }
}
val GenPagesComponentImageImageLargeClass = CreateVueComponent(GenPagesComponentImageImageLarge::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentImageImageLarge.inheritAttrs, inject = GenPagesComponentImageImageLarge.inject, props = GenPagesComponentImageImageLarge.props, propsNeedCastKeys = GenPagesComponentImageImageLarge.propsNeedCastKeys, emits = GenPagesComponentImageImageLarge.emits, components = GenPagesComponentImageImageLarge.components, styles = GenPagesComponentImageImageLarge.styles);
}
, fun(instance): GenPagesComponentImageImageLarge {
    return GenPagesComponentImageImageLarge(instance);
}
);
val GenPagesComponentVideoVideoClass = CreateVueComponent(GenPagesComponentVideoVideo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentVideoVideo.inheritAttrs, inject = GenPagesComponentVideoVideo.inject, props = GenPagesComponentVideoVideo.props, propsNeedCastKeys = GenPagesComponentVideoVideo.propsNeedCastKeys, emits = GenPagesComponentVideoVideo.emits, components = GenPagesComponentVideoVideo.components, styles = GenPagesComponentVideoVideo.styles);
}
, fun(instance): GenPagesComponentVideoVideo {
    return GenPagesComponentVideoVideo(instance);
}
);
open class VideoFormat (
    @JsonNotNull
    open var format: String,
    @JsonNotNull
    open var src: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return VideoFormatReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class VideoFormatReactiveObject : VideoFormat, IUTSReactive<VideoFormat> {
    override var __v_raw: VideoFormat;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: VideoFormat, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(format = __v_raw.format, src = __v_raw.src) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): VideoFormatReactiveObject {
        return VideoFormatReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var format: String
        get() {
            return trackReactiveGet(__v_raw, "format", __v_raw.format, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("format")) {
                return;
            }
            val oldValue = __v_raw.format;
            __v_raw.format = value;
            triggerReactiveSet(__v_raw, "format", oldValue, value);
        }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
}
val GenPagesComponentVideoVideoFormatClass = CreateVueComponent(GenPagesComponentVideoVideoFormat::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentVideoVideoFormat.inheritAttrs, inject = GenPagesComponentVideoVideoFormat.inject, props = GenPagesComponentVideoVideoFormat.props, propsNeedCastKeys = GenPagesComponentVideoVideoFormat.propsNeedCastKeys, emits = GenPagesComponentVideoVideoFormat.emits, components = GenPagesComponentVideoVideoFormat.components, styles = GenPagesComponentVideoVideoFormat.styles, setup = fun(props: ComponentPublicInstance, ctx: SetupContext): Any? {
        return GenPagesComponentVideoVideoFormat.setup(props as GenPagesComponentVideoVideoFormat, ctx);
    }
    );
}
, fun(instance): GenPagesComponentVideoVideoFormat {
    return GenPagesComponentVideoVideoFormat(instance);
}
);
val GenPagesComponentNavigatorNavigatorClass = CreateVueComponent(GenPagesComponentNavigatorNavigator::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNavigatorNavigator.inheritAttrs, inject = GenPagesComponentNavigatorNavigator.inject, props = GenPagesComponentNavigatorNavigator.props, propsNeedCastKeys = GenPagesComponentNavigatorNavigator.propsNeedCastKeys, emits = GenPagesComponentNavigatorNavigator.emits, components = GenPagesComponentNavigatorNavigator.components, styles = GenPagesComponentNavigatorNavigator.styles);
}
, fun(instance): GenPagesComponentNavigatorNavigator {
    return GenPagesComponentNavigatorNavigator(instance);
}
);
val GenPagesComponentNavigatorNavigateClass = CreateVueComponent(GenPagesComponentNavigatorNavigate::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNavigatorNavigate.inheritAttrs, inject = GenPagesComponentNavigatorNavigate.inject, props = GenPagesComponentNavigatorNavigate.props, propsNeedCastKeys = GenPagesComponentNavigatorNavigate.propsNeedCastKeys, emits = GenPagesComponentNavigatorNavigate.emits, components = GenPagesComponentNavigatorNavigate.components, styles = GenPagesComponentNavigatorNavigate.styles);
}
, fun(instance): GenPagesComponentNavigatorNavigate {
    return GenPagesComponentNavigatorNavigate(instance);
}
);
val GenPagesComponentNavigatorRedirectClass = CreateVueComponent(GenPagesComponentNavigatorRedirect::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNavigatorRedirect.inheritAttrs, inject = GenPagesComponentNavigatorRedirect.inject, props = GenPagesComponentNavigatorRedirect.props, propsNeedCastKeys = GenPagesComponentNavigatorRedirect.propsNeedCastKeys, emits = GenPagesComponentNavigatorRedirect.emits, components = GenPagesComponentNavigatorRedirect.components, styles = GenPagesComponentNavigatorRedirect.styles);
}
, fun(instance): GenPagesComponentNavigatorRedirect {
    return GenPagesComponentNavigatorRedirect(instance);
}
);
val GenPagesComponentWebViewWebViewClass = CreateVueComponent(GenPagesComponentWebViewWebView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentWebViewWebView.inheritAttrs, inject = GenPagesComponentWebViewWebView.inject, props = GenPagesComponentWebViewWebView.props, propsNeedCastKeys = GenPagesComponentWebViewWebView.propsNeedCastKeys, emits = GenPagesComponentWebViewWebView.emits, components = GenPagesComponentWebViewWebView.components, styles = GenPagesComponentWebViewWebView.styles);
}
, fun(instance): GenPagesComponentWebViewWebView {
    return GenPagesComponentWebViewWebView(instance);
}
);
val GenPagesComponentWebViewWebViewWebViewLocalClass = CreateVueComponent(GenPagesComponentWebViewWebViewWebViewLocal::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentWebViewWebViewWebViewLocal.inheritAttrs, inject = GenPagesComponentWebViewWebViewWebViewLocal.inject, props = GenPagesComponentWebViewWebViewWebViewLocal.props, propsNeedCastKeys = GenPagesComponentWebViewWebViewWebViewLocal.propsNeedCastKeys, emits = GenPagesComponentWebViewWebViewWebViewLocal.emits, components = GenPagesComponentWebViewWebViewWebViewLocal.components, styles = GenPagesComponentWebViewWebViewWebViewLocal.styles);
}
, fun(instance): GenPagesComponentWebViewWebViewWebViewLocal {
    return GenPagesComponentWebViewWebViewWebViewLocal(instance);
}
);
val COLLECTION_NAME = "opendb-contacts";
open class GenderType (
    @JsonNotNull
    open var text: String,
    @JsonNotNull
    open var value: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return GenderTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class GenderTypeReactiveObject : GenderType, IUTSReactive<GenderType> {
    override var __v_raw: GenderType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: GenderType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(text = __v_raw.text, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): GenderTypeReactiveObject {
        return GenderTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var text: String
        get() {
            return trackReactiveGet(__v_raw, "text", __v_raw.text, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("text")) {
                return;
            }
            val oldValue = __v_raw.text;
            __v_raw.text = value;
            triggerReactiveSet(__v_raw, "text", oldValue, value);
        }
    override var value: Number
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val GenderList = utsArrayOf<GenderType>(GenderType(text = "未知", value = 0), GenderType(text = "男", value = 1), GenderType(text = "女", value = 2));
val UNICLOUD_DB_CONTACTS_ADD = "unicloud-db-contacts-add";
val UNICLOUD_DB_CONTACTS_UPDATE = "unicloud-db-contacts-update";
val UNICLOUD_DB_CONTACTS_DELETE = "unicloud-db-contacts-delete";
val easeInOutCubic = fun(t: Number): Number {
    return if (t < 0.5) {
        4 * t * t * t;
    } else {
        (t - 1) * (2 * t - 2) * (2 * t - 2) + 1;
    }
    ;
}
;
var elId: Number = 0;
val GenUniModulesUniLoadingComponentsUniLoadingLoadingCircleClass = CreateVueComponent(GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.name, inheritAttrs = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.inheritAttrs, inject = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.inject, props = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.props, propsNeedCastKeys = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.propsNeedCastKeys, emits = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.emits, components = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.components, styles = GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle.styles);
}
, fun(instance): GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle {
    return GenUniModulesUniLoadingComponentsUniLoadingLoadingCircle(instance);
}
);
val GenUniModulesUniLoadingComponentsUniLoadingUniLoadingClass = CreateVueComponent(GenUniModulesUniLoadingComponentsUniLoadingUniLoading::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.name, inheritAttrs = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.inheritAttrs, inject = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.inject, props = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.props, propsNeedCastKeys = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.propsNeedCastKeys, emits = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.emits, components = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.components, styles = GenUniModulesUniLoadingComponentsUniLoadingUniLoading.styles);
}
, fun(instance): GenUniModulesUniLoadingComponentsUniLoadingUniLoading {
    return GenUniModulesUniLoadingComponentsUniLoadingUniLoading(instance);
}
);
val EVENT_LOAD = "load";
val EVENT_ERROR = "error";
val PAGE_MODE_ADD = "add";
val PAGE_MODE_REPLACE = "replace";
val LOAD_MODE_AUTO = "auto";
val LOAD_MODE_MANUAL = "manual";
typealias SuccessCallback<T> = (res: T?) -> Unit?;
typealias FailCallback = (err: Any?) -> Unit?;
typealias CompleteCallback = () -> Unit?;
typealias GetSuccessCallback = SuccessCallback<UniCloudDBGetResult>;
typealias AddSuccessCallback = SuccessCallback<UniCloudDBAddResult>;
typealias RemoveSuccessCallback = SuccessCallback<UniCloudDBRemoveResult>;
typealias UpdateSuccessCallback = SuccessCallback<UniCloudDBUpdateResult>;
open class UniCloudDBComponentPaginationType (
    @JsonNotNull
    open var current: Number,
    @JsonNotNull
    open var size: Number,
    @JsonNotNull
    open var count: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return UniCloudDBComponentPaginationTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class UniCloudDBComponentPaginationTypeReactiveObject : UniCloudDBComponentPaginationType, IUTSReactive<UniCloudDBComponentPaginationType> {
    override var __v_raw: UniCloudDBComponentPaginationType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: UniCloudDBComponentPaginationType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(current = __v_raw.current, size = __v_raw.size, count = __v_raw.count) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UniCloudDBComponentPaginationTypeReactiveObject {
        return UniCloudDBComponentPaginationTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var current: Number
        get() {
            return trackReactiveGet(__v_raw, "current", __v_raw.current, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("current")) {
                return;
            }
            val oldValue = __v_raw.current;
            __v_raw.current = value;
            triggerReactiveSet(__v_raw, "current", oldValue, value);
        }
    override var size: Number
        get() {
            return trackReactiveGet(__v_raw, "size", __v_raw.size, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("size")) {
                return;
            }
            val oldValue = __v_raw.size;
            __v_raw.size = value;
            triggerReactiveSet(__v_raw, "size", oldValue, value);
        }
    override var count: Number
        get() {
            return trackReactiveGet(__v_raw, "count", __v_raw.count, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("count")) {
                return;
            }
            val oldValue = __v_raw.count;
            __v_raw.count = value;
            triggerReactiveSet(__v_raw, "count", oldValue, value);
        }
}
open class UniCloudDBComponentLoadDataOptions (
    open var clear: Boolean? = null,
    open var current: Number? = null,
    open var success: GetSuccessCallback? = null,
    open var fail: FailCallback? = null,
    open var complete: CompleteCallback? = null,
) : UTSObject()
open class UniCloudDBComponentAddOptions (
    open var showToast: Boolean? = true,
    open var toastTitle: String? = null,
    open var needLoading: Boolean? = true,
    open var loadingTitle: String? = null,
    open var success: AddSuccessCallback? = null,
    open var fail: FailCallback? = null,
    open var complete: CompleteCallback? = null,
) : UTSObject()
open class UniCloudDBComponentRemoveOptions (
    open var confirmTitle: String? = null,
    open var confirmContent: String? = null,
    open var needConfirm: Boolean? = true,
    open var needLoading: Boolean? = true,
    open var loadingTitle: String? = null,
    open var success: RemoveSuccessCallback? = null,
    open var fail: FailCallback? = null,
    open var complete: CompleteCallback? = null,
) : UTSObject()
open class UniCloudDBComponentUpdateOptions (
    open var showToast: Boolean? = true,
    open var toastTitle: String? = null,
    open var confirmTitle: String? = null,
    open var confirmContent: String? = null,
    open var needConfirm: Boolean? = true,
    open var needLoading: Boolean? = true,
    open var loadingTitle: String? = null,
    open var success: UpdateSuccessCallback? = null,
    open var fail: FailCallback? = null,
    open var complete: CompleteCallback? = null,
) : UTSObject()
fun <T> cast_callback(options: Any?): T? {
    return options as T?;
}
open class UniCloudDBElement : UniViewElementImpl {
    constructor(data: INodeData, pageNode: PageNode) : super(data, pageNode) {}
    open var dataList: UTSArray<UTSJSONObject> = utsArrayOf();
    open fun loadData(options: UTSJSONObject = UTSJSONObject()) {
        this.onLoadData(UniCloudDBComponentLoadDataOptions(clear = options.getBoolean("clear"), current = options.getNumber("current"), success = cast_callback<GetSuccessCallback>(options["success"]), fail = cast_callback<FailCallback>(options["fail"]), complete = cast_callback<CompleteCallback>(options["complete"])));
    }
    open fun loadMore() {
        this.onLoadMore();
    }
    open fun add(value: UTSJSONObject, options: UTSJSONObject) {
        this.onAdd(value, UniCloudDBComponentAddOptions(showToast = options.getBoolean("showToast") ?: true, toastTitle = options.getString("toastTitle"), needLoading = options.getBoolean("needLoading") ?: true, loadingTitle = options.getString("loadingTitle"), success = cast_callback<AddSuccessCallback>(options["success"]), fail = cast_callback<FailCallback>(options["fail"]), complete = cast_callback<CompleteCallback>(options["complete"])));
    }
    open fun remove(id: Any, options: UTSJSONObject) {
        this.onRemove(id, UniCloudDBComponentRemoveOptions(confirmTitle = options.getString("confirmTitle"), confirmContent = options.getString("confirmContent"), needConfirm = options.getBoolean("needConfirm") ?: true, needLoading = options.getBoolean("needLoading") ?: true, loadingTitle = options.getString("loadingTitle"), success = cast_callback<RemoveSuccessCallback>(options["success"]), fail = cast_callback<FailCallback>(options["fail"]), complete = cast_callback<CompleteCallback>(options["complete"])));
    }
    open fun update(id: String, value: UTSJSONObject, options: UTSJSONObject) {
        this.onUpdate(id, value, UniCloudDBComponentUpdateOptions(showToast = options.getBoolean("showToast") ?: true, toastTitle = options.getString("toastTitle"), confirmTitle = options.getString("confirmTitle"), confirmContent = options.getString("confirmContent"), needConfirm = options.getBoolean("needConfirm") ?: true, needLoading = options.getBoolean("needLoading") ?: true, loadingTitle = options.getString("loadingTitle"), success = cast_callback<UpdateSuccessCallback>(options["success"]), fail = cast_callback<FailCallback>(options["fail"]), complete = cast_callback<CompleteCallback>(options["complete"])));
    }
    open lateinit var onLoadData: (_: UniCloudDBComponentLoadDataOptions) -> UTSPromise<Unit>;
    open lateinit var onLoadMore: () -> Unit;
    open lateinit var onAdd: (value: UTSJSONObject, options: UniCloudDBComponentAddOptions) -> Unit;
    open lateinit var onUpdate: (id: String, value: UTSJSONObject, options: UniCloudDBComponentUpdateOptions) -> Unit;
    open lateinit var onRemove: (id: Any, options: UniCloudDBComponentRemoveOptions) -> Unit;
}
open class GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDbSlotDataDefault (
    @JsonNotNull
    open var data: UTSArray<UTSJSONObject>,
    @JsonNotNull
    open var loading: Boolean = false,
    @JsonNotNull
    open var hasMore: Boolean = false,
    @JsonNotNull
    open var pagination: UniCloudDBComponentPaginationType,
    open var error: UniCloudError? = null,
) : SlotData()
val GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDbClass = CreateVueComponent(GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.name, inheritAttrs = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.inheritAttrs, inject = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.inject, props = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.props, propsNeedCastKeys = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.propsNeedCastKeys, emits = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.emits, components = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.components, styles = GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb.styles, __isBuiltIn = true);
}
, fun(instance): GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb {
    return GenNodeModulesDcloudioUniComponentsLibXUnicloudDbUnicloudDb(instance);
}
);
val GenPagesComponentUnicloudDbUnicloudDbContactsListClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbContactsList::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbContactsList.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbContactsList.inject, props = GenPagesComponentUnicloudDbUnicloudDbContactsList.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbContactsList.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbContactsList.emits, components = GenPagesComponentUnicloudDbUnicloudDbContactsList.components, styles = GenPagesComponentUnicloudDbUnicloudDbContactsList.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbContactsList {
    return GenPagesComponentUnicloudDbUnicloudDbContactsList(instance);
}
);
val GenPagesComponentUnicloudDbUnicloudDbContactsAddClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbContactsAdd::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.inject, props = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.emits, components = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.components, styles = GenPagesComponentUnicloudDbUnicloudDbContactsAdd.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbContactsAdd {
    return GenPagesComponentUnicloudDbUnicloudDbContactsAdd(instance);
}
);
val GenPagesComponentUnicloudDbUnicloudDbContactsEditClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbContactsEdit::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.inject, props = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.emits, components = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.components, styles = GenPagesComponentUnicloudDbUnicloudDbContactsEdit.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbContactsEdit {
    return GenPagesComponentUnicloudDbUnicloudDbContactsEdit(instance);
}
);
val GenPagesComponentUnicloudDbUnicloudDbContactsDetailClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbContactsDetail::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.inject, props = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.emits, components = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.components, styles = GenPagesComponentUnicloudDbUnicloudDbContactsDetail.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbContactsDetail {
    return GenPagesComponentUnicloudDbUnicloudDbContactsDetail(instance);
}
);
typealias SuccessCallback1<T> = (res: T?) -> Unit?;
typealias FailCallback1 = (err: Any?) -> Unit?;
typealias CompleteCallback1 = () -> Unit?;
open class MixinDatacomPaginationType (
    @JsonNotNull
    open var current: Number,
    @JsonNotNull
    open var size: Number,
    @JsonNotNull
    open var count: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return MixinDatacomPaginationTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class MixinDatacomPaginationTypeReactiveObject : MixinDatacomPaginationType, IUTSReactive<MixinDatacomPaginationType> {
    override var __v_raw: MixinDatacomPaginationType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: MixinDatacomPaginationType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(current = __v_raw.current, size = __v_raw.size, count = __v_raw.count) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): MixinDatacomPaginationTypeReactiveObject {
        return MixinDatacomPaginationTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var current: Number
        get() {
            return trackReactiveGet(__v_raw, "current", __v_raw.current, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("current")) {
                return;
            }
            val oldValue = __v_raw.current;
            __v_raw.current = value;
            triggerReactiveSet(__v_raw, "current", oldValue, value);
        }
    override var size: Number
        get() {
            return trackReactiveGet(__v_raw, "size", __v_raw.size, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("size")) {
                return;
            }
            val oldValue = __v_raw.size;
            __v_raw.size = value;
            triggerReactiveSet(__v_raw, "size", oldValue, value);
        }
    override var count: Number
        get() {
            return trackReactiveGet(__v_raw, "count", __v_raw.count, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("count")) {
                return;
            }
            val oldValue = __v_raw.count;
            __v_raw.count = value;
            triggerReactiveSet(__v_raw, "count", oldValue, value);
        }
}
open class MixinDatacomGetOptions (
    open var collection: UTSJSONObject? = null,
    open var field: String? = null,
    open var orderBy: String? = null,
    open var where: Any? = null,
    open var pageData: String? = null,
    open var pageCurrent: Number? = null,
    open var pageSize: Number? = null,
    open var getCount: Boolean? = null,
    open var getTree: Any? = null,
    open var getTreePath: UTSJSONObject? = null,
    open var startWith: String? = null,
    open var limitLevel: Number? = null,
    open var groupBy: String? = null,
    open var groupField: String? = null,
    open var distinct: Boolean? = null,
    open var pageIndistinct: Boolean? = null,
    open var foreignKey: String? = null,
    open var loadtime: String? = null,
    open var manual: Boolean? = null,
) : UTSObject()
open class MixinDatacomEasyGetOptions (
    open var success: SuccessCallback1<UniCloudDBGetResult>? = null,
    open var fail: FailCallback1? = null,
    open var complete: CompleteCallback1? = null,
) : UTSObject()
val GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacomClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.inject, props = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.emits, components = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.components, styles = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom {
    return GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacom(instance);
}
);
val GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacomClass = CreateVueComponent(GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.inheritAttrs, inject = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.inject, props = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.props, propsNeedCastKeys = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.propsNeedCastKeys, emits = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.emits, components = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.components, styles = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom.styles);
}
, fun(instance): GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom {
    return GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacom(instance);
}
);
val GenPagesComponentGlobalPropertiesGlobalPropertiesClass = CreateVueComponent(GenPagesComponentGlobalPropertiesGlobalProperties::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentGlobalPropertiesGlobalProperties.inheritAttrs, inject = GenPagesComponentGlobalPropertiesGlobalProperties.inject, props = GenPagesComponentGlobalPropertiesGlobalProperties.props, propsNeedCastKeys = GenPagesComponentGlobalPropertiesGlobalProperties.propsNeedCastKeys, emits = GenPagesComponentGlobalPropertiesGlobalProperties.emits, components = GenPagesComponentGlobalPropertiesGlobalProperties.components, styles = GenPagesComponentGlobalPropertiesGlobalProperties.styles);
}
, fun(instance): GenPagesComponentGlobalPropertiesGlobalProperties {
    return GenPagesComponentGlobalPropertiesGlobalProperties(instance);
}
);
val GenPagesComponentGlobalEventsGlobalEventsClass = CreateVueComponent(GenPagesComponentGlobalEventsGlobalEvents::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentGlobalEventsGlobalEvents.inheritAttrs, inject = GenPagesComponentGlobalEventsGlobalEvents.inject, props = GenPagesComponentGlobalEventsGlobalEvents.props, propsNeedCastKeys = GenPagesComponentGlobalEventsGlobalEvents.propsNeedCastKeys, emits = GenPagesComponentGlobalEventsGlobalEvents.emits, components = GenPagesComponentGlobalEventsGlobalEvents.components, styles = GenPagesComponentGlobalEventsGlobalEvents.styles);
}
, fun(instance): GenPagesComponentGlobalEventsGlobalEvents {
    return GenPagesComponentGlobalEventsGlobalEvents(instance);
}
);
val GenPagesComponentGlobalEventsTransitionEventsClass = CreateVueComponent(GenPagesComponentGlobalEventsTransitionEvents::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentGlobalEventsTransitionEvents.inheritAttrs, inject = GenPagesComponentGlobalEventsTransitionEvents.inject, props = GenPagesComponentGlobalEventsTransitionEvents.props, propsNeedCastKeys = GenPagesComponentGlobalEventsTransitionEvents.propsNeedCastKeys, emits = GenPagesComponentGlobalEventsTransitionEvents.emits, components = GenPagesComponentGlobalEventsTransitionEvents.components, styles = GenPagesComponentGlobalEventsTransitionEvents.styles);
}
, fun(instance): GenPagesComponentGlobalEventsTransitionEvents {
    return GenPagesComponentGlobalEventsTransitionEvents(instance);
}
);
val GenPagesComponentGlobalEventsTouchEventsClass = CreateVueComponent(GenPagesComponentGlobalEventsTouchEvents::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentGlobalEventsTouchEvents.inheritAttrs, inject = GenPagesComponentGlobalEventsTouchEvents.inject, props = GenPagesComponentGlobalEventsTouchEvents.props, propsNeedCastKeys = GenPagesComponentGlobalEventsTouchEvents.propsNeedCastKeys, emits = GenPagesComponentGlobalEventsTouchEvents.emits, components = GenPagesComponentGlobalEventsTouchEvents.components, styles = GenPagesComponentGlobalEventsTouchEvents.styles);
}
, fun(instance): GenPagesComponentGlobalEventsTouchEvents {
    return GenPagesComponentGlobalEventsTouchEvents(instance);
}
);
val GenPagesComponentGlobalEventsTouchEventsBubblesClass = CreateVueComponent(GenPagesComponentGlobalEventsTouchEventsBubbles::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentGlobalEventsTouchEventsBubbles.inheritAttrs, inject = GenPagesComponentGlobalEventsTouchEventsBubbles.inject, props = GenPagesComponentGlobalEventsTouchEventsBubbles.props, propsNeedCastKeys = GenPagesComponentGlobalEventsTouchEventsBubbles.propsNeedCastKeys, emits = GenPagesComponentGlobalEventsTouchEventsBubbles.emits, components = GenPagesComponentGlobalEventsTouchEventsBubbles.components, styles = GenPagesComponentGlobalEventsTouchEventsBubbles.styles);
}
, fun(instance): GenPagesComponentGlobalEventsTouchEventsBubbles {
    return GenPagesComponentGlobalEventsTouchEventsBubbles(instance);
}
);
val GenPagesComponentNestedScrollHeaderNestedScrollHeaderClass = CreateVueComponent(GenPagesComponentNestedScrollHeaderNestedScrollHeader::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNestedScrollHeaderNestedScrollHeader.inheritAttrs, inject = GenPagesComponentNestedScrollHeaderNestedScrollHeader.inject, props = GenPagesComponentNestedScrollHeaderNestedScrollHeader.props, propsNeedCastKeys = GenPagesComponentNestedScrollHeaderNestedScrollHeader.propsNeedCastKeys, emits = GenPagesComponentNestedScrollHeaderNestedScrollHeader.emits, components = GenPagesComponentNestedScrollHeaderNestedScrollHeader.components, styles = GenPagesComponentNestedScrollHeaderNestedScrollHeader.styles);
}
, fun(instance): GenPagesComponentNestedScrollHeaderNestedScrollHeader {
    return GenPagesComponentNestedScrollHeaderNestedScrollHeader(instance);
}
);
val GenPagesTemplateCustomRefresherRefreshBoxRefreshBoxClass = CreateVueComponent(GenPagesTemplateCustomRefresherRefreshBoxRefreshBox::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.inheritAttrs, inject = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.inject, props = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.props, propsNeedCastKeys = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.propsNeedCastKeys, emits = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.emits, components = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.components, styles = GenPagesTemplateCustomRefresherRefreshBoxRefreshBox.styles);
}
, fun(instance): GenPagesTemplateCustomRefresherRefreshBoxRefreshBox {
    return GenPagesTemplateCustomRefresherRefreshBoxRefreshBox(instance);
}
);
val GenPagesComponentNestedScrollBodyNestedScrollBodyClass = CreateVueComponent(GenPagesComponentNestedScrollBodyNestedScrollBody::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNestedScrollBodyNestedScrollBody.inheritAttrs, inject = GenPagesComponentNestedScrollBodyNestedScrollBody.inject, props = GenPagesComponentNestedScrollBodyNestedScrollBody.props, propsNeedCastKeys = GenPagesComponentNestedScrollBodyNestedScrollBody.propsNeedCastKeys, emits = GenPagesComponentNestedScrollBodyNestedScrollBody.emits, components = GenPagesComponentNestedScrollBodyNestedScrollBody.components, styles = GenPagesComponentNestedScrollBodyNestedScrollBody.styles);
}
, fun(instance): GenPagesComponentNestedScrollBodyNestedScrollBody {
    return GenPagesComponentNestedScrollBodyNestedScrollBody(instance);
}
);
val GenPagesComponentSwiperSwiperListViewClass = CreateVueComponent(GenPagesComponentSwiperSwiperListView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentSwiperSwiperListView.inheritAttrs, inject = GenPagesComponentSwiperSwiperListView.inject, props = GenPagesComponentSwiperSwiperListView.props, propsNeedCastKeys = GenPagesComponentSwiperSwiperListView.propsNeedCastKeys, emits = GenPagesComponentSwiperSwiperListView.emits, components = GenPagesComponentSwiperSwiperListView.components, styles = GenPagesComponentSwiperSwiperListView.styles);
}
, fun(instance): GenPagesComponentSwiperSwiperListView {
    return GenPagesComponentSwiperSwiperListView(instance);
}
);
open class TypeJestResult (
    @JsonNotNull
    open var translateMarkerMsg: String,
    @JsonNotNull
    open var animationEnd: Boolean = false,
    @JsonNotNull
    open var centerPoints: LocationObject,
    @JsonNotNull
    open var southwest: LocationObject,
    @JsonNotNull
    open var northeast: LocationObject,
    @JsonNotNull
    open var moveToLocationMsg: String,
    @JsonNotNull
    open var scale: Number,
    @JsonNotNull
    open var eventDetailJsonStringify: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return TypeJestResultReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class TypeJestResultReactiveObject : TypeJestResult, IUTSReactive<TypeJestResult> {
    override var __v_raw: TypeJestResult;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: TypeJestResult, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(translateMarkerMsg = __v_raw.translateMarkerMsg, animationEnd = __v_raw.animationEnd, centerPoints = __v_raw.centerPoints, southwest = __v_raw.southwest, northeast = __v_raw.northeast, moveToLocationMsg = __v_raw.moveToLocationMsg, scale = __v_raw.scale, eventDetailJsonStringify = __v_raw.eventDetailJsonStringify) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): TypeJestResultReactiveObject {
        return TypeJestResultReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var translateMarkerMsg: String
        get() {
            return trackReactiveGet(__v_raw, "translateMarkerMsg", __v_raw.translateMarkerMsg, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("translateMarkerMsg")) {
                return;
            }
            val oldValue = __v_raw.translateMarkerMsg;
            __v_raw.translateMarkerMsg = value;
            triggerReactiveSet(__v_raw, "translateMarkerMsg", oldValue, value);
        }
    override var animationEnd: Boolean
        get() {
            return trackReactiveGet(__v_raw, "animationEnd", __v_raw.animationEnd, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("animationEnd")) {
                return;
            }
            val oldValue = __v_raw.animationEnd;
            __v_raw.animationEnd = value;
            triggerReactiveSet(__v_raw, "animationEnd", oldValue, value);
        }
    override var centerPoints: LocationObject
        get() {
            return trackReactiveGet(__v_raw, "centerPoints", __v_raw.centerPoints, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("centerPoints")) {
                return;
            }
            val oldValue = __v_raw.centerPoints;
            __v_raw.centerPoints = value;
            triggerReactiveSet(__v_raw, "centerPoints", oldValue, value);
        }
    override var southwest: LocationObject
        get() {
            return trackReactiveGet(__v_raw, "southwest", __v_raw.southwest, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("southwest")) {
                return;
            }
            val oldValue = __v_raw.southwest;
            __v_raw.southwest = value;
            triggerReactiveSet(__v_raw, "southwest", oldValue, value);
        }
    override var northeast: LocationObject
        get() {
            return trackReactiveGet(__v_raw, "northeast", __v_raw.northeast, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("northeast")) {
                return;
            }
            val oldValue = __v_raw.northeast;
            __v_raw.northeast = value;
            triggerReactiveSet(__v_raw, "northeast", oldValue, value);
        }
    override var moveToLocationMsg: String
        get() {
            return trackReactiveGet(__v_raw, "moveToLocationMsg", __v_raw.moveToLocationMsg, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("moveToLocationMsg")) {
                return;
            }
            val oldValue = __v_raw.moveToLocationMsg;
            __v_raw.moveToLocationMsg = value;
            triggerReactiveSet(__v_raw, "moveToLocationMsg", oldValue, value);
        }
    override var scale: Number
        get() {
            return trackReactiveGet(__v_raw, "scale", __v_raw.scale, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("scale")) {
                return;
            }
            val oldValue = __v_raw.scale;
            __v_raw.scale = value;
            triggerReactiveSet(__v_raw, "scale", oldValue, value);
        }
    override var eventDetailJsonStringify: String
        get() {
            return trackReactiveGet(__v_raw, "eventDetailJsonStringify", __v_raw.eventDetailJsonStringify, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("eventDetailJsonStringify")) {
                return;
            }
            val oldValue = __v_raw.eventDetailJsonStringify;
            __v_raw.eventDetailJsonStringify = value;
            triggerReactiveSet(__v_raw, "eventDetailJsonStringify", oldValue, value);
        }
}
val GenPagesComponentMapMapClass = CreateVueComponent(GenPagesComponentMapMap::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentMapMap.inheritAttrs, inject = GenPagesComponentMapMap.inject, props = GenPagesComponentMapMap.props, propsNeedCastKeys = GenPagesComponentMapMap.propsNeedCastKeys, emits = GenPagesComponentMapMap.emits, components = GenPagesComponentMapMap.components, styles = GenPagesComponentMapMap.styles, setup = fun(props: ComponentPublicInstance, ctx: SetupContext): Any? {
        return GenPagesComponentMapMap.setup(props as GenPagesComponentMapMap, ctx);
    }
    );
}
, fun(instance): GenPagesComponentMapMap {
    return GenPagesComponentMapMap(instance);
}
);
val GenPagesComponentListViewIssue2199ItemClass = CreateVueComponent(GenPagesComponentListViewIssue2199Item::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenPagesComponentListViewIssue2199Item.name, inheritAttrs = GenPagesComponentListViewIssue2199Item.inheritAttrs, inject = GenPagesComponentListViewIssue2199Item.inject, props = GenPagesComponentListViewIssue2199Item.props, propsNeedCastKeys = GenPagesComponentListViewIssue2199Item.propsNeedCastKeys, emits = GenPagesComponentListViewIssue2199Item.emits, components = GenPagesComponentListViewIssue2199Item.components, styles = GenPagesComponentListViewIssue2199Item.styles);
}
, fun(instance): GenPagesComponentListViewIssue2199Item {
    return GenPagesComponentListViewIssue2199Item(instance);
}
);
val GenPagesComponentListViewIssue2199Class = CreateVueComponent(GenPagesComponentListViewIssue2199::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentListViewIssue2199.inheritAttrs, inject = GenPagesComponentListViewIssue2199.inject, props = GenPagesComponentListViewIssue2199.props, propsNeedCastKeys = GenPagesComponentListViewIssue2199.propsNeedCastKeys, emits = GenPagesComponentListViewIssue2199.emits, components = GenPagesComponentListViewIssue2199.components, styles = GenPagesComponentListViewIssue2199.styles);
}
, fun(instance): GenPagesComponentListViewIssue2199 {
    return GenPagesComponentListViewIssue2199(instance);
}
);
fun hidpi(canvas: UniCanvasElement) {
    val context = canvas.getContext("2d")!!;
    val dpr = uni_getWindowInfo().pixelRatio;
    canvas.width = canvas.offsetWidth * dpr;
    canvas.height = canvas.offsetHeight * dpr;
    context.scale(dpr, dpr);
}
val GenPagesComponentCanvasCanvasClass = CreateVueComponent(GenPagesComponentCanvasCanvas::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentCanvasCanvas.inheritAttrs, inject = GenPagesComponentCanvasCanvas.inject, props = GenPagesComponentCanvasCanvas.props, propsNeedCastKeys = GenPagesComponentCanvasCanvas.propsNeedCastKeys, emits = GenPagesComponentCanvasCanvas.emits, components = GenPagesComponentCanvasCanvas.components, styles = GenPagesComponentCanvasCanvas.styles);
}
, fun(instance): GenPagesComponentCanvasCanvas {
    return GenPagesComponentCanvasCanvas(instance);
}
);
fun hidpi1(canvas: UniCanvasElement) {
    val context = canvas.getContext("2d")!!;
    val dpr = uni_getWindowInfo().pixelRatio;
    canvas.width = canvas.offsetWidth * dpr;
    canvas.height = canvas.offsetHeight * dpr;
    context.scale(dpr, dpr);
}
val GenPagesComponentCanvasCanvasContextClass = CreateVueComponent(GenPagesComponentCanvasCanvasContext::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentCanvasCanvasContext.inheritAttrs, inject = GenPagesComponentCanvasCanvasContext.inject, props = GenPagesComponentCanvasCanvasContext.props, propsNeedCastKeys = GenPagesComponentCanvasCanvasContext.propsNeedCastKeys, emits = GenPagesComponentCanvasCanvasContext.emits, components = GenPagesComponentCanvasCanvasContext.components, styles = GenPagesComponentCanvasCanvasContext.styles);
}
, fun(instance): GenPagesComponentCanvasCanvasContext {
    return GenPagesComponentCanvasCanvasContext(instance);
}
);
val GenPagesComponentCanvasCanvasBallClass = CreateVueComponent(GenPagesComponentCanvasCanvasBall::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentCanvasCanvasBall.inheritAttrs, inject = GenPagesComponentCanvasCanvasBall.inject, props = GenPagesComponentCanvasCanvasBall.props, propsNeedCastKeys = GenPagesComponentCanvasCanvasBall.propsNeedCastKeys, emits = GenPagesComponentCanvasCanvasBall.emits, components = GenPagesComponentCanvasCanvasBall.components, styles = GenPagesComponentCanvasCanvasBall.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesComponentCanvasCanvasBall.setup(props as GenPagesComponentCanvasCanvasBall);
    }
    );
}
, fun(instance): GenPagesComponentCanvasCanvasBall {
    return GenPagesComponentCanvasCanvasBall(instance);
}
);
open class Point (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
) : UTSObject()
val GenPagesComponentCanvasCanvasDoodleClass = CreateVueComponent(GenPagesComponentCanvasCanvasDoodle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentCanvasCanvasDoodle.inheritAttrs, inject = GenPagesComponentCanvasCanvasDoodle.inject, props = GenPagesComponentCanvasCanvasDoodle.props, propsNeedCastKeys = GenPagesComponentCanvasCanvasDoodle.propsNeedCastKeys, emits = GenPagesComponentCanvasCanvasDoodle.emits, components = GenPagesComponentCanvasCanvasDoodle.components, styles = GenPagesComponentCanvasCanvasDoodle.styles);
}
, fun(instance): GenPagesComponentCanvasCanvasDoodle {
    return GenPagesComponentCanvasCanvasDoodle(instance);
}
);
val GenUniModulesNativeButtonComponentsNativeButtonNativeButtonClass = CreateVueComponent(GenUniModulesNativeButtonComponentsNativeButtonNativeButton::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.inheritAttrs, inject = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.inject, props = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.props, propsNeedCastKeys = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.propsNeedCastKeys, emits = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.emits, components = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.components, styles = GenUniModulesNativeButtonComponentsNativeButtonNativeButton.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenUniModulesNativeButtonComponentsNativeButtonNativeButton.setup(props as GenUniModulesNativeButtonComponentsNativeButtonNativeButton);
    }
    );
}
, fun(instance): GenUniModulesNativeButtonComponentsNativeButtonNativeButton {
    return GenUniModulesNativeButtonComponentsNativeButtonNativeButton(instance);
}
);
val GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePickerClass = CreateVueComponent(GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.inheritAttrs, inject = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.inject, props = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.props, propsNeedCastKeys = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.propsNeedCastKeys, emits = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.emits, components = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.components, styles = GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker.styles);
}
, fun(instance): GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker {
    return GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePicker(instance);
}
);
val GenPagesComponentNativeViewNativeViewClass = CreateVueComponent(GenPagesComponentNativeViewNativeView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentNativeViewNativeView.inheritAttrs, inject = GenPagesComponentNativeViewNativeView.inject, props = GenPagesComponentNativeViewNativeView.props, propsNeedCastKeys = GenPagesComponentNativeViewNativeView.propsNeedCastKeys, emits = GenPagesComponentNativeViewNativeView.emits, components = GenPagesComponentNativeViewNativeView.components, styles = GenPagesComponentNativeViewNativeView.styles);
}
, fun(instance): GenPagesComponentNativeViewNativeView {
    return GenPagesComponentNativeViewNativeView(instance);
}
);
val GenPagesComponentAdAdClass = CreateVueComponent(GenPagesComponentAdAd::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentAdAd.inheritAttrs, inject = GenPagesComponentAdAd.inject, props = GenPagesComponentAdAd.props, propsNeedCastKeys = GenPagesComponentAdAd.propsNeedCastKeys, emits = GenPagesComponentAdAd.emits, components = GenPagesComponentAdAd.components, styles = GenPagesComponentAdAd.styles);
}
, fun(instance): GenPagesComponentAdAd {
    return GenPagesComponentAdAd(instance);
}
);
open class ScrollEventTest2 (
    @JsonNotNull
    open var type: String,
    open var target: UniElement? = null,
    open var currentTarget: UniElement? = null,
    open var direction: String? = null,
) : UTSObject()
open class flowItemData (
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var text: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return flowItemDataReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class flowItemDataReactiveObject : flowItemData, IUTSReactive<flowItemData> {
    override var __v_raw: flowItemData;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: flowItemData, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(height = __v_raw.height, text = __v_raw.text) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): flowItemDataReactiveObject {
        return flowItemDataReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
    override var text: String
        get() {
            return trackReactiveGet(__v_raw, "text", __v_raw.text, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("text")) {
                return;
            }
            val oldValue = __v_raw.text;
            __v_raw.text = value;
            triggerReactiveSet(__v_raw, "text", oldValue, value);
        }
}
val GenPagesComponentWaterflowWaterflowClass = CreateVueComponent(GenPagesComponentWaterflowWaterflow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentWaterflowWaterflow.inheritAttrs, inject = GenPagesComponentWaterflowWaterflow.inject, props = GenPagesComponentWaterflowWaterflow.props, propsNeedCastKeys = GenPagesComponentWaterflowWaterflow.propsNeedCastKeys, emits = GenPagesComponentWaterflowWaterflow.emits, components = GenPagesComponentWaterflowWaterflow.components, styles = GenPagesComponentWaterflowWaterflow.styles);
}
, fun(instance): GenPagesComponentWaterflowWaterflow {
    return GenPagesComponentWaterflowWaterflow(instance);
}
);
val GenPagesComponentAdListViewAdClass = CreateVueComponent(GenPagesComponentAdListViewAd::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentAdListViewAd.inheritAttrs, inject = GenPagesComponentAdListViewAd.inject, props = GenPagesComponentAdListViewAd.props, propsNeedCastKeys = GenPagesComponentAdListViewAd.propsNeedCastKeys, emits = GenPagesComponentAdListViewAd.emits, components = GenPagesComponentAdListViewAd.components, styles = GenPagesComponentAdListViewAd.styles);
}
, fun(instance): GenPagesComponentAdListViewAd {
    return GenPagesComponentAdListViewAd(instance);
}
);
val GenComponentsApiSetTabbarApiSetTabbarClass = CreateVueComponent(GenComponentsApiSetTabbarApiSetTabbar::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsApiSetTabbarApiSetTabbar.inheritAttrs, inject = GenComponentsApiSetTabbarApiSetTabbar.inject, props = GenComponentsApiSetTabbarApiSetTabbar.props, propsNeedCastKeys = GenComponentsApiSetTabbarApiSetTabbar.propsNeedCastKeys, emits = GenComponentsApiSetTabbarApiSetTabbar.emits, components = GenComponentsApiSetTabbarApiSetTabbar.components, styles = GenComponentsApiSetTabbarApiSetTabbar.styles);
}
, fun(instance): GenComponentsApiSetTabbarApiSetTabbar {
    return GenComponentsApiSetTabbarApiSetTabbar(instance);
}
);
val menu1 = generateMenu("pages/API");
val GenPagesTabBarAPIClass = CreateVueComponent(GenPagesTabBarAPI::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTabBarAPI.inheritAttrs, inject = GenPagesTabBarAPI.inject, props = GenPagesTabBarAPI.props, propsNeedCastKeys = GenPagesTabBarAPI.propsNeedCastKeys, emits = GenPagesTabBarAPI.emits, components = GenPagesTabBarAPI.components, styles = GenPagesTabBarAPI.styles);
}
, fun(instance): GenPagesTabBarAPI {
    return GenPagesTabBarAPI(instance);
}
);
open class MyGlobalData (
    @JsonNotNull
    open var str: String,
    @JsonNotNull
    open var num: Number,
    @JsonNotNull
    open var bool: Boolean = false,
    @JsonNotNull
    open var obj: UTSJSONObject,
    open var `null`: String? = null,
    @JsonNotNull
    open var arr: UTSArray<Number>,
    @JsonNotNull
    open var mySet: UTSArray<String>,
    @JsonNotNull
    open var myMap: UTSJSONObject,
    open var func: () -> String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return MyGlobalDataReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class MyGlobalDataReactiveObject : MyGlobalData, IUTSReactive<MyGlobalData> {
    override var __v_raw: MyGlobalData;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: MyGlobalData, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(str = __v_raw.str, num = __v_raw.num, bool = __v_raw.bool, obj = __v_raw.obj, `null` = __v_raw.`null`, arr = __v_raw.arr, mySet = __v_raw.mySet, myMap = __v_raw.myMap, func = __v_raw.func) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): MyGlobalDataReactiveObject {
        return MyGlobalDataReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var str: String
        get() {
            return trackReactiveGet(__v_raw, "str", __v_raw.str, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("str")) {
                return;
            }
            val oldValue = __v_raw.str;
            __v_raw.str = value;
            triggerReactiveSet(__v_raw, "str", oldValue, value);
        }
    override var num: Number
        get() {
            return trackReactiveGet(__v_raw, "num", __v_raw.num, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("num")) {
                return;
            }
            val oldValue = __v_raw.num;
            __v_raw.num = value;
            triggerReactiveSet(__v_raw, "num", oldValue, value);
        }
    override var bool: Boolean
        get() {
            return trackReactiveGet(__v_raw, "bool", __v_raw.bool, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bool")) {
                return;
            }
            val oldValue = __v_raw.bool;
            __v_raw.bool = value;
            triggerReactiveSet(__v_raw, "bool", oldValue, value);
        }
    override var obj: UTSJSONObject
        get() {
            return trackReactiveGet(__v_raw, "obj", __v_raw.obj, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("obj")) {
                return;
            }
            val oldValue = __v_raw.obj;
            __v_raw.obj = value;
            triggerReactiveSet(__v_raw, "obj", oldValue, value);
        }
    override var `null`: String?
        get() {
            return trackReactiveGet(__v_raw, "null", __v_raw.`null`, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("null")) {
                return;
            }
            val oldValue = __v_raw.`null`;
            __v_raw.`null` = value;
            triggerReactiveSet(__v_raw, "null", oldValue, value);
        }
    override var arr: UTSArray<Number>
        get() {
            return trackReactiveGet(__v_raw, "arr", __v_raw.arr, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("arr")) {
                return;
            }
            val oldValue = __v_raw.arr;
            __v_raw.arr = value;
            triggerReactiveSet(__v_raw, "arr", oldValue, value);
        }
    override var mySet: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "mySet", __v_raw.mySet, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("mySet")) {
                return;
            }
            val oldValue = __v_raw.mySet;
            __v_raw.mySet = value;
            triggerReactiveSet(__v_raw, "mySet", oldValue, value);
        }
    override var myMap: UTSJSONObject
        get() {
            return trackReactiveGet(__v_raw, "myMap", __v_raw.myMap, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("myMap")) {
                return;
            }
            val oldValue = __v_raw.myMap;
            __v_raw.myMap = value;
            triggerReactiveSet(__v_raw, "myMap", oldValue, value);
        }
}
val GenPagesAPIGetAppGetAppClass = CreateVueComponent(GenPagesAPIGetAppGetApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetAppGetApp.inheritAttrs, inject = GenPagesAPIGetAppGetApp.inject, props = GenPagesAPIGetAppGetApp.props, propsNeedCastKeys = GenPagesAPIGetAppGetApp.propsNeedCastKeys, emits = GenPagesAPIGetAppGetApp.emits, components = GenPagesAPIGetAppGetApp.components, styles = GenPagesAPIGetAppGetApp.styles);
}
, fun(instance): GenPagesAPIGetAppGetApp {
    return GenPagesAPIGetAppGetApp(instance);
}
);
val GenPagesAPIExitExitClass = CreateVueComponent(GenPagesAPIExitExit::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIExitExit.inheritAttrs, inject = GenPagesAPIExitExit.inject, props = GenPagesAPIExitExit.props, propsNeedCastKeys = GenPagesAPIExitExit.propsNeedCastKeys, emits = GenPagesAPIExitExit.emits, components = GenPagesAPIExitExit.components, styles = GenPagesAPIExitExit.styles);
}
, fun(instance): GenPagesAPIExitExit {
    return GenPagesAPIExitExit(instance);
}
);
val GenPagesAPIInstallApkInstallApkClass = CreateVueComponent(GenPagesAPIInstallApkInstallApk::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIInstallApkInstallApk.inheritAttrs, inject = GenPagesAPIInstallApkInstallApk.inject, props = GenPagesAPIInstallApkInstallApk.props, propsNeedCastKeys = GenPagesAPIInstallApkInstallApk.propsNeedCastKeys, emits = GenPagesAPIInstallApkInstallApk.emits, components = GenPagesAPIInstallApkInstallApk.components, styles = GenPagesAPIInstallApkInstallApk.styles);
}
, fun(instance): GenPagesAPIInstallApkInstallApk {
    return GenPagesAPIInstallApkInstallApk(instance);
}
);
open class PageStyleItem (
    @JsonNotNull
    open var key: String,
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var value: UTSArray<Any>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return PageStyleItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class PageStyleItemReactiveObject : PageStyleItem, IUTSReactive<PageStyleItem> {
    override var __v_raw: PageStyleItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: PageStyleItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(key = __v_raw.key, type = __v_raw.type, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): PageStyleItemReactiveObject {
        return PageStyleItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var key: String
        get() {
            return trackReactiveGet(__v_raw, "key", __v_raw.key, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("key")) {
                return;
            }
            val oldValue = __v_raw.key;
            __v_raw.key = value;
            triggerReactiveSet(__v_raw, "key", oldValue, value);
        }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var value: UTSArray<Any>
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val PageStyleArray = utsArrayOf<PageStyleItem>(PageStyleItem(key = "navigationBarBackgroundColor", type = "string", value = utsArrayOf(
    "#007AFF",
    "#FFFFFF",
    "#000000"
)), PageStyleItem(key = "navigationBarTextStyle", type = "string", value = utsArrayOf(
    "white",
    "black"
)), PageStyleItem(key = "navigationBarTitleText", type = "string", value = utsArrayOf(
    "title1",
    "title2",
    "title3"
)), PageStyleItem(key = "navigationStyle", type = "string", value = utsArrayOf(
    "default",
    "custom"
)), PageStyleItem(key = "backgroundColor", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem(key = "backgroundColorContent", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#F0F0F0",
    "#000000"
)), PageStyleItem(key = "backgroundTextStyle", type = "string", value = utsArrayOf(
    "dark",
    "light"
)), PageStyleItem(key = "enablePullDownRefresh", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem(key = "onReachBottomDistance", type = "number", value = utsArrayOf(
    50,
    100
)), PageStyleItem(key = "pageOrientation", type = "string", value = utsArrayOf(
    "auto",
    "portrait",
    "landscape"
)), PageStyleItem(key = "backgroundColorTop", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem(key = "backgroundColorBottom", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem(key = "navigationBarAutoBackButton", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem(key = "hideStatusBar", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem(key = "hideBottomNavigationIndicator", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem(key = "androidThreeButtonNavigationTranslucent", type = "boolean", value = utsArrayOf(
    true,
    false
)));
open class Page1 {
    open var route: String;
    constructor(route: String){
        this.route = route;
    }
}
val GenPagesAPIGetCurrentPagesGetCurrentPagesClass = CreateVueComponent(GenPagesAPIGetCurrentPagesGetCurrentPages::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetCurrentPagesGetCurrentPages.inheritAttrs, inject = GenPagesAPIGetCurrentPagesGetCurrentPages.inject, props = GenPagesAPIGetCurrentPagesGetCurrentPages.props, propsNeedCastKeys = GenPagesAPIGetCurrentPagesGetCurrentPages.propsNeedCastKeys, emits = GenPagesAPIGetCurrentPagesGetCurrentPages.emits, components = GenPagesAPIGetCurrentPagesGetCurrentPages.components, styles = GenPagesAPIGetCurrentPagesGetCurrentPages.styles);
}
, fun(instance): GenPagesAPIGetCurrentPagesGetCurrentPages {
    return GenPagesAPIGetCurrentPagesGetCurrentPages(instance);
}
);
open class Page2 {
    open var route: String;
    constructor(route: String){
        this.route = route;
    }
}
val GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshClass = CreateVueComponent(GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.inheritAttrs, inject = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.inject, props = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.props, propsNeedCastKeys = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.propsNeedCastKeys, emits = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.emits, components = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.components, styles = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh.styles);
}
, fun(instance): GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh {
    return GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefresh(instance);
}
);
val GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncClass = CreateVueComponent(GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.inheritAttrs, inject = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.inject, props = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.props, propsNeedCastKeys = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.propsNeedCastKeys, emits = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.emits, components = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.components, styles = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync.styles);
}
, fun(instance): GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync {
    return GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSync(instance);
}
);
val GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSyncClass = CreateVueComponent(GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.inheritAttrs, inject = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.inject, props = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.props, propsNeedCastKeys = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.propsNeedCastKeys, emits = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.emits, components = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.components, styles = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync.styles);
}
, fun(instance): GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync {
    return GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSync(instance);
}
);
val GenPagesAPIAnimationFrameAnimationFrameClass = CreateVueComponent(GenPagesAPIAnimationFrameAnimationFrame::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIAnimationFrameAnimationFrame.inheritAttrs, inject = GenPagesAPIAnimationFrameAnimationFrame.inject, props = GenPagesAPIAnimationFrameAnimationFrame.props, propsNeedCastKeys = GenPagesAPIAnimationFrameAnimationFrame.propsNeedCastKeys, emits = GenPagesAPIAnimationFrameAnimationFrame.emits, components = GenPagesAPIAnimationFrameAnimationFrame.components, styles = GenPagesAPIAnimationFrameAnimationFrame.styles);
}
, fun(instance): GenPagesAPIAnimationFrameAnimationFrame {
    return GenPagesAPIAnimationFrameAnimationFrame(instance);
}
);
typealias AnimationType = String;
val GenPagesAPINavigatorNavigatorClass = CreateVueComponent(GenPagesAPINavigatorNavigator::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPINavigatorNavigator.inheritAttrs, inject = GenPagesAPINavigatorNavigator.inject, props = GenPagesAPINavigatorNavigator.props, propsNeedCastKeys = GenPagesAPINavigatorNavigator.propsNeedCastKeys, emits = GenPagesAPINavigatorNavigator.emits, components = GenPagesAPINavigatorNavigator.components, styles = GenPagesAPINavigatorNavigator.styles);
}
, fun(instance): GenPagesAPINavigatorNavigator {
    return GenPagesAPINavigatorNavigator(instance);
}
);
val GenPagesAPISetNavigationBarColorSetNavigationBarColorClass = CreateVueComponent(GenPagesAPISetNavigationBarColorSetNavigationBarColor::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPISetNavigationBarColorSetNavigationBarColor.inheritAttrs, inject = GenPagesAPISetNavigationBarColorSetNavigationBarColor.inject, props = GenPagesAPISetNavigationBarColorSetNavigationBarColor.props, propsNeedCastKeys = GenPagesAPISetNavigationBarColorSetNavigationBarColor.propsNeedCastKeys, emits = GenPagesAPISetNavigationBarColorSetNavigationBarColor.emits, components = GenPagesAPISetNavigationBarColorSetNavigationBarColor.components, styles = GenPagesAPISetNavigationBarColorSetNavigationBarColor.styles);
}
, fun(instance): GenPagesAPISetNavigationBarColorSetNavigationBarColor {
    return GenPagesAPISetNavigationBarColorSetNavigationBarColor(instance);
}
);
val GenPagesAPISetNavigationBarTitleSetNavigationBarTitleClass = CreateVueComponent(GenPagesAPISetNavigationBarTitleSetNavigationBarTitle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.inheritAttrs, inject = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.inject, props = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.props, propsNeedCastKeys = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.propsNeedCastKeys, emits = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.emits, components = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.components, styles = GenPagesAPISetNavigationBarTitleSetNavigationBarTitle.styles);
}
, fun(instance): GenPagesAPISetNavigationBarTitleSetNavigationBarTitle {
    return GenPagesAPISetNavigationBarTitleSetNavigationBarTitle(instance);
}
);
val GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContentClass = CreateVueComponent(GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.inheritAttrs, inject = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.inject, props = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.props, propsNeedCastKeys = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.propsNeedCastKeys, emits = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.emits, components = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.components, styles = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent.styles);
}
, fun(instance): GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent {
    return GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContent(instance);
}
);
val GenPagesAPINavigatorNewPageNewPage1Class = CreateVueComponent(GenPagesAPINavigatorNewPageNewPage1::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPINavigatorNewPageNewPage1.inheritAttrs, inject = GenPagesAPINavigatorNewPageNewPage1.inject, props = GenPagesAPINavigatorNewPageNewPage1.props, propsNeedCastKeys = GenPagesAPINavigatorNewPageNewPage1.propsNeedCastKeys, emits = GenPagesAPINavigatorNewPageNewPage1.emits, components = GenPagesAPINavigatorNewPageNewPage1.components, styles = GenPagesAPINavigatorNewPageNewPage1.styles);
}
, fun(instance): GenPagesAPINavigatorNewPageNewPage1 {
    return GenPagesAPINavigatorNewPageNewPage1(instance);
}
);
val GenPagesAPINavigatorNewPageNewPage3Class = CreateVueComponent(GenPagesAPINavigatorNewPageNewPage3::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPINavigatorNewPageNewPage3.inheritAttrs, inject = GenPagesAPINavigatorNewPageNewPage3.inject, props = GenPagesAPINavigatorNewPageNewPage3.props, propsNeedCastKeys = GenPagesAPINavigatorNewPageNewPage3.propsNeedCastKeys, emits = GenPagesAPINavigatorNewPageNewPage3.emits, components = GenPagesAPINavigatorNewPageNewPage3.components, styles = GenPagesAPINavigatorNewPageNewPage3.styles);
}
, fun(instance): GenPagesAPINavigatorNewPageNewPage3 {
    return GenPagesAPINavigatorNewPageNewPage3(instance);
}
);
val GenPagesAPINavigatorNewPageOnLoadClass = CreateVueComponent(GenPagesAPINavigatorNewPageOnLoad::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPINavigatorNewPageOnLoad.inheritAttrs, inject = GenPagesAPINavigatorNewPageOnLoad.inject, props = GenPagesAPINavigatorNewPageOnLoad.props, propsNeedCastKeys = GenPagesAPINavigatorNewPageOnLoad.propsNeedCastKeys, emits = GenPagesAPINavigatorNewPageOnLoad.emits, components = GenPagesAPINavigatorNewPageOnLoad.components, styles = GenPagesAPINavigatorNewPageOnLoad.styles);
}
, fun(instance): GenPagesAPINavigatorNewPageOnLoad {
    return GenPagesAPINavigatorNewPageOnLoad(instance);
}
);
val GenPagesAPIPullDownRefreshPullDownRefreshClass = CreateVueComponent(GenPagesAPIPullDownRefreshPullDownRefresh::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIPullDownRefreshPullDownRefresh.inheritAttrs, inject = GenPagesAPIPullDownRefreshPullDownRefresh.inject, props = GenPagesAPIPullDownRefreshPullDownRefresh.props, propsNeedCastKeys = GenPagesAPIPullDownRefreshPullDownRefresh.propsNeedCastKeys, emits = GenPagesAPIPullDownRefreshPullDownRefresh.emits, components = GenPagesAPIPullDownRefreshPullDownRefresh.components, styles = GenPagesAPIPullDownRefreshPullDownRefresh.styles);
}
, fun(instance): GenPagesAPIPullDownRefreshPullDownRefresh {
    return GenPagesAPIPullDownRefreshPullDownRefresh(instance);
}
);
val GenPagesAPIStorageStorageClass = CreateVueComponent(GenPagesAPIStorageStorage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIStorageStorage.inheritAttrs, inject = GenPagesAPIStorageStorage.inject, props = GenPagesAPIStorageStorage.props, propsNeedCastKeys = GenPagesAPIStorageStorage.propsNeedCastKeys, emits = GenPagesAPIStorageStorage.emits, components = GenPagesAPIStorageStorage.components, styles = GenPagesAPIStorageStorage.styles);
}
, fun(instance): GenPagesAPIStorageStorage {
    return GenPagesAPIStorageStorage(instance);
}
);
val GenPagesAPIGetFileSystemManagerGetFileSystemManagerClass = CreateVueComponent(GenPagesAPIGetFileSystemManagerGetFileSystemManager::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetFileSystemManagerGetFileSystemManager.inheritAttrs, inject = GenPagesAPIGetFileSystemManagerGetFileSystemManager.inject, props = GenPagesAPIGetFileSystemManagerGetFileSystemManager.props, propsNeedCastKeys = GenPagesAPIGetFileSystemManagerGetFileSystemManager.propsNeedCastKeys, emits = GenPagesAPIGetFileSystemManagerGetFileSystemManager.emits, components = GenPagesAPIGetFileSystemManagerGetFileSystemManager.components, styles = GenPagesAPIGetFileSystemManagerGetFileSystemManager.styles);
}
, fun(instance): GenPagesAPIGetFileSystemManagerGetFileSystemManager {
    return GenPagesAPIGetFileSystemManagerGetFileSystemManager(instance);
}
);
val GenPagesAPIEnvEnvClass = CreateVueComponent(GenPagesAPIEnvEnv::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIEnvEnv.inheritAttrs, inject = GenPagesAPIEnvEnv.inject, props = GenPagesAPIEnvEnv.props, propsNeedCastKeys = GenPagesAPIEnvEnv.propsNeedCastKeys, emits = GenPagesAPIEnvEnv.emits, components = GenPagesAPIEnvEnv.components, styles = GenPagesAPIEnvEnv.styles);
}
, fun(instance): GenPagesAPIEnvEnv {
    return GenPagesAPIEnvEnv(instance);
}
);
open class ItemType3 (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType3ReactiveObject : ItemType3, IUTSReactive<ItemType3> {
    override var __v_raw: ItemType3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType3ReactiveObject {
        return ItemType3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIShowActionSheetShowActionSheetClass = CreateVueComponent(GenPagesAPIShowActionSheetShowActionSheet::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIShowActionSheetShowActionSheet.inheritAttrs, inject = GenPagesAPIShowActionSheetShowActionSheet.inject, props = GenPagesAPIShowActionSheetShowActionSheet.props, propsNeedCastKeys = GenPagesAPIShowActionSheetShowActionSheet.propsNeedCastKeys, emits = GenPagesAPIShowActionSheetShowActionSheet.emits, components = GenPagesAPIShowActionSheetShowActionSheet.components, styles = GenPagesAPIShowActionSheetShowActionSheet.styles);
}
, fun(instance): GenPagesAPIShowActionSheetShowActionSheet {
    return GenPagesAPIShowActionSheetShowActionSheet(instance);
}
);
open class ItemType4 (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType4ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType4ReactiveObject : ItemType4, IUTSReactive<ItemType4> {
    override var __v_raw: ItemType4;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType4, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType4ReactiveObject {
        return ItemType4ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIShowModalShowModalClass = CreateVueComponent(GenPagesAPIShowModalShowModal::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIShowModalShowModal.inheritAttrs, inject = GenPagesAPIShowModalShowModal.inject, props = GenPagesAPIShowModalShowModal.props, propsNeedCastKeys = GenPagesAPIShowModalShowModal.propsNeedCastKeys, emits = GenPagesAPIShowModalShowModal.emits, components = GenPagesAPIShowModalShowModal.components, styles = GenPagesAPIShowModalShowModal.styles);
}
, fun(instance): GenPagesAPIShowModalShowModal {
    return GenPagesAPIShowModalShowModal(instance);
}
);
open class ItemType5 (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType5ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType5ReactiveObject : ItemType5, IUTSReactive<ItemType5> {
    override var __v_raw: ItemType5;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType5, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType5ReactiveObject {
        return ItemType5ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIShowLoadingShowLoadingClass = CreateVueComponent(GenPagesAPIShowLoadingShowLoading::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIShowLoadingShowLoading.inheritAttrs, inject = GenPagesAPIShowLoadingShowLoading.inject, props = GenPagesAPIShowLoadingShowLoading.props, propsNeedCastKeys = GenPagesAPIShowLoadingShowLoading.propsNeedCastKeys, emits = GenPagesAPIShowLoadingShowLoading.emits, components = GenPagesAPIShowLoadingShowLoading.components, styles = GenPagesAPIShowLoadingShowLoading.styles);
}
, fun(instance): GenPagesAPIShowLoadingShowLoading {
    return GenPagesAPIShowLoadingShowLoading(instance);
}
);
open class IconItemType (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return IconItemTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class IconItemTypeReactiveObject : IconItemType, IUTSReactive<IconItemType> {
    override var __v_raw: IconItemType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: IconItemType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): IconItemTypeReactiveObject {
        return IconItemTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
open class PositionItemType (
    @JsonNotNull
    open var value: String,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return PositionItemTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class PositionItemTypeReactiveObject : PositionItemType, IUTSReactive<PositionItemType> {
    override var __v_raw: PositionItemType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: PositionItemType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): PositionItemTypeReactiveObject {
        return PositionItemTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIShowToastShowToastClass = CreateVueComponent(GenPagesAPIShowToastShowToast::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIShowToastShowToast.inheritAttrs, inject = GenPagesAPIShowToastShowToast.inject, props = GenPagesAPIShowToastShowToast.props, propsNeedCastKeys = GenPagesAPIShowToastShowToast.propsNeedCastKeys, emits = GenPagesAPIShowToastShowToast.emits, components = GenPagesAPIShowToastShowToast.components, styles = GenPagesAPIShowToastShowToast.styles);
}
, fun(instance): GenPagesAPIShowToastShowToast {
    return GenPagesAPIShowToastShowToast(instance);
}
);
val GenPagesAPILoadFontFaceLoadFontFaceClass = CreateVueComponent(GenPagesAPILoadFontFaceLoadFontFace::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPILoadFontFaceLoadFontFace.inheritAttrs, inject = GenPagesAPILoadFontFaceLoadFontFace.inject, props = GenPagesAPILoadFontFaceLoadFontFace.props, propsNeedCastKeys = GenPagesAPILoadFontFaceLoadFontFace.propsNeedCastKeys, emits = GenPagesAPILoadFontFaceLoadFontFace.emits, components = GenPagesAPILoadFontFaceLoadFontFace.components, styles = GenPagesAPILoadFontFaceLoadFontFace.styles);
}
, fun(instance): GenPagesAPILoadFontFaceLoadFontFace {
    return GenPagesAPILoadFontFaceLoadFontFace(instance);
}
);
val GenPagesAPILoadFontFaceLoadFontFaceChildClass = CreateVueComponent(GenPagesAPILoadFontFaceLoadFontFaceChild::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPILoadFontFaceLoadFontFaceChild.inheritAttrs, inject = GenPagesAPILoadFontFaceLoadFontFaceChild.inject, props = GenPagesAPILoadFontFaceLoadFontFaceChild.props, propsNeedCastKeys = GenPagesAPILoadFontFaceLoadFontFaceChild.propsNeedCastKeys, emits = GenPagesAPILoadFontFaceLoadFontFaceChild.emits, components = GenPagesAPILoadFontFaceLoadFontFaceChild.components, styles = GenPagesAPILoadFontFaceLoadFontFaceChild.styles);
}
, fun(instance): GenPagesAPILoadFontFaceLoadFontFaceChild {
    return GenPagesAPILoadFontFaceLoadFontFaceChild(instance);
}
);
typealias GetLocationType = String;
open class LocationItem (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    open var provider: UniProvider? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return LocationItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class LocationItemReactiveObject : LocationItem, IUTSReactive<LocationItem> {
    override var __v_raw: LocationItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: LocationItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, name = __v_raw.name, provider = __v_raw.provider) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): LocationItemReactiveObject {
        return LocationItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var provider: UniProvider?
        get() {
            return trackReactiveGet(__v_raw, "provider", __v_raw.provider, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("provider")) {
                return;
            }
            val oldValue = __v_raw.provider;
            __v_raw.provider = value;
            triggerReactiveSet(__v_raw, "provider", oldValue, value);
        }
}
open class ItemType6 (
    @JsonNotNull
    open var value: GetLocationType,
    @JsonNotNull
    open var name: GetLocationType,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType6ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType6ReactiveObject : ItemType6, IUTSReactive<ItemType6> {
    override var __v_raw: ItemType6;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType6, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType6ReactiveObject {
        return ItemType6ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: GetLocationType
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: GetLocationType
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIGetLocationGetLocationClass = CreateVueComponent(GenPagesAPIGetLocationGetLocation::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetLocationGetLocation.inheritAttrs, inject = GenPagesAPIGetLocationGetLocation.inject, props = GenPagesAPIGetLocationGetLocation.props, propsNeedCastKeys = GenPagesAPIGetLocationGetLocation.propsNeedCastKeys, emits = GenPagesAPIGetLocationGetLocation.emits, components = GenPagesAPIGetLocationGetLocation.components, styles = GenPagesAPIGetLocationGetLocation.styles);
}
, fun(instance): GenPagesAPIGetLocationGetLocation {
    return GenPagesAPIGetLocationGetLocation(instance);
}
);
val GenPagesAPIOpenLocationOpenLocationClass = CreateVueComponent(GenPagesAPIOpenLocationOpenLocation::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIOpenLocationOpenLocation.inheritAttrs, inject = GenPagesAPIOpenLocationOpenLocation.inject, props = GenPagesAPIOpenLocationOpenLocation.props, propsNeedCastKeys = GenPagesAPIOpenLocationOpenLocation.propsNeedCastKeys, emits = GenPagesAPIOpenLocationOpenLocation.emits, components = GenPagesAPIOpenLocationOpenLocation.components, styles = GenPagesAPIOpenLocationOpenLocation.styles);
}
, fun(instance): GenPagesAPIOpenLocationOpenLocation {
    return GenPagesAPIOpenLocationOpenLocation(instance);
}
);
open class Location (
    @JsonNotNull
    open var latitude: UTSArray<String>,
    @JsonNotNull
    open var longitude: UTSArray<String>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return LocationReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class LocationReactiveObject : Location, IUTSReactive<Location> {
    override var __v_raw: Location;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Location, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(latitude = __v_raw.latitude, longitude = __v_raw.longitude) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): LocationReactiveObject {
        return LocationReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var latitude: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "latitude", __v_raw.latitude, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("latitude")) {
                return;
            }
            val oldValue = __v_raw.latitude;
            __v_raw.latitude = value;
            triggerReactiveSet(__v_raw, "latitude", oldValue, value);
        }
    override var longitude: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "longitude", __v_raw.longitude, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("longitude")) {
                return;
            }
            val oldValue = __v_raw.longitude;
            __v_raw.longitude = value;
            triggerReactiveSet(__v_raw, "longitude", oldValue, value);
        }
}
val GenPagesAPIChooseLocationChooseLocationClass = CreateVueComponent(GenPagesAPIChooseLocationChooseLocation::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIChooseLocationChooseLocation.inheritAttrs, inject = GenPagesAPIChooseLocationChooseLocation.inject, props = GenPagesAPIChooseLocationChooseLocation.props, propsNeedCastKeys = GenPagesAPIChooseLocationChooseLocation.propsNeedCastKeys, emits = GenPagesAPIChooseLocationChooseLocation.emits, components = GenPagesAPIChooseLocationChooseLocation.components, styles = GenPagesAPIChooseLocationChooseLocation.styles);
}
, fun(instance): GenPagesAPIChooseLocationChooseLocation {
    return GenPagesAPIChooseLocationChooseLocation(instance);
}
);
val navigateToInterceptor = AddInterceptorOptions(invoke = fun(options: NavigateToOptions) {
    console.log("拦截 navigateTo 接口传入参数为：", options);
    val url = "./page2";
    uni_showToast(ShowToastOptions(title = "\u91CD\u5B9A\u5411\u5230\u9875\u9762:" + url));
    options.url = url;
}
, success = fun(res: NavigateToSuccess) {
    console.log("拦截 navigateTo 接口 success 返回参数为：", res);
}
, fail = fun(err: NavigateToFail) {
    console.log("拦截 navigateTo 接口 fail 返回参数为：", err);
}
, complete = fun(res: NavigateToComplete) {
    console.log("拦截 navigateTo 接口 complete 返回参数为：", res);
}
);
val switchTabInterceptor = AddInterceptorOptions(invoke = fun(options: SwitchTabOptions) {
    console.log("拦截 switchTab 接口传入参数为：", options);
    options.url = "/pages/tabBar/API";
}
, success = fun(res: SwitchTabSuccess) {
    console.log("拦截 switchTab 接口 success 返回参数为：", res);
}
, fail = fun(err: SwitchTabFail) {
    console.log("拦截 switchTab 接口 fail 返回参数为：", err);
}
, complete = fun(res: SwitchTabComplete) {
    console.log("拦截 switchTab 接口 complete 返回参数为：", res);
}
);
val GenPagesAPIInterceptorInterceptorClass = CreateVueComponent(GenPagesAPIInterceptorInterceptor::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIInterceptorInterceptor.inheritAttrs, inject = GenPagesAPIInterceptorInterceptor.inject, props = GenPagesAPIInterceptorInterceptor.props, propsNeedCastKeys = GenPagesAPIInterceptorInterceptor.propsNeedCastKeys, emits = GenPagesAPIInterceptorInterceptor.emits, components = GenPagesAPIInterceptorInterceptor.components, styles = GenPagesAPIInterceptorInterceptor.styles);
}
, fun(instance): GenPagesAPIInterceptorInterceptor {
    return GenPagesAPIInterceptorInterceptor(instance);
}
);
val GenPagesAPIInterceptorPage1Class = CreateVueComponent(GenPagesAPIInterceptorPage1::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIInterceptorPage1.inheritAttrs, inject = GenPagesAPIInterceptorPage1.inject, props = GenPagesAPIInterceptorPage1.props, propsNeedCastKeys = GenPagesAPIInterceptorPage1.propsNeedCastKeys, emits = GenPagesAPIInterceptorPage1.emits, components = GenPagesAPIInterceptorPage1.components, styles = GenPagesAPIInterceptorPage1.styles);
}
, fun(instance): GenPagesAPIInterceptorPage1 {
    return GenPagesAPIInterceptorPage1(instance);
}
);
val GenPagesAPIInterceptorPage2Class = CreateVueComponent(GenPagesAPIInterceptorPage2::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIInterceptorPage2.inheritAttrs, inject = GenPagesAPIInterceptorPage2.inject, props = GenPagesAPIInterceptorPage2.props, propsNeedCastKeys = GenPagesAPIInterceptorPage2.propsNeedCastKeys, emits = GenPagesAPIInterceptorPage2.emits, components = GenPagesAPIInterceptorPage2.components, styles = GenPagesAPIInterceptorPage2.styles);
}
, fun(instance): GenPagesAPIInterceptorPage2 {
    return GenPagesAPIInterceptorPage2(instance);
}
);
open class GETDataType {
    open var data: UTSJSONObject? = null;
}
val duration: Number = 2000;
val methodMap: UTSJSONObject = object : UTSJSONObject() {
    var GET = "/api/http/method/get"
    var POST = "/api/http/method/post"
    var PUT = "/api/http/method/put"
    var DELETE = "/api/http/method/delete"
    var PATCH = "/api/http/method/patch"
    var OPTIONS = "/api/http/method/options"
    var HEAD = "/api/http/method/head"
};
val GenPagesAPIRequestRequestClass = CreateVueComponent(GenPagesAPIRequestRequest::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIRequestRequest.inheritAttrs, inject = GenPagesAPIRequestRequest.inject, props = GenPagesAPIRequestRequest.props, propsNeedCastKeys = GenPagesAPIRequestRequest.propsNeedCastKeys, emits = GenPagesAPIRequestRequest.emits, components = GenPagesAPIRequestRequest.components, styles = GenPagesAPIRequestRequest.styles);
}
, fun(instance): GenPagesAPIRequestRequest {
    return GenPagesAPIRequestRequest(instance);
}
);
val GenPagesAPIUploadFileUploadFileClass = CreateVueComponent(GenPagesAPIUploadFileUploadFile::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUploadFileUploadFile.inheritAttrs, inject = GenPagesAPIUploadFileUploadFile.inject, props = GenPagesAPIUploadFileUploadFile.props, propsNeedCastKeys = GenPagesAPIUploadFileUploadFile.propsNeedCastKeys, emits = GenPagesAPIUploadFileUploadFile.emits, components = GenPagesAPIUploadFileUploadFile.components, styles = GenPagesAPIUploadFileUploadFile.styles);
}
, fun(instance): GenPagesAPIUploadFileUploadFile {
    return GenPagesAPIUploadFileUploadFile(instance);
}
);
val GenPagesAPIDownloadFileDownloadFileClass = CreateVueComponent(GenPagesAPIDownloadFileDownloadFile::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDownloadFileDownloadFile.inheritAttrs, inject = GenPagesAPIDownloadFileDownloadFile.inject, props = GenPagesAPIDownloadFileDownloadFile.props, propsNeedCastKeys = GenPagesAPIDownloadFileDownloadFile.propsNeedCastKeys, emits = GenPagesAPIDownloadFileDownloadFile.emits, components = GenPagesAPIDownloadFileDownloadFile.components, styles = GenPagesAPIDownloadFileDownloadFile.styles);
}
, fun(instance): GenPagesAPIDownloadFileDownloadFile {
    return GenPagesAPIDownloadFileDownloadFile(instance);
}
);
val GenPagesAPIWebsocketSocketTaskClass = CreateVueComponent(GenPagesAPIWebsocketSocketTask::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIWebsocketSocketTask.inheritAttrs, inject = GenPagesAPIWebsocketSocketTask.inject, props = GenPagesAPIWebsocketSocketTask.props, propsNeedCastKeys = GenPagesAPIWebsocketSocketTask.propsNeedCastKeys, emits = GenPagesAPIWebsocketSocketTask.emits, components = GenPagesAPIWebsocketSocketTask.components, styles = GenPagesAPIWebsocketSocketTask.styles);
}
, fun(instance): GenPagesAPIWebsocketSocketTask {
    return GenPagesAPIWebsocketSocketTask(instance);
}
);
val GenPagesAPIWebsocketWebsocketClass = CreateVueComponent(GenPagesAPIWebsocketWebsocket::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIWebsocketWebsocket.inheritAttrs, inject = GenPagesAPIWebsocketWebsocket.inject, props = GenPagesAPIWebsocketWebsocket.props, propsNeedCastKeys = GenPagesAPIWebsocketWebsocket.propsNeedCastKeys, emits = GenPagesAPIWebsocketWebsocket.emits, components = GenPagesAPIWebsocketWebsocket.components, styles = GenPagesAPIWebsocketWebsocket.styles);
}
, fun(instance): GenPagesAPIWebsocketWebsocket {
    return GenPagesAPIWebsocketWebsocket(instance);
}
);
val GenPagesAPIUnicloudUnicloudCloudFunctionClass = CreateVueComponent(GenPagesAPIUnicloudUnicloudCloudFunction::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUnicloudUnicloudCloudFunction.inheritAttrs, inject = GenPagesAPIUnicloudUnicloudCloudFunction.inject, props = GenPagesAPIUnicloudUnicloudCloudFunction.props, propsNeedCastKeys = GenPagesAPIUnicloudUnicloudCloudFunction.propsNeedCastKeys, emits = GenPagesAPIUnicloudUnicloudCloudFunction.emits, components = GenPagesAPIUnicloudUnicloudCloudFunction.components, styles = GenPagesAPIUnicloudUnicloudCloudFunction.styles);
}
, fun(instance): GenPagesAPIUnicloudUnicloudCloudFunction {
    return GenPagesAPIUnicloudUnicloudCloudFunction(instance);
}
);
val GenPagesAPIUnicloudUnicloudCloudObjectClass = CreateVueComponent(GenPagesAPIUnicloudUnicloudCloudObject::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUnicloudUnicloudCloudObject.inheritAttrs, inject = GenPagesAPIUnicloudUnicloudCloudObject.inject, props = GenPagesAPIUnicloudUnicloudCloudObject.props, propsNeedCastKeys = GenPagesAPIUnicloudUnicloudCloudObject.propsNeedCastKeys, emits = GenPagesAPIUnicloudUnicloudCloudObject.emits, components = GenPagesAPIUnicloudUnicloudCloudObject.components, styles = GenPagesAPIUnicloudUnicloudCloudObject.styles);
}
, fun(instance): GenPagesAPIUnicloudUnicloudCloudObject {
    return GenPagesAPIUnicloudUnicloudCloudObject(instance);
}
);
open class Item2 (
    @JsonNotNull
    open var label: String,
    @JsonNotNull
    open var value: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item2ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item2ReactiveObject : Item2, IUTSReactive<Item2> {
    override var __v_raw: Item2;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item2, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(label = __v_raw.label, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item2ReactiveObject {
        return Item2ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
var globalScreenHeight: Number = 0;
val runBlock3 = run {
    try {
        globalScreenHeight = uni_getWindowInfo().screenHeight;
    }
     catch (e: Throwable) {
        console.error(e);
    }
}
val GenPagesAPIGetSystemInfoGetSystemInfoClass = CreateVueComponent(GenPagesAPIGetSystemInfoGetSystemInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetSystemInfoGetSystemInfo.inheritAttrs, inject = GenPagesAPIGetSystemInfoGetSystemInfo.inject, props = GenPagesAPIGetSystemInfoGetSystemInfo.props, propsNeedCastKeys = GenPagesAPIGetSystemInfoGetSystemInfo.propsNeedCastKeys, emits = GenPagesAPIGetSystemInfoGetSystemInfo.emits, components = GenPagesAPIGetSystemInfoGetSystemInfo.components, styles = GenPagesAPIGetSystemInfoGetSystemInfo.styles);
}
, fun(instance): GenPagesAPIGetSystemInfoGetSystemInfo {
    return GenPagesAPIGetSystemInfoGetSystemInfo(instance);
}
);
open class Item3 (
    @JsonNotNull
    open var label: String,
    @JsonNotNull
    open var value: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item3ReactiveObject : Item3, IUTSReactive<Item3> {
    override var __v_raw: Item3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(label = __v_raw.label, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item3ReactiveObject {
        return Item3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val GenPagesAPIGetDeviceInfoGetDeviceInfoClass = CreateVueComponent(GenPagesAPIGetDeviceInfoGetDeviceInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetDeviceInfoGetDeviceInfo.inheritAttrs, inject = GenPagesAPIGetDeviceInfoGetDeviceInfo.inject, props = GenPagesAPIGetDeviceInfoGetDeviceInfo.props, propsNeedCastKeys = GenPagesAPIGetDeviceInfoGetDeviceInfo.propsNeedCastKeys, emits = GenPagesAPIGetDeviceInfoGetDeviceInfo.emits, components = GenPagesAPIGetDeviceInfoGetDeviceInfo.components, styles = GenPagesAPIGetDeviceInfoGetDeviceInfo.styles);
}
, fun(instance): GenPagesAPIGetDeviceInfoGetDeviceInfo {
    return GenPagesAPIGetDeviceInfoGetDeviceInfo(instance);
}
);
open class Item4 (
    @JsonNotNull
    open var label: String,
    @JsonNotNull
    open var value: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item4ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item4ReactiveObject : Item4, IUTSReactive<Item4> {
    override var __v_raw: Item4;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item4, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(label = __v_raw.label, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item4ReactiveObject {
        return Item4ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val GenPagesAPIGetAppBaseInfoGetAppBaseInfoClass = CreateVueComponent(GenPagesAPIGetAppBaseInfoGetAppBaseInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.inheritAttrs, inject = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.inject, props = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.props, propsNeedCastKeys = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.propsNeedCastKeys, emits = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.emits, components = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.components, styles = GenPagesAPIGetAppBaseInfoGetAppBaseInfo.styles);
}
, fun(instance): GenPagesAPIGetAppBaseInfoGetAppBaseInfo {
    return GenPagesAPIGetAppBaseInfoGetAppBaseInfo(instance);
}
);
val GenPagesAPIGetSystemSettingGetSystemSettingClass = CreateVueComponent(GenPagesAPIGetSystemSettingGetSystemSetting::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetSystemSettingGetSystemSetting.inheritAttrs, inject = GenPagesAPIGetSystemSettingGetSystemSetting.inject, props = GenPagesAPIGetSystemSettingGetSystemSetting.props, propsNeedCastKeys = GenPagesAPIGetSystemSettingGetSystemSetting.propsNeedCastKeys, emits = GenPagesAPIGetSystemSettingGetSystemSetting.emits, components = GenPagesAPIGetSystemSettingGetSystemSetting.components, styles = GenPagesAPIGetSystemSettingGetSystemSetting.styles);
}
, fun(instance): GenPagesAPIGetSystemSettingGetSystemSetting {
    return GenPagesAPIGetSystemSettingGetSystemSetting(instance);
}
);
val GenPagesAPIElementTakesnapshotElementTakesnapshotClass = CreateVueComponent(GenPagesAPIElementTakesnapshotElementTakesnapshot::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIElementTakesnapshotElementTakesnapshot.inheritAttrs, inject = GenPagesAPIElementTakesnapshotElementTakesnapshot.inject, props = GenPagesAPIElementTakesnapshotElementTakesnapshot.props, propsNeedCastKeys = GenPagesAPIElementTakesnapshotElementTakesnapshot.propsNeedCastKeys, emits = GenPagesAPIElementTakesnapshotElementTakesnapshot.emits, components = GenPagesAPIElementTakesnapshotElementTakesnapshot.components, styles = GenPagesAPIElementTakesnapshotElementTakesnapshot.styles);
}
, fun(instance): GenPagesAPIElementTakesnapshotElementTakesnapshot {
    return GenPagesAPIElementTakesnapshotElementTakesnapshot(instance);
}
);
open class DomRectType (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var right: Number,
    @JsonNotNull
    open var bottom: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return DomRectTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class DomRectTypeReactiveObject : DomRectType, IUTSReactive<DomRectType> {
    override var __v_raw: DomRectType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: DomRectType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, y = __v_raw.y, left = __v_raw.left, top = __v_raw.top, right = __v_raw.right, bottom = __v_raw.bottom, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): DomRectTypeReactiveObject {
        return DomRectTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var y: Number
        get() {
            return trackReactiveGet(__v_raw, "y", __v_raw.y, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("y")) {
                return;
            }
            val oldValue = __v_raw.y;
            __v_raw.y = value;
            triggerReactiveSet(__v_raw, "y", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var right: Number
        get() {
            return trackReactiveGet(__v_raw, "right", __v_raw.right, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("right")) {
                return;
            }
            val oldValue = __v_raw.right;
            __v_raw.right = value;
            triggerReactiveSet(__v_raw, "right", oldValue, value);
        }
    override var bottom: Number
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
val GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncClass = CreateVueComponent(GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.inheritAttrs, inject = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.inject, props = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.props, propsNeedCastKeys = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.propsNeedCastKeys, emits = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.emits, components = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.components, styles = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync.styles);
}
, fun(instance): GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync {
    return GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsync(instance);
}
);
val GenPagesAPIElementGetAttributeElementGetAttributeClass = CreateVueComponent(GenPagesAPIElementGetAttributeElementGetAttribute::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIElementGetAttributeElementGetAttribute.inheritAttrs, inject = GenPagesAPIElementGetAttributeElementGetAttribute.inject, props = GenPagesAPIElementGetAttributeElementGetAttribute.props, propsNeedCastKeys = GenPagesAPIElementGetAttributeElementGetAttribute.propsNeedCastKeys, emits = GenPagesAPIElementGetAttributeElementGetAttribute.emits, components = GenPagesAPIElementGetAttributeElementGetAttribute.components, styles = GenPagesAPIElementGetAttributeElementGetAttribute.styles);
}
, fun(instance): GenPagesAPIElementGetAttributeElementGetAttribute {
    return GenPagesAPIElementGetAttributeElementGetAttribute(instance);
}
);
val GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSettingClass = CreateVueComponent(GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.inheritAttrs, inject = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.inject, props = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.props, propsNeedCastKeys = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.propsNeedCastKeys, emits = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.emits, components = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.components, styles = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting.styles);
}
, fun(instance): GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting {
    return GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSetting(instance);
}
);
typealias Indicator = String;
open class ItemType7 (
    @JsonNotNull
    open var value: Indicator,
    @JsonNotNull
    open var name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ItemType7ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ItemType7ReactiveObject : ItemType7, IUTSReactive<ItemType7> {
    override var __v_raw: ItemType7;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ItemType7, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(value = __v_raw.value, name = __v_raw.name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ItemType7ReactiveObject {
        return ItemType7ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var value: Indicator
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
}
val GenPagesAPIPreviewImagePreviewImageClass = CreateVueComponent(GenPagesAPIPreviewImagePreviewImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIPreviewImagePreviewImage.inheritAttrs, inject = GenPagesAPIPreviewImagePreviewImage.inject, props = GenPagesAPIPreviewImagePreviewImage.props, propsNeedCastKeys = GenPagesAPIPreviewImagePreviewImage.propsNeedCastKeys, emits = GenPagesAPIPreviewImagePreviewImage.emits, components = GenPagesAPIPreviewImagePreviewImage.components, styles = GenPagesAPIPreviewImagePreviewImage.styles);
}
, fun(instance): GenPagesAPIPreviewImagePreviewImage {
    return GenPagesAPIPreviewImagePreviewImage(instance);
}
);
var sourceTypeArray = utsArrayOf(
    utsArrayOf(
        "camera"
    ),
    utsArrayOf(
        "album"
    ),
    utsArrayOf(
        "camera",
        "album"
    )
);
var sizeTypeArray = utsArrayOf(
    utsArrayOf(
        "compressed"
    ),
    utsArrayOf(
        "original"
    ),
    utsArrayOf(
        "compressed",
        "original"
    )
);
var orientationTypeArray = utsArrayOf(
    "portrait",
    "landscape",
    "auto"
);
var albumModeTypeArray = utsArrayOf(
    "custom",
    "system"
);
val GenPagesAPIChooseImageChooseImageClass = CreateVueComponent(GenPagesAPIChooseImageChooseImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIChooseImageChooseImage.inheritAttrs, inject = GenPagesAPIChooseImageChooseImage.inject, props = GenPagesAPIChooseImageChooseImage.props, propsNeedCastKeys = GenPagesAPIChooseImageChooseImage.propsNeedCastKeys, emits = GenPagesAPIChooseImageChooseImage.emits, components = GenPagesAPIChooseImageChooseImage.components, styles = GenPagesAPIChooseImageChooseImage.styles);
}
, fun(instance): GenPagesAPIChooseImageChooseImage {
    return GenPagesAPIChooseImageChooseImage(instance);
}
);
val GenPagesAPIGetImageInfoGetImageInfoClass = CreateVueComponent(GenPagesAPIGetImageInfoGetImageInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetImageInfoGetImageInfo.inheritAttrs, inject = GenPagesAPIGetImageInfoGetImageInfo.inject, props = GenPagesAPIGetImageInfoGetImageInfo.props, propsNeedCastKeys = GenPagesAPIGetImageInfoGetImageInfo.propsNeedCastKeys, emits = GenPagesAPIGetImageInfoGetImageInfo.emits, components = GenPagesAPIGetImageInfoGetImageInfo.components, styles = GenPagesAPIGetImageInfoGetImageInfo.styles);
}
, fun(instance): GenPagesAPIGetImageInfoGetImageInfo {
    return GenPagesAPIGetImageInfoGetImageInfo(instance);
}
);
val GenPagesAPICompressImageCompressImageClass = CreateVueComponent(GenPagesAPICompressImageCompressImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICompressImageCompressImage.inheritAttrs, inject = GenPagesAPICompressImageCompressImage.inject, props = GenPagesAPICompressImageCompressImage.props, propsNeedCastKeys = GenPagesAPICompressImageCompressImage.propsNeedCastKeys, emits = GenPagesAPICompressImageCompressImage.emits, components = GenPagesAPICompressImageCompressImage.components, styles = GenPagesAPICompressImageCompressImage.styles);
}
, fun(instance): GenPagesAPICompressImageCompressImage {
    return GenPagesAPICompressImageCompressImage(instance);
}
);
typealias Camera = String;
typealias Source = String;
val GenPagesAPIChooseVideoChooseVideoClass = CreateVueComponent(GenPagesAPIChooseVideoChooseVideo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIChooseVideoChooseVideo.inheritAttrs, inject = GenPagesAPIChooseVideoChooseVideo.inject, props = GenPagesAPIChooseVideoChooseVideo.props, propsNeedCastKeys = GenPagesAPIChooseVideoChooseVideo.propsNeedCastKeys, emits = GenPagesAPIChooseVideoChooseVideo.emits, components = GenPagesAPIChooseVideoChooseVideo.components, styles = GenPagesAPIChooseVideoChooseVideo.styles);
}
, fun(instance): GenPagesAPIChooseVideoChooseVideo {
    return GenPagesAPIChooseVideoChooseVideo(instance);
}
);
val GenPagesAPICompressVideoCompressVideoClass = CreateVueComponent(GenPagesAPICompressVideoCompressVideo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICompressVideoCompressVideo.inheritAttrs, inject = GenPagesAPICompressVideoCompressVideo.inject, props = GenPagesAPICompressVideoCompressVideo.props, propsNeedCastKeys = GenPagesAPICompressVideoCompressVideo.propsNeedCastKeys, emits = GenPagesAPICompressVideoCompressVideo.emits, components = GenPagesAPICompressVideoCompressVideo.components, styles = GenPagesAPICompressVideoCompressVideo.styles);
}
, fun(instance): GenPagesAPICompressVideoCompressVideo {
    return GenPagesAPICompressVideoCompressVideo(instance);
}
);
val GenPagesAPIGetNetworkTypeGetNetworkTypeClass = CreateVueComponent(GenPagesAPIGetNetworkTypeGetNetworkType::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetNetworkTypeGetNetworkType.inheritAttrs, inject = GenPagesAPIGetNetworkTypeGetNetworkType.inject, props = GenPagesAPIGetNetworkTypeGetNetworkType.props, propsNeedCastKeys = GenPagesAPIGetNetworkTypeGetNetworkType.propsNeedCastKeys, emits = GenPagesAPIGetNetworkTypeGetNetworkType.emits, components = GenPagesAPIGetNetworkTypeGetNetworkType.components, styles = GenPagesAPIGetNetworkTypeGetNetworkType.styles);
}
, fun(instance): GenPagesAPIGetNetworkTypeGetNetworkType {
    return GenPagesAPIGetNetworkTypeGetNetworkType(instance);
}
);
val GenPagesAPIPageScrollToPageScrollToClass = CreateVueComponent(GenPagesAPIPageScrollToPageScrollTo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIPageScrollToPageScrollTo.inheritAttrs, inject = GenPagesAPIPageScrollToPageScrollTo.inject, props = GenPagesAPIPageScrollToPageScrollTo.props, propsNeedCastKeys = GenPagesAPIPageScrollToPageScrollTo.propsNeedCastKeys, emits = GenPagesAPIPageScrollToPageScrollTo.emits, components = GenPagesAPIPageScrollToPageScrollTo.components, styles = GenPagesAPIPageScrollToPageScrollTo.styles);
}
, fun(instance): GenPagesAPIPageScrollToPageScrollTo {
    return GenPagesAPIPageScrollToPageScrollTo(instance);
}
);
val GenPagesAPIEventBusEventBusClass = CreateVueComponent(GenPagesAPIEventBusEventBus::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIEventBusEventBus.inheritAttrs, inject = GenPagesAPIEventBusEventBus.inject, props = GenPagesAPIEventBusEventBus.props, propsNeedCastKeys = GenPagesAPIEventBusEventBus.propsNeedCastKeys, emits = GenPagesAPIEventBusEventBus.emits, components = GenPagesAPIEventBusEventBus.components, styles = GenPagesAPIEventBusEventBus.styles);
}
, fun(instance): GenPagesAPIEventBusEventBus {
    return GenPagesAPIEventBusEventBus(instance);
}
);
val GenPagesAPIUnicloudUnicloudCloudStorageClass = CreateVueComponent(GenPagesAPIUnicloudUnicloudCloudStorage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUnicloudUnicloudCloudStorage.inheritAttrs, inject = GenPagesAPIUnicloudUnicloudCloudStorage.inject, props = GenPagesAPIUnicloudUnicloudCloudStorage.props, propsNeedCastKeys = GenPagesAPIUnicloudUnicloudCloudStorage.propsNeedCastKeys, emits = GenPagesAPIUnicloudUnicloudCloudStorage.emits, components = GenPagesAPIUnicloudUnicloudCloudStorage.components, styles = GenPagesAPIUnicloudUnicloudCloudStorage.styles);
}
, fun(instance): GenPagesAPIUnicloudUnicloudCloudStorage {
    return GenPagesAPIUnicloudUnicloudCloudStorage(instance);
}
);
val GenPagesAPIUnicloudUnicloudDatabaseClass = CreateVueComponent(GenPagesAPIUnicloudUnicloudDatabase::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUnicloudUnicloudDatabase.inheritAttrs, inject = GenPagesAPIUnicloudUnicloudDatabase.inject, props = GenPagesAPIUnicloudUnicloudDatabase.props, propsNeedCastKeys = GenPagesAPIUnicloudUnicloudDatabase.propsNeedCastKeys, emits = GenPagesAPIUnicloudUnicloudDatabase.emits, components = GenPagesAPIUnicloudUnicloudDatabase.components, styles = GenPagesAPIUnicloudUnicloudDatabase.styles);
}
, fun(instance): GenPagesAPIUnicloudUnicloudDatabase {
    return GenPagesAPIUnicloudUnicloudDatabase(instance);
}
);
val GenPagesAPIGetBatteryInfoGetBatteryInfoClass = CreateVueComponent(GenPagesAPIGetBatteryInfoGetBatteryInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetBatteryInfoGetBatteryInfo.inheritAttrs, inject = GenPagesAPIGetBatteryInfoGetBatteryInfo.inject, props = GenPagesAPIGetBatteryInfoGetBatteryInfo.props, propsNeedCastKeys = GenPagesAPIGetBatteryInfoGetBatteryInfo.propsNeedCastKeys, emits = GenPagesAPIGetBatteryInfoGetBatteryInfo.emits, components = GenPagesAPIGetBatteryInfoGetBatteryInfo.components, styles = GenPagesAPIGetBatteryInfoGetBatteryInfo.styles);
}
, fun(instance): GenPagesAPIGetBatteryInfoGetBatteryInfo {
    return GenPagesAPIGetBatteryInfoGetBatteryInfo(instance);
}
);
open class Item5 (
    @JsonNotNull
    open var label: String,
    @JsonNotNull
    open var value: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item5ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item5ReactiveObject : Item5, IUTSReactive<Item5> {
    override var __v_raw: Item5;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item5, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(label = __v_raw.label, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item5ReactiveObject {
        return Item5ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var label: String
        get() {
            return trackReactiveGet(__v_raw, "label", __v_raw.label, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("label")) {
                return;
            }
            val oldValue = __v_raw.label;
            __v_raw.label = value;
            triggerReactiveSet(__v_raw, "label", oldValue, value);
        }
    override var value: String
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val GenPagesAPIGetWindowInfoGetWindowInfoClass = CreateVueComponent(GenPagesAPIGetWindowInfoGetWindowInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetWindowInfoGetWindowInfo.inheritAttrs, inject = GenPagesAPIGetWindowInfoGetWindowInfo.inject, props = GenPagesAPIGetWindowInfoGetWindowInfo.props, propsNeedCastKeys = GenPagesAPIGetWindowInfoGetWindowInfo.propsNeedCastKeys, emits = GenPagesAPIGetWindowInfoGetWindowInfo.emits, components = GenPagesAPIGetWindowInfoGetWindowInfo.components, styles = GenPagesAPIGetWindowInfoGetWindowInfo.styles);
}
, fun(instance): GenPagesAPIGetWindowInfoGetWindowInfo {
    return GenPagesAPIGetWindowInfoGetWindowInfo(instance);
}
);
open class StatusBarArea (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return StatusBarAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class StatusBarAreaReactiveObject : StatusBarArea, IUTSReactive<StatusBarArea> {
    override var __v_raw: StatusBarArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: StatusBarArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): StatusBarAreaReactiveObject {
        return StatusBarAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
open class CutoutArea (
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return CutoutAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class CutoutAreaReactiveObject : CutoutArea, IUTSReactive<CutoutArea> {
    override var __v_raw: CutoutArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: CutoutArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(top = __v_raw.top, left = __v_raw.left, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): CutoutAreaReactiveObject {
        return CutoutAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
open class SafeArea1 (
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SafeArea1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SafeArea1ReactiveObject : SafeArea1, IUTSReactive<SafeArea1> {
    override var __v_raw: SafeArea1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SafeArea1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(top = __v_raw.top, left = __v_raw.left, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SafeArea1ReactiveObject {
        return SafeArea1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
open class BottomNavigationIndicatorArea (
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return BottomNavigationIndicatorAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class BottomNavigationIndicatorAreaReactiveObject : BottomNavigationIndicatorArea, IUTSReactive<BottomNavigationIndicatorArea> {
    override var __v_raw: BottomNavigationIndicatorArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: BottomNavigationIndicatorArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): BottomNavigationIndicatorAreaReactiveObject {
        return BottomNavigationIndicatorAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
val GenPagesAPIGetWindowInfoWindowAreaClass = CreateVueComponent(GenPagesAPIGetWindowInfoWindowArea::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetWindowInfoWindowArea.inheritAttrs, inject = GenPagesAPIGetWindowInfoWindowArea.inject, props = GenPagesAPIGetWindowInfoWindowArea.props, propsNeedCastKeys = GenPagesAPIGetWindowInfoWindowArea.propsNeedCastKeys, emits = GenPagesAPIGetWindowInfoWindowArea.emits, components = GenPagesAPIGetWindowInfoWindowArea.components, styles = GenPagesAPIGetWindowInfoWindowArea.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesAPIGetWindowInfoWindowArea.setup(props as GenPagesAPIGetWindowInfoWindowArea);
    }
    );
}
, fun(instance): GenPagesAPIGetWindowInfoWindowArea {
    return GenPagesAPIGetWindowInfoWindowArea(instance);
}
);
var y: Number = 160;
val GenPagesAPIElementDrawElementDrawClass = CreateVueComponent(GenPagesAPIElementDrawElementDraw::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIElementDrawElementDraw.inheritAttrs, inject = GenPagesAPIElementDrawElementDraw.inject, props = GenPagesAPIElementDrawElementDraw.props, propsNeedCastKeys = GenPagesAPIElementDrawElementDraw.propsNeedCastKeys, emits = GenPagesAPIElementDrawElementDraw.emits, components = GenPagesAPIElementDrawElementDraw.components, styles = GenPagesAPIElementDrawElementDraw.styles);
}
, fun(instance): GenPagesAPIElementDrawElementDraw {
    return GenPagesAPIElementDrawElementDraw(instance);
}
);
val GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoClass = CreateVueComponent(GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.inheritAttrs, inject = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.inject, props = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.props, propsNeedCastKeys = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.propsNeedCastKeys, emits = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.emits, components = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.components, styles = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo.styles);
}
, fun(instance): GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo {
    return GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfo(instance);
}
);
val GenPagesAPIGetUniverifyManagerGetUniverifyManagerClass = CreateVueComponent(GenPagesAPIGetUniverifyManagerGetUniverifyManager::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetUniverifyManagerGetUniverifyManager.inheritAttrs, inject = GenPagesAPIGetUniverifyManagerGetUniverifyManager.inject, props = GenPagesAPIGetUniverifyManagerGetUniverifyManager.props, propsNeedCastKeys = GenPagesAPIGetUniverifyManagerGetUniverifyManager.propsNeedCastKeys, emits = GenPagesAPIGetUniverifyManagerGetUniverifyManager.emits, components = GenPagesAPIGetUniverifyManagerGetUniverifyManager.components, styles = GenPagesAPIGetUniverifyManagerGetUniverifyManager.styles);
}
, fun(instance): GenPagesAPIGetUniverifyManagerGetUniverifyManager {
    return GenPagesAPIGetUniverifyManagerGetUniverifyManager(instance);
}
);
val GenPagesAPIGetUniverifyManagerUniverifyCustomPageClass = CreateVueComponent(GenPagesAPIGetUniverifyManagerUniverifyCustomPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.inheritAttrs, inject = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.inject, props = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.props, propsNeedCastKeys = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.propsNeedCastKeys, emits = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.emits, components = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.components, styles = GenPagesAPIGetUniverifyManagerUniverifyCustomPage.styles);
}
, fun(instance): GenPagesAPIGetUniverifyManagerUniverifyCustomPage {
    return GenPagesAPIGetUniverifyManagerUniverifyCustomPage(instance);
}
);
val GenPagesAPIGetUniverifyManagerFullWebviewPageClass = CreateVueComponent(GenPagesAPIGetUniverifyManagerFullWebviewPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetUniverifyManagerFullWebviewPage.inheritAttrs, inject = GenPagesAPIGetUniverifyManagerFullWebviewPage.inject, props = GenPagesAPIGetUniverifyManagerFullWebviewPage.props, propsNeedCastKeys = GenPagesAPIGetUniverifyManagerFullWebviewPage.propsNeedCastKeys, emits = GenPagesAPIGetUniverifyManagerFullWebviewPage.emits, components = GenPagesAPIGetUniverifyManagerFullWebviewPage.components, styles = GenPagesAPIGetUniverifyManagerFullWebviewPage.styles);
}
, fun(instance): GenPagesAPIGetUniverifyManagerFullWebviewPage {
    return GenPagesAPIGetUniverifyManagerFullWebviewPage(instance);
}
);
val GenPagesAPIRpx2pxRpx2pxClass = CreateVueComponent(GenPagesAPIRpx2pxRpx2px::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIRpx2pxRpx2px.inheritAttrs, inject = GenPagesAPIRpx2pxRpx2px.inject, props = GenPagesAPIRpx2pxRpx2px.props, propsNeedCastKeys = GenPagesAPIRpx2pxRpx2px.propsNeedCastKeys, emits = GenPagesAPIRpx2pxRpx2px.emits, components = GenPagesAPIRpx2pxRpx2px.components, styles = GenPagesAPIRpx2pxRpx2px.styles);
}
, fun(instance): GenPagesAPIRpx2pxRpx2px {
    return GenPagesAPIRpx2pxRpx2px(instance);
}
);
val GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListenerClass = CreateVueComponent(GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.inheritAttrs, inject = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.inject, props = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.props, propsNeedCastKeys = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.propsNeedCastKeys, emits = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.emits, components = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.components, styles = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener.styles);
}
, fun(instance): GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener {
    return GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListener(instance);
}
);
open class PayItem (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    open var provider: UniProvider? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return PayItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class PayItemReactiveObject : PayItem, IUTSReactive<PayItem> {
    override var __v_raw: PayItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: PayItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, name = __v_raw.name, provider = __v_raw.provider) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): PayItemReactiveObject {
        return PayItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var provider: UniProvider?
        get() {
            return trackReactiveGet(__v_raw, "provider", __v_raw.provider, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("provider")) {
                return;
            }
            val oldValue = __v_raw.provider;
            __v_raw.provider = value;
            triggerReactiveSet(__v_raw, "provider", oldValue, value);
        }
}
val GenPagesAPIRequestPaymentRequestPaymentClass = CreateVueComponent(GenPagesAPIRequestPaymentRequestPayment::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIRequestPaymentRequestPayment.inheritAttrs, inject = GenPagesAPIRequestPaymentRequestPayment.inject, props = GenPagesAPIRequestPaymentRequestPayment.props, propsNeedCastKeys = GenPagesAPIRequestPaymentRequestPayment.propsNeedCastKeys, emits = GenPagesAPIRequestPaymentRequestPayment.emits, components = GenPagesAPIRequestPaymentRequestPayment.components, styles = GenPagesAPIRequestPaymentRequestPayment.styles);
}
, fun(instance): GenPagesAPIRequestPaymentRequestPayment {
    return GenPagesAPIRequestPaymentRequestPayment(instance);
}
);
val GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdClass = CreateVueComponent(GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.inheritAttrs, inject = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.inject, props = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.props, propsNeedCastKeys = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.propsNeedCastKeys, emits = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.emits, components = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.components, styles = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd.styles);
}
, fun(instance): GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd {
    return GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAd(instance);
}
);
val GenUniModulesUniPayXComponentsUniPayPopupUniPayPopupClass = CreateVueComponent(GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.inheritAttrs, inject = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.inject, props = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.props, propsNeedCastKeys = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.propsNeedCastKeys, emits = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.emits, components = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.components, styles = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup.styles);
}
, fun(instance): GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup {
    return GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup(instance);
}
);
typealias UniPayPopupComponentPublicInstance = GenUniModulesUniPayXComponentsUniPayPopupUniPayPopup;
fun objectAssign(json1: UTSJSONObject, json2: UTSJSONObject): UTSJSONObject {
    for(key in resolveUTSKeyIterator(json2)){
        json1[key] = json2[key];
    }
    return json1;
}
val uniPayCo = uniCloud.importObject("uni-pay-co", GenCloudObjUniPayCo::class.java);
val GenUniModulesUniPayXComponentsUniPayUniPayClass = CreateVueComponent(GenUniModulesUniPayXComponentsUniPayUniPay::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniPayXComponentsUniPayUniPay.name, inheritAttrs = GenUniModulesUniPayXComponentsUniPayUniPay.inheritAttrs, inject = GenUniModulesUniPayXComponentsUniPayUniPay.inject, props = GenUniModulesUniPayXComponentsUniPayUniPay.props, propsNeedCastKeys = GenUniModulesUniPayXComponentsUniPayUniPay.propsNeedCastKeys, emits = GenUniModulesUniPayXComponentsUniPayUniPay.emits, components = GenUniModulesUniPayXComponentsUniPayUniPay.components, styles = GenUniModulesUniPayXComponentsUniPayUniPay.styles);
}
, fun(instance): GenUniModulesUniPayXComponentsUniPayUniPay {
    return GenUniModulesUniPayXComponentsUniPayUniPay(instance);
}
);
typealias UniPayComponentPublicInstance = GenUniModulesUniPayXComponentsUniPayUniPay;
val GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayClass = CreateVueComponent(GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.inheritAttrs, inject = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.inject, props = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.props, propsNeedCastKeys = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.propsNeedCastKeys, emits = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.emits, components = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.components, styles = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay.styles);
}
, fun(instance): GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay {
    return GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPay(instance);
}
);
val GenPagesAPIRequestPaymentRequestPaymentOrderDetailClass = CreateVueComponent(GenPagesAPIRequestPaymentRequestPaymentOrderDetail::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.inheritAttrs, inject = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.inject, props = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.props, propsNeedCastKeys = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.propsNeedCastKeys, emits = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.emits, components = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.components, styles = GenPagesAPIRequestPaymentRequestPaymentOrderDetail.styles);
}
, fun(instance): GenPagesAPIRequestPaymentRequestPaymentOrderDetail {
    return GenPagesAPIRequestPaymentRequestPaymentOrderDetail(instance);
}
);
val audioUrl = "https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3";
val GenPagesAPICreateInnerAudioContextCreateInnerAudioContextClass = CreateVueComponent(GenPagesAPICreateInnerAudioContextCreateInnerAudioContext::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.inheritAttrs, inject = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.inject, props = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.props, propsNeedCastKeys = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.propsNeedCastKeys, emits = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.emits, components = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.components, styles = GenPagesAPICreateInnerAudioContextCreateInnerAudioContext.styles);
}
, fun(instance): GenPagesAPICreateInnerAudioContextCreateInnerAudioContext {
    return GenPagesAPICreateInnerAudioContextCreateInnerAudioContext(instance);
}
);
open class AudioFormat (
    @JsonNotNull
    open var format: String,
    open var support: String? = null,
    @JsonNotNull
    open var src: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return AudioFormatReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class AudioFormatReactiveObject : AudioFormat, IUTSReactive<AudioFormat> {
    override var __v_raw: AudioFormat;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: AudioFormat, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(format = __v_raw.format, support = __v_raw.support, src = __v_raw.src) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): AudioFormatReactiveObject {
        return AudioFormatReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var format: String
        get() {
            return trackReactiveGet(__v_raw, "format", __v_raw.format, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("format")) {
                return;
            }
            val oldValue = __v_raw.format;
            __v_raw.format = value;
            triggerReactiveSet(__v_raw, "format", oldValue, value);
        }
    override var support: String?
        get() {
            return trackReactiveGet(__v_raw, "support", __v_raw.support, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("support")) {
                return;
            }
            val oldValue = __v_raw.support;
            __v_raw.support = value;
            triggerReactiveSet(__v_raw, "support", oldValue, value);
        }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
}
val GenPagesAPICreateInnerAudioContextInnerAudioFormatClass = CreateVueComponent(GenPagesAPICreateInnerAudioContextInnerAudioFormat::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateInnerAudioContextInnerAudioFormat.inheritAttrs, inject = GenPagesAPICreateInnerAudioContextInnerAudioFormat.inject, props = GenPagesAPICreateInnerAudioContextInnerAudioFormat.props, propsNeedCastKeys = GenPagesAPICreateInnerAudioContextInnerAudioFormat.propsNeedCastKeys, emits = GenPagesAPICreateInnerAudioContextInnerAudioFormat.emits, components = GenPagesAPICreateInnerAudioContextInnerAudioFormat.components, styles = GenPagesAPICreateInnerAudioContextInnerAudioFormat.styles);
}
, fun(instance): GenPagesAPICreateInnerAudioContextInnerAudioFormat {
    return GenPagesAPICreateInnerAudioContextInnerAudioFormat(instance);
}
);
open class AudioPath (
    @JsonNotNull
    open var description: String,
    @JsonNotNull
    open var src: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return AudioPathReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class AudioPathReactiveObject : AudioPath, IUTSReactive<AudioPath> {
    override var __v_raw: AudioPath;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: AudioPath, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(description = __v_raw.description, src = __v_raw.src) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): AudioPathReactiveObject {
        return AudioPathReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var description: String
        get() {
            return trackReactiveGet(__v_raw, "description", __v_raw.description, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("description")) {
                return;
            }
            val oldValue = __v_raw.description;
            __v_raw.description = value;
            triggerReactiveSet(__v_raw, "description", oldValue, value);
        }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
}
val GenPagesAPICreateInnerAudioContextInnerAudioPathClass = CreateVueComponent(GenPagesAPICreateInnerAudioContextInnerAudioPath::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateInnerAudioContextInnerAudioPath.inheritAttrs, inject = GenPagesAPICreateInnerAudioContextInnerAudioPath.inject, props = GenPagesAPICreateInnerAudioContextInnerAudioPath.props, propsNeedCastKeys = GenPagesAPICreateInnerAudioContextInnerAudioPath.propsNeedCastKeys, emits = GenPagesAPICreateInnerAudioContextInnerAudioPath.emits, components = GenPagesAPICreateInnerAudioContextInnerAudioPath.components, styles = GenPagesAPICreateInnerAudioContextInnerAudioPath.styles);
}
, fun(instance): GenPagesAPICreateInnerAudioContextInnerAudioPath {
    return GenPagesAPICreateInnerAudioContextInnerAudioPath(instance);
}
);
val GenPagesAPICreateInnerAudioContextInnerAudioMultClass = CreateVueComponent(GenPagesAPICreateInnerAudioContextInnerAudioMult::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateInnerAudioContextInnerAudioMult.inheritAttrs, inject = GenPagesAPICreateInnerAudioContextInnerAudioMult.inject, props = GenPagesAPICreateInnerAudioContextInnerAudioMult.props, propsNeedCastKeys = GenPagesAPICreateInnerAudioContextInnerAudioMult.propsNeedCastKeys, emits = GenPagesAPICreateInnerAudioContextInnerAudioMult.emits, components = GenPagesAPICreateInnerAudioContextInnerAudioMult.components, styles = GenPagesAPICreateInnerAudioContextInnerAudioMult.styles);
}
, fun(instance): GenPagesAPICreateInnerAudioContextInnerAudioMult {
    return GenPagesAPICreateInnerAudioContextInnerAudioMult(instance);
}
);
val GenPagesAPIThemeChangeThemeChangeClass = CreateVueComponent(GenPagesAPIThemeChangeThemeChange::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIThemeChangeThemeChange.inheritAttrs, inject = GenPagesAPIThemeChangeThemeChange.inject, props = GenPagesAPIThemeChangeThemeChange.props, propsNeedCastKeys = GenPagesAPIThemeChangeThemeChange.propsNeedCastKeys, emits = GenPagesAPIThemeChangeThemeChange.emits, components = GenPagesAPIThemeChangeThemeChange.components, styles = GenPagesAPIThemeChangeThemeChange.styles);
}
, fun(instance): GenPagesAPIThemeChangeThemeChange {
    return GenPagesAPIThemeChangeThemeChange(instance);
}
);
val GenPagesAPIGetElementByIdGetElementByIdClass = CreateVueComponent(GenPagesAPIGetElementByIdGetElementById::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetElementByIdGetElementById.inheritAttrs, inject = GenPagesAPIGetElementByIdGetElementById.inject, props = GenPagesAPIGetElementByIdGetElementById.props, propsNeedCastKeys = GenPagesAPIGetElementByIdGetElementById.propsNeedCastKeys, emits = GenPagesAPIGetElementByIdGetElementById.emits, components = GenPagesAPIGetElementByIdGetElementById.components, styles = GenPagesAPIGetElementByIdGetElementById.styles);
}
, fun(instance): GenPagesAPIGetElementByIdGetElementById {
    return GenPagesAPIGetElementByIdGetElementById(instance);
}
);
val GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeClass = CreateVueComponent(GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.inheritAttrs, inject = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.inject, props = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.props, propsNeedCastKeys = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.propsNeedCastKeys, emits = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.emits, components = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.components, styles = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode.styles);
}
, fun(instance): GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode {
    return GenPagesAPIGetElementByIdGetElementByIdMultipleRootNode(instance);
}
);
val GenPagesAPICreateSelectorQueryNodesInfoChildClass = CreateVueComponent(GenPagesAPICreateSelectorQueryNodesInfoChild::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesAPICreateSelectorQueryNodesInfoChild.inheritAttrs, inject = GenPagesAPICreateSelectorQueryNodesInfoChild.inject, props = GenPagesAPICreateSelectorQueryNodesInfoChild.props, propsNeedCastKeys = GenPagesAPICreateSelectorQueryNodesInfoChild.propsNeedCastKeys, emits = GenPagesAPICreateSelectorQueryNodesInfoChild.emits, components = GenPagesAPICreateSelectorQueryNodesInfoChild.components, styles = GenPagesAPICreateSelectorQueryNodesInfoChild.styles);
}
, fun(instance): GenPagesAPICreateSelectorQueryNodesInfoChild {
    return GenPagesAPICreateSelectorQueryNodesInfoChild(instance);
}
);
val GenPagesAPICreateSelectorQuerySelectorQueryChildMultiClass = CreateVueComponent(GenPagesAPICreateSelectorQuerySelectorQueryChildMulti::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.inheritAttrs, inject = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.inject, props = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.props, propsNeedCastKeys = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.propsNeedCastKeys, emits = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.emits, components = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.components, styles = GenPagesAPICreateSelectorQuerySelectorQueryChildMulti.styles);
}
, fun(instance): GenPagesAPICreateSelectorQuerySelectorQueryChildMulti {
    return GenPagesAPICreateSelectorQuerySelectorQueryChildMulti(instance);
}
);
open class NodeInfoType (
    open var left: Number? = null,
    open var top: Number? = null,
    open var right: Number? = null,
    open var bottom: Number? = null,
    open var width: Number? = null,
    open var height: Number? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return NodeInfoTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class NodeInfoTypeReactiveObject : NodeInfoType, IUTSReactive<NodeInfoType> {
    override var __v_raw: NodeInfoType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: NodeInfoType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(left = __v_raw.left, top = __v_raw.top, right = __v_raw.right, bottom = __v_raw.bottom, width = __v_raw.width, height = __v_raw.height) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): NodeInfoTypeReactiveObject {
        return NodeInfoTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var left: Number?
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var top: Number?
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var right: Number?
        get() {
            return trackReactiveGet(__v_raw, "right", __v_raw.right, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("right")) {
                return;
            }
            val oldValue = __v_raw.right;
            __v_raw.right = value;
            triggerReactiveSet(__v_raw, "right", oldValue, value);
        }
    override var bottom: Number?
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var width: Number?
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number?
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
}
val GenPagesAPICreateSelectorQueryCreateSelectorQueryClass = CreateVueComponent(GenPagesAPICreateSelectorQueryCreateSelectorQuery::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateSelectorQueryCreateSelectorQuery.inheritAttrs, inject = GenPagesAPICreateSelectorQueryCreateSelectorQuery.inject, props = GenPagesAPICreateSelectorQueryCreateSelectorQuery.props, propsNeedCastKeys = GenPagesAPICreateSelectorQueryCreateSelectorQuery.propsNeedCastKeys, emits = GenPagesAPICreateSelectorQueryCreateSelectorQuery.emits, components = GenPagesAPICreateSelectorQueryCreateSelectorQuery.components, styles = GenPagesAPICreateSelectorQueryCreateSelectorQuery.styles);
}
, fun(instance): GenPagesAPICreateSelectorQueryCreateSelectorQuery {
    return GenPagesAPICreateSelectorQueryCreateSelectorQuery(instance);
}
);
val GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollClass = CreateVueComponent(GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.inheritAttrs, inject = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.inject, props = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.props, propsNeedCastKeys = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.propsNeedCastKeys, emits = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.emits, components = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.components, styles = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll.styles);
}
, fun(instance): GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll {
    return GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScroll(instance);
}
);
val GenPagesAPIGetNativeViewElementGetnativeviewClass = CreateVueComponent(GenPagesAPIGetNativeViewElementGetnativeview::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetNativeViewElementGetnativeview.inheritAttrs, inject = GenPagesAPIGetNativeViewElementGetnativeview.inject, props = GenPagesAPIGetNativeViewElementGetnativeview.props, propsNeedCastKeys = GenPagesAPIGetNativeViewElementGetnativeview.propsNeedCastKeys, emits = GenPagesAPIGetNativeViewElementGetnativeview.emits, components = GenPagesAPIGetNativeViewElementGetnativeview.components, styles = GenPagesAPIGetNativeViewElementGetnativeview.styles);
}
, fun(instance): GenPagesAPIGetNativeViewElementGetnativeview {
    return GenPagesAPIGetNativeViewElementGetnativeview(instance);
}
);
val GenPagesAPIResizeObserverResizeObserverClass = CreateVueComponent(GenPagesAPIResizeObserverResizeObserver::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIResizeObserverResizeObserver.inheritAttrs, inject = GenPagesAPIResizeObserverResizeObserver.inject, props = GenPagesAPIResizeObserverResizeObserver.props, propsNeedCastKeys = GenPagesAPIResizeObserverResizeObserver.propsNeedCastKeys, emits = GenPagesAPIResizeObserverResizeObserver.emits, components = GenPagesAPIResizeObserverResizeObserver.components, styles = GenPagesAPIResizeObserverResizeObserver.styles);
}
, fun(instance): GenPagesAPIResizeObserverResizeObserver {
    return GenPagesAPIResizeObserverResizeObserver(instance);
}
);
open class ProviderItem (
    @JsonNotNull
    open var service: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var provider: UTSArray<String>,
    @JsonNotNull
    open var providerObj: UTSArray<UniProvider>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ProviderItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ProviderItemReactiveObject : ProviderItem, IUTSReactive<ProviderItem> {
    override var __v_raw: ProviderItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ProviderItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(service = __v_raw.service, name = __v_raw.name, provider = __v_raw.provider, providerObj = __v_raw.providerObj) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ProviderItemReactiveObject {
        return ProviderItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var service: String
        get() {
            return trackReactiveGet(__v_raw, "service", __v_raw.service, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("service")) {
                return;
            }
            val oldValue = __v_raw.service;
            __v_raw.service = value;
            triggerReactiveSet(__v_raw, "service", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var provider: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "provider", __v_raw.provider, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("provider")) {
                return;
            }
            val oldValue = __v_raw.provider;
            __v_raw.provider = value;
            triggerReactiveSet(__v_raw, "provider", oldValue, value);
        }
    override var providerObj: UTSArray<UniProvider>
        get() {
            return trackReactiveGet(__v_raw, "providerObj", __v_raw.providerObj, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("providerObj")) {
                return;
            }
            val oldValue = __v_raw.providerObj;
            __v_raw.providerObj = value;
            triggerReactiveSet(__v_raw, "providerObj", oldValue, value);
        }
}
val GenPagesAPIProviderProviderClass = CreateVueComponent(GenPagesAPIProviderProvider::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIProviderProvider.inheritAttrs, inject = GenPagesAPIProviderProvider.inject, props = GenPagesAPIProviderProvider.props, propsNeedCastKeys = GenPagesAPIProviderProvider.propsNeedCastKeys, emits = GenPagesAPIProviderProvider.emits, components = GenPagesAPIProviderProvider.components, styles = GenPagesAPIProviderProvider.styles);
}
, fun(instance): GenPagesAPIProviderProvider {
    return GenPagesAPIProviderProvider(instance);
}
);
val GenPagesAPIPrivacyPrivacyClass = CreateVueComponent(GenPagesAPIPrivacyPrivacy::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIPrivacyPrivacy.inheritAttrs, inject = GenPagesAPIPrivacyPrivacy.inject, props = GenPagesAPIPrivacyPrivacy.props, propsNeedCastKeys = GenPagesAPIPrivacyPrivacy.propsNeedCastKeys, emits = GenPagesAPIPrivacyPrivacy.emits, components = GenPagesAPIPrivacyPrivacy.components, styles = GenPagesAPIPrivacyPrivacy.styles);
}
, fun(instance): GenPagesAPIPrivacyPrivacy {
    return GenPagesAPIPrivacyPrivacy(instance);
}
);
val GenPagesAPIUniPushUniPushClass = CreateVueComponent(GenPagesAPIUniPushUniPush::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIUniPushUniPush.inheritAttrs, inject = GenPagesAPIUniPushUniPush.inject, props = GenPagesAPIUniPushUniPush.props, propsNeedCastKeys = GenPagesAPIUniPushUniPush.propsNeedCastKeys, emits = GenPagesAPIUniPushUniPush.emits, components = GenPagesAPIUniPushUniPush.components, styles = GenPagesAPIUniPushUniPush.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesAPIUniPushUniPush.setup(props as GenPagesAPIUniPushUniPush);
    }
    );
}
, fun(instance): GenPagesAPIUniPushUniPush {
    return GenPagesAPIUniPushUniPush(instance);
}
);
val GenPagesAPIReportReportClass = CreateVueComponent(GenPagesAPIReportReport::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIReportReport.inheritAttrs, inject = GenPagesAPIReportReport.inject, props = GenPagesAPIReportReport.props, propsNeedCastKeys = GenPagesAPIReportReport.propsNeedCastKeys, emits = GenPagesAPIReportReport.emits, components = GenPagesAPIReportReport.components, styles = GenPagesAPIReportReport.styles);
}
, fun(instance): GenPagesAPIReportReport {
    return GenPagesAPIReportReport(instance);
}
);
typealias OpenAnimationType = String;
val GenPagesAPIDialogPageDialogPageClass = CreateVueComponent(GenPagesAPIDialogPageDialogPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageDialogPage.inheritAttrs, inject = GenPagesAPIDialogPageDialogPage.inject, props = GenPagesAPIDialogPageDialogPage.props, propsNeedCastKeys = GenPagesAPIDialogPageDialogPage.propsNeedCastKeys, emits = GenPagesAPIDialogPageDialogPage.emits, components = GenPagesAPIDialogPageDialogPage.components, styles = GenPagesAPIDialogPageDialogPage.styles);
}
, fun(instance): GenPagesAPIDialogPageDialogPage {
    return GenPagesAPIDialogPageDialogPage(instance);
}
);
val GenPagesAPIDialogPageNextPageClass = CreateVueComponent(GenPagesAPIDialogPageNextPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageNextPage.inheritAttrs, inject = GenPagesAPIDialogPageNextPage.inject, props = GenPagesAPIDialogPageNextPage.props, propsNeedCastKeys = GenPagesAPIDialogPageNextPage.propsNeedCastKeys, emits = GenPagesAPIDialogPageNextPage.emits, components = GenPagesAPIDialogPageNextPage.components, styles = GenPagesAPIDialogPageNextPage.styles);
}
, fun(instance): GenPagesAPIDialogPageNextPage {
    return GenPagesAPIDialogPageNextPage(instance);
}
);
val GenPagesAPIDialogPageDialog1Class = CreateVueComponent(GenPagesAPIDialogPageDialog1::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageDialog1.inheritAttrs, inject = GenPagesAPIDialogPageDialog1.inject, props = GenPagesAPIDialogPageDialog1.props, propsNeedCastKeys = GenPagesAPIDialogPageDialog1.propsNeedCastKeys, emits = GenPagesAPIDialogPageDialog1.emits, components = GenPagesAPIDialogPageDialog1.components, styles = GenPagesAPIDialogPageDialog1.styles);
}
, fun(instance): GenPagesAPIDialogPageDialog1 {
    return GenPagesAPIDialogPageDialog1(instance);
}
);
val GenPagesAPIDialogPageDialog2Class = CreateVueComponent(GenPagesAPIDialogPageDialog2::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageDialog2.inheritAttrs, inject = GenPagesAPIDialogPageDialog2.inject, props = GenPagesAPIDialogPageDialog2.props, propsNeedCastKeys = GenPagesAPIDialogPageDialog2.propsNeedCastKeys, emits = GenPagesAPIDialogPageDialog2.emits, components = GenPagesAPIDialogPageDialog2.components, styles = GenPagesAPIDialogPageDialog2.styles);
}
, fun(instance): GenPagesAPIDialogPageDialog2 {
    return GenPagesAPIDialogPageDialog2(instance);
}
);
open class PageStyleItem1 (
    @JsonNotNull
    open var key: String,
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var value: UTSArray<Any>,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return PageStyleItem1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class PageStyleItem1ReactiveObject : PageStyleItem1, IUTSReactive<PageStyleItem1> {
    override var __v_raw: PageStyleItem1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: PageStyleItem1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(key = __v_raw.key, type = __v_raw.type, value = __v_raw.value) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): PageStyleItem1ReactiveObject {
        return PageStyleItem1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var key: String
        get() {
            return trackReactiveGet(__v_raw, "key", __v_raw.key, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("key")) {
                return;
            }
            val oldValue = __v_raw.key;
            __v_raw.key = value;
            triggerReactiveSet(__v_raw, "key", oldValue, value);
        }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var value: UTSArray<Any>
        get() {
            return trackReactiveGet(__v_raw, "value", __v_raw.value, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("value")) {
                return;
            }
            val oldValue = __v_raw.value;
            __v_raw.value = value;
            triggerReactiveSet(__v_raw, "value", oldValue, value);
        }
}
val PageStyleArray1 = utsArrayOf<PageStyleItem1>(PageStyleItem1(key = "navigationBarBackgroundColor", type = "string", value = utsArrayOf(
    "#007AFF",
    "#FFFFFF",
    "#000000"
)), PageStyleItem1(key = "navigationBarTextStyle", type = "string", value = utsArrayOf(
    "white",
    "black"
)), PageStyleItem1(key = "navigationBarTitleText", type = "string", value = utsArrayOf(
    "dialogPage",
    "title2",
    "title3"
)), PageStyleItem1(key = "navigationStyle", type = "string", value = utsArrayOf(
    "default",
    "custom"
)), PageStyleItem1(key = "backgroundColor", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem1(key = "backgroundColorContent", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "transparent",
    "#000000"
)), PageStyleItem1(key = "backgroundTextStyle", type = "string", value = utsArrayOf(
    "dark",
    "light"
)), PageStyleItem1(key = "enablePullDownRefresh", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem1(key = "onReachBottomDistance", type = "number", value = utsArrayOf(
    50,
    100
)), PageStyleItem1(key = "pageOrientation", type = "string", value = utsArrayOf(
    "auto",
    "portrait",
    "landscape"
)), PageStyleItem1(key = "backgroundColorTop", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem1(key = "backgroundColorBottom", type = "string", value = utsArrayOf(
    "#FFFFFF",
    "#000000"
)), PageStyleItem1(key = "navigationBarAutoBackButton", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem1(key = "hideStatusBar", type = "boolean", value = utsArrayOf(
    true,
    false
)), PageStyleItem1(key = "hideBottomNavigationIndicator", type = "boolean", value = utsArrayOf(
    true,
    false
)));
typealias CloseAnimationType = String;
val GenPagesAPIDialogPageDialog3Class = CreateVueComponent(GenPagesAPIDialogPageDialog3::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageDialog3.inheritAttrs, inject = GenPagesAPIDialogPageDialog3.inject, props = GenPagesAPIDialogPageDialog3.props, propsNeedCastKeys = GenPagesAPIDialogPageDialog3.propsNeedCastKeys, emits = GenPagesAPIDialogPageDialog3.emits, components = GenPagesAPIDialogPageDialog3.components, styles = GenPagesAPIDialogPageDialog3.styles);
}
, fun(instance): GenPagesAPIDialogPageDialog3 {
    return GenPagesAPIDialogPageDialog3(instance);
}
);
val GenPagesAPIDialogPageDialog4Class = CreateVueComponent(GenPagesAPIDialogPageDialog4::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIDialogPageDialog4.inheritAttrs, inject = GenPagesAPIDialogPageDialog4.inject, props = GenPagesAPIDialogPageDialog4.props, propsNeedCastKeys = GenPagesAPIDialogPageDialog4.propsNeedCastKeys, emits = GenPagesAPIDialogPageDialog4.emits, components = GenPagesAPIDialogPageDialog4.components, styles = GenPagesAPIDialogPageDialog4.styles);
}
, fun(instance): GenPagesAPIDialogPageDialog4 {
    return GenPagesAPIDialogPageDialog4(instance);
}
);
val GenPagesAPICreateInterstitialAdCreateInterstitialAdClass = CreateVueComponent(GenPagesAPICreateInterstitialAdCreateInterstitialAd::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPICreateInterstitialAdCreateInterstitialAd.inheritAttrs, inject = GenPagesAPICreateInterstitialAdCreateInterstitialAd.inject, props = GenPagesAPICreateInterstitialAdCreateInterstitialAd.props, propsNeedCastKeys = GenPagesAPICreateInterstitialAdCreateInterstitialAd.propsNeedCastKeys, emits = GenPagesAPICreateInterstitialAdCreateInterstitialAd.emits, components = GenPagesAPICreateInterstitialAdCreateInterstitialAd.components, styles = GenPagesAPICreateInterstitialAdCreateInterstitialAd.styles);
}
, fun(instance): GenPagesAPICreateInterstitialAdCreateInterstitialAd {
    return GenPagesAPICreateInterstitialAdCreateInterstitialAd(instance);
}
);
val GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerClass = CreateVueComponent(GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.inheritAttrs, inject = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.inject, props = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.props, propsNeedCastKeys = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.propsNeedCastKeys, emits = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.emits, components = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.components, styles = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager.styles);
}
, fun(instance): GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager {
    return GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManager(instance);
}
);
val GenPagesAPIShareWithSystemShareWithSystemClass = CreateVueComponent(GenPagesAPIShareWithSystemShareWithSystem::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIShareWithSystemShareWithSystem.inheritAttrs, inject = GenPagesAPIShareWithSystemShareWithSystem.inject, props = GenPagesAPIShareWithSystemShareWithSystem.props, propsNeedCastKeys = GenPagesAPIShareWithSystemShareWithSystem.propsNeedCastKeys, emits = GenPagesAPIShareWithSystemShareWithSystem.emits, components = GenPagesAPIShareWithSystemShareWithSystem.components, styles = GenPagesAPIShareWithSystemShareWithSystem.styles);
}
, fun(instance): GenPagesAPIShareWithSystemShareWithSystem {
    return GenPagesAPIShareWithSystemShareWithSystem(instance);
}
);
val menu2 = generateMenu("pages/CSS");
val GenPagesTabBarCSSClass = CreateVueComponent(GenPagesTabBarCSS::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTabBarCSS.inheritAttrs, inject = GenPagesTabBarCSS.inject, props = GenPagesTabBarCSS.props, propsNeedCastKeys = GenPagesTabBarCSS.propsNeedCastKeys, emits = GenPagesTabBarCSS.emits, components = GenPagesTabBarCSS.components, styles = GenPagesTabBarCSS.styles);
}
, fun(instance): GenPagesTabBarCSS {
    return GenPagesTabBarCSS(instance);
}
);
open class Page3 (
    @JsonNotNull
    open var name: String,
    open var enable: Boolean? = null,
    @JsonNotNull
    open var url: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Page3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Page3ReactiveObject : Page3, IUTSReactive<Page3> {
    override var __v_raw: Page3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Page3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(name = __v_raw.name, enable = __v_raw.enable, url = __v_raw.url) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Page3ReactiveObject {
        return Page3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var enable: Boolean?
        get() {
            return trackReactiveGet(__v_raw, "enable", __v_raw.enable, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("enable")) {
                return;
            }
            val oldValue = __v_raw.enable;
            __v_raw.enable = value;
            triggerReactiveSet(__v_raw, "enable", oldValue, value);
        }
    override var url: String
        get() {
            return trackReactiveGet(__v_raw, "url", __v_raw.url, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("url")) {
                return;
            }
            val oldValue = __v_raw.url;
            __v_raw.url = value;
            triggerReactiveSet(__v_raw, "url", oldValue, value);
        }
}
open class ListItem (
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var open: Boolean = false,
    @JsonNotNull
    open var pages: UTSArray<Page3>,
    open var url: String? = null,
    open var enable: Boolean? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ListItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ListItemReactiveObject : ListItem, IUTSReactive<ListItem> {
    override var __v_raw: ListItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ListItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, name = __v_raw.name, open = __v_raw.open, pages = __v_raw.pages, url = __v_raw.url, enable = __v_raw.enable) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ListItemReactiveObject {
        return ListItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var open: Boolean
        get() {
            return trackReactiveGet(__v_raw, "open", __v_raw.open, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("open")) {
                return;
            }
            val oldValue = __v_raw.open;
            __v_raw.open = value;
            triggerReactiveSet(__v_raw, "open", oldValue, value);
        }
    override var pages: UTSArray<Page3>
        get() {
            return trackReactiveGet(__v_raw, "pages", __v_raw.pages, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("pages")) {
                return;
            }
            val oldValue = __v_raw.pages;
            __v_raw.pages = value;
            triggerReactiveSet(__v_raw, "pages", oldValue, value);
        }
    override var url: String?
        get() {
            return trackReactiveGet(__v_raw, "url", __v_raw.url, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("url")) {
                return;
            }
            val oldValue = __v_raw.url;
            __v_raw.url = value;
            triggerReactiveSet(__v_raw, "url", oldValue, value);
        }
    override var enable: Boolean?
        get() {
            return trackReactiveGet(__v_raw, "enable", __v_raw.enable, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("enable")) {
                return;
            }
            val oldValue = __v_raw.enable;
            __v_raw.enable = value;
            triggerReactiveSet(__v_raw, "enable", oldValue, value);
        }
}
val GenPagesTabBarTemplateClass = CreateVueComponent(GenPagesTabBarTemplate::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTabBarTemplate.inheritAttrs, inject = GenPagesTabBarTemplate.inject, props = GenPagesTabBarTemplate.props, propsNeedCastKeys = GenPagesTabBarTemplate.propsNeedCastKeys, emits = GenPagesTabBarTemplate.emits, components = GenPagesTabBarTemplate.components, styles = GenPagesTabBarTemplate.styles);
}
, fun(instance): GenPagesTabBarTemplate {
    return GenPagesTabBarTemplate(instance);
}
);
open class Banner (
    open var cover: String? = null,
    open var title: String? = null,
    open var post_id: String? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return BannerReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class BannerReactiveObject : Banner, IUTSReactive<Banner> {
    override var __v_raw: Banner;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Banner, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(cover = __v_raw.cover, title = __v_raw.title, post_id = __v_raw.post_id) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): BannerReactiveObject {
        return BannerReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var cover: String?
        get() {
            return trackReactiveGet(__v_raw, "cover", __v_raw.cover, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cover")) {
                return;
            }
            val oldValue = __v_raw.cover;
            __v_raw.cover = value;
            triggerReactiveSet(__v_raw, "cover", oldValue, value);
        }
    override var title: String?
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
    override var post_id: String?
        get() {
            return trackReactiveGet(__v_raw, "post_id", __v_raw.post_id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("post_id")) {
                return;
            }
            val oldValue = __v_raw.post_id;
            __v_raw.post_id = value;
            triggerReactiveSet(__v_raw, "post_id", oldValue, value);
        }
}
open class Item6 (
    @JsonNotNull
    open var author_name: String,
    @JsonNotNull
    open var cover: String,
    @JsonNotNull
    open var id: Number,
    @JsonNotNull
    open var post_id: String,
    @JsonNotNull
    open var published_at: String,
    @JsonNotNull
    open var title: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item6ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item6ReactiveObject : Item6, IUTSReactive<Item6> {
    override var __v_raw: Item6;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item6, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(author_name = __v_raw.author_name, cover = __v_raw.cover, id = __v_raw.id, post_id = __v_raw.post_id, published_at = __v_raw.published_at, title = __v_raw.title) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item6ReactiveObject {
        return Item6ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var author_name: String
        get() {
            return trackReactiveGet(__v_raw, "author_name", __v_raw.author_name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("author_name")) {
                return;
            }
            val oldValue = __v_raw.author_name;
            __v_raw.author_name = value;
            triggerReactiveSet(__v_raw, "author_name", oldValue, value);
        }
    override var cover: String
        get() {
            return trackReactiveGet(__v_raw, "cover", __v_raw.cover, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cover")) {
                return;
            }
            val oldValue = __v_raw.cover;
            __v_raw.cover = value;
            triggerReactiveSet(__v_raw, "cover", oldValue, value);
        }
    override var id: Number
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var post_id: String
        get() {
            return trackReactiveGet(__v_raw, "post_id", __v_raw.post_id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("post_id")) {
                return;
            }
            val oldValue = __v_raw.post_id;
            __v_raw.post_id = value;
            triggerReactiveSet(__v_raw, "post_id", oldValue, value);
        }
    override var published_at: String
        get() {
            return trackReactiveGet(__v_raw, "published_at", __v_raw.published_at, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("published_at")) {
                return;
            }
            val oldValue = __v_raw.published_at;
            __v_raw.published_at = value;
            triggerReactiveSet(__v_raw, "published_at", oldValue, value);
        }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
}
val GenPagesTemplateListNewsListNewsClass = CreateVueComponent(GenPagesTemplateListNewsListNews::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateListNewsListNews.inheritAttrs, inject = GenPagesTemplateListNewsListNews.inject, props = GenPagesTemplateListNewsListNews.props, propsNeedCastKeys = GenPagesTemplateListNewsListNews.propsNeedCastKeys, emits = GenPagesTemplateListNewsListNews.emits, components = GenPagesTemplateListNewsListNews.components, styles = GenPagesTemplateListNewsListNews.styles);
}
, fun(instance): GenPagesTemplateListNewsListNews {
    return GenPagesTemplateListNewsListNews(instance);
}
);
val GenPagesTemplateListNewsDetailDetailClass = CreateVueComponent(GenPagesTemplateListNewsDetailDetail::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateListNewsDetailDetail.inheritAttrs, inject = GenPagesTemplateListNewsDetailDetail.inject, props = GenPagesTemplateListNewsDetailDetail.props, propsNeedCastKeys = GenPagesTemplateListNewsDetailDetail.propsNeedCastKeys, emits = GenPagesTemplateListNewsDetailDetail.emits, components = GenPagesTemplateListNewsDetailDetail.components, styles = GenPagesTemplateListNewsDetailDetail.styles);
}
, fun(instance): GenPagesTemplateListNewsDetailDetail {
    return GenPagesTemplateListNewsDetailDetail(instance);
}
);
var sX: Number = 0;
var sY: Number = 0;
var screenWidth: Number = 1;
var screenHeight: Number = 1;
var floating: Boolean = false;
var touchstartAfter: Boolean = false;
val GenPagesTemplateDropCardCardCardClass = CreateVueComponent(GenPagesTemplateDropCardCardCard::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateDropCardCardCard.inheritAttrs, inject = GenPagesTemplateDropCardCardCard.inject, props = GenPagesTemplateDropCardCardCard.props, propsNeedCastKeys = GenPagesTemplateDropCardCardCard.propsNeedCastKeys, emits = GenPagesTemplateDropCardCardCard.emits, components = GenPagesTemplateDropCardCardCard.components, styles = GenPagesTemplateDropCardCardCard.styles);
}
, fun(instance): GenPagesTemplateDropCardCardCard {
    return GenPagesTemplateDropCardCardCard(instance);
}
);
val GenPagesTemplateDropCardDropCardClass = CreateVueComponent(GenPagesTemplateDropCardDropCard::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateDropCardDropCard.inheritAttrs, inject = GenPagesTemplateDropCardDropCard.inject, props = GenPagesTemplateDropCardDropCard.props, propsNeedCastKeys = GenPagesTemplateDropCardDropCard.propsNeedCastKeys, emits = GenPagesTemplateDropCardDropCard.emits, components = GenPagesTemplateDropCardDropCard.components, styles = GenPagesTemplateDropCardDropCard.styles);
}
, fun(instance): GenPagesTemplateDropCardDropCard {
    return GenPagesTemplateDropCardDropCard(instance);
}
);
open class SwiperTabsItem1 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItem1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItem1ReactiveObject : SwiperTabsItem1, IUTSReactive<SwiperTabsItem1> {
    override var __v_raw: SwiperTabsItem1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItem1ReactiveObject {
        return SwiperTabsItem1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem1 (
    @JsonNotNull
    open var title: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem1ReactiveObject : SwiperViewItem1, IUTSReactive<SwiperViewItem1> {
    override var __v_raw: SwiperViewItem1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(title = __v_raw.title) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem1ReactiveObject {
        return SwiperViewItem1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
}
fun lerpNumber1(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateSwiperListSwiperListClass = CreateVueComponent(GenPagesTemplateSwiperListSwiperList::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateSwiperListSwiperList.inheritAttrs, inject = GenPagesTemplateSwiperListSwiperList.inject, props = GenPagesTemplateSwiperListSwiperList.props, propsNeedCastKeys = GenPagesTemplateSwiperListSwiperList.propsNeedCastKeys, emits = GenPagesTemplateSwiperListSwiperList.emits, components = GenPagesTemplateSwiperListSwiperList.components, styles = GenPagesTemplateSwiperListSwiperList.styles);
}
, fun(instance): GenPagesTemplateSwiperListSwiperList {
    return GenPagesTemplateSwiperListSwiperList(instance);
}
);
open class SwiperViewItem2 (
    @JsonNotNull
    open var title: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem2ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem2ReactiveObject : SwiperViewItem2, IUTSReactive<SwiperViewItem2> {
    override var __v_raw: SwiperViewItem2;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem2, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(title = __v_raw.title) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem2ReactiveObject {
        return SwiperViewItem2ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
}
fun lerpNumber2(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateSwiperList2SwiperList2Class = CreateVueComponent(GenPagesTemplateSwiperList2SwiperList2::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateSwiperList2SwiperList2.inheritAttrs, inject = GenPagesTemplateSwiperList2SwiperList2.inject, props = GenPagesTemplateSwiperList2SwiperList2.props, propsNeedCastKeys = GenPagesTemplateSwiperList2SwiperList2.propsNeedCastKeys, emits = GenPagesTemplateSwiperList2SwiperList2.emits, components = GenPagesTemplateSwiperList2SwiperList2.components, styles = GenPagesTemplateSwiperList2SwiperList2.styles);
}
, fun(instance): GenPagesTemplateSwiperList2SwiperList2 {
    return GenPagesTemplateSwiperList2SwiperList2(instance);
}
);
val GenPagesTemplateSlider100Slider100Class = CreateVueComponent(GenPagesTemplateSlider100Slider100::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateSlider100Slider100.inheritAttrs, inject = GenPagesTemplateSlider100Slider100.inject, props = GenPagesTemplateSlider100Slider100.props, propsNeedCastKeys = GenPagesTemplateSlider100Slider100.propsNeedCastKeys, emits = GenPagesTemplateSlider100Slider100.emits, components = GenPagesTemplateSlider100Slider100.components, styles = GenPagesTemplateSlider100Slider100.styles);
}
, fun(instance): GenPagesTemplateSlider100Slider100 {
    return GenPagesTemplateSlider100Slider100(instance);
}
);
open class ListItem1 (
    @JsonNotNull
    open var _id: String,
    @JsonNotNull
    open var content: String,
    @JsonNotNull
    open var src: String,
    @JsonNotNull
    open var poster_src: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ListItem1ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ListItem1ReactiveObject : ListItem1, IUTSReactive<ListItem1> {
    override var __v_raw: ListItem1;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ListItem1, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(_id = __v_raw._id, content = __v_raw.content, src = __v_raw.src, poster_src = __v_raw.poster_src) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ListItem1ReactiveObject {
        return ListItem1ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var _id: String
        get() {
            return trackReactiveGet(__v_raw, "_id", __v_raw._id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("_id")) {
                return;
            }
            val oldValue = __v_raw._id;
            __v_raw._id = value;
            triggerReactiveSet(__v_raw, "_id", oldValue, value);
        }
    override var content: String
        get() {
            return trackReactiveGet(__v_raw, "content", __v_raw.content, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("content")) {
                return;
            }
            val oldValue = __v_raw.content;
            __v_raw.content = value;
            triggerReactiveSet(__v_raw, "content", oldValue, value);
        }
    override var src: String
        get() {
            return trackReactiveGet(__v_raw, "src", __v_raw.src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("src")) {
                return;
            }
            val oldValue = __v_raw.src;
            __v_raw.src = value;
            triggerReactiveSet(__v_raw, "src", oldValue, value);
        }
    override var poster_src: String
        get() {
            return trackReactiveGet(__v_raw, "poster_src", __v_raw.poster_src, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("poster_src")) {
                return;
            }
            val oldValue = __v_raw.poster_src;
            __v_raw.poster_src = value;
            triggerReactiveSet(__v_raw, "poster_src", oldValue, value);
        }
}
var page: Number = 0;
var currentPageIsShow: Boolean = true;
val GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoClass = CreateVueComponent(GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.inheritAttrs, inject = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.inject, props = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.props, propsNeedCastKeys = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.propsNeedCastKeys, emits = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.emits, components = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.components, styles = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo.styles);
}
, fun(instance): GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo {
    return GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideo(instance);
}
);
val GenPagesTemplateScrollStickyScrollStickyClass = CreateVueComponent(GenPagesTemplateScrollStickyScrollSticky::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateScrollStickyScrollSticky.inheritAttrs, inject = GenPagesTemplateScrollStickyScrollSticky.inject, props = GenPagesTemplateScrollStickyScrollSticky.props, propsNeedCastKeys = GenPagesTemplateScrollStickyScrollSticky.propsNeedCastKeys, emits = GenPagesTemplateScrollStickyScrollSticky.emits, components = GenPagesTemplateScrollStickyScrollSticky.components, styles = GenPagesTemplateScrollStickyScrollSticky.styles);
}
, fun(instance): GenPagesTemplateScrollStickyScrollSticky {
    return GenPagesTemplateScrollStickyScrollSticky(instance);
}
);
val NAVIBARHEIGHT: Number = 88;
val SEARCHBARHEIGHT: Number = 40;
val BACKWIDTH: Number = 32;
val GenPagesTemplateScrollFoldNavScrollFoldNavClass = CreateVueComponent(GenPagesTemplateScrollFoldNavScrollFoldNav::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateScrollFoldNavScrollFoldNav.inheritAttrs, inject = GenPagesTemplateScrollFoldNavScrollFoldNav.inject, props = GenPagesTemplateScrollFoldNavScrollFoldNav.props, propsNeedCastKeys = GenPagesTemplateScrollFoldNavScrollFoldNav.propsNeedCastKeys, emits = GenPagesTemplateScrollFoldNavScrollFoldNav.emits, components = GenPagesTemplateScrollFoldNavScrollFoldNav.components, styles = GenPagesTemplateScrollFoldNavScrollFoldNav.styles);
}
, fun(instance): GenPagesTemplateScrollFoldNavScrollFoldNav {
    return GenPagesTemplateScrollFoldNavScrollFoldNav(instance);
}
);
val GenPagesTemplateCustomRefresherCustomRefresherClass = CreateVueComponent(GenPagesTemplateCustomRefresherCustomRefresher::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateCustomRefresherCustomRefresher.inheritAttrs, inject = GenPagesTemplateCustomRefresherCustomRefresher.inject, props = GenPagesTemplateCustomRefresherCustomRefresher.props, propsNeedCastKeys = GenPagesTemplateCustomRefresherCustomRefresher.propsNeedCastKeys, emits = GenPagesTemplateCustomRefresherCustomRefresher.emits, components = GenPagesTemplateCustomRefresherCustomRefresher.components, styles = GenPagesTemplateCustomRefresherCustomRefresher.styles);
}
, fun(instance): GenPagesTemplateCustomRefresherCustomRefresher {
    return GenPagesTemplateCustomRefresherCustomRefresher(instance);
}
);
val GenPagesTemplateHalfScreenHalfScreenClass = CreateVueComponent(GenPagesTemplateHalfScreenHalfScreen::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateHalfScreenHalfScreen.inheritAttrs, inject = GenPagesTemplateHalfScreenHalfScreen.inject, props = GenPagesTemplateHalfScreenHalfScreen.props, propsNeedCastKeys = GenPagesTemplateHalfScreenHalfScreen.propsNeedCastKeys, emits = GenPagesTemplateHalfScreenHalfScreen.emits, components = GenPagesTemplateHalfScreenHalfScreen.components, styles = GenPagesTemplateHalfScreenHalfScreen.styles);
}
, fun(instance): GenPagesTemplateHalfScreenHalfScreen {
    return GenPagesTemplateHalfScreenHalfScreen(instance);
}
);
val SERVER_URL = "https://unidemo.dcloud.net.cn/plugin/uniappx-plugin-list";
val PAGE_SIZE: Number = 10;
open class ListItem2 (
    @JsonNotNull
    open var plugin_id: Number,
    @JsonNotNull
    open var plugin_img_link: String,
    @JsonNotNull
    open var plugin_name: String,
    @JsonNotNull
    open var plugin_intro: String,
    @JsonNotNull
    open var score: Number,
    @JsonNotNull
    open var tags: UTSArray<String>,
    @JsonNotNull
    open var update_date: String,
    @JsonNotNull
    open var author_name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ListItem2ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ListItem2ReactiveObject : ListItem2, IUTSReactive<ListItem2> {
    override var __v_raw: ListItem2;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ListItem2, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(plugin_id = __v_raw.plugin_id, plugin_img_link = __v_raw.plugin_img_link, plugin_name = __v_raw.plugin_name, plugin_intro = __v_raw.plugin_intro, score = __v_raw.score, tags = __v_raw.tags, update_date = __v_raw.update_date, author_name = __v_raw.author_name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ListItem2ReactiveObject {
        return ListItem2ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var plugin_id: Number
        get() {
            return trackReactiveGet(__v_raw, "plugin_id", __v_raw.plugin_id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_id")) {
                return;
            }
            val oldValue = __v_raw.plugin_id;
            __v_raw.plugin_id = value;
            triggerReactiveSet(__v_raw, "plugin_id", oldValue, value);
        }
    override var plugin_img_link: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_img_link", __v_raw.plugin_img_link, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_img_link")) {
                return;
            }
            val oldValue = __v_raw.plugin_img_link;
            __v_raw.plugin_img_link = value;
            triggerReactiveSet(__v_raw, "plugin_img_link", oldValue, value);
        }
    override var plugin_name: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_name", __v_raw.plugin_name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_name")) {
                return;
            }
            val oldValue = __v_raw.plugin_name;
            __v_raw.plugin_name = value;
            triggerReactiveSet(__v_raw, "plugin_name", oldValue, value);
        }
    override var plugin_intro: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_intro", __v_raw.plugin_intro, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_intro")) {
                return;
            }
            val oldValue = __v_raw.plugin_intro;
            __v_raw.plugin_intro = value;
            triggerReactiveSet(__v_raw, "plugin_intro", oldValue, value);
        }
    override var score: Number
        get() {
            return trackReactiveGet(__v_raw, "score", __v_raw.score, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("score")) {
                return;
            }
            val oldValue = __v_raw.score;
            __v_raw.score = value;
            triggerReactiveSet(__v_raw, "score", oldValue, value);
        }
    override var tags: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "tags", __v_raw.tags, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tags")) {
                return;
            }
            val oldValue = __v_raw.tags;
            __v_raw.tags = value;
            triggerReactiveSet(__v_raw, "tags", oldValue, value);
        }
    override var update_date: String
        get() {
            return trackReactiveGet(__v_raw, "update_date", __v_raw.update_date, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("update_date")) {
                return;
            }
            val oldValue = __v_raw.update_date;
            __v_raw.update_date = value;
            triggerReactiveSet(__v_raw, "update_date", oldValue, value);
        }
    override var author_name: String
        get() {
            return trackReactiveGet(__v_raw, "author_name", __v_raw.author_name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("author_name")) {
                return;
            }
            val oldValue = __v_raw.author_name;
            __v_raw.author_name = value;
            triggerReactiveSet(__v_raw, "author_name", oldValue, value);
        }
}
open class ResponseDataType (
    @JsonNotNull
    open var code: Number,
    @JsonNotNull
    open var data: UTSArray<ListItem2>,
) : UTSObject()
val GenPagesTemplateLongListLongListPageClass = CreateVueComponent(GenPagesTemplateLongListLongListPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateLongListLongListPage.inheritAttrs, inject = GenPagesTemplateLongListLongListPage.inject, props = GenPagesTemplateLongListLongListPage.props, propsNeedCastKeys = GenPagesTemplateLongListLongListPage.propsNeedCastKeys, emits = GenPagesTemplateLongListLongListPage.emits, components = GenPagesTemplateLongListLongListPage.components, styles = GenPagesTemplateLongListLongListPage.styles);
}
, fun(instance): GenPagesTemplateLongListLongListPage {
    return GenPagesTemplateLongListLongListPage(instance);
}
);
open class SwiperTabsItem2 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItem2ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItem2ReactiveObject : SwiperTabsItem2, IUTSReactive<SwiperTabsItem2> {
    override var __v_raw: SwiperTabsItem2;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem2, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItem2ReactiveObject {
        return SwiperTabsItem2ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem3 (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var preload: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem3ReactiveObject : SwiperViewItem3, IUTSReactive<SwiperViewItem3> {
    override var __v_raw: SwiperViewItem3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(type = __v_raw.type, name = __v_raw.name, preload = __v_raw.preload) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem3ReactiveObject {
        return SwiperViewItem3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var preload: Boolean
        get() {
            return trackReactiveGet(__v_raw, "preload", __v_raw.preload, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("preload")) {
                return;
            }
            val oldValue = __v_raw.preload;
            __v_raw.preload = value;
            triggerReactiveSet(__v_raw, "preload", oldValue, value);
        }
}
fun lerpNumber3(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateLongListLongListClass = CreateVueComponent(GenPagesTemplateLongListLongList::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateLongListLongList.inheritAttrs, inject = GenPagesTemplateLongListLongList.inject, props = GenPagesTemplateLongListLongList.props, propsNeedCastKeys = GenPagesTemplateLongListLongList.propsNeedCastKeys, emits = GenPagesTemplateLongListLongList.emits, components = GenPagesTemplateLongListLongList.components, styles = GenPagesTemplateLongListLongList.styles);
}
, fun(instance): GenPagesTemplateLongListLongList {
    return GenPagesTemplateLongListLongList(instance);
}
);
open class SwiperTabsItem3 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItem3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItem3ReactiveObject : SwiperTabsItem3, IUTSReactive<SwiperTabsItem3> {
    override var __v_raw: SwiperTabsItem3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItem3ReactiveObject {
        return SwiperTabsItem3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem4 (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var preload: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem4ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem4ReactiveObject : SwiperViewItem4, IUTSReactive<SwiperViewItem4> {
    override var __v_raw: SwiperViewItem4;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem4, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(type = __v_raw.type, name = __v_raw.name, id = __v_raw.id, preload = __v_raw.preload) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem4ReactiveObject {
        return SwiperViewItem4ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var preload: Boolean
        get() {
            return trackReactiveGet(__v_raw, "preload", __v_raw.preload, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("preload")) {
                return;
            }
            val oldValue = __v_raw.preload;
            __v_raw.preload = value;
            triggerReactiveSet(__v_raw, "preload", oldValue, value);
        }
}
fun lerpNumber4(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateLongList2LongList2Class = CreateVueComponent(GenPagesTemplateLongList2LongList2::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateLongList2LongList2.inheritAttrs, inject = GenPagesTemplateLongList2LongList2.inject, props = GenPagesTemplateLongList2LongList2.props, propsNeedCastKeys = GenPagesTemplateLongList2LongList2.propsNeedCastKeys, emits = GenPagesTemplateLongList2LongList2.emits, components = GenPagesTemplateLongList2LongList2.components, styles = GenPagesTemplateLongList2LongList2.styles);
}
, fun(instance): GenPagesTemplateLongList2LongList2 {
    return GenPagesTemplateLongList2LongList2(instance);
}
);
open class SwiperTabsItem4 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItem4ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItem4ReactiveObject : SwiperTabsItem4, IUTSReactive<SwiperTabsItem4> {
    override var __v_raw: SwiperTabsItem4;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem4, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItem4ReactiveObject {
        return SwiperTabsItem4ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem5 (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var preload: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem5ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem5ReactiveObject : SwiperViewItem5, IUTSReactive<SwiperViewItem5> {
    override var __v_raw: SwiperViewItem5;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem5, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(type = __v_raw.type, name = __v_raw.name, id = __v_raw.id, preload = __v_raw.preload) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem5ReactiveObject {
        return SwiperViewItem5ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var preload: Boolean
        get() {
            return trackReactiveGet(__v_raw, "preload", __v_raw.preload, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("preload")) {
                return;
            }
            val oldValue = __v_raw.preload;
            __v_raw.preload = value;
            triggerReactiveSet(__v_raw, "preload", oldValue, value);
        }
}
fun lerpNumber5(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateLongListNestedLongListNestedClass = CreateVueComponent(GenPagesTemplateLongListNestedLongListNested::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateLongListNestedLongListNested.inheritAttrs, inject = GenPagesTemplateLongListNestedLongListNested.inject, props = GenPagesTemplateLongListNestedLongListNested.props, propsNeedCastKeys = GenPagesTemplateLongListNestedLongListNested.propsNeedCastKeys, emits = GenPagesTemplateLongListNestedLongListNested.emits, components = GenPagesTemplateLongListNestedLongListNested.components, styles = GenPagesTemplateLongListNestedLongListNested.styles);
}
, fun(instance): GenPagesTemplateLongListNestedLongListNested {
    return GenPagesTemplateLongListNestedLongListNested(instance);
}
);
val SERVER_URL1 = "https://unidemo.dcloud.net.cn/plugin/uniappx-plugin-list";
val PAGE_SIZE1: Number = 10;
open class flowItem (
    @JsonNotNull
    open var plugin_id: Number,
    @JsonNotNull
    open var plugin_img_link: String,
    @JsonNotNull
    open var plugin_name: String,
    @JsonNotNull
    open var plugin_intro: String,
    @JsonNotNull
    open var score: Number,
    @JsonNotNull
    open var tags: UTSArray<String>,
    @JsonNotNull
    open var update_date: String,
    @JsonNotNull
    open var author_name: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return flowItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class flowItemReactiveObject : flowItem, IUTSReactive<flowItem> {
    override var __v_raw: flowItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: flowItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(plugin_id = __v_raw.plugin_id, plugin_img_link = __v_raw.plugin_img_link, plugin_name = __v_raw.plugin_name, plugin_intro = __v_raw.plugin_intro, score = __v_raw.score, tags = __v_raw.tags, update_date = __v_raw.update_date, author_name = __v_raw.author_name) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): flowItemReactiveObject {
        return flowItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var plugin_id: Number
        get() {
            return trackReactiveGet(__v_raw, "plugin_id", __v_raw.plugin_id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_id")) {
                return;
            }
            val oldValue = __v_raw.plugin_id;
            __v_raw.plugin_id = value;
            triggerReactiveSet(__v_raw, "plugin_id", oldValue, value);
        }
    override var plugin_img_link: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_img_link", __v_raw.plugin_img_link, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_img_link")) {
                return;
            }
            val oldValue = __v_raw.plugin_img_link;
            __v_raw.plugin_img_link = value;
            triggerReactiveSet(__v_raw, "plugin_img_link", oldValue, value);
        }
    override var plugin_name: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_name", __v_raw.plugin_name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_name")) {
                return;
            }
            val oldValue = __v_raw.plugin_name;
            __v_raw.plugin_name = value;
            triggerReactiveSet(__v_raw, "plugin_name", oldValue, value);
        }
    override var plugin_intro: String
        get() {
            return trackReactiveGet(__v_raw, "plugin_intro", __v_raw.plugin_intro, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("plugin_intro")) {
                return;
            }
            val oldValue = __v_raw.plugin_intro;
            __v_raw.plugin_intro = value;
            triggerReactiveSet(__v_raw, "plugin_intro", oldValue, value);
        }
    override var score: Number
        get() {
            return trackReactiveGet(__v_raw, "score", __v_raw.score, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("score")) {
                return;
            }
            val oldValue = __v_raw.score;
            __v_raw.score = value;
            triggerReactiveSet(__v_raw, "score", oldValue, value);
        }
    override var tags: UTSArray<String>
        get() {
            return trackReactiveGet(__v_raw, "tags", __v_raw.tags, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("tags")) {
                return;
            }
            val oldValue = __v_raw.tags;
            __v_raw.tags = value;
            triggerReactiveSet(__v_raw, "tags", oldValue, value);
        }
    override var update_date: String
        get() {
            return trackReactiveGet(__v_raw, "update_date", __v_raw.update_date, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("update_date")) {
                return;
            }
            val oldValue = __v_raw.update_date;
            __v_raw.update_date = value;
            triggerReactiveSet(__v_raw, "update_date", oldValue, value);
        }
    override var author_name: String
        get() {
            return trackReactiveGet(__v_raw, "author_name", __v_raw.author_name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("author_name")) {
                return;
            }
            val oldValue = __v_raw.author_name;
            __v_raw.author_name = value;
            triggerReactiveSet(__v_raw, "author_name", oldValue, value);
        }
}
open class ResponseDataType1 (
    @JsonNotNull
    open var code: Number,
    @JsonNotNull
    open var data: UTSArray<flowItem>,
) : UTSObject()
val GenPagesTemplateLongWaterflowNestedLongWaterflowPageClass = CreateVueComponent(GenPagesTemplateLongWaterflowNestedLongWaterflowPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.inheritAttrs, inject = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.inject, props = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.props, propsNeedCastKeys = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.propsNeedCastKeys, emits = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.emits, components = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.components, styles = GenPagesTemplateLongWaterflowNestedLongWaterflowPage.styles);
}
, fun(instance): GenPagesTemplateLongWaterflowNestedLongWaterflowPage {
    return GenPagesTemplateLongWaterflowNestedLongWaterflowPage(instance);
}
);
open class SwiperTabsItem5 (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var w: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperTabsItem5ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperTabsItem5ReactiveObject : SwiperTabsItem5, IUTSReactive<SwiperTabsItem5> {
    override var __v_raw: SwiperTabsItem5;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperTabsItem5, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, w = __v_raw.w) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperTabsItem5ReactiveObject {
        return SwiperTabsItem5ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var w: Number
        get() {
            return trackReactiveGet(__v_raw, "w", __v_raw.w, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("w")) {
                return;
            }
            val oldValue = __v_raw.w;
            __v_raw.w = value;
            triggerReactiveSet(__v_raw, "w", oldValue, value);
        }
}
open class SwiperViewItem6 (
    @JsonNotNull
    open var type: String,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var id: String,
    @JsonNotNull
    open var preload: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return SwiperViewItem6ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class SwiperViewItem6ReactiveObject : SwiperViewItem6, IUTSReactive<SwiperViewItem6> {
    override var __v_raw: SwiperViewItem6;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: SwiperViewItem6, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(type = __v_raw.type, name = __v_raw.name, id = __v_raw.id, preload = __v_raw.preload) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): SwiperViewItem6ReactiveObject {
        return SwiperViewItem6ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var type: String
        get() {
            return trackReactiveGet(__v_raw, "type", __v_raw.type, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("type")) {
                return;
            }
            val oldValue = __v_raw.type;
            __v_raw.type = value;
            triggerReactiveSet(__v_raw, "type", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var id: String
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var preload: Boolean
        get() {
            return trackReactiveGet(__v_raw, "preload", __v_raw.preload, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("preload")) {
                return;
            }
            val oldValue = __v_raw.preload;
            __v_raw.preload = value;
            triggerReactiveSet(__v_raw, "preload", oldValue, value);
        }
}
fun lerpNumber6(value1: Number, value2: Number, amount: Number): Number {
    return (value1 + (value2 - value1) * amount);
}
val GenPagesTemplateLongWaterflowNestedLongWaterflowNestedClass = CreateVueComponent(GenPagesTemplateLongWaterflowNestedLongWaterflowNested::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.inheritAttrs, inject = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.inject, props = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.props, propsNeedCastKeys = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.propsNeedCastKeys, emits = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.emits, components = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.components, styles = GenPagesTemplateLongWaterflowNestedLongWaterflowNested.styles);
}
, fun(instance): GenPagesTemplateLongWaterflowNestedLongWaterflowNested {
    return GenPagesTemplateLongWaterflowNestedLongWaterflowNested(instance);
}
);
val GenPagesTemplatePullZoomImagePullZoomImageClass = CreateVueComponent(GenPagesTemplatePullZoomImagePullZoomImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplatePullZoomImagePullZoomImage.inheritAttrs, inject = GenPagesTemplatePullZoomImagePullZoomImage.inject, props = GenPagesTemplatePullZoomImagePullZoomImage.props, propsNeedCastKeys = GenPagesTemplatePullZoomImagePullZoomImage.propsNeedCastKeys, emits = GenPagesTemplatePullZoomImagePullZoomImage.emits, components = GenPagesTemplatePullZoomImagePullZoomImage.components, styles = GenPagesTemplatePullZoomImagePullZoomImage.styles);
}
, fun(instance): GenPagesTemplatePullZoomImagePullZoomImage {
    return GenPagesTemplatePullZoomImagePullZoomImage(instance);
}
);
val default3 = "/assets/uniicons.ab33ac77.ttf";
val GenComponentsUniNavbarLiteUniNavbarLiteClass = CreateVueComponent(GenComponentsUniNavbarLiteUniNavbarLite::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenComponentsUniNavbarLiteUniNavbarLite.name, inheritAttrs = GenComponentsUniNavbarLiteUniNavbarLite.inheritAttrs, inject = GenComponentsUniNavbarLiteUniNavbarLite.inject, props = GenComponentsUniNavbarLiteUniNavbarLite.props, propsNeedCastKeys = GenComponentsUniNavbarLiteUniNavbarLite.propsNeedCastKeys, emits = GenComponentsUniNavbarLiteUniNavbarLite.emits, components = GenComponentsUniNavbarLiteUniNavbarLite.components, styles = GenComponentsUniNavbarLiteUniNavbarLite.styles);
}
, fun(instance): GenComponentsUniNavbarLiteUniNavbarLite {
    return GenComponentsUniNavbarLiteUniNavbarLite(instance);
}
);
val GenPagesTemplateNavbarLiteNavbarLiteClass = CreateVueComponent(GenPagesTemplateNavbarLiteNavbarLite::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateNavbarLiteNavbarLite.inheritAttrs, inject = GenPagesTemplateNavbarLiteNavbarLite.inject, props = GenPagesTemplateNavbarLiteNavbarLite.props, propsNeedCastKeys = GenPagesTemplateNavbarLiteNavbarLite.propsNeedCastKeys, emits = GenPagesTemplateNavbarLiteNavbarLite.emits, components = GenPagesTemplateNavbarLiteNavbarLite.components, styles = GenPagesTemplateNavbarLiteNavbarLite.styles);
}
, fun(instance): GenPagesTemplateNavbarLiteNavbarLite {
    return GenPagesTemplateNavbarLiteNavbarLite(instance);
}
);
open class ListItem3 (
    @JsonNotNull
    open var title: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return ListItem3ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class ListItem3ReactiveObject : ListItem3, IUTSReactive<ListItem3> {
    override var __v_raw: ListItem3;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: ListItem3, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(title = __v_raw.title) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): ListItem3ReactiveObject {
        return ListItem3ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var title: String
        get() {
            return trackReactiveGet(__v_raw, "title", __v_raw.title, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("title")) {
                return;
            }
            val oldValue = __v_raw.title;
            __v_raw.title = value;
            triggerReactiveSet(__v_raw, "title", oldValue, value);
        }
}
val GenPagesTemplateCustomTabBarCustomTabBarTab1Class = CreateVueComponent(GenPagesTemplateCustomTabBarCustomTabBarTab1::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateCustomTabBarCustomTabBarTab1.inheritAttrs, inject = GenPagesTemplateCustomTabBarCustomTabBarTab1.inject, props = GenPagesTemplateCustomTabBarCustomTabBarTab1.props, propsNeedCastKeys = GenPagesTemplateCustomTabBarCustomTabBarTab1.propsNeedCastKeys, emits = GenPagesTemplateCustomTabBarCustomTabBarTab1.emits, components = GenPagesTemplateCustomTabBarCustomTabBarTab1.components, styles = GenPagesTemplateCustomTabBarCustomTabBarTab1.styles);
}
, fun(instance): GenPagesTemplateCustomTabBarCustomTabBarTab1 {
    return GenPagesTemplateCustomTabBarCustomTabBarTab1(instance);
}
);
val GenPagesTemplateCustomTabBarCustomTabBarTab2Class = CreateVueComponent(GenPagesTemplateCustomTabBarCustomTabBarTab2::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesTemplateCustomTabBarCustomTabBarTab2.inheritAttrs, inject = GenPagesTemplateCustomTabBarCustomTabBarTab2.inject, props = GenPagesTemplateCustomTabBarCustomTabBarTab2.props, propsNeedCastKeys = GenPagesTemplateCustomTabBarCustomTabBarTab2.propsNeedCastKeys, emits = GenPagesTemplateCustomTabBarCustomTabBarTab2.emits, components = GenPagesTemplateCustomTabBarCustomTabBarTab2.components, styles = GenPagesTemplateCustomTabBarCustomTabBarTab2.styles);
}
, fun(instance): GenPagesTemplateCustomTabBarCustomTabBarTab2 {
    return GenPagesTemplateCustomTabBarCustomTabBarTab2(instance);
}
);
open class TabItem (
    @JsonNotNull
    open var init: Boolean = false,
    @JsonNotNull
    open var preload: Boolean = false,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return TabItemReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class TabItemReactiveObject : TabItem, IUTSReactive<TabItem> {
    override var __v_raw: TabItem;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: TabItem, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(init = __v_raw.init, preload = __v_raw.preload) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): TabItemReactiveObject {
        return TabItemReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var init: Boolean
        get() {
            return trackReactiveGet(__v_raw, "init", __v_raw.init, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("init")) {
                return;
            }
            val oldValue = __v_raw.init;
            __v_raw.init = value;
            triggerReactiveSet(__v_raw, "init", oldValue, value);
        }
    override var preload: Boolean
        get() {
            return trackReactiveGet(__v_raw, "preload", __v_raw.preload, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("preload")) {
                return;
            }
            val oldValue = __v_raw.preload;
            __v_raw.preload = value;
            triggerReactiveSet(__v_raw, "preload", oldValue, value);
        }
}
val GenPagesTemplateCustomTabBarCustomTabBarClass = CreateVueComponent(GenPagesTemplateCustomTabBarCustomTabBar::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateCustomTabBarCustomTabBar.inheritAttrs, inject = GenPagesTemplateCustomTabBarCustomTabBar.inject, props = GenPagesTemplateCustomTabBarCustomTabBar.props, propsNeedCastKeys = GenPagesTemplateCustomTabBarCustomTabBar.propsNeedCastKeys, emits = GenPagesTemplateCustomTabBarCustomTabBar.emits, components = GenPagesTemplateCustomTabBarCustomTabBar.components, styles = GenPagesTemplateCustomTabBarCustomTabBar.styles);
}
, fun(instance): GenPagesTemplateCustomTabBarCustomTabBar {
    return GenPagesTemplateCustomTabBarCustomTabBar(instance);
}
);
val lunarYears: UTSArray<Number> = utsArrayOf(
    0x04bd8,
    0x04ae0,
    0x0a570,
    0x054d5,
    0x0d260,
    0x0d950,
    0x16554,
    0x056a0,
    0x09ad0,
    0x055d2,
    0x04ae0,
    0x0a5b6,
    0x0a4d0,
    0x0d250,
    0x1d255,
    0x0b540,
    0x0d6a0,
    0x0ada2,
    0x095b0,
    0x14977,
    0x04970,
    0x0a4b0,
    0x0b4b5,
    0x06a50,
    0x06d40,
    0x1ab54,
    0x02b60,
    0x09570,
    0x052f2,
    0x04970,
    0x06566,
    0x0d4a0,
    0x0ea50,
    0x16a95,
    0x05ad0,
    0x02b60,
    0x186e3,
    0x092e0,
    0x1c8d7,
    0x0c950,
    0x0d4a0,
    0x1d8a6,
    0x0b550,
    0x056a0,
    0x1a5b4,
    0x025d0,
    0x092d0,
    0x0d2b2,
    0x0a950,
    0x0b557,
    0x06ca0,
    0x0b550,
    0x15355,
    0x04da0,
    0x0a5b0,
    0x14573,
    0x052b0,
    0x0a9a8,
    0x0e950,
    0x06aa0,
    0x0aea6,
    0x0ab50,
    0x04b60,
    0x0aae4,
    0x0a570,
    0x05260,
    0x0f263,
    0x0d950,
    0x05b57,
    0x056a0,
    0x096d0,
    0x04dd5,
    0x04ad0,
    0x0a4d0,
    0x0d4d4,
    0x0d250,
    0x0d558,
    0x0b540,
    0x0b6a0,
    0x195a6,
    0x095b0,
    0x049b0,
    0x0a974,
    0x0a4b0,
    0x0b27a,
    0x06a50,
    0x06d40,
    0x0af46,
    0x0ab60,
    0x09570,
    0x04af5,
    0x04970,
    0x064b0,
    0x074a3,
    0x0ea50,
    0x06b58,
    0x05ac0,
    0x0ab60,
    0x096d5,
    0x092e0,
    0x0c960,
    0x0d954,
    0x0d4a0,
    0x0da50,
    0x07552,
    0x056a0,
    0x0abb7,
    0x025d0,
    0x092d0,
    0x0cab5,
    0x0a950,
    0x0b4a0,
    0x0baa4,
    0x0ad50,
    0x055d9,
    0x04ba0,
    0x0a5b0,
    0x15176,
    0x052b0,
    0x0a930,
    0x07954,
    0x06aa0,
    0x0ad50,
    0x05b52,
    0x04b60,
    0x0a6e6,
    0x0a4e0,
    0x0d260,
    0x0ea65,
    0x0d530,
    0x05aa0,
    0x076a3,
    0x096d0,
    0x04afb,
    0x04ad0,
    0x0a4d0,
    0x1d0b6,
    0x0d250,
    0x0d520,
    0x0dd45,
    0x0b5a0,
    0x056d0,
    0x055b2,
    0x049b0,
    0x0a577,
    0x0a4b0,
    0x0aa50,
    0x1b255,
    0x06d20,
    0x0ada0,
    0x14b63,
    0x09370,
    0x049f8,
    0x04970,
    0x064b0,
    0x168a6,
    0x0ea50,
    0x06b20,
    0x1a6c4,
    0x0aae0,
    0x092e0,
    0x0d2e3,
    0x0c960,
    0x0d557,
    0x0d4a0,
    0x0da50,
    0x05d55,
    0x056a0,
    0x0a6d0,
    0x055d4,
    0x052d0,
    0x0a9b8,
    0x0a950,
    0x0b4a0,
    0x0b6a6,
    0x0ad50,
    0x055a0,
    0x0aba4,
    0x0a5b0,
    0x052b0,
    0x0b273,
    0x06930,
    0x07337,
    0x06aa0,
    0x0ad50,
    0x14b55,
    0x04b60,
    0x0a570,
    0x054e4,
    0x0d160,
    0x0e968,
    0x0d520,
    0x0daa0,
    0x16aa6,
    0x056d0,
    0x04ae0,
    0x0a9d4,
    0x0a2d0,
    0x0d150,
    0x0f252,
    0x0d520
);
val N_STR_3 = utsArrayOf(
    "\u6708",
    "\u6b63",
    "\u4e8c",
    "\u4e09",
    "\u56db",
    "\u4e94",
    "\u516d",
    "\u4e03",
    "\u516b",
    "\u4e5d",
    "\u5341",
    "\u51ac",
    "\u814a"
);
val N_STR_1 = utsArrayOf(
    "\u65e5",
    "\u4e00",
    "\u4e8c",
    "\u4e09",
    "\u56db",
    "\u4e94",
    "\u516d",
    "\u4e03",
    "\u516b",
    "\u4e5d",
    "\u5341"
);
val N_STR_2 = utsArrayOf(
    "\u521d",
    "\u5341",
    "\u5eff",
    "\u5345",
    "\u95f0"
);
open class InfoType (
    @JsonNotNull
    open var lunarY: Number,
    @JsonNotNull
    open var lunarM: Number,
    @JsonNotNull
    open var lunarD: Number,
    @JsonNotNull
    open var isLeap: Boolean = false,
) : UTSObject()
open class LunarInfoType (
    @JsonNotNull
    open var lYear: Number,
    @JsonNotNull
    open var lMonth: Number,
    @JsonNotNull
    open var lDay: Number,
    @JsonNotNull
    open var IMonthCn: String,
    @JsonNotNull
    open var IDayCn: String,
    @JsonNotNull
    open var cYear: Number,
    @JsonNotNull
    open var cMonth: Number,
    @JsonNotNull
    open var cDay: Number,
    open var gzYear: String? = null,
    open var gzMonth: String? = null,
    open var gzDay: String? = null,
    @JsonNotNull
    open var isToday: Boolean = false,
    @JsonNotNull
    open var isLeap: Boolean = false,
    open var nWeek: Number? = null,
    open var ncWeek: String? = null,
    open var isTerm: Boolean? = null,
    open var Term: String? = null,
    open var astro: String? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return LunarInfoTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class LunarInfoTypeReactiveObject : LunarInfoType, IUTSReactive<LunarInfoType> {
    override var __v_raw: LunarInfoType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: LunarInfoType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(lYear = __v_raw.lYear, lMonth = __v_raw.lMonth, lDay = __v_raw.lDay, IMonthCn = __v_raw.IMonthCn, IDayCn = __v_raw.IDayCn, cYear = __v_raw.cYear, cMonth = __v_raw.cMonth, cDay = __v_raw.cDay, gzYear = __v_raw.gzYear, gzMonth = __v_raw.gzMonth, gzDay = __v_raw.gzDay, isToday = __v_raw.isToday, isLeap = __v_raw.isLeap, nWeek = __v_raw.nWeek, ncWeek = __v_raw.ncWeek, isTerm = __v_raw.isTerm, Term = __v_raw.Term, astro = __v_raw.astro) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): LunarInfoTypeReactiveObject {
        return LunarInfoTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var lYear: Number
        get() {
            return trackReactiveGet(__v_raw, "lYear", __v_raw.lYear, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lYear")) {
                return;
            }
            val oldValue = __v_raw.lYear;
            __v_raw.lYear = value;
            triggerReactiveSet(__v_raw, "lYear", oldValue, value);
        }
    override var lMonth: Number
        get() {
            return trackReactiveGet(__v_raw, "lMonth", __v_raw.lMonth, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lMonth")) {
                return;
            }
            val oldValue = __v_raw.lMonth;
            __v_raw.lMonth = value;
            triggerReactiveSet(__v_raw, "lMonth", oldValue, value);
        }
    override var lDay: Number
        get() {
            return trackReactiveGet(__v_raw, "lDay", __v_raw.lDay, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lDay")) {
                return;
            }
            val oldValue = __v_raw.lDay;
            __v_raw.lDay = value;
            triggerReactiveSet(__v_raw, "lDay", oldValue, value);
        }
    override var IMonthCn: String
        get() {
            return trackReactiveGet(__v_raw, "IMonthCn", __v_raw.IMonthCn, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("IMonthCn")) {
                return;
            }
            val oldValue = __v_raw.IMonthCn;
            __v_raw.IMonthCn = value;
            triggerReactiveSet(__v_raw, "IMonthCn", oldValue, value);
        }
    override var IDayCn: String
        get() {
            return trackReactiveGet(__v_raw, "IDayCn", __v_raw.IDayCn, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("IDayCn")) {
                return;
            }
            val oldValue = __v_raw.IDayCn;
            __v_raw.IDayCn = value;
            triggerReactiveSet(__v_raw, "IDayCn", oldValue, value);
        }
    override var cYear: Number
        get() {
            return trackReactiveGet(__v_raw, "cYear", __v_raw.cYear, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cYear")) {
                return;
            }
            val oldValue = __v_raw.cYear;
            __v_raw.cYear = value;
            triggerReactiveSet(__v_raw, "cYear", oldValue, value);
        }
    override var cMonth: Number
        get() {
            return trackReactiveGet(__v_raw, "cMonth", __v_raw.cMonth, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cMonth")) {
                return;
            }
            val oldValue = __v_raw.cMonth;
            __v_raw.cMonth = value;
            triggerReactiveSet(__v_raw, "cMonth", oldValue, value);
        }
    override var cDay: Number
        get() {
            return trackReactiveGet(__v_raw, "cDay", __v_raw.cDay, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("cDay")) {
                return;
            }
            val oldValue = __v_raw.cDay;
            __v_raw.cDay = value;
            triggerReactiveSet(__v_raw, "cDay", oldValue, value);
        }
    override var gzYear: String?
        get() {
            return trackReactiveGet(__v_raw, "gzYear", __v_raw.gzYear, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("gzYear")) {
                return;
            }
            val oldValue = __v_raw.gzYear;
            __v_raw.gzYear = value;
            triggerReactiveSet(__v_raw, "gzYear", oldValue, value);
        }
    override var gzMonth: String?
        get() {
            return trackReactiveGet(__v_raw, "gzMonth", __v_raw.gzMonth, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("gzMonth")) {
                return;
            }
            val oldValue = __v_raw.gzMonth;
            __v_raw.gzMonth = value;
            triggerReactiveSet(__v_raw, "gzMonth", oldValue, value);
        }
    override var gzDay: String?
        get() {
            return trackReactiveGet(__v_raw, "gzDay", __v_raw.gzDay, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("gzDay")) {
                return;
            }
            val oldValue = __v_raw.gzDay;
            __v_raw.gzDay = value;
            triggerReactiveSet(__v_raw, "gzDay", oldValue, value);
        }
    override var isToday: Boolean
        get() {
            return trackReactiveGet(__v_raw, "isToday", __v_raw.isToday, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("isToday")) {
                return;
            }
            val oldValue = __v_raw.isToday;
            __v_raw.isToday = value;
            triggerReactiveSet(__v_raw, "isToday", oldValue, value);
        }
    override var isLeap: Boolean
        get() {
            return trackReactiveGet(__v_raw, "isLeap", __v_raw.isLeap, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("isLeap")) {
                return;
            }
            val oldValue = __v_raw.isLeap;
            __v_raw.isLeap = value;
            triggerReactiveSet(__v_raw, "isLeap", oldValue, value);
        }
    override var nWeek: Number?
        get() {
            return trackReactiveGet(__v_raw, "nWeek", __v_raw.nWeek, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("nWeek")) {
                return;
            }
            val oldValue = __v_raw.nWeek;
            __v_raw.nWeek = value;
            triggerReactiveSet(__v_raw, "nWeek", oldValue, value);
        }
    override var ncWeek: String?
        get() {
            return trackReactiveGet(__v_raw, "ncWeek", __v_raw.ncWeek, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("ncWeek")) {
                return;
            }
            val oldValue = __v_raw.ncWeek;
            __v_raw.ncWeek = value;
            triggerReactiveSet(__v_raw, "ncWeek", oldValue, value);
        }
    override var isTerm: Boolean?
        get() {
            return trackReactiveGet(__v_raw, "isTerm", __v_raw.isTerm, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("isTerm")) {
                return;
            }
            val oldValue = __v_raw.isTerm;
            __v_raw.isTerm = value;
            triggerReactiveSet(__v_raw, "isTerm", oldValue, value);
        }
    override var Term: String?
        get() {
            return trackReactiveGet(__v_raw, "Term", __v_raw.Term, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("Term")) {
                return;
            }
            val oldValue = __v_raw.Term;
            __v_raw.Term = value;
            triggerReactiveSet(__v_raw, "Term", oldValue, value);
        }
    override var astro: String?
        get() {
            return trackReactiveGet(__v_raw, "astro", __v_raw.astro, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("astro")) {
                return;
            }
            val oldValue = __v_raw.astro;
            __v_raw.astro = value;
            triggerReactiveSet(__v_raw, "astro", oldValue, value);
        }
}
open class Lunar {
    private var lunarYearDaysMap = Map<Number, Number>();
    private var lunarMonthDaysMap = Map<Number, UTSArray<Number>>();
    constructor(){}
    open fun toChinaMonth(m: Number, leap: Boolean = false): String {
        return if (leap) {
            (N_STR_3[4] + N_STR_3[m] + N_STR_3[0]);
        } else {
            (N_STR_3[m] + N_STR_3[0]);
        }
        ;
    }
    open fun toChinaDay(d: Number): String {
        var s: String;
        when (d) {
            10 -> 
                s = "\u521d\u5341";
            20 -> 
                s = "\u4e8c\u5341";
            30 -> 
                s = "\u4e09\u5341";
            else -> 
                {
                    s = N_STR_2[Math.floor(d / 10)];
                    s += N_STR_1[d % 10];
                }
        }
        return s;
    }
    open fun leapMonth(year: Number): Number {
        return lunarYears[year - 1900] and 0xF;
    }
    open fun leapDays(year: Number): Number {
        if (this.leapMonth(year) > 0) {
            return if ((lunarYears[year - 1900] and 0x10000) != 0) {
                30;
            } else {
                29;
            }
            ;
        }
        return 0;
    }
    open fun lunarMonthDays(year: Number): UTSArray<Number> {
        var monthDays = this.lunarMonthDaysMap.get(year);
        if (monthDays != null) {
            return monthDays;
        }
        monthDays = utsArrayOf();
        var lunarYear = lunarYears[year - 1900];
        run {
            var i: Number = 15;
            while(i >= 4){
                var monthDay = if ((lunarYear shr i and 0x1) != 0) {
                    30;
                } else {
                    29;
                }
                ;
                monthDays.push(monthDay);
                i--;
            }
        }
        var leapM = this.leapMonth(year);
        if (leapM > 0) {
            monthDays.splice(leapM, 0, this.leapDays(year));
        }
        this.lunarMonthDaysMap.set(year, monthDays);
        return monthDays;
    }
    open fun lunarYearDays(year: Number): Number {
        if (this.lunarYearDaysMap.has(year)) {
            return this.lunarYearDaysMap.get(year)!!;
        }
        var num: Number = 0;
        this.lunarMonthDays(year).forEach(fun(item){
            num += item;
        }
        );
        this.lunarYearDaysMap.set(year, num);
        return num;
    }
    open fun solar2lunar(y: Number, m: Number, d: Number): LunarInfoType {
        var moonDay = this.solar_date(y, m, d);
        var lYear = moonDay.lunarY;
        var lMonth = moonDay.lunarM;
        var lDay = moonDay.lunarD;
        var isLeap = moonDay.isLeap;
        val IMonthCn = this.toChinaMonth(lMonth, isLeap);
        var IDayCn = if (lDay == 1) {
            IMonthCn;
        } else {
            this.toChinaDay(lDay);
        }
        ;
        var isTodayObj = Date();
        var isToday = false;
        if (isTodayObj.getFullYear() == y && isTodayObj.getMonth() + 1 == m && isTodayObj.getDate() == d) {
            isToday = true;
        }
        var info = LunarInfoType(lYear = lYear, lMonth = lMonth, lDay = lDay, IMonthCn = IMonthCn, IDayCn = IDayCn, cYear = y, cMonth = m, cDay = d, isToday = isToday, isLeap = isLeap);
        return info;
    }
    open fun solar_date(y: Number, m: Number, d: Number): InfoType {
        var date = Date(y, m - 1, d);
        var offset = (Date.UTC(date.getFullYear(), date.getMonth(), date.getDate()) - Date.UTC(1901, 1, 19)) / 86400000;
        var temp: Number = 0;
        var i: Number;
        run {
            i = 1901;
            while(i < 2101 && offset > 0){
                temp = this.lunarYearDays(i);
                offset -= temp;
                i++;
            }
        }
        if (offset < 0) {
            offset += temp;
            i--;
        }
        var isLeap: Boolean = false;
        var j: Number = 0;
        var monthDays = this.lunarMonthDays(i);
        var leapM = this.leapMonth(i);
        if (offset > 0) {
            run {
                j = 0;
                while(j < monthDays.length && offset > 0){
                    temp = monthDays[j];
                    offset -= temp;
                    j++;
                }
            }
            if (offset == 0) {
                j++;
            }
            if (offset < 0) {
                offset += temp;
            }
        } else {
            if (offset == -23) {}
        }
        if (leapM > 0) {
            if (j == leapM + 1) {
                isLeap = true;
            }
            if (j >= leapM + 1) {
                j--;
            }
        }
        val info = InfoType(lunarY = i, lunarM = j, lunarD = ++offset, isLeap = isLeap);
        return info;
    }
}
open class DateType (
    @JsonNotNull
    open var fullDate: String,
    @JsonNotNull
    open var year: Number,
    @JsonNotNull
    open var month: Number,
    @JsonNotNull
    open var date: Number,
    @JsonNotNull
    open var day: Number,
    @JsonNotNull
    open var disabled: Boolean = false,
    @JsonNotNull
    open var lunar: String,
    @JsonNotNull
    open var is_today: Boolean = false,
    open var data: LunarInfoType? = null,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return DateTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class DateTypeReactiveObject : DateType, IUTSReactive<DateType> {
    override var __v_raw: DateType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: DateType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(fullDate = __v_raw.fullDate, year = __v_raw.year, month = __v_raw.month, date = __v_raw.date, day = __v_raw.day, disabled = __v_raw.disabled, lunar = __v_raw.lunar, is_today = __v_raw.is_today, data = __v_raw.data) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): DateTypeReactiveObject {
        return DateTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var fullDate: String
        get() {
            return trackReactiveGet(__v_raw, "fullDate", __v_raw.fullDate, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("fullDate")) {
                return;
            }
            val oldValue = __v_raw.fullDate;
            __v_raw.fullDate = value;
            triggerReactiveSet(__v_raw, "fullDate", oldValue, value);
        }
    override var year: Number
        get() {
            return trackReactiveGet(__v_raw, "year", __v_raw.year, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("year")) {
                return;
            }
            val oldValue = __v_raw.year;
            __v_raw.year = value;
            triggerReactiveSet(__v_raw, "year", oldValue, value);
        }
    override var month: Number
        get() {
            return trackReactiveGet(__v_raw, "month", __v_raw.month, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("month")) {
                return;
            }
            val oldValue = __v_raw.month;
            __v_raw.month = value;
            triggerReactiveSet(__v_raw, "month", oldValue, value);
        }
    override var date: Number
        get() {
            return trackReactiveGet(__v_raw, "date", __v_raw.date, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("date")) {
                return;
            }
            val oldValue = __v_raw.date;
            __v_raw.date = value;
            triggerReactiveSet(__v_raw, "date", oldValue, value);
        }
    override var day: Number
        get() {
            return trackReactiveGet(__v_raw, "day", __v_raw.day, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("day")) {
                return;
            }
            val oldValue = __v_raw.day;
            __v_raw.day = value;
            triggerReactiveSet(__v_raw, "day", oldValue, value);
        }
    override var disabled: Boolean
        get() {
            return trackReactiveGet(__v_raw, "disabled", __v_raw.disabled, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("disabled")) {
                return;
            }
            val oldValue = __v_raw.disabled;
            __v_raw.disabled = value;
            triggerReactiveSet(__v_raw, "disabled", oldValue, value);
        }
    override var lunar: String
        get() {
            return trackReactiveGet(__v_raw, "lunar", __v_raw.lunar, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("lunar")) {
                return;
            }
            val oldValue = __v_raw.lunar;
            __v_raw.lunar = value;
            triggerReactiveSet(__v_raw, "lunar", oldValue, value);
        }
    override var is_today: Boolean
        get() {
            return trackReactiveGet(__v_raw, "is_today", __v_raw.is_today, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("is_today")) {
                return;
            }
            val oldValue = __v_raw.is_today;
            __v_raw.is_today = value;
            triggerReactiveSet(__v_raw, "is_today", oldValue, value);
        }
    override var data: LunarInfoType?
        get() {
            return trackReactiveGet(__v_raw, "data", __v_raw.data, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("data")) {
                return;
            }
            val oldValue = __v_raw.data;
            __v_raw.data = value;
            triggerReactiveSet(__v_raw, "data", oldValue, value);
        }
}
open class Calendar {
    private var lunar: Lunar;
    constructor(){
        this.lunar = Lunar();
    }
    open fun getDateInfo(time: String = ""): DateType {
        val nowDate = this.getDate(time);
        val lunar = this.getlunar(nowDate.year, nowDate.month, nowDate.date);
        val item: DateType = nowDate;
        item.data = lunar;
        return item;
    }
    open fun getWeeks(dateData: String = ""): UTSArray<UTSArray<DateType>> {
        val dateObj = this.getDate(dateData);
        val year = dateObj.year;
        val month = dateObj.month;
        var firstDay = Date(year, month - 1, 0).getDay();
        var currentDay = Date(year, month, 0).getDate();
        val lastMonthDays = this._getLastMonthDays(firstDay, dateObj);
        val currentMonthDys = this._currentMonthDys(currentDay, dateObj);
        val surplus = 42 - (lastMonthDays.length + currentMonthDys.length);
        val nextMonthDays = this._getNextMonthDays(surplus, dateObj);
        var days: UTSArray<DateType> = utsArrayOf();
        run {
            var i: Number = 0;
            while(i < lastMonthDays.length){
                val item = lastMonthDays[i];
                days.push(item);
                i++;
            }
        }
        run {
            var i: Number = 0;
            while(i < currentMonthDys.length){
                val item = currentMonthDys[i];
                days.push(item);
                i++;
            }
        }
        run {
            var i: Number = 0;
            while(i < nextMonthDays.length){
                val item = nextMonthDays[i];
                days.push(item);
                i++;
            }
        }
        var weeks: UTSArray<UTSArray<DateType>> = utsArrayOf();
        run {
            var i: Number = 0;
            while(i < days.length){
                val item: UTSArray<DateType> = days.slice(i, i + 7);
                weeks.push(item);
                i += 7;
            }
        }
        return weeks;
    }
    open fun _getLastMonthDays(firstDay: Number, full: DateType): UTSArray<DateType> {
        var dateArr: UTSArray<DateType> = utsArrayOf();
        run {
            var i = firstDay;
            while(i > 0){
                val month = full.month - 1;
                val beforeDate = Date(full.year, month, -i + 1).getDate();
                var nowDate = full.year + "-" + month + "-" + beforeDate;
                var item: DateType = this.getDate(nowDate);
                item.disabled = true;
                dateArr.push(item);
                i--;
            }
        }
        return dateArr;
    }
    open fun _currentMonthDys(dateData: Number, full: DateType): UTSArray<DateType> {
        var dateArr: UTSArray<DateType> = utsArrayOf();
        run {
            var i: Number = 1;
            while(i <= dateData){
                var nowDate = full.year + "-" + full.month + "-" + i;
                var item: DateType = this.getDate(nowDate);
                item.disabled = false;
                dateArr.push(item);
                i++;
            }
        }
        return dateArr;
    }
    open fun _getNextMonthDays(surplus: Number, full: DateType): UTSArray<DateType> {
        var dateArr: UTSArray<DateType> = utsArrayOf();
        run {
            var i: Number = 1;
            while(i < surplus + 1){
                val month = full.month + 1;
                var nowDate = full.year + "-" + month + "-" + i;
                var item: DateType = this.getDate(nowDate);
                item.disabled = true;
                dateArr.push(item);
                i++;
            }
        }
        return dateArr;
    }
    open fun getlunar(year: Number, month: Number, date: Number): LunarInfoType {
        return this.lunar.solar2lunar(year, month, date);
    }
    open fun getDate(date: String = "", AddDayCount: Number = 0, str: String = "day"): DateType {
        var dd: Date = Date();
        if (date !== "") {
            val datePart = date.split(" ");
            val dateData = datePart[0].split("-");
            val year = parseInt(dateData[0]);
            val month = parseInt(dateData[1]);
            val day = parseInt(dateData[2]);
            dd = Date(year, month - 1, day);
        }
        when (str) {
            "day" -> 
                dd.setDate(dd.getDate() + AddDayCount);
            "month" -> 
                dd.setMonth(dd.getMonth() + AddDayCount);
            "year" -> 
                dd.setFullYear(dd.getFullYear() + AddDayCount);
        }
        val y = dd.getFullYear();
        val m = dd.getMonth() + 1;
        val d = dd.getDate();
        var nowDate = y + "-" + m + "-" + d;
        val lunarData = this.getlunar(y, m, d);
        val dataObj = DateType(fullDate = nowDate, year = y, month = m, date = d, day = dd.getDay() + 1, lunar = lunarData.IDayCn, is_today = lunarData.isToday, disabled = false);
        return dataObj;
    }
}
open class CoordsType (
    @JsonNotNull
    open var x: Number,
    @JsonNotNull
    open var y: Number,
    @JsonNotNull
    open var width: Number,
    @JsonNotNull
    open var height: Number,
    @JsonNotNull
    open var data: DateType,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return CoordsTypeReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class CoordsTypeReactiveObject : CoordsType, IUTSReactive<CoordsType> {
    override var __v_raw: CoordsType;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: CoordsType, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(x = __v_raw.x, y = __v_raw.y, width = __v_raw.width, height = __v_raw.height, data = __v_raw.data) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): CoordsTypeReactiveObject {
        return CoordsTypeReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var x: Number
        get() {
            return trackReactiveGet(__v_raw, "x", __v_raw.x, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("x")) {
                return;
            }
            val oldValue = __v_raw.x;
            __v_raw.x = value;
            triggerReactiveSet(__v_raw, "x", oldValue, value);
        }
    override var y: Number
        get() {
            return trackReactiveGet(__v_raw, "y", __v_raw.y, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("y")) {
                return;
            }
            val oldValue = __v_raw.y;
            __v_raw.y = value;
            triggerReactiveSet(__v_raw, "y", oldValue, value);
        }
    override var width: Number
        get() {
            return trackReactiveGet(__v_raw, "width", __v_raw.width, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("width")) {
                return;
            }
            val oldValue = __v_raw.width;
            __v_raw.width = value;
            triggerReactiveSet(__v_raw, "width", oldValue, value);
        }
    override var height: Number
        get() {
            return trackReactiveGet(__v_raw, "height", __v_raw.height, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("height")) {
                return;
            }
            val oldValue = __v_raw.height;
            __v_raw.height = value;
            triggerReactiveSet(__v_raw, "height", oldValue, value);
        }
    override var data: DateType
        get() {
            return trackReactiveGet(__v_raw, "data", __v_raw.data, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("data")) {
                return;
            }
            val oldValue = __v_raw.data;
            __v_raw.data = value;
            triggerReactiveSet(__v_raw, "data", oldValue, value);
        }
}
val GenPagesTemplateCalendarCalendarClass = CreateVueComponent(GenPagesTemplateCalendarCalendar::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateCalendarCalendar.inheritAttrs, inject = GenPagesTemplateCalendarCalendar.inject, props = GenPagesTemplateCalendarCalendar.props, propsNeedCastKeys = GenPagesTemplateCalendarCalendar.propsNeedCastKeys, emits = GenPagesTemplateCalendarCalendar.emits, components = GenPagesTemplateCalendarCalendar.components, styles = GenPagesTemplateCalendarCalendar.styles);
}
, fun(instance): GenPagesTemplateCalendarCalendar {
    return GenPagesTemplateCalendarCalendar(instance);
}
);
val GenPagesTemplateSchemaSchemaClass = CreateVueComponent(GenPagesTemplateSchemaSchema::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateSchemaSchema.inheritAttrs, inject = GenPagesTemplateSchemaSchema.inject, props = GenPagesTemplateSchemaSchema.props, propsNeedCastKeys = GenPagesTemplateSchemaSchema.propsNeedCastKeys, emits = GenPagesTemplateSchemaSchema.emits, components = GenPagesTemplateSchemaSchema.components, styles = GenPagesTemplateSchemaSchema.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesTemplateSchemaSchema.setup(props as GenPagesTemplateSchemaSchema);
    }
    );
}
, fun(instance): GenPagesTemplateSchemaSchema {
    return GenPagesTemplateSchemaSchema(instance);
}
);
val GenUniModulesUniPayXPagesSuccessSuccessClass = CreateVueComponent(GenUniModulesUniPayXPagesSuccessSuccess::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenUniModulesUniPayXPagesSuccessSuccess.inheritAttrs, inject = GenUniModulesUniPayXPagesSuccessSuccess.inject, props = GenUniModulesUniPayXPagesSuccessSuccess.props, propsNeedCastKeys = GenUniModulesUniPayXPagesSuccessSuccess.propsNeedCastKeys, emits = GenUniModulesUniPayXPagesSuccessSuccess.emits, components = GenUniModulesUniPayXPagesSuccessSuccess.components, styles = GenUniModulesUniPayXPagesSuccessSuccess.styles);
}
, fun(instance): GenUniModulesUniPayXPagesSuccessSuccess {
    return GenUniModulesUniPayXPagesSuccessSuccess(instance);
}
);
val GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebviewClass = CreateVueComponent(GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.inheritAttrs, inject = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.inject, props = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.props, propsNeedCastKeys = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.propsNeedCastKeys, emits = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.emits, components = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.components, styles = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview.styles);
}
, fun(instance): GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview {
    return GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebview(instance);
}
);
val GenUniModulesUniPayXPagesPayDeskPayDeskClass = CreateVueComponent(GenUniModulesUniPayXPagesPayDeskPayDesk::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenUniModulesUniPayXPagesPayDeskPayDesk.inheritAttrs, inject = GenUniModulesUniPayXPagesPayDeskPayDesk.inject, props = GenUniModulesUniPayXPagesPayDeskPayDesk.props, propsNeedCastKeys = GenUniModulesUniPayXPagesPayDeskPayDesk.propsNeedCastKeys, emits = GenUniModulesUniPayXPagesPayDeskPayDesk.emits, components = GenUniModulesUniPayXPagesPayDeskPayDesk.components, styles = GenUniModulesUniPayXPagesPayDeskPayDesk.styles);
}
, fun(instance): GenUniModulesUniPayXPagesPayDeskPayDesk {
    return GenUniModulesUniPayXPagesPayDeskPayDesk(instance);
}
);
val GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItemClass = CreateVueComponent(GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.name, inheritAttrs = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.inheritAttrs, inject = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.inject, props = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.props, propsNeedCastKeys = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.propsNeedCastKeys, emits = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.emits, components = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.components, styles = GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem.styles);
}
, fun(instance): GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem {
    return GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItem(instance);
}
);
val GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleViewClass = CreateVueComponent(GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.name, inheritAttrs = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.inheritAttrs, inject = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.inject, props = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.props, propsNeedCastKeys = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.propsNeedCastKeys, emits = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.emits, components = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.components, styles = GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView.styles);
}
, fun(instance): GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView {
    return GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleView(instance);
}
);
open class Item7 (
    @JsonNotNull
    open var id: Number,
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var info: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return Item7ReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class Item7ReactiveObject : Item7, IUTSReactive<Item7> {
    override var __v_raw: Item7;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Item7, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(id = __v_raw.id, name = __v_raw.name, info = __v_raw.info) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): Item7ReactiveObject {
        return Item7ReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var id: Number
        get() {
            return trackReactiveGet(__v_raw, "id", __v_raw.id, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("id")) {
                return;
            }
            val oldValue = __v_raw.id;
            __v_raw.id = value;
            triggerReactiveSet(__v_raw, "id", oldValue, value);
        }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var info: String
        get() {
            return trackReactiveGet(__v_raw, "info", __v_raw.info, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("info")) {
                return;
            }
            val oldValue = __v_raw.info;
            __v_raw.info = value;
            triggerReactiveSet(__v_raw, "info", oldValue, value);
        }
}
val GenPagesTemplateCustomLongListCustomLongListClass = CreateVueComponent(GenPagesTemplateCustomLongListCustomLongList::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateCustomLongListCustomLongList.inheritAttrs, inject = GenPagesTemplateCustomLongListCustomLongList.inject, props = GenPagesTemplateCustomLongListCustomLongList.props, propsNeedCastKeys = GenPagesTemplateCustomLongListCustomLongList.propsNeedCastKeys, emits = GenPagesTemplateCustomLongListCustomLongList.emits, components = GenPagesTemplateCustomLongListCustomLongList.components, styles = GenPagesTemplateCustomLongListCustomLongList.styles);
}
, fun(instance): GenPagesTemplateCustomLongListCustomLongList {
    return GenPagesTemplateCustomLongListCustomLongList(instance);
}
);
val GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContentClass = CreateVueComponent(GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.inheritAttrs, inject = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.inject, props = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.props, propsNeedCastKeys = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.propsNeedCastKeys, emits = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.emits, components = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.components, styles = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent.styles);
}
, fun(instance): GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent {
    return GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContent(instance);
}
);
val default4 = "/assets/target.028ddf0a.png";
open class AafeArea (
    @JsonNotNull
    open var top: Number,
    @JsonNotNull
    open var bottom: Number,
    @JsonNotNull
    open var left: Number,
    @JsonNotNull
    open var right: Number,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return AafeAreaReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class AafeAreaReactiveObject : AafeArea, IUTSReactive<AafeArea> {
    override var __v_raw: AafeArea;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: AafeArea, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(top = __v_raw.top, bottom = __v_raw.bottom, left = __v_raw.left, right = __v_raw.right) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): AafeAreaReactiveObject {
        return AafeAreaReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var top: Number
        get() {
            return trackReactiveGet(__v_raw, "top", __v_raw.top, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("top")) {
                return;
            }
            val oldValue = __v_raw.top;
            __v_raw.top = value;
            triggerReactiveSet(__v_raw, "top", oldValue, value);
        }
    override var bottom: Number
        get() {
            return trackReactiveGet(__v_raw, "bottom", __v_raw.bottom, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("bottom")) {
                return;
            }
            val oldValue = __v_raw.bottom;
            __v_raw.bottom = value;
            triggerReactiveSet(__v_raw, "bottom", oldValue, value);
        }
    override var left: Number
        get() {
            return trackReactiveGet(__v_raw, "left", __v_raw.left, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("left")) {
                return;
            }
            val oldValue = __v_raw.left;
            __v_raw.left = value;
            triggerReactiveSet(__v_raw, "left", oldValue, value);
        }
    override var right: Number
        get() {
            return trackReactiveGet(__v_raw, "right", __v_raw.right, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("right")) {
                return;
            }
            val oldValue = __v_raw.right;
            __v_raw.right = value;
            triggerReactiveSet(__v_raw, "right", oldValue, value);
        }
}
open class IconPath (
    @JsonNotNull
    open var target: String,
    @JsonNotNull
    open var position: String,
    @JsonNotNull
    open var navigation: String,
    @JsonNotNull
    open var back: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return IconPathReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class IconPathReactiveObject : IconPath, IUTSReactive<IconPath> {
    override var __v_raw: IconPath;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: IconPath, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(target = __v_raw.target, position = __v_raw.position, navigation = __v_raw.navigation, back = __v_raw.back) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): IconPathReactiveObject {
        return IconPathReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var target: String
        get() {
            return trackReactiveGet(__v_raw, "target", __v_raw.target, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("target")) {
                return;
            }
            val oldValue = __v_raw.target;
            __v_raw.target = value;
            triggerReactiveSet(__v_raw, "target", oldValue, value);
        }
    override var position: String
        get() {
            return trackReactiveGet(__v_raw, "position", __v_raw.position, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("position")) {
                return;
            }
            val oldValue = __v_raw.position;
            __v_raw.position = value;
            triggerReactiveSet(__v_raw, "position", oldValue, value);
        }
    override var navigation: String
        get() {
            return trackReactiveGet(__v_raw, "navigation", __v_raw.navigation, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("navigation")) {
                return;
            }
            val oldValue = __v_raw.navigation;
            __v_raw.navigation = value;
            triggerReactiveSet(__v_raw, "navigation", oldValue, value);
        }
    override var back: String
        get() {
            return trackReactiveGet(__v_raw, "back", __v_raw.back, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("back")) {
                return;
            }
            val oldValue = __v_raw.back;
            __v_raw.back = value;
            triggerReactiveSet(__v_raw, "back", oldValue, value);
        }
}
val languageData: UTSJSONObject = object : UTSJSONObject() {
    var en = object : UTSJSONObject() {
        var navigation = "navigation"
    }
    var `zh-Hans` = object : UTSJSONObject() {
        var navigation = "导航"
    }
    var `zh-Hant` = object : UTSJSONObject() {
        var navigation = "導航"
    }
};
val GenUniModulesUniOpenLocationPagesOpenLocationOpenLocationClass = CreateVueComponent(GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.inheritAttrs, inject = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.inject, props = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.props, propsNeedCastKeys = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.propsNeedCastKeys, emits = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.emits, components = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.components, styles = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation.styles);
}
, fun(instance): GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation {
    return GenUniModulesUniOpenLocationPagesOpenLocationOpenLocation(instance);
}
);
val GenPagesComponentButtonPrivacyClass = CreateVueComponent(GenPagesComponentButtonPrivacy::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesComponentButtonPrivacy.inheritAttrs, inject = GenPagesComponentButtonPrivacy.inject, props = GenPagesComponentButtonPrivacy.props, propsNeedCastKeys = GenPagesComponentButtonPrivacy.propsNeedCastKeys, emits = GenPagesComponentButtonPrivacy.emits, components = GenPagesComponentButtonPrivacy.components, styles = GenPagesComponentButtonPrivacy.styles);
}
, fun(instance): GenPagesComponentButtonPrivacy {
    return GenPagesComponentButtonPrivacy(instance);
}
);
val requiredKey = utsArrayOf(
    "version",
    "url",
    "type"
);
var downloadTask: DownloadTask? = null;
var openSchemePromise: UTSPromise<Boolean>? = null;
val openSchema1 = fun(url: String): UTSPromise<Boolean> {
    return UTSPromise<Boolean>(fun(resolve, reject){
        try {
            utsOpenSchema(url);
            resolve(true);
        }
         catch (e: Throwable) {
            reject(false);
        }
    }
    );
}
;
val GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupClass = CreateVueComponent(GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.inheritAttrs, inject = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.inject, props = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.props, propsNeedCastKeys = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.propsNeedCastKeys, emits = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.emits, components = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.components, styles = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup.styles);
}
, fun(instance): GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup {
    return GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopup(instance);
}
);
val GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumClass = CreateVueComponent(GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.inheritAttrs, inject = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.inject, props = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.props, propsNeedCastKeys = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.propsNeedCastKeys, emits = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.emits, components = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.components, styles = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum.styles);
}
, fun(instance): GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum {
    return GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbum(instance);
}
);
val GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumClass = CreateVueComponent(GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.inheritAttrs, inject = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.inject, props = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.props, propsNeedCastKeys = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.propsNeedCastKeys, emits = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.emits, components = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.components, styles = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum.styles);
}
, fun(instance): GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum {
    return GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbum(instance);
}
);
val GenPagesAPIGetVideoInfoGetVideoInfoClass = CreateVueComponent(GenPagesAPIGetVideoInfoGetVideoInfo::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesAPIGetVideoInfoGetVideoInfo.inheritAttrs, inject = GenPagesAPIGetVideoInfoGetVideoInfo.inject, props = GenPagesAPIGetVideoInfoGetVideoInfo.props, propsNeedCastKeys = GenPagesAPIGetVideoInfoGetVideoInfo.propsNeedCastKeys, emits = GenPagesAPIGetVideoInfoGetVideoInfo.emits, components = GenPagesAPIGetVideoInfoGetVideoInfo.components, styles = GenPagesAPIGetVideoInfoGetVideoInfo.styles);
}
, fun(instance): GenPagesAPIGetVideoInfoGetVideoInfo {
    return GenPagesAPIGetVideoInfoGetVideoInfo(instance);
}
);
val GenPagesCSSBackgroundBackgroundColorClass = CreateVueComponent(GenPagesCSSBackgroundBackgroundColor::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBackgroundBackgroundColor.inheritAttrs, inject = GenPagesCSSBackgroundBackgroundColor.inject, props = GenPagesCSSBackgroundBackgroundColor.props, propsNeedCastKeys = GenPagesCSSBackgroundBackgroundColor.propsNeedCastKeys, emits = GenPagesCSSBackgroundBackgroundColor.emits, components = GenPagesCSSBackgroundBackgroundColor.components, styles = GenPagesCSSBackgroundBackgroundColor.styles);
}
, fun(instance): GenPagesCSSBackgroundBackgroundColor {
    return GenPagesCSSBackgroundBackgroundColor(instance);
}
);
val GenPagesCSSBackgroundBackgroundImageClass = CreateVueComponent(GenPagesCSSBackgroundBackgroundImage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBackgroundBackgroundImage.inheritAttrs, inject = GenPagesCSSBackgroundBackgroundImage.inject, props = GenPagesCSSBackgroundBackgroundImage.props, propsNeedCastKeys = GenPagesCSSBackgroundBackgroundImage.propsNeedCastKeys, emits = GenPagesCSSBackgroundBackgroundImage.emits, components = GenPagesCSSBackgroundBackgroundImage.components, styles = GenPagesCSSBackgroundBackgroundImage.styles);
}
, fun(instance): GenPagesCSSBackgroundBackgroundImage {
    return GenPagesCSSBackgroundBackgroundImage(instance);
}
);
val GenPagesCSSBorderBorderBottomClass = CreateVueComponent(GenPagesCSSBorderBorderBottom::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderBottom.inheritAttrs, inject = GenPagesCSSBorderBorderBottom.inject, props = GenPagesCSSBorderBorderBottom.props, propsNeedCastKeys = GenPagesCSSBorderBorderBottom.propsNeedCastKeys, emits = GenPagesCSSBorderBorderBottom.emits, components = GenPagesCSSBorderBorderBottom.components, styles = GenPagesCSSBorderBorderBottom.styles);
}
, fun(instance): GenPagesCSSBorderBorderBottom {
    return GenPagesCSSBorderBorderBottom(instance);
}
);
val GenPagesCSSBorderBorderColorClass = CreateVueComponent(GenPagesCSSBorderBorderColor::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderColor.inheritAttrs, inject = GenPagesCSSBorderBorderColor.inject, props = GenPagesCSSBorderBorderColor.props, propsNeedCastKeys = GenPagesCSSBorderBorderColor.propsNeedCastKeys, emits = GenPagesCSSBorderBorderColor.emits, components = GenPagesCSSBorderBorderColor.components, styles = GenPagesCSSBorderBorderColor.styles);
}
, fun(instance): GenPagesCSSBorderBorderColor {
    return GenPagesCSSBorderBorderColor(instance);
}
);
val GenPagesCSSBorderBorderLeftClass = CreateVueComponent(GenPagesCSSBorderBorderLeft::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderLeft.inheritAttrs, inject = GenPagesCSSBorderBorderLeft.inject, props = GenPagesCSSBorderBorderLeft.props, propsNeedCastKeys = GenPagesCSSBorderBorderLeft.propsNeedCastKeys, emits = GenPagesCSSBorderBorderLeft.emits, components = GenPagesCSSBorderBorderLeft.components, styles = GenPagesCSSBorderBorderLeft.styles);
}
, fun(instance): GenPagesCSSBorderBorderLeft {
    return GenPagesCSSBorderBorderLeft(instance);
}
);
val GenPagesCSSBorderBorderRadiusClass = CreateVueComponent(GenPagesCSSBorderBorderRadius::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderRadius.inheritAttrs, inject = GenPagesCSSBorderBorderRadius.inject, props = GenPagesCSSBorderBorderRadius.props, propsNeedCastKeys = GenPagesCSSBorderBorderRadius.propsNeedCastKeys, emits = GenPagesCSSBorderBorderRadius.emits, components = GenPagesCSSBorderBorderRadius.components, styles = GenPagesCSSBorderBorderRadius.styles);
}
, fun(instance): GenPagesCSSBorderBorderRadius {
    return GenPagesCSSBorderBorderRadius(instance);
}
);
val GenPagesCSSBorderBorderRightClass = CreateVueComponent(GenPagesCSSBorderBorderRight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderRight.inheritAttrs, inject = GenPagesCSSBorderBorderRight.inject, props = GenPagesCSSBorderBorderRight.props, propsNeedCastKeys = GenPagesCSSBorderBorderRight.propsNeedCastKeys, emits = GenPagesCSSBorderBorderRight.emits, components = GenPagesCSSBorderBorderRight.components, styles = GenPagesCSSBorderBorderRight.styles);
}
, fun(instance): GenPagesCSSBorderBorderRight {
    return GenPagesCSSBorderBorderRight(instance);
}
);
val GenPagesCSSBorderBorderStyleClass = CreateVueComponent(GenPagesCSSBorderBorderStyle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderStyle.inheritAttrs, inject = GenPagesCSSBorderBorderStyle.inject, props = GenPagesCSSBorderBorderStyle.props, propsNeedCastKeys = GenPagesCSSBorderBorderStyle.propsNeedCastKeys, emits = GenPagesCSSBorderBorderStyle.emits, components = GenPagesCSSBorderBorderStyle.components, styles = GenPagesCSSBorderBorderStyle.styles);
}
, fun(instance): GenPagesCSSBorderBorderStyle {
    return GenPagesCSSBorderBorderStyle(instance);
}
);
val GenPagesCSSBorderBorderTopClass = CreateVueComponent(GenPagesCSSBorderBorderTop::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderTop.inheritAttrs, inject = GenPagesCSSBorderBorderTop.inject, props = GenPagesCSSBorderBorderTop.props, propsNeedCastKeys = GenPagesCSSBorderBorderTop.propsNeedCastKeys, emits = GenPagesCSSBorderBorderTop.emits, components = GenPagesCSSBorderBorderTop.components, styles = GenPagesCSSBorderBorderTop.styles);
}
, fun(instance): GenPagesCSSBorderBorderTop {
    return GenPagesCSSBorderBorderTop(instance);
}
);
val GenPagesCSSBorderBorderWidthClass = CreateVueComponent(GenPagesCSSBorderBorderWidth::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderWidth.inheritAttrs, inject = GenPagesCSSBorderBorderWidth.inject, props = GenPagesCSSBorderBorderWidth.props, propsNeedCastKeys = GenPagesCSSBorderBorderWidth.propsNeedCastKeys, emits = GenPagesCSSBorderBorderWidth.emits, components = GenPagesCSSBorderBorderWidth.components, styles = GenPagesCSSBorderBorderWidth.styles);
}
, fun(instance): GenPagesCSSBorderBorderWidth {
    return GenPagesCSSBorderBorderWidth(instance);
}
);
val GenPagesCSSBorderBorderClass = CreateVueComponent(GenPagesCSSBorderBorder::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorder.inheritAttrs, inject = GenPagesCSSBorderBorder.inject, props = GenPagesCSSBorderBorder.props, propsNeedCastKeys = GenPagesCSSBorderBorder.propsNeedCastKeys, emits = GenPagesCSSBorderBorder.emits, components = GenPagesCSSBorderBorder.components, styles = GenPagesCSSBorderBorder.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesCSSBorderBorder.setup(props as GenPagesCSSBorderBorder);
    }
    );
}
, fun(instance): GenPagesCSSBorderBorder {
    return GenPagesCSSBorderBorder(instance);
}
);
val GenPagesCSSBorderComplexBorderComplexBorderClass = CreateVueComponent(GenPagesCSSBorderComplexBorderComplexBorder::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderComplexBorderComplexBorder.inheritAttrs, inject = GenPagesCSSBorderComplexBorderComplexBorder.inject, props = GenPagesCSSBorderComplexBorderComplexBorder.props, propsNeedCastKeys = GenPagesCSSBorderComplexBorderComplexBorder.propsNeedCastKeys, emits = GenPagesCSSBorderComplexBorderComplexBorder.emits, components = GenPagesCSSBorderComplexBorderComplexBorder.components, styles = GenPagesCSSBorderComplexBorderComplexBorder.styles);
}
, fun(instance): GenPagesCSSBorderComplexBorderComplexBorder {
    return GenPagesCSSBorderComplexBorderComplexBorder(instance);
}
);
val defaultStyle = "border:2px solid black;background :#57BE6A;";
val GenPagesCSSBorderDynamicBorderClass = CreateVueComponent(GenPagesCSSBorderDynamicBorder::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderDynamicBorder.inheritAttrs, inject = GenPagesCSSBorderDynamicBorder.inject, props = GenPagesCSSBorderDynamicBorder.props, propsNeedCastKeys = GenPagesCSSBorderDynamicBorder.propsNeedCastKeys, emits = GenPagesCSSBorderDynamicBorder.emits, components = GenPagesCSSBorderDynamicBorder.components, styles = GenPagesCSSBorderDynamicBorder.styles);
}
, fun(instance): GenPagesCSSBorderDynamicBorder {
    return GenPagesCSSBorderDynamicBorder(instance);
}
);
val GenPagesCSSBorderBorderUpdateClass = CreateVueComponent(GenPagesCSSBorderBorderUpdate::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBorderBorderUpdate.inheritAttrs, inject = GenPagesCSSBorderBorderUpdate.inject, props = GenPagesCSSBorderBorderUpdate.props, propsNeedCastKeys = GenPagesCSSBorderBorderUpdate.propsNeedCastKeys, emits = GenPagesCSSBorderBorderUpdate.emits, components = GenPagesCSSBorderBorderUpdate.components, styles = GenPagesCSSBorderBorderUpdate.styles, setup = fun(props: ComponentPublicInstance, ctx: SetupContext): Any? {
        return GenPagesCSSBorderBorderUpdate.setup(props as GenPagesCSSBorderBorderUpdate, ctx);
    }
    );
}
, fun(instance): GenPagesCSSBorderBorderUpdate {
    return GenPagesCSSBorderBorderUpdate(instance);
}
);
val GenPagesCSSBoxShadowBoxShadowClass = CreateVueComponent(GenPagesCSSBoxShadowBoxShadow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSBoxShadowBoxShadow.inheritAttrs, inject = GenPagesCSSBoxShadowBoxShadow.inject, props = GenPagesCSSBoxShadowBoxShadow.props, propsNeedCastKeys = GenPagesCSSBoxShadowBoxShadow.propsNeedCastKeys, emits = GenPagesCSSBoxShadowBoxShadow.emits, components = GenPagesCSSBoxShadowBoxShadow.components, styles = GenPagesCSSBoxShadowBoxShadow.styles);
}
, fun(instance): GenPagesCSSBoxShadowBoxShadow {
    return GenPagesCSSBoxShadowBoxShadow(instance);
}
);
val GenPagesCSSDisplayFlexClass = CreateVueComponent(GenPagesCSSDisplayFlex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSDisplayFlex.inheritAttrs, inject = GenPagesCSSDisplayFlex.inject, props = GenPagesCSSDisplayFlex.props, propsNeedCastKeys = GenPagesCSSDisplayFlex.propsNeedCastKeys, emits = GenPagesCSSDisplayFlex.emits, components = GenPagesCSSDisplayFlex.components, styles = GenPagesCSSDisplayFlex.styles);
}
, fun(instance): GenPagesCSSDisplayFlex {
    return GenPagesCSSDisplayFlex(instance);
}
);
val GenPagesCSSDisplayNoneClass = CreateVueComponent(GenPagesCSSDisplayNone::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSDisplayNone.inheritAttrs, inject = GenPagesCSSDisplayNone.inject, props = GenPagesCSSDisplayNone.props, propsNeedCastKeys = GenPagesCSSDisplayNone.propsNeedCastKeys, emits = GenPagesCSSDisplayNone.emits, components = GenPagesCSSDisplayNone.components, styles = GenPagesCSSDisplayNone.styles);
}
, fun(instance): GenPagesCSSDisplayNone {
    return GenPagesCSSDisplayNone(instance);
}
);
val GenPagesCSSFlexAlignContentClass = CreateVueComponent(GenPagesCSSFlexAlignContent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexAlignContent.inheritAttrs, inject = GenPagesCSSFlexAlignContent.inject, props = GenPagesCSSFlexAlignContent.props, propsNeedCastKeys = GenPagesCSSFlexAlignContent.propsNeedCastKeys, emits = GenPagesCSSFlexAlignContent.emits, components = GenPagesCSSFlexAlignContent.components, styles = GenPagesCSSFlexAlignContent.styles);
}
, fun(instance): GenPagesCSSFlexAlignContent {
    return GenPagesCSSFlexAlignContent(instance);
}
);
val GenPagesCSSFlexAlignItemsClass = CreateVueComponent(GenPagesCSSFlexAlignItems::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexAlignItems.inheritAttrs, inject = GenPagesCSSFlexAlignItems.inject, props = GenPagesCSSFlexAlignItems.props, propsNeedCastKeys = GenPagesCSSFlexAlignItems.propsNeedCastKeys, emits = GenPagesCSSFlexAlignItems.emits, components = GenPagesCSSFlexAlignItems.components, styles = GenPagesCSSFlexAlignItems.styles);
}
, fun(instance): GenPagesCSSFlexAlignItems {
    return GenPagesCSSFlexAlignItems(instance);
}
);
val GenPagesCSSFlexFlexBasisClass = CreateVueComponent(GenPagesCSSFlexFlexBasis::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlexBasis.inheritAttrs, inject = GenPagesCSSFlexFlexBasis.inject, props = GenPagesCSSFlexFlexBasis.props, propsNeedCastKeys = GenPagesCSSFlexFlexBasis.propsNeedCastKeys, emits = GenPagesCSSFlexFlexBasis.emits, components = GenPagesCSSFlexFlexBasis.components, styles = GenPagesCSSFlexFlexBasis.styles);
}
, fun(instance): GenPagesCSSFlexFlexBasis {
    return GenPagesCSSFlexFlexBasis(instance);
}
);
val GenPagesCSSFlexFlexDirectionClass = CreateVueComponent(GenPagesCSSFlexFlexDirection::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlexDirection.inheritAttrs, inject = GenPagesCSSFlexFlexDirection.inject, props = GenPagesCSSFlexFlexDirection.props, propsNeedCastKeys = GenPagesCSSFlexFlexDirection.propsNeedCastKeys, emits = GenPagesCSSFlexFlexDirection.emits, components = GenPagesCSSFlexFlexDirection.components, styles = GenPagesCSSFlexFlexDirection.styles);
}
, fun(instance): GenPagesCSSFlexFlexDirection {
    return GenPagesCSSFlexFlexDirection(instance);
}
);
val GenPagesCSSFlexFlexFlowClass = CreateVueComponent(GenPagesCSSFlexFlexFlow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlexFlow.inheritAttrs, inject = GenPagesCSSFlexFlexFlow.inject, props = GenPagesCSSFlexFlexFlow.props, propsNeedCastKeys = GenPagesCSSFlexFlexFlow.propsNeedCastKeys, emits = GenPagesCSSFlexFlexFlow.emits, components = GenPagesCSSFlexFlexFlow.components, styles = GenPagesCSSFlexFlexFlow.styles);
}
, fun(instance): GenPagesCSSFlexFlexFlow {
    return GenPagesCSSFlexFlexFlow(instance);
}
);
val GenPagesCSSFlexFlexGrowClass = CreateVueComponent(GenPagesCSSFlexFlexGrow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlexGrow.inheritAttrs, inject = GenPagesCSSFlexFlexGrow.inject, props = GenPagesCSSFlexFlexGrow.props, propsNeedCastKeys = GenPagesCSSFlexFlexGrow.propsNeedCastKeys, emits = GenPagesCSSFlexFlexGrow.emits, components = GenPagesCSSFlexFlexGrow.components, styles = GenPagesCSSFlexFlexGrow.styles);
}
, fun(instance): GenPagesCSSFlexFlexGrow {
    return GenPagesCSSFlexFlexGrow(instance);
}
);
val GenPagesCSSFlexFlexShrinkClass = CreateVueComponent(GenPagesCSSFlexFlexShrink::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlexShrink.inheritAttrs, inject = GenPagesCSSFlexFlexShrink.inject, props = GenPagesCSSFlexFlexShrink.props, propsNeedCastKeys = GenPagesCSSFlexFlexShrink.propsNeedCastKeys, emits = GenPagesCSSFlexFlexShrink.emits, components = GenPagesCSSFlexFlexShrink.components, styles = GenPagesCSSFlexFlexShrink.styles);
}
, fun(instance): GenPagesCSSFlexFlexShrink {
    return GenPagesCSSFlexFlexShrink(instance);
}
);
val GenPagesCSSFlexFlexClass = CreateVueComponent(GenPagesCSSFlexFlex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexFlex.inheritAttrs, inject = GenPagesCSSFlexFlex.inject, props = GenPagesCSSFlexFlex.props, propsNeedCastKeys = GenPagesCSSFlexFlex.propsNeedCastKeys, emits = GenPagesCSSFlexFlex.emits, components = GenPagesCSSFlexFlex.components, styles = GenPagesCSSFlexFlex.styles);
}
, fun(instance): GenPagesCSSFlexFlex {
    return GenPagesCSSFlexFlex(instance);
}
);
val GenPagesCSSFlexJustifyContentClass = CreateVueComponent(GenPagesCSSFlexJustifyContent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSFlexJustifyContent.inheritAttrs, inject = GenPagesCSSFlexJustifyContent.inject, props = GenPagesCSSFlexJustifyContent.props, propsNeedCastKeys = GenPagesCSSFlexJustifyContent.propsNeedCastKeys, emits = GenPagesCSSFlexJustifyContent.emits, components = GenPagesCSSFlexJustifyContent.components, styles = GenPagesCSSFlexJustifyContent.styles);
}
, fun(instance): GenPagesCSSFlexJustifyContent {
    return GenPagesCSSFlexJustifyContent(instance);
}
);
val GenPagesCSSLayoutHeightClass = CreateVueComponent(GenPagesCSSLayoutHeight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutHeight.inheritAttrs, inject = GenPagesCSSLayoutHeight.inject, props = GenPagesCSSLayoutHeight.props, propsNeedCastKeys = GenPagesCSSLayoutHeight.propsNeedCastKeys, emits = GenPagesCSSLayoutHeight.emits, components = GenPagesCSSLayoutHeight.components, styles = GenPagesCSSLayoutHeight.styles);
}
, fun(instance): GenPagesCSSLayoutHeight {
    return GenPagesCSSLayoutHeight(instance);
}
);
val GenPagesCSSLayoutMaxHeightClass = CreateVueComponent(GenPagesCSSLayoutMaxHeight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutMaxHeight.inheritAttrs, inject = GenPagesCSSLayoutMaxHeight.inject, props = GenPagesCSSLayoutMaxHeight.props, propsNeedCastKeys = GenPagesCSSLayoutMaxHeight.propsNeedCastKeys, emits = GenPagesCSSLayoutMaxHeight.emits, components = GenPagesCSSLayoutMaxHeight.components, styles = GenPagesCSSLayoutMaxHeight.styles);
}
, fun(instance): GenPagesCSSLayoutMaxHeight {
    return GenPagesCSSLayoutMaxHeight(instance);
}
);
val GenPagesCSSLayoutMaxWidthClass = CreateVueComponent(GenPagesCSSLayoutMaxWidth::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutMaxWidth.inheritAttrs, inject = GenPagesCSSLayoutMaxWidth.inject, props = GenPagesCSSLayoutMaxWidth.props, propsNeedCastKeys = GenPagesCSSLayoutMaxWidth.propsNeedCastKeys, emits = GenPagesCSSLayoutMaxWidth.emits, components = GenPagesCSSLayoutMaxWidth.components, styles = GenPagesCSSLayoutMaxWidth.styles);
}
, fun(instance): GenPagesCSSLayoutMaxWidth {
    return GenPagesCSSLayoutMaxWidth(instance);
}
);
val GenPagesCSSLayoutMinHeightClass = CreateVueComponent(GenPagesCSSLayoutMinHeight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutMinHeight.inheritAttrs, inject = GenPagesCSSLayoutMinHeight.inject, props = GenPagesCSSLayoutMinHeight.props, propsNeedCastKeys = GenPagesCSSLayoutMinHeight.propsNeedCastKeys, emits = GenPagesCSSLayoutMinHeight.emits, components = GenPagesCSSLayoutMinHeight.components, styles = GenPagesCSSLayoutMinHeight.styles);
}
, fun(instance): GenPagesCSSLayoutMinHeight {
    return GenPagesCSSLayoutMinHeight(instance);
}
);
val GenPagesCSSLayoutMinWidthClass = CreateVueComponent(GenPagesCSSLayoutMinWidth::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutMinWidth.inheritAttrs, inject = GenPagesCSSLayoutMinWidth.inject, props = GenPagesCSSLayoutMinWidth.props, propsNeedCastKeys = GenPagesCSSLayoutMinWidth.propsNeedCastKeys, emits = GenPagesCSSLayoutMinWidth.emits, components = GenPagesCSSLayoutMinWidth.components, styles = GenPagesCSSLayoutMinWidth.styles);
}
, fun(instance): GenPagesCSSLayoutMinWidth {
    return GenPagesCSSLayoutMinWidth(instance);
}
);
val GenPagesCSSLayoutPositionClass = CreateVueComponent(GenPagesCSSLayoutPosition::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutPosition.inheritAttrs, inject = GenPagesCSSLayoutPosition.inject, props = GenPagesCSSLayoutPosition.props, propsNeedCastKeys = GenPagesCSSLayoutPosition.propsNeedCastKeys, emits = GenPagesCSSLayoutPosition.emits, components = GenPagesCSSLayoutPosition.components, styles = GenPagesCSSLayoutPosition.styles);
}
, fun(instance): GenPagesCSSLayoutPosition {
    return GenPagesCSSLayoutPosition(instance);
}
);
val GenPagesCSSLayoutWidthClass = CreateVueComponent(GenPagesCSSLayoutWidth::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutWidth.inheritAttrs, inject = GenPagesCSSLayoutWidth.inject, props = GenPagesCSSLayoutWidth.props, propsNeedCastKeys = GenPagesCSSLayoutWidth.propsNeedCastKeys, emits = GenPagesCSSLayoutWidth.emits, components = GenPagesCSSLayoutWidth.components, styles = GenPagesCSSLayoutWidth.styles);
}
, fun(instance): GenPagesCSSLayoutWidth {
    return GenPagesCSSLayoutWidth(instance);
}
);
val GenPagesCSSLayoutZIndexClass = CreateVueComponent(GenPagesCSSLayoutZIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutZIndex.inheritAttrs, inject = GenPagesCSSLayoutZIndex.inject, props = GenPagesCSSLayoutZIndex.props, propsNeedCastKeys = GenPagesCSSLayoutZIndex.propsNeedCastKeys, emits = GenPagesCSSLayoutZIndex.emits, components = GenPagesCSSLayoutZIndex.components, styles = GenPagesCSSLayoutZIndex.styles);
}
, fun(instance): GenPagesCSSLayoutZIndex {
    return GenPagesCSSLayoutZIndex(instance);
}
);
val GenPagesCSSLayoutVisibilityClass = CreateVueComponent(GenPagesCSSLayoutVisibility::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSLayoutVisibility.inheritAttrs, inject = GenPagesCSSLayoutVisibility.inject, props = GenPagesCSSLayoutVisibility.props, propsNeedCastKeys = GenPagesCSSLayoutVisibility.propsNeedCastKeys, emits = GenPagesCSSLayoutVisibility.emits, components = GenPagesCSSLayoutVisibility.components, styles = GenPagesCSSLayoutVisibility.styles);
}
, fun(instance): GenPagesCSSLayoutVisibility {
    return GenPagesCSSLayoutVisibility(instance);
}
);
val GenPagesCSSMarginMarginBottomClass = CreateVueComponent(GenPagesCSSMarginMarginBottom::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSMarginMarginBottom.inheritAttrs, inject = GenPagesCSSMarginMarginBottom.inject, props = GenPagesCSSMarginMarginBottom.props, propsNeedCastKeys = GenPagesCSSMarginMarginBottom.propsNeedCastKeys, emits = GenPagesCSSMarginMarginBottom.emits, components = GenPagesCSSMarginMarginBottom.components, styles = GenPagesCSSMarginMarginBottom.styles);
}
, fun(instance): GenPagesCSSMarginMarginBottom {
    return GenPagesCSSMarginMarginBottom(instance);
}
);
val GenPagesCSSMarginMarginLeftClass = CreateVueComponent(GenPagesCSSMarginMarginLeft::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSMarginMarginLeft.inheritAttrs, inject = GenPagesCSSMarginMarginLeft.inject, props = GenPagesCSSMarginMarginLeft.props, propsNeedCastKeys = GenPagesCSSMarginMarginLeft.propsNeedCastKeys, emits = GenPagesCSSMarginMarginLeft.emits, components = GenPagesCSSMarginMarginLeft.components, styles = GenPagesCSSMarginMarginLeft.styles);
}
, fun(instance): GenPagesCSSMarginMarginLeft {
    return GenPagesCSSMarginMarginLeft(instance);
}
);
val GenPagesCSSMarginMarginRightClass = CreateVueComponent(GenPagesCSSMarginMarginRight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSMarginMarginRight.inheritAttrs, inject = GenPagesCSSMarginMarginRight.inject, props = GenPagesCSSMarginMarginRight.props, propsNeedCastKeys = GenPagesCSSMarginMarginRight.propsNeedCastKeys, emits = GenPagesCSSMarginMarginRight.emits, components = GenPagesCSSMarginMarginRight.components, styles = GenPagesCSSMarginMarginRight.styles);
}
, fun(instance): GenPagesCSSMarginMarginRight {
    return GenPagesCSSMarginMarginRight(instance);
}
);
val GenPagesCSSMarginMarginTopClass = CreateVueComponent(GenPagesCSSMarginMarginTop::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSMarginMarginTop.inheritAttrs, inject = GenPagesCSSMarginMarginTop.inject, props = GenPagesCSSMarginMarginTop.props, propsNeedCastKeys = GenPagesCSSMarginMarginTop.propsNeedCastKeys, emits = GenPagesCSSMarginMarginTop.emits, components = GenPagesCSSMarginMarginTop.components, styles = GenPagesCSSMarginMarginTop.styles);
}
, fun(instance): GenPagesCSSMarginMarginTop {
    return GenPagesCSSMarginMarginTop(instance);
}
);
val GenPagesCSSMarginMarginClass = CreateVueComponent(GenPagesCSSMarginMargin::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSMarginMargin.inheritAttrs, inject = GenPagesCSSMarginMargin.inject, props = GenPagesCSSMarginMargin.props, propsNeedCastKeys = GenPagesCSSMarginMargin.propsNeedCastKeys, emits = GenPagesCSSMarginMargin.emits, components = GenPagesCSSMarginMargin.components, styles = GenPagesCSSMarginMargin.styles);
}
, fun(instance): GenPagesCSSMarginMargin {
    return GenPagesCSSMarginMargin(instance);
}
);
val GenPagesCSSOverflowOverflowClass = CreateVueComponent(GenPagesCSSOverflowOverflow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSOverflowOverflow.inheritAttrs, inject = GenPagesCSSOverflowOverflow.inject, props = GenPagesCSSOverflowOverflow.props, propsNeedCastKeys = GenPagesCSSOverflowOverflow.propsNeedCastKeys, emits = GenPagesCSSOverflowOverflow.emits, components = GenPagesCSSOverflowOverflow.components, styles = GenPagesCSSOverflowOverflow.styles);
}
, fun(instance): GenPagesCSSOverflowOverflow {
    return GenPagesCSSOverflowOverflow(instance);
}
);
val GenPagesCSSPaddingPaddingBottomClass = CreateVueComponent(GenPagesCSSPaddingPaddingBottom::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPaddingPaddingBottom.inheritAttrs, inject = GenPagesCSSPaddingPaddingBottom.inject, props = GenPagesCSSPaddingPaddingBottom.props, propsNeedCastKeys = GenPagesCSSPaddingPaddingBottom.propsNeedCastKeys, emits = GenPagesCSSPaddingPaddingBottom.emits, components = GenPagesCSSPaddingPaddingBottom.components, styles = GenPagesCSSPaddingPaddingBottom.styles);
}
, fun(instance): GenPagesCSSPaddingPaddingBottom {
    return GenPagesCSSPaddingPaddingBottom(instance);
}
);
val GenPagesCSSPaddingPaddingLeftClass = CreateVueComponent(GenPagesCSSPaddingPaddingLeft::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPaddingPaddingLeft.inheritAttrs, inject = GenPagesCSSPaddingPaddingLeft.inject, props = GenPagesCSSPaddingPaddingLeft.props, propsNeedCastKeys = GenPagesCSSPaddingPaddingLeft.propsNeedCastKeys, emits = GenPagesCSSPaddingPaddingLeft.emits, components = GenPagesCSSPaddingPaddingLeft.components, styles = GenPagesCSSPaddingPaddingLeft.styles);
}
, fun(instance): GenPagesCSSPaddingPaddingLeft {
    return GenPagesCSSPaddingPaddingLeft(instance);
}
);
val GenPagesCSSPaddingPaddingRightClass = CreateVueComponent(GenPagesCSSPaddingPaddingRight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPaddingPaddingRight.inheritAttrs, inject = GenPagesCSSPaddingPaddingRight.inject, props = GenPagesCSSPaddingPaddingRight.props, propsNeedCastKeys = GenPagesCSSPaddingPaddingRight.propsNeedCastKeys, emits = GenPagesCSSPaddingPaddingRight.emits, components = GenPagesCSSPaddingPaddingRight.components, styles = GenPagesCSSPaddingPaddingRight.styles);
}
, fun(instance): GenPagesCSSPaddingPaddingRight {
    return GenPagesCSSPaddingPaddingRight(instance);
}
);
val GenPagesCSSPaddingPaddingTopClass = CreateVueComponent(GenPagesCSSPaddingPaddingTop::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPaddingPaddingTop.inheritAttrs, inject = GenPagesCSSPaddingPaddingTop.inject, props = GenPagesCSSPaddingPaddingTop.props, propsNeedCastKeys = GenPagesCSSPaddingPaddingTop.propsNeedCastKeys, emits = GenPagesCSSPaddingPaddingTop.emits, components = GenPagesCSSPaddingPaddingTop.components, styles = GenPagesCSSPaddingPaddingTop.styles);
}
, fun(instance): GenPagesCSSPaddingPaddingTop {
    return GenPagesCSSPaddingPaddingTop(instance);
}
);
val GenPagesCSSPaddingPaddingClass = CreateVueComponent(GenPagesCSSPaddingPadding::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPaddingPadding.inheritAttrs, inject = GenPagesCSSPaddingPadding.inject, props = GenPagesCSSPaddingPadding.props, propsNeedCastKeys = GenPagesCSSPaddingPadding.propsNeedCastKeys, emits = GenPagesCSSPaddingPadding.emits, components = GenPagesCSSPaddingPadding.components, styles = GenPagesCSSPaddingPadding.styles);
}
, fun(instance): GenPagesCSSPaddingPadding {
    return GenPagesCSSPaddingPadding(instance);
}
);
val GenPagesCSSTextColorClass = CreateVueComponent(GenPagesCSSTextColor::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextColor.inheritAttrs, inject = GenPagesCSSTextColor.inject, props = GenPagesCSSTextColor.props, propsNeedCastKeys = GenPagesCSSTextColor.propsNeedCastKeys, emits = GenPagesCSSTextColor.emits, components = GenPagesCSSTextColor.components, styles = GenPagesCSSTextColor.styles);
}
, fun(instance): GenPagesCSSTextColor {
    return GenPagesCSSTextColor(instance);
}
);
val GenPagesCSSTextFontFamilyClass = CreateVueComponent(GenPagesCSSTextFontFamily::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextFontFamily.inheritAttrs, inject = GenPagesCSSTextFontFamily.inject, props = GenPagesCSSTextFontFamily.props, propsNeedCastKeys = GenPagesCSSTextFontFamily.propsNeedCastKeys, emits = GenPagesCSSTextFontFamily.emits, components = GenPagesCSSTextFontFamily.components, styles = GenPagesCSSTextFontFamily.styles);
}
, fun(instance): GenPagesCSSTextFontFamily {
    return GenPagesCSSTextFontFamily(instance);
}
);
val GenPagesCSSTextFontSizeClass = CreateVueComponent(GenPagesCSSTextFontSize::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextFontSize.inheritAttrs, inject = GenPagesCSSTextFontSize.inject, props = GenPagesCSSTextFontSize.props, propsNeedCastKeys = GenPagesCSSTextFontSize.propsNeedCastKeys, emits = GenPagesCSSTextFontSize.emits, components = GenPagesCSSTextFontSize.components, styles = GenPagesCSSTextFontSize.styles);
}
, fun(instance): GenPagesCSSTextFontSize {
    return GenPagesCSSTextFontSize(instance);
}
);
val GenPagesCSSTextFontStyleClass = CreateVueComponent(GenPagesCSSTextFontStyle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextFontStyle.inheritAttrs, inject = GenPagesCSSTextFontStyle.inject, props = GenPagesCSSTextFontStyle.props, propsNeedCastKeys = GenPagesCSSTextFontStyle.propsNeedCastKeys, emits = GenPagesCSSTextFontStyle.emits, components = GenPagesCSSTextFontStyle.components, styles = GenPagesCSSTextFontStyle.styles);
}
, fun(instance): GenPagesCSSTextFontStyle {
    return GenPagesCSSTextFontStyle(instance);
}
);
val GenPagesCSSTextFontWeightClass = CreateVueComponent(GenPagesCSSTextFontWeight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextFontWeight.inheritAttrs, inject = GenPagesCSSTextFontWeight.inject, props = GenPagesCSSTextFontWeight.props, propsNeedCastKeys = GenPagesCSSTextFontWeight.propsNeedCastKeys, emits = GenPagesCSSTextFontWeight.emits, components = GenPagesCSSTextFontWeight.components, styles = GenPagesCSSTextFontWeight.styles);
}
, fun(instance): GenPagesCSSTextFontWeight {
    return GenPagesCSSTextFontWeight(instance);
}
);
val GenPagesCSSTextLetterSpacingClass = CreateVueComponent(GenPagesCSSTextLetterSpacing::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextLetterSpacing.inheritAttrs, inject = GenPagesCSSTextLetterSpacing.inject, props = GenPagesCSSTextLetterSpacing.props, propsNeedCastKeys = GenPagesCSSTextLetterSpacing.propsNeedCastKeys, emits = GenPagesCSSTextLetterSpacing.emits, components = GenPagesCSSTextLetterSpacing.components, styles = GenPagesCSSTextLetterSpacing.styles);
}
, fun(instance): GenPagesCSSTextLetterSpacing {
    return GenPagesCSSTextLetterSpacing(instance);
}
);
open class Icon (
    @JsonNotNull
    open var name: String,
    @JsonNotNull
    open var code: String,
) : UTSReactiveObject() {
    override fun __v_create(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): UTSReactiveObject {
        return IconReactiveObject(this, __v_isReadonly, __v_isShallow, __v_skip)
    }
}
open class IconReactiveObject : Icon, IUTSReactive<Icon> {
    override var __v_raw: Icon;
    override var __v_isReadonly: Boolean;
    override var __v_isShallow: Boolean;
    override var __v_skip: Boolean;
    constructor(__v_raw: Icon, __v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean) : super(name = __v_raw.name, code = __v_raw.code) {
        this.__v_raw = __v_raw;
        this.__v_isReadonly = __v_isReadonly;
        this.__v_isShallow = __v_isShallow;
        this.__v_skip = __v_skip;
    }
    override fun __v_clone(__v_isReadonly: Boolean, __v_isShallow: Boolean, __v_skip: Boolean): IconReactiveObject {
        return IconReactiveObject(this.__v_raw, __v_isReadonly, __v_isShallow, __v_skip);
    }
    override var name: String
        get() {
            return trackReactiveGet(__v_raw, "name", __v_raw.name, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("name")) {
                return;
            }
            val oldValue = __v_raw.name;
            __v_raw.name = value;
            triggerReactiveSet(__v_raw, "name", oldValue, value);
        }
    override var code: String
        get() {
            return trackReactiveGet(__v_raw, "code", __v_raw.code, this.__v_isReadonly, this.__v_isShallow);
        }
        set(value) {
            if (!this.__v_canSet("code")) {
                return;
            }
            val oldValue = __v_raw.code;
            __v_raw.code = value;
            triggerReactiveSet(__v_raw, "code", oldValue, value);
        }
}
val GenPagesCSSTextFontFamilyIconClass = CreateVueComponent(GenPagesCSSTextFontFamilyIcon::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextFontFamilyIcon.inheritAttrs, inject = GenPagesCSSTextFontFamilyIcon.inject, props = GenPagesCSSTextFontFamilyIcon.props, propsNeedCastKeys = GenPagesCSSTextFontFamilyIcon.propsNeedCastKeys, emits = GenPagesCSSTextFontFamilyIcon.emits, components = GenPagesCSSTextFontFamilyIcon.components, styles = GenPagesCSSTextFontFamilyIcon.styles);
}
, fun(instance): GenPagesCSSTextFontFamilyIcon {
    return GenPagesCSSTextFontFamilyIcon(instance);
}
);
val GenPagesCSSTextLineHeightClass = CreateVueComponent(GenPagesCSSTextLineHeight::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextLineHeight.inheritAttrs, inject = GenPagesCSSTextLineHeight.inject, props = GenPagesCSSTextLineHeight.props, propsNeedCastKeys = GenPagesCSSTextLineHeight.propsNeedCastKeys, emits = GenPagesCSSTextLineHeight.emits, components = GenPagesCSSTextLineHeight.components, styles = GenPagesCSSTextLineHeight.styles);
}
, fun(instance): GenPagesCSSTextLineHeight {
    return GenPagesCSSTextLineHeight(instance);
}
);
val GenPagesCSSTextTextAlignClass = CreateVueComponent(GenPagesCSSTextTextAlign::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextTextAlign.inheritAttrs, inject = GenPagesCSSTextTextAlign.inject, props = GenPagesCSSTextTextAlign.props, propsNeedCastKeys = GenPagesCSSTextTextAlign.propsNeedCastKeys, emits = GenPagesCSSTextTextAlign.emits, components = GenPagesCSSTextTextAlign.components, styles = GenPagesCSSTextTextAlign.styles);
}
, fun(instance): GenPagesCSSTextTextAlign {
    return GenPagesCSSTextTextAlign(instance);
}
);
val GenPagesCSSTextTextOverflowClass = CreateVueComponent(GenPagesCSSTextTextOverflow::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextTextOverflow.inheritAttrs, inject = GenPagesCSSTextTextOverflow.inject, props = GenPagesCSSTextTextOverflow.props, propsNeedCastKeys = GenPagesCSSTextTextOverflow.propsNeedCastKeys, emits = GenPagesCSSTextTextOverflow.emits, components = GenPagesCSSTextTextOverflow.components, styles = GenPagesCSSTextTextOverflow.styles);
}
, fun(instance): GenPagesCSSTextTextOverflow {
    return GenPagesCSSTextTextOverflow(instance);
}
);
val GenPagesCSSTextTextDecorationLineClass = CreateVueComponent(GenPagesCSSTextTextDecorationLine::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTextTextDecorationLine.inheritAttrs, inject = GenPagesCSSTextTextDecorationLine.inject, props = GenPagesCSSTextTextDecorationLine.props, propsNeedCastKeys = GenPagesCSSTextTextDecorationLine.propsNeedCastKeys, emits = GenPagesCSSTextTextDecorationLine.emits, components = GenPagesCSSTextTextDecorationLine.components, styles = GenPagesCSSTextTextDecorationLine.styles);
}
, fun(instance): GenPagesCSSTextTextDecorationLine {
    return GenPagesCSSTextTextDecorationLine(instance);
}
);
val GenPagesCSSTransitionTransitionClass = CreateVueComponent(GenPagesCSSTransitionTransition::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTransitionTransition.inheritAttrs, inject = GenPagesCSSTransitionTransition.inject, props = GenPagesCSSTransitionTransition.props, propsNeedCastKeys = GenPagesCSSTransitionTransition.propsNeedCastKeys, emits = GenPagesCSSTransitionTransition.emits, components = GenPagesCSSTransitionTransition.components, styles = GenPagesCSSTransitionTransition.styles);
}
, fun(instance): GenPagesCSSTransitionTransition {
    return GenPagesCSSTransitionTransition(instance);
}
);
val GenPagesCSSPointerEventsPointerEventsClass = CreateVueComponent(GenPagesCSSPointerEventsPointerEvents::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSPointerEventsPointerEvents.inheritAttrs, inject = GenPagesCSSPointerEventsPointerEvents.inject, props = GenPagesCSSPointerEventsPointerEvents.props, propsNeedCastKeys = GenPagesCSSPointerEventsPointerEvents.propsNeedCastKeys, emits = GenPagesCSSPointerEventsPointerEvents.emits, components = GenPagesCSSPointerEventsPointerEvents.components, styles = GenPagesCSSPointerEventsPointerEvents.styles);
}
, fun(instance): GenPagesCSSPointerEventsPointerEvents {
    return GenPagesCSSPointerEventsPointerEvents(instance);
}
);
val GenPagesCSSTransformTranslateClass = CreateVueComponent(GenPagesCSSTransformTranslate::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTransformTranslate.inheritAttrs, inject = GenPagesCSSTransformTranslate.inject, props = GenPagesCSSTransformTranslate.props, propsNeedCastKeys = GenPagesCSSTransformTranslate.propsNeedCastKeys, emits = GenPagesCSSTransformTranslate.emits, components = GenPagesCSSTransformTranslate.components, styles = GenPagesCSSTransformTranslate.styles);
}
, fun(instance): GenPagesCSSTransformTranslate {
    return GenPagesCSSTransformTranslate(instance);
}
);
val GenPagesCSSTransformScaleClass = CreateVueComponent(GenPagesCSSTransformScale::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTransformScale.inheritAttrs, inject = GenPagesCSSTransformScale.inject, props = GenPagesCSSTransformScale.props, propsNeedCastKeys = GenPagesCSSTransformScale.propsNeedCastKeys, emits = GenPagesCSSTransformScale.emits, components = GenPagesCSSTransformScale.components, styles = GenPagesCSSTransformScale.styles);
}
, fun(instance): GenPagesCSSTransformScale {
    return GenPagesCSSTransformScale(instance);
}
);
val GenPagesCSSTransformRotateClass = CreateVueComponent(GenPagesCSSTransformRotate::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSTransformRotate.inheritAttrs, inject = GenPagesCSSTransformRotate.inject, props = GenPagesCSSTransformRotate.props, propsNeedCastKeys = GenPagesCSSTransformRotate.propsNeedCastKeys, emits = GenPagesCSSTransformRotate.emits, components = GenPagesCSSTransformRotate.components, styles = GenPagesCSSTransformRotate.styles);
}
, fun(instance): GenPagesCSSTransformRotate {
    return GenPagesCSSTransformRotate(instance);
}
);
val GenPagesCSSVariableVariableClass = CreateVueComponent(GenPagesCSSVariableVariable::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSVariableVariable.inheritAttrs, inject = GenPagesCSSVariableVariable.inject, props = GenPagesCSSVariableVariable.props, propsNeedCastKeys = GenPagesCSSVariableVariable.propsNeedCastKeys, emits = GenPagesCSSVariableVariable.emits, components = GenPagesCSSVariableVariable.components, styles = GenPagesCSSVariableVariable.styles);
}
, fun(instance): GenPagesCSSVariableVariable {
    return GenPagesCSSVariableVariable(instance);
}
);
val GenPagesCSSOverflowOverflowVisibleEventClass = CreateVueComponent(GenPagesCSSOverflowOverflowVisibleEvent::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesCSSOverflowOverflowVisibleEvent.inheritAttrs, inject = GenPagesCSSOverflowOverflowVisibleEvent.inject, props = GenPagesCSSOverflowOverflowVisibleEvent.props, propsNeedCastKeys = GenPagesCSSOverflowOverflowVisibleEvent.propsNeedCastKeys, emits = GenPagesCSSOverflowOverflowVisibleEvent.emits, components = GenPagesCSSOverflowOverflowVisibleEvent.components, styles = GenPagesCSSOverflowOverflowVisibleEvent.styles);
}
, fun(instance): GenPagesCSSOverflowOverflowVisibleEvent {
    return GenPagesCSSOverflowOverflowVisibleEvent(instance);
}
);
val uniStatcollectItems: UTSJSONObject = object : UTSJSONObject() {
    var uniStatPageLog = true
};
val uniStatOptions: UTSJSONObject = object : UTSJSONObject() {
    var debug = false
    var collectItems = uniStatcollectItems
};
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    app.use(uniStat, uniStatOptions);
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "app",
            app
        )
    )));
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app, GenUniApp());
}
open class UniAppConfig : io.dcloud.uniapp.appframe.AppConfig {
    override var name: String = "vercel-ci-app";
    override var appid: String = "__UNI__FB90797";
    override var versionName: String = "1.7.2";
    override var versionCode: String = "10702";
    override var uniCompilerVersion: String = "4.45";
    constructor() : super() {}
}
fun definePageRoutes() {
    __uniRoutes.push(UniPageRoute(path = "pages/tabBar/component", component = GenPagesTabBarComponentClass, meta = UniPageMeta(isQuit = true), style = utsMapOf("navigationBarTitleText" to "内置组件", "backgroundColorContent" to "#f8f8f8")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/view/view", component = GenPagesComponentViewViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "view | 基本视图容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/scroll-view/scroll-view", component = GenPagesComponentScrollViewScrollViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "scroll-view | 可滚动视图容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/scroll-view/scroll-view-refresher", component = GenPagesComponentScrollViewScrollViewRefresherClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "scroll-view-refresher")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/scroll-view/scroll-view-props", component = GenPagesComponentScrollViewScrollViewPropsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "非下拉刷新的scroll-view属性示例")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/scroll-view/scroll-view-refresher-props", component = GenPagesComponentScrollViewScrollViewRefresherPropsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "下拉刷新的scroll-view属性示例")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/scroll-view/scroll-view-custom-refresher-props", component = GenPagesComponentScrollViewScrollViewCustomRefresherPropsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "自定义下拉刷新的scroll-view属性示例")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/swiper/swiper", component = GenPagesComponentSwiperSwiperClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "swiper | 滑块视图容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view", component = GenPagesComponentListViewListViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view | 列表容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view-refresh", component = GenPagesComponentListViewListViewRefreshClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view-refresh", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view-multiplex", component = GenPagesComponentListViewListViewMultiplexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view-multiplex")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view-multiplex-input", component = GenPagesComponentListViewListViewMultiplexInputClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view复用input", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view-multiplex-video", component = GenPagesComponentListViewListViewMultiplexVideoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view-multiplex-video")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/list-view-children-in-slot", component = GenPagesComponentListViewListViewChildrenInSlotClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "list-view-children-in-slot")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/sticky-section/sticky-section", component = GenPagesComponentStickySectionStickySectionClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "sticky-section | 吸顶布局容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/sticky-header/sticky-header", component = GenPagesComponentStickyHeaderStickyHeaderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "sticky-header | 吸顶布局容器", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/text/text", component = GenPagesComponentTextTextClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "text | 文本")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/text/text-props", component = GenPagesComponentTextTextPropsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "text-props")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/rich-text/rich-text", component = GenPagesComponentRichTextRichTextClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "rich-text | 富文本")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/rich-text/rich-text-tags", component = GenPagesComponentRichTextRichTextTagsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "rich-text-tags")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/rich-text/rich-text-complex", component = GenPagesComponentRichTextRichTextComplexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "rich-text-complex")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/progress/progress", component = GenPagesComponentProgressProgressClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "progress | 进度条")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/form/form", component = GenPagesComponentFormFormClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "form | 表单")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/button/button", component = GenPagesComponentButtonButtonClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "button | 按钮")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/button/buttonstatus", component = GenPagesComponentButtonButtonstatusClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "buttonstatus")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/radio/radio", component = GenPagesComponentRadioRadioClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "radio | 单选框")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/checkbox/checkbox", component = GenPagesComponentCheckboxCheckboxClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "checkbox | 多选框")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/input/input", component = GenPagesComponentInputInputClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "input | 输入框")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/textarea/textarea", component = GenPagesComponentTextareaTextareaClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "textarea | 多行输入框")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/slider/slider", component = GenPagesComponentSliderSliderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "slider | 滑动选择器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/slider/slider-in-swiper", component = GenPagesComponentSliderSliderInSwiperClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "slider-in-swiper")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/slider/slider-maxValue", component = GenPagesComponentSliderSliderMaxValueClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "slider-maxValue-test")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/picker-view/picker-view", component = GenPagesComponentPickerViewPickerViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "picker-view | 嵌入页面的滚动选择器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/switch/switch", component = GenPagesComponentSwitchSwitchClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "switch | 开关选择器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/image/image", component = GenPagesComponentImageImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "image | 图片")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/image/image-format", component = GenPagesComponentImageImageFormatClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "image-format")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/image/image-mode", component = GenPagesComponentImageImageModeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "image-mode")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/image/image-path", component = GenPagesComponentImageImagePathClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "image-path")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/image/image-large", component = GenPagesComponentImageImageLargeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "大图测试")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/video/video", component = GenPagesComponentVideoVideoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "video | 视频")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/video/video-format", component = GenPagesComponentVideoVideoFormatClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "video-format")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/navigator/navigator", component = GenPagesComponentNavigatorNavigatorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "navigator | 页面链接")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/navigator/navigate", component = GenPagesComponentNavigatorNavigateClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "navigatePage")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/navigator/redirect", component = GenPagesComponentNavigatorRedirectClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "redirectPage")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/web-view/web-view", component = GenPagesComponentWebViewWebViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "web-view")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/web-view/web-view/web-view-local", component = GenPagesComponentWebViewWebViewWebViewLocalClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "本地网页")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/unicloud-db/unicloud-db/contacts/list", component = GenPagesComponentUnicloudDbUnicloudDbContactsListClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "联系人", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/unicloud-db/unicloud-db/contacts/add", component = GenPagesComponentUnicloudDbUnicloudDbContactsAddClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "新增联系人")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/unicloud-db/unicloud-db/contacts/edit", component = GenPagesComponentUnicloudDbUnicloudDbContactsEditClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "编辑联系人")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/unicloud-db/unicloud-db/contacts/detail", component = GenPagesComponentUnicloudDbUnicloudDbContactsDetailClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/unicloud-db/unicloud-db/mixin-datacom/mixin-datacom", component = GenPagesComponentUnicloudDbUnicloudDbMixinDatacomMixinDatacomClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "mixinDatacom")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/global-properties/global-properties", component = GenPagesComponentGlobalPropertiesGlobalPropertiesClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "全局属性")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/global-events/global-events", component = GenPagesComponentGlobalEventsGlobalEventsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "全局事件")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/global-events/transition-events", component = GenPagesComponentGlobalEventsTransitionEventsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "Transition Events")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/global-events/touch-events", component = GenPagesComponentGlobalEventsTouchEventsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "Touch Events")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/global-events/touch-events-bubbles", component = GenPagesComponentGlobalEventsTouchEventsBubblesClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "Touch Events bubbles")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/nested-scroll-header/nested-scroll-header", component = GenPagesComponentNestedScrollHeaderNestedScrollHeaderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "nested-scroll-header")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/nested-scroll-body/nested-scroll-body", component = GenPagesComponentNestedScrollBodyNestedScrollBodyClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "nested-scroll-body")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/swiper/swiper-list-view", component = GenPagesComponentSwiperSwiperListViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "swiper嵌套list-view", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/map/map", component = GenPagesComponentMapMapClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "map | 地图")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/list-view/issue-2199", component = GenPagesComponentListViewIssue2199Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "issue-2199", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/canvas/canvas", component = GenPagesComponentCanvasCanvasClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "canvas | 画布")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/canvas/canvas-context", component = GenPagesComponentCanvasCanvasContextClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createCanvasContextAsync")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/canvas/canvas/ball", component = GenPagesComponentCanvasCanvasBallClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "ball")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/canvas/canvas/doodle", component = GenPagesComponentCanvasCanvasDoodleClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "涂鸦")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/native-view/native-view", component = GenPagesComponentNativeViewNativeViewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "native-view")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/ad/ad", component = GenPagesComponentAdAdClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "ad | 信息流广告", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/waterflow/waterflow", component = GenPagesComponentWaterflowWaterflowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "waterflow | 瀑布流容器")));
    __uniRoutes.push(UniPageRoute(path = "pages/component/ad/list-view-ad", component = GenPagesComponentAdListViewAdClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "ad | 信息流广告", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/tabBar/API", component = GenPagesTabBarAPIClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "接口", "backgroundColorContent" to "#f8f8f8")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-app/get-app", component = GenPagesAPIGetAppGetAppClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getApp | 获取当前应用实例")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/exit/exit", component = GenPagesAPIExitExitClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "exit | 退出应用")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/install-apk/install-apk", component = GenPagesAPIInstallApkInstallApkClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "installApk | 安装 APK", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-current-pages/get-current-pages", component = GenPagesAPIGetCurrentPagesGetCurrentPagesClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getCurrentPages | 获取当前页面栈", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-current-pages/set-page-style-disable-pull-down-refresh", component = GenPagesAPIGetCurrentPagesSetPageStyleDisablePullDownRefreshClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "setPageStyle pull default false", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-launch-options-sync/get-launch-options-sync", component = GenPagesAPIGetLaunchOptionsSyncGetLaunchOptionsSyncClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getLaunchOptionsSync | 获取启动参数")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-enter-options-sync/get-enter-options-sync", component = GenPagesAPIGetEnterOptionsSyncGetEnterOptionsSyncClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getEnterOptionsSync | 获取本次启动时的参数")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/animation-frame/animation-frame", component = GenPagesAPIAnimationFrameAnimationFrameClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "animationFrame | 动画帧")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/navigator/navigator", component = GenPagesAPINavigatorNavigatorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "navigator | 页面跳转")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/set-navigation-bar-color/set-navigation-bar-color", component = GenPagesAPISetNavigationBarColorSetNavigationBarColorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "setNavigationBarColor | 设置导航条颜色")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/set-navigation-bar-title/set-navigation-bar-title", component = GenPagesAPISetNavigationBarTitleSetNavigationBarTitleClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "setNavigationBarTitle | 设置导航条标题")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/set-page-backgroundColorContent/set-page-backgroundColorContent", component = GenPagesAPISetPageBackgroundColorContentSetPageBackgroundColorContentClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "设置页面容器背景色")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/navigator/new-page/new-page-1", component = GenPagesAPINavigatorNewPageNewPage1Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "新页面-1")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/navigator/new-page/new-page-3", component = GenPagesAPINavigatorNewPageNewPage3Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "新页面-3")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/navigator/new-page/onLoad", component = GenPagesAPINavigatorNewPageOnLoadClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "onLoad 生命周期测试")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/pull-down-refresh/pull-down-refresh", component = GenPagesAPIPullDownRefreshPullDownRefreshClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "pullDownRefresh | 页面下拉刷新", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/storage/storage", component = GenPagesAPIStorageStorageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "storage | key-value本地数据存储")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-file-system-manager/get-file-system-manager", component = GenPagesAPIGetFileSystemManagerGetFileSystemManagerClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getFileSystemManager | 获取文件管理器")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/env/env", component = GenPagesAPIEnvEnvClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "env | 环境变量")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/show-action-sheet/show-action-sheet", component = GenPagesAPIShowActionSheetShowActionSheetClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "showActionSheet | 弹出操作菜单")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/show-modal/show-modal", component = GenPagesAPIShowModalShowModalClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "showModal | 显示模态弹窗")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/show-loading/show-loading", component = GenPagesAPIShowLoadingShowLoadingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "showLoading | 显示 loading 提示框")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/show-toast/show-toast", component = GenPagesAPIShowToastShowToastClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "showToast | 显示消息提示框")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/load-font-face/load-font-face", component = GenPagesAPILoadFontFaceLoadFontFaceClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "loadFontFace | 动态加载字体")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/load-font-face/load-font-face-child", component = GenPagesAPILoadFontFaceLoadFontFaceChildClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "动态加载字体-子页面")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-location/get-location", component = GenPagesAPIGetLocationGetLocationClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getLocation | 获取当前位置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/open-location/open-location", component = GenPagesAPIOpenLocationOpenLocationClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "openLocation | 使用地图查看位置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/choose-location/choose-location", component = GenPagesAPIChooseLocationChooseLocationClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "chooseLocation | 使用地图选择位置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/interceptor/interceptor", component = GenPagesAPIInterceptorInterceptorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "interceptor | 拦截器")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/interceptor/page1", component = GenPagesAPIInterceptorPage1Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "拦截器测试页面 1")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/interceptor/page2", component = GenPagesAPIInterceptorPage2Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "拦截器测试页面 2")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/request/request", component = GenPagesAPIRequestRequestClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "request | 发起网络请求")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/upload-file/upload-file", component = GenPagesAPIUploadFileUploadFileClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "uploadFile | 上传文件")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/download-file/download-file", component = GenPagesAPIDownloadFileDownloadFileClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "downloadFile | 下载文件")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/websocket/socketTask", component = GenPagesAPIWebsocketSocketTaskClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "socketTask")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/websocket/websocket", component = GenPagesAPIWebsocketWebsocketClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "websocket")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/unicloud/unicloud/cloud-function", component = GenPagesAPIUnicloudUnicloudCloudFunctionClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "cloud function | 云函数")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/unicloud/unicloud/cloud-object", component = GenPagesAPIUnicloudUnicloudCloudObjectClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "cloud object | 云对象")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-system-info/get-system-info", component = GenPagesAPIGetSystemInfoGetSystemInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getSystemInfo | 获取系统信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-device-info/get-device-info", component = GenPagesAPIGetDeviceInfoGetDeviceInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getDeviceInfo | 获取设备信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-app-base-info/get-app-base-info", component = GenPagesAPIGetAppBaseInfoGetAppBaseInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getAppBaseInfo | 获取APP基础信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-system-setting/get-system-setting", component = GenPagesAPIGetSystemSettingGetSystemSettingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getSystemSetting | 获取系统设置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/element-takesnapshot/element-takesnapshot", component = GenPagesAPIElementTakesnapshotElementTakesnapshotClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "takeSnapshot | 截图", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/element-get-bounding-client-rect-async/element-get-bounding-client-rect-async", component = GenPagesAPIElementGetBoundingClientRectAsyncElementGetBoundingClientRectAsyncClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getBoundingClientRectAsync | 异步获取元素信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/element-get-attribute/element-get-attribute", component = GenPagesAPIElementGetAttributeElementGetAttributeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getAttribute | 获取元素的属性值")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-app-authorize-setting/get-app-authorize-setting", component = GenPagesAPIGetAppAuthorizeSettingGetAppAuthorizeSettingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getAppAuthorizeSetting | 获取APP授权设置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/preview-image/preview-image", component = GenPagesAPIPreviewImagePreviewImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "previewImage | 图片预览")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/choose-image/choose-image", component = GenPagesAPIChooseImageChooseImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "chooseImage | 拍照或从相册选择图片")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-image-info/get-image-info", component = GenPagesAPIGetImageInfoGetImageInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getImageInfo | 获取图片信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/compress-image/compress-image", component = GenPagesAPICompressImageCompressImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "compressImage | 压缩图片")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/choose-video/choose-video", component = GenPagesAPIChooseVideoChooseVideoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "chooseVideo | 拍摄视频或从相册中选择视频")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/compress-video/compress-video", component = GenPagesAPICompressVideoCompressVideoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "compressVideo | 压缩视频")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-network-type/get-network-type", component = GenPagesAPIGetNetworkTypeGetNetworkTypeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getNetworkType | 获取网络类型")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/page-scroll-to/page-scroll-to", component = GenPagesAPIPageScrollToPageScrollToClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "pageScrollTo | 将页面滚动到指定位置")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/event-bus/event-bus", component = GenPagesAPIEventBusEventBusClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "eventBus | 事件总线")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/unicloud/unicloud/cloud-storage", component = GenPagesAPIUnicloudUnicloudCloudStorageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "cloud storage | 云存储")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/unicloud/unicloud/database", component = GenPagesAPIUnicloudUnicloudDatabaseClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "database | 数据库")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-battery-info/get-battery-info", component = GenPagesAPIGetBatteryInfoGetBatteryInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getBatteryInfo | 获取电池电量信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-window-info/get-window-info", component = GenPagesAPIGetWindowInfoGetWindowInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getWindowInfo | 获取窗口信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-window-info/window-area", component = GenPagesAPIGetWindowInfoWindowAreaClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "window area", "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/element-draw/element-draw", component = GenPagesAPIElementDrawElementDrawClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getDrawableContext | 获取绘制对象", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/facial-recognition-meta-info/facial-recognition-meta-info", component = GenPagesAPIFacialRecognitionMetaInfoFacialRecognitionMetaInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "facialRecognitionMetaInfo | 金融级实人认证", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-univerify-manager/get-univerify-manager", component = GenPagesAPIGetUniverifyManagerGetUniverifyManagerClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getUniverifyManager | App一键登录", "navigationBarTextStyle" to "white", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-univerify-manager/univerify-custom-page", component = GenPagesAPIGetUniverifyManagerUniverifyCustomPageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTextStyle" to "black", "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-univerify-manager/full-webview-page", component = GenPagesAPIGetUniverifyManagerFullWebviewPageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTextStyle" to "white", "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/rpx2px/rpx2px", component = GenPagesAPIRpx2pxRpx2pxClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "rpx2px | 将rpx单位值转换成px", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-request-permission-listener/create-request-permission-listener", component = GenPagesAPICreateRequestPermissionListenerCreateRequestPermissionListenerClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createRequestPermissionListener | 监听权限申请", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/request-payment/request-payment", component = GenPagesAPIRequestPaymentRequestPaymentClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "requestPayment | 支付（requestPayment）", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-rewarded-video-ad/create-rewarded-video-ad", component = GenPagesAPICreateRewardedVideoAdCreateRewardedVideoAdClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createRewardedVideoAd | 激励视频广告", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/request-payment/request-payment/request-payment-uni-pay", component = GenPagesAPIRequestPaymentRequestPaymentRequestPaymentUniPayClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "uni-pay示例", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/request-payment/request-payment/order-detail", component = GenPagesAPIRequestPaymentRequestPaymentOrderDetailClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "订单详情示例", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-inner-audio-context/create-inner-audio-context", component = GenPagesAPICreateInnerAudioContextCreateInnerAudioContextClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createInnerAudioContext | 音频")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-inner-audio-context/inner-audio-format", component = GenPagesAPICreateInnerAudioContextInnerAudioFormatClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "inner-audio-format")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-inner-audio-context/inner-audio-path", component = GenPagesAPICreateInnerAudioContextInnerAudioPathClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "inner-audio-path")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-inner-audio-context/inner-audio-mult", component = GenPagesAPICreateInnerAudioContextInnerAudioMultClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "inner-audio-mult")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/theme-change/theme-change", component = GenPagesAPIThemeChangeThemeChangeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "themeChange | 主题切换", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-element-by-id/get-element-by-id", component = GenPagesAPIGetElementByIdGetElementByIdClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getElementById | 通过 id 获取 element")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-element-by-id/get-element-by-id-multiple-root-node", component = GenPagesAPIGetElementByIdGetElementByIdMultipleRootNodeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "获取节点-多根节点")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-selector-query/create-selector-query", component = GenPagesAPICreateSelectorQueryCreateSelectorQueryClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createSelectorQuery | 创建 SelectorQuery 实例")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-selector-query/create-selector-query-onScroll", component = GenPagesAPICreateSelectorQueryCreateSelectorQueryOnScrollClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createSelectorQuery")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-native-view/element-getnativeview", component = GenPagesAPIGetNativeViewElementGetnativeviewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getNativeView | 获取原生 View", "backgroundColor" to "#F8F8F8")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/resize-observer/resize-observer", component = GenPagesAPIResizeObserverResizeObserverClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "UniResizeObserver")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/provider/provider", component = GenPagesAPIProviderProviderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "provider | 服务提供商")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/privacy/privacy", component = GenPagesAPIPrivacyPrivacyClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "privacy | 隐私信息授权")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/uni-push/uni-push", component = GenPagesAPIUniPushUniPushClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "推送")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/report/report", component = GenPagesAPIReportReportClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "report | 统计采集上报")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/dialog-page", component = GenPagesAPIDialogPageDialogPageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogPage")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/next-page", component = GenPagesAPIDialogPageNextPageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogNextPage")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/dialog-1", component = GenPagesAPIDialogPageDialog1Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogPage1")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/dialog-2", component = GenPagesAPIDialogPageDialog2Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogPage2")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/dialog-3", component = GenPagesAPIDialogPageDialog3Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogPage3")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/dialog-page/dialog-4", component = GenPagesAPIDialogPageDialog4Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "dialogPage4", "navigationBarTextStyle" to "black")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/create-interstitial-ad/create-interstitial-ad", component = GenPagesAPICreateInterstitialAdCreateInterstitialAdClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "createInterstitialAd | 插屏广告", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-background-audio-manager/get-background-audio-manager", component = GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getBackgroundAudioManager | 背景音频", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/API/share-with-system/share-with-system", component = GenPagesAPIShareWithSystemShareWithSystemClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "shareWithSystem", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/tabBar/CSS", component = GenPagesTabBarCSSClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "CSS", "backgroundColorContent" to "#f8f8f8")));
    __uniRoutes.push(UniPageRoute(path = "pages/tabBar/template", component = GenPagesTabBarTemplateClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "模板", "backgroundColorContent" to "#f8f8f8")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/list-news/list-news", component = GenPagesTemplateListNewsListNewsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "列表到详情示例（吸顶）")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/list-news/detail/detail", component = GenPagesTemplateListNewsDetailDetailClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "详情示例")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/drop-card/drop-card", component = GenPagesTemplateDropCardDropCardClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "drop-card")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/swiper-list/swiper-list", component = GenPagesTemplateSwiperListSwiperListClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "swiper-list")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/swiper-list2/swiper-list2", component = GenPagesTemplateSwiperList2SwiperList2Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "swiper-list2")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/slider-100/slider-100", component = GenPagesTemplateSlider100Slider100Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "slider x 100")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/swiper-vertical-video/swiper-vertical-video", component = GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationStyle" to "custom", "backgroundColorContent" to "#000000")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/scroll-sticky/scroll-sticky", component = GenPagesTemplateScrollStickyScrollStickyClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "scroll-view自定义滚动吸顶")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/scroll-fold-nav/scroll-fold-nav", component = GenPagesTemplateScrollFoldNavScrollFoldNavClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationStyle" to "custom", "navigationBarTextStyle" to "black")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/custom-refresher/custom-refresher", component = GenPagesTemplateCustomRefresherCustomRefresherClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "自定义下拉刷新")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/half-screen/half-screen", component = GenPagesTemplateHalfScreenHalfScreenClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "半屏弹窗")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/long-list/long-list", component = GenPagesTemplateLongListLongListClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "Android顶部搜索框随时下移长列表", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/template/long-list2/long-list2", component = GenPagesTemplateLongList2LongList2Class, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "顶部banner长列表嵌套滚动示例", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/template/long-list-nested/long-list-nested", component = GenPagesTemplateLongListNestedLongListNestedClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "顶部banner长列表嵌套滚动示例", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/template/long-waterflow-nested/long-waterflow-nested", component = GenPagesTemplateLongWaterflowNestedLongWaterflowNestedClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "顶部banner瀑布流长列表嵌套滚动示例", "enablePullDownRefresh" to true)));
    __uniRoutes.push(UniPageRoute(path = "pages/template/pull-zoom-image/pull-zoom-image", component = GenPagesTemplatePullZoomImagePullZoomImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/navbar-lite/navbar-lite", component = GenPagesTemplateNavbarLiteNavbarLiteClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "自定义导航栏", "navigationStyle" to "custom")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/custom-tab-bar/custom-tab-bar", component = GenPagesTemplateCustomTabBarCustomTabBarClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "自定义TabBar")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/calendar/calendar", component = GenPagesTemplateCalendarCalendarClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "日历")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/schema/schema", component = GenPagesTemplateSchemaSchemaClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "打开schema示例")));
    __uniRoutes.push(UniPageRoute(path = "uni_modules/uni-pay-x/pages/success/success", component = GenUniModulesUniPayXPagesSuccessSuccessClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "backgroundColor" to "#F8F8F8", "navigationBarBackgroundColor" to "#007aff", "navigationBarTextStyle" to "white")));
    __uniRoutes.push(UniPageRoute(path = "uni_modules/uni-pay-x/pages/ad-interactive-webview/ad-interactive-webview", component = GenUniModulesUniPayXPagesAdInteractiveWebviewAdInteractiveWebviewClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "ad", "backgroundColor" to "#F8F8F8")));
    __uniRoutes.push(UniPageRoute(path = "uni_modules/uni-pay-x/pages/pay-desk/pay-desk", component = GenUniModulesUniPayXPagesPayDeskPayDeskClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "收银台", "backgroundColor" to "#F8F8F8")));
    __uniRoutes.push(UniPageRoute(path = "pages/template/custom-long-list/custom-long-list", component = GenPagesTemplateCustomLongListCustomLongListClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "自定义虚拟长列表", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/template/test-background-color-content/test-background-color-content", component = GenPagesTemplateTestBackgroundColorContentTestBackgroundColorContentClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "backgroundColorContent" to "#fffae8")));
    __uniRoutes.push(UniPageRoute(path = "uni_modules/uni-openLocation/pages/openLocation/openLocation", component = GenUniModulesUniOpenLocationPagesOpenLocationOpenLocationClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to " ", "navigationStyle" to "custom", "disableSwipeBack" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/component/button/privacy", component = GenPagesComponentButtonPrivacyClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "")));
    __uniRoutes.push(UniPageRoute(path = "uni_modules/uni-upgrade-center-app/pages/uni-app-x/upgrade-popup", component = GenUniModulesUniUpgradeCenterAppPagesUniAppXUpgradePopupClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/save-image-to-photos-album/save-image-to-photos-album", component = GenPagesAPISaveImageToPhotosAlbumSaveImageToPhotosAlbumClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "saveImageToPhotosAlbum | 保存图片到相册")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/save-video-to-photos-album/save-video-to-photos-album", component = GenPagesAPISaveVideoToPhotosAlbumSaveVideoToPhotosAlbumClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "saveVideoToPhotosAlbum | 保存视频到相册")));
    __uniRoutes.push(UniPageRoute(path = "pages/API/get-video-info/get-video-info", component = GenPagesAPIGetVideoInfoGetVideoInfoClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "getVideoInfo | 获取视频信息")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/background/background-color", component = GenPagesCSSBackgroundBackgroundColorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "background-color")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/background/background-image", component = GenPagesCSSBackgroundBackgroundImageClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "background-image")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-bottom", component = GenPagesCSSBorderBorderBottomClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-bottom")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-color", component = GenPagesCSSBorderBorderColorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-color")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-left", component = GenPagesCSSBorderBorderLeftClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-left")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-radius", component = GenPagesCSSBorderBorderRadiusClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-radius")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-right", component = GenPagesCSSBorderBorderRightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-right")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-style", component = GenPagesCSSBorderBorderStyleClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-style")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-top", component = GenPagesCSSBorderBorderTopClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-top")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-width", component = GenPagesCSSBorderBorderWidthClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border-width")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border", component = GenPagesCSSBorderBorderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/complex-border/complex-border", component = GenPagesCSSBorderComplexBorderComplexBorderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border属性组合示例")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/dynamic-border", component = GenPagesCSSBorderDynamicBorderClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border动态修改")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/border/border-update", component = GenPagesCSSBorderBorderUpdateClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "border更新样式")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/box-shadow/box-shadow", component = GenPagesCSSBoxShadowBoxShadowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "box-shadow")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/display/flex", component = GenPagesCSSDisplayFlexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/display/none", component = GenPagesCSSDisplayNoneClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "none")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/align-content", component = GenPagesCSSFlexAlignContentClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "align-content")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/align-items", component = GenPagesCSSFlexAlignItemsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "align-items")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex-basis", component = GenPagesCSSFlexFlexBasisClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex-basis")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex-direction", component = GenPagesCSSFlexFlexDirectionClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex-direction")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex-flow", component = GenPagesCSSFlexFlexFlowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex-flow")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex-grow", component = GenPagesCSSFlexFlexGrowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex-grow")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex-shrink", component = GenPagesCSSFlexFlexShrinkClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex-shrink")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/flex", component = GenPagesCSSFlexFlexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "flex")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/flex/justify-content", component = GenPagesCSSFlexJustifyContentClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "justify-content")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/height", component = GenPagesCSSLayoutHeightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "height")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/max-height", component = GenPagesCSSLayoutMaxHeightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "max-height")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/max-width", component = GenPagesCSSLayoutMaxWidthClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "max-width")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/min-height", component = GenPagesCSSLayoutMinHeightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "min-height")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/min-width", component = GenPagesCSSLayoutMinWidthClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "min-width")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/position", component = GenPagesCSSLayoutPositionClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "position")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/width", component = GenPagesCSSLayoutWidthClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "width")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/z-index", component = GenPagesCSSLayoutZIndexClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "z-index")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/layout/visibility", component = GenPagesCSSLayoutVisibilityClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "visibility")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/margin/margin-bottom", component = GenPagesCSSMarginMarginBottomClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "margin-bottom")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/margin/margin-left", component = GenPagesCSSMarginMarginLeftClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "margin-left")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/margin/margin-right", component = GenPagesCSSMarginMarginRightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "margin-right")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/margin/margin-top", component = GenPagesCSSMarginMarginTopClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "margin-top")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/margin/margin", component = GenPagesCSSMarginMarginClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "margin")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/overflow/overflow", component = GenPagesCSSOverflowOverflowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "overflow")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/padding/padding-bottom", component = GenPagesCSSPaddingPaddingBottomClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "padding-bottom")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/padding/padding-left", component = GenPagesCSSPaddingPaddingLeftClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "padding-left")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/padding/padding-right", component = GenPagesCSSPaddingPaddingRightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "padding-right")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/padding/padding-top", component = GenPagesCSSPaddingPaddingTopClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "padding-top")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/padding/padding", component = GenPagesCSSPaddingPaddingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "padding")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/color", component = GenPagesCSSTextColorClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "color")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/font-family", component = GenPagesCSSTextFontFamilyClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "font-family")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/font-size", component = GenPagesCSSTextFontSizeClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "font-size")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/font-style", component = GenPagesCSSTextFontStyleClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "font-style")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/font-weight", component = GenPagesCSSTextFontWeightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "font-weight")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/letter-spacing", component = GenPagesCSSTextLetterSpacingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "letter-spacing")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/font-family-icon", component = GenPagesCSSTextFontFamilyIconClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "font-family: uni-icon")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/line-height", component = GenPagesCSSTextLineHeightClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "line-height")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/text-align", component = GenPagesCSSTextTextAlignClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "text-align")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/text-overflow", component = GenPagesCSSTextTextOverflowClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "text-overflow")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/text/text-decoration-line", component = GenPagesCSSTextTextDecorationLineClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "text-decoration-line")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/transition/transition", component = GenPagesCSSTransitionTransitionClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "transition")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/pointer-events/pointer-events", component = GenPagesCSSPointerEventsPointerEventsClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "pointer-events")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/transform/translate", component = GenPagesCSSTransformTranslateClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "translate")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/transform/scale", component = GenPagesCSSTransformScaleClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "scale")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/transform/rotate", component = GenPagesCSSTransformRotateClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "rotate")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/variable/variable", component = GenPagesCSSVariableVariableClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "css 变量")));
    __uniRoutes.push(UniPageRoute(path = "pages/CSS/overflow/overflow-visible-event", component = GenPagesCSSOverflowOverflowVisibleEventClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "overflow-visible-event")));
}
val __uniTabBar: Map<String, Any?>? = utsMapOf("color" to "@tabBarColor", "selectedColor" to "@tabBarSelectedColor", "borderStyle" to "@tabBarBorderStyle", "backgroundColor" to "@tabBarBackgroundColor", "list" to utsArrayOf(
    utsMapOf("pagePath" to "pages/tabBar/component", "iconPath" to "@tabBarComponentIconPath", "selectedIconPath" to "@tabBarComponentSelectedIconPath", "text" to "组件"),
    utsMapOf("pagePath" to "pages/tabBar/API", "iconPath" to "@tabBarAPIIconPath", "selectedIconPath" to "@tabBarAPISelectedIconPath", "text" to "接口"),
    utsMapOf("pagePath" to "pages/tabBar/CSS", "iconPath" to "@tabBarCSSIconPath", "selectedIconPath" to "@tabBarCSSSelectedIconPath", "text" to "CSS"),
    utsMapOf("pagePath" to "pages/tabBar/template", "iconPath" to "@tabBarTemplateIconPath", "selectedIconPath" to "@tabBarTemplateSelectedIconPath", "text" to "模板")
));
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/tabBar/component", "style" to utsMapOf("navigationBarTitleText" to "内置组件", "backgroundColorContent" to "#f8f8f8"));
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/tabBar/component";
    __uniConfig.globalStyle = utsMapOf("pageOrientation" to "portrait", "navigationBarTitleText" to "Hello uniapp x", "navigationBarTextStyle" to "@navigationBarTextStyle", "navigationBarBackgroundColor" to "@navigationBarBackgroundColor", "backgroundColorContent" to "@backgroundColorContent", "backgroundColor" to "@backgroundColor", "backgroundTextStyle" to "@backgroundTextStyle");
    __uniConfig.getTabBarConfig = fun(): Map<String, Any>? {
        return utsMapOf("color" to "@tabBarColor", "selectedColor" to "@tabBarSelectedColor", "borderStyle" to "@tabBarBorderStyle", "backgroundColor" to "@tabBarBackgroundColor", "list" to utsArrayOf(
            utsMapOf("pagePath" to "pages/tabBar/component", "iconPath" to "@tabBarComponentIconPath", "selectedIconPath" to "@tabBarComponentSelectedIconPath", "text" to "组件"),
            utsMapOf("pagePath" to "pages/tabBar/API", "iconPath" to "@tabBarAPIIconPath", "selectedIconPath" to "@tabBarAPISelectedIconPath", "text" to "接口"),
            utsMapOf("pagePath" to "pages/tabBar/CSS", "iconPath" to "@tabBarCSSIconPath", "selectedIconPath" to "@tabBarCSSSelectedIconPath", "text" to "CSS"),
            utsMapOf("pagePath" to "pages/tabBar/template", "iconPath" to "@tabBarTemplateIconPath", "selectedIconPath" to "@tabBarTemplateSelectedIconPath", "text" to "模板")
        ));
    }
    ;
    __uniConfig.tabBar = __uniConfig.getTabBarConfig();
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = Map();
    __uniConfig.themeConfig = utsMapOf("light" to utsMapOf("navigationBarTextStyle" to "white", "navigationBarBackgroundColor" to "#007AFF", "backgroundColorContent" to "#efeff4", "backgroundColor" to "#efeff4", "backgroundTextStyle" to "dark", "tabBarColor" to "#7A7E83", "tabBarSelectedColor" to "#007AFF", "tabBarBorderStyle" to "black", "tabBarBackgroundColor" to "#F8F8F8", "tabBarComponentIconPath" to "static/component.png", "tabBarComponentSelectedIconPath" to "static/componentHL.png", "tabBarAPIIconPath" to "static/api.png", "tabBarAPISelectedIconPath" to "static/apiHL.png", "tabBarCSSIconPath" to "static/css.png", "tabBarCSSSelectedIconPath" to "static/cssHL.png", "tabBarTemplateIconPath" to "static/template.png", "tabBarTemplateSelectedIconPath" to "static/templateHL.png"), "dark" to utsMapOf("navigationBarTextStyle" to "white", "navigationBarBackgroundColor" to "#1F1F1F", "backgroundColor" to "#1F1F1F", "backgroundColorContent" to "#646464", "backgroundTextStyle" to "light", "tabBarColor" to "#cacaca", "tabBarSelectedColor" to "#007AFF", "tabBarBorderStyle" to "white", "tabBarBackgroundColor" to "#1F1F1F", "tabBarComponentIconPath" to "static/component.png", "tabBarComponentSelectedIconPath" to "static/componentHL.png", "tabBarAPIIconPath" to "static/api.png", "tabBarAPISelectedIconPath" to "static/apiHL.png", "tabBarCSSIconPath" to "static/css.png", "tabBarCSSSelectedIconPath" to "static/cssHL.png", "tabBarTemplateIconPath" to "static/template.png", "tabBarTemplateSelectedIconPath" to "static/templateHL.png"));
    __uniConfig.ready = true;
}
open class UniCloudConfig : io.dcloud.unicloud.InternalUniCloudConfig {
    override var isDev: Boolean = false;
    override var spaceList: String = "[{\"provider\":\"aliyun\",\"spaceName\":\"vercel-alcloud\",\"spaceId\":\"mp-51f7f546-a748-4915-aa6c-dd5f2e6cbf54\",\"clientSecret\":\"6S1BZudEGcP/ZypPkFZp1A==\",\"endpoint\":\"https://api.next.bspapp.com\"}]";
    override var debuggerInfo: String? = null;
    override var secureNetworkEnable: Boolean = false;
    override var secureNetworkConfig: String? = "";
    constructor() : super() {}
}
open class GenUniApp : UniAppImpl() {
    open val vm: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
    open val `$vm`: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
    open var globalData = GenGlobalData();
}
fun getApp(): GenUniApp {
    return getUniApp() as GenUniApp;
}
