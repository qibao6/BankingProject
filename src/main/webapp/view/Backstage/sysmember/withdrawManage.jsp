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
                        <td style="width:180px"><input type="text" name="memberName" class="form-control" placeholder="姓名" value="${memberName }"></td>
                        <td style="width:110px;padding-left:30px">手机号：</td>
                        <td style="width:180px"><input type="text"  name="mobilePhone" class="form-control" placeholder="手机号" value="${mobilePhone }"></td>
                        <td style="width:130px;padding-left:30px">绑卡卡号：</td>
                        <td style="width:180px"><input type="text" class="form-control" name="bankCard" placeholder="绑卡卡号" value="${bankCard }"></td>
                         <td style="width:80px">状态：</td>
	                    <td style="width:180px"><select name="status" class="form-control" style="width:130px;height:32px">
	                   		<option value="">全部</option>
	                        <option value="0" ${status==0?"selected='selected'":""}>待审核</option>
	                        <option value="1" ${status==1?"selected='selected'":""}>已付款</option>
	                        <option value="2" ${status==2?"selected='selected'":""}>打款中</option>
	                        <option value="3" ${status==3?"selected='selected'":""}>打款失败</option>
	                       	<option value="4" ${status==4?"selected='selected'":""}>已解冻</option>
	                    </select></td>
	                    <td><button type="submit" class="btn btn-primary btn-sm">查询</button></td>
	                    <td><button type="button" class="btn btn-primary btn-sm" onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">重置</button></td>
	                 	</tr>    
                        </table>
                        </form>
                        <table class="table table-bordered tablebox">
                          <tr class="text-center" bgcolor="#f7f7f7">
                          <td>序号</td>
                          <td>手机号</td>
                          <td>姓名</td>
                          <td>身份证</td>
                          <td>提现金额</td>
                          <td>提现银行</td>
                          <td>提现卡号</td>
                          <td>提现开户行地址</td>
                          <td>提现状态</td>
                          <td>提现时间</td>
                          <td>账号详细</td>
                          <td>操作</td>
                          </tr>
                          <c:forEach items="${list}" var="o">
                            <tr class="text-center">
                            <td>${o[0]}</td>
                            <td>${o[1]}</td>
                            <td>${o[2]}</td>
                            <td>${o[3]}</td>
                            <td>￥${o[4]}元</td>
                            <td>${o[5]}</td>
                            <td>${o[6]}</td>
                            <td>${o[7]}</td>
                            <td>
                            <c:if test="${o[8]==0}"><font style="color: red;">待审核</font></c:if>
							<c:if test="${o[8]==1}"><font style="color: blue;">已打款</font></c:if>
							<c:if test="${o[8]==2}"><font style="color: green;">打款中</font></c:if>
							<c:if test="${o[8]==3}"><font style="color: red;">打款失败</font></c:if>
							<c:if test="${o[8]==4}"><font style="color: red;">已冻结</font></c:if>
                            	
                            </td>
                            <td><f:formatDate value="${o[9]}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                            <td><a class="btn btn-primary btn-sm" href="<%=basePath%>sysmember/selectMemberId?mobilePhone=${o[1]}">账号详细</a></td>
                            <td>
                            	<c:if test="${o[10]==1}">
                            		<a class="btn btn-primary btn-sm" data-toggle="modal" onclick="audit('201603020229224501')">审核</a>
                            		<a class="btn btn-primary btn-sm"  onclick="tx(sprid,flag);">贝付打款</a>
                            		<a class="btn btn-primary btn-sm"  onclick="tx(sprid,flag);">解冻</a>
                            	</c:if>
									
									
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
						<li><a class="prev_page" href="javascript:pagerequest(${page>1?page:1})">上页</a></li>
							<c:forEach begin="1" end="${pages}" var="v">
							<li><a class="now" href="javascript:pagerequest(${v})" >${v}</a></li>
							</c:forEach>
						<li><a class="next_page" rel="next" href="javascript:pagerequest(${page+1<pages?page+1:pages});">下页</a></li>
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
	$.post('<%=basePath%>sysmember/editSubject/'+sprid+'/'+flag,function(data){
		if(data.code=="success"){
			alert("操作成功");
		}
	})
}
</script>
<!-- 容器结束 -->
</body>
</html>