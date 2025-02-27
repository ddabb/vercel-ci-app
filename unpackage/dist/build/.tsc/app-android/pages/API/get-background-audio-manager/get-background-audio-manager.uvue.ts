
	const __sfc__ = defineComponent({
		data() {
			return {
				title: 'backgroundAudio',
				bgAudioMannager: null as BackgroundAudioManager | null,
				dataUrl: 'https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3',
				playing: false,
				playTime: 0,
				formatedPlayTime: '00:00:00',
				count: 100,
				isPlayEnd: false,
				duration: 100,
				currentTime: 0,
				_isChanging: false,
				buffered: 0,
			}
		},
		computed: {
			position() {
				return this.isPlayEnd ? 0 : this.currentTime;
			},
		},
		onLoad: function () {
			let bgAudioMannager = uni.getBackgroundAudioManager();
			bgAudioMannager.title = '致爱丽丝' + this.count;
			bgAudioMannager.epname = '专辑名：致爱丽丝' + this.count
			bgAudioMannager.singer = '歌手：暂无' + this.count;
			bgAudioMannager.coverImgUrl = 'https://web-assets.dcloud.net.cn/unidoc/zh/Alice.jpeg';
			bgAudioMannager.src = this.dataUrl;
      this.currentTime = bgAudioMannager.currentTime
      this.duration = bgAudioMannager.duration
			bgAudioMannager.onCanplay(() => {
				console.log("音频进入可以播放状态事件");
				this.buffered = bgAudioMannager.buffered;
				this.duration = bgAudioMannager.duration
			})
			bgAudioMannager.onPlay(() => {
				console.log("开始播放");
				this.playing = true;
			})
			bgAudioMannager.onPause(() => {
				console.log("暂停播放");
				this.playing = false;
			})
			bgAudioMannager.onStop(() => {
				console.log("停止播放");
				this.playing = false;
			})
			bgAudioMannager.onEnded(() => {
				console.log("播放结束");
				this.playing = false;
				this.currentTime = 0;
				this.isPlayEnd = true;
				(this.$refs["slider"] as UniSliderElement).value = 0
			})
			bgAudioMannager.onNext(() => {
				this.count++
				console.log("下一曲", this.count);
				this.bgAudioMannager?.stop()
				bgAudioMannager.title = '致爱丽丝' + this.count;
				bgAudioMannager.singer = '歌手：暂无' + this.count;
				this.dataUrl = 'https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3'
				bgAudioMannager.coverImgUrl = 'https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/music-a.png';
				this.bgAudioMannager!.src = this.dataUrl;
				this.bgAudioMannager?.play()
			})
			bgAudioMannager.onPrev(() => {
				this.count--
				console.log("上一曲", this.count);
				this.bgAudioMannager?.stop()
				bgAudioMannager.title = '致爱丽丝' + this.count;
				bgAudioMannager.singer = '歌手：暂无' + this.count;
				this.dataUrl = 'https://web-ext-storage.dcloud.net.cn/uni-app/ForElise.mp3'
				bgAudioMannager.coverImgUrl = 'https://web-assets.dcloud.net.cn/unidoc/zh/Alice.jpeg';
				this.bgAudioMannager!.src = this.dataUrl;
				this.bgAudioMannager?.play()
			})
			bgAudioMannager.onSeeking(() => {
				console.log('音频进行 seek 操作事件');
			})
			bgAudioMannager.onSeeked(() => {
				console.log('音频完成 seek 操作事件');
			})
			bgAudioMannager.onWaiting(() => {
				console.log('音频加载中事件');
			})
			bgAudioMannager.onTimeUpdate(() => {
				console.log('onTimeUpdate', bgAudioMannager.currentTime)
				if (this._isChanging) { return; }
				this.currentTime = this.bgAudioMannager!.currentTime;
				this.buffered = this.bgAudioMannager!.buffered;
				console.log('onTimeUpdateCb', this.currentTime)








				if (this.currentTime > this.buffered) {
					console.log('缓冲不足');
				}
			})
			bgAudioMannager.onError((err) => {
				console.log('播放出错err', err);
			})
			this.bgAudioMannager = bgAudioMannager;
			this.playing = !bgAudioMannager.paused
			console.log('currentTime=', this.bgAudioMannager!.currentTime, this.bgAudioMannager!.currentTime == 0)
		},
		methods: {
			play: function () {
				console.log('play')
				this.isPlayEnd = false;
				this.bgAudioMannager!.play()
			},
			pause: function () {
				this.bgAudioMannager?.pause();
			},
			stop: function () {
				this.bgAudioMannager?.stop();
				this.playing = false
			},
			onchanging() {
				this._isChanging = true;
			},
			onchange(e : UniSliderChangeEvent) {
				let pos = e.detail.value;
				console.log('pos', pos);
				this.bgAudioMannager!.seek(pos);
				this._isChanging = false;
			},
		}
	})

