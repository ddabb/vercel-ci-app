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
import io.dcloud.uniapp.extapi.getElementById as uni_getElementById;
open class GenPagesComponentStickySectionStickySection : BasePage {
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
            this.data.forEach(fun(key){
                val list = utsArrayOf<sectionListItem>();
                run {
                    var i: Number = 1;
                    while(i < 11){
                        val item = sectionListItem(text = key + "--item--content----" + i);
                        list.push(item);
                        i++;
                    }
                }
                val data = sectionData(name = key, list = list);
                this.sectionArray.push(data);
            }
            );
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "sticky-section")),
            createElementVNode("list-view", utsMapOf("id" to "list-view", "ref" to "list-view", "show-scrollbar" to "false", "class" to "page", "scroll-into-view" to _ctx.scrollIntoView, "onScroll" to _ctx.onScroll, "onScrollend" to _ctx.onScrollEnd, "bounces" to "false"), utsArrayOf(
                createElementVNode("list-item", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "10px", "margin" to "5px 0", "align-items" to "center")), "type" to 20), utsArrayOf(
                    createElementVNode("button", utsMapOf("onClick" to fun(){
                        _ctx.gotoStickyHeader("C");
                    }
                    , "size" to "mini"), "跳转到id为C的sticky-header位置上", 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4),
                createElementVNode("list-item", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "10px", "margin" to "5px 0", "align-items" to "center")), "type" to 20), utsArrayOf(
                    createElementVNode("button", utsMapOf("onClick" to fun(){
                        _ctx.appendSectionItem(0);
                    }
                    , "size" to "mini"), "第一组 section 新增5条内容", 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4),
                createElementVNode("list-item", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "10px", "margin" to "5px 0", "align-items" to "center")), "type" to 20), utsArrayOf(
                    createElementVNode("button", utsMapOf("onClick" to fun(){
                        _ctx.deleteSection();
                    }
                    , "size" to "mini"), "删除第一组 section", 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4),
                createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.sectionArray, fun(section, __key, __index, _cached): Any {
                    return createElementVNode("sticky-section", utsMapOf("key" to section.name, "padding" to _ctx.sectionPadding, "push-pinned-header" to true), utsArrayOf(
                        createElementVNode("sticky-header", utsMapOf("id" to section.name), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "sticky-header-text"), toDisplayString(section.name), 1)
                        ), 8, utsArrayOf(
                            "id"
                        )),
                        createElementVNode(Fragment, null, RenderHelpers.renderList(section.list, fun(list, __key, __index, _cached): Any {
                            return createElementVNode("list-item", utsMapOf("key" to list.text, "name" to list.text, "class" to "content-item", "type" to 10), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "text"), toDisplayString(list.text), 1)
                            ), 8, utsArrayOf(
                                "name"
                            ));
                        }
                        ), 128)
                    ), 8, utsArrayOf(
                        "padding"
                    ));
                }
                ), 128),
                createElementVNode("list-item", utsMapOf("style" to normalizeStyle(utsMapOf("padding" to "10px", "margin" to "5px 0", "align-items" to "center")), "type" to 30), utsArrayOf(
                    createElementVNode("button", utsMapOf("onClick" to _ctx.toTop, "size" to "mini"), "回到顶部", 8, utsArrayOf(
                        "onClick"
                    ))
                ), 4)
            ), 40, utsArrayOf(
                "scroll-into-view",
                "onScroll",
                "onScrollend"
            ))
        ), 64);
    }
    open var data: UTSArray<String> by `$data`;
    open var sectionPadding: UTSArray<Number> by `$data`;
    open var scrollIntoView: String by `$data`;
    open var scrolling: Boolean by `$data`;
    open var sectionArray: UTSArray<sectionData> by `$data`;
    open var appendId: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("data" to utsArrayOf(
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N"
        ), "sectionPadding" to utsArrayOf<Number>(0, 10, 0, 10), "scrollIntoView" to "", "scrolling" to false, "sectionArray" to utsArrayOf<sectionData>(), "appendId" to 0);
    }
    override fun `$initMethods`() {
        this.toTop = fun() {
            this.scrollIntoView = "";
            uni_getElementById("list-view")!!.scrollTop = 0;
        }
        ;
        this.listViewScrollByY = fun(y: Number) {
            val listview = this.`$refs`["list-view"] as UniElement;
            listview.scrollTop = y;
        }
        ;
        this.gotoStickyHeader = fun(id: String) {
            this.scrollIntoView = id;
        }
        ;
        this.onScroll = fun() {
            this.scrolling = true;
        }
        ;
        this.onScrollEnd = fun() {
            this.scrolling = false;
            if (this.scrollIntoView != "") {
                this.scrollIntoView = "";
            }
        }
        ;
        this.appendSectionItem = fun(index: Number) {
            val data = this.sectionArray[index];
            this.appendId++;
            val list = utsArrayOf<sectionListItem>(sectionListItem(text = data.name + "--item--content----new1--" + this.appendId), sectionListItem(text = data.name + "--item--content----new2--" + this.appendId), sectionListItem(text = data.name + "--item--content----new3--" + this.appendId), sectionListItem(text = data.name + "--item--content----new4--" + this.appendId), sectionListItem(text = data.name + "--item--content----new5--" + this.appendId));
            data.list.unshift(*list.toTypedArray());
        }
        ;
        this.deleteSection = fun() {
            this.sectionArray.shift();
        }
        ;
    }
    open lateinit var toTop: () -> Unit;
    open lateinit var listViewScrollByY: (y: Number) -> Unit;
    open lateinit var gotoStickyHeader: (id: String) -> Unit;
    open lateinit var onScroll: () -> Unit;
    open lateinit var onScrollEnd: () -> Unit;
    open lateinit var appendSectionItem: (index: Number) -> Unit;
    open lateinit var deleteSection: () -> Unit;
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
                return utsMapOf("page" to padStyleMapOf(utsMapOf("flex" to 1, "backgroundColor" to "#f5f5f5")), "sticky-header-text" to padStyleMapOf(utsMapOf("fontSize" to 16, "paddingTop" to 8, "paddingRight" to 8, "paddingBottom" to 8, "paddingLeft" to 8, "color" to "#959595", "backgroundColor" to "#f5f5f5")), "content-item" to padStyleMapOf(utsMapOf("paddingTop" to 15, "paddingRight" to 15, "paddingBottom" to 15, "paddingLeft" to 15, "marginBottom" to 10, "backgroundColor" to "#ffffff")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
