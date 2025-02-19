
import { Calendar, DateType } from './index.uts'

type CoordsType = {
  x: number;
  y: number;
  width: number;
  height: number;
  data: DateType
}

const __sfc__ = defineComponent({
  data () {
    return {
      weeks: [] as Array<Array<DateType>>,
      $coords: [] as Array<CoordsType>,
      $calendar: new Calendar() as Calendar,
      timeData: {
        fullDate: '',
        year: 0,
        month: 0,
        date: 0,
        day: 0,
        lunar: '',
        disabled: false,
        is_today: false
      } as DateType,
      testWidth: 0
    }
  },
  computed: {
    // 获取月份
    current_month (): string {
      const nowDate = this.timeData
      const month = nowDate.month
      return month < 10 ? '0' + month : month.toString()
    },
    current_day (): string {
      const time = this.timeData.data
      if (time == null) {
        return ''
      }
      return time.IMonthCn + time.IDayCn
    }
  },
  created () { },
  onReady () {
    const calendar = this.$data['$calendar'] as Calendar
    this.weeks = calendar.getWeeks()
    this.timeData = calendar.getDateInfo()
    // 绘制日历头部
    this.drawHeader()
    this.drawWeek(this.weeks, '')

    // 仅自动化测试
    const header = this.$refs['draw-header'] as UniElement
    this.testWidth = header.getBoundingClientRect().width;
  },
  methods: {

    // 触发整个日历的点击事件，需要计算点击位置
    select (event: TouchEvent) {
      const refs = this.$refs['draw-weeks'] as UniElement
      const rect = refs.getBoundingClientRect();
      const dom_x = rect.left; // 元素左上角相对于视口的 X 坐标
      const dom_y = rect.top; // 元素左上角相对于视口的 Y 坐标
      const touch = event.touches[0];
      const clientX = touch.clientX; // X 坐标
      const clientY = touch.clientY; // Y 坐标
      // 计算点击的相对位置
      const x = clientX - dom_x
      const y = clientY - dom_y

      this.clickGrid(x, y)
    },

    // 点击具体的日历格子
    clickGrid (x: number, y: number) {
      // 小格子数组
      // const gridArray = this.$data.$coords
      const calendar = this.$data['$calendar'] as Calendar
      const gridArray = this.$data['$coords'] as Array<CoordsType>

      // 遍历小格子数组，找到最接近点击坐标的小格子
      for (let i = 0; i < gridArray.length; i++) {
        const grid = gridArray[i]
        // 计算小格子理论上的最大值
        const max_x = grid.x + grid.width
        const max_y = grid.y + grid.height

        const is_x_limit = grid.x < x && x < max_x
        const is_y_limit = grid.y < y && y < max_y

        const is_select = is_x_limit && is_y_limit

        if (is_select) {
          const data = grid.data
          this.timeData = calendar.getDateInfo(data.fullDate)
          this.drawWeek(this.weeks, grid.data.fullDate)
        }
      }
    },
    // 切换上个月
    preDate () {
      const fulldate = this.timeData.fullDate
      const calendar = this.$data['$calendar'] as Calendar
      const time = calendar.getDate(fulldate, -1, 'month')
      this.timeData = calendar.getDateInfo(time.fullDate)

      this.weeks = calendar.getWeeks(time.fullDate)

      // 重新绘制日历
      this.drawWeek(this.weeks, time.fullDate)

    },
    // 切换下个他
    nextDate () {
      const fulldate = this.timeData.fullDate
      const calendar = this.$data['$calendar'] as Calendar
      const time = calendar.getDate(fulldate, 1, 'month')
      this.timeData = calendar.getDateInfo(time.fullDate)

      this.weeks = calendar.getWeeks(time.fullDate)

      // 重新绘制日历
      this.drawWeek(this.weeks, time.fullDate)
    },
    // 回到今天
    gotoToday () {
      const calendar = this.$data['$calendar'] as Calendar
      const time = calendar.getDate()
      this.timeData = calendar.getDateInfo(time.fullDate)

      this.weeks = calendar.getWeeks(time.fullDate)

      // 重新绘制日历
      this.drawWeek(this.weeks, time.fullDate)
    },

    // 绘制日历顶部信息
    drawHeader () {
      const refs = this.$refs['draw-header'] as UniElement
      let ctx = refs.getDrawableContext()
      if (ctx == null) return
      const date_header_map = ['一', '二', '三', '四', '五', '六', '日']

      const width = refs.getBoundingClientRect().width
      const num = date_header_map.length
      const one_width = width / num

      ctx.font = '12'
      ctx.textAlign = 'center'

      for (let i = 0; i < num; i++) {
        let box_left = i * one_width + 2
        let box_width = one_width - 4
        let box_height = 26

        // 文本赋值
        const text = date_header_map[i]
        let text_left = box_width / 2 + box_left
        let text_top = box_height / 2 + 6

        ctx.fillText(text, text_left, text_top)
        ctx.update()
      }
    },

    // 绘制日历主体
    drawWeek (weeks: Array<Array<DateType>>, time: string) {
      const start_time = Date.now()
      const refs = this.$refs['draw-weeks'] as UniElement
      let ctx = refs.getDrawableContext()
      if (ctx == null) return
      const dom = refs.getBoundingClientRect()
      const width = dom.width
      const height = dom.height
      let week_len = weeks.length
      const one_width = width / weeks[0].length
      const one_height = height / week_len

      if (time !== '') {
        this.$data['$coords'] = [] as Array<CoordsType>
        ctx.reset()
      }

      ctx.textAlign = 'center'

      for (let week = 0; week < week_len; week++) {

        const week_item = weeks[week]
        for (let day = 0; day < week_item.length; day++) {
          const day_item = week_item[day]
          let day_left = day * one_width + 2
          let day_top = one_height * week + 2
          let day_width = one_width - 4
          let day_height = one_height - 4

          // 文本赋值
          let text = day_item.date.toString()
          let text_left = day * one_width + (one_width / 2)
          let text_top = one_height * week + 25

          ctx.font = '16'

          // 日期是否禁用
          if (day_item.disabled) {
            ctx.fillStyle = '#ccc'
          } else {
            // 是否为今天
            if (day_item.is_today) {
              ctx.fillStyle = 'red'
            } else {
              // 是否为选中
              if (time === day_item.fullDate) {
                ctx.fillStyle = 'blue'
              } else {
                ctx.fillStyle = '#666'
              }
            }

            // 第一次渲染获取数据
            // if (time === '') {
            // 存储坐标组，用于点击事件
            const coords: CoordsType = {
              x: day_left,
              y: day_top,
              width: day_width,
              height: day_height,
              data: day_item
            }

            // TODO 兼容安卓data内$开头的属性的赋值问题
            let gridArr = this.$data['$coords'] as Array<CoordsType>
            gridArr.push(coords)
            // }
          }

          ctx.fillText(text, text_left, text_top)

          text = day_item.lunar
          let lunar_left = day * one_width + (one_width / 2)
          let lunar_top = one_height * week + 42
          ctx.font = '10'
          ctx.fillText(text, lunar_left, lunar_top)
        }
      }

      ctx.update()
      console.log('diff time', Date.now() - start_time);

    }
  }
})

