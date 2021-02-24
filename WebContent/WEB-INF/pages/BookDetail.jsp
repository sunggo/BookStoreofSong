<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入函数标签库 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1 user-scalable=no">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    	<style>
    		.left {
    			margin-left:150px;
    		}
    		.top{
    			margin-top:50px;
    		}
    		.damu-carousel {
    			margin-top: 50px;
    			height:600px;
    			overflow: hidden;
    		}
    		.damu-img img {
    			width:auto;
    			
    			
    		}
    		.damu-row {
    			margin-top: 50px;
    		}
    		.jumbotron {
    			text-align: center;
    			background: white;
    		}
    		.jumbotron p{
    			font-size: 16px;
    		}
    		.color {
    			width: 100%;
    			background:#EAEAEA;
    			height: 234px;
    		}
    	</style>

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	<nav class="navbar navbar-inverse navbar-fixed-top">
	  <div class="container">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="welcome">颂の书城</a>
	    </div>
	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="#">简述<span class="sr-only">(current)</span></a></li>
	        <li><a href="MyCart.do">我的购物车</a></li>
	        <li><a href="MyOrder.do">我的订单</a></li>
	        <li><a href="userInfo.do">我的地址</a></li>
	        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">图书管理 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="addBook.do">新增图书</a></li>
            <li><a href="bookCatelog.do">图书仓库</a></li>
            
          </ul>
          
        </li>
	       <li><a href="loginDo">登录</a></li>
	      </ul>
	      
	      
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
    
    
    
   
    <div class="container damu-row">
    	<div class="row">
			<div class="col-md-1 "></div>
			<div class="col-md-4 ">
				<img alt="..." src="/img/${OneBook.photo}">
			</div>
			<div class="col-md-6 ">
			<input type="hidden" id="photo" name="photo" value="${OneBook.photo}">
			<input type="hidden" id="id" name="id" value="${OneBook.id}">
			<input type="hidden" id="title" name="title" value="${OneBook.title}">
			<input type="hidden" value="0" id="cart_id"/>
				<div><h2>${OneBook.title}</h2></div>
				<div><font color="#337ab7">${OneBook.describ}</font></div>
				<div><h2><font color="red">￥：${OneBook.price}</font></h2></div>
				<input type="hidden" value="${OneBook.num}" id="max"/>
				<!--购物车  -->
				<div><input id="num" type="text" readonly="readonly" style="width:50px;height:50px;border:none;" value="1">
			
				<button id="add" class="glyphicon glyphicon-plus" style="width:32px;height:25px;"></button>
				<button id="sub" class="glyphicon glyphicon-minus" style="width:32px;height:25px;"></button>
				
				</div>
				
				
				<div>
				<button id="pay" class="right glyphicon glyphicon-jpy btn btn-success">立即购买</button>
				<button id="cart" class="right glyphicon glyphicon-shopping-cart btn btn-danger">加入购物车</button>
				</div>
			</div>
			<div class="col-md-1 "></div>

		</div>
    
    </div>
   
	<div class="row">
			<div class="color"></div>
	</div>

    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    var bool=<%=session.getAttribute("roleId")%>
   	
    if(bool==2){
    	$(".dropdown-toggle").html("");
    	$(".dropdown-menu").html("");
    }
    	$("#add").click(function(){
    		var max=$("#max").val();
    		var old=$("#num").val();
    		
    		if(old/1+1 > max/1){
    			return ;
    		}
    		$("#num").val(old/1+1);
    	})
	$("#sub").click(function(){
		
    		var old=$("#num").val();
    		if(old==1){
    			
    			return ;
    		}
    		$("#num").val(old/1-1);
    	})
	$("#cart").click(function(){
		var number=$("#num").val();
		var id=$("#id").val();
		var title=$("#title").val();
		var photo=$("#photo").val();
		$.post("addCart.do",{"item_num":number,"item_id":id,"item_name":title,"cart_photo":photo},function(data){
			alert(data);
		},"json");
		alert("加入成功");
		$("#num").val(0);
	})
		
	
	$("#pay").click(function(){
		var number=$("#num").val();
		var id=$("#id").val();
		var cart_id=$("#cart_id").val();
		$.ajax({
			url:"user/pay.do",
			type:"POST",
			data:{"number":number,"id":id,"cart_id":cart_id},
		//	contentType:application/json,
			success:function(data){
				alert(data);
			}
			
		})
		
		
	})
	
	
    </script>
  </body>
</html>