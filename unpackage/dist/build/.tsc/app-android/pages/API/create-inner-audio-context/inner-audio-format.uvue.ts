
	type AudioFormat = {
		format : string
		support: string | null
		src : string
	}
	const __sfc__ = defineComponent({
		data() {
			return {
				title: 'audio-format',
				playIndex: 0,
				isPlaying: false,
				_audioContext: null as InnerAudioContext | null,
				supportFormats: [
					{
						format: 'mp3',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.mp3'
					},
					{
						format: 'mp4',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.mp4'
					},
					{
						format: 'm4a',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.m4a'
					},
					{
						format: 'aac',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.aac'
					},
					{
						format: 'flac',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.flac'
					},
					{
						format: 'wav',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.wav'
					},
				] as Array<AudioFormat>,
				notSupportFormats: [
					{
						format: 'ogg',
						support: '(iOS 不支持)',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.ogg'
					},
					{
						format: 'wma',
						support: '(iOS/Android/web 不支持)',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.wma'
					},
					{
						format: 'aiff',
						support: '(Android/web 不支持)',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.aiff'
					},
					{
						format: 'caf',
						support: '(Android/web 不支持)',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.caf'
					},
					{
						format: '错误格式',
						support: '(iOS/Android/web 不支持)',
						src: 'https://web-ext-storage.dcloud.net.cn/uni-app-x/audio/ForElise.wmaa'
					},
				] as Array<AudioFormat>
			}
		},
		onReady() {
			this._audioContext = uni.createInnerAudioContext();
			this._audioContext!.onPlay(() => {
				console.log('开始播放');
			});
			this._audioContext!.onPause(() => {
				console.log('播放暂停');
			})
			this._audioContext!.onEnded(() => {
				console.log('播放结束');
				this.isPlaying = false;
			});
			this._audioContext!.onError((err) => {
				this.isPlaying = false;
				console.log('err', err);
			});
		},
		onUnload() {
			if (this._audioContext != null) {
				this.pause();
				this._audioContext!.destroy()
			}
		},
		methods: {
			pause() {
				this._audioContext!.pause();
				this.isPlaying = false;
			},
			play(audioUrl : string, index : number) {
				// console.log(index,audioUrl);
				if (this.isPlaying && this.playIndex == index) {
					this.pause();
					return;
				}
				this.playIndex = index
				this._audioContext!.src = audioUrl;
				this._audioContext!.play();
				this.isPlaying = true;
			},
		},
	})

export default __sfc__
function GenPagesAPICreateInnerAudioContextInnerAudioFormatRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("scroll-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"}))
    }), [
      createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.supportFormats, (item, index, __index, _cached): any => {
          return createElementVNode("view", utsMapOf({
            class: "formats",
            key: index
          }), [
            createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), toDisplayString(item.format), 1 /* TEXT */),
            createElementVNode("image", utsMapOf({
              class: "icon-play",
              src: (_ctx.isPlaying && _ctx.playIndex==index)?'/static/pause.png':'/static/play.png',
              onClick: () => {_ctx.play(item.src,index)}
            }), null, 8 /* PROPS */, ["src", "onClick"])
          ])
        }), 128 /* KEYED_FRAGMENT */),
        createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.notSupportFormats, (item, index, __index, _cached): any => {
          return createElementVNode("view", utsMapOf({
            class: "formats",
            key: index
          }), [
            createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), toDisplayString(item.format + (item.support)), 1 /* TEXT */),
            createElementVNode("image", utsMapOf({
              class: "icon-play",
              src: (_ctx.isPlaying && _ctx.playIndex==index)?'/static/pause.png':'/static/play.png',
              onClick: () => {_ctx.play(item.src,index)}
            }), null, 8 /* PROPS */, ["src", "onClick"])
          ])
        }), 128 /* KEYED_FRAGMENT */)
      ])
    ], 4 /* STYLE */)
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPICreateInnerAudioContextInnerAudioFormatStyles = [utsMapOf([["formats", padStyleMapOf(utsMapOf([["alignItems", "center"]]))], ["icon-play", padStyleMapOf(utsMapOf([["width", 60], ["height", 60], ["marginTop", 10], ["marginRight", 10], ["marginBottom", 10], ["marginLeft", 10]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
