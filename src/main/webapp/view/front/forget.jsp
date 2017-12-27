<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<link href="<%=basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<link href="<%=basePath%>resources/web/font/iconfont.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">

<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/web/layer/layer.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script></head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="logo container">
    <div class="row">
        <div class="logoImg">
            <a href="http://www.ying158.com/home"><img src="<%=basePath%>resources/web/images/logo2.png" onmouseover="this.src = '<%=basePath%>resources/web/images/logo1.png'" onmouseout="this.src = '<%=basePath%>resources/web/images/logo2.png'"></a>
        </div>
        <div class="telInfo">
            <img src="<%=basePath%>resources/web/images/400Icon.png" onmousemove="this.src = '<%=basePath%>resources/web/images/400IconActive.png'" onmouseout="	this.src = '<%=basePath%>resources/web/images/400Icon.png'">
            <div class="detail">

                        <a style="font-size:18px;float:right;margin-top:5px;color:#917739;" href="/winplus/web/login">登录</a>
                        <a style="font-size:18px;float:right;margin-right:15px;margin-top:5px;color:#917739;" href="/winplus/web/regis">注册</a>
                <br>4000-999-158
            </div>
        </div>
    </div>
</div>
<div class="jwNav">
    <div class="container">
        <div class="row">
            <ul class="topNav">
                <li>
                    <a class="item first" href="http://www.ying158.com/home">
                        首页
                    </a>
                </li>
                <li>
                    <a class="item" href="http://www.ying158.com/home/kcenter">
                        网上体验中心
                    </a>
                </li>
                <li  class="item">
                    <a class="item" href="<%=basePath%>view/front/main.jsp">
                        产品中心
                    </a>
                </li>
                <li>
                    <a class="item" href="http://www.ying158.com/Home/NewsCenter">
                        新闻中心
                    </a>
                </li>
                <li>
                    <a class="item" href="/winplus/mobileappdownload">
                      下载中心
                    </a>
                </li>
                <li>
                    <a class="item " href="http://www.ying158.com/Home/Help">
                        盈+商学院
                    </a>
                </li>
                <li>
                    <a class="item" href="http://ying158.com/UserGuide/TradingSoftware">
                        投研中心
                    </a>
                </li>
                <li>
                    <a class="item last" href="http://pro.ying158.com/account/trades/profit/records">
                        我的加法库
                    </a>
                </li>



            </ul>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        function showIn(url){
            var info="<div class='mydig'><div class='bg'></div><div class='imgbox'><a href="+url+"></a></div></div>";
            $('body').append(info);
        }

    });

</script>    <div class="proMain">
  
    	<div class="container">
            <div class="row register">
                <div class="title">
                    <div class="left">
                        <hr>
                    </div>
                    <div class="mid">
                        重设密码
                    </div>
                    <div class="right">
                        <hr>
                    </div>
                </div>
                <div class="item">
                    <div class="rLabel">
                        手机号
                    </div>
                    <div class="rInput">
                        <input placeholder="请输入手机号" id="phone" name="phone" class="form-control textInput phone" type="text" ><span class="errorInfo">手机号码不能为空</span>
                    </div>
                </div>
                <div class="item">
                    <div class="rLabel">
                        验证码
                    </div>
                    <div class="rInput">
                        <input placeholder="请输入验证码" id=vCode name="code" class="form-control textInput code" type="text"><button class="btn vCodeBtn" onclick="sendMessage(60)" id="btnSendCode">获取验证码</button><span class="errorInfo"></span>
                    </div>
                </div>
                 <div class="item">
                    <div class="rLabel">
           输入新密码     
                    </div>
                    <div class="rInput">
                        <input placeholder=" 输入新密码" id="password" name="password" class="form-control textInput password" type="password"><span class="errorInfo">手机号码不能为空</span>
                    </div>
                </div>
                 <div class="item">
                    <div class="rLabel">
                        确认新密码
                    </div>
                    <div class="rInput">
                        <input placeholder="确认新密码" id="password2" name="password2" class="form-control textInput password2" type="password"><span class="errorInfo">手机号码不能为空</span>
                    </div>
                </div>
                <div class="item">
                    <div class="rLabel">
                        &nbsp;
                    </div>
                    <div class="rInput">
                        <button class="btn registBtn submit" id="checkCode">重设密码</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript" src="<%=basePath%>view/front/forget.js"></script>
<script type="text/javascript">
$(function(){
	var b = "<%=basePath%>";
	forget(b);
});
</script>
</body>
</html>