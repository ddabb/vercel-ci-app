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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenPagesComponentTextText : BasePage {
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
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "text-box"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text"), toDisplayString(_ctx.text), 1)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "type" to "primary", "disabled" to !_ctx.canAdd, "onClick" to _ctx.add), " add line ", 8, utsArrayOf(
                        "disabled",
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "type" to "warn", "disabled" to !_ctx.canRemove, "onClick" to _ctx.remove), " remove line ", 8, utsArrayOf(
                        "disabled",
                        "onClick"
                    )),
                    createElementVNode("button", utsMapOf("class" to "uni-btn", "type" to "primary", "onClick" to _ctx.textProps), " 更多属性示例 ", 8, utsArrayOf(
                        "onClick"
                    ))
                ))
            ))
        ), 4);
    }
    open var title: String by `$data`;
    open var texts: UTSArray<String> by `$data`;
    open var text: String by `$data`;
    open var canAdd: Boolean by `$data`;
    open var canRemove: Boolean by `$data`;
    open var extraLine: UTSArray<String> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "text", "texts" to utsArrayOf<String>("HBuilderX，轻巧、极速，极客编辑器", "uni-app x，终极跨平台方案", "uniCloud，js serverless云服务", "uts，大一统语言", "uniMPSdk，让你的App具备小程序能力", "uni-admin，开源、现成的全端管理后台", "uni-id，开源、全端的账户中心", "uni-pay，开源、云端一体、全平台的支付", "uni-ai，聚合ai能力", "uni-cms，开源、云端一体、全平台的内容管理平台", "uni-im，开源、云端一体、全平台的im即时消息", "uni统计，开源、完善、全平台的统计报表", "......"), "text" to "", "canAdd" to true, "canRemove" to false, "extraLine" to utsArrayOf<String>());
    }
    override fun `$initMethods`() {
        this.add = fun() {
            this.extraLine.push(this.texts[this.extraLine.length % 12]);
            this.text = this.extraLine.join("\n");
            this.canAdd = this.extraLine.length < 12;
            this.canRemove = this.extraLine.length > 0;
        }
        ;
        this.remove = fun() {
            if (this.extraLine.length > 0) {
                this.extraLine.pop();
                this.text = this.extraLine.join("\n");
                this.canAdd = this.extraLine.length < 12;
                this.canRemove = this.extraLine.length > 0;
            }
        }
        ;
        this.textProps = fun() {
            uni_navigateTo(NavigateToOptions(url = "/pages/component/text/text-props"));
        }
        ;
    }
    open lateinit var add: () -> Unit;
    open lateinit var remove: () -> Unit;
    open lateinit var textProps: () -> Unit;
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
                return utsMapOf("text-box" to padStyleMapOf(utsMapOf("marginBottom" to 20, "paddingTop" to 20, "paddingRight" to 0, "paddingBottom" to 20, "paddingLeft" to 0, "display" to "flex", "minHeight" to 150, "backgroundColor" to "#ffffff", "justifyContent" to "center", "alignItems" to "center")), "text" to padStyleMapOf(utsMapOf("fontSize" to 15, "color" to "#353535", "lineHeight" to "27px", "textAlign" to "center")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
