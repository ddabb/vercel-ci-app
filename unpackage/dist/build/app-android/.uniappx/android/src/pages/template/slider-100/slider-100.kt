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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
open class GenPagesTemplateSlider100Slider100 : BasePage {
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
            this.safeAreaInsetsBottom = uni_getWindowInfo().safeAreaInsets.bottom;
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_slider = resolveComponent("slider");
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("scroll-view", utsMapOf("class" to "page"), utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                    "title"
                )),
                createElementVNode("view", utsMapOf("class" to "grid-view"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(100, fun(_, index, __index, _cached): Any {
                        return createVNode(_component_slider, utsMapOf("ref_for" to true, "ref" to "slider", "class" to "slider", "key" to index, "onChanging" to _ctx.sliderChanging, "onChange" to _ctx.sliderChange, "value" to _ctx.sliderValue, "block-size" to 20, "show-value" to true), null, 8, utsArrayOf(
                            "onChanging",
                            "onChange",
                            "value"
                        ));
                    }
                    ), 64)
                ))
            )),
            createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to _ctx.safeAreaInsetsBottom))), null, 4)
        ), 64);
    }
    open var title: String by `$data`;
    open var sliderValue: Number by `$data`;
    open var safeAreaInsetsBottom: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "sliderx100通信性能测试(小程序卡为正常)", "sliderValue" to 50, "safeAreaInsetsBottom" to 0);
    }
    override fun `$initMethods`() {
        this.sliderChange = fun(e: UniSliderChangeEvent) {
            this.updateSliderValue(e.detail.value);
        }
        ;
        this.sliderChanging = fun(e: UniSliderChangeEvent) {
            this.updateSliderValue(e.detail.value);
        }
        ;
        this.updateSliderValue = fun(value: Number) {
            (this.`$refs`["slider"] as UTSArray<UniSliderElement>).forEach(fun(item){
                item.value = value;
            }
            );
        }
        ;
    }
    open lateinit var sliderChange: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var sliderChanging: (e: UniSliderChangeEvent) -> Unit;
    open lateinit var updateSliderValue: (value: Number) -> Unit;
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("flex" to 1)), "grid-view" to padStyleMapOf(utsMapOf("flexDirection" to "row", "flexWrap" to "wrap")), "slider" to padStyleMapOf(utsMapOf("width" to "25%", "marginTop" to 1, "marginLeft" to 0, "marginRight" to 0, "marginBottom" to 1)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
