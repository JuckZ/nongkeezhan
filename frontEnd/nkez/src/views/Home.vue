<template>
  <div class="home">
    <!-- <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <button class="btn btn-primary">测试bs</button> -->
    <el-carousel :interval="1000" height="600px" arrow="hover">
      <el-carousel-item  v-for="(item,index) in items1" :key="index">
        <img style="width:100%;position:absolute;left:0px" :src="require('../assets/home/'+item.img)" alt="">
      </el-carousel-item>
    </el-carousel>
    <div id="homeMain">
      <div id="searchHome" class="search">
        <el-input placeholder="请输入内容" v-model="input" class="input-with-select">
          <el-select v-model="select" slot="prepend" placeholder="请选择">
            <el-option label="全站" value="1"></el-option>
            <el-option label="产品" value="2"></el-option>
            <el-option label="文章" value="3"></el-option>
            <el-option label="图册" value="4"></el-option>
          </el-select>
          <el-button slot="append" icon="el-icon-search"></el-button>
        </el-input>
      </div>
      <div class="pt-5" style="height:150px">
        <!-- 多组件动画 -->
        <transition-group enter-active-class="animated flip" leave-active-class="animated rotateOut">
          <div style="margin:0 auto;width:30%;" class="titleAndText" v-show="show[0]" :key="0">
            <h3>农科e站</h3>
            <p>涉农高新技术转化转移平台</p>
          </div>
        </transition-group>
        <!-- 单组件 -->
        <!-- <transition enter-active-class="animated flip" leave-active-class="animated rotateOut">
          <p style="margin:0 auto;width:30%;" v-show='show[1]' :key="1">涉农高新技术转化转移平台</p>
        </transition> -->
      </div>
      <hr class="myDivider"/>
      <!-- 面向对象的类型 -->
      <el-row style="height:350px;padding-left:16.7%">
        <el-col :span="6" v-for="item in items2" :key="item.id">
          <el-card shadow="never" :body-style="{ padding: '0px'}">
            <transition enter-active-class="animated rotateInDownLeft" leave-active-class="animated rotateOut">
              <img v-show="show[1]" height="200px" :key="item.id" :src="require('../assets/home/'+item.img)" class="image">
            </transition>
            <transition enter-active-class="animated bounceInLeft" leave-active-class="animated lightSpeedOut">
              <div v-show="show[2]" :key="item.id" style="padding: 14px;">
                <h3>
                  {{item.title}}
                </h3>
                <div v-html="item.content" class="bottom clearfix">
                  <!-- {{item.content}} -->
                </div>
              </div>
            </transition>
          </el-card>
        </el-col>
      </el-row>
      <hr class="myDivider"/>
      <el-row style="overflow:hidden" id="indexMedia">
        <el-col style="height:260px" class="mt-5" :span="16" :offset="4">
          <transition enter-active-class="animated fadeInRight" leave-active-class="animated fadeOut">
            <div v-show="show[3]" :key="0" class="media">
              <div class="m-5 media-body align-self-center">
                <h4>农科e站</h4>
                <p>xxx大学牛农科e站技转平台是产研院旗下xxx大学牛云平台运营中心的重点项目，依托xxx大学大、产研院技术、人才、公信力，结合互联网+涉农高新技术转化，打造农业技转线上平台</p>
              </div>
              <img src="../assets/home/m1.jpg">
            </div>
          </transition>
        </el-col>
        <el-col style="height:320px" :span="16" :offset="4">
          <transition enter-active-class="animated fadeInLeft" leave-active-class="animated fadeOut">
            <div v-show="show[4]" :key="0"  class="media">
              <img src="../assets/home/m2.png">
              <div class="m-5 media-body align-self-center">
                <h4>数字农业</h4>
                <p>农科e站用现代信息技术对农业对象、环境和全过程进行可视化表达、数字化设计、信息化管理的现代农业。数字农业使信息技术与农业各个环节实现有效融合，对改造传统农业、转变农业生产方式具有重要意义。</p>
              </div>
            </div>
          </transition>
        </el-col>
      </el-row>
      <el-row class="my-4" id="ad">
        <div>
          <p>
            我们有来自动物科学，动物医学、药学、水禽、玉米研究、水稻研究、小麦研究、动物营养研究、生态环境研究、生态林业研究、生态农业研究、动物遗传育种、预防兽医、生态林业、果蔬研究、动植物检疫、临床医学等的300余名院士、教授、副教授、讲师，我们有来自农林牧渔等各个方面的各种技术。
          </p>
        </div>
      </el-row>
      <el-row class="my-5" id="indexMedia2">
        <el-col style="overflow:hidden" :span="8" :offset="4">
          <transition enter-active-class="animated fadeInLeft" leave-active-class="animated fadeOut">
            <div v-show="show[5]" :key="0"  class="media m-2">
              <img src="../assets/home/ep1.jpg">
              <div class="ml-2 media-body align-self-center">
                <h4>郑xxx教授</h4>
                <p>研究课题：小麦基因资源发掘、分子标记、基因工程
                <br>技术成果：分子聚合培育优质多抗专用型西南小麦新品种</p>
              </div>
            </div>
          </transition>
        </el-col>
        <el-col style="overflow:hidden" :span="8">
          <transition enter-active-class="animated fadeInRight" leave-active-class="animated fadeOut">
            <div v-show="show[5]" :key="0"  class="media m-2">
              <img src="../assets/home/ep2.jpg">
              <div class="ml-2 media-body align-self-center">
                <h4>周xxx教授</h4>
                <p>
                  研究课题：动物营养研究所水生营养
                  <br>技术成果：建鲤健康养殖的系统营养技术
                </p>
              </div>
            </div>
          </transition>
        </el-col>
      </el-row>
      <div class="my-5 titleAndText">
        <h3>关于我们</h3>
        <p>农科e站是一个连接牛人牛技术的一个平台，想了解更多吗？</p>
      </div>

      <el-row style="height:417px;overflow:hidden">
        <el-col :span="6" v-for="(item, index) in items3" :key="item.id" :offset="index > 0 ? 0 : 4">
          <transition enter-active-class="animated fadeInUp" leave-active-class="animated fadeOut">
            <el-card v-show="show[6]" :key="item.id" style="background:none" class="item3 m-3" shadow="never" :body-style="{ padding: '0px'}">
              <img height="160px" :src="require('../assets/home/'+item.img)" class="image">
              <div style="padding: 14px;">
                <h3>
                  {{item.title}}
                </h3>
                <div v-html="item.content" class="bottom clearfix">
                  <!-- {{item.content}} -->
                </div>
              </div>
            </el-card>
          </transition>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'home',
  data() {
    return {
      items1: [
        {id:1,img:'1.jpg',text:'this is 1th!'},
        {id:2,img:'2.jpg',text:'this is 2th!'},
        {id:3,img:'3.jpg',text:'this is 3th!'},
        {id:4,img:'4.jpg',text:'this is 4th!'},
      ],
      input:'',
      select: 3,
      items2:[
        {id:1,img:'a.png',title:'面向高校、科研院所',content:'科研成果翻译<br>网络授课教学<br>托管服务、项目包装'},
        {id:2,img:'b.png',title:'面向企业、政府机构',content:'技术咨询服务、人才招聘<br>政策咨询、主题活动<br>技术支持、技术转接服务'},
        {id:3,img:'c.png',title:'VIP会员服务',content:'科研成果翻译<br>网络授课教学<br>托管服务、项目包装'},
      ],
      scrollTop:0,
      items3:[
        {id:1,img:'icon1.jpg',title:'xxx大学',content:'<p>是世界一流学科建设高校、“211工程”重点建设高校。入选111计划、千人计划、卓越农林人才教育培养计划、援疆学科建设计划、国家建设高水平大学公派研究生项目、四川2011计划、四川省卓越工程师教育培养计划。</p>'},
        {id:2,img:'icon2.jpg',title:'农科e站',content:'<p>xxx大学牛农科e站技转平台是产研院旗下xxx大学牛云平台运营中心的重点项目，依托xxx大学大、产研院技术、人才、公信力，结合互联网+涉农高新技术转化，打造农业技转线上平台。</p>'},
        {id:3,img:'icon3.jpg',title:'成都都市现代农业产业技术研究院有限公司',content:'<p>成都市科技局委托的成都市现代农业发展投资有限公司、四xxx大学业大学委托的四xxx大学大资产管理有限公司、成都市农林科学院、四川特驱投资集团有限公司于2017年11月联合成立成都都市现代农业产业技术研究院有限公司，总部位于成都市温江区。</p>'},
      ],
      }
  },
  mounted() {
    this.showF()
  },
  methods: {
    showF(){
      var self = this
      function getScrollTop(){
          var scrollTop=0;
          if(document.documentElement&&document.documentElement.scrollTop){
            scrollTop=document.documentElement.scrollTop;
          }
          else if(document.body){
            scrollTop=document.body.scrollTop;
          }
          return scrollTop;
      }
      // 下面的间隔时间越长元素载入越迟钝，性能较好，用户体验较差
      setInterval(function(){
        self.scrollTop = getScrollTop()
        // console.info("滚动条的高度："+self.scrollTop)
      },100)
    }
  },
  computed: {
    show:function(){
      let y=this.scrollTop;
      return [y>0,y>88,y>370,y>500,y>800,y>1350,y>1740]
    }
  },
  components: {
    // HelloWorld
  }
}
</script>
<style>
#searchHome{
  position: absolute;
  top: 350px;
  width: 100%;
}
.search .input-with-select{
  text-align: center;
  width: 80%;
  z-index: 99
}
#homeMain{
  background-image: url(../assets/home/bg.jpg);
  background-size: cover;
  background-repeat: repeat;
}
.myDivider{
  width: 60%;
  border:none;
  border-top:3px solid #2097f3;
}
.titleAndText{
  margin-top: 40px;
  margin-bottom: 25px;
  color: #666666;
}
.el-card{
  border: none!important
}
#indexMedia .media img{
  width:40%;
  min-width:300px
}
#indexMedia2 .media img{
  width:15%;
  min-height: 200px;
  min-width:300px
}
#indexMedia2 .media p{
  color: #333333;
  font-family: Helvetica, "Lucida Grande", Arial, "Microsoft YaHei", FreeSans, Arimo, "Droid Sans", "wenquanyi micro hei", "Hiragino Sans GB", "Hiragino Sans GB W3", Arial, sans-serif;
  font-size: 18px;
  white-space: normal;
  word-wrap: break-word;
  word-break: normal;
  text-align: left;
}
#ad div{   
  background-image: url(../assets/home/adbg.jpg);
  color: white;
  font-size: 20px;
  font-family: 华文楷体, STKaiti;
  text-align: justify;
}
#ad div p{
  padding: 20px;
  width: 56%;
  margin: 0 auto
}
.item3 h3{
    word-wrap: break-word;
    word-break: break-all;
    font-size: 18px;
    font-family: "微软雅黑", "Microsoft YaHei";
    font-weight: 600
}
.item3 p{
  font-family: 微软雅黑, "Microsoft YaHei";
  font-size: 12px;
  line-height: 26px;
  text-align: left;
}
/* 通过透明度的改变实现元素的显示和隐藏 */
.isShow{
  opacity: 0;
}
</style>