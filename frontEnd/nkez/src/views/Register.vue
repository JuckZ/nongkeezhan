<template>
    <section class="form_container">
      <el-col>
        <el-card shandow="hover" header="注册" >
          <el-form :model="registerUser" :rules="rules" ref="registerForm" label-width="100px" class="registerForm">
          <el-form-item label="账号" prop="account">
            <el-input v-model="registerUser.account" placeholder="请输入账户名"></el-input>
          </el-form-item>
          <el-form-item label="密码" prop="password">
            <el-input type="password" v-model="registerUser.password" placeholder="请输入密码"></el-input>
          </el-form-item>
          <el-form-item label="确认密码" prop="password2">
            <el-input type="password" v-model="registerUser.password2" placeholder="请确认密码"></el-input>
          </el-form-item>
          <el-form-item label="手机号码" prop="phone">
            <el-input v-model="registerUser.phone" placeholder="请输入手机号码"></el-input>
          </el-form-item>
          <el-form-item label="生日" prop="birthday">
              <el-date-picker
                style="width:100%"
                v-model="registerUser.birthday"
                type="date"
                placeholder="选择日期">
              </el-date-picker>
          </el-form-item>
          <el-form-item label="邮箱" prop="email">
            <el-input v-model="registerUser.email" placeholder="请输入邮箱"></el-input>
          </el-form-item>
          <el-form-item label="留言" prop="liuyan">
            <el-input type="textarea" v-model="registerUser.liuyan" placeholder="您可以在此处留言......"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @keyup.enter="submitForm('registerForm')" @click="submitForm('registerForm')">立即注册</el-button>
            <el-button @click="resetForm('registerForm')">重新输入</el-button>
          </el-form-item>
          </el-form>
        </el-card>
      </el-col>
    </section>
</template>

<script>
 export default {
    name: 'register',
    components: {},
    data() {
      var validatePass2 = (rule,value,callback)=>{
        if(value!=this.registerUser.password){
          callback(new Error('两次输入密码不一致！'));
        }else{
          callback();
        }
      }
      return {
        registerUser:{
          account:'',
          emamil:'',
          password:'',
          password2:'',
          birthday:'',
          liuyan:''
        },
        rules:{
          account:[{
            required:true,
            message:"用户名不能为空",
            trigger:"blur"
          },
          {
            min:3,max:20,message:"长度要在3-20个字符之间",trigger:"blur"
          }],
          email:[{
            type:"email",
            required:true,
            message:"邮箱格式不正确",
            trigger:"blur"
          }],
          password:[
            {
              required:true,message:"密码不能为空",trigger:"blur"
            },
            {
              min:3,max:20,message:"长度要在3-20个字符之间",trigger:"blur"
            }
          ],
          password2:[
            {
              required:true,message:"确认密码不能为空",trigger:"blur"
            },
            {
              min:3,max:20,message:"长度要在3-20个字符之间",trigger:"blur"
            },
            {
              validator:validatePass2,
              trigger:"blur"
            }
          ]
        }
      }
    },
    methods: {
      submitForm(formName) {
        var self = this;
        this.$refs[formName].validate((valid) => {
          if (valid) {
              // 获取农科e站的新闻
              self.$axios.post('/nkezApi/user/user_registered', {
              userId:'sdafsdfsad',
              userAccount:self.registerUser.account,
              userPassword:self.registerUser.password,
              userPhone:self.registerUser.phone,
              userEmail:self.registerUser.email,
              userBirthday:self.registerUser.birthday,
              userLiuyan:self.registerUser.liuyan
            })
            .then(function (response) {
              window.console.log(response)
              if(response.data.code==0){
                  self.$message({
                  message:"账号注册成功！",
                  type:'success'
                });
                  self.$router.push('/login');
              }
              else
                self.$message.error('注册失败')
            })
            .catch(function (error) {
              window.console.log(error);
            });
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
</style>