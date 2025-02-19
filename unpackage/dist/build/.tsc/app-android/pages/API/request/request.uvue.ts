

  import {
    testInovkeRequest,
    CommonOptions
  } from '@/uni_modules/test-invoke-network-api'


  class GETDataType {
    data : UTSJSONObject | null = null
  }

  const duration = 2000
  const methodMap = {
    "GET": "/api/http/method/get",
    "POST": "/api/http/method/post",
    "PUT": "/api/http/method/put",
    "DELETE": "/api/http/method/delete",
    "PATCH": "/api/http/method/patch",
    "OPTIONS": "/api/http/method/options",
    "HEAD": "/api/http/method/head"
  }


  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'request',
        res: '',
        task: null as RequestTask | null,
        host: "https://request.dcloud.net.cn",
        url: "/api/http/method/get",
        method: "GET" as RequestMethod | null,
        data: null as any | null,
        header: null as UTSJSONObject | null,
        errorCodeUrls: [
          "/api/http/statusCode/200",
          "/api/http/statusCode/204",
          "/api/http/statusCode/301",
          "/api/http/statusCode/302",
          "/api/http/statusCode/307",
          "/api/http/statusCode/400",
          "/api/http/statusCode/401",
          "/api/http/statusCode/403",
          "/api/http/statusCode/404",
          "/api/http/statusCode/405",
          "/api/http/statusCode/500",
          "/api/http/statusCode/502",
          "/api/http/statusCode/503",
          "/api/http/statusCode/504",
        ],
        headerUrls: [
          "/api/http/header/ua",
          "/api/http/header/referer",
          "/api/http/header/requestCookie",
          "/api/http/header/setCookie",
          "/api/http/header/deleteCookie"
        ],
        contentTypeUrls: [
          "/api/http/contentType/text/plain",
          "/api/http/contentType/text/html",
          "/api/http/contentType/text/xml",
          "/api/http/contentType/image/gif",
          "/api/http/contentType/image/jpeg",
          "/api/http/contentType/image/png",
          "/api/http/contentType/application/json",
          "/api/http/contentType/application/octetStream",
        ],
        postUrls: [
          "/api/http/contentType/json",
          "/api/http/contentType/xWwwFormUrlencoded",
        ],
        //自动化测试例专用
        jest_result: false,
        jest_result_data: ""
      }
    },
    onLoad() {
    },
    onUnload() {
      uni.hideLoading();
      this.task?.abort();
    },
    methods: {
      changeMethod(e : RequestMethod) {
        this.method = e;
        this.url = methodMap[e] as string;
        this.data = null;
        this.header = null;
      },
      changeUrl(e : string) {
        this.method = "GET";
        this.url = e;
        this.data = null;
        this.header = null;
      },
      changeUrlFromPost(e : string) {
        this.method = "POST";
        this.url = e;
        switch (e) {
          case "/api/http/contentType/json":
            this.header = {
              "Content-Type": "application/json"
            };
            this.data = {
              "hello": "world"
            };
            break;
          case "/api/http/contentType/xWwwFormUrlencoded":
            this.header = {
              "Content-Type": "application/x-www-form-urlencoded"
            };
            this.data = "hello=world";
            break;
        }
      },
      sendRequest() {
        uni.showLoading({
          title: "请求中..."
        })
        this.task = uni.request({
          url: this.host + this.url,
          // dataType: "json",
          // responseType: "json",
          method: this.method,
          data: this.data,
          header: this.header,
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: (res) => {
            console.log('request success', JSON.stringify(res.data))
            console.log('request success header is :', JSON.stringify(res.header))
            uni.showToast({
              title: '请求成功',
              icon: 'success',
              mask: true,
              duration: duration
            });
            this.res = '请求结果 : ' + JSON.stringify(res);
          },
          fail: (err) => {
            console.log('request fail', err);
            uni.showModal({
              content: err.errMsg,
              showCancel: false
            });
          },
          complete: () => {
            uni.hideLoading()
            this.task = null
          },
        });
      },
      //自动化测试例专用
      jest_request() {
        uni.request({
          url: this.host + this.url,
          // dataType: "json",
          // responseType: "json",
          method: this.method,
          data: this.data,
          header: this.header,
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_set_cookie() {
        uni.request({
          url: this.host + "/api/http/header/setCookie",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_cookie_request(true)
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_set_cookie_expires() {
        uni.request({
          url: this.host + "/api/http/header/setCookie?expires=5",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_cookie_request(true)
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_delete_cookie() {
        uni.request({
          url: this.host + "/api/http/header/deleteCookie",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_cookie_request(false)
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_cookie_request(needCookie : boolean) {
        uni.request({
          url: this.host + "/api/http/header/requestCookie",
          method: "GET",
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: (res) => {
            const requestCookie = (res.data as UTSJSONObject).getJSON("data")?.getAny("requestCookie")
            this.jest_result_data = JSON.stringify(requestCookie)
            if (requestCookie instanceof Array) {
              this.jest_result = needCookie ? requestCookie.length > 0 : requestCookie.length == 0
            } else {
              this.jest_result = needCookie ? (requestCookie as UTSJSONObject).toMap().size > 0 : (requestCookie as UTSJSONObject).toMap().size == 0
            }
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_timeout_null() {
        uni.request({
          url: this.host + (methodMap['GET'] as string),
          method: "GET",
          timeout: null,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_get_with_data() {
        uni.request({
          url: "https://unidemo.dcloud.net.cn/api/banner/36kr",
          method: "GET",
          data: {
            column: 'id,post_id,title,author_name,cover,published_at' //需要的字段名
          },
          timeout: 6000,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: () => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_get_with_generics() {
        uni.request<GETDataType>({
          url: this.host + (methodMap['GET'] as string),
          method: "GET",
          timeout: null,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: (res : RequestSuccess<GETDataType>) => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_get_array() {
        uni.request<UTSJSONObject[]>({
          url: 'https://unidemo.dcloud.net.cn/api/news?column=title,author_name,cover,published_at',
          method: "GET",
          success: (res : RequestSuccess<UTSJSONObject[]>) => {
            if (res.statusCode == 200 && Array.isArray(res.data)) {
              this.jest_result = true
            } else {
              this.jest_result = false
            }
          },
          fail: () => {
            this.jest_result = false
          }
        });
      },
      jest_uts_module_invoked() {

        testInovkeRequest({
          success: (res : any) => {
            this.jest_result = true
          },
          fail: (err : any) => {
            this.jest_result = false
          }
        } as CommonOptions)

      },
      jest_respone_json_string() {
        uni.request({
          url: "https://request.dcloud.net.cn/api/http/contentType/text/json",
          success: (res : RequestSuccess<any>) => {
            this.jest_result = typeof res.data == "object"
          },
          fail: (e : RequestFail) => {
            this.jest_result = false
          }
        })
      },
      jest_respone_with_string_generics() {
        uni.request<string>({
          url: this.host + (methodMap['GET'] as string),
          method: "GET",
          timeout: null,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: (res : RequestSuccess<string>) => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      },
      jest_respone_with_404_and_string_generics(){
        uni.request<string>({
          url: this.host + "/api/http/statusCode/404",
          method: "GET",
          timeout: null,
          sslVerify: false,
          withCredentials: false,
          firstIpv4: false,
          success: (res : RequestSuccess<string>) => {
            this.jest_result = true;
          },
          fail: () => {
            this.jest_result = false;
          },
        });
      }
    }
  })

export default __sfc__
function GenPagesAPIRequestRequestRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({
        class: "uni-common-mt",
        style: normalizeStyle(utsMapOf({"border-width":"2px","border-style":"solid","border-radius":"4px"}))
      }), [
        createElementVNode("textarea", utsMapOf({
          value: _ctx.res,
          class: "uni-textarea",
          style: normalizeStyle(utsMapOf({"width":"100%"}))
        }), null, 12 /* STYLE, PROPS */, ["value"])
      ], 4 /* STYLE */),
      createElementVNode("view", null, [
        createElementVNode("text", null, "地址 : " + toDisplayString(_ctx.host + _ctx.url), 1 /* TEXT */),
        createElementVNode("text", null, "请求方式 : " + toDisplayString(_ctx.method), 1 /* TEXT */)
      ]),
      createElementVNode("view", utsMapOf({ class: "uni-btn-v uni-common-mt" }), [
        createElementVNode("button", utsMapOf({
          type: "primary",
          onClick: _ctx.sendRequest
        }), "发起请求", 8 /* PROPS */, ["onClick"])
      ])
    ]),
    createElementVNode("scroll-view", utsMapOf({
      style: normalizeStyle(utsMapOf({"flex":"1"})),
      "show-scrollbar": "true"
    }), [
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"20px"}))
      }), [
        createElementVNode("text", null, "设置请求方式"),
        createElementVNode("view", utsMapOf({ class: "uni-common-pb" })),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row","flex-wrap":"wrap"}))
        }), [
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('GET')}
          }), "GET", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('POST')}
          }), "POST", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('PUT')}
          }), "PUT", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('DELETE')}
          }), "DELETE", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('PATCH')}
          }), "PATCH", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px","margin-right":"10px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('OPTIONS')}
          }), "OPTIONS", 12 /* STYLE, PROPS */, ["onClick"]),
          createElementVNode("button", utsMapOf({
            style: normalizeStyle(utsMapOf({"padding":"5px"})),
            type: "primary",
            size: "mini",
            onClick: () => {_ctx.changeMethod('HEAD')}
          }), "HEAD", 12 /* STYLE, PROPS */, ["onClick"])
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"20px"}))
      }), [
        createElementVNode("text", null, "请求返回错误码的接口（默认为GET）"),
        createElementVNode("view", utsMapOf({ class: "uni-common-pb" })),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row","flex-wrap":"wrap"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.errorCodeUrls, (item, index, __index, _cached): any => {
            return createElementVNode("button", utsMapOf({
              style: normalizeStyle(utsMapOf({"padding":"5px"})),
              type: "primary",
              size: "mini",
              key: index,
              onClick: () => {_ctx.changeUrl(item)}
            }), toDisplayString(item), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"20px"}))
      }), [
        createElementVNode("text", null, "请求不同header的接口（默认为GET）"),
        createElementVNode("view", utsMapOf({ class: "uni-common-pb" })),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row","flex-wrap":"wrap"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.headerUrls, (item, index, __index, _cached): any => {
            return createElementVNode("button", utsMapOf({
              style: normalizeStyle(utsMapOf({"padding":"5px"})),
              type: "primary",
              size: "mini",
              key: index,
              onClick: () => {_ctx.changeUrl(item)}
            }), toDisplayString(item), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"20px"}))
      }), [
        createElementVNode("text", null, "请求不同content-type的接口（默认为GET）"),
        createElementVNode("view", utsMapOf({ class: "uni-common-pb" })),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row","flex-wrap":"wrap"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.contentTypeUrls, (item, index, __index, _cached): any => {
            return createElementVNode("button", utsMapOf({
              style: normalizeStyle(utsMapOf({"padding":"5px"})),
              type: "primary",
              size: "mini",
              key: index,
              onClick: () => {_ctx.changeUrl(item)}
            }), toDisplayString(item), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ], 4 /* STYLE */),
      createElementVNode("view", utsMapOf({
        style: normalizeStyle(utsMapOf({"padding":"20px"}))
      }), [
        createElementVNode("text", null, "POST请求(有body)"),
        createElementVNode("view", utsMapOf({ class: "uni-common-pb" })),
        createElementVNode("view", utsMapOf({
          style: normalizeStyle(utsMapOf({"flex-direction":"row","flex-wrap":"wrap"}))
        }), [
          createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.postUrls, (item, index, __index, _cached): any => {
            return createElementVNode("button", utsMapOf({
              style: normalizeStyle(utsMapOf({"padding":"5px"})),
              type: "primary",
              size: "mini",
              key: index,
              onClick: () => {_ctx.changeUrlFromPost(item)}
            }), toDisplayString(item), 13 /* TEXT, STYLE, PROPS */, ["onClick"])
          }), 128 /* KEYED_FRAGMENT */)
        ], 4 /* STYLE */)
      ], 4 /* STYLE */)
    ], 4 /* STYLE */)
  ], 4 /* STYLE */)
}
const GenPagesAPIRequestRequestStyles = []
