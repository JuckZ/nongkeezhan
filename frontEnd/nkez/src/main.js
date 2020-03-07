import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from './http'
import Qs from 'qs'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
// import '../node_modules/bootstrap/dist/js/bootstrap'
import animate from 'animate.css'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// 开启vue的debug模式
Vue.config.debug = true;
axios.defaults.withCredentials=true;
Vue.config.productionTip = false;
Vue.prototype.$axios = axios;
Vue.prototype.$qs = Qs;

Vue.use(ElementUI)
Vue.use(animate)
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
