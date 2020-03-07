<!--  -->
<template>
  <div>
    <el-row>
      <el-col :span="8">
        <h3 style="color: #fff;
          background-color: #4cb4e7;
          height: 50px;
          line-height: 50px;
          font-size:20px;
          margin:6px 0 0 0;"
          >
          专家分类
        </h3>
        <div id="sortExpertForCarousel">
          <el-col :span="12">
            <div class="list-group">
              <button type="button" @click="changeExpertForCarousel('作物育种与栽培')" class="list-group-item list-group-item-action">作物育种与栽培类</button>
              <button type="button" @click="changeExpertForCarousel('植物保护')" class="list-group-item list-group-item-action">植物保护类</button>
              <button type="button" @click="changeExpertForCarousel('果蔬园艺')" class="list-group-item list-group-item-action">果蔬园艺类</button>
              <button type="button" @click="changeExpertForCarousel('畜牧兽医')" class="list-group-item list-group-item-action">畜牧兽医类</button>
            </div>
          </el-col>
          <el-col :span="12">
            <div class="list-group">
              <button type="button" @click="changeExpertForCarousel('资源环境')" class="list-group-item list-group-item-action">资源环境类</button>
              <button type="button" @click="changeExpertForCarousel('食品科学')" class="list-group-item list-group-item-action">食品科学类</button>
              <button type="button" @click="changeExpertForCarousel('农业工程技术及机械')" class="list-group-item list-group-item-action">农业工程技术及机械类</button>
              <button type="button" @click="changeExpertForCarousel('其他')" class="list-group-item list-group-item-action">其他</button>
            </div>
          </el-col>
        </div>
      </el-col>
      <el-col :span="16">
        <el-carousel :interval="2000" type="card" height="260px">
          <el-carousel-item class="expertCarouselImg" v-for="(item,index) in expertForCarousel" :key="index">
            <img style="border-radius:130px;width:260px;height:260px" :src="item.professorPicture" alt="">
          </el-carousel-item>
        </el-carousel>
      </el-col>
    </el-row>
    <h3 style="color: #fff;
      background-color: #4cb4e7;
      height: 42px;
      line-height: 42px;
      font-size:20px;
      margin:20px 0"
      >
      专家全览
    </h3>
    <el-row>
      <el-col :span="8" v-for="(item, index) in allExpert" :key="index">
        <el-card style="margin: 20px;height:360px">
          <img style="max-width:300px;max-height:200px" :src="item.professorPicture" class="image">
          <div style="padding: 0px;">
            <h4>{{item.professorName}}</h4>
            <div>
              <p class="professorZlTop">{{item.professorZl}}</p>
              <el-popover
                placement="right"
                trigger="click">
                  <div class="professorZlAllContent" style="max-width:420px;max-height:420px;overflow-x:hidden;overflow-y:scroll">
                    <h4 style="text-align:center">{{item.professorName}}</h4>
                    <img style="max-width:400px" :src="item.professorPicture" alt="">
                    <p style="
                    max-width:400px;
                    line-height:1.5em;
                    white-space: pre-wrap;       
                    white-space: -moz-pre-wrap;  
                    white-space: -pre-wrap;      
                    white-space: -o-pre-wrap;    
                    word-wrap: break-word;   
                    ">{{item.professorZl}}</p>
                  </div>
                <el-button :disabled="disableOrNot" slot="reference">深度资料</el-button>
              </el-popover>
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>
    <el-pagination
      background
      layout="prev, pager, next"
      :total="total"
      :page-size="pageSize"
      @current-change="changePage"
      :current-page="pageNum">
    </el-pagination>
  </div>
</template>

<script>
export default {
  data () {
    return {
      allExpert:[],
      expertForCarousel:[],
      pageNum:1,
      pageSize:6,
      total:6,
      disableOrNot:'true'
    };
  },

  components: {},

  computed: {},

  mounted(){
    var self = this;
    // 未登录不能查看深度资料
    if(localStorage.getItem('account')==""||localStorage.getItem('account') == undefined){
      this.$message.error("您尚未登录，无法查看深度资料！");
      // 禁用深度资料按钮
      this.disableOrNot=true
    } else{
      this.disableOrNot=false
    }
    // 获取农科e站的专家
    self.$axios.post('/nkezApi/professor/professor_list', {
    "pageNum":1,
    "pageSize":6
  })
  .then(function (response) {
    self.allExpert = response.data.data.list;
    self.expertForCarousel = self.allExpert;
    self.pageNum = response.data.data.pageNum;
    self.pageSize = response.data.data.pageSize;
    self.total = response.data.data.total;
  })
  .catch(function (error) {
    window.console.log(error);
  });
  },

  methods: {
    // 跑马灯 分类功能实现
    changeExpertForCarousel:function(sort){
      var self = this;
    // 获取农科e站的对应分类的专家
      self.$axios.post('/nkezApi/professor/professor_search', {
      "professorCategory":sort,
      "queryPage":{
        "queryPage":1,
        "pageSize":6
      }
    })
    .then(function (response) {
      self.expertForCarousel = response.data.data;
      window.console.log(self.expertForCarousel)
    })
    .catch(function (error) {
      window.console.log(error);
    });
    },

    // 专家分页
    changePage:function(val){
      var self = this;
      self.pageNum = val;
      self.$axios.post('/nkezApi/professor/professor_list', {
      "pageNum":self.pageNum,
      "pageSize":6
    })
    .then(function (response) {
      self.allExpert = response.data.data.list;
      self.pageNum = response.data.data.pageNum;
      self.pageSize = response.data.data.pageSize;
      self.total = response.data.data.total;
    })
    .catch(function (error) {
      window.console.log(error);
    });
    }
  }
}
</script>
<style>
  .professorZlTop{
    position: relative; line-height: 20px; max-height: 40px;overflow: hidden;height: 44px;
  }
  .professorZlTop::after{
    content: "..."; position: absolute; bottom: 0; right: 0; padding-left: 40px;
    background: -webkit-linear-gradient(left, transparent, #fff 55%);
    background: -o-linear-gradient(right, transparent, #fff 55%);
    background: -moz-linear-gradient(right, transparent, #fff 55%);
    background: linear-gradient(to right, transparent, #fff 55%);
  }
  .professorZlAllContent::-webkit-scrollbar{
    display: none;
  }
</style>