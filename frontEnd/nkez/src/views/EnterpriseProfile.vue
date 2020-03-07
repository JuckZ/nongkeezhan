<!--  -->
<template>
  <div id="EnterpriseProfileMain">
     <div style="margin:0 auto;width:60%;" class="my-5 titleAndText">
      <h3>农科e站</h3>
      <!-- 左对齐 -->
      <div class="media">
        <div class="media-left">
          <img :src="require('../assets/enterpriseprofile/nkez.jpg')" class="media-object" style="width:100px">
        </div>
        <div class="media-body">
          <p style="text-align:left;text-indent:2em">xxx大学牛农科e站技转平台是成都现代农业产研院旗下xxx大学牛云平台运营中心的重点项目，依托xxx大学大、产研院技术、人才、公信力，结合互联网+涉农高新技术转化，打造农业技转线上平台。</p>
          <p style="text-align:left;text-indent:2em">平台将xxx大学大技术、专利，产研院技术、专利，乃至全世界涉农技术、专利作为来源，通过技转线上平台的搭建，对相关技术、专利进行收集、判断、整理、分类、上线，再与对农业高新技术有需求的企业、科研院等相关单位进行对接，实现技术转移。</p>
        </div>
      </div>
    </div>

    <!-- 农科e站概况 -->
    <div id="nkezIntro">
      <h3>农科e站概况</h3>
      <ul>
        <li>
          <h5>e站特色</h5>
          <p>专注于涉农技术前沿科技转化 
            <br/>全国重点高校的最新科研成果资源 
            <br/>致力于提高企业与技术的对接成功率</p>
        </li>
        <li>
          <h5>涉及领域</h5>
          <p>一站式技术创新服务平台
            <br/>前沿农业技术转移机制
            <br/>互联网+涉农高新技术对接
            <br/>广阔技术成果转化市场</p>
        </li>
        <li>
          <h5>现有资源</h5>
          <p>融合xxx大学大110年来高新科技创新项目 资金、政策、技术、人才集群的强大后盾 
            <br/>服务与信息的个性化技转通道</p>
        </li>
        <li>
          <h5>前景展望</h5>
          <p>进一步把控技术质量 
            <br/>多渠道寻找尖端企业联合融资 
            <br/>打通技术、资金、宣传一站式服务</p>
        </li>
      </ul>
      <p>农科e站运行模式图</p>
      <img :src="require('../assets/enterpriseprofile/lct.png')" alt="农科e站运行模式">
    </div>
    <!-- 图片区域 -->
    <div class="iconsContainer" style="background:#f8f8f8;padding:60px;">
      <el-row>
        <el-col>
        <h4>了解我们</h4>
        <p>西南地区农业技术转移平台的领导者
          <br/>高新农业技术推动中国农业发展
          <br/>科技、健康、融合、共享</p>
        </el-col>
      </el-row>
      <el-row id="EnterpriseProfileIcons" style="height:270px;overflow:hidden">
        <el-col :span="6" v-for="(item, index) in allIcons" :key="item.id" :offset="index > 0 ? 0 : 3">
          <transition enter-active-class="animated fadeInUp" leave-active-class="animated fadeOut">
            <el-card v-show="show[0]" :key="item.id" class="item3 m-3" :body-style="{ padding: '0px'}">
              <img height="100px" :src="require('../assets/enterpriseprofile/'+item.img)" class="image">
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
export default {
  data () {
    return {
      allIcons:[
        {id:1,img:'ezdw.png',title:'e站定位',content:'<p>中国农业技术转化服务平台，为农业企业及政府提供涉农技术支持，为学校、研究所提供服务对象，促进成果转化，降低技术推广难度。</p>'},
        {id:2,img:'mxqt.png',title:'面向群体',content:'<p>面向企业、政府：技术、政策咨询服务，人才招聘面向高校、科研机构：科技成果翻译、网络授课教学、托管服务、项目包装。</p>'},
        {id:3,img:'ezys.png',title:'e站优势',content:'<p>产学研合作、专注于农业、技术较新、技术转化服务较好、与高校科技成果结合、商业模式新颖。</p>'},
      ],
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
      return [true,true,true,true,y>=0]
    }
  }
}

</script>
<style>
  #nkezIntro h5{
    display: inline-block;
  }
  #nkezIntro li{
    list-style: none;
  }
  #nkezIntro li h5{
    text-indent: .5em;
  }
  #nkezIntro li::before{
    vertical-align: middle;
    width: 0px;
    height: 0px;
    content: "";
    font-size: 0px;
    border: 10px solid red;
    border-radius: 50%;
  }
  #nkezIntro li:nth-child(1)::before{
    border-color: #ffcd48
  }
  #nkezIntro li:nth-child(2)::before{
    border-color: #e9a685
  }
  #nkezIntro li:nth-child(3)::before{
    border-color: #afda3b
  }
  #nkezIntro li:nth-child(4)::before{
    border-color: #3bda82
  }
</style>