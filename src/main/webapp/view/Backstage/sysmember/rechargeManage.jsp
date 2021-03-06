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

    <link rel="stylesheet" href="<%=basePath%>resources/date/bootstrap-datetimepicker.min.css">
    <script type="text/javascript" src="<%=basePath%>resources/date/bootstrap-datetimepicker.js"></script>
    <script type="text/javascript" src="<%=basePath%>resources/date/bootstrap-datetimepicker.zh-CN.js"></script>

    <title>后台首页</title>
</head>
<body>

<div class="box-right-main">
    <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>充值管理</h2>

    <div class="tablelist">
        <form action="<%=basePath%>sysmember/rechargeManage" method="post" id="form1" name="form1">
            	<input type="hidden" name="page" id="page">
            <table class="table tabletop">
                <tr>
                    <td style="width:110px;padding-left:30px">订单编号：</td>
                    <td style="width:180px"><input type="text" class="form-control" name="serialNumber"
                                                   placeholder="订单编号" value="${mdr.serialNumber}"></td>
                    <td style="width:110px;padding-left:30px">手机号：</td>
                    <td style="width:180px"><input type="text" class="form-control" name="members.mobilePhone" placeholder="手机号"
                                                   value="${mdr.members.mobilePhone}"></td>
                    <td style="width:90px">订单状态：</td>
                    <td style="width:140px"><select name="status" class="form-control" style="width:135px;height:32px"
                                                    id="status">
		                   		<option value="" >全部</option>
		                        <option value="0" ${mdr.status==0?"selected='selected'":""}>充值失败</option>
		                        <option value="1" ${mdr.status==1?"selected='selected'":""}>充值成功</option>
                    </select></td>
                    <td style="width:110px;padding-left:30px">富友订单：</td>
                    <td style="width:180px"><input type="text" class="form-control" name="payChannelOrderNo"
                                                   placeholder="富友订单" value="${mdr.payChannelOrderNo}"></td>
                   
                    <td class="pull-right" style="padding-right:30px">
                        <button type="submit" class="btn btn-primary btn-sm">查询</button>
                    </td>
                    <td>
                        <button type="button" class="btn btn-primary btn-sm"
                                onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">
                         			   重置
                        </button>
                    </td>
                </tr>
            </table>
        </form>
        <table class="table table-bordered tablebox">

            <tr class="text-center" bgcolor="#f7f7f7">
                <td>序号</td>
                <td>订单编号</td>
                <td>手机号</td>
                <td>订单金额</td>
                <td>订单状态</td>
                <td>充值渠道</td>
                <td>富友手机充值订单</td>
                <td>订单时间</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${listd.getContent()}" var="c">
            <tr class="text-center">
                <td>${c.memberDepositRecordId}</td>
                <td>${c.serialNumber}</td>
                <td>${c.members.mobilePhone}</td>
                <td>${c.amount}</td>
                <td>
                  <c:if test="${c.status==0}"><font color="red">充值失败</font></c:if>
				  <c:if test="${c.status==1}"><font color="blue">充值成功</font></c:if>
                </td>
                <td>${c.payChannelName}</td>
                <td>${c.payChannelOrderNo}</td>
                <td><f:formatDate value="${c.createDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                <td>
                            <a class="btn btn-primary btn-sm" href="<%=basePath%>sysmember/rechargeManage">更新订单</a>
                </td>
            </tr>
            </c:forEach>
        </table>
	
<table class="table table-bordered tablebox">
	<div class="llpage">
		<div class="in">
			<nav>
				<span class="count">第&nbsp;<b>${listd.getNumber()+1}</b>&nbsp;页，&nbsp;共&nbsp;<b>${listd.getTotalPages()}</b>&nbsp;页</span>
				<ul class="pagination">
						<li><a class="prev_page" href="javascript:pagerequest(${listd.getNumber()>1?listd.getNumber():1})">上页</a></li>
							<c:forEach begin="1" end="${listd.getTotalPages()}" var="v">
							<li><a class="now" href="javascript:pagerequest(${v})" >${v}</a></li>
							</c:forEach>
						<li><a class="next_page" rel="next" href="javascript:pagerequest(${listd.getNumber()+1<listd.getTotalPages()?listd.getNumber()+1+1:listd.getTotalPages()});">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
 </table>

    </div>

    <!-- 内容结束 -->

</div>
<!-- 容器结束 -->

<script type="text/javascript">
    
    function pagerequest(page){
		document.getElementById("page").value=page;
		document.form1.submit();
	}
</script>
</body>
</html>