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
open class GenPagesTemplateLongListLongListPage : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {
            if (this.preload) {
                this.loadData(null);
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_uni_loading = resolveEasyComponent("uni-loading", GenUniModulesUniLoadingComponentsUniLoadingUniLoadingClass);
        return createElementVNode("list-view", utsMapOf("id" to _ctx.id, "class" to "list", "rebound" to false, "scroll-y" to true, "custom-nested-scroll" to true, "onScrolltolower" to fun(){
            _ctx.loadData(null);
        }
        , "associative-container" to "nested-scroll-view"), utsArrayOf(
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.dataList, fun(item, _, __index, _cached): Any {
                return createElementVNode("list-item", utsMapOf("class" to "list-item", "key" to item.plugin_id, "type" to "10"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "list-item-icon"), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "list-item-icon-image", "src" to item.plugin_img_link), null, 8, utsArrayOf(
                            "src"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "list-item-fill"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "flex-row"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "title"), toDisplayString(item.plugin_name), 1)
                        )),
                        createElementVNode("view", null, utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "description-text"), toDisplayString(item.plugin_intro), 1)
                        )),
                        createElementVNode("text", utsMapOf("class" to "icon-star"), toDisplayString(_ctx.convertToStarUnicode(item.score)), 1),
                        createElementVNode("view", utsMapOf("class" to "tag-list"), utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList(item.tags, fun(item2, index2, __index, _cached): Any {
                                return createElementVNode("text", utsMapOf("class" to "tag-item", "key" to index2), toDisplayString(item2), 1);
                            }
                            ), 128)
                        )),
                        createElementVNode("view", utsMapOf("class" to "flex-row update-date"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "update-date-text"), "更新日期"),
                            createElementVNode("text", utsMapOf("class" to "update-date-value"), toDisplayString(item.update_date), 1),
                            createElementVNode("text", utsMapOf("class" to "author"), toDisplayString(item.author_name), 1)
                        ))
                    ))
                ));
            }
            ), 128),
            createElementVNode("list-item", utsMapOf("class" to "loading"), utsArrayOf(
                createVNode(_component_uni_loading, utsMapOf("loading" to _ctx.loading, "color" to "#999", "text" to _ctx.loadingText), null, 8, utsArrayOf(
                    "loading",
                    "text"
                ))
            ))
        ), 40, utsArrayOf(
            "id",
            "onScrolltolower"
        ));
    }
    open var type: String by `$props`;
    open var preload: Boolean by `$props`;
    open var id: String by `$props`;
    open var loading: Boolean by `$data`;
    open var dataList: UTSArray<ListItem2> by `$data`;
    open var isEnded: Boolean by `$data`;
    open var loadingError: String by `$data`;
    open var currentPage: Number by `$data`;
    open var loadingText: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("loading" to false, "dataList" to utsArrayOf<ListItem2>(), "isEnded" to false, "loadingError" to "", "currentPage" to 1, "loadingText" to computed<String>(fun(): String {
            if (this.loading) {
                return "加载中...";
            } else if (this.isEnded) {
                return "没有更多了";
            } else if (this.loadingError.length > 0) {
                return this.loadingError;
            } else {
                return "";
            }
        }
        ));
    }
    override fun `$initMethods`() {
        this.refreshData = fun(loadComplete: (() -> Unit)?) {
            this.dataList.length = 0;
            this.currentPage = 1;
            this.loadData(loadComplete);
        }
        ;
        this.loadData = fun(loadComplete: (() -> Unit)?) {
            if (this.loading || this.isEnded) {
                return;
            }
            this.loading = true;
            uni_request<ResponseDataType>(RequestOptions(url = SERVER_URL, data = let {
                object : UTSJSONObject() {
                    var type = it.type
                    var page = it.currentPage
                    var page_size = PAGE_SIZE
                }
            }, success = fun(res){
                val responseData = res.data;
                if (responseData == null) {
                    return;
                }
                this.dataList.push(*responseData.data.toTypedArray());
                if (responseData.data.length == 0) {
                    this.isEnded = true;
                } else {
                    this.currentPage++;
                }
            }
            , fail = fun(err){
                this.loadingError = err.errMsg;
            }
            , complete = fun(_){
                this.loading = false;
                if (loadComplete != null) {
                    loadComplete();
                }
            }
            ));
        }
        ;
        this.convertToStarUnicode = fun(score: Number): String {
            val fill_code = "\ue879";
            val half_code = "\ue87a";
            val null_code = "\ue87b";
            val fillStarCount = parseInt(score / 10 % 10 + "");
            val halfStarCount = if (score % 10 >= 5) {
                1;
            } else {
                0;
            }
            ;
            val nullStarCount = 5 - fillStarCount - halfStarCount;
            var result = "";
            if (fillStarCount > 0) {
                result += fill_code.repeat(fillStarCount);
            }
            if (halfStarCount > 0) {
                result += half_code.repeat(halfStarCount);
            }
            if (nullStarCount > 0) {
                result += null_code.repeat(nullStarCount);
            }
            return result;
        }
        ;
    }
    open lateinit var refreshData: (loadComplete: (() -> Unit)?) -> Unit;
    open lateinit var loadData: (loadComplete: (() -> Unit)?) -> Unit;
    open lateinit var convertToStarUnicode: (score: Number) -> String;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("list" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#ffffff")), "list-item" to padStyleMapOf(utsMapOf("flexDirection" to "row", "marginTop" to 10, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10)), "list-item-icon" to padStyleMapOf(utsMapOf("position" to "relative")), "list-item-icon-image" to padStyleMapOf(utsMapOf("width" to 80, "height" to 80)), "list-item-fill" to padStyleMapOf(utsMapOf("flex" to 1, "marginLeft" to 15)), "description-text" to padStyleMapOf(utsMapOf("fontSize" to 13, "color" to "#666666", "lineHeight" to "19px")), "icon-star" to padStyleMapOf(utsMapOf("fontFamily" to "UtsStarIcons", "fontSize" to 16, "fontStyle" to "normal", "color" to "#ffca3e", "letterSpacing" to 3)), "tag-list" to padStyleMapOf(utsMapOf("flexDirection" to "row", "marginTop" to 5)), "tag-item" to padStyleMapOf(utsMapOf("fontSize" to 12, "backgroundColor" to "#EFF9F0", "color" to "#639069", "borderRadius" to 20, "marginRight" to 5, "paddingTop" to 2, "paddingRight" to 5, "paddingBottom" to 2, "paddingLeft" to 5)), "update-date" to padStyleMapOf(utsMapOf("marginTop" to 10)), "update-date-text" to padStyleMapOf(utsMapOf("fontSize" to 12, "color" to "#888888")), "update-date-value" to padStyleMapOf(utsMapOf("fontSize" to 12, "color" to "#777777", "marginLeft" to 5)), "author" to padStyleMapOf(utsMapOf("fontSize" to 12, "color" to "#008000", "marginLeft" to "auto")), "loading" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingRight" to 30, "paddingBottom" to 30, "paddingLeft" to 30, "alignItems" to "center")), "flex-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "@FONT-FACE" to utsMapOf("0" to utsMapOf("fontFamily" to "UtsStarIcons", "src" to "url('/static/fonts/icon-star.ttf')")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("type" to utsMapOf("type" to "String", "default" to ""), "preload" to utsMapOf("type" to "Boolean", "default" to false), "id" to utsMapOf("type" to "String", "default" to "")));
        var propsNeedCastKeys = utsArrayOf(
            "type",
            "preload",
            "id"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
