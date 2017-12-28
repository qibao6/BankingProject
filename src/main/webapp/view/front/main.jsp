 <%@page import="com.demo.model.Users"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width,maximum-scale=1.0,user-scalable=yes">
<meta name="Keywords" content="股指体验交易，股指单手交易，股指多手交易">
<meta name="description" content="申请实盘交易账户，直接进行实盘交易。">
<title>产品中心- 盈+</title>

<meta name="keywords"
	content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath%>resources/web/images/icon.ico"
	type="image/x-icon" rel="shortcut icon">

<link href="<%=basePath%>resources/web/font/iconfont.css"
	rel="stylesheet" type="text/css" />
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">

<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=basePath%>resources/web/layer/layer.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
</head>
<body>

	<div class="logo container">
		<div class="row">
			<div class="logoImg">
				<a href="http://www.ying158.com/home"><img
					src="<%=basePath%>resources/web/images/logo2.png"
					onmouseover="this.src = '<%=basePath%>resources/web/images/logo1.png'"
					onmouseout="this.src = '<%=basePath%>resources/web/images/logo2.png'"></a>
			</div>
			<div class="telInfo">
				<img src="<%=basePath%>resources/web/images/400Icon.png"
					onmousemove="this.src = '<%=basePath%>resources/web/images/400IconActive.png'"
					onmouseout="	this.src = '<%=basePath%>resources/web/images/400Icon.png'">
				
				
						<div class="detail">
					
						<c:if test="${members==null}">
							<a
						style="font-size: 18px; float: right; margin-top: 5px; color: #917739;"
						href="<%=basePath%>web/login">登录</a> <a
						style="font-size: 18px; float: right; margin-right: 15px; margin-top: 5px; color: #917739;"
						href="<%=basePath%>web/regis">注册</a> <br>4000-999-158
						</c:if>
						<c:if test="${members!=null}">
						

                    	<div style="font-size:16px;float:right;margin-top:5px;color:#917739;">  欢迎${members.names },<a href="<%=basePath%>hyzx/0/logins">[会员中心]</a>,<a href="<%=basePath%>web/logout">[退出]</a></div>
                <br>4000-999-158
						
						
						</c:if>
							
							
						
						
					
							
					
				</div>
			</div>
		</div>
	</div>
	<div class="jwNav">
		<div class="container">
			<div class="row">
				<ul class="topNav">
					<li><a class="item first" href="http://www.ying158.com/home">
							首页 </a></li>
					<li><a class="item" href="http://www.ying158.com/home/kcenter">
							网上体验中心 </a></li>
					<li class="item"><a class="item"
						href="<%=basePath%>view/front/main.jsp"> 产品中心 </a>
					</li>
					<li><a class="item"
						href="http://www.ying158.com/Home/NewsCenter"> 新闻中心 </a></li>
					<li><a class="item" href="/winplus/mobileappdownload">
							下载中心 </a></li>
					<li><a class="item " href="http://www.ying158.com/Home/Help">
							盈+商学院 </a></li>
					<li><a class="item"
						href="http://ying158.com/UserGuide/TradingSoftware"> 投研中心 </a></li>
					<li><a class="item last"
						href="http://pro.ying158.com/account/trades/profit/records">
							我的加法库 </a></li>



				</ul>
			</div>
		</div>
	</div>
	<script type="text/javascript"><div class="sdbanner probanner"></div>
    $(function(){
        function showIn(url){
            var info="<div class='mydig'><div class='bg'></div><div class='imgbox'><a href="+url+"></a></div></div>";
            $('body').append(info);
        }
        
        if (1!=null&&1==0){
            showIn("/winplus/account/bbinInfo/getBbinInfo");
        }


    });

