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
        <script type="text/javascript" src="<%=basePath%>resources/sys/js/bootstrap.js"></script>
        
        <link rel="stylesheet" href="<%=basePath%>resources/date/bootstrap-datetimepicker.min.css">
        <script type="text/javascript" src="<%=basePath%>resources/date/bootstrap-datetimepicker.js"></script>
        <script type="text/javascript" src="<%=basePath%>resources/date/bootstrap-datetimepicker.zh-CN.js"></script>
        <title>后台首页</title>
    </head>
<body>

                     <div class="box-right-main">
                        <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>提现管理</h2>

                      <div class="tablelist">
                      	<form action="<%=basePath%>sysmember/WithdrawManage" method="post" id="form1" name="form1">
                       		<input type="hidden" name="page" id="page">
                        <table class="table tabletop">
                        <tr>
                        <td style="width:110px;padding-left:30px">姓名：</td>
                        <td style="width:180px"><input type="text" name="members.memberName" class="form-control" placeholder="姓名" value="${subjectPurchaseRecord.members.memberName}"></td>
                        <td style="width:110px;padding-left:30px">流水号：</td>
                        <td style="width:180px"><input type="text"  name="serialNumber" class="form-control" placeholder="流水号" value="${subjectPurchaseRecord.serialNumber}"></td>
                         <td style="width:80px">标的类型：</td>
	                    <td style="width:180px"><select name="subject.subjectId" class="form-control" style="width:130px;height:32px">
	                   		<option value="">全部</option>
	                        <option value="2" ${subjectPurchaseRecord.subject.subjectId==2?"selected='selected'":""}>理财宝一号11</option>
	                        <option value="3" ${subjectPurchaseRecord.subject.subjectId==3?"selected='selected'":""}>测试车贷123</option>
	                        <option value="4" ${subjectPurchaseRecord.subject.subjectId==4?"selected='selected'":""}>有缘固收类1</option>
	                    </select></td>
                         <td style="width:80px">状态：</td>
	                    <td style="width:180px"><select name="ispayment" class="form-control" style="width:130px;height:32px">
	                   		<option value="">全部</option>
	                        <option value="0" ${subjectPurchaseRecord.ispayment==0?"selected='selected'":""}>未还款</option>
	                        <option value="1" ${subjectPurchaseRecord.ispayment==1?"selected='selected'":""}>已还款</option>
	                    </select></td>
	                    <td><button type="submit" class="btn btn-primary btn-sm">查询</button></td>
	                    <td><button type="button" class="btn btn-primary btn-sm" onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">重置</button></td>
	                 	</tr>    
                        </table>
                        </form>
                        <table class="table table-bordered tablebox">
                          <tr class="text-center" bgcolor="#f7f7f7">
                          <td>序号</td>
                          <td>流水号</td>
                          <td>购买金额</td>
                          <td>交易IP</td>
                          <td>标的名称</td>
                          <td>购买人</td>
                          <td>创建时间</td>
                          <td>结算利息</td>
                          <td>是否还款</td>
                          <td>购买周期</td>
                          <td>操作</td>
                          </tr>
                          <c:forEach items="${list.getContent()}" var="o">
                            <tr class="text-center">
                            <td>${o.sprId}</td>
                            <td>${o.serialNumber}</td>
                            <td>￥${o.amount}元</td>
                            <td>${o.dealIp}</td>
                            <td>${o.subject.subjectName}</td>
                            <td>${o.members.memberName}</td>
                            <td><f:formatDate value="${o.createDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                            <td>￥${o.interest}</td>
                            <td>
                            <c:if test="${o.ispayment==0}"><font style="color: red;">未还款</font></c:if>
                            <c:if test="${o.ispayment==1}"><font style="color: blue;">已还款</font></c:if>
                            </td>
                            <td>${o.payInterestTimes}天</td>
                            <td>
                            	<c:if test="${o.sStatus==1}">
                            		<a class="btn btn-primary btn-sm"  onclick="javascript:tx(${o.sprId},'sh');">审核</a>
                            	</c:if>		
                            	<c:if test="${o.sStatus==2}">
									<a class="btn btn-primary btn-sm"  onclick="javascript:tx(${o.sprId},'jd');">解冻</a>
                            	</c:if>		
                            	<c:if test="${o.sStatus==3}">
                            		<a class="btn btn-primary btn-sm"  onclick="javascript:tx(${o.sprId},'dk');">打款</a>
                            	</c:if>		
                            	<c:if test="${o.sStatus==4}">
                            		<font color="blue">已打款</font>
                            	</c:if>		
                            </td>
                          	</tr>
                          </c:forEach>
                        </table>
<table class="table table-bordered tablebox">
	<div class="llpage">
		<div class="in">
			<nav>
				<span class="count">第&nbsp;<b>${list.getNumber()+1}</b>&nbsp;页，&nbsp;共&nbsp;<b>${list.getTotalPages()}</b>&nbsp;页</span>
				<ul class="pagination">
						<li><a class="prev_page" href="javascript:pagerequest(${list.getNumber()>1?list.getNumber():1})">上页</a></li>
							<c:forEach begin="1" end="${list.getTotalPages()}" var="v">
							<li><a class="now" href="javascript:pagerequest(${v})" >${v}</a></li>
							</c:forEach>
						<li><a class="next_page" rel="next" href="javascript:pagerequest(${list.getNumber()+1<list.getTotalPages()?list.getNumber()+1+1:list.getTotalPages()});">下页</a></li>
				</ul>
			</nav>
		</div>
	</div>
 </table>
         </div>

         <!-- 内容结束 -->

	</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">选择打款方式</h4>
         </div>
         <form action="<%=basePath%>sysmember/withdrawAudit" method="get">
         <div class="modal-body">
         	<input type="hidden" name="serialNumber" value="" id="serialNumber">
            <select class="form-control" name="channelName" style="width: 200px;">
            	<option value="FUIOU" selected="selected">富友</option>
            	<option value="BEIFU">贝付</option>
            </select>
        
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-primary btn-sm" data-dismiss="modal">关闭</button>
            <button type="submit" class="btn btn-primary">提交 </button>
         </div>
          </form>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->

<script type="text/javascript">
function pagerequest(page){
	document.getElementById("page").value=page;
	document.form1.submit();
};
function tx(sprid,flag){
	alert(sprid+"=="+flag);
	$.post('<%=basePath%>sysmember/editSubject/'+sprid+'/'+flag,function(data){
		if(data.code=="success"){
			alert("操作成功");
			window.location.href='<%=basePath%>sysmember/WithdrawManage';
		}
	})
}
</script>
<!-- 容器结束 -->
</body>
</html>