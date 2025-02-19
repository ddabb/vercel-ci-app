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
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesAPILoadFontFaceLoadFontFace : BasePage {
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
            uni_loadFontFace(LoadFontFaceOptions(global = true, family = "UniFontFamily", source = "url('/static/font/uni.ttf')", success = fun(_) {
                console.log("global loadFontFace uni.ttf success");
            }
            , fail = fun(error) {
                console.warn("global loadFontFace uni.ttf fail", error.errMsg);
            }
            ));
            uni_loadFontFace(LoadFontFaceOptions(family = "UniFontFamily2", source = "url(data:font/ttf;charset=utf-8;base64,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)", success = fun(_) {
                console.log("loadFontFace uni.ttf(base64 format) success");
            }
            , fail = fun(error) {
                console.warn("loadFontFace uni.ttf(base64 format) fail", error.errMsg);
            }
            ));
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiTTF", source = "url('https://qiniu-web-assets.dcloud.net.cn/uni-app-x/static/font/AlimamaDaoLiTi.ttf')", success = fun(_) {
                console.log("loadFontFace Remote AlimamaDaoLiTi.ttf success");
            }
            , fail = fun(error) {
                console.warn("loadFontFace Remote AlimamaDaoLiTi.ttf fail", error.errMsg);
            }
            ));
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiOTF", source = "url('/static/font/AlimamaDaoLiTi.otf')", success = fun(_) {
                console.log("loadFontFace AlimamaDaoLiTi.otf success");
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.otf fail", error.errMsg);
            }
            ));
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiWOFF", source = "url('/static/font/AlimamaDaoLiTi.woff')", success = fun(_) {
                console.log("loadFontFace AlimamaDaoLiTi.woff success");
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.woff fail", error.errMsg);
            }
            ));
            uni_loadFontFace(LoadFontFaceOptions(family = "AlimamaDaoLiTiWOFF2", source = "url('/static/font/AlimamaDaoLiTi.woff2')", success = fun(_) {
                console.log("loadFontFace AlimamaDaoLiTi.woff2 success");
            }
            , fail = fun(error) {
                console.warn("loadFontFace AlimamaDaoLiTi.woff2 fail", error.errMsg);
            }
            ));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "loadFontFace")),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "font-size-20"), "全局加载字体："),
                createElementVNode("text", utsMapOf("class" to "font-size-20 line-height-40", "style" to normalizeStyle(utsMapOf("font-family" to "UniFontFamily"))), "font-family: uni.ttf", 4),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row"))), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "font-size-20", "style" to normalizeStyle(utsMapOf("font-family" to "UniFontFamily"))), toDisplayString(_ctx.uniIcon1), 5),
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "5px", "margin-right" to "20px", "line-height" to "22px"))), "\\ue100", 4),
                    createElementVNode("text", utsMapOf("class" to "font-size-20", "style" to normalizeStyle(utsMapOf("font-family" to "UniFontFamily"))), toDisplayString(_ctx.uniIcon2), 5),
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "5px", "line-height" to "22px"))), "\\ue101", 4)
                ), 4),
                createElementVNode("text", utsMapOf("class" to "uni-common-mt font-size-20"), "非全局加载字体："),
                createElementVNode("text", utsMapOf("class" to "font-size-20 line-height-40"), "font-family: uni.ttf(base64格式)"),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex-direction" to "row"))), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "font-size-20", "style" to normalizeStyle(utsMapOf("font-family" to "UniFontFamily2"))), toDisplayString(_ctx.uniIcon3), 5),
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "5px", "margin-right" to "20px", "line-height" to "22px"))), "\\ue102", 4)
                ), 4),
                createElementVNode("text", utsMapOf("class" to "font-size-20 line-height-40", "style" to normalizeStyle(utsMapOf("font-family" to "AlimamaDaoLiTiTTF"))), "font-family: 阿里妈妈刀隶体-ttf (网络字体下载后生效)", 4),
                createElementVNode("text", utsMapOf("class" to "font-size-20 line-height-40", "style" to normalizeStyle(utsMapOf("font-family" to "AlimamaDaoLiTiOTF"))), "font-family: 阿里妈妈刀隶体-otf", 4),
                createElementVNode("text", utsMapOf("class" to "item", "style" to normalizeStyle(utsMapOf("font-family" to "AlimamaDaoLiTiWOFF"))), "font-family: 阿里妈妈刀隶体-woff", 4),
                createElementVNode("text", utsMapOf("class" to "item", "style" to normalizeStyle(utsMapOf("font-family" to "AlimamaDaoLiTiWOFF2"))), "font-family: 阿里妈妈刀隶体-woff2", 4),
                createElementVNode("button", utsMapOf("class" to "uni-btn", "onClick" to _ctx.navigateToChild), "跳转子页面测试字体生效范围", 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 64);
    }
    open var uniIcon1: String by `$data`;
    open var uniIcon2: String by `$data`;
    open var uniIcon3: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("uniIcon1" to "\ue100", "uniIcon2" to "\ue101", "uniIcon3" to "\ue102");
    }
    override fun `$initMethods`() {
        this.navigateToChild = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/API/load-font-face/load-font-face-child"));
        }
        ;
    }
    open lateinit var navigateToChild: () -> Unit;
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
                return utsMapOf("font-size-20" to padStyleMapOf(utsMapOf("fontSize" to 20)), "line-height-40" to padStyleMapOf(utsMapOf("lineHeight" to "40px")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