</script>



		<meta name="keywords"
			content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
		<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
		<link href="<%=basePath%>resources/web/images/icon.ico"
			type="image/x-icon" rel="shortcut icon">
	
		<div>
			<iframe name="myiframe" frameborder="0" scrolling="no"
				src="<%=basePath%>subject/like/10/-1/-1/-1" width="100%" height="1100px">
				
			</iframe>
		</div>


		<script type="text/javascript">
	function getJsonInfo(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer").empty();
			$(".ajaxContainer").append(data);
		});
	}
		require.config({
            paths: {
                echarts: '<%=basePath%>resources/web/echart/dist/'
            }
        });
		require(
			[
				'echarts',
				'echarts/chart/pie'
			],
			function (ec) {
				var labelTop = {
						normal : {
							color:'#ff503f',
							label : {
								show : false,
								position : 'center',
								formatter : '{b}',
								textStyle: {
									baseline : 'bottom'
								}
							},
							labelLine : {
								show : false
							}
						}
					};
				var labelFromatter = {
					normal : {
						label : {
							formatter : function (params){
								return 100 - params.value + '%'
							},
							textStyle: {
								color:'#666',
								baseline : 'middle'
							}
						}
					},
				};
				var labelBottom = {
					normal : {
						color: '#f8f8f8',
						label : {
							show : true,
							position : 'center'
						},
						labelLine : {
							show : false
						}
					}
				};
				var radius = [30,35];
				var myChart1 =document.getElementsByClassName('yuan');
				for(i=0;i<myChart1.length;i++){
					var num = myChart1[i].getAttribute('data-num');
					ec.init(myChart1[i]).setOption({
						series : [
							{
								type : 'pie',
								center : ['50%', '50%'],
								radius : radius,
								x: '0%', // for funnel
								itemStyle : labelFromatter,
								data : [
									{name:'other', value:100-num, itemStyle : labelBottom},
									{name:'占比', value:num,itemStyle : labelTop}
								]
							},
						]
					});
				}
			}
		);
    </script>
	</div>

	<meta charset="UTF-8">
	<div class="security">
		<div class="item">
			<img src="<%=basePath%>resources/web/images/indexSecurity1.png">
			<div class="detail">
				资金银行监管
				<div class="desc">平台资金由第三方银行监管</div>
			</div>
		</div>
		<div class="item">
			<img src="<%=basePath%>resources/web/images/indexSecurity2.png">
			<div class="detail">
				交易证监会监管
				<div class="desc">投资交易由证监会监管</div>
			</div>
		</div>
		<div class="item">
			<img src="<%=basePath%>resources/web/images/indexSecurity3.png">
			<div class="detail">
				风控盈+监管
				<div class="desc">盈+全自动风控系统为您保驾护航</div>
			</div>
		</div>
	</div>
	<div class="foot">
		<div class="container">
			<div class="row">
				<div class="hzhb_box">
					<div class="title"
						style="padding-left: 10px; font-weight: normal; font-size: 20px; color: #ccc;">
						主要合作机构</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.picc.com/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/1_on.png'"
							onmouseout="this.src = '<%=basePath%>resources/web/images/hzhb/1.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/1.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.fuioupay.com/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/2_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/2.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/2.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.nanhua.net/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/3_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/3.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/3.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.zttrust.com.cn/stations/526623d20a/index.php/5268e6b50a"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/4_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/4.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/4.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://sc.hkex.com.hk/TuniS/www.hkex.com.hk/eng/index.htm/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/5_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/5.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/5.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.cmegroup.com/cn-s/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/6_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/6.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/6.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.sgx.com/wps/portal/sgxweb_ch/home/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNHB1NPAycDSz9wwzMDTxD_Z2Cg8PCDANdjYEKIoEKDHAARwNC-sP1o8BK8JhQkBthkO6oqAgAzDYPQQ!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/7_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/7.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/7.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.neeq.com.cn/index/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/8_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/8.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/8.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.cmbchina.com/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/9_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/9.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/9.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank"
							href="http://www.bankcomm.com/BankCommSite/default.shtml"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/10_on.png'"
							onmouseout="this.src = '<%=basePath%>resources/web/images/hzhb/10.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/10.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.ccb.com/cn/home/index.html"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/11_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/11.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/11.jpg" /></a>
					</div>
					<div class="hzhb_item">
						<a target="_blank" href="http://www.icbc.com.cn/icbc/"><img
							onmouseover="this.src = '<%=basePath%>resources/web/images/hzhb/12_on.png'"
							onmouseout="    this.src = '<%=basePath%>resources/web/images/hzhb/12.jpg'"
							src="<%=basePath%>resources/web/images/hzhb/12.jpg" /></a>
					</div>
				</div>

				<div class="ft_item ft_item_sns">
					<div class="ft_item_tit">关注我们</div>
					<ul style="margin-bottom: 0px;" class="ft_sns_list clearfix">
						<li>
							<div class="wx_tips j_tips">
								<div class="tips_hd">
									<em class="ico_sns ico_weixin"></em> <span class="txt">微信公众号</span>
								</div>

								<div class="tips_bd">
									<em class="arrow0"></em> <img
										src="<%=basePath%>resources/web/images/yj.jpg" alt="微信公共平台">
								</div>
							</div>
						</li>
						<li><a href="" target="_blank" rel="nofollow"> <em
								class="ico_sns ico_sinawb"></em> <span class="txt">新浪微博</span>
						</a></li>
						<li><a href="" target="_blank" rel="nofollow"> <em
								class="ico_sns ico_txwb"></em> <span class="txt">腾讯微博</span>
						</a></li>
					</ul>

					<div class="contactUs">
						<div class="title"
							style="padding-left: 10px; font-weight: normal; font-size: 20px; color: #ccc;">
							联系我们</div>
						<div class="contactInfo" style="padding-left: 30px;">
							<a
								style="display: inline-block; height: 50px; width: 50px; text-align: center;"
								target="_blank"
								href="http://wpa.qq.com/msgrd?v=3&amp;uin=508886246&amp;site=qq&amp;menu=yes"><img
								src="<%=basePath%>resources/web/images/qqIcon.png"
								onmouseover="$(this).css('height', '52px');"
								onmouseout="    $(this).css('height', '48px');" /></a> <span
								class="kefu">在线客服</span><span class="time">08:30 - 21:00</span>
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	<div class="foot3">
		<div class="container">
			<div class="row">
				Copyright ? 2010 - 2015 www.ying158.com All Rights Reserverd
				杭州吉威投资管理有限公司 版权所有<br> 浙ICP备14030807号-3 杭州市江干区钱江新城迪凯银座19F
				4000-999-158
			</div>
		</div>
	</div>
	<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "//hm.baidu.com/hm.js?06cf97732baac1a65bed8ae95f2384aa";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
	<script type="text/javascript">
$(function(){
	$('#11').addClass("select");
	$('#21').addClass("select");
	$('#31').addClass("select");
	$('#41').addClass("select");
});
</script>
</body>
</html>