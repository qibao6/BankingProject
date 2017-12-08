<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

 <div class="sdShaix">
        	<ul>
            	<li class="first">标的类型：</li>
               		<li><a href="<%=basePath%>resources/subject?cid=11&type=11&yearRate=21&period=31&status=41" id="11">全部</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=12&type=11&yearRate=21&period=31&status=41" id="12">固收类理财</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=13&type=11&yearRate=21&period=31&status=41" id="13">车盈宝</a></li>
            </ul>
        	<ul>
            	<li class="first">年化收益：</li>
               		<li><a href="<%=basePath%>resources/subject?cid=21&type=11&yearRate=21&period=31&status=41" id="21">全部</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=22&type=11&yearRate=21&period=31&status=41" id="22">6.0%</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=23&type=11&yearRate=21&period=31&status=41" id="23">7.0%</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=24&type=11&yearRate=21&period=31&status=41" id="24">7.5%</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=25&type=11&yearRate=21&period=31&status=41" id="25">8.0%</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=25&type=11&yearRate=21&period=31&status=41" id="25">8.0%以上</a></li>
            </ul>
        	<ul>
            	<li class="first">项目期限：</li>
               		<li><a href="<%=basePath%>resources/subject?cid=31&type=11&yearRate=21&period=31&status=41" id="31">全部</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=32&type=11&yearRate=21&period=31&status=41" id="32">15天以下</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=33&type=11&yearRate=21&period=31&status=41" id="33">15-30天</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=34&type=11&yearRate=21&period=31&status=41" id="34">30-180天</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=35&type=11&yearRate=21&period=31&status=41" id="35">180-365天</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=36&type=11&yearRate=21&period=31&status=41" id="36">一年以上</a></li>
            </ul>
        	<ul>
            	<li class="first">标的状态：</li>
               		<li><a href="<%=basePath%>resources/subject?cid=41&type=11&yearRate=21&period=31&status=41" id="41">全部</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=42&type=11&yearRate=21&period=31&status=41" id="42">投标中</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=43&type=11&yearRate=21&period=31&status=41" id="43">还款中</a></li>
               		<li><a href="<%=basePath%>resources/subject?cid=44&type=11&yearRate=21&period=31&status=41" id="44">已完成</a></li>
            </ul>
        </div>
<ul class="tbList">
						<li class="first">
									<span class="ico zq"></span>
							<h2><em>投</em>有缘固收类1</h2>
							<i></i>
						</li>
						<li class="second">					
							
							<div class="txt1">
								<h2>6.0<span style="font-size:18px;">+1.0%</span></h2>
								<p>年化收益</p>
							</div>
							
							<div class="txt2">
								<h2>￥100.00</h2>
								<p>起购金额(元)</p>
							</div>
							
							<div class="txt2">
								<h2>6天</h2>
								<p>投资期限</p>
							</div>
						</li>
						<li class="three">
								<a href="#1">企业担保</a><span>中国人保财险承保</span>
								<p>计息日期：当天投资，立即计息<br>已购人数：423人</p>
						</li>
						<li class="four">
								
						</li>
						<li class="five">
							<a class="abtn" href="<%=basePath%>subject/purchase" target="myiframe">购买</a>
						</li>
					</ul>
					<ul class="tbList">
						<li class="first">
									<span class="ico cd"></span>
							<h2><em>投</em>测试车贷123</h2>
							<i></i>
						</li>
						<li class="second">					
							<div class="txt1">
								<h2>5555</h2>
								<p>标的总额(万)</p>
							</div>
							
							<div class="txt2">
								<h2>7.0<span style="font-size:18px;">+1.0%</span></h2>
								<p>年化收益</p>
							</div>
							
							
							<div class="txt2">
								<h2>5天</h2>
								<p>投资期限</p>
							</div>
						</li>
						<li class="three">
								<a href="#1">企业担保</a><span>中国人保财险承保</span>
								<p>计息日期：募集满后第二天<br>已购人数：
									0人</p>
						</li>
						<li class="four">
								<div data-num="0" class="yuan"></div>
						</li>
						<li class="five">
							<a class="abtn" href="<%=basePath%>subject/purchase" target="myiframe">购买</a>
						</li>
					</ul>
					<ul class="tbList">
						<li class="first">
									<span class="ico zq"></span>
							<h2><em>投</em>理财宝一号11</h2>
							<i></i>
						</li>
						<li class="second">					
							
							<div class="txt1">
								<h2>6.0<span style="font-size:18px;">+1.0%</span></h2>
								<p>年化收益</p>
							</div>
							
							<div class="txt2">
								<h2>￥100.00</h2>
								<p>起购金额(元)</p>
							</div>
							
							<div class="txt2">
								<h2>5天</h2>
								<p>投资期限</p>
							</div>
						</li>
						<li class="three">
								<a href="#1">企业担保</a><span>中国人保财险承保</span>
								<p>计息日期：当天投资，立即计息<br>已购人数：105人</p>
						</li>
						<li class="four">
								
						</li>
						<li class="five">
							<a class="abtn" href="<%=basePath%>subject/purchase" target="myiframe">购买</a>
						</li>
					</ul>
					<div class="llpage">
		<div class="in">
			
				<a class="prev_page">上页</a>
			
			
					<a class="now" >1</a>
			
			
				<a class="next_page" rel="next">下页</a>
		</div>
	</div>
</body>
</html>