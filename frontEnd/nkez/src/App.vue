<template>
  <div id="app">
    <el-container>
      <el-header style="padding: 0px; height:auto;">
        <Header/>
      </el-header>
      <el-main style="padding: 0px;height:auto;">
        <router-view/>
      </el-main>
      <el-footer style="padding: 0px; height:auto;">
        <Footer/>
      </el-footer>
    </el-container>
  </div>
</template>
<script>
import Footer from './components/Footer.vue'
import Header from './components/Header.vue'
export default {
  components:{
    Header,
    Footer,
  }
}
</script>
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
