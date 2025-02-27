import { OnLaunchOptionsWithCst, StatDefault, PageParams, TitleConfigParams, RequestData, EventParams } from '../../interface.uts'
import { get_residence_time, get_time, set_first_time, get_last_visit_time, get_first_visit_time, get_total_visit_count, get_page_residence_time, set_page_residence_time } from '../utils/pageTime.uts'
import { get_default_data, get_route, get_page_name, get_odid, is_handle_device, get_scene, get_report_Interval } from '../utils/pageInfo.uts'
import { ReportType, ReprotCstType } from './stat-type.uts'
import { dbGet, dbSet, dbRemove } from '../utils/db.uts'
import { Log, Map2String, Map2Json, handle_data } from '../utils/index.uts'
import { OPERATING_TIME, STAT_VERSION, Config } from '../config.uts'
// import Config from '../config'



class CloudObjectToDo extends InternalUniCloudCloudObjectCaller {
  constructor(obj : InternalUniCloudCloudObject) {
    super(obj)
  }
  report(...do_not_transform_spread : Array<any | null>) : Promise<UTSJSONObject> {
    return this._obj.callMethod('report', this._getArgs(...do_not_transform_spread))
  }
}




export class Report {
  /* uniCloud 实例 */
  // @ts-ignore
  static uniCloudInstance : UniCloud | null = null
  /**进入应用标识*/
  licationShow : boolean = false
  /**离开应用标识*/
  licationHide : boolean = false
  /** 上报数据 */
  statData : StatDefault
  // 上报间隔时长,默认值 是10
  eportInterval = get_report_Interval(OPERATING_TIME)

  _navigationBarTitle : TitleConfigParams = {
    config: '',
    page: '',
    report: '',
    lt: ''
  } as TitleConfigParams

  constructor() {
    this.statData = get_default_data()

    // 注册拦截器
    // @ts-ignore
    let registerInterceptor = typeof uni.addInterceptor === 'function'
    if (registerInterceptor) {
      this.interceptSetNavBar()
      this.interceptLogin()
      this.interceptShare(true)
      this.interceptRequestPayment()
    }
  }

  /**
   * 拦截 setNavigationBarTitle 事件
   */
  interceptSetNavBar() {
    let self = this
    // @ts-ignore
    uni.addInterceptor('setNavigationBarTitle', {
      // @ts-ignore
      invoke(args : SetNavigationBarTitleOptions) {
        self._navigationBarTitle.page = args.title
      },
      // @ts-ignore
    } as Interceptor)
  }

  /**
   * 拦截 login 事件
   */
  interceptLogin() {
    let self = this
    // @ts-ignore
    uni.addInterceptor('login', {
      complete() {
        self._login()
      },
      // @ts-ignore
    } as Interceptor)
  }
  interceptShare(type : boolean = false) {
    let self = this
    if (!type) {
      self._share()
      return
    }
    // @ts-ignore
    uni.addInterceptor('share', {
      complete() {
        self._share()
      }
      // @ts-ignore
    } as Interceptor)
  }
  interceptRequestPayment() {
    let self = this
    // @ts-ignore
    uni.addInterceptor('requestPayment', {
      success() {
        self._payment('pay_success')
      },
      fail() {
        self._payment('pay_fail')
      },
      // @ts-ignore
    } as Interceptor)
  }

  /**
   * 实现登录拦截逻辑
   */
  private _login() {
    this.sendEventRequest(
      {
        key: 'login',
      } as EventParams
    )
  }

  private _share() {
    this.sendEventRequest(
      {
        key: 'share',
      } as EventParams
    )
  }

  private _payment(key : string) {
    this.sendEventRequest(
      {
        key,
      } as EventParams
    )
  }

  /**
   * 进入应用
   * @param {any} options 应用参数
   */
  launch(options : any) {
    // 重置页面停留时长
    set_page_residence_time()
    // 告诉report是应用进来的
    this.licationShow = true
    // 存储应用传入值
    dbSet('__launch_options', options)
    // 应用初始上报参数为1
    // TODO 这里应该是 把 options 都结构到下面对象中，目前unix只有path ，所以这段代码后续需要改一下
    // let request_option : OnLaunchOptionsWithCst = {
    // 	...options,
    // 	cst: ReprotCstType.AppNormal
    // }
    let request_option : OnLaunchOptionsWithCst = {
      // @ts-ignore
      path: (options as OnLaunchOptions).path,
      cst: ReprotCstType.AppNormal
    }






    // 上报数据
    this.sendAppRequest(request_option, true)
  }
  /**
   * 进入应用
   * @description 上报主要数据采集是从onShow
   */
  load() {
    // 记录当前页面实例
    // this.appInstance = appInstance
  }

