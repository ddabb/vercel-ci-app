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
import io.dcloud.uniapp.extapi.chooseImage as uni_chooseImage;
import io.dcloud.uniapp.extapi.previewImage as uni_previewImage;
open class GenPagesAPIPreviewImagePreviewImage : BasePage {
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
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        val _component_checkbox = resolveComponent("checkbox");
        val _component_checkbox_group = resolveComponent("checkbox-group");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding-left" to "8px", "padding-right" to "8px"))), utsArrayOf(
                createElementVNode("view", null, utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text-desc"), "图片指示器样式"),
                    createVNode(_component_radio_group, utsMapOf("class" to "cell-ct", "style" to normalizeStyle(utsMapOf("background-color" to "white")), "onChange" to _ctx.onIndicatorChanged), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.indicator, fun(item, index, __index, _cached): Any {
                                return createElementVNode("view", utsMapOf("class" to "indicator-it", "key" to item.value), utsArrayOf(
                                    createVNode(_component_radio, utsMapOf("disabled" to _ctx.isWeb, "checked" to (index == 0), "value" to item.value), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                        return utsArrayOf(
                                            toDisplayString(item.name)
                                        );
                                    }
                                    ), "_" to 2), 1032, utsArrayOf(
                                        "disabled",
                                        "checked",
                                        "value"
                                    ))
                                ));
                            }
                            ), 128)
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "style",
                        "onChange"
                    ))
                )),
                createElementVNode("view", null, utsArrayOf(
                    createVNode(_component_checkbox_group, utsMapOf("onChange" to _ctx.onCheckboxChange, "style" to normalizeStyle(utsMapOf("margin-top" to "16px", "margin-bottom" to "16px", "margin-left" to "8px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createVNode(_component_checkbox, utsMapOf("disabled" to _ctx.isWeb, "checked" to _ctx.isLoop, "style" to normalizeStyle(utsMapOf("margin-right" to "15px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    "循环播放"
                                );
                            }
                            ), "_" to 1), 8, utsArrayOf(
                                "disabled",
                                "checked",
                                "style"
                            ))
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onChange",
                        "style"
                    ))
                )),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("background-color" to "white"))), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text-desc"), "点击图片开始预览"),
                    createElementVNode("view", utsMapOf("class" to "cell-ct", "style" to normalizeStyle(utsMapOf("margin" to "8px"))), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.imageList, fun(image, index, __index, _cached): Any {
                            return createElementVNode("view", utsMapOf("class" to "cell cell-choose-image", "key" to index), utsArrayOf(
                                createElementVNode("image", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "100px", "height" to "100px")), "mode" to "aspectFit", "src" to image, "onClick" to fun(){
                                    _ctx.previewImage(index);
                                }
                                ), null, 12, utsArrayOf(
                                    "src",
                                    "onClick"
                                ))
                            ));
                        }
                        ), 128),
                        createElementVNode("image", utsMapOf("class" to "cell cell-choose-image", "src" to "/static/plus.png", "onClick" to _ctx.chooseImage), utsArrayOf(
                            createElementVNode("view")
                        ), 8, utsArrayOf(
                            "onClick"
                        ))
                    ), 4)
                ), 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "8px"))), utsArrayOf(
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to "black", "font-size" to "18px", "margin-bottom" to "4px"))), "注意事项:", 4),
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "17px", "margin-left" to "4px", "color" to "darkgray"))), "1、indicator属性仅App平台支持。", 4),
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "17px", "margin-left" to "4px", "color" to "darkgray"))), "2、Web平台不支持loop属性。", 4)
                ), 4)
            ), 4)
        ), 4);
    }
    open var imageList: UTSArray<String> by `$data`;
    open var indicator: UTSArray<ItemType7> by `$data`;
    open var currentIndicator: Indicator by `$data`;
    open var isWeb: Boolean by `$data`;
    open var isLoop: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("imageList" to utsArrayOf(
            "https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png",
            "/static/uni.png"
        ), "indicator" to utsArrayOf<ItemType7>(ItemType7(value = "default", name = "圆点"), ItemType7(value = "number", name = "数字"), ItemType7(value = "none", name = "不显示")), "currentIndicator" to "default" as Indicator, "isWeb" to false, "isLoop" to true);
    }
    override fun `$initMethods`() {
        this.previewImage = fun(index: Number) {
            uni_previewImage(PreviewImageOptions(urls = this.imageList, current = index, indicator = this.currentIndicator, loop = this.isLoop));
        }
        ;
        this.chooseImage = fun() {
            uni_chooseImage(ChooseImageOptions(sourceType = utsArrayOf(
                "album"
            ), success = fun(e){
                this.imageList = this.imageList.concat(e.tempFilePaths);
            }
            , fail = fun(_) {}));
        }
        ;
        this.onIndicatorChanged = fun(e: UniRadioGroupChangeEvent) {
            this.currentIndicator = e.detail.value as Indicator;
        }
        ;
        this.onCheckboxChange = fun(_: UniCheckboxGroupChangeEvent) {
            this.isLoop = !this.isLoop;
        }
        ;
    }
    open lateinit var previewImage: (index: Number) -> Unit;
    open lateinit var chooseImage: () -> Unit;
    open lateinit var onIndicatorChanged: (e: UniRadioGroupChangeEvent) -> Unit;
    open lateinit var onCheckboxChange: (_: UniCheckboxGroupChangeEvent) -> Unit;
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
                return utsMapOf("text-desc" to padStyleMapOf(utsMapOf("marginTop" to 16, "marginLeft" to 8, "marginBottom" to 16, "fontWeight" to "bold")), "cell-ct" to padStyleMapOf(utsMapOf("display" to "flex", "flexWrap" to "wrap", "flexDirection" to "row")), "cell" to padStyleMapOf(utsMapOf("marginLeft" to 3, "marginRight" to 3, "width" to 100, "height" to 100)), "cell-choose-image" to padStyleMapOf(utsMapOf("borderWidth" to 1, "borderStyle" to "solid", "borderColor" to "#D3D3D3")), "indicator-it" to padStyleMapOf(utsMapOf("marginTop" to 8, "marginRight" to 8, "marginBottom" to 8, "marginLeft" to 8)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
