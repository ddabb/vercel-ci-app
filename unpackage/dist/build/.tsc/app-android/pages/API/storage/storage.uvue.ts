
  const __sfc__ = defineComponent({
    data() {
      return {
        title: 'get/set/clearStorage',
        key: '',
        data: '' as any,
        apiGetData: '' as any | null,
        storageInfo: '',
        staticComplexRet: false,
        jest_saveUTSJSONObjectSyncResult: 0,
        jest_saveUTSJSONObjectAsyncResult: 0,
        jest_saveUTSJSONObjectArraySyncResult: 0
      }
    },
    methods: {
      getStorageInfo() {
        uni.getStorageInfo({
          success: (res) => {
            this.apiGetData = res
            this.storageInfo = JSON.stringify(res)
          },
        })
      },
      getStorageInfoSync() {
        try {
          const res = uni.getStorageInfoSync()
          this.apiGetData = res
          this.storageInfo = JSON.stringify(res)
        } catch (e) {
          // error
          console.log(e)
        }
      },
      jsonLikeMock() {
        this.key = 'key_' + Math.random()
        this.data = JSON.stringify({
          name: "james",
          age: 12,
          from: "american"
        });

      },
      longLikeMock() {
        this.key = 'key_' + Math.random()
        this.data = "1234567890"
      },
      floatLikeMock() {
        this.key = 'key_' + Math.random()
        this.data = "321456.1234567890"
      },
      negativeLikeMock() {
        this.key = 'key_' + Math.random()
        this.data = "-321456"
      },
      strMock() {
        this.key = 'key_' + Math.random()
        this.data = '测试字符串数据，长度为16个字符'
      },
      complexStaticTest() {
        uni.setStorageSync("key_complexStaticMock", {
          name: "张三",
          age: 12
        })
        let savedData = uni.getStorageSync("key_complexStaticMock")
        this.staticComplexRet = false
        if (savedData instanceof UTSJSONObject) {
          if ((savedData as UTSJSONObject).getNumber('age') == 12) {
            this.staticComplexRet = true
            uni.showToast({
              icon: 'success',
              title: '测试通过'
            })
          }
        }
      },
      complexMock() {
        this.key = 'key_' + Math.random()
        let jsonObj = {
          name: '张三',
          age: 12,
          classMate: [
            {
              id: 1001,
              name: '李四',
            },
            {
              id: 1002,
              name: 'jack ma',
            },
          ],
        }
        this.data = jsonObj
      },
      numberMock() {
        this.key = 'key_' + Math.random()
        this.data = 10011
      },
      floatMock() {
        this.key = 'key_' + Math.random()
        this.data = 3.1415926535893384626
      },

      keyChange: function (e : InputEvent) {
        this.key = e.detail.value
      },
      dataChange: function (e : InputEvent) {
        this.data = e.detail.value
      },
      getStorage: function () {
        var key = this.key
        if (key.length == 0) {
          uni.showModal({
            title: '读取数据失败',
            content: 'key 不能为空',
            showCancel: false,
          })
        } else {
          let that = this
          uni.getStorage({
            key: key,
            success: (res) => {

              that.apiGetData = res.data
              let desc : string = typeof this.apiGetData
              if ("object" == desc) {
                desc = desc + ": " + JSON.stringify(this.apiGetData)
              } else {
                desc = desc + ": " + this.apiGetData
              }

              uni.showModal({
                title: '读取数据成功',
                content: desc,
                showCancel: false,
              })
            },
            fail: () => {
              uni.showModal({
                title: '读取数据失败',
                content: '找不到 key 对应的数据',
                showCancel: false,
              })
            },
          })
        }
      },
      getStorageSync: function () {
        var key = this.key
        if (key.length == 0) {
          uni.showModal({
            title: '读取数据失败',
            content: 'key 不能为空',
            showCancel: false,
          })
        } else {
          this.apiGetData = uni.getStorageSync(key)

          let desc : string = typeof this.apiGetData
          if ("object" == desc) {
            desc = desc + ": " + JSON.stringify(this.apiGetData)
          } else {
            desc = desc + ": " + this.apiGetData
          }

          uni.showModal({
            title: '读取数据成功',
            content: desc,
            showCancel: false,
          })
        }
      },
      setStorage: function () {
        var key = this.key
        var data = this.data
        if (key.length == 0) {
          uni.showModal({
            title: '保存数据失败',
            content: 'key 不能为空',
            showCancel: false,
          })
        } else {
          uni.setStorage({
            key: key,
            data: data,
            success: () => {
              uni.showModal({
                title: '存储数据成功',
                showCancel: false,
              })
            },
            fail: () => {
              uni.showModal({
                title: '储存数据失败!',
                showCancel: false,
              })
            },
          })
        }
      },
      setStorageSync: function () {
        var key = this.key
        var data = this.data
        if (key.length == 0) {
          uni.showModal({
            title: '保存数据失败',
            content: 'key 不能为空',
            showCancel: false,
          })
        } else {
          uni.setStorageSync(key, data)
          uni.showModal({
            title: '存储数据成功',
            showCancel: false,
          })
        }
      },
      removeStorage: function () {
        uni.removeStorage({
          key: this.key,
          success: () => {
            uni.showModal({
              title: '移除数据成功',
              showCancel: false,
            })
          },
          fail: () => {
            uni.showModal({
              title: '移除数据失败',
              showCancel: false,
            })
          },
        })
      },
      removeStorageSync: function () {
        uni.removeStorageSync(this.key)
        uni.showModal({
          title: '移除数据成功',
          showCancel: false,
        })
      },
      clearStorage: function () {
        this.key = ''
        this.data = ''
        uni.clearStorage({
          success: function (_) {
            uni.showModal({
              title: '清除数据成功',
              showCancel: false,
            })
          },
          fail: function (_) {
            uni.showModal({
              title: '清除数据失败',
              showCancel: false,
            })
          },
        })
      },
      clearStorageSync: function () {
        this.key = ''
        this.data = ''
        uni.clearStorageSync()
        uni.showModal({
          title: '清除数据成功',
          content: ' ',
          showCancel: false,
        })
      },
      jest_saveUTSJSONObject: function () {
        const key = 'test_key_saveUTSJSONObject'
        uni.setStorageSync(key, {
          a: {
            b: 1
          }
        })
        const dataSync = uni.getStorageSync(key) as UTSJSONObject
        const dataSyncA = dataSync['a'] as UTSJSONObject
        this.jest_saveUTSJSONObjectSyncResult = dataSyncA.get('b') as number
        uni.getStorage({
          key,
          success: (res) => {
            const dataAsync = res.data as UTSJSONObject
            const dataAsyncA = dataAsync['a'] as UTSJSONObject
            this.jest_saveUTSJSONObjectAsyncResult = dataAsyncA.get('b') as number
            console.log('this.jest_saveUTSJSONObjectSyncResult: ' + this.jest_saveUTSJSONObjectSyncResult)
            console.log('this.jest_saveUTSJSONObjectAsyncResult: ' + this.jest_saveUTSJSONObjectAsyncResult)
          }
        })
      },
      jest_saveUTSJSONObjectArray() {
        const key = 'test_key_saveUTSJSONObjectArray'
        uni.setStorageSync(key, [{
          a: 1
        }] as UTSJSONObject[])
        const dataSync = uni.getStorageSync(key) as UTSJSONObject[]
        this.jest_saveUTSJSONObjectArraySyncResult = dataSync[0].get('a') as number
      }
    },
  })

