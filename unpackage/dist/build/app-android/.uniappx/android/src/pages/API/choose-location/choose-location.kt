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
import io.dcloud.uniapp.extapi.chooseLocation as uni_chooseLocation;
open class GenPagesAPIChooseLocationChooseLocation : BasePage {
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
        val _component_boolean_data = resolveEasyComponent("boolean-data", GenComponentsBooleanDataBooleanDataClass);
        return createElementVNode("view", null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-column content"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-hello-text"), "位置信息"),
                    if (isTrue(!_ctx.hasLocation)) {
                        createElementVNode("text", utsMapOf("key" to 0, "class" to "uni-title-text uni-common-mt"), "未选择位置");
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (isTrue(_ctx.hasLocation)) {
                        createElementVNode("view", utsMapOf("key" to 1, "style" to normalizeStyle(utsMapOf("align-items" to "center"))), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "uni-common-mt"), toDisplayString(_ctx.locationName), 1),
                            createElementVNode("text", utsMapOf("class" to "uni-common-mt"), toDisplayString(_ctx.locationAddress), 1),
                            if (_ctx.location.latitude.length > 1) {
                                createElementVNode("view", utsMapOf("key" to 0, "class" to "uni-common-mt"), utsArrayOf(
                                    createElementVNode("text", null, "E: " + toDisplayString(_ctx.location.longitude[0]) + "°" + toDisplayString(_ctx.location.longitude[1]) + "′", 1),
                                    createElementVNode("text", null, "\nN: " + toDisplayString(_ctx.location.latitude[0]) + "°" + toDisplayString(_ctx.location.latitude[1]) + "′", 1)
                                ));
                            } else {
                                createCommentVNode("v-if", true);
                            }
                        ), 4);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "tips"), "注意：\n1. Web和App需要正确配置地图服务商的Key并且保证Key的权限和余额足够，才能正常选择位置\n2. 若没有关联uniCloud空间，则只能全屏地图选点，不能根据POI选择位置\n3. payload参数会原样透传给uni-map-co，可用于用户鉴权"),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否指定位置为天安门", "onChange" to _ctx.changeLocationBoolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否携带keyword参数", "onChange" to _ctx.changeKeywordBoolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createVNode(_component_boolean_data, utsMapOf("defaultValue" to false, "title" to "是否携带payload参数", "onChange" to _ctx.changePayloadBoolean), null, 8, utsArrayOf(
                        "onChange"
                    )),
                    createElementVNode("button", utsMapOf("class" to "btn", "type" to "primary", "onClick" to _ctx.chooseLocation), "选择位置", 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "btn", "onClick" to _ctx.clear), "清空", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            ))
        ));
    }
    open var title: String by `$data`;
    open var hasLocation: Boolean by `$data`;
    open var location: Location by `$data`;
    open var locationName: String by `$data`;
    open var locationAddress: String by `$data`;
    open var dialogPagesNum: Number by `$data`;
    open var hoverLocation: Boolean by `$data`;
    open var hoverKeyword: Boolean by `$data`;
    open var hoverPayload: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "chooseLocation", "hasLocation" to false, "location" to Location(latitude = utsArrayOf(), longitude = utsArrayOf()), "locationName" to "", "locationAddress" to "", "dialogPagesNum" to -1, "hoverLocation" to false, "hoverKeyword" to false, "hoverPayload" to false);
    }
    override fun `$initMethods`() {
        this.chooseLocation = fun() {
            var chooseLocationOptions = ChooseLocationOptions(success = fun(res){
                console.log("chooseLocation success", res);
                this.hasLocation = true;
                this.location = this.formatLocation(res.longitude, res.latitude);
                this.locationName = res.name;
                this.locationAddress = res.address;
            }
            );
            if (this.hoverLocation) {
                chooseLocationOptions.latitude = 39.908823;
                chooseLocationOptions.longitude = 116.39747;
            }
            if (this.hoverKeyword) {
                chooseLocationOptions.keyword = "公园";
            }
            if (this.hoverPayload) {
                chooseLocationOptions.payload = object : UTSJSONObject() {
                    var token = "xxx"
                };
            }
            uni_chooseLocation(chooseLocationOptions);
            setTimeout(fun(){
                this.test();
            }
            , 500);
        }
        ;
        this.formatLocation = fun(longitude: Number, latitude: Number): Location {
            val longitudeArr = longitude.toString(10).split(".");
            val latitudeArr = latitude.toString(10).split(".");
            if (longitudeArr.length > 1) {
                longitudeArr[1] = longitudeArr[1].substring(0, 2);
            }
            if (latitudeArr.length > 1) {
                latitudeArr[1] = latitudeArr[1].substring(0, 2);
            }
            return Location(longitude = longitudeArr, latitude = latitudeArr);
        }
        ;
        this.clear = fun() {
            this.hasLocation = false;
        }
        ;
        this.changeLocationBoolean = fun(checked: Boolean) {
            this.hoverLocation = checked;
        }
        ;
        this.changeKeywordBoolean = fun(checked: Boolean) {
            this.hoverKeyword = checked;
        }
        ;
        this.changePayloadBoolean = fun(checked: Boolean) {
            this.hoverPayload = checked;
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
    open lateinit var chooseLocation: () -> Unit;
    open lateinit var formatLocation: (longitude: Number, latitude: Number) -> Location;
    open lateinit var clear: () -> Unit;
    open lateinit var changeLocationBoolean: (checked: Boolean) -> Unit;
    open lateinit var changeKeywordBoolean: (checked: Boolean) -> Unit;
    open lateinit var changePayloadBoolean: (checked: Boolean) -> Unit;
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
                return utsMapOf("page-body-info" to padStyleMapOf(utsMapOf("paddingBottom" to 0, "height" to "440rpx")), "content" to padStyleMapOf(utsMapOf("backgroundImage" to "none", "backgroundColor" to "#FFFFFF", "paddingTop" to "40rpx", "paddingRight" to "40rpx", "paddingBottom" to "40rpx", "paddingLeft" to "40rpx", "alignItems" to "center")), "tips" to padStyleMapOf(utsMapOf("fontSize" to 12, "marginTop" to 15, "marginRight" to 0, "marginBottom" to 15, "marginLeft" to 0, "opacity" to 0.8)), "btn" to padStyleMapOf(utsMapOf("marginTop" to 10)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
