
  const __sfc__ = defineComponent({
    data() {
      return {
        title: '一键登录',
        univerifyManager: null as UniverifyManager | null,
        phone: '',
        slogan: '',
        privacyName: '',
        privacyUrl: ''
      }
    },
    onLoad() {
      this.univerifyManager = uni.getUniverifyManager();
      // 预登录
      this.preLogin(() => { });
    },
    methods: {
      customLoginIn() {
        const isPreLoginValid = this.univerifyManager?.isPreLoginValid() ?? false;
        if (isPreLoginValid) {
          this.pushCustomPage();
        } else {
          this.preLogin(() => {
            this.pushCustomPage();
          })
        }
      },
      pushCustomPage() {
        const url = '/pages/API/get-univerify-manager/univerify-custom-page?phone=' + this.phone + '&slogan=' + this.slogan + '&name=' + this.privacyName + '&link=' + this.privacyUrl;
        uni.openDialogPage({
          url: url,
          animationType: 'slide-in-bottom',
          success(res) {
            console.log("成功打开自定义登录页面");
          },
          fail(err) {
            console.log(err);
          }
        })
      },
      verify(fullScreen : boolean) {
        // 校验预登录是否有效
        const isPreLoginValid = this.univerifyManager?.isPreLoginValid() ?? false;
        if (isPreLoginValid) {
          // 预登录有效，执行登录
          this.login(fullScreen);
        } else {
          // 预登录无效，执行预登录
          this.preLogin(() => {
            this.login(fullScreen);
          })
        }
      },
      preLogin(callback: (() => void)) {
        this.univerifyManager?.preLogin({
          success: (res) => {
            this.phone = res.number;
            this.slogan = res.slogan;
            this.privacyName = res.privacyName;
            this.privacyUrl = res.privacyUrl;
            console.log("pre login success");
            callback();
          },
          fail: (err) => {
            console.error("pre login fail => " + JSON.stringify(err));
            uni.showModal({
              title: '预登录失败',
              content: JSON.parseObject(err.cause?.cause?.message ?? "")?.getString("errorDesc") ?? err.errMsg,
              showCancel: false
            });
          }
        });
      },
      login(fullScreen : boolean) {
        this.univerifyManager?.login({
          univerifyStyle:{
            fullScreen: fullScreen,
            backgroundColor: "#FFFFFF",
            loginBtnText: "一键登录",
            logoPath: "/static/logo.png"
          },
          success: (res) => {
            console.log("login success => " + JSON.stringify(res));
            this.takePhoneNumber(res.accessToken,res.openId);
          },
          fail: (err) => {
            console.error("login fail => " + err);
            uni.showModal({
              title: '登录失败',
              content: JSON.parseObject(err.cause?.cause?.message ?? "")?.getString("errorDesc") ?? err.errMsg,
              showCancel: false
            });
          }
        });
      },
      takePhoneNumber(accessToken : string, openId : string) {
        // 云函数取号
        uniCloud.callFunction({
          name: 'univerify',
          data: {
            access_token: accessToken, // 客户端一键登录接口返回的access_token
            openid: openId // 客户端一键登录接口返回的openid
          }
        }).then(res => {
          // 关闭登录页
          this.univerifyManager?.close();
          setTimeout(() => {
            uni.showModal({
              title: '取号成功',
              content: res.result.getJSON("res")?.getString("phoneNumber"),
              showCancel: false
            });
          }, 100);
        }).catch(err => {
          console.error(JSON.stringify(err));
          // 关闭登录页
          this.univerifyManager?.close();
          setTimeout(() => {
            uni.showModal({
              title: '取号失败',
              content: (err as Error).message,
              showCancel: false
            });
          }, 100);
        });

      }
    }
  })

export default __sfc__
function GenPagesAPIGetUniverifyManagerGetUniverifyManagerRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("view", null, [
    createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
        createElementVNode("button", utsMapOf({
          type: "default",
          onClick: () => {_ctx.verify(false)}
        }), "一键登录（半屏）", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
        createElementVNode("button", utsMapOf({
          type: "default",
          onClick: () => {_ctx.verify(true)}
        }), "一键登录（全屏）", 8 /* PROPS */, ["onClick"])
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
        createElementVNode("button", utsMapOf({
          type: "default",
          onClick: () => {_ctx.customLoginIn()}
        }), "一键登录（自定义页面）", 8 /* PROPS */, ["onClick"])
      ])
    ])
  ])
}
const GenPagesAPIGetUniverifyManagerGetUniverifyManagerStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
