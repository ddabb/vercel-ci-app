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
import io.dcloud.uniapp.extapi.request as uni_request;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
open class GenPagesTemplateListNewsListNews : BasePage {
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
            this.getBanner();
            this.getList();
        }
        , __ins);
        onUnload(fun() {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("list-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "refresher-enabled" to "true", "onRefresherrefresh" to _ctx.onRefresherrefresh, "refresher-triggered" to _ctx.refresherTriggered, "enable-back-to-top" to "true"), utsArrayOf(
            createElementVNode("list-item", utsMapOf("class" to "banner", "onClick" to fun(){
                _ctx.bannerClick(_ctx.banner);
            }
            , "type" to "1"), utsArrayOf(
                createElementVNode("image", utsMapOf("class" to "banner-img", "src" to _ctx.banner.cover), null, 8, utsArrayOf(
                    "src"
                )),
                createElementVNode("text", utsMapOf("class" to "banner-title"), toDisplayString(_ctx.banner.title), 1)
            ), 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("sticky-header", null, utsArrayOf(
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("width" to "100%", "height" to "44px", "background-color" to "#f5f5f5", "flex-direction" to "row", "justify-content" to "center", "align-items" to "center"))), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.th_item, fun(name, index, __index, _cached): Any {
                        return createElementVNode("text", utsMapOf("key" to index, "onClick" to fun(){
                            _ctx.clickTH(index);
                        }
                        , "style" to normalizeStyle(utsMapOf("margin-right" to "20px"))), toDisplayString(name), 13, utsArrayOf(
                            "onClick"
                        ));
                    }
                    ), 128)
                ), 4)
            )),
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.listData, fun(value, index, __index, _cached): Any {
                return createElementVNode("list-item", utsMapOf("key" to index, "type" to "2"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell", "hover-class" to "uni-list-cell-hover", "onClick" to fun(){
                        _ctx.goDetail(value);
                    }
                    ), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-media-list"), utsArrayOf(
                            createElementVNode("image", utsMapOf("class" to "uni-media-list-logo", "src" to value.cover), null, 8, utsArrayOf(
                                "src"
                            )),
                            createElementVNode("view", utsMapOf("class" to "uni-media-list-body"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "uni-media-list-text-top"), toDisplayString(value.title), 1),
                                createElementVNode("view", utsMapOf("class" to "uni-media-list-text-bottom"), utsArrayOf(
                                    createElementVNode("text", utsMapOf("class" to "uni-media-list-text"), toDisplayString(value.author_name), 1),
                                    createElementVNode("text", utsMapOf("class" to "uni-media-list-text"), toDisplayString(value.published_at), 1)
                                ))
                            ))
                        ))
                    ), 8, utsArrayOf(
                        "onClick"
                    ))
                ));
            }
            ), 128)
        ), 44, utsArrayOf(
            "onRefresherrefresh",
            "refresher-triggered"
        ));
    }
    open var th_item: UTSArray<String> by `$data`;
    open var refresherTriggered: Boolean by `$data`;
    open var banner: Banner by `$data`;
    open var listData: UTSArray<Item6> by `$data`;
    open var last_id: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("th_item" to utsArrayOf(
            "排序",
            "筛选"
        ), "refresherTriggered" to false, "banner" to Banner(), "listData" to utsArrayOf<Item6>(), "last_id" to "");
    }
    override fun `$initMethods`() {
        this.getBanner = fun() {
            var data: UTSJSONObject = object : UTSJSONObject() {
                var column = "id,post_id,title,author_name,cover,published_at"
            };
            uni_request<Banner>(RequestOptions(url = "https://unidemo.dcloud.net.cn/api/banner/36kr", data = data, success = fun(data){
                this.refresherTriggered = false;
                if (data.statusCode == 200) {
                    val result = data.data;
                    if (result != null) {
                        this.banner = result;
                    }
                }
            }
            , fail = fun(e){
                console.log("fail", e);
            }
            ));
        }
        ;
        this.getList = fun() {
            var url = "https://unidemo.dcloud.net.cn/api/news?column=id,post_id,title,author_name,cover,published_at";
            uni_request<UTSArray<Item6>>(RequestOptions(url = url, method = "GET", success = fun(res){
                if (res.statusCode == 200) {
                    console.log(res);
                    val result = res.data;
                    if (result != null) {
                        this.listData = result;
                    }
                    this.refresherTriggered = false;
                }
            }
            , fail = fun(res){
                console.log("fail", res);
                this.refresherTriggered = false;
            }
            ));
        }
        ;
        this.goDetail = fun(e: Item6) {
            val detail = e;
            val post_id = detail.post_id;
            val cover = detail.cover;
            val title = detail.title;
            uni_navigateTo(NavigateToOptions(url = "/pages/template/list-news/detail/detail?post_id=" + post_id + "&cover=" + cover + "&title=" + title));
        }
        ;
        this.bannerClick = fun(e: Banner) {
            val detail = e;
            val post_id = detail.post_id;
            val cover = detail.cover;
            val title = detail.title;
            uni_navigateTo(NavigateToOptions(url = "/pages/template/list-news/detail/detail?post_id=" + post_id + "&cover=" + cover + "&title=" + title));
        }
        ;
        this.clickTH = fun(index: Number) {
            uni_showModal(ShowModalOptions(content = "点击表头项：" + index, showCancel = false));
        }
        ;
        this.onRefresherrefresh = fun() {
            this.refresherTriggered = true;
            this.getBanner();
            this.getList();
        }
        ;
    }
    open lateinit var getBanner: () -> Unit;
    open lateinit var getList: () -> Unit;
    open lateinit var goDetail: (e: Item6) -> Unit;
    open lateinit var bannerClick: (e: Banner) -> Unit;
    open lateinit var clickTH: (index: Number) -> Unit;
    open lateinit var onRefresherrefresh: () -> Unit;
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
                return utsMapOf("banner" to padStyleMapOf(utsMapOf("height" to 180, "overflow" to "hidden", "position" to "relative", "backgroundColor" to "#cccccc")), "banner-img" to padStyleMapOf(utsMapOf("width" to "100%")), "banner-title" to padStyleMapOf(utsMapOf("maxHeight" to 42, "overflow" to "hidden", "position" to "absolute", "left" to 15, "bottom" to 15, "width" to "90%", "fontSize" to 16, "fontWeight" to "400", "lineHeight" to "21px", "color" to "#FFFFFF")), "uni-media-list" to padStyleMapOf(utsMapOf("paddingTop" to 11, "paddingRight" to 15, "paddingBottom" to 11, "paddingLeft" to 15, "boxSizing" to "border-box", "display" to "flex", "width" to "100%", "flexDirection" to "row")), "uni-media-list-logo" to padStyleMapOf(utsMapOf("width" to 90, "height" to 70)), "uni-media-list-body" to padStyleMapOf(utsMapOf("flex" to 1, "paddingLeft" to 7, "justifyContent" to "space-around")), "uni-media-list-text-top" to padStyleMapOf(utsMapOf("fontSize" to 14, "lines" to 2, "overflow" to "hidden")), "uni-media-list-text-bottom" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between")), "uni-media-list-text" to padStyleMapOf(utsMapOf("color" to "#9D9D9F", "fontSize" to 13)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
