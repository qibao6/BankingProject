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
			<a class="select" href="javascript:;">实名认证</a>
		</div>
		<div id="conBox">
			<div class="box" style="display: block">
				<div class="myBankCards clearfix">
					<div class="title"><font size="5">绑定身份证号</font></div><br/>
					<form action="<%=basePath%>hyzx/${memberId }/shiming" method="post">
					<table class="txTable" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td align="right">身份证：</td>
							<td><input type="text" class="tytxt" id="username"
								name="memberIdentity" placeholder="身份证号"></td>
							<td style="color: #ff6a00">实名信息提交后不可修改，请务必认真填写真实资料</td>
						</tr>
						<tr>
                            <td>&nbsp;</td>
                            <td><button type="submit" class="tybutton" id="buttonsubmit">保存</button></td>
                            <td></td>
                        </tr>
					</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>