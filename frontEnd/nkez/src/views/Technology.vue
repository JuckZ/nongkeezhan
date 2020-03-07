<!-- 技术全览 -->
<template>
  <div>
    <!-- 轮播图 -->
    <el-carousel :interval="1000" height="600px" arrow="hover">
      <el-carousel-item  v-for="(item,index) in items1" :key="index">
        <img style="width:100%;position:absolute;left:0px" :src="require('../assets/home/'+item.img)" alt="">
      </el-carousel-item>
    </el-carousel>
    <!-- 分割条 -->
    <h3 style="color: #fff;
      background-color: #4cb4e7;
      height: 42px;
      line-height: 42px;
      font-size:20px;
      margin:20px 0"
      >
      技术全览
    </h3>
    <!-- 搜索框 -->
    <div class="search">
      <el-input placeholder="请输入内容" v-model="input" class="input-with-select">
        <el-select v-model="select" slot="prepend" placeholder="请选择">
          <el-option label="标题" value="1"></el-option>
        </el-select>
        <el-button slot="append" icon="el-icon-search"></el-button>
      </el-input>
    </div>
    <el-row>
        <el-col :span="8" v-for="(item, index) in allTechnology" :key="index">
          <el-card style="margin: 20px">
            <img style="max-width:300px" src="http://17817894.s21i.faiusr.com/4/ABUIABAEGAAgpfG83gUo-qa14wYw8QY4lAU.png" class="image">
            <div style="padding: 0px;">
              <h4>{{item.technologyTitle}}</h4>
              <el-popover
                placement="right"
                trigger="click">
                  <div class="newsAllContent" style="max-width:420px;max-height:420px;overflow-x:hidden;overflow-y:scroll">
                    <h4 style="text-align:center">{{item.technologyTitle}}</h4>
                    <img style="max-width:400px" src="http://17817894.s21i.faiusr.com/4/ABUIABAEGAAgpfG83gUo-qa14wYw8QY4lAU.png" alt="">
                    <pre style="text-indent:2em">
                      技术介绍：
                      姓名：陈强
                      职称：教授
                      导师类型：博导
                      研究方向：微生物学
                      主要贡献：
                      1.陈强,张小平,李登煜,等.从豆科植物的根瘤中直接提取根瘤菌DNA的方法.微生物学通报,2002,29(6):65～68。
                      2.陈强,张小平,李登煜,陈文新,K.Lindstrom,Z.Terefework.用AFLP技术检测慢生型花生根瘤菌竞争结瘤的研究.生态学报,2003,23(10):2189～2194。
                    </pre>
                  </div>
                <el-button slot="reference">阅读全文</el-button>
              </el-popover>
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
      allTechnology:[],
      total:6,
      pageNum:1,
      pageSize:6,
      input:'',
      select:'标题',
      items1:[
        {id:1,img:'1.jpg',text:'this is 1th!'},
        {id:2,img:'2.jpg',text:'this is 2th!'},
        {id:3,img:'3.jpg',text:'this is 3th!'},
        {id:4,img:'4.jpg',text:'this is 4th!'},
      ]
    };
  },

  computed: {},

  mounted() {
    var self = this;
    // 获取农科e站的技术
    self.$axios.post('/nkezApi/technology/technology_list', {
    "pageNum":1,
    "pageSize":3
  })
  .then(function (response) {
    self.allTechnology = response.data.data.list;
    self.pageNum = response.data.data.pageNum;
    self.pageSize = response.data.data.pageSize;
    self.total = response.data.data.total;
  })
  .catch(function (error) {
    window.console.log(error);
  });

  },

  methods: {
    changePage:function(val){
      var self = this;
      self.pageNum = val;
      // 获取农科e站的技术
      self.$axios.post('http://10.4.19.31:8080/nkez/technology/technology_list', {
      "pageNum":self.pageNum,
      "pageSize":3
    })
    .then(function (response) {
      self.allNews = response.data.data.list;
    })
    .catch(function (error) {
      window.console.log(error);
    });
    }
  }
}

</script>
<style>

</style>