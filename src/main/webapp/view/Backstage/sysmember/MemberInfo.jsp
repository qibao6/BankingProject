<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<td>${m.invitedCode}</td>	 	
	 	</tr>
	 	<tr>
			<th>添加时间</th>	
			<td>${m.createDate}</td>	
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
			<td>${fp.createDate}</td>
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
		
	</table>
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
		<c:forEach items="${md}" var="mds">
		<tr>
			<td width="5%">${mds.memberDepositRecordId}</td>
			<td width="15%">${mds.serialNumber}</td>
			<td width="15%">${mds.amount}</td>
			<td width="15%">${mds.status==0?"待付款":"付款完成"}</td>
			<td width="15%">${mds.payChannelName}</td>
			<td width="15%">${mds.payChannelOrderNo}</td>
			<td width="15%">${mds.createDate}</td>
		</tr>
		</c:forEach>
	</table>
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
		
	</table>
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