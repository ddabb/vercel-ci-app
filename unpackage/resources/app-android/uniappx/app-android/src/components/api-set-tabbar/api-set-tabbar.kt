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
import io.dcloud.uniapp.extapi.hideTabBar as uni_hideTabBar;
import io.dcloud.uniapp.extapi.hideTabBarRedDot as uni_hideTabBarRedDot;
import io.dcloud.uniapp.extapi.removeTabBarBadge as uni_removeTabBarBadge;
import io.dcloud.uniapp.extapi.setTabBarBadge as uni_setTabBarBadge;
import io.dcloud.uniapp.extapi.setTabBarItem as uni_setTabBarItem;
import io.dcloud.uniapp.extapi.setTabBarStyle as uni_setTabBarStyle;
import io.dcloud.uniapp.extapi.showTabBar as uni_showTabBar;
import io.dcloud.uniapp.extapi.showTabBarRedDot as uni_showTabBarRedDot;
open class GenComponentsApiSetTabbarApiSetTabbar : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                "title"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.setTabBarBadge), toDisplayString(if (!_ctx.hasSetTabBarBadge) {
                "设置tab徽标";
            } else {
                "移除tab徽标";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.showTabBarRedDot), toDisplayString(if (!_ctx.hasShownTabBarRedDot) {
                "显示红点";
            } else {
                "移除红点";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.customStyle), toDisplayString(if (!_ctx.hasCustomedStyle) {
                "自定义Tab样式";
            } else {
                "移除自定义样式";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.customItem), toDisplayString(if (!_ctx.hasCustomedItem) {
                "自定义Tab信息";
            } else {
                "移除自定义信息";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.hideTabBar), toDisplayString(if (!_ctx.hasHiddenTabBar) {
                "隐藏TabBar";
            } else {
                "显示TabBar";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.hideTabBarItem), toDisplayString(if (!_ctx.hasHiddenTabBarItem) {
                "隐藏接口Item";
            } else {
                "显示接口Item";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("button", utsMapOf("class" to "button", "onClick" to _ctx.setTabBarTitle), toDisplayString(if (!_ctx.hasSetLongTitle) {
                "自定义超长标题";
            } else {
                "移除自定义信息";
            }
            ), 9, utsArrayOf(
                "onClick"
            )),
            createElementVNode("view", utsMapOf("class" to "btn-area"))
        ));
    }
    open var title: String by `$data`;
    open var hasSetTabBarBadge: Boolean by `$data`;
    open var hasShownTabBarRedDot: Boolean by `$data`;
    open var hasCustomedStyle: Boolean by `$data`;
    open var hasCustomedItem: Boolean by `$data`;
    open var hasHiddenTabBar: Boolean by `$data`;
    open var hasHiddenTabBarItem: Boolean by `$data`;
    open var hasSetLongTitle: Boolean by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "tababr", "hasSetTabBarBadge" to false, "hasShownTabBarRedDot" to false, "hasCustomedStyle" to false, "hasCustomedItem" to false, "hasHiddenTabBar" to false, "hasHiddenTabBarItem" to false, "hasSetLongTitle" to false);
    }
    override fun `$initMethods`() {
        this.setTabBarTitle = fun() {
            var tabBarOptions = SetTabBarItemOptions(visible = true, index = 1, text = "接口", iconPath = "/static/api.png", selectedIconPath = "/static/apiHL.png");
            if (!this.hasSetLongTitle) {
                tabBarOptions.text = "超长标题内容超长标题内容超长标题内容超长标题测试";
                tabBarOptions.iconPath = "";
                tabBarOptions.selectedIconPath = "";
            } else {
                tabBarOptions.text = "接口";
                tabBarOptions.iconPath = "/static/api.png";
                tabBarOptions.selectedIconPath = "/static/apiHL.png";
            }
            uni_setTabBarItem(tabBarOptions);
            this.hasSetLongTitle = !this.hasSetLongTitle;
        }
        ;
        this.hideTabBarItem = fun() {
            var tabBarOptions = SetTabBarItemOptions(visible = true, index = 1, text = "接口", iconPath = "/static/api.png", selectedIconPath = "/static/apiHL.png");
            if (!this.hasHiddenTabBarItem) {
                tabBarOptions.visible = false;
            } else {
                tabBarOptions.visible = true;
            }
            uni_setTabBarItem(tabBarOptions);
            this.hasHiddenTabBarItem = !this.hasHiddenTabBarItem;
        }
        ;
        this.navigateBack = fun() {
            this.`$emit`("unmount");
        }
        ;
        this.setTabBarBadge = fun() {
            if (this.hasShownTabBarRedDot) {
                uni_hideTabBarRedDot(HideTabBarRedDotOptions(index = 1));
                this.hasShownTabBarRedDot = !this.hasShownTabBarRedDot;
            }
            if (!this.hasSetTabBarBadge) {
                uni_setTabBarBadge(SetTabBarBadgeOptions(index = 1, text = "1"));
            } else {
                uni_removeTabBarBadge(RemoveTabBarBadgeOptions(index = 1));
            }
            this.hasSetTabBarBadge = !this.hasSetTabBarBadge;
        }
        ;
        this.showTabBarRedDot = fun() {
            if (this.hasSetTabBarBadge) {
                uni_removeTabBarBadge(RemoveTabBarBadgeOptions(index = 1));
                this.hasSetTabBarBadge = !this.hasSetTabBarBadge;
            }
            if (!this.hasShownTabBarRedDot) {
                uni_showTabBarRedDot(ShowTabBarRedDotOptions(index = 1));
            } else {
                uni_hideTabBarRedDot(HideTabBarRedDotOptions(index = 1));
            }
            this.hasShownTabBarRedDot = !this.hasShownTabBarRedDot;
        }
        ;
        this.hideTabBar = fun() {
            if (!this.hasHiddenTabBar) {
                uni_hideTabBar(null);
            } else {
                uni_showTabBar(null);
            }
            this.hasHiddenTabBar = !this.hasHiddenTabBar;
        }
        ;
        this.customStyle = fun() {
            if (this.hasCustomedStyle) {
                uni_setTabBarStyle(SetTabBarStyleOptions(color = "#7A7E83", selectedColor = "#007AFF", backgroundColor = "#F8F8F8", borderStyle = "black"));
            } else {
                uni_setTabBarStyle(SetTabBarStyleOptions(color = "#FFF", selectedColor = "#007AFF", backgroundColor = "#000000", borderStyle = "black"));
            }
            this.hasCustomedStyle = !this.hasCustomedStyle;
        }
        ;
        this.customItem = fun() {
            var tabBarOptions = SetTabBarItemOptions(index = 1, text = "接口", iconPath = "/static/api.png", selectedIconPath = "/static/apiHL.png");
            if (this.hasCustomedItem) {
                uni_setTabBarItem(tabBarOptions);
            } else {
                tabBarOptions.text = "API";
                uni_setTabBarItem(tabBarOptions);
            }
            this.hasCustomedItem = !this.hasCustomedItem;
        }
        ;
    }
    open lateinit var setTabBarTitle: () -> Unit;
    open lateinit var hideTabBarItem: () -> Unit;
    open lateinit var navigateBack: () -> Unit;
    open lateinit var setTabBarBadge: () -> Unit;
    open lateinit var showTabBarRedDot: () -> Unit;
    open lateinit var hideTabBar: () -> Unit;
    open lateinit var customStyle: () -> Unit;
    open lateinit var customItem: () -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("button" to padStyleMapOf(utsMapOf("marginTop" to 15, "marginLeft" to 0, "marginRight" to 0)), "btn-area" to padStyleMapOf(utsMapOf("paddingTop" to 15)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
