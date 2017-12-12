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
<link href="<%= basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="renderer" content="webkit">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="<%= basePath%>resources/sys/ying/iconfont.css">
        <link rel="stylesheet" href="<%= basePath%>resources/sys/style/bootstrap.css">
        <link rel="stylesheet" href="<%= basePath%>resources/sys/style/style.css">
        <script type="text/javascript" src="<%= basePath%>resources/sys/js/jquery.js"></script>
         <link rel="stylesheet" href="<%= basePath%>resources/date/bootstrap-datetimepicker.min.css">
		<script type="text/javascript" src="<%= basePath%>resources/date/bootstrap-datetimepicker.js"></script>
		<script type="text/javascript" src="<%= basePath%>resources/date/bootstrap-datetimepicker.zh-CN.js"></script>
        <title>后台首页</title>
    </head>
<body>

                     <div class="box-right-main">
                        <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>绑卡管理</h2>

                      <div class="tablelist">
                      <form action="<%= basePath%>sysmember/dahua" method="post" id="form1">
                        <table class="table tabletop">
                        <tr>
                        <td style="width:130px;padding-left:30px">手机号：</td>
                        <td style="width:180px"><input type="text" class="form-control" name="mobilePhone" placeholder="手机号" value=""></td>
                        <td style="width:130px;padding-left:30px">绑卡姓名：</td>
                        <td style="width:180px"><input type="text" class="form-control" name="memberName" placeholder="绑卡姓名" value=""></td>
                        <td style="width:130px;padding-left:30px">绑卡卡号：</td>
                        <td style="width:180px"><input type="text" class="form-control" name="cardNo" placeholder="绑卡卡号" value=""></td>
                         <td style="width:110px;padding-left:30px">注册时间：</td>
                        <td style="width:180px"><input type="text"  name="createDate" class="form-control time" placeholder="注册时间" readonly="readonly" value=""></td>
                         <td class="pull-right" style="padding-right:30px">
                         <button type="submit" class="btn btn-primary btn-sm">查询</button></td>
                         <td><button type="button" class="btn btn-primary btn-sm" onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">重置</button></td>
                        </tr>          
                        </table>
                        </form>
                        <table class="table table-bordered tablebox">
                          <tr class="text-center" bgcolor="#f7f7f7">
                          <td>序号</td>
                          <td>手机号</td>
                          <td>绑卡人姓名</td>
                          <td>绑卡身份证</td>
                          <td>绑卡类型</td>
                          <td>绑卡卡号</td>
                          <td>绑卡地址</td>
                          <td>状态</td>
                          <td>添加时间</td>
                          <td>操作</td>
                          </tr>
                         <c:forEach items="${mb}" var="m">
                         	<tr class="text-center">
                            <td>${m.memberBankcardsId}</td>
                            <td>${m.members.mobilePhone}</td>
                            <td>${m.members.memberName}</td>
                            <td>${m.members.memberIdentity}</td>
                            <td>${m.memberBankcardsType}</td>
                            <td>${m.cardNo}</td>
                            <td>${m.cardaddress}</td>
                            <td>
                            <c:if test="${m.delflag==0}"><font color="blue">正常</font></c:if>
							<c:if test="${m.delflag==1}"><font color="red">被删除</font></c:if>
                            	
                            		<!--<span style="color:blue;">正常</span>  -->
                            </td>
                            <td>${m.createDate}</td>
                            <td>
                            		<a href="<%= basePath%>sysmember/unBankCard/96" class="btn btn-primary btn-sm" onclick="return confirm('你确定要解绑？')">解绑银行卡</a>
                            </td>
                          </tr>
                         </c:forEach>
                        </table>
	
	
	<div class="llpage">
		<div class="in">
			<nav>
				<span class="count">第&nbsp;<b>1</b>&nbsp;页，&nbsp;共&nbsp;<b>1</b>&nbsp;页</span>
				<ul class="pagination">

						<li><a class="prev_page">上页</a></li>


							<li><a class="now" >1</a></li>


						<li><a class="next_page" rel="next">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>

         </div>
         <!-- 内容结束 -->
	</div>
	<script type="text/javascript">
	$('.time').datetimepicker({
		format : 'yyyy-mm-dd',
		language: 'zh-CN',
		minView: 2,
	    todayBtn: 1
	}).on('changeDate', function(ev) {
		$('.time').datetimepicker('hide');
	});
	
	</script> 
<!-- 容器结束 -->
</body>
</html>