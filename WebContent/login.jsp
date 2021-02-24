<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入函数标签库 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>颂の书城</title>
<link href="Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="Wopop_files/jquery.ui.all.css">
<style>
	.warn {
		color:#e1251d;
	}
</style>
</head>

<body class="login" mycollectionplug="bind">

<div class="login_m">
<div class="login_logo"><span style=" width:196px;height:46px;font-size:30px;"><a href="#">颂の书城</a></span></div>
<div class="login_boder">

<div class="login_padding" id="login_model">
<form action="loginDo" method="post">
  <h2>用户名</h2>
  <label>
    <input type="text" id="username" class="txt_input txt_input2" placeholder="请输入用户名" name="account">
  </label>
  <h2>密码</h2>
  <label>
    <input type="password" id="userpwd" class="txt_input" placeholder="请输入密码" name="password" >
  </label>
 <span class="warn">${requestScope.usercheck}</span>
 

 
  
  <a id="iforget" href="Sign.jsp">注册</a>
  </p>
  <div class="rem_sub">
  <div class="rem_sub_l">
 <input type="checkbox" name="checkbox" id="save_me">
   <label for="checkbox">Remember me</label>
   </div>
    <label>
     <input type="submit" class="sub_button center"  name="button" id="button" value="登录" style="opacity: 0.7;">
    </label>
  </div>
  </form>
</div>



 
 
  
   
</div>






<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->
 



</body></html>