(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[3],{hu3i:function(e,t,a){"use strict";var n=a("TqRt");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=n(a("MVZn")),u=n(a("o0o1")),s=a("dCQc"),d={namespace:"feedback",state:{data:{list:[],pagination:{}}},effects:{list:u.default.mark(function e(t,a){var n,r,d,c;return u.default.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return n=t.payload,r=a.call,d=a.put,e.next=4,r(s.queryFeedback,n);case 4:return c=e.sent,e.next=7,d({type:"queryList",payload:c});case 7:case"end":return e.stop()}},e,this)})},reducers:{queryList:function(e,t){return(0,r.default)({},e,{data:t.payload.data})}}};t.default=d}}]);