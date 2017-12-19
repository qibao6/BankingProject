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

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="renderer" content="webkit">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="<%=basePath %>resources/sys/ying/iconfont.css">
        <link rel="stylesheet" href="<%=basePath %>resources/sys/style/bootstrap.css">
        <link rel="stylesheet" href="<%=basePath %>resources/sys/style/style.css">
        <script type="text/javascript" src="<%=basePath %>resources/sys/js/jquery.js"></script>
        <link href="<%=basePath %>resources/web/css/jw.css" rel="stylesheet">
        <title>后台首页</title>
    </head>
<body>
<div class="box-right-main">
     <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>账号详情</h2>
     
      <table class="table table-bordered tablebox">
	 	<tr style="text-align: center;background: #AFABAB;"><td colspan="4" style="padding: 10px;">账号信息</td>	</tr>
	 	<tr>
			<th width="10%">用户名</th>	
			<td width="30%">${m.names}</td>	 	
			<th width="10%">手机号</th>	
			<td width="30%">${m.mobilePhone}</td>	 	
	 	</tr>
	 	<tr>
			<th>真实姓名</th>	
			<td>${m.memberName}</td>	 	
			<th>身份证</th>	
			<td>${m.memberIdentity}</td>	 	
	 	</tr>
	 	<tr>
			<th>邀请码</th>	
			<td>${m.invitationcode}</td>	 	
			<th>被邀请码</th>	
			<td>${m.invitedcode}</td>	 	
	 	</tr>
	 	<tr>
			<th>添加时间</th>	
			<td><f:formatDate value="${m.createDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>	
			<td>&nbsp;</td>	
			<td>&nbsp;</td>	 	
	 	</tr>
	 </table>
     
      <table class="table table-bordered tablebox">
	 	<tr style="text-align: center;background: #AFABAB;"><td colspan="4" style="padding: 10px;">资金信息</td></tr>
	 	<tr>
			<th width="10%">可用余额</th>	
			<td width="30%">${ma.useableBalance}</td>	 	
			<th width="10%">冻结金额</th>	
			<td width="30%">${ma.imusealeBalance}</td>	 	
	 	</tr>
	 	<tr>
			<th>累计收益</th>	
			<td>${ma.totalProfit}</td>	 	
			<th>投资总额</th>	
			<td>${ma.investAmount}</td>	 	
	 	</tr>
	 	<tr>
			<th>红包金额</th>	
			<td>${ma.bonusAmount}</td>	
			<td>体验金</td>	
			<td>${ma.bbinAmount}</td>	 	
	 	</tr>
	 </table>
	 
	 <table class="table table-bordered tablebox">
	 <tr style="text-align: center;background: #AFABAB;"><td colspan="4" style="padding: 10px;">理财师信息</td></tr>
	 	<tr>
			<th width="10%">真实姓名</th>	
			<td width="30%">${fp.financialPlannerName}</td>
			<th width="10%">机构名称</th>	
			<td width="30%">${fp.orgname}</td>	 	
	 	</tr>
	 	<tr>
			<th>我的名片</th>	
			<td><a href="<%=basePath %>view/front/main.jsp" target="_black">查看</a></td>
			<th>邮寄地址</th>	
			<td>${fp.address}</td>	 	
	 	</tr>
	 	<tr>
			<th>添加时间</th>	
			<td><f:formatDate value="${fp.createDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
			<td>&nbsp;</td>	
			<td>&nbsp;</td>	
	 	</tr>
	 </table>
    

<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer1">
	<!-- 异步内容开始 -->
	 <table class="table table-bordered tablebox">
	 <tr style="text-align: center;background: #AFABAB;"><td colspan="7" style="padding: 10px;">投资记录</td></tr>
		<tr>
			<th width="5%">序号</th>
			<th width="15%">投资编号</th>
			<th width="15%">投资金额</th>
			<th width="15%">投资状态</th>
			<th width="15%">投资标的名称</th>
			<th width="15%">投资收益</th>
			<th width="15%">投资时间</th>
		</tr>
	</table>
</div>
<script type="text/javascript">
	function getJsonInfo1(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer1").empty();
			$(".ajaxContainer1").append(data);
		});
	}
</script>
<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer2">
	<!-- 异步内容开始 -->
	 <table class="table table-bordered tablebox">
	 <tr style="text-align: center;background: #AFABAB;"><td colspan="7" style="padding: 10px;">提现记录</td></tr>
		<tr>
			<th width="5%">序号</th>
			<th width="15%">提现编号</th>
			<th width="15%">提现金额</th>
			<th width="15%">提现状态</th>
			<th width="15%">提现银行</th>
			<th width="15%">提现卡号</th>
			<th width="15%">提现时间</th>
		</tr>
		<c:forEach items="${wr.getContent()}" var="wr">
		<tr>
			<td width="5%">${wr.mwrId}</td>
			<td width="15%">${wr.serialNumber}</td>
			<td width="15%">${wr.amount}</td>
			<td width="15%">
			<c:if test="${wr.status==0}"><font color="yellow">待审核</font></c:if>
			<c:if test="${wr.status==1}"><font color="blue">已打款</font></c:if>
			<c:if test="${wr.status==2}"><font color="green">打款中</font></c:if>
			<c:if test="${wr.status==3}"><font color="red">打款失败</font></c:if>
			</td>
			<td width="15%">${wr.bankName}</td>
			<td width="15%">${wr.bankCard}</td>
			<td width="15%"><f:formatDate value="${wr.updateDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
		</tr>
		</c:forEach>
		
	</table>
	
	<div class="llpage">
		<div class="in">
			<nav>
				<ul class="pagination">
						<li><a class="prev_page" href="<%= basePath%>sysmember/memberInfo?page=${wr.getNumber()>1?wr.getNumber():1}&&memberId=${m.memberId}">上页</a></li>
						
							<c:forEach begin="1" end="${wr.getTotalPages()}" var="v" >
							<li><a class="now" href="<%= basePath%>sysmember/memberInfo?page=${v}&&memberId=${m.memberId}">${v}</a></li>
							</c:forEach>
							
						<li><a class="next_page" rel="next" href="<%= basePath%>sysmember/memberInfo?page=${wr.getNumber()+1<wr.getTotalPages()?wr.getNumber()+1+1:wr.getTotalPages()}&&memberId=${m.memberId}">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
	
