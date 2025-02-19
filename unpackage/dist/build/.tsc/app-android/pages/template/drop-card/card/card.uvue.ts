
  let sX : number = 0,
    sY : number = 0,
    screenWidth : number = 1,
    screenHeight : number = 1,
    floating : boolean = false,
    touchstartAfter : boolean = false;
  const __sfc__ = defineComponent({
    options: {
      virtualHost: true
    },
    data() {
      return {
        $elementMap: new Map<string, UniElement>(),
        x: 0 as number,
        y: 0 as number,
        // 飘走的卡片计数
        floatCount: 0 as number
      }
    },
    props: {
      img: {
        type: String,
        default: "https://web-ext-storage.dcloud.net.cn/hello-uni-app-x/drop-card-1.jpg"
      },
      cardIndex: {
        type: Number,
        default: 0
      }
    },
    computed: {
      movePercent() : number {
        return Math.abs(this.x) / (screenWidth / 2 * 3)
      },
      likeOpacity() : number {
        return this.x < 0 ? 0 : this.movePercent * 100
      },
      dislikeOpacity() : number {
        return this.x > 0 ? 0 : this.movePercent * 100
      }
    },
    mounted() {
      screenWidth = uni.getWindowInfo().screenWidth
      screenHeight = uni.getWindowInfo().screenHeight;

      // TODO 需要延迟设置才能生效
      setTimeout(() => {
        this.setElementStyle('card', 'height', screenHeight * 0.7 + 'px');
        this.setElementStyle('card-img', 'height', screenHeight * 0.7 + 'px');
        this.initCardStyle()
      }, 200)

      uni.$on('uni-drop-card-float', () => {
        this.floatCount++
        this.initCardStyle()
      })

    },
    unmounted() {
      uni.$off('uni-drop-card-float')
    },
    methods: {
      initCardStyle() {
        let _index = (this.cardIndex + this.floatCount) % 3
        // console.log('~~~~~~_index:'+_index + ' cardIndex:'+this.cardIndex+' floatCount:'+this.floatCount);
        this.setElementStyle('card', 'z-index', _index)
        this.setElementStyle('card', 'margin-top', screenHeight * 0.15 - 30 * _index + 'px');
        this.setElementStyle('card', 'transform', 'scale(' + (0.9 + 0.05 * _index) + ')')
      },
      // 工具方法，用于快速设置 Element 的 style
      setElementStyle(refName : string, propertyName : string, propertyStyle : any) : void {
        const elementMap = this.$data['$elementMap'] as Map<string, UniElement>
        let element : UniElement | null = elementMap.get(refName)
        if (element == null) {
          element = this.$refs[refName] as UniElement;
          elementMap.set(refName, element)
        } else {
          // console.log('直接拿');
        }
        element.style.setProperty(propertyName, propertyStyle);
      },
      touchstart(e : TouchEvent) {
        // console.log('touchstart')
        if (floating) {
          return // 浮动动画进行中
        }
        sX = e.touches[0].screenX;
        sY = e.touches[0].screenY;
        this.x = 0
        this.y = 0

        touchstartAfter = true
      },
      touchmove(e : TouchEvent) {
        // console.log('touchmove')
        if (!touchstartAfter || floating) {
          return // floating：浮动动画进行中
        }
        this.x += e.touches[0].screenX - sX;
        this.y += e.touches[0].screenY - sY;
        sX = e.touches[0].screenX;
        sY = e.touches[0].screenY;
        this.moveCard()




      },
      touchend() {
        // console.log('touchend')
        touchstartAfter = false
        if (floating) {
          return // 浮动动画进行中
        }
        floating = true

        // 设置释放之后飘走的方向 0回到坐标中心 1向右 2向左
        let k : number = 0;
        if (this.x > screenWidth / 10) {
          k = 1
        } else if (this.x < screenWidth * -1 / 10) {
          k = -1
        }

        const _this = this
        function cardTo(x : number, y : number, callback : () => void, speed : number = 10) {
          let interval : number = 0
          let acceleration : number = 1
          interval = setInterval(() => {
            // 加速度
            acceleration += 0.2

            const dx = x - _this.x
            if (Math.abs(dx) < 1) {
              _this.x = x
            } else {
              _this.x += dx / speed * acceleration
            }

            const dy = y - _this.y
            if (Math.abs(dy) < 1) {
              _this.y = y
            } else {
              _this.y += dy / speed * acceleration
            }

            _this.moveCard()
            if (_this.x == x && _this.y == y) {
              clearInterval(interval)
              callback()
            }
          }, 16)
        }

        if (Math.floor(k) != 0) {
          cardTo(k * screenWidth * 1.3, this.y * 3, () => {
            //  状态图标变回透明
            this.setElementStyle("state-icon-like", 'opacity', 0)
            this.setElementStyle("state-icon-dislike", 'opacity', 0)

            // 设置为透明，防止飘回时因为 margin-top 太高，露出来
            this.setElementStyle("card", 'opacity', 0)
            setTimeout(() => {
              this.setElementStyle("card", 'opacity', 1)
            }, 300)

            // 执行卡片飘动后事件，注意uni.$emit是全局事件。其他卡片也会执行
            uni.$emit('uni-drop-card-float', null)
            floating = false
          }, 8)
        } else {
          const _x : number = this.x
          const _y : number = this.y
          cardTo(Math.floor(_x * -0.05), Math.floor(_y * -0.05), () => {
            cardTo(0, 0, () => {
              console.log('bounce')
              floating = false
            }, 30)
          })
        }
      },
      moveCard() {
        this.setElementStyle("card",
          'transform',
          `translate(${this.x}px,${this.y}px) rotate(${this.x / -30}deg) scale(1)`
        )
        this.setElementStyle("state-icon-like", 'opacity', this.x < 0 ? 0 : this.movePercent * 10)
        this.setElementStyle("state-icon-dislike", 'opacity', this.x > 0 ? 0 : this.movePercent * 10)
      }
    }
  })

