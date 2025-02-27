
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'Hello',
        buttonText: "native-button",
        isLoad: false,
        clickCount: 0
      }
    },
    onLoad() {

    },
    methods: {
      ontap(e : UniNativeViewEvent) {
        uni.showToast({
          title: "按钮被点击了"
        })
        this.clickCount ++
        this.buttonText = "native-button"+this.clickCount
      },
      onload() {
        //标记已初始化 用于自动化测试
        this.isLoad = true
      },
      onChanged(e : UniNativeViewEvent) {
        console.log("onchanged-----", e.detail)
      }
    }
  })

export default __sfc__
function GenPagesComponentNativeViewNativeViewRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_native_button = resolveEasyComponent("native-button",_easycom_native_button)
const _component_native_time_picker = resolveEasyComponent("native-time-picker",_easycom_native_time_picker)

  return createElementVNode("view", null, [
    createElementVNode("text", utsMapOf({ class: "tips" }), "说明：如果本地无 uts 插件编译环境请提交打包自定义基座查看效果"),
    createVNode(_component_native_button, utsMapOf({
      class: "native-button",
      style: normalizeStyle(utsMapOf({"width":"200px","height":"100px"})),
      text: _ctx.buttonText,
      onButtonTap: _ctx.ontap,
      onLoad: _ctx.onload
    }), null, 8 /* PROPS */, ["style", "text", "onButtonTap", "onLoad"]),
    createVNode(_component_native_time_picker, utsMapOf({
      class: "native-time-picker",
      hour: 2,
      minute: 3,
      onChanged: _ctx.onChanged
    }), null, 8 /* PROPS */, ["onChanged"])
  ])
}
const GenPagesComponentNativeViewNativeViewStyles = [utsMapOf([["tips", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#BEBEBE"], ["marginTop", 25], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"], ["textAlign", "center"]]))], ["native-button", padStyleMapOf(utsMapOf([["height", 100], ["width", 100], ["marginTop", 25], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"]]))], ["native-time-picker", padStyleMapOf(utsMapOf([["marginTop", 10], ["marginRight", "auto"], ["marginBottom", 25], ["marginLeft", "auto"], ["borderStyle", "solid"], ["borderRadius", 5]]))]])]

import _easycom_native_button from '@/uni_modules/native-button/components/native-button/native-button.uvue'
import _easycom_native_time_picker from '@/uni_modules/native-time-picker/components/native-time-picker/native-time-picker.uvue'