  /**
   * 进入应用或应用从后台进入前台
   */
  appShow() {
    // 通过 licationHide 判断,保证是进入后台后在次进入应用，避免重复上报数据
    // 当前方法在应用声明周期内，只会触发一次，即首次进入应用触发

    if (!this.licationHide) return
    const time = get_residence_time('app')
    // 需要判断进入后台是否超过时限 ，默认是 5min ，是的话需要执行进入应用的上报
    if (time.overtime) {
      let lastPageRoute = uni.getStorageSync('_STAT_LAST_PAGE_ROUTE') as string
      let options : OnLaunchOptionsWithCst = {
        path: lastPageRoute,
        scene: this.statData.sc,
        cst: ReprotCstType.AppAwakenTimeout,
      }
      this.sendAppRequest(options)
    }
    // 状态重置
    this.licationHide = false
  }

  /**
   * 引用进入后台触发
   * @param {Boolean} type 是否立即触发上报
   */
  appHide(type : boolean = false) {
    // 进入应用后台保存状态，方便进入前台后判断是否上报应用数据
    this.licationHide = true
    const time = get_residence_time('outher')

    const route = get_route().fullpath
    uni.setStorageSync('_STAT_LAST_PAGE_ROUTE', route)

    const formdata : PageParams = {
      url: route,
      urlref: route,
      urlref_ts: time.residenceTime,
      // urlref_tt: ''
    }


    this.sendHideRequest(formdata, type)
    // 更新页面首次访问时间
    set_first_time()
  }

  /**
   * 进入页面触发
   * @param {Page } self 当前页面实例
   */
  // @ts-ignore
  pageShow(self : Page) {
    // 初始化，标题数据。清空值，避免污染后面的上报数据
    this._navigationBarTitle = { config: '', page: '', report: '', lt: '' } as TitleConfigParams

    // 获取页面路径
    const { path, fullpath } = get_route(self)

    // 获取页面标题
    const pageTitle = get_page_name(path)
    this._navigationBarTitle.config = pageTitle


    // 表示应用触发 ，页面切换不触发之后的逻辑
    if (this.licationShow) {
      // 更新页面首次访问时间
      set_first_time()
      uni.setStorageSync('_STAT_LAST_PAGE_ROUTE', fullpath)
      this.licationShow = false
      return
    }
    // 页面进入
    const time = get_residence_time('page')
    // 停留时间,判断是否长时间停留在当前页面，如果超过30min重新上报数据
    if (time.overtime) {
      let options : OnLaunchOptionsWithCst = {
        path: fullpath,
        scene: this.statData.sc,
        cst: ReprotCstType.PageStayTimeout,
      }
      this.sendAppRequest(options)
    }
    // 更新页面首次访问时间
    set_first_time()
  }

  /**
   * 离开页面触发
   * @param {ComponentPublicInstance } self 当前页面实例
   */
  // @ts-ignore
  pageHide(self : Page) {
    // 如果进入后台则不触发后续 页面隐藏的逻辑
    if (this.licationHide) return
    const time = get_residence_time('page')

    let fullpath = get_route(self).fullpath
    let lastPageRoute = uni.getStorageSync('_STAT_LAST_PAGE_ROUTE')

    // 如果不存在的话，复制当前的路径，说明之前没有页面
    if (lastPageRoute == null) {
      lastPageRoute = fullpath
    }
    uni.setStorageSync('_STAT_LAST_PAGE_ROUTE', fullpath)

    const options : PageParams = {
      url: fullpath,
      urlref: lastPageRoute as string,
      urlref_ts: time.residenceTime,
      urlref_tt: ''
    }

    this.sendPageRequest(options)
  }