</div>
<script type="text/javascript">
	function getJsonInfo2(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer2").empty();
			$(".ajaxContainer2").append(data);
		});
	}
</script>
<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer3">
	<!-- 异步内容开始 -->
	 <table class="table table-bordered tablebox">
	 <tr style="text-align: center;background: #AFABAB;"><td colspan="7" style="padding: 10px;">充值记录</td></tr>
		<tr>
			<th width="5%">序号</th>
			<th width="15%">充值编号</th>
			<th width="15%">充值金额</th>
			<th width="15%">充值状态</th>
			<th width="15%">充值渠道</th>
			<th width="15%">充值渠道编号</th>
			<th width="15%">充值时间</th>
		</tr>
		<c:forEach items="${md.getContent()}" var="mds">
		<tr>
			<td width="5%">${mds.memberDepositRecordId}</td>
			<td width="15%">${mds.serialNumber}</td>
			<td width="15%">${mds.amount}</td>
			<td width="15%">
			<c:if test="${mds.status==0}"><font color="red">待付款</font></c:if>
			<c:if test="${mds.status==1}"><font color="blue">付款完成</font></c:if>
			</td>
			<td width="15%">${mds.payChannelName}</td>
			<td width="15%">${mds.payChannelOrderNo}</td>
			<td width="15%"><f:formatDate value="${mds.updateDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
		</tr>
		</c:forEach>
	</table>
	<div class="llpage">
		<div class="in">
			<nav>
				<ul class="pagination">
						<li><a class="prev_page" href="<%= basePath%>sysmember/memberInfo?page=${md.getNumber()>1?md.getNumber():1}&&memberId=${m.memberId}">上页</a></li>
						
							<c:forEach begin="1" end="${md.getTotalPages()}" var="v" >
							<li><a class="now" href="<%= basePath%>sysmember/memberInfo?page=${v}&&memberId=${m.memberId}">${v}</a></li>
							</c:forEach>
							
						<li><a class="next_page" rel="next" href="<%= basePath%>sysmember/memberInfo?page=${md.getNumber()+1<md.getTotalPages()?md.getNumber()+1+1:md.getTotalPages()}&&memberId=${m.memberId}">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
<script type="text/javascript">
	function getJsonInfo3(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer3").empty();
			$(".ajaxContainer3").append(data);
		});
	}
</script>
<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer">
	<!-- 异步内容开始 -->
	 <table class="table table-bordered tablebox">
	 <tr style="text-align: center;background: #AFABAB;"><td colspan="7" style="padding: 10px;">钱包记录</td></tr>
		<tr>
			<th width="5%">序号</th>
			<th width="15%">交易编号</th>
			<th width="15%">交易金额</th>
			<th width="15%">交易状态</th>
			<th width="15%">交易分类</th>
			<th width="15%">交易名称</th>
			<th width="15%">交易时间</th>
		</tr>
		<c:forEach items="${tr.getContent()}" var="tr">
		<tr>
			<td width="5%">${tr.mtrId}</td>
			<td width="15%">${tr.tradeNo}</td>
			<td width="15%">${tr.amount}</td>
			<td width="15%">
			<c:if test="${tr.tradeStatus==0}"><font color="red">待付款</font></c:if>
			<c:if test="${tr.tradeStatus==2}"><font color="blue">已付款</font></c:if>
			</td>
			<td width="15%">${tr.tradeType}</td>
			<td width="15%">${tr.tradeName}</td>
			<td width="15%"><f:formatDate value="${tr.updateDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
		</tr>
		</c:forEach>
	</table>
	
	<div class="llpage">
		<div class="in">
			<nav>
				<ul class="pagination">
						<li><a class="prev_page" href="<%= basePath%>sysmember/memberInfo?page=${tr.getNumber()>1?tr.getNumber():1}&&memberId=${m.memberId}">上页 </a></li>
							<c:forEach begin="1" end="${tr.getTotalPages()}" var="v" >
							<li><a class="now" href="<%= basePath%>sysmember/memberInfo?page=${v}&&memberId=${m.memberId}">${v}</a></li>
							</c:forEach>
							
						<li><a class="next_page" rel="next" href="<%= basePath%>sysmember/memberInfo?page=${tr.getNumber()+1<tr.getTotalPages()?tr.getNumber()+1+1:tr.getTotalPages()}&&memberId=${m.memberId}">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
	
</div>
<script type="text/javascript">
	function getJsonInfo(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer").empty();
			$(".ajaxContainer").append(data);
		});
	}
</script></div>
</body>
</html>