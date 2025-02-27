
  import { COLLECTION_NAME, GenderType, GenderList, UNICLOUD_DB_CONTACTS_UPDATE, UNICLOUD_DB_CONTACTS_DELETE } from './types.uts'

  const __sfc__ = defineComponent({
    data() {
      return {
        collection: '',
        where: '',
        genderList: GenderList as GenderType[],
        whereID: '',
        uniCloudElement: null as UniCloudDBElement | null
      }
    },
    onLoad(options) {
      this.collection = COLLECTION_NAME;
      this.whereID = options['id'] as string;
      this.where = `_id=='${this.whereID}'`;
    },
    onReady() {
      this.uniCloudElement = this.$refs['udb'] as UniCloudDBElement
    },
    methods: {
      onFormSubmit: function (e : UniFormSubmitEvent) {
        const formData = e.detail.value
        const genderString = formData['gender'] as string
        formData['gender'] = (genderString.length > 0) ? parseInt(genderString) : -1
        this.uniCloudElement!.update(this.whereID, formData, {
          showToast: false,
          needLoading: true,
          needConfirm: false,
          loadingTitle: "正在保存...",
          success: (_ : UniCloudDBUpdateResult) => {
            // TODO 后续通过 EventChannel 实现
            uni.$emit(UNICLOUD_DB_CONTACTS_UPDATE, this.whereID)
            setTimeout(() => {
              uni.navigateBack()
            }, 500)
          },
          fail: (err : any | null) => {
            const error = err as UniCloudError
            uni.showModal({
              content: error.errMsg,
              showCancel: false
            })
          }
        })
      },
      remove(id : string | null, name : string | null) {
        this.uniCloudElement!.remove(id!, {
          needConfirm: true,
          needLoading: true,
          loadingTitle: "正在删除...",
          confirmTitle: "确定删除?",
          confirmContent: name,
          success: (_ : UniCloudDBRemoveResult) => {
            // TODO 后续通过 EventChannel 实现
            uni.$emit(UNICLOUD_DB_CONTACTS_DELETE, this.whereID)
            setTimeout(() => {
              uni.navigateBack({
                delta: 2
              })
            }, 500)
          },
          fail: (err : any | null) => {
            const error = err as UniCloudError
            uni.showModal({
              content: error.errMsg,
              showCancel: false
            })
          }
        })
      }
    }
  })