  appError(em : any) {
    let errmsg : string

    // @ts-ignore
    if (em instanceof Exception) {
      errmsg = em.message ?? ''
    } else if (em instanceof Error) {
      errmsg = em.message
    } else {
      errmsg = JSON.stringify(em)
    }






    let route = get_route().path

    let options : StatDefault = {
      ak: this.statData.ak,
      uuid: this.statData.uuid,
      p: this.statData.p,
      lt: '31',
      url: route,
      ut: this.statData.ut,
      ch: this.statData.ch,
      mpsdk: this.statData.mpsdk,
      mpv: this.statData.mpv,
      v: this.statData.v,
      em: errmsg,
      usv: this.statData.usv,
      t: get_time(),
    }

    this.request(options, false)
  }

  /**
   * 发送请求,应用维度上报
   * @param {Object} options 页面信息
   * @param {Boolean} type 是否立即上报
   */
  sendAppRequest(options : OnLaunchOptionsWithCst, type : boolean = false) {

    let is_opt = options.query != null && JSON.stringify(options.query) != '{}'
    // TODO ，此处处理的值有问题，
    // 如果页面有参数 需要上传如：/xxx/xxx?{xx:xx,xxx:xxx} 格式的值
    let query = is_opt ? '?' + JSON.stringify(options.query) : ''
    // 获取首次访问时间
    const first_time = get_first_visit_time()
    // 获取应用最后访问时间
    const last_time = get_last_visit_time()
    // 非老用户
    if (last_time != 0) {
      const odid = get_odid()
      // TODO 老版本的odid兼容问题，看看是否需要保留
      const have_device = is_handle_device()
      // 如果没有上报过设备信息 ，则需要上报设备信息
      if (!have_device) {
        this.statData.odid = odid
      }
    }
    this.statData.lt = ReportType.AppStart
    this.statData.url = options.path + query
    this.statData.t = get_time()
    this.statData.sc = get_scene(options)
    this.statData.fvts = first_time
    this.statData.lvts = last_time
    this.statData.tvc = get_total_visit_count()
    this.statData.cst = options.cst ?? ReprotCstType.AppNormal

    // TODO 获取应用版本，网络信息和地址信息
    // if (get_platform_name() === 'n') {
    // 	this.getProperty(type)
    // } else {
    // 	this.getNetworkInfo(type)
    // }


    this.request(this.statData, type)
  }

  /**
   * 发送请求,页面维度上报
   * @param {Object} opt
   */
  sendPageRequest(opt : PageParams) {
    let { url, urlref, urlref_ts } = opt
    this._navigationBarTitle.lt = ReportType.PageShow
    let options : StatDefault = {
      ak: this.statData.ak,
      uuid: this.statData.uuid,
      p: this.statData.p,
      lt: ReportType.PageShow,
      ut: this.statData.ut,
      url,
      // TODO 好像是没有这个参数,看一下具体描述
      tt: this.statData.tt,
      urlref,
      urlref_ts,
      ch: this.statData.ch,
      usv: this.statData.usv,
      t: get_time(),
    }
    this.request(options)
  }

  /**
   * 进入后台上报数据
   * @param {Object} opt 页面进入应用参数
   * @param {Boolean} type 是否立即上报数据
   */
  sendHideRequest(opt : PageParams, type : boolean) {
    let { urlref, urlref_ts } = opt
    let options : StatDefault = {
      ak: this.statData.ak,
      uuid: this.statData.uuid,
      p: this.statData.p,
      lt: ReportType.AppHide,
      ut: this.statData.ut,
      urlref: urlref,
      urlref_ts: urlref_ts,
      ch: this.statData.ch,
      usv: this.statData.usv,
      t: get_time(),
    }
    this.request(options, type)
  }

  /**
   * 推送数据上报
   * @param {any} options
   * @param {string} cid
   */
  sendPushRequest(options : any, cid : string) {
    let time = get_time()

    const statData : StatDefault = {
      uuid: this.statData.uuid,
      p: this.statData.p,
      ak: this.statData.ak,
      lt: ReportType.Push,
      cid: cid,
      t: time,
      ut: this.statData.ut,
    }

    const dataStr = JSON.stringify(statData)








    // @ts-ignore
    let uniStatData = JSON.parse<Map<string, StatDefault[]>>(dataStr)

    if (uniStatData == null) {
      uniStatData = new Map([])
    }



    const hasKey = uniStatData.has(ReportType.Push)
    if (!hasKey) {
      uniStatData.set(ReportType.Push, [])
    }

    // 将消息加入对列
    uniStatData.get(ReportType.Push)!.push(statData)

    const stat_data = handle_data(uniStatData)
    let optionsData : RequestData = {
      usv: STAT_VERSION, //统计 SDK 版本号
      t: time, //发送请求时的时间戮
      requests: stat_data,
    }

    this.sendRequest(optionsData)
  }


