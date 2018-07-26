const menus = [
  { id: '0', label: '控制面板', path: '/', icon: 'fa fa-dashboard' },
  {
    id: 'x1', icon: 'fa fa-server', label: '字典', submenu: [
      { id: 'x101', label: '数据类型', icon: '', path: '/dynamicListWindow/datatype' },
      { id: 'x102', label: '实体类型', icon: '', path: '/dynamicListWindow/entitytype' },
      { id: 'x103', label: '系统元素', icon: '', path: '/dynamicListWindow/element' },
      { id: 'x104', label: '引用表', icon: '', path: '/dynamicListWindow/reference' },
      { id: 'x105', label: '表', icon: '', path: '/dynamicListWindow/table' },
      { id: 'x106', label: '窗口', icon: '', path: '/dynamicListWindow/window' }
    ]
  },
  {
    id: 'x2', icon: 'fa fa-compass', label: '组织', submenu: [
      { id: 'x2101', label: '客户', icon: 'fa fa-address-card-o', path: '/dynamicListWindow/client' },
      { id: 'x2102', label: '组织', icon: 'fa fa-american-sign-language-interpreting', path: '/dynamicListWindow/org' },
      { id: 'x2103', label: '用户', icon: 'fa fa-user-circle', path: '/dynamicListWindow/user' },
      { id: 'x2104', label: '客户:System', icon: 'fa fa-user-o', path: '/dynamicFormWindow/client/40289f65642bc6b401642bc6b6160000' },
      { id: 'x2105', label: '用户:System', icon: 'fa fa-user-o', path: '/dynamicFormWindow/user/40289f65642bc6b401642bc6b6160002' },
      { id: 'x2106', label: '用户:SuperUser', icon: 'fa fa-user-o', path: '/dynamicFormWindow/user/40289f65642bc6b401642bc6b6160003' }
    ]
  },
  {
    id: 'components',
    icon: 'fa fa-microchip',
    label: '组件',
    submenu: [
      {
        id: 't001',
        label: '动态表单-Client',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicFormWindow/client/40289f65642bc6b401642bc6b6160000'
      },
      {
        id: 't002',
        label: '动态表单-User',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicFormWindow/puser/40289f65642bc6b401642bc6b6160002'
      },
      {
        id: 't010',
        label: '动态窗口-窗口',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicListWindow/window'
      },
      {
        id: 't011',
        label: '动态窗口-表',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicListWindow/table'
      },
      {
        id: 't02',
        label: '动态组件测试',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicComponent/dataType'
      },
      {
        id: 't1',
        label: '动态创建测试',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicTest'
      },
      {
        id: 't11',
        label: '动态表格-Use Store',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicTable2/dataType'
      },
      {
        id: 't2',
        label: '动态表格',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicTable/dataType'
      },
      {
        id: 't12',
        label: '动态表单',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicWindow/dataType'
      },
      {
        id: 't3',
        label: '系统元素',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicWindow/element'
      },
      {
        id: 't4',
        label: '实体类型',
        icon: 'fa fa-hand-o-up',
        path: '/dynamicWindow/entityType'
      },
      ['Form 表单', [
        { id: 'f1', name: 'c-button', label: 'Button 按钮', icon: 'fa fa-hand-o-up' },
        { id: 'f2', name: 'c-switch', label: 'Switch 开关', icon: 'fa fa-square-o' },
        { id: 'f3', name: 'c-checkbox', label: 'Checkbox 多选框', icon: 'fa fa-check-square' },
        // {id: 'f4', label: 'Radio 单选框', icon: 'fa fa-dot-circle-o'},
        { id: 'f5', name: 'c-input', label: 'Input 输入框', icon: 'fa fa-pencil' },
        { id: 'f6', name: 'c-keyboard', label: '虚拟键盘', icon: 'fa fa-keyboard-o' }
      ]],
      ['Notice', [
        { id: 'n1', name: 'c-alert', label: 'Alert 警告', icon: 'fa fa-info' },
        { id: 'n2', name: 'c-loading', label: 'Loading 加载', icon: 'fa fa-circle-o-notch' }
      ]],
      ['Other', [
        { id: 'c-dropdown', name: 'c-dropdown', label: 'Dropdown' },
        { id: 'c-navbar', name: 'c-navbar', label: 'Navbar' },
        { id: 'c-container', name: 'c-container', label: '栅格布局' }
      ]]
    ]
  },
  {
    id: 'pages',
    icon: 'fa fa-circle-o',
    label: 'Pages 页面',
    submenu: [
      { id: 'p-data-table', name: 'p-data-table', label: 'Table 表格数据' },
      { id: 'cnode', name: 'cnode', label: 'Cnode社区' },
      { id: 'p1', name: 'login', label: 'Login 登录' },
      { id: 'p2', name: 'p-login', label: 'Login 登录2' },
      { id: 'p3', name: 'p-register', label: 'Register 注册' },
      { id: '400', path: '/404', label: '404' },
      { id: '500', path: '/500', label: '500' }
    ]
  },
  {
    id: 'version',
    icon: 'fa fa-meetup',
    label: '应用'
  }
]
export default menus
