<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="renderer" content="webkit">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="<%=basePath%>resources/sys/ying/iconfont.css">
        <link rel="stylesheet" href="<%=basePath%>resources/sys/style/bootstrap.css">
        <link rel="stylesheet" href="<%=basePath%>resources/sys/style/style.css">
        <script type="text/javascript" src="<%=basePath%>resources/sys/js/jquery.js"></script>
  <title>后台首页</title>
</head>
<body>

                     <div class="box-right-main">
                        <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>付息计划</h2>

                      <div class="tablelist">
                        <table class="table tabletop">
                        <tr>
                        <td style="padding-left:30px">标的名称：${su[0]} 
                        				&nbsp; &nbsp; &nbsp; &nbsp;  标的期限：${su[1]}天
                        				&nbsp; &nbsp; &nbsp; &nbsp;  年化收益率：${su[2]}%</td>
                        </tr>     
                        </table>
                        <table class="table table-bordered tablebox">
                         
                          <tr class="text-center" bgcolor="#f7f7f7">
                          <td>序号</td>
                          <td>流水号</td>
                          <td>投资人手机号</td>
                          <td>投资人姓名</td>
                          <td>投资人身份证</td>
                          <td>投资金额</td>
                          <td>还款利息+本金=本息</td>
                          <td>投资时间</td>
                          <td>还款时间</td>
                          <td>还款状态</td>
                          <td>操作</td>
                          </tr>
                    <c:forEach items="${list}" var="a">
                      <tr class="text-center">
                        <td>${a[0]}</td>
                        <td>${a[1]}</td>
                        <td>${a[2]}</td>
                        <td>${a[3]}</td>
                        <td>${a[4]}</td>
                        <td>￥${a[5]}元</td>
                        <td><span style="color: red;">${a[6]}</span>+
                        	<span style="color: red;">${a[5]}</span>=
                        	<span style="color: blue;">￥${a[6]+a[5]}</span>元
                        </td>
                        <td><f:formatDate value="${a[7]}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                        <td><f:formatDate value="${a[8]}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                        <td>
                        <c:if test="${a[9]==0}"><span style="color: blue;">已还款</span></c:if>
                        <c:if test="${a[9]==1}"><span style="color: red;">待还款</span></c:if>
                        </td>
                        <td>
                        <c:if test="${a[9]==0}"><a href="javascript:" class="btn btn-primary btn-sm" style="background-color: #8393A1;">已还款</a></c:if>
                        <c:if test="${a[9]==1}"><a href="<%=basePath%>sysmember/paymentBbin?id=16" class="btn btn-primary btn-sm">立即还款</a></c:if>
                        	
                        </td>
                    </tr>
                    </c:forEach>
            </table>
	
	
	<table class="table table-bordered tablebox">
	<div class="llpage">
		<div class="in">
			<nav>
				<span class="count">第&nbsp;<b>${page}</b>&nbsp;页，&nbsp;共&nbsp;<b>${pages}</b>&nbsp;页</span>
				<ul class="pagination">
						<li><a class="prev_page" href="<%=basePath%>sysmember/paymentContent?subjectId=${subjectId}&&page=${page==1?page:page-1}">上页</a></li>
							<c:forEach begin="1" end="${pages}" var="v">
							<li><a class="now" href="<%=basePath%>sysmember/paymentContent?subjectId=${subjectId}&&page=${v}" >${v}</a></li>
							</c:forEach>
						<li><a class="next_page" rel="next" href="<%=basePath%>sysmember/paymentContent?subjectId=${subjectId}&&page=${page==pages?pages:page+1}">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
 </table>
         </div>

         <!-- 内容结束 -->

  </div>
<!-- 容器结束 -->
</body>
</html>