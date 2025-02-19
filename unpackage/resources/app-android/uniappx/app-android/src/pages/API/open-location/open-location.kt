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
import uts.sdk.modules.uniOpenLocation.OpenLocationOptions as OpenLocationOptions1;
import uts.sdk.modules.uniOpenLocation.openLocation as uni_openLocation;
open class GenPagesAPIOpenLocationOpenLocation : BasePage {
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
        onPageShow(fun() {
            console.log("Page Show");
            uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum + 1);
        }
        , __ins);
        onPageHide(fun() {
            console.log("Page Hide");
            uni.UNIFB90797.setLifeCycleNum(state.lifeCycleNum - 1);
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_form = resolveComponent("form");
        return createElementVNode("view", null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-common-mt"), utsArrayOf(
                createVNode(_component_form, utsMapOf("onSubmit" to _ctx.openLocation), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "uni-list-cell"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-left"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "uni-label"), "经度")
                                )),
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), utsArrayOf(
                                    createElementVNode("input", utsMapOf("modelValue" to _ctx.longitude, "onInput" to fun(`$event`: InputEvent){
                                        _ctx.longitude = looseToNumber(`$event`.detail.value);
                                    }
                                    , "class" to "uni-input", "type" to "text", "disabled" to true), null, 40, utsArrayOf(
                                        "modelValue",
                                        "onInput"
                                    ))
                                ))
                            )),
                            createElementVNode("view", utsMapOf("class" to "uni-list-cell"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-left"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "uni-label"), "纬度")
                                )),
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), utsArrayOf(
                                    createElementVNode("input", utsMapOf("modelValue" to _ctx.latitude, "onInput" to fun(`$event`: InputEvent){
                                        _ctx.latitude = looseToNumber(`$event`.detail.value);
                                    }
                                    , "class" to "uni-input", "type" to "text", "disabled" to true), null, 40, utsArrayOf(
                                        "modelValue",
                                        "onInput"
                                    ))
                                ))
                            )),
                            createElementVNode("view", utsMapOf("class" to "uni-list-cell"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-left"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "uni-label"), "位置名称")
                                )),
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), utsArrayOf(
                                    createElementVNode("input", utsMapOf("modelValue" to _ctx.name, "onInput" to fun(`$event`: InputEvent){
                                        _ctx.name = `$event`.detail.value;
                                    }
                                    , "class" to "uni-input", "type" to "text", "disabled" to true), null, 40, utsArrayOf(
                                        "modelValue",
                                        "onInput"
                                    ))
                                ))
                            )),
                            createElementVNode("view", utsMapOf("class" to "uni-list-cell"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-left"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "uni-label"), "详细位置")
                                )),
                                createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), utsArrayOf(
                                    createElementVNode("input", utsMapOf("modelValue" to _ctx.address, "onInput" to fun(`$event`: InputEvent){
                                        _ctx.address = `$event`.detail.value;
                                    }
                                    , "class" to "uni-input", "type" to "text", "disabled" to true), null, 40, utsArrayOf(
                                        "modelValue",
                                        "onInput"
                                    ))
                                ))
                            ))
                        )),
                        createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "tips"), "注意：需要正确配置地图服务商的Key才能正常显示位置"),
                            createElementVNode("view", utsMapOf("class" to "uni-btn-v uni-common-mt"), utsArrayOf(
                                createElementVNode("button", utsMapOf("type" to "primary", "formType" to "submit"), "查看位置")
                            ))
                        ))
                    );
                }
                ), "_" to 1), 8, utsArrayOf(
                    "onSubmit"
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var longitude: Number by `$data`;
    open var latitude: Number by `$data`;
    open var name: String by `$data`;
    open var address: String by `$data`;
    open var dialogPagesNum: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "openLocation", "longitude" to 116.39747, "latitude" to 39.9085, "name" to "天安门", "address" to "北京市东城区东长安街", "dialogPagesNum" to -1);
    }
    override fun `$initMethods`() {
        this.openLocation = fun() {
            uni_openLocation(OpenLocationOptions1(longitude = this.longitude, latitude = this.latitude, name = this.name, address = this.address));
            setTimeout(fun(){
                this.test();
            }
            , 500);
        }
        ;
        this.test = fun() {
            val pages = getCurrentPages();
            val page = pages[pages.length - 1];
            val dialogPages = page.getDialogPages();
            this.dialogPagesNum = dialogPages.length;
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
    }
    open lateinit var openLocation: () -> Unit;
    open lateinit var test: () -> Unit;
    open lateinit var setLifeCycleNum: (value: Number) -> Unit;
    open lateinit var getLifeCycleNum: () -> Number;
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
                return utsMapOf("uni-list-cell-left" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingRight" to "30rpx", "paddingBottom" to 0, "paddingLeft" to "30rpx")), "tips" to padStyleMapOf(utsMapOf("fontSize" to 12, "marginTop" to 15, "opacity" to 0.8)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
