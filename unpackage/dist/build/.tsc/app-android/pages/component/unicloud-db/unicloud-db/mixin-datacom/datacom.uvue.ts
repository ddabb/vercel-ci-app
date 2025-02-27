
  const __sfc__ = defineComponent({
    mixins: [uniCloudMixinDatacom],
    data() {
      return {
      }
    },
    created() {
      this.load()
    },
    methods: {
      load() {
        if (this.mixinDatacomLoading == true) {
          return
        }
        this.mixinDatacomLoading = true

        this.mixinDatacomGet(null).then((res : UniCloudDBGetResult) => {
          const data = res.data
          // const count = res.count
          this.mixinDatacomResData = data
        }).catch((err : any | null) => {
          this.mixinDatacomError = err as UniCloudError
        }).finally(() => {
          this.mixinDatacomLoading = false
        })
      },
      // 当组件属性发生变化时
      onMixinDatacomPropsChange(needReset : boolean, changed : Array<string>) {
        console.log(needReset, changed);
        // needReset=true 需要重置已加载数据和分页信息，例如 collection，orderby
        // changed，变化的属性名，类型为 Array，例如 ['collection', 'orderby']
        // if (needReset) {
        //   // 清空已加载的数据
        //   this.mixinDatacomResData = []

        //   // 重置分页数据，如果没有分页不需要处理
        //   this.mixinDatacomPage.size = this.pageSize // 重置分页大小
        //   this.mixinDatacomPage.current = 0 // 重置当前分页
        //   this.mixinDatacomPage.count = 0 // 重置数据总数
        // }
      }
    }
  })

export default __sfc__
function GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacomRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", null, [
    isTrue(_ctx.mixinDatacomLoading)
      ? createElementVNode("view", utsMapOf({ key: 0 }), "Loading...")
      : isTrue(_ctx.mixinDatacomError)
        ? createElementVNode("view", utsMapOf({ key: 1 }), " 请求错误：" + toDisplayString(_ctx.mixinDatacomError), 1 /* TEXT */)
        : createElementVNode("view", utsMapOf({ key: 2 }), [
            createElementVNode("scroll-view", utsMapOf({ class: "list-view" }), [
              createElementVNode(Fragment, null, RenderHelpers.renderList(_ctx.mixinDatacomResData, (item, _, __index, _cached): any => {
                return createElementVNode("view", utsMapOf({ class: "list-item" }), [
                  createElementVNode("text", null, toDisplayString(item), 1 /* TEXT */)
                ])
              }), 256 /* UNKEYED_FRAGMENT */)
            ])
          ]),
    isTrue(!_ctx.mixinDatacomLoading && _ctx.mixinDatacomResData.length==0)
      ? createElementVNode("view", utsMapOf({ key: 3 }), " 无数据 ")
      : createCommentVNode("v-if", true)
  ])
}
const GenPagesComponentUnicloudDbUnicloudDbMixinDatacomDatacomStyles = []

import { mixinDatacom as uniCloudMixinDatacom } from "@/node-modules/@dcloudio/uni-components/lib-x/unicloud-db/index.uts"