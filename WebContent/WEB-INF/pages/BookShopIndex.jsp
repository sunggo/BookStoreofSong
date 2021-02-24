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
    		img {
    			width: 100%;
    			height:450px;	
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
    	
    		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" >
	  <!-- Indicators -->
	  <ol class="carousel-indicators">
	    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
	    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
	    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
	    
	  </ol>
	
	  <!-- Wrapper for slides -->
	 <div class="carousel-inner" role="listbox">
	    <div class="item active">
	      <img src="img/hhh.PNG" alt="...">
	      <div class="carousel-caption">
	        
	      </div>
	    </div>
	    <div class="item">
	      <img src="img/hhh2.PNG" alt="..." >
	      <div class="carousel-caption">
	        
	      </div>
	    </div>
	    <div class="item">
	      <img src="img/hhh3.PNG" alt="...">
	      <div class="carousel-caption">
	        
	      </div>
	    </div>
	   
	  </div>
	
	  <!-- Controls -->
	  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
	    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	    <span class="sr-only">Previous</span>
	  </a>
	  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
	    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	    <span class="sr-only">Next</span>
	  </a>
	</div>
   		
    		
    	</div>
    </div>
    
	
	<div class="container damu-row">
	<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
	<form id="searchForm"method="post" action="search">
		<div class="input-group">
	      <input type="text" id="search" name="title" class="form-control" placeholder="Search for...">
	      <span class="input-group-btn">
        <button class="btn btn-default" type="button" id="btn">查找</button>	
      </span>
    </div><!-- /input-group -->
    </form>
        <div><span id="Warn"></span></div>
    
    
    
	</div>
	<div class="col-md-4"></div>
	</div>
		<div class="row">
			<div class="col-md-2 ">
    	</div>
  <!-- Nav tabs -->
	  <ul class="nav nav-tabs" role="tablist">
	    <li role="presentation"><a href="SelectByCid?cid=1" >武侠</a></li>
	    <li role="presentation"><a href="SelectByCid?cid=2" >奇幻</a></li>
	    <li role="presentation"><a href="SelectByCid?cid=3" >言情</a></li>
	  	<li role="presentation"><a href="SelectByCid?cid=4" >冒险</a></li>
	  	<li role="presentation"><a href="SelectByCid?cid=5" >科幻</a></li>
	  	<li role="presentation"><a href="SelectByCid?cid=6" >文学</a></li>
	  	<li role="presentation"><a href="SelectByCid?cid=7" >历史</a></li>
	  	<li role="presentation"><a href="SelectByCid?cid=8" >青春</a></li>
	  </ul>

  <!-- Tab panes -->
	  <div class="tab-content">
	    <div role="tabpanel" class="tab-pane active" id="home">
	    	<div class="row">
	    	
	    	
	    <div class="col-lg-10">
		<form>
			<table class="table">
			<c:forEach items="${list}" var="book" varStatus="x">
				<tr>
				
				<td><img src="/img/${book.photo}" style="width:160px;height:160px;"></td>
				<td><h4>${book.title}</h4><br><font color="#337ab7">${book.describ}</font><br><h3>￥：<font color="red">${book.price}</font></h3></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><button  id="look" class=" btn btn-default" style="margin-top:80px;"><a href="OneBook?id=${book.id}">查看</a></button></td>
				</tr>
				
				
					
			</c:forEach>
			</table>
		</form>
	</div>
	    	
	    	
	    	
	    	</div>
	    </div>
	   
	    
	  </div>
		<div class="col-md-2 ">
   	</div>
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
  
    
    
    
    	$('.carousel').carousel({
  			interval: 2000
		})
		$("#btn").click(function(){
			/* var title=$("#search").val().trim();
			alert(title);
			 var  book={
						title:title
				};
			var bookStr=JSON.stringify(book);
			$.ajax({
	    		url:"search",
	    		data:bookStr,
	    		type:"POST",
	    		contentType:"application/json",
	    		success:function(data){
	    			alert(data);
	    		}
	    		
	    		
	    	}) */
			var title=$("#search").val().trim();
			if(title.length==0){
				$("#Warn").html("<font class='warn'>请输入合法字符</font>");
			}
			$("#searchForm").submit();
			
		})
		
    </script>
  </body>
</html>