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
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesComponentAdListViewAd : BasePage {
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
        return createElementVNode("list-view", utsMapOf("onScrolltolower" to _ctx.onScrollTolower, "style" to normalizeStyle(utsMapOf("flex" to "1")), "show-scrollbar" to "false"), utsArrayOf(
            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.listcount, fun(index, __key, __index, _cached): Any {
                return createElementVNode("list-item", utsMapOf("type" to if ((index != 0 && index % 10 == 6)) {
                    0;
                } else {
                    1;
                }
                ), utsArrayOf(
                    if (isTrue(index != 0 && index % 10 == 6)) {
                        createElementVNode("ad", utsMapOf("key" to 0, "adpid" to "1111111111", "onLoad" to _ctx.onAdLoad, "onError" to _ctx.onAdError, "onClose" to _ctx.onAdClose), null, 40, utsArrayOf(
                            "onLoad",
                            "onError",
                            "onClose"
                        ));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                    ,
                    if (isTrue(index == 0 || index % 10 != 6)) {
                        createElementVNode("text", utsMapOf("key" to 1, "style" to normalizeStyle(utsMapOf("width" to "100%", "height" to "200px", "background-color" to "aquamarine", "margin-top" to "10px"))), "这是一条占位的信息" + toDisplayString(index), 5);
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ), 8, utsArrayOf(
                    "type"
                ));
            }
            ), 256)
        ), 44, utsArrayOf(
            "onScrolltolower"
        ));
    }
    open var listcount: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("listcount" to 10);
    }
    override fun `$initMethods`() {
        this.onScrollTolower = fun(_: ScrollToLowerEvent) {
            setTimeout(fun(){
                this.listcount = this.listcount + 10;
            }
            , 300);
        }
        ;
        this.onAdLoad = fun() {
            console.log("广告加载成功");
            uni_showToast(ShowToastOptions(position = "center", title = "广告加载成功"));
        }
        ;
        this.onAdError = fun(e: UniAdErrorEvent) {
            console.log("广告加载失败" + e.detail);
        }
        ;
        this.onAdClose = fun() {
            console.log("广告关闭了");
        }
        ;
    }
    open lateinit var onScrollTolower: (_: ScrollToLowerEvent) -> Unit;
    open lateinit var onAdLoad: () -> Unit;
    open lateinit var onAdError: (e: UniAdErrorEvent) -> Unit;
    open lateinit var onAdClose: () -> Unit;
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
