<!-- 新闻资讯 -->
<template>
  <div>
    <el-row class="mt-4 mr-4 ml-4">
      <el-col :span="12">
        <div class="grid-content bg-purple">
          <el-table
            :data="lastNews"
            style="width: 100%">
            <el-table-column
              label="时间">
              <template slot-scope="scope">
                <i class="el-icon-time"></i>
                <span style="margin-left: 10px">{{ scope.row.newsSource }}</span>
              </template>
            </el-table-column>
            <el-table-column
            label="标题">
              <template slot-scope="scope">
                {{scope.row.newsTitle}}
              </template>
            </el-table-column>
          </el-table>
        </div>
      </el-col>

      <el-col :span="12">
        <div class="grid-content bg-purple">
          <el-carousel :interval="2000"  arrow="hover">
            <el-carousel-item  v-for="(item, index) in items1" :key="index">
              <img style="width:100%;position:absolute;left:0px" :src="require('../assets/home/'+item.img)" alt="">
            </el-carousel-item>
          </el-carousel>
        </div>
      </el-col>
      <el-col :span="6">
        <div class="grid-content bg-purple">
          <div></div>
        </div>
      </el-col>
    </el-row>
    <h3 style="color: #fff;
      background-color: #4cb4e7;
      height: 42px;
      line-height: 42px;
      font-size:20px;
      margin:20px 0"
      >
      全部新闻
    </h3>
    <el-row>
      <el-col :span="18">
        <el-col :span="8" v-for="(item, index) in allNews" :key="index">
          <el-card style="margin: 20px;height:420px">
            <img style="max-width:300px" :src="item.newsPicture" class="image">
            <div style="padding: 0px;">
              <h4>{{item.newsTitle}}</h4>
              <div>
                <p class="newsTop">{{item.newsBody}}</p>
                <el-popover
                  placement="right"
                  trigger="click">
                    <div class="newsAllContent" style="max-width:420px;max-height:420px;overflow-x:hidden;overflow-y:scroll">
                      <h4 style="text-align:center">{{item.newsTitle}}</h4>
                      <img style="max-width:400px" :src="item.newsPicture" alt="">
                      <p style="
                      max-width:400px;
                      line-height:1.5em;
                      white-space: pre-wrap;       
                      white-space: -moz-pre-wrap;  
                      white-space: -pre-wrap;      
                      white-space: -o-pre-wrap;    
                      word-wrap: break-word;   
                      ">{{item.newsBody}}</p>
                    </div>
                  <el-button slot="reference">阅读全文</el-button>
                </el-popover>
              </div>
            </div>
          </el-card>
        </el-col>
      </el-col>

      <el-col style="padding-right:30px" :span="6">
        <h3 style="color: #fff;
          background-color: #ffc09f;
          height: 42px;
          line-height: 42px;
          font-size:20px;
          margin:20px 0"
          >
          头条新闻
        </h3>
        <ul class="list-group list-group-flush">
          <li class="list-group-item" v-for="(item, index) in hotNews" :key="index"><a style="color:black;" target="_blank" :href="item.url">{{item.title}}</a></li>
        </ul>
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
      items1: [
        {id:1,img:'1.jpg',text:'this is 1th!'},
        {id:2,img:'2.jpg',text:'this is 2th!'},
        {id:3,img:'3.jpg',text:'this is 3th!'},
        {id:4,img:'4.jpg',text:'this is 4th!'},
      ],
      allNews: [],
      lastNews: [],
      hotNews:[
        {"title":"恭喜！冯绍峰宣布赵丽颖产下男婴 母子平安","url":	"http://ent.163.com/19/0308/17/E9P0075S00038FO9.html"},
        {"title":"王晨：外商投资法“坚持内外资一致”原则","url":"http://news.163.com/19/0308/16/E9ORVVJK0001899N.html"},
        {"title":	"桔子水晶酒店公众号推送被指侮辱女性惹众怒","url":	"http://news.163.com/19/0308/15/E9OMVI270001899N.html"},
        {"title":	"栗战书：2019年全国人大将落实制定房地产税法","url":	"http://news.163.com/19/0308/15/E9ON8HNA0001899N.html"},
        {"title":	"国家税务总局局长王军:今年稳步推进房地产税立法","url":	"http://news.163.com/19/0308/17/E9OT0OOA0001899O.html"},
        {"title":	"栗战书:针对长春长生暴露问题 加快疫苗管理立法","url":	"http://news.163.com/19/0308/15/E9OO8DST0001899N.html"},
        {"title":	"文旅部部长:用2年时间基本解决旅游厕所少问题","url":	"http://news.163.com/19/0308/17/E9OU4VNL0001899N.html"},
        {"title":	"栗战书:英烈法抵制历史虚无主义 打击亵渎英烈行为","url":"http://news.163.com/19/0308/15/E9OOMQJE0001899N.html"},
        {"title":	"王毅被问\"今年拿掉台湾几个'邦交国'\" 回应:哈哈哈","url":	"http://news.163.com/19/0308/14/E9OKT8NF0001899N.html"}
      ],
      pageNum:1,
      pageSize:6,
      total:6,
    };
  },
  mounted() {
    var self = this;
    // 获取农科e站的新闻
    self.$axios.post('/nkezApi/news/news_list', {
    "pageNum":1,
    "pageSize":6
  })
  .then(function (response) {
    self.allNews = response.data.data.list;
    self.lastNews = response.data.data.list.slice(0,4)
    self.pageNum = response.data.data.pageNum;
    self.pageSize = response.data.data.pageSize;
    self.total = response.data.data.total;
  })
  .catch(function (error) {
    window.console.log(error);
  });

  // 获取网易新闻(0-10代表获取前0-9条，共10条)
  // 豆瓣api https://api.douban.com/v2/movie/in_theaters?city=%E5%B9%BF%E5%B7%9E&start=0&count=2
  // 网易云api  http://c.m.163.com/nc/article/headline/T1348647853363/0-10.html
  // self.$axios.get('/api/nc/article/headline/T1348647853363/0-10.html')
  // .then(function (response) {
  //   self.hotNews = response.data.T1348647853363;
  // })
  // .catch(function (error) {
  //   window.console.log(error);
  // });
  },

  methods: {
    changePage:function(val){
      var self = this;
      self.pageNum = val;
      // 获取农科e站的新闻
      self.$axios.post('http://10.4.19.31:8080/nkez/news/news_list', {
      "pageNum":self.pageNum,
      "pageSize":6
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
  .newsTop{
    position: relative; line-height: 20px; max-height: 40px;overflow: hidden;height: 44px;
  }
  .newsTop::after{
    content: "..."; position: absolute; bottom: 0; right: 0; padding-left: 40px;
    background: -webkit-linear-gradient(left, transparent, #fff 55%);
    background: -o-linear-gradient(right, transparent, #fff 55%);
    background: -moz-linear-gradient(right, transparent, #fff 55%);
    background: linear-gradient(to right, transparent, #fff 55%);
  }
  .newsAllContent::-webkit-scrollbar{
    display: none;
  }
</style>