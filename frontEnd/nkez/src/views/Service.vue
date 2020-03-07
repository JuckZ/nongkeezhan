<!-- 企业服务 -->
<template>
  <div>
    <div id="serviceMain">
      <el-row style="overflow:hidden" id="indexMedia">
        <el-col style="height:260px" class="mt-5" :span="16" :offset="4">
          <transition enter-active-class="animated fadeInRight" leave-active-class="animated fadeOut">
            <div v-show="show[0]" :key="0" class="media">
              <div class="m-5 media-body align-self-center">
                <h4>农科e站，专注涉农高新科技转化</h4>
                <p>牛技术、牛成果、牛专家、牛新闻、牛活动、牛案例，依托国家首期211重点工程大学，由产研院牵头，实力打造高新涉农技术与需求企业的良性转接平台，搭建技术与企业的坚实桥梁。</p>
              </div>
              <img src="../assets/service/opposite1.jpg">
            </div>
          </transition>
        </el-col>
        <el-col style="height:320px" :span="16" :offset="4">
          <transition enter-active-class="animated fadeInLeft" leave-active-class="animated fadeOut">
            <div v-show="show[1]" :key="0"  class="media">
              <img src="../assets/service/opposite2.jpg">
              <div class="m-5 media-body align-self-center">
                <h4>面向高校、科研机构</h4>
                <p>科技成果翻译：使企业深度了解相关技术的优势，精准剖析、高效促成科技成果转化。
                  <br/>网络授课教学：联系专家网上授课，供企业购买使用。
                  <br/>项目包装：为学校、科研机构科技架构提供包装服务。</p>
              </div>
            </div>
          </transition>
        </el-col>
        <el-col style="height:260px" class="mt-5" :span="16" :offset="4">
          <transition enter-active-class="animated fadeInRight" leave-active-class="animated fadeOut">
            <div v-show="show[2]" :key="0" class="media">
              <div class="m-5 media-body align-self-center">
                <h4>面向企业、政府</h4>
                <p>技术咨询服务：专家技术信息库为企业提供技术咨询服务。
                  <br/>人才招聘：帮助企业更好地招到农业高新技术人才。
                  <br/>政策咨询：为企业提供政策咨询服务。
                  <br/>主题活动：组织企业和专家联合召开研讨活动。
                  <br/>会员制：提供专家咨询、企业发布需求、帮助企业寻找解决问题的方法。</p>
              </div>
              <img src="../assets/service/opposite3.jpg">
            </div>
          </transition>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      scrollTop:0,

    };
  },

  components: {},

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
      return [y>=0,y>=0,y>=0,y>500,y>800,y>1350,y>1740]
    }
  },
}

</script>
<style>
#serviceMain{
  background-image: url(../assets/home/bg.jpg);
  background-size: cover;
  background-repeat: repeat;
}
</style>