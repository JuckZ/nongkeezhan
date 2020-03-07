<!-- 联系我们 -->
<template>
  <div id="contantUsMain">
    <el-carousel :interval="2000" height="600px" arrow="never">
      <el-carousel-item v-for="item in items1" :key="item.id">
        <img style="width:100%;position:absolute;left:0px" :src="require('@/assets/contantus/'+item.img)" alt="">
        <h3>
          {{item.text}}
        </h3>
      </el-carousel-item>
    </el-carousel>
    <div style="margin:0 auto;width:60%;" class="my-5 titleAndText">
      <h3>联系我们</h3>
      <p>
        xxx大学牛农科e站技转平台是成都现代农业产研院旗下xxx大学牛云平台运营中心的重点项目，依托xxx大学大、产研院技术、人才、公信力，结合互联网+涉农高新技术转化，打造农业技转线上平台。平台        将xxx大学大技术、专利，产研院技术、专利，乃至全世界涉农技术、专利作为来源，通过技转线上平台的搭建，对相关技术、专利进行收集、判断、整理、分类、上线，再与对农业高新技术有需求的企业、科研院等相关单位进行对接，实现技术转移。
      </p>
    </div>

    <el-row id="contantUsIcons" style="height:270px;overflow:hidden">
      <el-col :span="6" v-for="(item, index) in items2" :key="item.id" :offset="index > 0 ? 0 : 3">
        <transition enter-active-class="animated fadeInUp" leave-active-class="animated fadeOut">
          <el-card v-show="show[0]" :key="item.id" style="background:none;" class="item3 m-3" shadow="never" :body-style="{ padding: '0px'}">
            <img height="100px" :src="require('../assets/contantus/'+item.img)" class="image">
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
    <!-- 地图 -->
    <el-row style="height:320px;over-flow:hidden">
      <el-col>
        <transition enter-active-class="animated fadeInLeft" leave-active-class="animated fadeOut">
          <iframe v-show="show[1]" :key="0" id="mapframe310" class="J_mapframe" name="mapframe" scrolling="no" src="http://www.nongkeezhan.com/mapPanel.jsp?id=310&w=1190&ran=0.6210625434865016" width="1200" height="300" frameborder="0"></iframe>
        </transition>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      items1:[
        {id:1,img:'contantus.jpg',text:'this is 1th!'},
      ],
      items2:[
        {id:1,img:'icon1-contantus.jpg',title:'xxx大学',content:'<p>手机： 130000000<br>座机：028-85820296</p>'},
        {id:2,img:'icon2-contantus.png',title:'农科e站',content:'<p>联系地址：成都市温江区科锦路355号14栋附203、204、205号</p>'},
        {id:3,img:'icon3-contantus.jpg',title:'成都都市现代农业产业技术研究院有限公司',content:'<p>邮箱：contact@fkadjkhsf.co</p>'},
      ],
      scrollTop: 0
    };
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
      return [y>158,y>430,y>370,y>500,y>800,y>1350,y>1740]
    }
  }
}

</script>
<style>
/* 不显示轮播的指示器 */
.el-carousel__indicators{
  display: none;
}
/* 将图标下的文字居中 */
#contantUsIcons p{
  width: 60%;
  margin: 0 auto;
  text-align: center
}
</style>
