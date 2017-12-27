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
                <a class="select" href="javascript:;">体验金记录</a>
            </div>
            <div id="conBox">
                <div class="box" style="display:block">
                    <div class="remind"><h4><strong><span style="color:#827E76">体验金余额(元)：</span><span
                            style="color:#9d8440">0</span>&nbsp;&nbsp;&nbsp;&nbsp;
                        </strong></h4></div>

                    <div>
                        <table class="tzlist" width="100%" border="1" bordercolor="#e9e9e9" cellspacing="0"
                               cellpadding="0">
                            <tr>
                                <td>标的名称</td>
                                <td style="color:#9d8440;">有缘固收类1</td>
                                <td>状态</td>
                                <td style="color:#9d8440;">持有中</td>
                            </tr>
                            <tr>
                                <td>投资金额</td>
                                <td style="color:#9d8440;">￥8,888.00</td>
                                <td>期限</td>
                                <td style="color:#9d8440;">6天</td>
                            </tr>
                            <tr>
                                <td>收益方式</td>
                                <td style="color:#9d8440;">一次性还本付息</td>
                                <td>年化收益率</td>
                                <td style="color:#9d8440;">7%</td>
                            </tr>
                            <tr>
                                <td>计息日</td>
                                <td style="color:#9d8440;">2016-01-22</td>
                                <td>预期收益</td>
                                <td style="color:#9d8440;">￥10.23</td>
                            </tr>
                            <tr>
                                <td>结束日</td>
                                <td style="color:#9d8440;">2016-01-28</td>
                                <td>已获收益</td>
                                <td style="color:#9d8440;">0元</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>