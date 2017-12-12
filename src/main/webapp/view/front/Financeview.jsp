<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html><head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,maximum-scale=1.0,user-scalable=yes">
	<meta name="Keywords" content="股指体验交易，股指单手交易，股指多手交易">
	<meta name="description" content="申请实盘交易账户，直接进行实盘交易。">
	<title>产品中心- 盈+</title>
	
<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<link href="<%=basePath%>resources/web/font/iconfont.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">

<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/web/layer/layer.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script></head>
<div class="logo container">
    <div class="row">
        <div class="logoImg">
            <a href="http://www.ying158.com/home"><img src="<%=basePath%>resources/web/images/logo2.png" onmouseover="this.src = '<%=basePath%>/resources/resources/web/images/logo1.png'" onmouseout="this.src = '<%=basePath%>resources/resources/web/images/logo2.png'"></a>
        </div>
        <div class="telInfo">
            <img src="<%=basePath%>resources/web/images/400Icon.png" onmousemove="this.src = '<%=basePath%>resources/web/images/400IconActive.png'" onmouseout="	this.src = '<%=basePath%>resources/resources/web/images/400Icon.png'">
            <div class="detail">

                        <a style="font-size:18px;float:right;margin-top:5px;color:#917739;" href="<%=basePath%>web/login" target="myiframe">登录</a>
                        <a style="font-size:18px;float:right;margin-right:15px;margin-top:5px;color:#917739;" href="<%=basePath%>web/regis" target="myiframe">注册</a>
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
                    <a class="item" href="<%=basePath%>subject/subindex" target="myiframe">
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

</script> <div class="sdbanner probanner"></div>
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