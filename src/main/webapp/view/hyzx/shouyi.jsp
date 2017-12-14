<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://www.ying158.com/images/icon.ico" type="image/x-icon"
	rel="shortcut icon">
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/font/iconfont.css"
	rel="stylesheet">
<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="tbConBox">
		<div class="tab">
			<a class="select" href="javascript:;">收益记录</a>
		</div>
		<div id="conBox">
			<div class="box" style="display: block">

				<div class="ajaxContainer">
					<table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9"
						cellspacing="0" cellpadding="0">
						<tr>
							<th width="20%">时间</th>
							<th width="30%">订单号</th>
							<th width="20%">金额</th>
							<th width="20%">备注</th>
						</tr>
						<tr>
							<td>2017-12-07</td>
							<td>TZSY201712081207254377</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>有缘固收类1收益</td>
						</tr>
						<tr>
							<td>2016-03-23</td>
							<td>TZSY201603241205079151</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>有缘固收类1收益</td>
						</tr>
						<tr>
							<td>2016-03-11</td>
							<td>TZSY201603121205016705</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>有缘固收类1收益</td>
						</tr>
						<tr>
							<td>2016-03-09</td>
							<td>TZSY201603101205013783</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>有缘固收类1收益</td>
						</tr>
						<tr>
							<td>2016-03-07</td>
							<td>TZSY201603081205001069</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>理财宝一号11收益</td>
						</tr>
						<tr>
							<td>2016-03-05</td>
							<td>TZSY201603061205007493</td>
							<td><font color="#ff503f">￥0.0863</font></td>
							<td>有缘固收类1收益</td>
						</tr>
						<tr>
							<td>2016-03-05</td>
							<td>TZSY201603061205003219</td>
							<td><font color="#ff503f">￥0.0192</font></td>
							<td>理财宝一号11收益</td>
						</tr>
						<tr>
							<td>2016-03-03</td>
							<td>TZSY201603041205006016</td>
							<td><font color="#ff503f">￥0.0863</font></td>
							<td>有缘固收类1收益</td>
						</tr>
					</table>


					<div class="llpage">
						<div class="in">

							<a class="prev_page">上页</a> <a
								href="javascript:getJsonInfo('<%=basePath%>account/trades/retriveProfitRecordJson?page=2')"
								class="next_page" rel="next">下页</a>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>