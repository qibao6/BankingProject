<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://www.ying158.com/images/icon.ico" type="image/x-icon" rel="shortcut icon">
	<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
	<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">
    <link href="<%=basePath%>resources/web/font/iconfont.css" rel="stylesheet">
    <script src="<%=basePath%>resources/web/js/jquery.js"></script>
    <script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
function setIframeHeight(iframe) {
	if (iframe) {
	var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
	if (iframeWin.document.body) {
	iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
	}
	}
	};

	window.onload = function () {
	setIframeHeight(document.getElementById('kuangjia'));
	};
</script>
<body>
	<table height="160" class="peopleInfo" width="970" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td align="left" valign="middle" class="info">
            <a href="<%=basePath%>account/security">
                <div class="img"><img src="<%=basePath%>resources/web/images/userPic.jpg"></div>
                <h2>${members.names }，<span>您好!</span></h2>
            </a>
            <div class="safe">账户安全&nbsp;&nbsp;<span class="scroll"><em style="width:100%"></em></span></div>
            <ul class="listIco iconfont">
                <li class="active"><a href="#1">&#xe61c;</a><em>&#xe61b;</em></li>
                <li class="active"><a href="#1">&#xe61d;</a><em>&#xe61b;</em></li>
                <!-- <li class=""><a href="#1">&#xe61f;</a><em>&#xe61b;</em></li> -->
                <li class="active"><a href="#1">&#xe61a;</a><em>&#xe61b;</em></li>                                
                <li class="active"><a href="#1">&#xe61e;</a><em>&#xe61b;</em></li>
            </ul>
        </td>
        <td align="right">
            <a href="<%=basePath%>web/logout" class="loginOut"><span class="iconfont">&#xe618;</span>安全退出</a>
        </td>
    </tr>
</table>
<div class="countBox">
    <ul>
        <li><h2>${memberAccount.useableBalance}</h2><p>账户可用余额(元)<a href="javascript:;" class="iconfont">&#xe619;<span>账户可用余额</span><i></i></a></p></li>
        <li><h2><f:formatNumber>${memberAccount.useableBalance+memberAccount.investAmount+memberAccount.totalProfit}</f:formatNumber></h2><p>账户总资产(元)<a href="javascript:;" class="iconfont">&#xe619;<span>可用余额+投资金额+累计收益</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${memberAccount.investAmount}</h2><p>投资金额(元)<a href="javascript:;" class="iconfont">&#xe619;<span>投资中资金</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${memberAccount.totalProfit}</h2><p>累计收益(元)<a href="javascript:;" class="iconfont">&#xe619;<span>累计收益</span><i></i></a></p></li>
        <li><h2 style="color:#9d8440">${memberAccount.imusealeBalance}</h2><p>冻结金额(元)<a href="javascript:;" class="iconfont">&#xe619;<span>提现冻结金额</span><i></i></a></p></li>
    </ul>
    <a href="<%=basePath%>account/deposit" class="cz">充值</a>
    <a href="<%=basePath%>account/withdraw" class="tk">提款</a>
</div>    
<div class="proMain clearfix">
<div class="adminLeft">
    <h2>我的投资</h2>
    <ul>
        <li><a id="member_center_menu_invests" href="<%=basePath%>account/touZiList" target="rightkj"><em class="iconfont red">&#xe602;</em>投资记录</a></li>
        <li><a id="member_center_menu_profit_record" href="<%=basePath%>view/hyzx/shouyi.jsp" target="rightkj"><em class="iconfont red">&#xe616;</em>收益记录</a></li>
        <li><a id="member_center_menu_deposit_record" href="<%=basePath%>account/deposit/records" target="rightkj"><em class="iconfont red">&#xe616;</em>充值记录</a></li>
        <li><a id="member_center_menu_withdraw_record" href="<%=basePath%>account/withdraw/records" target="rightkj"><em class="iconfont red">&#xe616;</em>提款记录</a></li>
        <li><a id="member_center_menu_bbinInfo_record" href="<%=basePath%>account/bbinInfo/records" target="rightkj"><em class="iconfont red">&#xe616;</em>体验金记录</a></li>
    </ul>
    <h2>我的账户</h2>
    <ul>
        <li><a id="member_center_menu_deposit" href="<%=basePath%>account/deposit" target="rightkj"><em class="iconfont">&#xe614;</em>账户充值</a></li>
        <li><a id="member_center_menu_security" href="<%=basePath%>account/security" target="rightkj"><em class="iconfont">&#xe612;</em>安全信息</a></li>
        <li><a id="member_center_menu_withdraw" href="<%=basePath%>account/withdraw" target="rightkj"><em class="iconfont">&#xe612;</em>我要提款</a></li>
        <li><a id="member_center_menu_financial" href="<%=basePath%>account/financial" target="rightkj"><em class="iconfont">&#xe612;</em>我是理财师</a></li>
    </ul>
</div>
<script>
  var menu_item="member_center_menu_profit_record";
 $("#"+menu_item).addClass("select");
</script>
        <div class="admin-right">
        	<iframe width="95%" id="kuangjia" name="rightkj" frameborder=0 scrolling=auto src="<%=basePath%>view/hyzx/shouyi.jsp"></iframe>
        </div>
    </div>
</body>
</html>