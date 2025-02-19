
	type AudioPath = {
		description : string
		src : string
	}
	const __sfc__ = defineComponent({
		data() {
			return {
				title: "多音频同时播放",
				_audioContext1: null as InnerAudioContext | null,
				src: 'https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3',
				_audioContext2: null as InnerAudioContext | null,
				playing1: false,
				playing2: false,
				currentTime1: 0,
				currentTime2: 0,
			}
		},
		onReady() {
			this._audioContext1 = uni.createInnerAudioContext();
			this._audioContext1!.src = this.src
			this._audioContext1!.onTimeUpdate((res) => {
				this.currentTime1 = this._audioContext1!.currentTime;
			})
			this._audioContext2 = uni.createInnerAudioContext();
			this._audioContext2!.src = this.src
			this._audioContext2!.onTimeUpdate((res) => {
				this.currentTime2 = this._audioContext2!.currentTime;
			})
		},

		onUnload() {
			if (this._audioContext1 != null) {
				this._audioContext1!.stop()
				this._audioContext1!.destroy()
			}
			if (this._audioContext2 != null) {
				this._audioContext2!.stop()
				this._audioContext2!.destroy()
			}
		},
		methods: {
			play1() {
				if (this._audioContext1 != null) {
					this.currentTime1=0
					if (this.playing1) {
						this._audioContext1!.stop()
					} else {
						this._audioContext1!.play()
					}

				}
				this.playing1 = !this.playing1
			},
			play2() {
				if (this._audioContext2 != null) {
					this.currentTime2=0
					if (this.playing2) {
						this._audioContext2!.stop()
					} else {
						this._audioContext2!.play()
					}

				}
				this.playing2 = !this.playing2
			}
		}
	})

export default __sfc__
function GenPagesAPICreateInnerAudioContextInnerAudioMultRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "多音频同时播放")
      ]),
      createElementVNode("button", utsMapOf({
        type: "primary",
        onClick: () => {_ctx.play1()},
        class: "uni-btn"
      }), " 播放/停止(进度：" + toDisplayString(_ctx.currentTime1) + ")", 9 /* TEXT, PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        type: "primary",
        onClick: () => {_ctx.play2()},
        class: "uni-btn"
      }), " 播放/停止(进度：" + toDisplayString(_ctx.currentTime2) + ")", 9 /* TEXT, PROPS */, ["onClick"])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPICreateInnerAudioContextInnerAudioMultStyles = [utsMapOf([["formats", padStyleMapOf(utsMapOf([["alignItems", "center"]]))], ["icon-play", padStyleMapOf(utsMapOf([["width", 60], ["height", 60], ["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
