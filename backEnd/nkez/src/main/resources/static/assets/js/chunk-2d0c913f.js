(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0c913f"],{5839:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("el-row",t._l(t.allExpert,function(e,r){return a("el-col",{key:r,attrs:{span:8}},[a("el-card",{staticStyle:{margin:"20px",height:"360px"}},[a("img",{staticClass:"image",staticStyle:{"max-width":"300px","max-height":"200px"},attrs:{src:e.professorPicture}}),a("div",{staticStyle:{padding:"0px"}},[a("h4",[t._v(t._s(e.professorName))]),a("div",[a("p",{staticClass:"professorZlTop"},[t._v(t._s(e.professorZl))]),a("el-popover",{attrs:{placement:"right",trigger:"click"}},[a("div",{staticClass:"professorZlAllContent",staticStyle:{"max-width":"420px","max-height":"420px","overflow-x":"hidden","overflow-y":"scroll"}},[a("h4",{staticStyle:{"text-align":"center"}},[t._v(t._s(e.professorName))]),a("img",{staticStyle:{"max-width":"400px"},attrs:{src:e.professorPicture,alt:""}}),a("p",{staticStyle:{"max-width":"400px","line-height":"1.5em","white-space":"-o-pre-wrap","word-wrap":"break-word"}},[t._v(t._s(e.professorZl))])]),a("el-button",{attrs:{slot:"reference"},slot:"reference"},[t._v("深度资料")])],1)],1)])])],1)}),1),a("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:t.total,"page-size":t.pageSize,"current-page":t.pageNum},on:{"current-change":t.changePage}})],1)},s=[],o={data:function(){return{allExpert:[],pageNum:1,pageSize:6,total:6}},components:{},computed:{},mounted:function(){this.changePage(1)},methods:{changePage:function(t){var e=this;e.pageNum=t,e.$axios.post("/nkezApi/professor/professor_list",{pageNum:e.pageNum,pageSize:6}).then(function(t){e.allExpert=t.data.data.list,e.pageNum=t.data.data.pageNum,e.pageSize=t.data.data.pageSize,e.total=t.data.data.total}).catch(function(t){window.console.log(t)})}}},i=o,p=a("2877"),l=Object(p["a"])(i,r,s,!1,null,"4be9b3ca",null);e["default"]=l.exports}}]);