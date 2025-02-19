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
import io.dcloud.uniapp.extapi.getAppBaseInfo as uni_getAppBaseInfo;
open class GenPagesAPIGetAppBaseInfoGetAppBaseInfo : BasePage {
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
        onUnload(fun() {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode(Fragment, null, utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("view", utsMapOf("class" to "uni-common-mt"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, _, __index, _cached): Any {
                        return createElementVNode("view", utsMapOf("class" to "uni-list-cell", "style" to normalizeStyle(utsMapOf("align-items" to "center"))), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "uni-pd"), utsArrayOf(
                                createElementVNode("view", utsMapOf("class" to "uni-label", "style" to normalizeStyle(utsMapOf("width" to "180px"))), toDisplayString(item.label), 5)
                            )),
                            createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "uni-list-cell-db-text"), toDisplayString(if (item.value == "") {
                                    "未获取";
                                } else {
                                    item.value;
                                }
                                ), 1)
                            ))
                        ), 4);
                    }
                    ), 256)
                )),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                        createElementVNode("button", utsMapOf("type" to "primary", "onClick" to _ctx.getAppBaseInfo), "获取App基础信息", 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ), 64);
    }
    open var title: String by `$data`;
    open var items: UTSArray<Item4> by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "getAppBaseInfo", "items" to utsArrayOf<Item4>());
    }
    override fun `$initMethods`() {
        this.getAppBaseInfo = fun() {
            val res = uni_getAppBaseInfo(null);
            val res_str = JSON.stringify(res);
            val res_obj = JSON.parseObject(res_str);
            val res_map = res_obj!!.toMap();
            var keys = utsArrayOf<String>();
            res_map.forEach(fun(_, key){
                keys.push(key);
            }
            );
            this.items = utsArrayOf<Item4>();
            keys.sort().forEach(fun(key){
                val value = res[key];
                if (value != null) {
                    val item = Item4(label = key, value = "" + (if ((UTSAndroid.`typeof`( value) == "object")) {
                        JSON.stringify(value);
                    } else {
                        value;
                    }
                    ));
                    this.items.push(item);
                }
            }
            );
        }
        ;
    }
    open lateinit var getAppBaseInfo: () -> Unit;
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
                return utsMapOf("uni-pd" to padStyleMapOf(utsMapOf("paddingLeft" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
