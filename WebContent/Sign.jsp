<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入函数标签库 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>颂の书城</title>
<link href="./Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/jquery.ui.all.css">
<style>
	.warn {
    			color:#e1251d;
    			
    		}

</style>
</head>

<body class="login" mycollectionplug="bind">
<div class="login_m">
<div class="login_logo"><span style=" width:196px;height:46px;font-size:30px;"><a href="welcome.html">颂の书城</a></span></div>
<div class="login_boder">

<div class="login_padding" id="login_model">
<form action="SignDo" id="formid" method="post">
  <h2>邮箱号</h2>
  <label>
    <input type="text" name="useremail" id="useremail" class="txt_input txt_input2" placeholder="请输入邮箱号" />
  </label>
  <div><span id="userEmailWarn"></span></div>
  <div><span id="EmailWarn"><font class='warn'>${requestScope.emailwarn}</font></span></div>
  <span ><font class='warn' id="error2">${requestScope.emailerror}</font></span>
  <h2>验证码</h2>
  <label>
    <input type="text" name="yanzhengma" id="yanzhengma" class="txt_input" placeholder="请输入验证码" />
    <div style="float:right;"><a id="send">发送验证码</a></div>
    </label>
    <div><span id="Warn"></span></div>
     <div><span id="Warn2"><font class='warn'>${requestScope.Warn2}</font></span></div>
	<h2>用户名</h2>
  <label>
    <input type="text" name="username" id="username" class="txt_input txt_input2" placeholder="请输入用户名"/><span id="userNameWarn"></span>
  	
  </label>
  <span><font class="warn" id="error1">${requestScope.nameerror}</font></span>
    <h2>密码</h2>
  <label>
    <input type="password" name="password" id="userpwd" class="txt_input" placeholder="请输入密码" />
  </label>
 <div><span id="passwordWarn"></span></div>
 

 </form>
 
  <p class="forgot"><a id="iforget" href="login.jsp">登录</a>
  
  </p>
  <div class="rem_sub">
  <div class="rem_sub_l">
  
   <a href="#">联系我们</a>
   </div>
    <label>
      <input type="button" class="sub_button" name="button" id="button" value="注册" style="opacity: 0.7;"/>
    </label>
  </div>
</div>



 
 
  
   
</div>






<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->
 <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    $("#username").focus(function(){
    	$("#error1").html("");
		$("#userNameWarn").html("<font class='warn'>用户名字数0~10</font>");
	})
	$("#username").blur(function(){
		
		var name=$("#username").val().trim();
		if(name.trim().length==0){
			$("#userNameWarn").html("<font class='warn'>用户名不可以为空</font>");
		}
		else if(name.trim().length>20){
			$("#userNameWarn").html("<font class='warn'>用户名字数超出限制，请输入0~10个字符</font>");
		}
		else {
			$("#userNameWarn").html("");
		}
	})
	
	$("#useremail").focus(function(){
		$("#error2").html("");
	})
	$("#useremail").blur(function(){
		var email=$("#useremail").val().trim();
    var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/; 
    if (re.test(email)) {
    		$("#userEmailWarn").html("");
    	} else {
    		$("#userEmailWarn").html("<font class='warn'>邮箱格式非法</font>");
    }
  })

	
    $("#yanzhengma").focus(function(){
		$("#Warn").html("");
		$("#Warn2").html("");
	})
	$("#yanzhengma").blur(function(){
		var name=$("#yanzhengma").val().trim();
		
		if(name.trim().length==0){
			$("#Warn").html("<font class='warn'>请输入验证码</font>");
		}
		else if(name.trim().length>4){
			$("#Warn").html("<font class='warn'>请输入正确的验证码</font>");
		}
		else {
			$("#Warn").html("");
		}
	})
    
	$("#userpwd").blur(function(){
    var pass=$("#userpwd").val().trim();
   
    var reg=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$/;
    var result=reg.test(pass);
    if(result==false){
    	$("#passwordWarn").html("<font class='warn'>密码由大写和小写字母+数字，8-10位组成！</font>");
        
    }
    else {
    $("#passwordWarn").html("");
    }	
    })
	
	$("#button").click(function(){
		
		var test1=$("#userNameWarn").html().toString().length;
		var test2=$("#userEmailWarn").html().toString().length;
		var test3=$("#Warn").html().toString().length;
		var test4=$("#passwordWarn").html().toString().length;
	
    	if(test1==0&&test2==0&&test3==0&&test4==0){
    		var name=$("#username").val().trim().length;
    		var email=$("#useremail").val().trim().length;
    		var yan=$("#yanzhengma").val().trim().length;
    		var pass=$("#userpwd").val().trim().length;
    		if(name!=0&&email!=0&&yan!=0&&pass!=0){
    			alert("1");
    			$("#formid").submit();    			
    		}
    		else{
    			alert("请填写你要注册的信息");
    			
    		}
    		
    	}
    	else {
    		alert("请正确填写信息");
    		
    	}
    	
		
		
	})
	
	$("#send").click(function(){
		var email=$("#useremail").val().trim();
		alert(email);
		var args={"useremail":email};
		$.post("email",args,function(data){
			
			$("#Warn2").val(data);
		})
	})
	
    </script>
</body></html>