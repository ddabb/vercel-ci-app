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
import io.dcloud.uniapp.extapi.request as uni_request;
open class GenPagesTemplateListNewsDetailDetail : BasePage {
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
        onLoad(fun(event: OnLoadOptions) {
            this.post_id = event["post_id"] ?: "";
            this.cover = event["cover"] ?: "";
            this.title = event["title"] ?: "";
            this.getDetail();
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "banner"), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "banner-img", "src" to _ctx.cover), null, 8, utsArrayOf(
                    "src"
                )),
                createElementVNode("text", utsMapOf("class" to "banner-title"), toDisplayString(_ctx.title), 1)
            )),
            createElementVNode("rich-text", utsMapOf("nodes" to _ctx.htmlNodes, "style" to normalizeStyle(utsMapOf("padding" to "3px"))), null, 12, utsArrayOf(
                "nodes"
            ))
        ), 4);
    }
    open var htmlNodes: String by `$data`;
    open var title: String by `$data`;
    open var cover: String by `$data`;
    open var post_id: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("htmlNodes" to "", "title" to "", "cover" to "", "post_id" to "");
    }
    override fun `$initMethods`() {
        this.getDetail = fun() {
            uni_request<Any>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/news/36kr/" + this.post_id, success = fun(data){
                if (data.statusCode == 200) {
                    val result = data.data as UTSJSONObject;
                    this.htmlNodes = result["content"] as String;
                }
            }
            , fail = fun(_){
                console.log("fail");
            }
            ));
        }
        ;
    }
    open lateinit var getDetail: () -> Unit;
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
                return utsMapOf("banner" to padStyleMapOf(utsMapOf("height" to 180, "overflow" to "hidden", "position" to "relative", "backgroundColor" to "#cccccc")), "banner-img" to padStyleMapOf(utsMapOf("width" to "100%")), "banner-title" to padStyleMapOf(utsMapOf("maxHeight" to 42, "overflow" to "hidden", "position" to "absolute", "left" to 15, "bottom" to 15, "width" to "90%", "fontSize" to 16, "fontWeight" to "400", "lineHeight" to "21px", "color" to "#FFFFFF")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
