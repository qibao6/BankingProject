<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

    <head>
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
                        <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>邀请奖励</h2>

                      <div class="tablelist">
                      	<form action="<%=basePath%>sysmember/inviteRewards" method="post" id="form1" name="form1">
                        	<input type="hidden" name="page" id="page">
                        <table class="table tabletop">
                        <tr>
                         <td style="width:90px;padding-left:20px">姓名：</td>
                        <td style="width:140px"><input type="text" class="form-control" name="memberName" placeholder="姓名" value="${memberName}"></td>
                        <td style="width:100px;padding-left:20px">手机号：</td>
                        <td><input type="text"  name="mobilePhone" class="form-control" placeholder="手机号" value="${mobilePhone}"></td>
                        <td style="width:90px;padding-left:20px">邀请码：</td>
                        <td style="width:140px"><input type="text" class="form-control" name="invitationcode" placeholder="邀请码" value="${invitationcode}"></td>
                         <td style="width:100px;padding-left:20px">被邀请码：</td>
                        <td><input type="text"  name="invitedcode" class="form-control" placeholder="被邀请码" value="${invitedcode}"></td>
                       <td class="pull-right" style="padding-right:20px">
                         <button type="submit" class="btn btn-primary btn-sm">查询</button></td>
	                    <td><button type="button" class="btn btn-primary btn-sm" onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">重置</button></td>
	                 	 </tr>    
                        </table>
                        </form>
                        <table class="table table-bordered tablebox">
                          <tr class="text-center" bgcolor="#f7f7f7">
                          <td>序号</td>
                          <td>手机号</td>
                          <td>姓名</td>
                          <td>邀请码</td>
                          <td>被邀请码</td>
                          <td>投资金额</td>
                          <td>是否已注册奖励</td>
                          <td>是否已投资奖励</td>
                          <td>注册时间</td>
                          <td>操作</td>
                          </tr>
                          <c:forEach items="${olist}" var="o">
                          <tr class="text-center">
                            <td>${o[1]}</td>
                            <td>${o[2]}</td>
                            <td>${o[3]}</td>
                            <td>${o[4]}</td>
                            <td>${o[5]}</td>
                            <td>${o[6]}</td>
                            <td>
                            <c:if test="${o[7]==0 && o[8]==0}"><font color="red">否</font></c:if>
                            <c:if test="${o[7]==0 && o[8]==1}"><font color="blue">是</font></c:if>
                            <c:if test="${o[7]==1 && o[8]==0}"><font color="red">否</font></c:if>
                            <c:if test="${o[7]==1 && o[8]==1}"><font color="blue">是</font></c:if>
                          	</td>
                          	
                            <td>
                            <c:if test="${o[7]==1 && o[8]==0}"><font color="red">否</font></c:if>
                            <c:if test="${o[7]==1 && o[8]==1}"><font color="blue">是</font></c:if>
                            <c:if test="${o[7]==0 && o[8]==0}"><font color="red">否</font></c:if>
                            <c:if test="${o[7]==0 && o[8]==1}"><font color="blue">是</font></c:if>
							</td>
							
                            <td><f:formatDate value="${o[9]}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                            
                            <td>
                            <c:if test="${o[7]==0 && o[8]==0}"><a class="btn btn-primary btn-sm" href="javascript:" onclick="award(${o[1]},${o[10]},${o[11]})">注册奖励</a></c:if>
                            <c:if test="${o[7]==0 && o[8]==1}"><font color="blue">注册已奖励</font></c:if>
                            <c:if test="${o[7]==1}"><font color="blue">注册不能奖励 |</font></c:if>		
                            <c:if test="${o[7]==0}"><font color="blue">|投资金额未达到 |</font></c:if>	
                            <a class="btn btn-primary btn-sm" href="<%=basePath%>sysmember/inviteRewardsRecord?awardRecordsId=${o[1]}">奖励记录</a>
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
						<li><a class="prev_page" href="javascript:pagerequest(${page==1?page:page-1})">上页</a></li>
							<c:forEach begin="1" end="${pages}" var="v">
							<li><a class="now" href="javascript:pagerequest(${v})" >${v}</a></li>
							</c:forEach>
						<li><a class="next_page" rel="next" href="javascript:pagerequest(${page==pages?pages:page+1});">下页</a></li>
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

<script type="text/javascript">
 function award(tid,memberAccountId,amount){
		location.href="<%=basePath%>sysmember/awards?awardRecordsId="+tid+"&&memberAccountId="+memberAccountId+"&&amount="+amount;
} 
function pagerequest(page){
		document.getElementById("page").value=page;
		document.form1.submit();
}
</script>
</html>