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
import io.dcloud.uniapp.extapi.getWindowInfo as uni_getWindowInfo;
import io.dcloud.uniapp.extapi.showActionSheet as uni_showActionSheet;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIShowActionSheetShowActionSheet : BasePage {
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
            uni_showActionSheet(ShowActionSheetOptions(title = "onLoad 调用示例,请手动取消", itemList = utsArrayOf(
                "item1",
                "item2"
            )));
        }
        , __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        val _component_radio = resolveComponent("radio");
        val _component_radio_group = resolveComponent("radio-group");
        val _component_switch = resolveComponent("switch");
        return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
            createElementVNode("view", null, utsArrayOf(
                createVNode(_component_page_head, utsMapOf("title" to _ctx.title), null, 8, utsArrayOf(
                    "title"
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createVNode(_component_radio_group, utsMapOf("onChange" to _ctx.radioChange), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                        return utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.items, fun(item, index, __index, _cached): Any {
                                return createVNode(_component_radio, utsMapOf("class" to normalizeClass(utsArrayOf(
                                    "uni-list-cell uni-list-cell-pd",
                                    if (index < _ctx.items.length - 1) {
                                        "uni-list-cell-line";
                                    } else {
                                        "";
                                    }
                                )), "key" to item.value, "value" to item.value, "checked" to (index === _ctx.current)), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                    return utsArrayOf(
                                        toDisplayString(item.name)
                                    );
                                }
                                ), "_" to 2), 1032, utsArrayOf(
                                    "class",
                                    "value",
                                    "checked"
                                ));
                            }
                            ), 128)
                        );
                    }
                    ), "_" to 1), 8, utsArrayOf(
                        "onChange"
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-list"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "自定义itemColor"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.itemColorCustom, "onChange" to _ctx.itemColorChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "超长文本和空文本item"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.itemContentLarge, "onChange" to _ctx.itemContentLargeChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "uni-list-cell uni-list-cell-pd"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "uni-list-cell-db"), "超过6个item"),
                        createVNode(_component_switch, utsMapOf("checked" to _ctx.itemNumLargeSelect, "onChange" to _ctx.itemNumLargeChange), null, 8, utsArrayOf(
                            "checked",
                            "onChange"
                        ))
                    ))
                )),
                createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "uni-btn-v"), utsArrayOf(
                        createElementVNode("button", utsMapOf("class" to "uni-btn-v", "type" to "default", "onClick" to _ctx.actionSheetTap, "id" to "btn-action-sheet-show"), "弹出action sheet", 8, utsArrayOf(
                            "onClick"
                        ))
                    ))
                ))
            ))
        ), 4);
    }
    open var title: String by `$data`;
    open var itemColorCustom: Boolean by `$data`;
    open var itemContentLarge: Boolean by `$data`;
    open var itemNumLargeSelect: Boolean by `$data`;
    open var showErrorToast: Boolean by `$data`;
    open var items: UTSArray<ItemType3> by `$data`;
    open var current: Number by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("title" to "action-sheet", "itemColorCustom" to false, "itemContentLarge" to false, "itemNumLargeSelect" to false, "showErrorToast" to true, "items" to utsArrayOf<ItemType3>(ItemType3(value = "标题", name = "有标题"), ItemType3(value = "", name = "无标题"), ItemType3(value = "超长标题测试内容，测试超过显示最大范围之后的样式-超长标题测试内容，测试超过显示最大范围之后的样式", name = "超长标题")), "current" to 0);
    }
    override fun `$initMethods`() {
        this.jest_getWindowInfo = fun(): GetWindowInfoResult {
            return uni_getWindowInfo();
        }
        ;
        this.radioChange = fun(e: UniRadioGroupChangeEvent) {
            run {
                var i: Number = 0;
                while(i < this.items.length){
                    if (this.items[i].value === e.detail.value) {
                        this.current = i;
                        break;
                    }
                    i++;
                }
            }
        }
        ;
        this.itemContentLargeChange = fun(e: UniSwitchChangeEvent) {
            this.itemContentLarge = e.detail.value;
        }
        ;
        this.itemColorChange = fun(e: UniSwitchChangeEvent) {
            this.itemColorCustom = e.detail.value;
        }
        ;
        this.itemNumLargeChange = fun(e: UniSwitchChangeEvent) {
            this.itemNumLargeSelect = e.detail.value;
        }
        ;
        this.actionSheetTap = fun() {
            var itemInfo = utsArrayOf(
                "item1",
                "item2",
                "item3",
                "item4"
            );
            if (this.itemContentLarge) {
                itemInfo = utsArrayOf(
                    "两个黄鹂鸣翠柳，一行白鹭上青天。窗含西岭千秋雪，门泊东吴万里船",
                    "水光潋滟晴方好,山色空蒙雨亦奇。 欲把西湖比西子,淡妆浓抹总相宜",
                    ""
                );
            }
            if (this.itemNumLargeSelect) {
                itemInfo = utsArrayOf();
                run {
                    var i: Number = 1;
                    while(i <= 10){
                        itemInfo.push("两个黄鹂鸣翠柳，一行白鹭上青天");
                        i++;
                    }
                }
            }
            if (this.itemColorCustom) {
                uni_showActionSheet(ShowActionSheetOptions(title = this.items[this.current].value, itemList = itemInfo, itemColor = "#ff00ff", success = fun(e){
                    console.log(e.tapIndex);
                    uni_showToast(ShowToastOptions(title = "点击了第" + e.tapIndex + "个选项", icon = "none"));
                }, fail = fun(e){
                    if (this.showErrorToast) {
                        uni_showToast(ShowToastOptions(title = e.errMsg, icon = "none"));
                    }
                    console.log(e);
                }));
            } else {
                uni_showActionSheet(ShowActionSheetOptions(title = this.items[this.current].value, itemList = itemInfo, success = fun(e){
                    console.log(e.tapIndex);
                    uni_showToast(ShowToastOptions(title = "点击了第" + e.tapIndex + "个选项", icon = "none"));
                }
                , fail = fun(e){
                    console.log(e);
                    if (this.showErrorToast) {
                        uni_showToast(ShowToastOptions(title = e.errMsg, icon = "none"));
                    }
                }
                ));
            }
        }
        ;
    }
    open lateinit var jest_getWindowInfo: () -> GetWindowInfoResult;
    open lateinit var radioChange: (e: UniRadioGroupChangeEvent) -> Unit;
    open lateinit var itemContentLargeChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var itemColorChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var itemNumLargeChange: (e: UniSwitchChangeEvent) -> Unit;
    open lateinit var actionSheetTap: () -> Unit;
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
