
  type Point = {
    x : number
    y : number
  };

  const __sfc__ = defineComponent({
    data() {
      return {
        lastPointX: 0,
        lastPointY: 0,
        offsetX: 0,
        offsetY: 0,
        renderingContext: null as CanvasRenderingContext2D | null,
      }
    },
    onReady() {
      uni.createCanvasContextAsync({
        id: 'tablet',
        // component: this,
        success: (context : CanvasContext) => {
          console.log('success');
          this.renderingContext = context.getContext('2d')!;
          const canvas = this.renderingContext!.canvas;

          const dpr = uni.getWindowInfo().pixelRatio;
          canvas.width = canvas.offsetWidth * dpr
          canvas.height = canvas.offsetHeight * dpr
          this.renderingContext!.scale(dpr, dpr)


          const elRect = canvas.getBoundingClientRect()
          this.offsetX = elRect.left
          this.offsetY = elRect.top

        }
      })
    },
    methods: {
      touchStart(event : TouchEvent) {
        const position = this.getPosition(event)
        this.lastPointX = position.x
        this.lastPointY = position.y
      },
      touchMove(event : TouchEvent) {
        const position = this.getPosition(event)
        const x = position.x
        const y = position.y

        const ctx = this.renderingContext!
        ctx.lineWidth = 5
        ctx.lineCap = "round"
        ctx.lineJoin = "round"
        ctx.beginPath()
        ctx.moveTo(this.lastPointX, this.lastPointY)
        ctx.lineTo(x, y)
        ctx.stroke()

        this.lastPointX = x
        this.lastPointY = y
      },
      touchEnd(_ : TouchEvent) {
      },
      doClear() {
        if (this.renderingContext != null) {
          this.renderingContext!.clearRect(0, 0, this.renderingContext!.canvas.width, this.renderingContext!.canvas.height)
        }
      },
      getPosition(event : TouchEvent) : Point {
        const touch = event.touches[0]

        return {
          x: touch.clientX - this.offsetX,
          y: touch.clientY - this.offsetY
        } as Point








      }
    }
  })

export default __sfc__
function GenPagesComponentCanvasCanvasDoodleRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", null, [
    createElementVNode("canvas", utsMapOf({
      class: "drawing",
      id: "tablet",
      onTouchstart: _ctx.touchStart,
      onTouchmove: _ctx.touchMove,
      onTouchend: _ctx.touchEnd
    }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart", "onTouchmove", "onTouchend"]),
    createElementVNode("button", utsMapOf({
      onClick: () => {_ctx.doClear()}
    }), "清空", 8 /* PROPS */, ["onClick"])
  ])
}
const GenPagesComponentCanvasCanvasDoodleStyles = [utsMapOf([["drawing", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 500], ["backgroundColor", "#D3D3D3"], ["marginBottom", 15]]))]])]
