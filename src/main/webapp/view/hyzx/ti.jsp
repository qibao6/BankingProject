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
<title>Insert title here</title>
	<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">
	<link href="<%=basePath %>resources/web/css/common.css" rel="stylesheet">
	<link href="<%=basePath %>resources/web/css/jw.css" rel="stylesheet">
    <link href="<%=basePath %>resources/web/font/iconfont.css" rel="stylesheet">
    <script src="<%=basePath %>resources/web/js/jquery.js"></script>
    <script src="<%=basePath %>resources/web/js/bootstrap.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/web/location/area.js"></script>
	<script type="text/javascript" src="<%=basePath %>resources/web/location/location.js"></script>
    <script>
	$(function(){
		$(".picTab a").click(function(){
			if(!$(this).hasClass("select")){
				var num=$(this).index();
				$(this).addClass("select").siblings().removeClass("select");
				$(".txtCon p").eq(num).show().siblings().hide();
			}
		})
		$(".tbConBox .tab a").click(function(){
			if(!$(this).hasClass("select")){
				var num=$(this).index();
				$(this).addClass("select").siblings().removeClass("select");
				$("#conBox .box").eq(num).show().siblings().hide();
			}
		})
	})
//	$(document).ready(function() {
//		showLocation();
//	});
	var baseContext = "/winplus";
    </script>
    <style>
.clearfix:after {
	content: '\0020';
	display: block;
	height: 0;
	clear: both;
}

.clearfix {
	*zoom: 1;
}

#conBox .box .title {
	font-weight: bold;
	font-size: 20px;
	padding-top: 20px;
	padding-left: 30px;
	margin-bottom: 40px;
}

/*.myBankCards {*/
	/**/
/*}*/

/*.myBankCards .card {*/
	/*float: left;*/
	/*width: 180px;*/
	/*border: 1px solid #eaeaea;*/
	/*padding: 5px;*/
	/*position: relative;*/
	/*margin-left: 35px;*/
	/*margin-bottom: 20px;*/
/*}*/

/*.myBankCards .card .banklogo {*/
	/*width: 150px;*/
	/*height: 45px;*/
/*}*/

/*.myBankCards .card img {*/
	/*width: 150px;*/
	/*margin-left: 10px;*/
/*}*/

/*.myBankCards .card .cardno {*/
	/*margin-top: 5px;*/
	/*margin-left: 15px;*/
/*}*/

/*.myBankCards .card .btns {*/
	/*position: absolute;*/
	/*right: 1px;*/
	/*bottom: 1px;*/
	/*display: none;*/
/*}*/

/*.myBankCards .card .btns a {*/
	/*background: #d7d7d7;*/
	/*color: #9b8888;*/
	/*text-decoration: none;*/
/*}*/

.error {
    background-color: #f2dede;
    border: 1px solid #fbefd6;
    color: #b94a48;
    display: none;
    height: 36px;
    line-height: 36px;
    padding-left: 20px;
    text-align: left;
    text-shadow: 0 1px 0 rgba(255, 255, 255, 0.5);
    width: 236px;
}
</style>
</head>
<body>
	<div class="tbConBox">
                <div class="tab">
                    <a class="select" href="javascript:;">提款记录</a>
                    <a href="javascript:;">我要提款</a>                    
                </div>
                <div id="conBox">
                    <div class="box" style="display:block">
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
	<form name="paform" action="<%=basePath %>hyzx/${memberId}/ti" method="post">
		<input type="hidden" id="page" name="page" />
	</form>
	<table border="0" height="250px"><tr><td></td></tr></table>
                    </div>
                    <div class="box">                    	
	<script type="text/javascript">
		function tikuan() {
			var amount=$("#withdrawAmount").val();
			var withdrawPassword=$("#withdrawPW").val();
			var memberId=$("#memberId").val();
			var base="/BankingProject";
			$.ajax({
				 type : "POST",
				 dataType : "json", 
				 url:base+'/hyzx/'+memberId+'/toti',
				 data:{
					 "amount":amount,
					 "pwd":withdrawPassword
				 },
				 success:function(data){
					 if(data.code == 0){
						 document.tikuanform.submit();
						/*  window.location.href=base+'/hyzx/'+memberId+'/totikuan'; */
					 }else{
						 $(".error").html(data.msg).show();
					 }
				 }
			 });
			
		}
	</script>


<meta name="keywords" content="盈+，盈，社区金融，O2O社区金融，社区金融O2O，O2O，互联网+社区金融，O2O连锁，社区门店，首家社区金融，社区金融服务，综合金融，互联网金融，体验中心，普惠金融，金融创新，社区化，普惠化，全渠道化，互联网线上平台，O2O交易，全国首家，盈十，金融衍生品，固收类理财，私募基金，股权基金，股指期货，玩转股指，商品期货，国际期货，外盘，A50，沪深300，中证500，上证50" />
<meta name="description" content="盈+——全国首家互联网金融交流体验中心，与您共盈，给财富做加法。" />
<link href="<%=basePath %>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<div class="ajaxContainer">
<form name="tikuanform" action="<%=basePath %>hyzx/${memberId }/totikuan" method="post">
                        <table class="txTable" width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="140" align="right">账户余额：</td>
                            <td><strong>${memberAccount.useableBalance}</strong>元</td>
                          </tr>
							<tr>
								<td align="right"> 提款银行卡： </td>
								<td><strong>${mb.memberBankcardsType }-${mb.cardNo }</strong>
									<input type="hidden" name="memberBankcardsId" value="${mb.memberBankcardsId}"></td>
							</tr>
                          <tr>
                            <td align="right">提款金额：</td>
                            <td><input class="tytxt" type="text" name="amount" id="withdrawAmount" style="width:250px"></td>
                          </tr>

                          <tr>
                            <td align="right"> 提款密码：</td>
                            <td>
                            <input type="password" class="tytxt" name="withdrawPassword" id="withdrawPW" style="display: inline;width:250px;">
                             
                            </td>
                          </tr>
                          <tr>
                            <td>&nbsp;</td>
                            <td><button type="button" class="tybutton" id="withdrawConfirm" onclick="tikuan();">提交</button></td>
                          </tr>
                          <tr height="60px"><th colspan="2"><p class="error" ></p></th></tr>
                        </table>
                        <input type="hidden" id="memberId" value="${memberId }" />
                        </form>
</div>
<script type="text/javascript">
	function page(pa) {
		$("#page").val(pa);
		document.paform.submit();
	}
</script>
<script type="text/javascript">
	function getJsonInfo(url) {
		$.get(url, 'json', function(data) {
			$(".ajaxContainer").empty();
			$(".ajaxContainer").append(data);
		});
	}
</script>                    </div>
                </div>
            </div>
</body>
</html>