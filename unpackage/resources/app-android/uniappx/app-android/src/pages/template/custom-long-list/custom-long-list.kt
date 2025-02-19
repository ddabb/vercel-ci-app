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
open class GenPagesTemplateCustomLongListCustomLongList : BasePage {
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
        onCreated(fun() {
            run {
                var i: Number = 0;
                while(i < 2000){
                    this.list.push(Item7(id = i, name = "Wifi_" + i, info = "\u4FE1\u53F7\u5F3A\u5EA6: -" + (Math.floor(Math.random() * 60) + 40) + " db, \u5B89\u5168\u6027: WPA/WPA2/WPA3-Personal"));
                    i++;
                }
            }
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_uni_recycle_item = resolveEasyComponent("uni-recycle-item", GenUniModulesUniRecycleViewComponentsUniRecycleItemUniRecycleItemClass);
        val _component_uni_recycle_view = resolveEasyComponent("uni-recycle-view", GenUniModulesUniRecycleViewComponentsUniRecycleViewUniRecycleViewClass);
        return createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1", "background-color" to "aliceblue"))), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "tips"), "list-view组件虽然在UI层有recycle机制，但长列表的vnode太多也会造成初始化卡顿。本组件仅创建部分vnode，而未使用list-view，也就是UI层其实是短列表。 此示例中仅渲染滚动容器上下5屏的内容。适用于仅使用一个for循环创建所有列表项的场景。文档详见插件市场：https://ext.dcloud.net.cn/plugin?id=17385"),
            createVNode(_component_uni_recycle_view, utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "list" to _ctx.list, "onScrolltoupper" to _ctx.scrolltoupper, "onScroll" to _ctx.scroll), utsMapOf("default" to withScopedSlotCtx(fun(slotProps: Record<String, Any?>): UTSArray<Any> {
                val items = slotProps["items"];
                return utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList((items as UTSArray<Item7>), fun(item, index, __index, _cached): Any {
                        return createVNode(_component_uni_recycle_item, utsMapOf("class" to "item", "item" to item, "key" to (index + "_" + item.id)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                            return utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "item-wrapper"), utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "name"), utsArrayOf(
                                        createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "14px"))), toDisplayString(item.name), 5)
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "info"), utsArrayOf(
                                        createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("font-size" to "12px", "color" to "#999999"))), toDisplayString(item.info), 5)
                                    ))
                                ))
                            );
                        }
                        ), "_" to 2), 1032, utsArrayOf(
                            "item"
                        ));
                    }
                    ), 128)
                );
            }
            ), "_" to 1), 8, utsArrayOf(
                "style",
                "list",
                "onScrolltoupper",
                "onScroll"
            ))
        ), 4);
    }
    open var title: String by `$data`;
    open var list: UTSArray<Item7> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "自定义虚拟列表组件uni-recycle-view", "list" to utsArrayOf<Item7>());
    }
    override fun `$initMethods`() {
        this.scrolltoupper = fun() {
            console.log("scroll top upper");
        }
        ;
        this.scroll = fun() {};
    }
    open lateinit var scrolltoupper: () -> Unit;
    open lateinit var scroll: () -> Unit;
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
                return utsMapOf("tips" to padStyleMapOf(utsMapOf("marginTop" to 10, "marginRight" to 10, "marginBottom" to 10, "marginLeft" to 10, "borderRadius" to 5, "paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "backgroundColor" to "#FFFFFF")), "item" to padStyleMapOf(utsMapOf("paddingTop" to 5, "paddingRight" to 10, "paddingBottom" to 5, "paddingLeft" to 10)), "item-wrapper" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingRight" to 10, "paddingBottom" to 10, "paddingLeft" to 10, "borderRadius" to 5, "backgroundColor" to "#FFFFFF")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
