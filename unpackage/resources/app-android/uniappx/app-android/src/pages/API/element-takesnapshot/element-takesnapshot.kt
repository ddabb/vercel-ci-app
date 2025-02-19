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
import io.dcloud.uniapp.extapi.saveImageToPhotosAlbum as uni_saveImageToPhotosAlbum;
import io.dcloud.uniapp.extapi.showActionSheet as uni_showActionSheet;
import io.dcloud.uniapp.extapi.showModal as uni_showModal;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
open class GenPagesAPIElementTakesnapshotElementTakesnapshot : BasePage {
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
        val _component_page_head = resolveEasyComponent("page-head", GenComponentsPageHeadPageHeadClass);
        return createElementVNode("view", utsMapOf("id" to "snapshot-content"), utsArrayOf(
            createVNode(_component_page_head, utsMapOf("title" to "对本页面根view截图")),
            createElementVNode("view", utsMapOf("class" to "uni-padding-wrap"), utsArrayOf(
                createElementVNode("text", null, "this is text")
            )),
            createElementVNode("button", utsMapOf("class" to "uni-btn btn-TakeSnapshot", "type" to "primary", "onClick" to _ctx.takeSnapshotClick), " 点击截图并替换显示下方图片 ", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("image", utsMapOf("style" to normalizeStyle(utsMapOf("margin-left" to "auto", "margin-right" to "auto", "margin-top" to "20px", "width" to "90%")), "src" to _ctx.snapImage, "mode" to _ctx.mode, "onLongpress" to _ctx.saveToAlbum), null, 44, utsArrayOf(
                "src",
                "mode",
                "onLongpress"
            ))
        ));
    }
    open var mode: String by `$data`;
    open var snapImage: String by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("mode" to "center", "snapImage" to "/static/uni.png");
    }
    override fun `$initMethods`() {
        this.takeSnapshotClick = fun() {
            val view = uni_getElementById("snapshot-content")!!;
            view.takeSnapshot(TakeSnapshotOptions(success = fun(res){
                console.log(res.tempFilePath);
                this.snapImage = res.tempFilePath;
                this.mode = "widthFix";
                uni_showToast(ShowToastOptions(title = "截图成功，路径：" + res.tempFilePath, icon = "none"));
            }
            , fail = fun(res){
                console.log(res);
                uni_showToast(ShowToastOptions(icon = "error", title = "截图失败"));
            }
            ));
        }
        ;
        this.saveToAlbum = fun(e: TouchEvent) {
            var filePath: String = e.currentTarget!!.getAttribute("src") as String;
            uni_showActionSheet(ShowActionSheetOptions(itemList = utsArrayOf(
                "保存"
            ), success = fun(res){
                if (res.tapIndex == 0) {
                    uni_saveImageToPhotosAlbum(SaveImageToPhotosAlbumOptions(filePath = filePath, success = fun(_) {
                        uni_showToast(ShowToastOptions(position = "center", icon = "none", title = "图片保存成功，请到手机相册查看"));
                    }
                    , fail = fun(e) {
                        uni_showModal(ShowModalOptions(content = "保存相册失败，errCode：" + e.errCode + "，errMsg：" + e.errMsg + "，errSubject：" + e.errSubject, showCancel = false));
                    }
                    ));
                }
            }
            , fail = fun(_){}, complete = fun(_){}));
        }
        ;
    }
    open lateinit var takeSnapshotClick: () -> Unit;
    open lateinit var saveToAlbum: (e: TouchEvent) -> Unit;
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