export default __sfc__
function GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)
const _component_slider = resolveComponent("slider")

  return createElementVNode("view", null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("text", null, " 注意：1.离开当前页面后背景音乐将保持播放；\n 2. 硬退出app、调用stop api、播放结束都会清理后台控制中心和锁屏信息显示 "),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
        createVNode(_component_slider, utsMapOf({
          ref: "slider",
          value: _ctx.position,
          min: 0,
          max: _ctx.duration,
          onChanging: _ctx.onchanging,
          onChange: _ctx.onchange
        }), null, 8 /* PROPS */, ["value", "max", "onChanging", "onChange"])
      ]),
      createElementVNode("view", utsMapOf({ class: "page-body-buttons" }), [
        isTrue(_ctx.playing)
          ? createElementVNode(Fragment, utsMapOf({ key: 0 }), [
              createElementVNode("view", utsMapOf({
                class: "page-body-button",
                onClick: _ctx.stop
              }), [
                createElementVNode("image", utsMapOf({
                  class: "image",
                  src: "/static/stop.png"
                }))
              ], 8 /* PROPS */, ["onClick"]),
              createElementVNode("view", utsMapOf({
                class: "page-body-button",
                onClick: _ctx.pause,
                style: normalizeStyle(utsMapOf({"margin-top":"20px"}))
              }), [
                createElementVNode("image", utsMapOf({
                  class: "image",
                  src: "/static/pause.png"
                }))
              ], 12 /* STYLE, PROPS */, ["onClick"])
            ], 64 /* STABLE_FRAGMENT */)
          : createCommentVNode("v-if", true),
        isTrue(!_ctx.playing)
          ? createElementVNode("view", utsMapOf({
              key: 1,
              class: "page-body-button",
              onClick: _ctx.play
            }), [
              createElementVNode("image", utsMapOf({
                class: "image",
                src: "/static/play.png"
              }))
            ], 8 /* PROPS */, ["onClick"])
          : createCommentVNode("v-if", true),
        createElementVNode("view", utsMapOf({ class: "page-body-button" }))
      ])
    ])
  ])
}
const GenPagesAPIGetBackgroundAudioManagerGetBackgroundAudioManagerStyles = [utsMapOf([["image", padStyleMapOf(utsMapOf([["width", "150rpx"], ["height", "150rpx"]]))], ["page-body-text", padStyleMapOf(utsMapOf([["paddingTop", 0], ["paddingRight", "30rpx"], ["paddingBottom", 0], ["paddingLeft", "30rpx"]]))], ["page-body-wrapper", padStyleMapOf(utsMapOf([["marginTop", 0]]))], ["page-body-info", padStyleMapOf(utsMapOf([["paddingBottom", "50rpx"]]))], ["time-big", padStyleMapOf(utsMapOf([["fontSize", "60rpx"], ["marginTop", "20rpx"], ["marginRight", "20rpx"], ["marginBottom", "20rpx"], ["marginLeft", "20rpx"]]))], ["slider", padStyleMapOf(utsMapOf([["width", "630rpx"]]))], ["play-time", padStyleMapOf(utsMapOf([["width", "100%"], ["paddingTop", "20rpx"], ["paddingRight", 0], ["paddingBottom", "20rpx"], ["paddingLeft", 0], ["display", "flex"], ["justifyContent", "space-between"], ["boxSizing", "border-box"]]))], ["page-body-buttons", padStyleMapOf(utsMapOf([["display", "flex"], ["justifyContent", "center"], ["marginTop", "100rpx"], ["flexDirection", "column"]]))], ["page-body-button", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["justifyContent", "center"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
