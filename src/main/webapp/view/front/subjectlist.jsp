<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<div class="sdbanner probanner"></div>
	
	<div class="proMain">
		<div class="hwpzNav">
		
			<ul>
				<li class="first"><a class="active"
					href="<%=basePath%>subject/subindex" target="myiframe">固收类理财</a></li>
				<li class="second"><a href="<%=basePath%>finance/financelist"
					target="myiframe">私募基金</a></li>
				<li class="three"><a href="<%=basePath%>subject/oversea"
					target="myiframe">海外配置</a></li>
				<li class="four"><a href="<%=basePath%>finance/financelist"
					target="myiframe">股权基金</a></li>
			</ul>
		</div>

	<div class="sdShaix">
		<ul>
			<li class="first">标的类型：</li>
			<li><a
				href="<%=basePath%>subject/likeshow/-1/1/1/1"
				id="11" name="subjectType">全部</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow/0 "
				id="12" name="subjectType">固收类理财</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow/1"
				id="13" name="subjectType">车盈宝</a></li>
		</ul>
		<ul>
			<li class="first">年化收益：</li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="21" name="year_rate">全部</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="22" name="year_rate">6.0%</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="23" name="year_rate">7.0%</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="24" name="year_rate">7.5%</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="25" name="year_rate">8.0%</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="25" name="year_rate">8.0%以上</a></li>
		</ul>
		<ul>
			<li class="first">项目期限：</li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="31">全部</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="32">15天以下</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="33">15-30天</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="34">30-180天</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="35">180-365天</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="36">一年以上</a></li>
		</ul>
		<ul>
			<li class="first">标的状态：</li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="41" name="status">全部</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="42" name="status">投标中</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="43" name="status">还款中</a></li>
			<li><a
				href="<%=basePath%>subject/likeshow"
				id="44" name="status">已完成</a></li>
		</ul>
	</div>
	<c:forEach items="${sublist}" var="sub">
	<ul class="tbList">
		<li class="first"><span class="ico zq"></span>
			<h2>
				<em>投</em>${sub[1]}
			</h2> <i></i></li>
		<li class="second">

			<div class="txt1">
				<h2>
					${sub[2]-1}<span style="font-size: 18px;">+1.0%</span>
				</h2>
				<p>年化收益</p>
			</div>

			<div class="txt2">
				<h2>${ sub[3]}</h2>
				<p>起购金额(元)</p>
			</div>

			<div class="txt2">
				<h2>${ sub[4]}天</h2>
				<p>投资期限</p>
			</div>
		</li>
		<li class="three"><a href="#1">企业担保</a><span>中国人保财险承保</span>
			<p>
				计息日期：当天投资，立即计息<br>已购人数：${sub[8]+sub[5] }人
			</p></li>
		<li class="four"></li>
		<li class="five"><a class="abtn"
			href="<%=basePath%>subject/purchase/${sub[0]}" target="myiframe">购买</a></li>
	</ul>
	</c:forEach>
	<div class="llpage">
		<div class="in">

			<a class="prev_page">上页</a> <a class="now">1</a> <a class="next_page"
				rel="next">下页</a>
		</div>
	</div>
</body>
</html>