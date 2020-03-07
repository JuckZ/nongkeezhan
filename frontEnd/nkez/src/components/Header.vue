<template>
    <div id="nav">
        <el-menu
        :default-active="activeIndex"
        class="el-menu-demo"
        mode="horizontal"
        @select="handleSelect"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b">
        <el-menu-item index="/">首页</el-menu-item>
        <el-menu-item index="/news">新闻资讯</el-menu-item>
        <el-menu-item index="/expert">专家展示</el-menu-item>
        <el-menu-item index="/technology">技术全览</el-menu-item>
        <el-menu-item index="/service">企业服务</el-menu-item>
        <el-submenu index="/login">
            <template slot="title"><span @click="toWhere('/login')">会员登录</span></template>
            <el-menu-item index="/login">会员登录</el-menu-item>
            <el-menu-item index="/register">会员注册</el-menu-item>
            <el-menu-item index="/loginOut">注销登陆</el-menu-item>
        </el-submenu>
        <el-submenu index="/vipOnly">
            <template slot="title"><span @click="toWhere('/vipOnly')">会员专享</span></template>
            <el-menu-item index="/vipOnly">会员专享</el-menu-item>
            <el-menu-item index="/fullData">专家深度资料</el-menu-item>
            <el-menu-item index="/messageBoard">留言</el-menu-item>
        </el-submenu>
        <el-menu-item index="/enterpriseProfile">企业简介</el-menu-item>
        <el-menu-item index="/contantUs">联系我们</el-menu-item>
        </el-menu>

        <!-- 留言框 -->
        <el-dialog
          title="请输入您的留言"
          :visible.sync="dialogVisible"
          width="30%"
          :before-close="handleClose">
          <div class="form-group">
            <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
          </div>
          <span slot="footer" class="dialog-footer">
            <el-button @click="dialogVisible = false">取 消</el-button>
            <el-button type="primary" @click="handleCommit()">留 言</el-button>
          </span>
        </el-dialog>
    </div>
</template>

<script>
export default {
  data () {
    return {
      activeIndex: '/',
      dialogVisible:false
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      if(key=="/messageBoard"){
        // 留言
        if(localStorage.getItem('account')==""||localStorage.getItem('account') == undefined){
        this.$message.error("您尚未登录，无法留言！");
        // 禁用深度资料按钮
        this.dialogVisible=false
      } else if(key=="/loginOut"){
        localStorage.removeItem("account")
      }
      else{
        this.dialogVisible=true
      }
      }else{
        this.$router.push(key)
      }
      window.console.log(keyPath,key)
    },
    // 跳转
    toWhere(target){
      this.activeIndex=target;
      this.$router.push(target)
    },
    handleClose(done) {
        this.$confirm('确认关闭？')
          .then(() => {
            done();
          })
          .catch(() => {});
    },
    handleCommit(){
      var self = this
      self.$message({
        "message":"留言成功！",
        "type":"success"
      })
      self.dialogVisible = false
    }
  }
}

</script>

<style>
#nav {
  padding: 0px;
  background-color: #2c2c2c;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

</style>