export default __sfc__
function GenPagesComponentUnicloudDbUnicloudDbContactsEditRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
const _component_radio = resolveComponent("radio")
const _component_radio_group = resolveComponent("radio-group")
const _component_form = resolveComponent("form")
const _component_unicloud_db = resolveEasyComponent("unicloud-db",_easycom_unicloud_db)

  return createElementVNode("scroll-view", utsMapOf({ class: "scroll-view" }), [
    createVNode(_component_unicloud_db, utsMapOf({
      ref: "udb",
      collection: _ctx.collection,
      where: _ctx.where,
      "page-data": "replace"
    }), utsMapOf({
      default: withScopedSlotCtx((slotProps: Record<string, any | null>): any[] => {
      const data = slotProps["data"]
      const loading = slotProps["loading"]
      const error = slotProps["error"]
      return [
        error!=null
          ? createElementVNode("view", utsMapOf({
              key: 0,
              class: "error"
            }), toDisplayString(error.errMsg), 1 /* TEXT */)
          : createCommentVNode("v-if", true),
        isTrue(loading)
          ? createElementVNode("view", utsMapOf({
              key: 1,
              class: "loading"
            }), "正在加载...")
          : createCommentVNode("v-if", true),
        data.length>0
          ? createVNode(_component_form, utsMapOf({
              key: 2,
              onSubmit: _ctx.onFormSubmit
            }), utsMapOf({
              default: withSlotCtx((): any[] => [
                createElementVNode("view", utsMapOf({ class: "form-item" }), [
                  createElementVNode("text", utsMapOf({ class: "form-item-label" }), "姓名"),
                  createElementVNode("input", utsMapOf({
                    class: "form-item-input",
                    placeholder: "姓名",
                    name: "username",
                    value: data[0].getString('username')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                createElementVNode("view", utsMapOf({ class: "form-item" }), [
                  createElementVNode("text", utsMapOf({ class: "form-item-label" }), "电话"),
                  createElementVNode("input", utsMapOf({
                    class: "form-item-input",
                    placeholder: "电话",
                    name: "mobile",
                    value: data[0].getString('mobile')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                createElementVNode("view", utsMapOf({ class: "form-item" }), [
                  createElementVNode("text", utsMapOf({ class: "form-item-label" }), "邮箱"),
                  createElementVNode("input", utsMapOf({
                    class: "form-item-input",
                    placeholder: "邮箱地址",
                    name: "email",
                    value: data[0].getString('email')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                createElementVNode("view", utsMapOf({ class: "form-item" }), [
                  createElementVNode("text", utsMapOf({ class: "form-item-label" }), "备注"),
                  createElementVNode("textarea", utsMapOf({
                    class: "form-item-input-comment",
                    placeholder: "备注",
                    name: "comment",
                    maxlength: "-1",
                    value: data[0].getString('comment')
                  }), null, 8 /* PROPS */, ["value"])
                ]),
                createElementVNode("view", utsMapOf({ class: "form-item" }), [
                  createElementVNode("text", utsMapOf({ class: "form-item-label" }), "性别"),
                  createVNode(_component_radio_group, utsMapOf({
                    class: "radio-list",
                    name: "gender"
                  }), utsMapOf({
                    default: withSlotCtx((): any[] => [
                      createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.genderList, (item, _, __index, _cached): any => {
                        return createElementVNode("view", utsMapOf({
                          class: "radio-item",
                          key: item.value
                        }), [
                          createVNode(_component_radio, utsMapOf({
                            value: item.value,
                            checked: item.value == data[0].getNumber('gender')
                          }), null, 8 /* PROPS */, ["value", "checked"]),
                          createElementVNode("text", null, toDisplayString(item.text), 1 /* TEXT */)
                        ])
                      }), 128 /* KEYED_FRAGMENT */)
                    ]),
                    _: 2 /* DYNAMIC */
                  }), 1024 /* DYNAMIC_SLOTS */)
                ]),
                createElementVNode("view", utsMapOf({ class: "btn-group" }), [
                  createElementVNode("button", utsMapOf({
                    class: "btn-submit",
                    type: "primary",
                    "form-type": "submit"
                  }), "保存"),
                  createElementVNode("button", utsMapOf({
                    class: "btn-delete",
                    type: "warn",
                    onClick: () => {_ctx.remove(data[0].getString('_id'), data[0].getString('username'))}
                  }), "删除联系人", 8 /* PROPS */, ["onClick"])
                ])
              ]),
              _: 2 /* DYNAMIC */
            }), 1032 /* PROPS, DYNAMIC_SLOTS */, ["onSubmit"])
          : createCommentVNode("v-if", true)
      ]}),
      _: 1 /* STABLE */
    }), 8 /* PROPS */, ["collection", "where"])
  ])
}
const GenPagesComponentUnicloudDbUnicloudDbContactsEditStyles = [utsMapOf([["page", padStyleMapOf(utsMapOf([["flex", 1]]))], ["scroll-view", padStyleMapOf(utsMapOf([["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["flex", 1]]))], ["loading", padStyleMapOf(utsMapOf([["alignItems", "center"]]))], ["form-item", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["marginBottom", 15], ["alignItems", "center"]]))], ["form-item-label", padStyleMapOf(utsMapOf([["width", 45], ["marginRight", 10]]))], ["form-item-input", padStyleMapOf(utsMapOf([["flex", 1], ["fontSize", 14], ["color", "#666666"], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#e5e5e5"], ["borderRadius", 5], ["height", 34], ["paddingLeft", 8], ["paddingRight", 8]]))], ["form-item-input-comment", padStyleMapOf(utsMapOf([["flex", 1], ["fontSize", 14], ["color", "#666666"], ["borderWidth", 1], ["borderStyle", "solid"], ["borderColor", "#e5e5e5"], ["borderRadius", 5], ["paddingTop", 8], ["paddingRight", 8], ["paddingBottom", 8], ["paddingLeft", 8]]))], ["radio-list", padStyleMapOf(utsMapOf([["flexDirection", "row"]]))], ["radio-item", padStyleMapOf(utsMapOf([["flexDirection", "row"], ["marginRight", 30], ["alignItems", "center"]]))], ["btn-group", padStyleMapOf(utsMapOf([["marginTop", 30]]))], ["btn-delete", padStyleMapOf(utsMapOf([["marginTop", 15]]))]])]

import _easycom_unicloud_db from '@/node-modules/@dcloudio/uni-components/lib-x/unicloud-db/unicloud-db.vue'
