
  const __sfc__ = defineComponent({
    data() {
      return {
        myOptions: {} as UTSJSONObject,
      }
    },
    onLoad(options) {
      console.log('options: ', options)
      this.myOptions['order_no'] = options['order_no'] as string;
      this.myOptions['out_trade_no'] = options['out_trade_no'] as string;
    },
    methods: {

    }
  })

export default __sfc__
function GenPagesAPIRequestPaymentRequestPaymentOrderDetailRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "app" }), [
    createElementVNode("view", null, [
      createElementVNode("text", null, "你自己的业务系统订单详情页面")
    ]),
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"margin-top":"20rpx"}))
    }), [
      createElementVNode("text", null, "order_no：" + toDisplayString(_ctx.myOptions['order_no']), 1 /* TEXT */)
    ], 4 /* STYLE */),
    createElementVNode("view", utsMapOf({
      style: normalizeStyle(utsMapOf({"margin-top":"20rpx"}))
    }), [
      createElementVNode("text", null, "out_trade_no：" + toDisplayString(_ctx.myOptions['out_trade_no']), 1 /* TEXT */)
    ], 4 /* STYLE */)
  ])
}
const GenPagesAPIRequestPaymentRequestPaymentOrderDetailStyles = [utsMapOf([["app", padStyleMapOf(utsMapOf([["paddingTop", "30rpx"], ["paddingRight", "30rpx"], ["paddingBottom", "30rpx"], ["paddingLeft", "30rpx"]]))]])]
