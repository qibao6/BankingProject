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
    <div class="proMain">
    	<div class="conTit">
        	<span><a style="color:#9d8440;" href="/winplus/finance">其他标的</a></span>
        	<h2><em>￥</em>测试私募</h2>
        </div>
        <table class="conTable" width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="txtInfo">
            	<div class="txt2">
                	<h2>15%</h2>
                    <p>预期收益</p>
                </div>
            	<div class="txt1">
                	<h2>365</h2>
                    <p>期限(天)</p>
                </div>
                <div class="txt3">
                	<h2>1000000</h2>
                    <p>起投金额(元)</p>
                </div>
            </td>
            <td width="360" align="center"; valign="middle" height="320">
            	<div class="tbBox">
            	<div class="li4" style=""><span id="checkmoney" style="color: red;"></span></div>
            	<a href="/winplus/web/login">登录</a>后可见
                    <p><input class="txt" name="name" type="text" value="" placeholder="请输入姓名"></p>
                    <p><input class="txt" name="phone" type="text" value="" placeholder="请输入电话号码"></p>
                    <p class="pSelect">
                    	<span class="select1 fl">
							<select id="loc_province" ></select>
                        </span>
                        <span class="select2 fr">
                            <select id="loc_city" ></select>
                        </span>
                         <input type="hidden" name="location_id"  id="location_id"/>
                    </p>
                   		<button disabled="disabled" style="background-color: #848080;">已售罄</button>
                    <div class="phone"><span>4000-999-158</span>7X24小时咨询电话</div>
                </div>
            </td>
          </tr>
        </table>
        <div class="tbConBox">
        	<div class="tab">
            	<a class="select" href="#1">基金专题</a>
                <a href="#1">基金经理</a>
                <a href="#1">产品策略</a>
                <a href="#1">产品要素</a>
            </div>
            <div id="conBox">
                <div class="box" style="display:block">
                      <p>测试私募</p>        
                </div>
                <div class="box">
                	<table width="70%" class="lcrInfo" border="0" cellspacing="0" cellpadding="0">
						<tr><td><img class="rwImg" width="150" height="150" src="/winplus/upload/news/img/20160304/20160304112636234440.png"></td></tr>
						<tr><td><h2>张三</h2></td></tr>
						<tr><td><h4>经理</h4></td></tr>
						<tr><td><h3>测试私募</h3></td></tr>
						<tr><td><p><p>测试私募</p></p></td></tr>
					</table>
                </div>
                 <div class="box">
                     <p>测试私募</p>   
                </div>
                 <div class="box">
                     <p>测试私募</p>   
                </div>
            </div>
        </div>
    </div>

</body>
</html>