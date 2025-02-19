
  type ListItem = { _id : string, content : string, src : string, poster_src : string }
  let page : number = 0,
    currentPageIsShow : boolean = true;

  const __sfc__ = defineComponent({
    components: {},
    data() {
      return {
        $videoContextMap: new Map<string, VideoContext>(),
        list: [] as ListItem[],
        visibleList: [] as ListItem[],// 提高性能 可见的只有3个
        current: 0 as number,
        index: 0,
        state: ["pause", "unPlay", "unPlay"] as string[],
        showDebugInfo: false as boolean
      }
    },
    created() {
      this.list = this.getData()
      this.visibleList = this.list.slice(0, 3)
    },
    watch: {
      current(current : number, oldCurrent : number) {
        let changeNumber = current - oldCurrent
        if (changeNumber == 1 || changeNumber == -2) {
          // console.error('向右');
          this.index++
        } else {
          // console.error('向左');
          this.index--
        }
        // //翻页（3项为一页）
        if (Math.abs(changeNumber) == 2) {
          // console.log('翻页');
          page = Math.floor(this.index / 3);
          // console.log(this.index);
          // console.log('page',page);
          // console.log('slice',3*page,3*page+3);
          if (this.list.length < 3 * page + 3) {
            let list : ListItem[] = this.getData()
            this.list.push(...list)
          }

          let visibleList = this.list.slice(3 * page, 3 * page + 3)
          // 换数据
          this.visibleList = visibleList
        }

        this.state.forEach((_ : string, index : number) => {
          if (index === current) {
            this.doPlay(current)
          } else {
            // 除了选中的其他已经播放的都需要停止
            this.doStop(index)
            console.log('index:' + index + '已被执行停止');
          }
        })
      }
    },
    onReady() {

      //  非web端，一启动完成，就播放第一个。因为 web端浏览器限制不支持自动播放
      this.doPlay(0);
      //App端适配不同状态栏高度
      let backElement = this.$refs['back'] as UniElement;
      backElement.style.setProperty('top', uni.getWindowInfo().statusBarHeight+'px');

    },
    onShow() {
      currentPageIsShow = true
    },
    onHide() {
      currentPageIsShow = false
      console.log('pages-onHide');
      this.doPause(this.current)
    },
    onUnload() {
      this.doPause(this.current)
    },
    methods: {
      changeState(index : number) {
        if (this.state[index] === 'play') {
          this.doPause(index)
        } else {
          this.doPlay(this.current)
        }
      },
      onLoadstart(index : number) {
        console.error("onLoadstart  video" + index);
      },
      getVideoContext(index : number) : VideoContext {
        const videoContextMap = this.$data['$videoContextMap'] as Map<string, VideoContext>
        let videoContext : VideoContext | null = videoContextMap.get('video-' + index)
        if (videoContext == null) {
          videoContext = uni.createVideoContext('video-' + index, this) as VideoContext
          videoContextMap.set('video-' + index, videoContext)
        }
        return videoContext
      },
      doPlay(index : number) {
        console.log("doPlay  video" + index);
        this.getVideoContext(index).play()
      },
      doStop(index : number) {
        console.log("doStop  video-" + index);
        this.getVideoContext(index).stop();
        // TODO 临时方案：解决.stop()时触发了doPause的问题
        setTimeout(() => {
          this.state[index] = 'unPlay'
        }, 1000)
      },
      doPause(index : number) {
        this.getVideoContext(index).pause()
        console.log("doPause  video-" + index);
      },
      onPause(index : number) {
        this.state[index] = 'pause'
        console.log('onPause', index);
      },
      onPlay(index : number) {
        if (this.current != index || !currentPageIsShow) {
          this.onPause(index)
        } else {
          this.state[index] = 'play'
          console.log('onPlay', index);
        }
      },
      getData() : ListItem[] {
        let videoUrlList = [
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uts-5-16.mp4',
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uni-ai-5-16.mp4',
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/video/uni-verify-5-16.mp4'
        ] as string[]

        let posterSrcList = [
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-uts-01.png',
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-ai-01.png',
          'https://web-ext-storage.dcloud.net.cn/uni-app-x/dark-uni-verify-01.jpg'
        ] as string[]

        let list = [] as ListItem[];
        for (let i = 0; i < 6; i++) {
          let index = this.list.length + i;
          let listItem : ListItem = {
            "_id": "a00" + index,
            "content": "这是第" + index + "条数据，url地址" + videoUrlList[i % 3],
            "src": videoUrlList[i % 3],
            "poster_src": posterSrcList[i % 3]
          }
          list.push(listItem)
        }
        return list
      },
      onSwiperChange(e : SwiperChangeEvent) {
        // console.error('SwiperChangeEvent',e.detail.current);
        this.current = e.detail.current;
      },
      onTransition(/*e : SwiperTransitionEvent*/) {
        // console.log('onTransition e.detail.dx', e.detail.dx);
      },
      back() {
        uni.navigateBack({
          success(result) {
            console.log('navigateBack success', result.errMsg)
          },
          fail(error) {
            console.log('navigateBack fail', error.errMsg)
          },
          complete(result) {
            console.log('navigateBack complete', result.errMsg)
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "page" }), [
    createElementVNode("view", utsMapOf({
      ref: "back",
      onClick: _ctx.back,
      class: "nav-back"
    }), [
      createElementVNode("image", utsMapOf({
        class: "back-img",
        src: "/static/template/scroll-fold-nav/back.png",
        mode: "widthFix"
      }))
    ], 8 /* PROPS */, ["onClick"]),
    createElementVNode("swiper", utsMapOf({
      class: "swiper",
      current: _ctx.current,
      circular: _ctx.index != 0,
      vertical: true,
      onChange: _ctx.onSwiperChange,
      onTransition: _ctx.onTransition
    }), [
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.visibleList, (item, i, __index, _cached): any => {
        return createElementVNode("swiper-item", utsMapOf({
          class: "swiper-item",
          key: i
        }), [
          createElementVNode("video", utsMapOf({
            onClick: () => {_ctx.changeState(i)},
            ref_for: true,
            ref: "video",
            class: "video-box",
            id: 'video-'+i,
            onLoadstart: () => {_ctx.onLoadstart(i)},
            src: item.src,
            poster: item.poster_src,
            autoplay: false,
            "show-progress": false,
            "show-fullscreen-btn": false,
            "show-play-btn": false,
            "show-center-play-btn": false,
            loop: true,
            onPlay: () => {_ctx.onPlay(i)},
            onPause: () => {_ctx.onPause(i)},
            "http-cache": "true"
          }), null, 40 /* PROPS, NEED_HYDRATION */, ["onClick", "id", "onLoadstart", "src", "poster", "onPlay", "onPause"]),
          createElementVNode("view", utsMapOf({
            class: "video-cover",
            onClick: () => {_ctx.changeState(i)}
          }), [
            _ctx.state[i] === 'pause'
              ? createElementVNode("image", utsMapOf({
                  key: 0,
                  class: "play-btn",
                  src: "/static/template/swiper-vertical-video/play.png",
                  mode: "widthFix"
                }))
              : createCommentVNode("v-if", true)
          ], 8 /* PROPS */, ["onClick"]),
          isTrue(_ctx.showDebugInfo)
            ? createElementVNode("view", utsMapOf({
                key: 0,
                class: "video-info"
              }), [
                createElementVNode("text", utsMapOf({ class: "video-info-text" }), "容器：第 " + toDisplayString(i) + " 个", 1 /* TEXT */),
                createElementVNode("text", utsMapOf({ class: "video-info-text" }), "内容：" + toDisplayString(item.content), 1 /* TEXT */)
              ])
            : createCommentVNode("v-if", true)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ], 40 /* PROPS, NEED_HYDRATION */, ["current", "circular", "onChange", "onTransition"]),
    isTrue(_ctx.showDebugInfo)
      ? createElementVNode("view", utsMapOf({
          key: 0,
          class: "debug-info"
        }), [
          createElementVNode("text", utsMapOf({ class: "status-text" }), "debug-info 播放状态:"),
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.state, (value, index, __index, _cached): any => {
            return createElementVNode("text", utsMapOf({ class: "status-text" }), "第" + toDisplayString(index+1) + "个:" + toDisplayString(value), 1 /* TEXT */)
          }), 256 /* UNKEYED_FRAGMENT */)
        ])
      : createCommentVNode("v-if", true)
  ])
}
const GenPagesTemplateSwiperVerticalVideoSwiperVerticalVideoStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1]]))], ["swiper", padStyleMapOf(utsMapOf([["width", "100%"], ["flex", 1], ["height", "100%"]]))], ["swiper-item", padStyleMapOf(utsMapOf([["width", "100%"], ["flex", 1], ["height", "100%"], ["position", "relative"]]))], ["video-box", padStyleMapOf(utsMapOf([["width", "100%"], ["flex", 1], ["height", "100%"]]))], ["video-cover", padStyleMapOf(utsMapOf([["width", "100%"], ["flex", 1], ["height", "100%"], ["position", "absolute"], ["justifyContent", "center"], ["alignItems", "center"], ["alignContent", "center"]]))], ["play-btn", padStyleMapOf(utsMapOf([["width", 40], ["height", 40]]))], ["video-info", padStyleMapOf(utsMapOf([["position", "absolute"], ["bottom", 0], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["video-info-text", padStyleMapOf(utsMapOf([["fontSize", 14], ["color", "#FF0000"], ["lineHeight", "20px"]]))], ["debug-info", padStyleMapOf(utsMapOf([["position", "fixed"], ["top", 15], ["width", "100%"], ["backgroundColor", "rgba(255,255,255,0.3)"]]))], ["status-text", padStyleMapOf(utsMapOf([["color", "#FF0000"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15]]))], ["nav-back", padStyleMapOf(utsMapOf([["position", "absolute"], ["top", 35], ["backgroundColor", "rgba(220,220,220,0.8)"], ["borderRadius", 100], ["marginTop", 6], ["marginRight", 6], ["marginBottom", 6], ["marginLeft", 6], ["width", 32], ["height", 32], ["justifyContent", "center"], ["alignItems", "center"], ["zIndex", 10]]))], ["back-img", utsMapOf([[".nav-back ", utsMapOf([["width", 18], ["height", 18]])]])]])]
