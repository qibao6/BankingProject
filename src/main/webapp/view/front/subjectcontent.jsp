<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<script type="text/javascript">
    $(function(){
        function showIn(url){
            var info="<div class='mydig'><div class='bg'></div><div class='imgbox'><a href="+url+"></a></div></div>";
            $('body').append(info);
        }

    });

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="sdbanner probanner"></div>
<div class="proMain">
    <div class="conTit">
        <span><a style="color:#9d8440;" href="<%=basePath%>subject/subindex" target="myiframe">其他标的</a></span>
        <h2><em>￥</em>${subject.subjectName}</h2>
    </div>
    <table class="conTable" width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td class="txtInfo">
                <div class="txt1">
                    <h2>${subject.bought}</h2>
                    <p>已购人数(人)</p>
                </div>
                <div class="txt2">
                    <h2>${subject.year_rate }%</h2>
                    <p>年化收益</p>
                </div>
                <div class="txt1">
                    <h2>${subject.period}</h2>
                    <p>投资期限(天)</p>
                </div>
            </td>
            <td width="360" rowspan="2" align="center" ; valign="middle" height="320">
                <div class="tbBox">
                    <input type="hidden" id="account" value="">
                    <h2>19552</h2>
                    <p>已投金额(元)</p>
                    <div class="li4" style=""><span id="checkmoney" style="color: red;"></span></div>
                    <div class="tit">
                    <c:if test="${members==null}">
                    <span class="fr">
                            <a style="color:#2695d5" class="unlogin" href="<%=basePath%>web/login" target="twoiframe">登录</a>后可见
						</span>
						</c:if>
						<c:if test="${members!=null}">
						<span class="fr">
                        157.61元&nbsp;&nbsp;<a href="/winplus/account/deposit">充值&nbsp;&nbsp;&nbsp;</a>
						</span>
						</c:if>
                    	
                        <h2>账户余额</h2>
                        
                        <div id="count">预期所得收益<i
                                data-num="0.001151"
                                id="num">0</i>元
                        </div>
                    </div>
                    <input id="mytext" class="txt" name="totalFee" type="text"
                           placeholder="起投金额100元以上">
                        <span style="float: right;margin-top: -40px;position: relative; line-height: 40px; padding: 0 10px;color: #f00;"
                              id="addMoney"></span>
                    <p class="preBox">
                        <input type="checkbox" id="registerRule" class="registerRule" checked="checked"><span
                            class="fl">同意<a href="/winplus/web/syxy" target="_black">《产品协议》</a></span>
                    </p>
                    <button class="submit">确认抢购</button>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <ul class="conInfoList">
                    <li class="info">
                        <p>计息日期：<font color="#00baff">2017-12-08</font></p>
                        <p>还款方式：<font color="#00baff">一次性还本付息</font></p>
                        <p>资金到账日：<font color="#00baff">2017-12-14至2017-12-15</font>
                        </p>
                    </li>
                    <li class="info">
                        <p>保障方式：<font color="#00baff">企业担保</font></p>
                        <p>资金安全：<font color="#00baff">中国人保财险承保</font></p>
                        <p></p>
                    </li>
                </ul>
            </td>
        </tr>
    </table>
    <div class="tbConBox">
        <div class="tab">
            <a class="select" href="#1">产品速览</a>
            <a href="#1">项目详情</a>
            <a href="#1">安全保障</a>
        </div>
        <div id="conBox">
            <div class="box" style="display:block">
                <table class="dbwtab" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="corf9"><span>债权编号</span></td>
                    <td>45454</td>

                    <td class="corf9"><span>企业认证</span></td>
                    <td>545241</td>
                    </tr>
                    <tr>
                    <td class="corf9"><span>债权人</span></td>
                    <td>454545</td>

                    <td class="corf9"><span>保障平台</span></td>
                    <td>45545</td>

                </tr>
                </table>
                <div style="border:solid 1px #e9e9e9; padding:15px; margin-top:5px;"><p>123</p></div>
            </div>

            <div class="box" style="display:none;">
            <p>123</p>
            </div>
            <div class="box" style="display:none;">
            <p>123</p>
            </div>
        </div>
    </div>
    <div class="picList">
        认证文件展示
        <ul>
            <li><a href="/winplus/upload/514/1449624836387.jpg"><img
                    src="/winplus/upload/514/1449624836387.jpg"/></a></li>
            <li><a href="/winplus/upload/514/1449624836600.jpg"><img
                    src="/winplus/upload/514/1449624836600.jpg"/></a></li>
            <li><a href="/winplus/upload/514/1449624836815.jpg"><img
                    src="/winplus/upload/514/1449624836815.jpg"/></a></li>
        </ul>
        <!-- <div style="clear:both;"></div> -->
    </div>

</div>
<script type="text/javascript">

    $(function () {
        $(".tbConBox .tab a").click(function () {
            if (!$(this).hasClass("select")) {
                var num = $(this).index();
                $(this).addClass("select").siblings().removeClass("select");
                $("#conBox .box").eq(num).show().siblings().hide();
            }
        });

        $(":input[name=totalFee]").focus(function () {
            $(".li4").hide();
        });

        var redPacket = $("#redPacket");
        var bbinAll = $("#bbinAll");
        var addMoney = $("#addMoney");
        var mytext = $("#mytext");
        var exists = ${members};
        var authBankCard=false;
        
            $(".submit").click(function () {

                if (exists == null) {
                    $("#checkmoney").html("请先登陆!");
                    $(".li4").show(100);
                    return false;
                }
            });


    });

</script>

</body>
</html>