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
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesComponentRichTextRichTextComplex : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to "rich-text-complex")),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt", "onClick" to fun(){
                    _ctx.fViewClick("触发父 view click 事件");
                }
                ), utsArrayOf(
                    createElementVNode("rich-text", utsMapOf("nodes" to _ctx.htmlString, "selectable" to true, "onItemclick" to _ctx.itemClick, "onClick" to fun(){
                        _ctx.selfClick("触发 richtext click 事件");
                    }
                    ), null, 40, utsArrayOf(
                        "nodes",
                        "onItemclick",
                        "onClick"
                    ))
                ), 8, utsArrayOf(
                    "onClick"
                ))
            ))
        ), 4);
    }
    open var imageClicked: Boolean by `$data`;
    open var fViewClicked: Boolean by `$data`;
    open var selfClicked: Boolean by `$data`;
    open var htmlString: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("imageClicked" to false, "fViewClicked" to false, "selfClicked" to false, "htmlString" to "<p><a href=\"https://www.dcloud.io/hbuilderx.html\">HBuilderX</a><br/><img src=\"https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png\"></img><h1>HBuilderX，轻巧、极速，极客编辑器</h1><p style=\"color:red;\"><small>HBuilderX，轻巧、极速，极客编辑器 </small><big>HBuilderX，轻巧、极速，极客编辑器</big><strong>HBuilderX，轻巧、极速，极客编辑器</strong><i>HBuilderX，轻巧、极速，极客编辑器 </i><u>HBuilderX，轻巧、极速，极客编辑器</u><del>HBuilderX，轻巧、极速，极客编辑器</del></p><h2>uni-app x，终极跨平台方案</h2>、<p style=\"background-color: yellow;\"><small>uni-app x，终极跨平台方案 </small><big>uni-app x，终极跨平台方案</big><strong>uni-appx，终极跨平台方案 </strong><i>uni-app x，终极跨平台方案 </i><u>uni-app x，终极跨平台方案 </u><del>uni-appx，终极跨平台方案</del></p><h3>uniCloud，js serverless云服务</h3><p style=\"text-decoration: line-through;\"><small>uniCloud，js serverless云服务 </small><big>uniCloud，jsserverless云服务</big><strong>uniCloud，js serverless云服务 </strong><i>uniCloud，js serverless云服务 </i><u>uniCloud，jsserverless云服务</u><del>uniCloud，js serverless云服务</del></p><h4>uts，大一统语言</h4><p style=\"text-align: center;\"><small>uts，大一统语言 </small><big>uts，大一统语言 </big><strong>uts，大一统语言</strong><i>uts，大一统语言</i><u>uts，大一统语言 </u><del>uts，大一统语言</del></p><h5>uniMPSdk，让你的App具备小程序能力</h5><h6>uni-admin，开源、现成的全端管理后台</h6><ul><li style=\"color: red; text-align: left;\">uni-app x，终极跨平台方案</li><li style=\"color: green; text-align: center;\">uni-app x，终极跨平台方案</li><li style=\"color: blue; text-align: right;\">uni-app x，终极跨平台方案</li></ul><a href=\"https://uniapp.dcloud.net.cn\">uni-app</a><br/><img src=\"https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png\"></img></p>");
    }
    override fun `$initMethods`() {
        this.itemClick = fun(e: RichTextItemClickEvent) {
            console.log(JSON.stringify(e.detail));
            var clicktext = "";
            if (e.detail.src != null) {
                clicktext = "点击了图片，src = " + e.detail.src;
                this.imageClicked = true;
            } else if (e.detail.href != null) {
                clicktext = "点击了链接，href = " + e.detail.href;
            }
            uni_showModal(ShowModalOptions(content = clicktext, showCancel = false));
        }
        ;
        this.fViewClick = fun(e: String) {
            console.log(e);
            this.fViewClicked = true;
        }
        ;
        this.selfClick = fun(e: String) {
            console.log(e);
            this.selfClicked = true;
        }
        ;
    }
    open lateinit var itemClick: (e: RichTextItemClickEvent) -> Unit;
    open lateinit var fViewClick: (e: String) -> Unit;
    open lateinit var selfClick: (e: String) -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(), utsArrayOf(
                GenApp.styles
            ))
        };
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
