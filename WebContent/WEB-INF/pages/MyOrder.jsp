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
	      <a class="navbar-brand" href="welcome.html">颂の书城</a>
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
    	 <div class="container">
    	
		   	<h3>我的订单</h3>
		<table class="table">
		   	
		  <th>收货人</th>
		  <th>收获地址</th>
		  <th>联系电话</th>
		  <th>物品名称</th>
		  <th>物品数量</th>
		  <th>总金额</th>
		  <th>下单时间</th>
		<c:forEach items="${list}" var="order">
			<tr>
    			<td>${order.receivename}</td>
    			<td>${order.receiveaddress}</td>
    			<td>${order.receivephone}</td>
    			<td>${order.itemname}</td>
    			<td>${order.itemnum}</td>
    			<td>￥：${order.totalprice}</td>
				<td>${order.created}</h4><br>
				<td><a href="delOrder.do?id=${order.id}">取消该订单</a></td>
				<td><a href="del.do?id=${order.id}">确认收货</a></td>
			</tr>
			
			</c:forEach>
		</table>
		
	</div>
    </div>
   
	

    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    var bool=<%=session.getAttribute("roleId")%>
   
    if(bool==2){
    	$(".dropdown-toggle").html("");
    	$(".dropdown-menu").html("");
    }
    	
         
    </script>
  </body>
</html>