export default __sfc__
function GenPagesTemplateCalendarCalendarRender(this: InstanceType<typeof __sfc__>): any | null {
const _ctx = this
const _cache = this.$.renderCache
  return createElementVNode("view", utsMapOf({ class: "root" }), [
    createElementVNode("view", utsMapOf({ class: "date" }), [
      createElementVNode("text", utsMapOf({ class: "date-text" }), toDisplayString(_ctx.current_month), 1 /* TEXT */)
    ]),
    createElementVNode("view", utsMapOf({
      ref: "draw-header",
      class: "calendar-header"
    }), null, 512 /* NEED_PATCH */),
    createElementVNode("view", utsMapOf({
      ref: "draw-weeks",
      class: "calendar-week",
      onTouchstart: _ctx.select
    }), null, 40 /* PROPS, NEED_HYDRATION */, ["onTouchstart"]),
    createElementVNode("view", utsMapOf({ class: "btn-group" }), [
      createElementVNode("button", utsMapOf({
        size: "mini",
        onClick: _ctx.preDate
      }), "上个月", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        size: "mini",
        onClick: _ctx.gotoToday
      }), "回到今天", 8 /* PROPS */, ["onClick"]),
      createElementVNode("button", utsMapOf({
        size: "mini",
        onClick: _ctx.nextDate
      }), "下个月", 8 /* PROPS */, ["onClick"])
    ]),
    createElementVNode("view", null, toDisplayString(_ctx.timeData.fullDate) + " " + toDisplayString(_ctx.current_day), 1 /* TEXT */)
  ])
}
const GenPagesTemplateCalendarCalendarStyles = [utsMapOf([["root", padStyleMapOf(utsMapOf([["flex", 1], ["position", "relative"], ["paddingTop", 15], ["paddingRight", 15], ["paddingBottom", 15], ["paddingLeft", 15], ["backgroundColor", "#ffffff"]]))], ["calendar-header", padStyleMapOf(utsMapOf([["height", 30], ["marginBottom", 10]]))], ["date", padStyleMapOf(utsMapOf([["marginBottom", 10], ["marginLeft", 10]]))], ["date-text", padStyleMapOf(utsMapOf([["fontSize", 34], ["fontWeight", "bold"]]))], ["calendar-week", padStyleMapOf(utsMapOf([["height", 350], ["marginTop", 2], ["marginRight", 0], ["marginBottom", 2], ["marginLeft", 0]]))], ["btn-group", padStyleMapOf(utsMapOf([["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["marginTop", 20], ["marginRight", 0], ["marginBottom", 20], ["marginLeft", 0]]))]])]
