<!--  -->
<template>
  <div>
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
                <el-button slot="reference">深度资料</el-button>
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
      pageNum:1,
      pageSize:6,
      total:6
    };
  },

  components: {},

  computed: {},

  mounted(){
    this.changePage(1)
  },

  methods: {
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
<style lang='scss' scoped>
</style>