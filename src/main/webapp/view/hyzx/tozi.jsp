<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
	<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">
    <link href="<%=basePath%>resources/web/font/iconfont.css" rel="stylesheet">
    <script src="<%=basePath%>resources/web/js/jquery.js"></script>
    <script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="tbConBox">
                <div class="tab">
                    <a class="select" href="javascript:;">投资记录</a>
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">

<div class="ajaxContainer">
	<!-- 异步内容开始 -->
	<table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0" cellpadding="0">
		<tr>
			<th>订单编号</th>
			<th>标的名称</th>
			<th>金额</th>
			<th>预期收益</th>
			<th>状态</th>
			<th>购买时间</th>
		</tr>
		<c:forEach items="${sPage.getContent()}" var="spr">
			<tr>
				<td>${spr.serialNumber }</td>
				<td><font color="#a58b48"></font></td>
				<td><font color="#ff503f">￥<f:formatNumber pattern="0.00">${spr.amount }</f:formatNumber></font></td>
				<td>￥<f:formatNumber pattern="0.00">${spr.interest }</f:formatNumber></td>
				<td>${spr.ispayment==1?"已还款":"未还款" }</td>
				<td><f:formatDate value="${spr.createDate }" pattern="yyyy-MM-dd" /></td>
			</tr>
		</c:forEach>
		<tr><th colspan="6">
			第${sPage.getNumber()+1}页/共${sPage.getTotalPages()}页
			<a href="javascript:page(1);">首页</a>
		    <a href="javascript:page(${sPage.getNumber()+1>1?sPage.getNumber():1});">上一页</a>
		    <a href="javascript:page(${sPage.getNumber()+1<sPage.getTotalPages()?sPage.getNumber()+2:sPage.getTotalPages()});">下一页</a>
		    <a href="javascript:page(${sPage.getTotalPages()});">尾页</a>
		</th></tr>	
	</table>
	<div class="listCount">总计<font color="#ff503f">${sPage.getTotalElements() }</font>笔</div>
	<form name="paform" action="<%=basePath %>hyzx/${memberId }/tozi" method="post">
		<input type="hidden" id="page" name="page" />
		<input type="hidden" id="page2" name="page2" />
	</form>
<script type="text/javascript">
	function page(pa) {
		$("#page").val(pa);
		document.paform.submit();
	}
	function page2(pa) {
		$("#page2").val(pa);
		document.paform.submit();
	}
</script>
</div>
<!-- <script type="text/javascript">
	function getJsonInfo(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer").empty();
			$(".ajaxContainer").append(data);
		});
	}
</script>  -->                   </div>
                </div>
                 <div class="tab">
                    <a class="select" href="javascript:;">预约记录</a>
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">
<div class="ajaxContainer2">
	<!-- 异步内容开始 -->
	<table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0" cellpadding="0">
		<tr>
			<th>标的名称</th>
			<th>金额</th>
			<th>预期收益</th>
			<th>状态</th>
			<th>预约时间</th>
			<th>下载</th>
		</tr>
		<c:forEach items="${fPage.getContent() }" var="fps">
			<tr>
				<td><font color="#a58b48">${fps.productId.financeProductFundsName }</font></td>
				<td><font color="#ff503f">￥<f:formatNumber pattern="0.00">${fps.amount }</f:formatNumber></font></td>
				<td>￥<f:formatNumber pattern="0.00">${fps.interest }</f:formatNumber></td>
				<td>
					<c:if test="${fps.status==0 }">签署拍照</c:if>
					<c:if test="${fps.status==1 }">已签约</c:if>
					<c:if test="${fps.status==2 }">审核中</c:if>
					<c:if test="${fps.status==3 }">签署失败</c:if>
				</td>
				<td>${fps.createDate }</td>
				<td><a href="/winplus/upload/subject/file/20160307/20160307170911553839(Yes).pdf" target="_black">查看下载</a></td>
			</tr>
		</c:forEach>
		<tr><th colspan="6">
			第${fPage.getNumber()+1}页/共${fPage.getTotalPages()}页
			<a href="javascript:page2(1);">首页</a>
		    <a href="javascript:page2(${fPage.getNumber()+1>1?fPage.getNumber():1});">上一页</a>
		    <a href="javascript:page2(${fPage.getNumber()+1<fPage.getTotalPages()?fPage.getNumber()+2:fPage.getTotalPages()});">下一页</a>
		    <a href="javascript:page2(${fPage.getTotalPages()});">尾页</a>
		</th></tr>
		
	</table>
	<div class="listCount">总计<font color="#ff503f">${fPage.getTotalElements() }</font>笔</div>
	
</div>
</body>
</html>