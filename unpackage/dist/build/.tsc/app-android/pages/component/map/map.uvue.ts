import _easycom_input_data from '@/components/input-data/input-data.vue'
import _easycom_boolean_data from '@/components/boolean-data/boolean-data.vue'
type TypeJestResult = {
    translateMarkerMsg : string,
    animationEnd : boolean,
    centerPoints : LocationObject,
    southwest : LocationObject,
    northeast : LocationObject,
    moveToLocationMsg : string,
    scale : number,
    eventDetailJsonStringify: string,
  }

  
const __sfc__ = defineComponent({
  __name: 'map',
  setup(__props, { expose: __expose }: SetupContext): any | null {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as InstanceType<typeof __sfc__>;
const _cache = __ins.renderCache;

  const testMarkers :Marker[]= [{
    id: 0,
    latitude: 39.989631,
    longitude: 116.481018,
    title: '方恒国际 阜通东大街6号',
    iconPath: '../../../static/location.png',
    rotate: 0,
    width: 20,
    height: 20,
    anchor: {
      x: 0.5,
      y: 1
    } ,
    callout: {
      content: '方恒国际 阜通东大街6号',
      color: '#00BFFF',
      fontSize: 10,
      borderRadius: 4,
      borderWidth: 1,
      borderColor: '#333300',
      bgColor: '#CCFF99',
      padding: 5,
      display: 'ALWAYS'
    } as MapMarkerCallout
  },
  {
    id: 1,
    latitude: 39.9086920000,
    longitude: 116.3974770000,
    title: '天安门',
    // zIndex: '1',
    iconPath: '../../../static/location.png',
    width: 40,
    height: 40,
    anchor: {
      x: 0.5,
      y: 1
    },
    callout: {
      content: '首都北京\n天安门',
      color: '#00BFFF',
      fontSize: 12,
      borderRadius: 10,
      borderWidth: 2,
      borderColor: '#333300',
      bgColor: '#CCFF11',
      padding: 5,
      display: 'ALWAYS'
    } as MapMarkerCallout
  },
  {
    id: 2,
    latitude: 39.894793,
    longitude: 116.321592,
    title: '北京西站',
    iconPath: '../../../static/location.png',
    width: 40,
    height: 40,
    anchor: {
      x: 0.5,
      y: 1
    },
    callout: {
      content: '北京西站',
      color: '#ffffff',
      fontSize: 12,
      borderRadius: 10,
      borderWidth: 2,
      borderColor: '#333300',
      bgColor: '#ff5500',
      padding: 5,
      display: 'ALWAYS'
    } as MapMarkerCallout
  },
  {
    id: 3,
    latitude: 39.902344,
    longitude: 116.484822,
    title: '北京东站',
    iconPath: '../../../static/location.png',
    width: 20,
    height: 20,
    anchor: {
      x: 0.5,
      y: 1
    },
    callout: {
      content: '北京东站',
      color: '#ffffff',
      fontSize: 12,
      borderRadius: 10,
      borderWidth: 2,
      borderColor: '#333300',
      bgColor: '#ff5500',
      padding: 5,
      display: 'ALWAYS'
    } as MapMarkerCallout
  },
  {
    id: 4,
    latitude: 39.865011,
    longitude: 116.379007,
    title: '北京南站',
    iconPath: '../../../static/location.png',
    width: 40,
    height: 40,
    anchor: {
      x: 0.5,
      y: 1
    },
    callout: {
      content: '北京南站',
      color: '#ffffff',
      fontSize: 12,
      borderRadius: 10,
      borderWidth: 2,
      borderColor: '#333300',
      bgColor: '#00aa00',
      padding: 5,
      display: 'ALWAYS'
    } as MapMarkerCallout
  },
  ];


  const testPolyline: Polyline[] = [{
    points: [{
      latitude: 39.925539,
      longitude: 116.279037
    },
    {
      latitude: 39.925539,
      longitude: 116.520285
    }],
    color: '#FFCCFF',
    width: 7,
    dottedLine: true,
    arrowLine: true,
    borderColor: '#000000',
    borderWidth: 2
  },
  {
    points: [{
      latitude: 39.938698,
      longitude: 116.275177
    },
    {
      latitude: 39.966069,
      longitude: 116.289253
    },
    {
      latitude: 39.944226,
      longitude: 116.306076
    },
    {
      latitude: 39.966069,
      longitude: 116.322899
    },
    {
      latitude: 39.938698,
      longitude: 116.336975
    }],
    color: '#CCFFFF',
    width: 5,
    dottedLine: false,
    arrowLine: true,
    borderColor: '#CC0000',
    borderWidth: 3
  }
  ];

  const testPolygons : Polygon[] = [{
    points: [{
      latitude: 39.781892,
      longitude: 116.293413
    },
    {
      latitude: 39.787600,
      longitude: 116.391842
    },
    {
      latitude: 39.733187,
      longitude: 116.417932
    },
    {
      latitude: 39.704653,
      longitude: 116.338255
    }],
    fillColor: '#FFCCFF',
    strokeWidth: 3,
    strokeColor: '#CC99CC',
    zIndex: 11
  },
  {
    points: [{
      latitude: 39.887600,
      longitude: 116.518932
    },
    {
      latitude: 39.781892,
      longitude: 116.518932
    },
    {
      latitude: 39.781892,
      longitude: 116.428932
    },
    {
      latitude: 39.887600,
      longitude: 116.428932
    }
    ],
    fillColor: '#CCFFFF',
    strokeWidth: 5,
    strokeColor: '#CC0000',
    zIndex: 3
  }
  ];

  const testCircles: Circle[] = [{
    latitude: 39.996441,
    longitude: 116.411146,
    radius: 15000,
    strokeWidth: 5,
    color: '#CCFFFF',
    fillColor: '#CC0000'
  },
  {
    latitude: 40.096441,
    longitude: 116.511146,
    radius: 12000,
    strokeWidth: 3,
    color: '#CCFFFF',
    fillColor: '#FFCCFF'
  },
  {
    latitude: 39.896441,
    longitude: 116.311146,
    radius: 9000,
    strokeWidth: 1,
    color: '#CCFFFF',
    fillColor: '#CC0000'
  }
  ];

  const testIncludePoints :LocationObject[] = [{
    latitude: 39.989631,
    longitude: 116.481018,
  },
  {
    latitude: 39.9086920000,
    longitude: 116.3974770000,
  }
  ];


  const mapContext = ref(null as MapContext | null);
  const location = ref({ longitude: 116.39742, latitude: 39.909 } as LocationObject);
  const rotate = ref(0);
  const skew = ref(0);
  // 自动化测试
  const autoTest = ref(false);
  const updateAutoTest = (value : boolean) => {
    autoTest.value = value
  }


  const jestResult = reactive({
    translateMarkerMsg: "",
    animationEnd: false,
    centerPoints: {
      latitude: 0,
      longitude: 0
    },
    southwest: {
      latitude: 0,
      longitude: 0
    },
    northeast: {
      latitude: 0,
      longitude: 0
    },
    moveToLocationMsg: "",
    scale: 0,
    eventDetailJsonStringify: "{}"
  } as TypeJestResult);


  onReady(() => {
    mapContext.value = uni.createMapContext("map1", getCurrentInstance()!.proxy!)
  });

  const scale = ref(13);
  const confirm_scale_input = (value : number) => {
    scale.value = value
  };

  const controls = ref([] as Control[]);
  const addControls = () => {
    controls.value = [{
      id: 1,
      position: {
        left: 5,
        top: 180,
        width: 30,
        height: 30
      } as ControlPosition,
      iconPath: '../../../static/uni.png',
      clickable: true
    } as Control]
  }

  const showLocation = ref(false);
  const enable3D = ref(false);
  const showCompass = ref(false);
  const enableOverlooking = ref(false);
  const enableRotate = ref(false);
  const enableZoom = ref(true);
  const enableScroll = ref(true);
  const enableSatellite = ref(false);
  const enableTraffic = ref(false);
  const change_show_location = (checked : boolean) => {
    showLocation.value = checked
  }

  const change_enable_3d = (checked : boolean) => {
    enable3D.value = checked
  }

  const change_show_campass = (checked : boolean) => {
    showCompass.value = checked
  }

  const change_enable_overlooking = (checked : boolean) => {
    enableOverlooking.value = checked
  }

  const change_enable_rotate = (checked : boolean) => {
    enableRotate.value = checked
  }

  const change_enable_zoom = (checked : boolean) => {
    enableZoom.value = checked
  }

  const change_enable_scroll = (checked : boolean) => {
    enableScroll.value = checked
  }

  const change_enable_satellite = (checked : boolean) => {
    enableSatellite.value = checked
  }

  const change_enable_traffic = (checked : boolean) => {
    enableTraffic.value = checked
  }

  const includePoints = ref([] as LocationObject[]);
  const includePoint = () => {
    includePoints.value = testIncludePoints;
  };


  let markers = ref([] as Marker[]);
  const addMarkers = () => {
    scale.value = 11
    const temp = JSON.parse<Marker[]>(JSON.stringify(testMarkers))!
    markers.value = temp
  };

  const removeMarker = () => {

    mapContext.value?.removeMarkers({markerIds:[4]})















  };





















  const polyline = ref([] as Polyline[]);
  const addPolyline = () => {
    scale.value = 11;
    polyline.value = JSON.parse<Polyline[]>(JSON.stringify(testPolyline))!;
  };
  const removePolyline = () => {
    if (polyline.value.length > 1) {
      polyline.value = JSON.parse<Polyline[]>(JSON.stringify(testPolyline))!.splice(0, 1);
    }
  };


  const polygons = ref([] as Polygon[]);
  const addPolygons = () => {
    scale.value = 10;
    polygons.value = JSON.parse<Polygon[]>(JSON.stringify(testPolygons))!;
  };
  const removePolygon = () => {
    if (polygons.value.length > 1) {
      polygons.value = JSON.parse<Polygon[]>(JSON.stringify(testPolygons))!.splice(0, 1);
    }
  };


  const circles = ref([] as Circle[]);
  const addCircles = () => {
    scale.value = 10;
    circles.value = JSON.parse<Circle[]>(JSON.stringify(testCircles))!;
  };
  const removeCircle = () => {
    if (circles.value.length > 1) {
      circles.value = JSON.parse<Circle[]>(JSON.stringify(testCircles))!.slice(1);
    }
  };

  const handleGetCenterLocation = () => {
      mapContext.value?.getCenterLocation({
        success: ret => {
          // console.log('getCenterLocation',ret);
          jestResult.centerPoints = ret;
          if (!autoTest.value) {
            uni.showModal({
              content: JSON.stringify(ret)
            });
          }
        }
      });
  };

  const handleGetRegion = () => {
      mapContext.value?.getRegion({
        success: ret => {
          // console.log('getRegion',JSON.stringify(ret));
          jestResult.southwest = ret.southwest;
          jestResult.northeast = ret.northeast
          if (!autoTest.value) {
            uni.showModal({
              content: JSON.stringify(ret)
            });
          }
        }
      });
  };


  const handleTranslateMarker = () => {
      mapContext.value?.translateMarker({
        markerId: 1,
        destination: {
          latitude: 39.989631,
          longitude: 116.481018
        },
        autoRotate: true,
        rotate: 10,
        duration: 2000,
        moveWithRotate: true,






        success: ret => {
          console.log('handleTranslateMarker',JSON.stringify(ret));
          const result = ret as UTSJSONObject
          jestResult.translateMarkerMsg = result["errMsg"] as string;
        },
        fail: error => {
          console.log(error)
        }
      });
      mapContext.value?.translateMarker({
        markerId: 2,
        destination: {
          latitude: 39.902344,
          longitude: 116.484822,
        },
        autoRotate: true,
        rotate: 0,
        duration: 2000,
        success: ret => {
          console.log('handleTranslateMarker', JSON.stringify(ret));
        },
        fail: error => {
          console.log(error)
        }
      });
  };


  const handleGetScale = () => {
      mapContext.value?.getScale({
        success: res => {
          // console.log('getScale',res);
          scale.value = res.scale
          jestResult.scale = res.scale
          if (!autoTest.value) {
            uni.showModal({
              content: '当前地图的缩放级别为：' + res.scale
            });
          }
        },
        fail: error => {
          console.log(error)
        },
      });
  };

  const handleMoveToLocation = () => {
      mapContext.value?.moveToLocation({
        latitude: 39.909,
        longitude: 116.39742,
        success: res => {
          console.log('moveToLocation',res);
          const result = res as UTSJSONObject
          jestResult.moveToLocationMsg = result["errMsg"] as string;

          if (!autoTest.value) {
            uni.showModal({
              content: JSON.stringify(res)
            });
          }
        },
        fail: error => {
          console.log(error)
        }
      });
  };

  const handleMoveToMyLocation = () => {
    mapContext.value?.moveToLocation({
      success: res => {
        uni.showModal({
          content: '地图中心已经移动到当前位置'
        })
      },
      fail: error => {
        console.log(error);
      }
    })
  }

  const maptap = (e : UniMapTapEvent) => {






    // console.log('点击地图时触发',e)
    uni.showModal({
      content: JSON.stringify(e.detail)
    });

  };

  const onmarkertap = (e : UniMapMarkerTapEvent) => {
    // console.log('点击标记点时触发',e)
    uni.showModal({
      content: JSON.stringify(e.detail)
    });
  };

  const oncontroltap = (e : UniMapControlTapEvent) => {
    // console.log('点击控件时触发',e)
    uni.showModal({
      content: JSON.stringify(e.detail)
    });
  };

  const oncallouttap = (e : UniEvent) => {
    // console.log('点击标记点对应的气泡时触发',e)
    uni.showModal({
      content: JSON.stringify(e)
    });
  };

  const onupdated = (e : UniMapUpdatedEvent) => {
    console.log('在地图渲染更新完成时触发', e)
  };

  const onregionchange = (e : UniMapRegionChangeEvent) => {
    console.log('视野发生变化时触发', e.detail)
    jestResult.eventDetailJsonStringify = JSON.stringify(e.detail)
  };

  const onpoitap = (e : UniMapPoiTapEvent) => {
    // console.log('点击地图poi点时触发',e)
    uni.showModal({
      content: JSON.stringify(e.detail)
    });
  };

  __expose({
    jestResult,
    autoTest,
    updateAutoTest,
    addControls,
    addMarkers,



    removeMarker,
    addPolyline,
    removePolyline,
    addPolygons,
    removePolygon,
    addCircles,
    removeCircle,
    includePoint,
    handleGetCenterLocation,
    handleGetRegion,
    handleTranslateMarker,
    handleMoveToLocation,
    handleGetScale
  })

return (): any | null => {

const _component_map = resolveComponent("map", true)
const _component_input_data = resolveEasyComponent("input-data",_easycom_input_data)
const _component_boolean_data = resolveEasyComponent("boolean-data",_easycom_boolean_data)

  return createElementVNode("view", utsMapOf({ class: "content" }), [
    createVNode(_component_map, utsMapOf({
      class: "map",
      id: "map1",
      ref: "map1",
      longitude: unref(location).longitude,
      latitude: unref(location).latitude,
      scale: unref(scale),
      markers: unref(markers),
      "include-points": unref(includePoints),
      polyline: unref(polyline),
      polygons: unref(polygons),
      circles: unref(circles),
      controls: unref(controls),
      "show-location": unref(showLocation),
      "enable-3D": unref(enable3D),
      rotate: unref(rotate),
      skew: unref(skew),
      "show-compass": unref(showCompass),
      "enable-overlooking": unref(enableOverlooking),
      "enable-zoom": unref(enableZoom),
      "enable-scroll": unref(enableScroll),
      "enable-rotate": unref(enableRotate),
      "enable-satellite": unref(enableSatellite),
      "enable-traffic": unref(enableTraffic),
      onMarkertap: onmarkertap,
      onCallouttap: oncallouttap,
      onControltap: oncontroltap,
      onRegionchange: onregionchange,
      onTap: maptap,
      onUpdated: onupdated,
      onPoitap: onpoitap
    }), null, 8 /* PROPS */, ["longitude", "latitude", "scale", "markers", "include-points", "polyline", "polygons", "circles", "controls", "show-location", "enable-3D", "rotate", "skew", "show-compass", "enable-overlooking", "enable-zoom", "enable-scroll", "enable-rotate", "enable-satellite", "enable-traffic"]),
    createElementVNode("scroll-view", utsMapOf({
      class: "scrollview",
      "scroll-y": "true"
    }), [
      createElementVNode("view", utsMapOf({ class: "tips" }), "注意：需要正确配置地图服务商的Key才能正常显示地图组件"),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "属性示例")
      ]),
      createVNode(_component_input_data, utsMapOf({
        defaultValue: "13",
        title: "scale: 缩放级别，取值范围为5-18",
        type: "number",
        onConfirm: confirm_scale_input
      })),
      createVNode(_component_boolean_data, utsMapOf({
        defaultValue: unref(showLocation),
        title: "开启显示带有方向的当前定位点",
        onChange: change_show_location
      }), null, 8 /* PROPS */, ["defaultValue"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enable3D),
        disabled: unref(enableSatellite),
        title: "3D效果(放大缩放级别才能看到建筑物3D效果)",
        onChange: change_enable_3d
      }), null, 8 /* PROPS */, ["default-value", "disabled"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(showCompass),
        title: "显示指南针",
        onChange: change_show_campass
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableOverlooking),
        title: "俯视支持",
        onChange: change_enable_overlooking
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableRotate),
        title: "旋转支持",
        onChange: change_enable_rotate
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableZoom),
        title: "缩放支持",
        onChange: change_enable_zoom
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableScroll),
        title: "拖动支持",
        onChange: change_enable_scroll
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableSatellite),
        title: "卫星图",
        onChange: change_enable_satellite
      }), null, 8 /* PROPS */, ["default-value"]),
      createVNode(_component_boolean_data, utsMapOf({
        "default-value": unref(enableTraffic),
        title: "实时路况",
        onChange: change_enable_traffic
      }), null, 8 /* PROPS */, ["default-value"]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: addControls
      }), "控件"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: addMarkers
      }), "添加标记点"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: removeMarker
      }), "移除ID为4的标记点和标签"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: addPolyline
      }), "添加路线"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: removePolyline
      }), "移除一条路线"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: addPolygons
      }), "添加多边形"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: removePolygon
      }), "移除一个多边形"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: addCircles
      }), "添加圆"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: removeCircle
      }), "移除一个圆"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: includePoint
      }), "缩放视野以包含所有给定的坐标点"),
      createElementVNode("view", utsMapOf({ class: "uni-title" }), [
        createElementVNode("text", utsMapOf({ class: "uni-title-text" }), "方法示例")
      ]),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleGetCenterLocation
      }), "获取当前地图中心的经纬度"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleGetRegion
      }), "获取当前地图的视野范围"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleTranslateMarker
      }), "平移marker"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleMoveToLocation
      }), "将地图中心移动到指定坐标"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleMoveToMyLocation
      }), "将地图中心移动到当前位置"),
      createElementVNode("button", utsMapOf({
        class: "button",
        onClick: handleGetScale
      }), "获取当前地图的缩放级别")
    ])
  ])
}
}

})
export default __sfc__
const GenPagesComponentMapMapStyles = [utsMapOf([["content", padStyleMapOf(utsMapOf([["flex", 1]]))], ["map", padStyleMapOf(utsMapOf([["width", "100%"], ["height", 300], ["backgroundColor", "#f0f0f0"]]))], ["scrollview", padStyleMapOf(utsMapOf([["flex", 1], ["paddingTop", 10], ["paddingRight", 10], ["paddingBottom", 10], ["paddingLeft", 10]]))], ["button", padStyleMapOf(utsMapOf([["marginTop", 5], ["marginBottom", 5]]))], ["tips", padStyleMapOf(utsMapOf([["fontSize", 12], ["marginTop", 15], ["opacity", 0.8]]))]])]