  /**
   * 自定义事件上报
   * @param {EventParams} data 事件参数
   */
  sendEventRequest(data : EventParams) {
    const key = data.key
    const value = data.value ?? ''

    let routepath = get_route().fullpath
    const lt = ReportType.Event
    this._navigationBarTitle.config = get_page_name(routepath)
    this._navigationBarTitle.lt = lt
    let options : StatDefault = {
      ak: this.statData.ak,
      uuid: this.statData.uuid,
      p: this.statData.p,
      lt: lt,
      ut: this.statData.ut,
      url: routepath,
      ch: this.statData.ch,
      e_n: key,
      e_v: typeof value === 'object' ? JSON.stringify(value) : value.toString(),
      usv: this.statData.usv,
      t: get_time(),
    }
    this.request(options)
  }

  /**
   * 发送请求
   * @param {StatDefault} data 上报数据
   * @param {Object} type 类型
   */
  request(data : StatDefault, type : boolean = false) {
    const statConfig = Config.getOptions()
    let time = get_time()

    // 需要把标题插入到数据中
    const title = this._navigationBarTitle
    data.ttn = title.page
    data.ttpj = title.config
    data.ttc = title.report

    if (statConfig.debug!) {
      // 打印输出日志
      Log(data)
    }

    const lt = data.lt!

    // 获取消息对列
    let statData = dbGet<string>('__UNI__STAT__DATA')

    if (statData == null) {
      statData = '{}'
    }


    let uniStatData = JSON.parse<Map<string, StatDefault[]>>(statData)

    if (uniStatData == null) {
      uniStatData = new Map([])
    }

    const hasKey = uniStatData.has(lt)
    if (!hasKey) {
      uniStatData.set(lt, [])
    }

    // 将消息加入对列
    uniStatData.get(lt)!.push(data)

    // 将 map 转换为 str
    const statDataStr = Map2String(uniStatData)
    // 存储
    dbSet('__UNI__STAT__DATA', statDataStr)

    let page_residence_time = get_page_residence_time()

    // 判断时候到达上报时间 ，默认 10 秒上报
    const is_timeout = page_residence_time < this.eportInterval && !type

    if (is_timeout) return

    // 时间超过，重新获取时间戳
    set_page_residence_time()

    if (statConfig.debug!) {
      // 待上传消息对列
      // console.log(`=== 统计待上传队列数据 ===`)
      const statJSON = Map2Json(uniStatData)
      console.log('=== 统计待上传队列数据 :', statJSON)
      // console.log(`=== 采集结束 ===`)
    }



    const stat_data = handle_data(uniStatData)

    let optionsData : RequestData = {
      usv: STAT_VERSION, //统计 SDK 版本号
      t: time, //发送请求时的时间戮
      requests: stat_data,
    }

    // 重置队列
    dbRemove('__UNI__STAT__DATA')

    this.sendRequest(optionsData)
  }

  sendRequest(options : RequestData) {
    const statConfig = Config.getOptions()

    if (Report.uniCloudInstance != null) {

      // 数据上报
      const app = Report.uniCloudInstance!


      // @ts-ignore
      const uniCloudObj = app.importObject('uni-stat-receiver', {
        customUI: true,
        // @ts-ignore
      } as UniCloudImportObjectOptions, UTSAndroid.getJavaClass(CloudObjectToDo))












      uniCloudObj
        .report(options)
        .then(() => {
          if (statConfig.debug!) {
            console.log(`=== 统计队列数据上报 :`, options)
            // console.log(options)
            // console.log(`=== 上报结束 ===`)
          }
        })
        .catch((err : any | null) => {
          console.log('=== 统计上报错误 :', JSON.stringify(err))
          // console.error(err)
          // console.log(`=== 上报结束 ===`)
        })
    }

  }
}
