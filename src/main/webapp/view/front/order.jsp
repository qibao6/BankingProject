<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<script type="text/javascript">
    $(function(){
        function showIn(url){
            var info="<div class='mydig'><div class='bg'></div><div class='imgbox'><a href="+url+"></a></div></div>";
            $('body').append(info);
        }
            if (1!=null&&1==0){
                showIn("/winplus/account/bbinInfo/getBbinInfo");
            }

    });

</script>    <div class="sdbanner probanner"></div>
    <div class="proMain">
    	<div class="orderBox">
        	<div class="title"><h2><span class="iconfont">&#xe606;</span>订单详情</h2></div>
            <div class="order">
            	<img src="<%=basePath%>resources/web/images/orderPic.jpg">
            	
            	<table width="100%" border="0" cellspacing="0" cellpadding="0">
                  
                   <tr>
                    <td width="54%"  align="right"><span>产品名称：&nbsp;</span></td>
                    <td>${subject.subjectName}</td>
                  </tr>
                  <tr>
                    <td align="right"><span>投资金额：&nbsp;</span></td>
                    <td><b>${subjectOrderRecord.amount}</b>元</td>
                  </tr>
                
                  <tr>
                    <td align="right"><span>年化收益率：&nbsp;</span></td>
                    <td><b>${subject.yearRate}</b>%</td>
                  </tr>
                  <tr>
                    <td align="right"><span>借款周期：&nbsp;</span></td>
                    <td><b>${subject.period}</b>天 </td>
                  </tr>
                </table>
            </div>
            <table class="orderInfo" width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><p>订单编号：<b>${stime}</b></p><p>订单时间：<f:formatDate value="${subjectOrderRecord.createDate}" pattern="yyyy年MM月dd日  hh时mm分"/></p></td>
                <td align="right">
               <input type="hidden" name="amount" value="${subjectOrderRecord.amount}">
               <input type="hidden" name="dealIp" value="${stime}">
             
                	<div class="money">
                    	<b>￥${subjectOrderRecord.amount}</b>
                        <span>应付总金额(元)</span>
                    </div>
                    </td>
                  <td width="150px">
					<form action="<%=basePath%>subject/orderensure/${stime}" method="post" class="hiddenForm">
					  <input type="hidden" name="subjectId" value="${subject.subjectId}"> 
					  <input type="hidden" name="amount" value="${subjectOrderRecord.amount}">
                        <input type="hidden" name="bbinStatus" value="0">
                		<button class="tybutton" type="submit">立即付款</button>
					</form>
                </td>
              </tr>
            </table>
        </div>
    </div>
    <script type="text/javascript">
    
    	$(function(){
    		var bbinStatus=false;
    		$(".tybutton").click(function () {
    		if(bbinStatus==false){
    			alert("购买成功");
    			
    		}
    		});
    	});
    		
    
    
    </script>
</body>
</html>