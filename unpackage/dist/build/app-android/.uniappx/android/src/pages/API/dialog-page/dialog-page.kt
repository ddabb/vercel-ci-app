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
import io.dcloud.uniapp.extapi.closeDialogPage as uni_closeDialogPage;
import io.dcloud.uniapp.extapi.getSystemInfoSync as uni_getSystemInfoSync;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.openDialogPage as uni_openDialogPage;
open class GenPagesAPIDialogPageDialogPage : BasePage {
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
            console.log("dialogPage parent onLoad");
        }
        , __ins);
        onPageShow(fun() {
            console.log("dialogPage parent onShow");
            uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 10);
        }
        , __ins);
        onReady(fun() {
            console.log("dialogPage parent onReady");
        }
        , __ins);
        onPageHide(fun() {
            console.log("dialogPage parent onHide");
            uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 10);
        }
        , __ins);
        onUnload(fun() {
            console.log("dialogPage parent onUnload");
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        return createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "go-next-page", "onClick" to _ctx.goNextPage), " go next page ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "open-dialog1", "onClick" to _ctx.openDialog1), " open dialog 1 ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "open-dialog1-wrong-path", "onClick" to _ctx.openDialog1WrongPath), " open dialog page 1 with wrong path ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "go-next-page-open-dialog1", "onClick" to _ctx.goNextPageOpenDialog1), " go next page & open dialog1 ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "open-dialog1", "onClick" to _ctx.openDialog3), " open dialog 3 test page style ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "uni-common-mt", "id" to "open-dialog4", "onClick" to _ctx.openDialogWithTriggerParentHide), " openDialog with triggerParentHide ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("text", utsMapOf("class" to "uni-common-mt choose-open-animation-type-title"), "choose open dialogPage animationType"),
            createVNode(_component_radio_group, utsMapOf("class" to "choose-open-animation-type-radio-group", "onChange" to _ctx.handleOpenAnimationType), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                return utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.openAnimationTypeList, fun(item, __key, __index, _cached): Any {
                        return createVNode(_component_radio, utsMapOf("class" to "ml-10 uni-common-mt", "key" to item, "value" to item, "checked" to (_ctx.openAnimationType == item)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                toDisplayString(item)
                            );
                        }
                        ), "_" to 2), 1032, utsArrayOf(
                            "value",
                            "checked"
                        ));
                    }
                    ), 128)
                );
            }
            ), "_" to 1), 8, utsArrayOf(
                "onChange"
            ))
        ));
    }
    open var jest_click_x: Number by `$data`;
    open var jest_click_y: Number by `$data`;
    open var openAnimationType: OpenAnimationType by `$data`;
    open var openAnimationTypeList: UTSArray<String> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("jest_click_x" to -1, "jest_click_y" to -1, "openAnimationType" to "none" as OpenAnimationType, "openAnimationTypeList" to utsArrayOf(
            "auto",
            "none",
            "slide-in-right",
            "slide-in-left",
            "slide-in-top",
            "slide-in-bottom",
            "fade-in",
            "zoom-out",
            "zoom-fade-out"
        ));
    }
    override fun `$initMethods`() {
        this.goNextPage = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/dialog-page/next-page"));
        }
        ;
        this.openDialog1 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-1?name=dialog1", animationType = this.openAnimationType, success = fun(res) {
                console.log("openDialogPage1 success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("openDialogPage1 fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("openDialogPage1 complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.openDialog2 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-2", animationType = this.openAnimationType, disableEscBack = true, success = fun(res) {
                console.log("openDialog2 success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("openDialog2 fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("openDialog2 complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.openDialog1WrongPath = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-11?name=dialog1", success = fun(res) {
                console.log("openDialogPage1 success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("openDialogPage1 fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("openDialogPage1 complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.goNextPageOpenDialog1 = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/dialog-page/next-page", success = fun(_) {
                setTimeout(fun(){
                    uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-1?name=dialog1", animationType = this.openAnimationType, success = fun(res) {
                        console.log("openDialogPage1 success", res);
                        uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                    }
                    , fail = fun(err) {
                        console.log("openDialogPage1 fail", err);
                        uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
                    }
                    , complete = fun(res) {
                        console.log("openDialogPage1 complete", res);
                        uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
                    }
                    ));
                }
                , 2000);
            }
            ));
        }
        ;
        this.closeDialog = fun() {
            uni_closeDialogPage(CloseDialogPageOptions(success = fun(res) {
                console.log("closeDialog success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("closeDialog fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("closeDialog complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.closeSpecifiedDialog = fun(index: Number) {
            val dialogPages = this.`$page`.getDialogPages();
            uni_closeDialogPage(CloseDialogPageOptions(dialogPage = dialogPages[index], success = fun(res) {
                console.log("closeSomeOneDialog success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("closeSomeOneDialog fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("closeSomeOneDialog complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.openDialog4 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-4"));
        }
        ;
        this.openDialogWithTriggerParentHide = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-4?tag=" + Date.now(), triggerParentHide = true, success = fun(res) {
                console.log("openDialogWithTriggerParentHide success", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            , fail = fun(err) {
                console.log("openDialogWithTriggerParentHide fail", err);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 4);
            }
            , complete = fun(res) {
                console.log("openDialogWithTriggerParentHide complete", res);
                uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
            }
            ));
        }
        ;
        this.setLifeCycleNum = fun(value: Number) {
            uni.UNIFB90797.setLifeCycleNum(value);
        }
        ;
        this.getLifeCycleNum = fun(): Number {
            return state.lifeCycleNum;
        }
        ;
        this.jest_OpenDialog1 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-1?name=dialog1"));
        }
        ;
        this.jest_CloseDialog1 = fun() {
            uni_closeDialogPage(CloseDialogPageOptions());
        }
        ;
        this.jest_getTapPoint = fun() {
            val systemInfo = uni_getSystemInfoSync();
            var ratio: Number = 1;
            if (systemInfo.platform == "android") {
                ratio = systemInfo.devicePixelRatio;
            }
            this.jest_click_x = systemInfo.screenWidth / 2 * ratio;
            this.jest_click_y = systemInfo.statusBarHeight * ratio + 10;
        }
        ;
        this.openDialog2ForTest = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-2"));
        }
        ;
        this.closeDialog2ForTest = fun() {
            uni_closeDialogPage(CloseDialogPageOptions());
        }
        ;
        this.setPageStyleForTest = fun(style: UTSJSONObject) {
            val pages = this.`$page`.getDialogPages();
            if (pages.length > 0) {
                pages[pages.length - 1].setPageStyle(style);
            }
        }
        ;
        this.openDialog3 = fun() {
            uni_openDialogPage(OpenDialogPageOptions(url = "/pages/API/dialog-page/dialog-3", animationType = this.openAnimationType));
        }
        ;
        this.handleOpenAnimationType = fun(e: RadioGroupChangeEvent) {
            this.openAnimationType = e.detail.value as OpenAnimationType;
        }
        ;
        this.getDialogPage = fun(): UniPage? {
            val dialogPages = this.`$page`.getDialogPages();
            return if (dialogPages.length > 0) {
                dialogPages[0];
            } else {
                null;
            }
            ;
        }
        ;
        this.dialogPageCheckGetDialogPages = fun(): Boolean {
            val dialogPage = this.getDialogPage()!!;
            val dialogPages = dialogPage.getDialogPages();
            val res = dialogPages.length == 0;
            return res;
        }
        ;
        this.dialogPageGetPageStyle = fun(): UTSJSONObject {
            val dialogPage = this.getDialogPage()!!;
            return dialogPage.getPageStyle();
        }
        ;
        this.dialogPageSetPageStyle = fun() {
            val dialogPage = this.getDialogPage()!!;
            dialogPage.setPageStyle(object : UTSJSONObject() {
                var backgroundColorContent = "red"
            });
        }
        ;
        this.dialogPageCheckGetElementById = fun(): Boolean {
            val dialogPage = this.getDialogPage()!!;
            val element = dialogPage.getElementById("dialog1-go-next-page");
            var res = element != null;
            return res;
        }
        ;
        this.dialogCheckGetAndroidView = fun(): Boolean {
            val dialogPage = this.getDialogPage()!!;
            val androidView = dialogPage.getAndroidView<android.view.View>();
            val res = androidView != null;
            return res;
        }
        ;
        this.dialogCheckGetIOSView = fun(): Boolean {
            val dialogPage = this.getDialogPage()!!;
            val IOSView = dialogPage.getIOSView();
            val res = IOSView != null;
            return res;
        }
        ;
        this.dialogCheckGetHTMLElement = fun(): Boolean {
            val dialogPage = this.getDialogPage()!!;
            val HTMLView = dialogPage.getHTMLElement();
            val res = HTMLView != null;
            return res;
        }
        ;
    }
    open lateinit var goNextPage: () -> Unit;
    open lateinit var openDialog1: () -> Unit;
    open lateinit var openDialog2: () -> Unit;
    open lateinit var openDialog1WrongPath: () -> Unit;
    open lateinit var goNextPageOpenDialog1: () -> Unit;
    open lateinit var closeDialog: () -> Unit;
    open lateinit var closeSpecifiedDialog: (index: Number) -> Unit;
    open lateinit var openDialog4: () -> Unit;
    open lateinit var openDialogWithTriggerParentHide: () -> Unit;
    open lateinit var setLifeCycleNum: (value: Number) -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
    open lateinit var jest_OpenDialog1: () -> Unit;
    open lateinit var jest_CloseDialog1: () -> Unit;
    open lateinit var jest_getTapPoint: () -> Unit;
    open lateinit var openDialog2ForTest: () -> Unit;
    open lateinit var closeDialog2ForTest: () -> Unit;
    open lateinit var setPageStyleForTest: (style: UTSJSONObject) -> Unit;
    open lateinit var openDialog3: () -> Unit;
    open lateinit var handleOpenAnimationType: (e: RadioGroupChangeEvent) -> Unit;
    open lateinit var getDialogPage: () -> UniPage?;
    open lateinit var dialogPageCheckGetDialogPages: () -> Boolean;
    open lateinit var dialogPageGetPageStyle: () -> UTSJSONObject;
    open lateinit var dialogPageSetPageStyle: () -> Unit;
    open lateinit var dialogPageCheckGetElementById: () -> Boolean;
    open lateinit var dialogCheckGetAndroidView: () -> Boolean;
    open lateinit var dialogCheckGetIOSView: () -> Boolean;
    open lateinit var dialogCheckGetHTMLElement: () -> Boolean;
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
                return utsMapOf("ml-10" to padStyleMapOf(utsMapOf("marginLeft" to 10)), "choose-open-animation-type-title" to padStyleMapOf(utsMapOf("fontWeight" to "bold")), "choose-open-animation-type-radio-group" to padStyleMapOf(utsMapOf("flexDirection" to "row", "flexWrap" to "wrap")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