export default __sfc__
function GenPagesTemplateDropCardCardCardRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    class: "card",
    ref: "card",
    onTouchstart: ($event: any) => {_ctx.touchstart($event as TouchEvent)},
    onTouchmove: ($event: any) => {_ctx.touchmove($event as TouchEvent)},
    onTouchend: _ctx.touchend,
    onTouchcancel: _ctx.touchend
  }), [
    createElementVNode("image", utsMapOf({
      class: "card-img",
      ref: "card-img",
      src: _ctx.img
    }), null, 8 /* PROPS */, ["src"]),
    createElementVNode("view", utsMapOf({ class: "state" }), [
      createElementVNode("image", utsMapOf({
        class: "state-icon like",
        ref: "state-icon-like",
        src: "/static/template/drop-card/like.png",
        mode: "widthFix"
      }), null, 512 /* NEED_PATCH */),
      createElementVNode("image", utsMapOf({
        class: "state-icon dislike",
        ref: "state-icon-dislike",
        src: "/static/template/drop-card/dislike.png",
        mode: "widthFix"
      }), null, 512 /* NEED_PATCH */)
    ])
  ], 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend", "onTouchcancel"])
}
const GenPagesTemplateDropCardCardCardStyles = [utsMapOf([["card", padStyleMapOf(utsMapOf([["width", "95%"], ["height", 0], ["position", "absolute"], ["top", 0], ["marginTop", 50], ["marginRight", 12], ["marginBottom", 0], ["marginLeft", 12], ["borderRadius", 10], ["boxShadow", "0 0 5px rgba(0, 0, 0, 0.1)"], ["backgroundColor", "#FFFFFF"], ["transitionProperty", "marginTop"], ["transitionDuration", "300ms"], ["transitionTimingFunction", "ease-in"]]))], ["card-img", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 0], ["borderRadius", 10]]))], ["state", padStyleMapOf(utsMapOf([["top", 10], ["left", 10], ["width", "86%"], ["paddingTop", 4], ["paddingRight", 4], ["paddingBottom", 4], ["paddingLeft", 4], ["position", "absolute"], ["flexDirection", "row"], ["justifyContent", "space-between"]]))], ["state-icon", padStyleMapOf(utsMapOf([["width", 30], ["height", 30], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#FFFFFF"], ["backgroundColor", "#FFFFFF"], ["paddingTop", 3], ["paddingRight", 3], ["paddingBottom", 3], ["paddingLeft", 3], ["borderRadius", 100], ["boxShadow", "0 0 1px #EBEBEB"], ["opacity", 0]]))], ["@TRANSITION", utsMapOf([["card", utsMapOf([["property", "marginTop"], ["duration", "300ms"], ["timingFunction", "ease-in"]])]])]])]
