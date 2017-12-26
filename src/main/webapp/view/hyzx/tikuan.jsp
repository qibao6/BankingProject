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
                    <a class="select" href="javascript:;">提款记录</a>
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">

<div class="ajaxContainer">
	<table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0" cellpadding="0">
		<tr>
			<th width="20%">时间</th>
			<th width="30%">订单号</th>
			<th width="20%">金额</th>
			<th width="10%">状态</th>
		</tr>
		<c:forEach items="${mPage.getContent() }" var="mwr">
			<tr>
				<td><f:formatDate value="${mwr.createDate }" pattern="yyyy-MM-dd" /></td>
				<td>${mwr.serialNumber }</td>
				<td><font color="#ff503f">￥${mwr.amount }</font></td>
				<td>
					<c:if test="${mwr.status==0 }">待审核</c:if>
					<c:if test="${mwr.status==1 }">已打款</c:if>
					<c:if test="${mwr.status==2 }">打款中</c:if>
					<c:if test="${mwr.status==3 }">打款失败</c:if>
				</td>
			</tr>
		</c:forEach>
		<tr><th colspan="4">
			第${mPage.getNumber()+1}页/共${mPage.getTotalPages()}页
			<a href="javascript:page(1);">首页</a>
	        <a href="javascript:page(${mPage.getNumber()+1>1?mPage.getNumber():1});">上一页</a>
	        <a href="javascript:page(${mPage.getNumber()+1<mPage.getTotalPages()?mPage.getNumber()+2:mPage.getTotalPages()});">下一页</a>
	        <a href="javascript:page(${mPage.getTotalPages()});">尾页</a>
		</th></tr>
	</table>

</div>                         
                    </div>
                </div>
            </div>
	<form name="paform" action="<%=basePath %>hyzx/${memberId}/tikuan" method="post">
		<input type="hidden" id="page" name="page" />
	</form>
</body>
<script type="text/javascript">
	function page(pa) {
		$("#page").val(pa);
		document.paform.submit();
	}
</script>
</html>