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
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace;
import io.dcloud.uniapp.extapi.navigateBack as uni_navigateBack;
import io.dcloud.uniapp.extapi.setNavigationBarColor as uni_setNavigationBarColor;
open class GenComponentsUniNavbarLiteUniNavbarLite : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onCreated(fun() {
            uni_loadFontFace(LoadFontFaceOptions(global = false, family = "UniIconsFontFamily", source = "url(\"" + default3 + "\")", success = fun(_) {}, fail = fun(err) {
                console.log(err);
            }
            ));
        }
        , __ins);
        onMounted(fun() {
            uni_setNavigationBarColor(SetNavigationBarColorOptions(frontColor = "#000000", backgroundColor = "#ffffff"));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "uni-navbar"), utsArrayOf(
            if (isTrue(_ctx.statusBar)) {
                createElementVNode("view", utsMapOf("key" to 0, "class" to "status-bar"));
            } else {
                createCommentVNode("v-if", true);
            }
            ,
            createElementVNode("view", utsMapOf("class" to "uni-navbar-inner"), utsArrayOf(
                createElementVNode("view", utsMapOf("class" to "left-content", "onClick" to _ctx.back), utsArrayOf(
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to _ctx.textColor)), "class" to "uni-icons"), toDisplayString(_ctx.unicode), 5)
                ), 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                    "uni-navbar-content",
                    utsMapOf("is-left" to _ctx.isLeft)
                ))), utsArrayOf(
                    createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("color" to _ctx.textColor))), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default", UTSJSONObject(), fun(): UTSArray<Any> {
                            return utsArrayOf(
                                toDisplayString(_ctx.title)
                            );
                        }
                        )
                    ), 4)
                ), 2),
                createElementVNode("view", utsMapOf("class" to "right-content"), utsArrayOf(
                    renderSlot(_ctx.`$slots`, "right")
                ))
            ))
        ));
    }
    open var title: String by `$props`;
    open var isLeft: Boolean by `$props`;
    open var textColor: String by `$props`;
    open var statusBar: Boolean by `$props`;
    open var statusBarHeight: Number by `$data`;
    open var unicode: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("statusBarHeight" to 0, "unicode" to computed<String>(fun(): String {
            return "\ue600";
        }
        ));
    }
    override fun `$initMethods`() {
        this.back = fun() {
            uni_navigateBack(NavigateBackOptions());
        }
        ;
    }
    open lateinit var back: () -> Unit;
    companion object {
        var name = "uni-navbar";
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-icons" to padStyleMapOf(utsMapOf("!fontFamily" to "UniIconsFontFamily", "fontSize" to 26, "fontStyle" to "normal", "color" to "#333333")), "status-bar" to padStyleMapOf(utsMapOf("height" to CSS_VAR_STATUS_BAR_HEIGHT)), "uni-navbar" to padStyleMapOf(utsMapOf("backgroundColor" to "#007aff")), "uni-navbar-inner" to padStyleMapOf(utsMapOf("position" to "relative", "flexDirection" to "row", "justifyContent" to "space-between", "height" to 45)), "left-content" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "width" to 40, "height" to "100%")), "right-content" to padStyleMapOf(utsMapOf("justifyContent" to "center", "alignItems" to "center", "width" to 40, "height" to "100%")), "uni-navbar-content" to padStyleMapOf(utsMapOf("position" to "absolute", "height" to "100%", "top" to 0, "bottom" to 0, "left" to 45, "right" to 45, "flexDirection" to "row", "justifyContent" to "center", "alignItems" to "center")), "is-left" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("title" to utsMapOf("type" to "String", "default" to ""), "isLeft" to utsMapOf("type" to "Boolean", "default" to false), "textColor" to utsMapOf("type" to "String", "default" to "#000"), "statusBar" to utsMapOf("type" to "Boolean", "default" to false)));
        var propsNeedCastKeys = utsArrayOf(
            "title",
            "isLeft",
            "textColor",
            "statusBar"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
