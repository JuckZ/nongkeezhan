import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/contantUs',
      name: 'ContantUs',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/ContantUs.vue')
    },
    {
      path:'/enterpriseProfile',
      name: 'enterpriseProfile',
      component: () => import('./views/EnterpriseProfile.vue')
    },
    {
      path:'/expert',
      name: 'Expert',
      component: () => import('./views/Expert.vue')
    },
    {
      path:'/fullData',
      name: 'FullData',
      component: () => import('./views/FullData.vue')
    },
    {
      path:'/login',
      name: 'Login',
      component: () => import('./views/Login.vue')
    },
    {
      path:'/news',
      name: 'News',
      component: () => import('./views/News.vue')
    },
    {
      path:'/register',
      name: 'Register',
      component: () => import('./views/Register.vue')
    },
    {
      path:'/service',
      name: 'Service',
      component: () => import('./views/Service.vue')
    },
    {
      path:'/technology',
      name: 'Technology',
      component: () => import('./views/Technology.vue')
    },
    {
      path:'/vipOnly',
      name: 'VipOnly',
      component: () => import('./views/VipOnly.vue')
    },
    {
      path:'*',
      name: 'ErrPage',
      component: () => import('./views/ErrPage.vue')
    }
  ]
})
