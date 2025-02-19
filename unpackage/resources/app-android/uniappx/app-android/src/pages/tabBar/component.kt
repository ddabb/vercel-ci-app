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
import io.dcloud.uniapp.extapi.getPrivacySetting as uni_getPrivacySetting;
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
import io.dcloud.uniapp.extapi.onPrivacyAuthorizationChange as uni_onPrivacyAuthorizationChange;
import io.dcloud.uniapp.extapi.reLaunch as uni_reLaunch;
import io.dcloud.uniapp.extapi.showTabBar as uni_showTabBar;
open class GenPagesTabBarComponent : BasePage {
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
        onReady(fun() {
            uni_getPrivacySetting(GetPrivacySettingOptions(success = fun(res) {
                if (res.needAuthorization) {
                    uni_onPrivacyAuthorizationChange(fun(res){
                        if (!res.needAuthorization) {
                            default1();
                        }
                    });
                } else {
                    default1();
                }
            }
            ));
        }
        , __ins);
        onPageShow(fun() {
            this.pageHiden = false;
        }
        , __ins);
        onPageHide(fun() {
            this.pageHiden = true;
        }
        , __ins);
        onBeforeUnmount(fun() {
            uni_showTabBar(null)?.`catch`(fun(_){});
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_u_link = resolveEasyComponent("u-link", GenComponentsULinkULinkClass);
        val _component_uni_collapse_item = resolveEasyComponent("uni-collapse-item", GenComponentsUniCollapseItemUniCollapseItemClass);
        val _component_uni_collapse = resolveEasyComponent("uni-collapse", GenComponentsUniCollapseUniCollapseClass);
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1")), "enable-back-to-top" to "true"), utsArrayOf(
            createElementVNode("view", utsMapOf("class" to "uni-container"), utsArrayOf(
                if (isTrue(!_ctx.hasLeftWin)) {
                    createElementVNode("view", utsMapOf("key" to 0, "class" to "uni-header-logo"), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "uni-header-image", "src" to "/static/componentIndex.png"))
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
                ,
                if (isTrue(!_ctx.hasLeftWin)) {
                    createElementVNode("view", utsMapOf("key" to 1, "class" to "uni-text-box"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "hello-text"), "uni-app内置组件，展示样式仅供参考，文档详见："),
                        createVNode(_component_u_link, utsMapOf("href" to "https://uniapp.dcloud.io/uni-app-x/component/", "text" to "https://uniapp.dcloud.io/uni-app-x/component/", "inWhiteList" to true), null, 8, utsArrayOf(
                            "href",
                            "text"
                        ))
                    ));
                } else {
                    createCommentVNode("v-if", true);
                }
                ,
                createVNode(_component_uni_collapse, null, utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.menu, fun(menuItem, __key, __index, _cached): Any {
                            return createVNode(_component_uni_collapse_item, utsMapOf("ref_for" to true, "ref" to "category", "key" to menuItem.id, "title" to menuItem.name, "class" to "item"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createElementVNode(Fragment, null, RenderHelpers.renderList(menuItem.items, fun(childMenuItem, __key, __index, _cached): Any {
                                        return createElementVNode(Fragment, utsMapOf("key" to childMenuItem.id), utsArrayOf(
                                            if (childMenuItem.items.length == 0) {
                                                createElementVNode("view", utsMapOf("key" to 0, "style" to normalizeStyle(utsMapOf("padding-left" to "18px")), "class" to "uni-navigate-item", "hover-class" to "is--active", "onClick" to fun(){
                                                    _ctx.goPage("/" + childMenuItem.path);
                                                }), utsArrayOf(
                                                    createElementVNode("text", utsMapOf("class" to normalizeClass(utsArrayOf(
                                                        "uni-navigate-text",
                                                        utsMapOf("left-win-active" to (_ctx.leftWinActive === childMenuItem.path && _ctx.hasLeftWin))
                                                    ))), toDisplayString(childMenuItem.style["navigationBarTitleText"]), 3),
                                                    createElementVNode("image", utsMapOf("src" to _ctx.arrowRightIcon, "class" to "uni-icon-size"), null, 8, utsArrayOf(
                                                        "src"
                                                    ))
                                                ), 12, utsArrayOf(
                                                    "onClick"
                                                ));
                                            } else {
                                                createVNode(_component_uni_collapse, utsMapOf("key" to 1, "style" to normalizeStyle(utsMapOf("width" to "100%"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                    return utsArrayOf(
                                                        createVNode(_component_uni_collapse_item, utsMapOf("title" to childMenuItem.name, "class" to "item", "style" to normalizeStyle(utsMapOf("margin-bottom" to "0", "padding-left" to "5px", "padding-right" to "5px"))), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                                            return utsArrayOf(
                                                                createElementVNode(Fragment, null, RenderHelpers.renderList(childMenuItem.items, fun(grandChildMenuItem, __key, __index, _cached): Any {
                                                                    return createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("padding-left" to "18px")), "class" to "uni-navigate-item", "hover-class" to "is--active", "key" to grandChildMenuItem.path, "onClick" to fun(){
                                                                        _ctx.goPage("/" + grandChildMenuItem.path);
                                                                    }
                                                                    ), utsArrayOf(
                                                                        createElementVNode("text", utsMapOf("class" to normalizeClass(utsArrayOf(
                                                                            "uni-navigate-text",
                                                                            utsMapOf("left-win-active" to (_ctx.leftWinActive === grandChildMenuItem.path && _ctx.hasLeftWin))
                                                                        ))), toDisplayString(grandChildMenuItem.style["navigationBarTitleText"]), 3),
                                                                        createElementVNode("image", utsMapOf("src" to _ctx.arrowRightIcon, "class" to "uni-icon-size"), null, 8, utsArrayOf(
                                                                            "src"
                                                                        ))
                                                                    ), 12, utsArrayOf(
                                                                        "onClick"
                                                                    ));
                                                                }
                                                                ), 128)
                                                            );
                                                        }
                                                        ), "_" to 2), 1032, utsArrayOf(
                                                            "title",
                                                            "style"
                                                        ))
                                                    );
                                                }
                                                ), "_" to 2), 1032, utsArrayOf(
                                                    "style"
                                                ));
                                            }
                                        ), 64);
                                    }
                                    ), 128)
                                );
                            }
                            ), "_" to 2), 1032, utsArrayOf(
                                "title"
                            ));
                        }
                        ), 128)
                    );
                }
                ), "_" to 1))
            ))
        ), 4);
    }
    open var menu: UTSArray<MenuItem> by `$data`;
    open var arrowRightIcon: String by `$data`;
    open var pageHiden: Boolean by `$data`;
    open var hasLeftWin: Boolean by `$data`;
    open var leftWinActive: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("menu" to uni.UNIFB90797.menu as UTSArray<MenuItem>, "arrowRightIcon" to "/static/icons/arrow-right.png" as String, "pageHiden" to false, "hasLeftWin" to computed<Boolean>(fun(): Boolean {
            return !state.noMatchLeftWindow;
        }
        ), "leftWinActive" to computed<String>(fun(): String {
            return state.leftWinActive.slice(1);
        }
        ));
    }
    override fun `$initMethods`() {
        this.goPage = fun(url: String) {
            if (this.hasLeftWin) {
                uni_reLaunch(ReLaunchOptions(url = url));
            } else {
                uni_navigateTo(NavigateToOptions(url = url));
            }
        }
        ;
    }
    open lateinit var goPage: (url: String) -> Unit;
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
                return utsMapOf("item" to padStyleMapOf(utsMapOf("marginBottom" to 12)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