export default __sfc__
function GenPagesAPIStorageStorageRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({ class: "page-scroll-view" }), [
    createElementVNode("view", null, [
      createVNode(_component_page_head, utsMapOf({ title: _ctx.title }), null, 8 /* PROPS */, ["title"]),
      createElementVNode("view", utsMapOf({ class: "uni-common-mt" }), [
        createElementVNode("view", utsMapOf({ class: "uni-list" }), [
          createElementVNode("view", utsMapOf({ class: "uni-list-cell uni-list-cell-line" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
              createElementVNode("view", utsMapOf({ class: "uni-label" }), "key")
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
              createElementVNode("input", utsMapOf({
                class: "uni-input",
                type: "text",
                placeholder: "请输入key",
                name: "key",
                value: _ctx.key,
                maxlength: "-1",
                onInput: _ctx.keyChange
              }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onInput"])
            ])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-list-cell" }), [
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-left" }), [
              createElementVNode("view", utsMapOf({ class: "uni-label" }), "value")
            ]),
            createElementVNode("view", utsMapOf({ class: "uni-list-cell-db" }), [
              createElementVNode("input", utsMapOf({
                class: "uni-input",
                type: "text",
                placeholder: "请输入value",
                name: "data",
                value: typeof _ctx.data === 'string' ? _ctx.data : JSON.stringify(_ctx.data),
                maxlength: "-1",
                onInput: _ctx.dataChange
              }), null, 40 /* PROPS, NEED_HYDRATION */, ["value", "onInput"])
            ])
          ])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-getStorageInfoASync",
              type: "primary",
              onClick: _ctx.getStorageInfo
            }), " 获取存储概述信息-异步 ", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-getStorageInfoSync",
              onClick: _ctx.getStorageInfoSync
            }), " 获取存储概述信息-同步 ", 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("text", null, toDisplayString(_ctx.storageInfo), 1 /* TEXT */),
          createElementVNode("view", utsMapOf({ class: "uni-flex uni-row" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.strMock
            }), " 填充字符串 ", 12 /* STYLE, PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.complexMock
            }), " 填充复杂对象 ", 12 /* STYLE, PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-flex uni-row" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.numberMock
            }), " 填充整型 ", 12 /* STYLE, PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.floatMock
            }), " 填充浮点型 ", 12 /* STYLE, PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-flex uni-row" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.jsonLikeMock
            }), " 填充json字符串 ", 12 /* STYLE, PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.longLikeMock
            }), " 填充整数字符串 ", 12 /* STYLE, PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-flex uni-row" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.floatLikeMock
            }), " 填充浮点字符串 ", 12 /* STYLE, PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              type: "default",
              style: normalizeStyle(utsMapOf({"width":"50%"})),
              onClick: _ctx.negativeLikeMock
            }), " 填充负数字符串 ", 12 /* STYLE, PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-flex uni-row" }), [
            createElementVNode("button", utsMapOf({
              type: "default",
              class: "uni-btn btn-complexStaticTest",
              style: normalizeStyle(utsMapOf({"width":"100%"})),
              onClick: _ctx.complexStaticTest
            }), " 字面量读写测试 ", 12 /* STYLE, PROPS */, ["onClick"])
          ])
        ]),
        createElementVNode("view", utsMapOf({ class: "uni-padding-wrap" }), [
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              type: "primary",
              class: "uni-btn btn-setstorageAsync",
              onClick: _ctx.setStorage
            }), " 存储数据-异步 ", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-getstorageAsync",
              onClick: _ctx.getStorage
            }), "读取数据-异步", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-removeStorageInfoASync",
              onClick: _ctx.removeStorage
            }), "移除数据-异步", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-clearStorageInfoASync",
              onClick: _ctx.clearStorage
            }), "清理数据-异步", 8 /* PROPS */, ["onClick"])
          ]),
          createElementVNode("view", utsMapOf({ class: "uni-btn-v" }), [
            createElementVNode("button", utsMapOf({
              type: "primary",
              class: "uni-btn btn-setstorageSync",
              onClick: _ctx.setStorageSync
            }), " 存储数据-同步 ", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-getstorageSync",
              onClick: _ctx.getStorageSync
            }), "读取数据-同步", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-removeStorageInfoSync",
              onClick: _ctx.removeStorageSync
            }), " 移除数据-同步 ", 8 /* PROPS */, ["onClick"]),
            createElementVNode("button", utsMapOf({
              class: "uni-btn btn-clearStorageInfoSync",
              onClick: _ctx.clearStorageSync
            }), " 清理数据-同步 ", 8 /* PROPS */, ["onClick"])
          ])
        ])
      ])
    ])
  ])
}
const GenPagesAPIStorageStorageStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
