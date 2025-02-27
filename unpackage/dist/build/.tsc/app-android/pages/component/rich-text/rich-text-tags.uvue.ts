
  const __sfc__ = defineComponent({
    data() {
      return {
        data: [
          {
            name: '<br/>',
            html: [
              {
                name: 'br'
              },
              {
                type: 'text',
                text: 'hello uni-app x'
              },
              {
                name: 'br'
              },
              {
                type: 'text',
                text: 'hello uni-app x'
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<p/>',
            html: [
              {
                name: 'p',
                attrs: {
                  style: 'text-align: center; text-decoration: line-through;'
                },
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'p',
                attrs: {
                  style: 'background-color: green; color: red;'
                },
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<ul/> <li/>',
            html: [
              {
                name: 'ul',
                children: [
                  {
                    name: 'li',
                    attrs: {
                      style: 'text-decoration: line-through; text-align: center;'
                    },
                    children: [
                      {
                        type: 'text',
                        text: 'hello uni-app x'
                      }
                    ]
                  },
                  {
                    name: 'li',
                    attrs: {
                      style: 'color: red; background-color: green; text-align: center;'
                    },
                    children: [
                      {
                        type: 'text',
                        text: 'hello uni-app x'
                      }
                    ]
                  }
                ],
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<span/>',
            html: [
              {
                name: 'span',
                attrs: {
                  style: 'color: red; background-color: green; text-decoration: line-through;'
                },
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<strong/>',
            html: [
              {
                name: 'strong',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<i/>',
            html: [
              {
                name: 'i',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<big/>',
            html: [
              {
                name: 'big',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<small/>',
            html: [
              {
                name: 'small',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<a/>',
            html: [
              {
                name: 'a',
                attrs: {
                  href: 'https://www.baidu.com'
                },
                children: [
                  {
                    type: 'text',
                    text: '百度'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<u/>',
            html: [
              {
                name: 'u',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<del/>',
            html: [
              {
                name: 'del',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<h1/> <h2/> <h3/> <h4/> <h5/> <h6/>',
            html: [
              {
                name: 'h1',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'h2',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'h3',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'h4',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'h5',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              },
              {
                name: 'h6',
                children: [
                  {
                    type: 'text',
                    text: 'hello uni-app x'
                  }
                ]
              }
            ] as Array<UTSJSONObject>
          },
          {
            name: '<img/>',
            html: [
              {
                name: 'img',
                attrs: {
                  src: 'https://qiniu-web-assets.dcloud.net.cn/unidoc/zh/uni@2x.png',
                  width: '100',
                  height: '100'
                }
              }
            ] as Array<UTSJSONObject>
          }
        ] as Array<TagInfo>
      }
    },
    methods: {
      itemClick(e : RichTextItemClickEvent) {
        console.log(JSON.stringify(e.detail));
        let clicktext = '';
        if (e.detail.src != null) {
          clicktext = '点击了图片，src = ' + e.detail.src;
        } else if (e.detail.href != null) {
          clicktext = '点击了链接，href = ' + e.detail.href;
        }
        uni.showModal({
          content: clicktext,
          showCancel: false
        });
      }
    }
  })

  type TagInfo = {
    name : string,
    html : Array<UTSJSONObject>
  }

export default __sfc__
function GenPagesComponentRichTextRichTextTagsRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_page_head = resolveEasyComponent("page-head",_easycom_page_head)

  return createElementVNode("scroll-view", utsMapOf({
    style: normalizeStyle(utsMapOf({"flex":"1"}))
  }), [
    createVNode(_component_page_head, utsMapOf({ title: "rich-text-tags" })),
    createElementVNode("view", utsMapOf({ class: "uni-padding-wrap uni-common-mt" }), [
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "支持的HTML标签")
      ]),
      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.data, (item, index, __index, _cached): any => {
        return createElementVNode("view", utsMapOf({
          class: "uni-common-mt",
          key: index
        }), [
          createElementVNode("text", utsMapOf({ class: "uni-subtitle-text" }), toDisplayString(item.name), 1 /* TEXT */),
          createElementVNode("view", utsMapOf({
            style: normalizeStyle(utsMapOf({"background":"#FFFFFF"}))
          }), [
            createElementVNode("rich-text", utsMapOf({
              nodes: item.html,
              onItemclick: _ctx.itemClick
            }), null, 40 /* PROPS, NEED_HYDRATION */, ["nodes", "onItemclick"])
          ], 4 /* STYLE */)
        ])
      }), 128 /* KEYED_FRAGMENT */)
    ])
  ], 4 /* STYLE */)
}
const GenPagesComponentRichTextRichTextTagsStyles = []

import _easycom_page_head from '@/components/page-head/page-head.vue'
