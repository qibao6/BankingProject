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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="ajaxContainer">
        <!-- 异步内容开始 -->
                    <ul class="tbList">
                        <li class="first">
                            <span class="ico jp"></span>
                            <h2><b>测试私募</b></h2>
                            <i></i>
                        </li>
                        <li class="second" style="width:630px;">
                            <div class="txt1">
                                <h2>15%</h2>
                                <p>年化收益</p>
                            </div>
                            <div class="txt2">
                                <h2>365</h2>
                                <p>期限(天)</p>
                            </div>
                            <div class="txt2">
                                <h2>1000000
                                </h2>
                                <p>起购金额(元)</p>
                            </div>

                        </li>
                        <li class="five"><a class="abtn" href="<%=basePath%>finance/financeview" target="twoiframe">购买</a></li>
                    </ul>
                    <ul class="tbList">
                        <li class="first">
                            <span class="ico jp"></span>
                            <h2><b>私募标的</b></h2>
                            <i></i>
                        </li>
                        <li class="second" style="width:630px;">
                            <div class="txt1">
                                <h2>15%</h2>
                                <p>年化收益</p>
                            </div>
                            <div class="txt2">
                                <h2>10</h2>
                                <p>期限(天)</p>
                            </div>
                            <div class="txt2">
                                <h2>200
                                </h2>
                                <p>起购金额(元)</p>
                            </div>

                        </li>
                        <li class="five"><a class="abtn" href="<%=basePath%>finance/financeview" target="twoiframe">购买</a></li>
                    </ul>
                    <ul class="tbList">
                        <li class="first">
                            <span class="ico jp"></span>
                            <h2><b>私募3234</b></h2>
                            <i></i>
                        </li>
                        <li class="second" style="width:630px;">
                            <div class="txt1">
                                <h2>6%</h2>
                                <p>年化收益</p>
                            </div>
                            <div class="txt2">
                                <h2>5</h2>
                                <p>期限(天)</p>
                            </div>
                            <div class="txt2">
                                <h2>324
                                </h2>
                                <p>起购金额(元)</p>
                            </div>

                        </li>
                        <li class="five"><a class="abtn" href="<%=basePath%>finance/financeview" target="twoiframe">购买</a></li>
                    </ul>
                <ul class="tbList">
                    <li class="first">
                        <span class="ico jp"></span>
                        <h2><b>股权标的</b></h2>
                        <i></i>
                    </li>
                    <li class="second">
                        <div class="txt1" style="width:115px; margin-left:40px;">
                            <h2>10%</h2>
                            <p>年化收益</p>
                        </div>
                        <div class="txt2" style="width:120px;margin-left:40px;">
                            <h2>100</h2>
                            <p>起购金额(元)</p>
                        </div>
                    </li>
                    <li class="six three" style="width:290px;">
                        <p>已购人数：345人
                            <br>
                            管理人：345<br>
                            投资方向：345
                        </p>
                    </li>
                    <li class="five"><a class="abtn" href="<%=basePath%>finance/financeview" target="twoiframe">购买</a></li>
                </ul>
                </div>
                <div class="llpage">
		<div class="in">
			
				<a class="prev_page">上页</a>
			
			
					<a class="now" >1</a>
			
			
				<a class="next_page" rel="next">下页</a>
		</div>
	</div>
</body>
</html>