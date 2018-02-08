"use strict";
$(function(){
    $(".nav").on("click", "li", function(){
        var sId = $(this).data("id");  //获取data-id的值
        window.location.hash = sId;  //设置锚点
        loadInner(sId);
    });
    function loadInner(sId){
        var sId = window.location.hash;
        var pathn, i;
        switch(sId){
            case "#index": pathn = "_index.jsp"; i = 0; break;
            case "#java": pathn = "_java.jsp"; i = 1; break;
            case "#python": pathn = "_python.jsp"; i = 2; break;
            case "#http": pathn = "_http.jsp"; i = 3; break;
            default: pathn = "_index.jsp"; i = 0; break;
        }
        $("#content").load(pathn); //加载相对应的内容
        $(".userMenu li").eq(i).addClass("current").siblings().removeClass("current"); //当前列表高亮
    }
    var sId = window.location.hash;
    loadInner(sId);
});