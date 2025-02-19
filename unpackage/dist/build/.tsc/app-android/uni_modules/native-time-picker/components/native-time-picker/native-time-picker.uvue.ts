
	import { NativeTimePicker } from "@/uni_modules/native-time-picker";


	const __sfc__ = defineComponent({

		data() {
			return {
				picker: null as NativeTimePicker | null,
				hourValue: 0 as number,
				minuteValue: 0 as number
			}
		},
		props: {
			"hour": {
				type: Number,
				default: 0
			},
			"minute": {
				type: Number,
				default: 0
			}
		},
		watch: {
			"hour": {
				handler(newValue : number, oldValue : number) {
					if (newValue < 23 && newValue >= 0) {
						this.hourValue = newValue
						this.picker?.setHour(this.hourValue)
					}
				},
				immediate: true
			},
			"minute": {
				handler(newValue : number, oldValue : number) {
					if (newValue < 59 && newValue >= 0) {
						this.minuteValue = newValue
						this.picker?.setMinute(this.minuteValue)
					}

				},
				immediate: true
			},
		},
		methods: {
			onviewinit(e : UniNativeViewInitEvent) {
				this.picker = new NativeTimePicker(e.detail.element, this.hourValue, this.minuteValue);
				this.$emit("load")
			},
			ontimechanged(e : UniNativeViewEvent) {
				this.$emit("changed", e)
			}
		},
		unmounted() {

		}
	})

export default __sfc__
function GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePickerRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "def-picker" }), [
    createElementVNode("native-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"width":"100%","height":"100%"})),
      onInit: _ctx.onviewinit,
      onTimechanged: _ctx.ontimechanged
    }), null, 44 /* STYLE, PROPS, NEED_HYDRATION */, ["onInit", "onTimechanged"])
  ])
}
export type NativeTimePickerComponentPublicInstance = InstanceType<typeof __sfc__>;
const GenUniModulesNativeTimePickerComponentsNativeTimePickerNativeTimePickerStyles = [utsMapOf([["def-picker", padStyleMapOf(utsMapOf([["minWidth", 300], ["minHeight", 380], ["maxWidth", 400], ["maxHeight", 400]]))]])]
