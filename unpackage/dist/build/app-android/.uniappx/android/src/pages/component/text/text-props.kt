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
open class GenPagesComponentTextTextProps : BasePage {
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
        return createElementVNode("scroll-view", utsMapOf("class" to "page-scroll-view"), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-title-text"), "text相关属性示例")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "根据宽度自动折行")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", null, toDisplayString(_ctx.multiLineText), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "\\n换行")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", null, "\n 换行"),
                    createElementVNode("text", null, "\\n 换行"),
                    createElementVNode("text", null, "\\\n 换行"),
                    createElementVNode("text", null, "\n 换行 \\n 换行 \\\n 换行 \\\\n 换行 \\\\\n 换行"),
                    createElementVNode("text", utsMapOf("space" to "nbsp"), "HBuilderX，轻巧、极速，极客编辑器;\nuni-app x，终极跨平台方案;")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "截断（clip）")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-flex-item", "style" to normalizeStyle(utsMapOf("width" to "100%", "text-overflow" to "clip", "white-space" to "nowrap"))), toDisplayString(_ctx.multiLineText), 5)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "截断（ellipsis）")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-flex-item", "style" to normalizeStyle(utsMapOf("width" to "100%", "text-overflow" to "ellipsis", "white-space" to "nowrap"))), toDisplayString(_ctx.multiLineText), 5)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "selectable")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("selectable" to true), toDisplayString(_ctx.singleLineText), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "space"),
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "依次为nbsp ensp emsp效果")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("space" to "nbsp"), toDisplayString(_ctx.singleLineText), 1),
                    createElementVNode("text", utsMapOf("space" to "ensp"), toDisplayString(_ctx.singleLineText), 1),
                    createElementVNode("text", utsMapOf("space" to "emsp"), toDisplayString(_ctx.singleLineText), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "decode"),
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "依次为lt gt amp apos nbsp ensp emsp效果")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("decode" to true), "< > & '"),
                    createElementVNode("text", utsMapOf("decode" to true), "uni-app x，终极跨平台方案"),
                    createElementVNode("text", utsMapOf("decode" to true), "uni-app x，终极跨平台方案"),
                    createElementVNode("text", utsMapOf("decode" to true), "uni-app x，终极跨平台方案")
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "嵌套1")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", null, utsArrayOf(
                        "一级节点黑色 ",
                        createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to "red", "background-color" to "yellow"))), utsArrayOf(
                            "二级节点红色且背景色黄色 ",
                            createElementVNode("text", null, "App三级节点不继承二级的颜色")
                        ), 4),
                        createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "50px"))), "二级节点大字体", 4)
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "嵌套2")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", null, utsArrayOf(
                        createElementVNode("text", null, "文字应居中显示")
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-title"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "uni-subtitle-text"), "padding和border")
                )),
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text-padding-border"), "hello uni-app x"),
                    createElementVNode("text", utsMapOf("class" to "text-padding-border", "style" to normalizeStyle(utsMapOf("width" to "200px"))), "hello uni-app x", 4),
                    createElementVNode("text", utsMapOf("class" to "text-padding-border", "style" to normalizeStyle(utsMapOf("height" to "100px"))), "hello uni-app x", 4),
                    createElementVNode("text", utsMapOf("class" to "text-padding-border", "style" to normalizeStyle(utsMapOf("width" to "200px", "height" to "100px"))), "hello uni-app x", 4)
                )),
                if (isTrue(_ctx.autoTest)) {
                    createElementVNode("view", utsMapOf("key" to 0), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-row"), utsArrayOf(
                            createElementVNode("text", utsMapOf("id" to "empty-text"))
                        )),
                        createElementVNode("view", utsMapOf("class" to "uni-row"), utsArrayOf(
                            createElementVNode("text", utsMapOf("id" to "empty-text2"), toDisplayString(_ctx.emptyText), 1)
                        )),
                        createElementVNode("view", utsMapOf("class" to "uni-row"), utsArrayOf(
                            createElementVNode("text", utsMapOf("id" to "empty-text3", "style" to normalizeStyle(utsMapOf("width" to "100px", "height" to "100px"))), toDisplayString(_ctx.emptyText), 5)
                        )),
                        createElementVNode("text", null, utsArrayOf(
                            "一级节点文本 ",
                            createElementVNode("text", null, utsArrayOf(
                                "二级节点文本 ",
                                createElementVNode("text", utsMapOf("id" to "nested-text"), toDisplayString(_ctx.nestedText), 1)
                            ))
                        )),
                        createElementVNode("text", utsMapOf("id" to "height-text", "style" to normalizeStyle(utsMapOf("height" to "50px"))), toDisplayString(_ctx.heightText), 5)
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
            ))
        ));
    }
    open var title: String by `$data`;
    open var multiLineText: String by `$data`;
    open var singleLineText: String by `$data`;
    open var autoTest: Boolean by `$data`;
    open var nestedText: String by `$data`;
    open var emptyText: String by `$data`;
    open var heightText: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "text-props", "multiLineText" to "HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言；HBuilderX，轻巧、极速，极客编辑器；uni-app x，终极跨平台方案；uts，大一统语言", "singleLineText" to "uni-app x，终极跨平台方案", "autoTest" to false, "nestedText" to "三级节点文本", "emptyText" to "空文本", "heightText" to "设置高度文本");
    }
    override fun `$initMethods`() {
        this.setNestedText = fun() {
            this.nestedText = "修改三级节点文本";
        }
        ;
        this.setEmptyText = fun() {
            this.emptyText = "";
        }
        ;
        this.setHeightText = fun() {
            this.heightText = "修改设置高度文本";
        }
        ;
    }
    open lateinit var setNestedText: () -> Unit;
    open lateinit var setEmptyText: () -> Unit;
    open lateinit var setHeightText: () -> Unit;
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
                return utsMapOf("text-box" to padStyleMapOf(utsMapOf("marginBottom" to 20, "paddingTop" to 20, "paddingRight" to 0, "paddingBottom" to 20, "paddingLeft" to 0, "backgroundColor" to "#ffffff", "justifyContent" to "center", "alignItems" to "center")), "text" to padStyleMapOf(utsMapOf("fontSize" to 15, "color" to "#353535", "lineHeight" to "27px", "textAlign" to "center")), "text-padding-border" to padStyleMapOf(utsMapOf("marginTop" to 5, "paddingTop" to 20, "paddingRight" to 20, "paddingBottom" to 20, "paddingLeft" to 20, "borderWidth" to 5, "borderStyle" to "solid", "borderColor" to "#FF0000", "textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
