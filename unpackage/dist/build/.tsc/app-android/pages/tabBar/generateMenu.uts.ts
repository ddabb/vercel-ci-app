import { pages, groups, subPackages } from '@/pages.json'

type Group = {
  id : string,
  name : string,
  children : (Group | null)[] | null
}

type PageGroup = {
  id : string,
  name : string,
  index : number
}

type Page = {
  path : string,
  style : UTSJSONObject,
  group ?: string | null,
}

export type MenuItem = {
  id : string,
  name : string,
  index : number,
  path : string,
  style : UTSJSONObject,
  group ?: string | null,
  items : MenuItem[]
}

subPackages.forEach(subPackage => {
  (subPackage.pages as UTSJSONObject[]).forEach(page => {
    pages.push({
      path: `${subPackage.root}/${page.path}`,
      style: page.style as UTSJSONObject,
      group: page.group
    })
  })
})

export function generateMenu(tabBarType : string) : MenuItem[] {
  let res : MenuItem[] = []
  const tabBarPages = JSON.parse<Page[]>(JSON.stringify(pages))!.filter((page : Page) : boolean => page.path.startsWith(tabBarType) && hasPageGroup(page.group))
  const groupTree = JSON.parse<(Group | null)[]>(JSON.stringify(groups))
  tabBarPages.forEach(page => {
    let menuItemArr : MenuItem[] = res
    let currentMenu : MenuItem | null = null
    const groupIndexList = page.group!.split(',').map((index : string) : number => parseInt(index))
    let currentGroups : (Group | null)[] | null = groupTree
    const pageGroups : PageGroup[] = []
    groupIndexList.forEach((groupIndex, index) => {
      // 跳过第一层 component API CSS
      if (index > 0) {
        pageGroups.push({ id: currentGroups![groupIndex]!.id, name: currentGroups![groupIndex]!.name, index: groupIndex } as PageGroup)
      }
      currentGroups = currentGroups![groupIndex]!.children
    })
    const lastGroup = pageGroups[pageGroups.length - 1]
    let hasPageGroup = false
    if (page.path.endsWith(camelToDash(lastGroup.name)) && pageGroups.length > 1) {
      hasPageGroup = true
      pageGroups.pop()
    }
    const groupLength = pageGroups.length
    pageGroups.forEach((group, groupIndex) => {
      const { index, id, name } = group

      const validIndex = index
      fillMenuArrayWithEmptyMenuItem(menuItemArr, validIndex)

      if (menuItemArr[validIndex].name == 'empty') {
        menuItemArr[validIndex] = {
          id: id.split('.').slice(-1)[0],
          name,
          index: validIndex,
          path: '',
          style: {},
          group: '',
          items: [] as MenuItem[],
        } as MenuItem
      }


      currentMenu = menuItemArr[validIndex]
      if (groupIndex < groupLength - 1) {
        menuItemArr = menuItemArr[validIndex].items
      }
    })

    const pageMenuItem : MenuItem = {
      id: page.path,
      name: page.style["navigationBarTitleText"] as string,
      index: lastGroup.index,
      path: page.path,
      style: page.style,
      group: page.group,
      items: [] as MenuItem[],
    }
    if (hasPageGroup) {
      const pageIndex = lastGroup.index
      fillMenuArrayWithEmptyMenuItem(currentMenu!.items, pageIndex)
      if (currentMenu!.items[pageIndex].name == 'empty') {
        currentMenu!.items[pageIndex] = pageMenuItem
      } else {
        currentMenu!.items.push(pageMenuItem)
      }
    } else {
      currentMenu!.items.push(pageMenuItem)
    }
  })

  return removeEmptyItem(res)
}

function hasPageGroup(value ?: string | null) : boolean {

  return value !== null




}

function camelToDash(camelStr : string) : string {
  return camelStr.replace(/([A-Z])/g, '-$1').toLowerCase()
}

function fillMenuArrayWithEmptyMenuItem(arr : MenuItem[], index : number) : void {
  const len = arr.length
  for (let i = 0; i <= index - (len - 1); i++) {
    arr.push({
      id: '',
      name: 'empty',
      index: i,
      path: '',
      style: {},
      group: '',
      items: [] as MenuItem[],
    } as MenuItem)
  }
}

function removeEmptyItem(arr : MenuItem[]) : MenuItem[] {
  const res = arr.filter((item : MenuItem) : boolean => item.name !== 'empty')
  res.forEach(menuItem => {
    addSetTabBarPage(menuItem)

    menuItem.items = removeEmptyItem(menuItem.items)




  })
  return res
}

function addSetTabBarPage(menuItem : MenuItem) {
  const { id, name } = menuItem
  if (id == 'page' && name == '页面和路由') {
    menuItem.items.push({
      id: 'set-tab-bar',
      name: '设置 TabBar',
      index: 0,
      path: 'set-tab-bar',
      style: {
        navigationBarTitleText: '设置 TabBar'
      },
      group: null,
      items: []
    } as MenuItem)
  }
}
