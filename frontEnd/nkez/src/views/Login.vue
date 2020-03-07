<template>
    <section class="login">
      <el-col>
        <el-card shadow="hover" header="登录">
          <el-form :model="loginUser" :rules="rules" ref="loginForm" label-width="80px" class="loginForm">
            <el-form-item label="账号" prop="account">
              <el-input v-model="loginUser.account" placeholder="请输入账号"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="password">
              <el-input type="password" v-model="loginUser.password" placeholder="请输入密码" @keyup.enter.native="submitForm('loginForm')"></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" class="submit_btn" @click="submitForm('loginForm')">登录</el-button>
              <el-button @click="resetForm('loginForm')">重置</el-button>
            </el-form-item>
            <el-breadcrumb separator="  ">
              <el-breadcrumb-item :to="{ path: '/Register' }">前往注册</el-breadcrumb-item>
              <el-breadcrumb-item :to="{ path: '/Forget' }">忘记密码?</el-breadcrumb-item>
              <el-breadcrumb-item></el-breadcrumb-item>
            </el-breadcrumb>
            
          </el-form>
        </el-card>
      </el-col>
    </section>
</template>

<script>
  export default {
    name: 'login',
    components: {},
    data() {
      return {
        loginUser:{
          account:'',
          password:''
        },
        rules:{
          account:[{
            required:true,
            message:"账号不能为空",
            trigger:"blur"
          },
          {
            min:3,max:20,message:"长度要在3-20个字符之间",trigger:"blur"
          }],
          password:[
            {
              required:true,message:"密码不能为空",trigger:"blur"
            },
            {
              min:3,max:20,message:"长度要在3-20个字符之间",trigger:"blur"
            }
          ]
        }
      }
    },
    methods: {
      juck(){

      },
      submitForm(formName) {
        var self = this;
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var params = new URLSearchParams();
            params.append('account', self.loginUser.account);
            params.append('userPasswd', self.loginUser.userPasswd);
            self.$axios.post('/nkezApi/user/user_login',{
              userAccount:self.loginUser.account,
              userPassword:self.loginUser.password
            })
            .then(res=>{
              window.console.info(res)
              if(res.data.code==0){
                self.$message({
                    message: "登陆成功",
                    type:'success'
                  });
                  // 存储到session中，并跳转到首页
                  localStorage.setItem("account", self.loginUser.account);
                  self.$router.push('/')
              }
              else
                self.$message.error(res.data.message)
          })
          .catch(function (error) {
          window.console.log(error);
          });
          } else {
            window.console.log('error login!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style>
  .el-col{
    text-align: center;
    padding-top: 60px;
  }
  .el-card{
    display: inline-block;
    width: 60%;
    min-width: 500px;
  }
  .el-breadcrumb{
    float: right;
  }
</style>