
  const __sfc__ = defineComponent({
    data() {
      return {
        connected: false,
        connecting: false,
        msg: '',
        roomId: '',
        platform: '',
      }
    },
    computed: {
      showMsg() : string {
        if (this.connected) {
          if (this.msg.length > 0) {
            return '收到消息：' + this.msg
          } else {
            return '等待接收消息'
          }
        } else {
          return '尚未连接'
        }
      },
    },
    onLoad() {
      this.platform = uni.getDeviceInfo().platform as string
    },
    onUnload() {
      uni.closeSocket({
        code: 1000,
        reason: 'close reason from client',
        success: (res : any) => {
          console.log('uni.closeSocket success', res)
        },
        fail: (err : any) => {
          console.log('uni.closeSocket fail', err)
        },
      } as CloseSocketOptions)
      uni.hideLoading()
    },
    methods: {
      connect() {
        if (this.connected || this.connecting) {
          uni.showModal({
            content: '正在连接或者已经连接，请勿重复连接',
            showCancel: false,
          })
          return
        }
        this.connecting = true
        uni.showLoading({
          title: '连接中...',
        })
        uni.connectSocket({
          url: 'ws://websocket.dcloud.net.cn',
          header: null,
          protocols: null,
          success: (res : any) => {
            // 这里是接口调用成功的回调，不是连接成功的回调，请注意
            console.log('uni.connectSocket success', res)
          },
          fail: (err : any) => {
            // 这里是接口调用失败的回调，不是连接失败的回调，请注意
            console.log('uni.connectSocket fail', err)
          },
        })
        uni.onSocketOpen((res) => {
          this.connecting = false
          this.connected = true
          uni.hideLoading()

          uni.showToast({
            icon: 'none',
            title: '连接成功',
          })
          console.log('onOpen', res)
        })
        uni.onSocketError((err) => {
          this.connecting = false
          this.connected = false
          uni.hideLoading()

          uni.showModal({
            content: '连接失败，可能是websocket服务不可用，请稍后再试',
            showCancel: false,
          })
          console.log('onError', err)
        })
        uni.onSocketMessage((res) => {
          this.msg = res.data as string
          console.log('onMessage', res)
        })
        uni.onSocketClose((res) => {
          this.connected = false
          this.msg = ''
          console.log('onClose', res)
        })
      },
      send() {
        uni.sendSocketMessage({
          data:
            'from ' +
            this.platform +
            ' : ' +
            parseInt((Math.random() * 10000).toString()).toString(),
          success: (res : any) => {
            console.log(res)
          },
          fail: (err : any) => {
            console.log(err)
          },
        } as SendSocketMessageOptions)
      },
      close() {
        uni.closeSocket({
          code: 1000,
          reason: 'close reason from client',
          success: (res : any) => {
            console.log('uni.closeSocket success', res)
          },
          fail: (err : any) => {
            console.log('uni.closeSocket fail', err)
          },
        } as CloseSocketOptions)
      },
      goSocketTask() {
        uni.navigateTo({
          url: '/pages/API/websocket/socketTask',
        })
      }
    },
  })

export default __sfc__
function GenPagesAPIWebsocketWebsocketRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode(Fragment, null, [
    createVNode(_component_page_head, utsMapOf({ title: "websocket通讯示例" })),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
      createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
        createElementVNode("text", utsMapOf({ class: "websocket-msg" }), toDisplayString(_ctx.showMsg), 1 /* TEXT */),
        createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "primary",
          onClick: _ctx.connect
        }), " 连接websocket服务 ", 8 /* PROPS */, ["onClick"]),
        withDirectives(createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "primary",
          onClick: _ctx.send
        }), " 发送一条消息 ", 8 /* PROPS */, ["onClick"]), [
          [vShow, _ctx.connected]
        ]),
        createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "primary",
          onClick: _ctx.close
        }), " 断开websocket服务 ", 8 /* PROPS */, ["onClick"]),
        createElementVNode("text", utsMapOf({ class: "websocket-tips" }), "发送消息后会收到一条服务器返回的消息（与发送的消息内容一致）"),
        createElementVNode("button", utsMapOf({
          class: "uni-btn-v",
          type: "primary",
          onClick: _ctx.goSocketTask
        }), " 跳转 socketTask 示例 ", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ], 64 /* STABLE_FRAGMENT */)
}
const GenPagesAPIWebsocketWebsocketStyles = [utsMapOf([["uni-btn-v", padStyleMapOf(utsMapOf([["paddingTop", 5], ["paddingRight", 0], ["paddingBottom", 5], ["paddingLeft", 0], ["marginTop", 10], ["marginRight", 0], ["marginBottom", 10], ["marginLeft", 0]]))], ["websocket-msg", padStyleMapOf(utsMapOf([["paddingTop", 40], ["paddingRight", 0], ["paddingBottom", 40], ["paddingLeft", 0], ["textAlign", "center"], ["fontSize", 14], ["lineHeight", "40px"], ["color", "#666666"]]))], ["websocket-tips", padStyleMapOf(utsMapOf([["paddingTop", 40], ["paddingRight", 0], ["paddingBottom", 40], ["paddingLeft", 0], ["textAlign", "center"], ["fontSize", 14], ["lineHeight", "24px"], ["color", "#666666"]]))]])]

import _easycom_page_head from '@/components/page-head/page-head.vue'
