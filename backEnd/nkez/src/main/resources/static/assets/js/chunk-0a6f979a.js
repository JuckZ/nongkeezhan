(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-0a6f979a"],{3147:function(t,e,a){},"657d":function(t,e,a){"use strict";var l=a("3147"),s=a.n(l);s.a},a2f9:function(t,e,a){"use strict";a.r(e);var l=function(){var t=this,e=t.$createElement,l=t._self._c||e;return l("div",[l("el-row",{staticClass:"mt-4 mr-4 ml-4"},[l("el-col",{attrs:{span:12}},[l("div",{staticClass:"grid-content bg-purple"},[l("el-table",{staticStyle:{width:"100%"},attrs:{data:t.lastNews}},[l("el-table-column",{attrs:{label:"时间"},scopedSlots:t._u([{key:"default",fn:function(e){return[l("i",{staticClass:"el-icon-time"}),l("span",{staticStyle:{"margin-left":"10px"}},[t._v(t._s(e.row.newsSource))])]}}])}),l("el-table-column",{attrs:{label:"标题"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n              "+t._s(e.row.newsTitle)+"\n            ")]}}])})],1)],1)]),l("el-col",{attrs:{span:12}},[l("div",{staticClass:"grid-content bg-purple"},[l("el-carousel",{attrs:{interval:2e3,arrow:"hover"}},t._l(t.items1,function(t,e){return l("el-carousel-item",{key:e},[l("img",{staticStyle:{width:"100%",position:"absolute",left:"0px"},attrs:{src:a("bf13")("./"+t.img),alt:""}})])}),1)],1)]),l("el-col",{attrs:{span:6}},[l("div",{staticClass:"grid-content bg-purple"},[l("div")])])],1),l("h3",{staticStyle:{color:"#fff","background-color":"#4cb4e7",height:"42px","line-height":"42px","font-size":"20px",margin:"20px 0"}},[t._v("\n    全部新闻\n  ")]),l("el-row",[l("el-col",{attrs:{span:18}},t._l(t.allNews,function(e,a){return l("el-col",{key:a,attrs:{span:8}},[l("el-card",{staticStyle:{margin:"20px",height:"420px"}},[l("img",{staticClass:"image",staticStyle:{"max-width":"300px"},attrs:{src:e.newsPicture}}),l("div",{staticStyle:{padding:"0px"}},[l("h4",[t._v(t._s(e.newsTitle))]),l("div",[l("p",{staticClass:"newsTop"},[t._v(t._s(e.newsBody))]),l("el-popover",{attrs:{placement:"right",trigger:"click"}},[l("div",{staticClass:"newsAllContent",staticStyle:{"max-width":"420px","max-height":"420px","overflow-x":"hidden","overflow-y":"scroll"}},[l("h4",{staticStyle:{"text-align":"center"}},[t._v(t._s(e.newsTitle))]),l("img",{staticStyle:{"max-width":"400px"},attrs:{src:e.newsPicture,alt:""}}),l("p",{staticStyle:{"max-width":"400px","line-height":"1.5em","white-space":"-o-pre-wrap","word-wrap":"break-word"}},[t._v(t._s(e.newsBody))])]),l("el-button",{attrs:{slot:"reference"},slot:"reference"},[t._v("阅读全文")])],1)],1)])])],1)}),1),l("el-col",{staticStyle:{"padding-right":"30px"},attrs:{span:6}},[l("h3",{staticStyle:{color:"#fff","background-color":"#ffc09f",height:"42px","line-height":"42px","font-size":"20px",margin:"20px 0"}},[t._v("\n        头条新闻\n      ")]),l("ul",{staticClass:"list-group list-group-flush"},t._l(t.hotNews,function(e,a){return l("li",{key:a,staticClass:"list-group-item"},[l("a",{staticStyle:{color:"black"},attrs:{target:"_blank",href:e.url}},[t._v(t._s(e.title))])])}),0)])],1),l("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:t.total,"page-size":t.pageSize,"current-page":t.pageNum},on:{"current-change":t.changePage}})],1)},s=[],i=(a("cadf"),a("551c"),a("f751"),a("097d"),{data:function(){return{items1:[{id:1,img:"1.jpg",text:"this is 1th!"},{id:2,img:"2.jpg",text:"this is 2th!"},{id:3,img:"3.jpg",text:"this is 3th!"},{id:4,img:"4.jpg",text:"this is 4th!"}],allNews:[],lastNews:[],hotNews:[{title:"恭喜！冯绍峰宣布赵丽颖产下男婴 母子平安",url:"http://ent.163.com/19/0308/17/E9P0075S00038FO9.html"},{title:"王晨：外商投资法“坚持内外资一致”原则",url:"http://news.163.com/19/0308/16/E9ORVVJK0001899N.html"},{title:"桔子水晶酒店公众号推送被指侮辱女性惹众怒",url:"http://news.163.com/19/0308/15/E9OMVI270001899N.html"},{title:"栗战书：2019年全国人大将落实制定房地产税法",url:"http://news.163.com/19/0308/15/E9ON8HNA0001899N.html"},{title:"国家税务总局局长王军:今年稳步推进房地产税立法",url:"http://news.163.com/19/0308/17/E9OT0OOA0001899O.html"},{title:"栗战书:针对长春长生暴露问题 加快疫苗管理立法",url:"http://news.163.com/19/0308/15/E9OO8DST0001899N.html"},{title:"文旅部部长:用2年时间基本解决旅游厕所少问题",url:"http://news.163.com/19/0308/17/E9OU4VNL0001899N.html"},{title:"栗战书:英烈法抵制历史虚无主义 打击亵渎英烈行为",url:"http://news.163.com/19/0308/15/E9OOMQJE0001899N.html"},{title:"王毅被问\"今年拿掉台湾几个'邦交国'\" 回应:哈哈哈",url:"http://news.163.com/19/0308/14/E9OKT8NF0001899N.html"}],pageNum:1,pageSize:6,total:6}},mounted:function(){var t=this;t.$axios.post("/nkezApi/news/news_list",{pageNum:1,pageSize:6}).then(function(e){t.allNews=e.data.data.list,t.lastNews=e.data.data.list.slice(0,4),t.pageNum=e.data.data.pageNum,t.pageSize=e.data.data.pageSize,t.total=e.data.data.total}).catch(function(t){window.console.log(t)})},methods:{changePage:function(t){var e=this;e.pageNum=t,e.$axios.post("http://10.4.19.31:8080/nkez/news/news_list",{pageNum:e.pageNum,pageSize:6}).then(function(t){e.allNews=t.data.data.list}).catch(function(t){window.console.log(t)})}}}),n=i,o=(a("657d"),a("2877")),r=Object(o["a"])(n,l,s,!1,null,null,null);e["default"]=r.exports}}]);