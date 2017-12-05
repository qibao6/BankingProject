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
<link href="<%=basePath%>/resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<link href="<%=basePath%>/resources/web/font/iconfont.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>/resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>/resources/web/css/jw.css" rel="stylesheet">

<script src="<%=basePath%>/resources/web/js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>/resources/web/layer/layer.js"></script>
<script src="<%=basePath%>/resources/web/echart/dist/echarts.js"></script></head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${sublist}" var="sub">
				<ul class="tbList">
						<li class="first">
									<span class="ico zq"></span>
							<h2><em>投</em>${sub[0]}</h2>
							<i></i>
						</li>
						<li class="second">					
							
							<div class="txt1">
								<h2>${sub[4]-1}<span style="font-size:18px;">+1.0%</span></h2>
								<p>年化收益</p>
							</div>
							
							<div class="txt2">
								<h2>￥${sub[1]}</h2>
								<p>起购金额(元)</p>
							</div>
							
							<div class="txt2">
								<h2>${sub[2]}天</h2>
								<p>投资期限</p>
							</div>
						</li>
						<li class="three">
								<a href="#1">企业担保</a><span>中国人保财险承保</span>
								<p>计息日期：当天投资，立即计息<br>已购人数：${sub[4]-sub[5]}人</p>
						</li>
						<li class="four">
								
						</li>
						<li class="five">
							<a class="abtn" href="/winplus/subject/subjectContent/1638">购买</a>
						</li>
					</ul>

</c:forEach>
	
	
</body>
</html>