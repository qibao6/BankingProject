<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
        <h2><span class="glyphicon glyphicon-play" style="margin-right:5px"></span>付息计划</h2>

        <div class="tablelist">
        <form action="<%=basePath%>sysmember/payment" method="post" id="form1" name="form1">
            <table class="table tabletop">
                <tr>
                    <td style="width:110px;padding-left:30px">名称：</td>
                    <td style="width:180px"><input type="text" class="form-control" name="subjectName" placeholder="名称" value="${sub.subjectName }"></td>
                    <td style="width:80px">状态：</td>
                    <td style="width:180px">
                    <select name="status" class="form-control" style="width:130px;height:32px">
                   		<option value="">全部</option>
                        <option value="0" ${sub.status=="0"?"selected='selected'":""}>未发布</option>
                        <option value="1" ${sub.status=="1"?"selected='selected'":""}>募集中</option>
                        <option value="2" ${sub.status=="2"?"selected='selected'":""}>回款中</option>
                        <option value="3" ${sub.status=="3"?"selected='selected'":""}>还款完成</option>
                    </select>
                    </td>
                    <td style="width:80px">类型：</td>
                    <td style="width:180px">
                    <select name="subjectType" class="form-control" style="width:130px;height:32px" id="type">
                    	<option value="">全部</option>
                        <option value="0" ${sub.subjectType=="0"?"selected='selected'":""}>固收类</option>
                        <option value="1" ${sub.subjectType=="1"?"selected='selected'":""}>P2P车贷</option>
                        <option value="2" ${sub.subjectType=="2"?"selected='selected'":""}>P2P房贷</option>
                    </select>
                    </td>
                     <td class="pull-right" style="padding-right:30px">
                         <button type="submit" class="btn btn-primary btn-sm">查询</button></td>
                    <td><button type="button" class="btn btn-primary btn-sm" onclick="$('#form1').find(':input').not(':button, :submit, :reset').val('').removeAttr('checked').removeAttr('selected');">重置</button></td>
                  </tr>  
            </table>
           </form>
            <table class="table table-bordered tablebox">
                <tr class="text-center" bgcolor="#f7f7f7">
                    <td>序号</td>
                    <td>合同编号</td>
                    <td>标的类别</td>
                    <td>标的名称</td>
                    <td>标的总金额</td>
                    <td>已投金额</td>
                    <td>已投人数</td>
                    <td>标的期限</td>
                    <td>年化收益</td>
                    <td>标的状态</td>
                    <td>可体验金购买</td>
                    <td>操作</td>
                 </tr>
                <c:forEach items="${flist}" var="f">
                       <tr class="text-center">
                        <td>${f[0]}</td>
                        <td>${f[1]}</td>
                        <td>
                        	<c:if test="${f[2]==0}">固收类</c:if>
                        	<c:if test="${f[2]==1}">P2P车贷</c:if>
                        	<c:if test="${f[2]==2}">P2P房贷</c:if>
                        </td>
                        <td>${f[3]}</td>
                        <td>￥${f[4]==null?0:f[4]}元</td>
                        <td>￥${f[5]==null?0:f[5]}元</td>
                        <td>${f[6]}人</td>
                        <td>${f[7]}天</td>
                        <td>${f[8]}%</td>
                        <td>
                        	<c:if test="${f[9]==0}">未发布</c:if>
                        	<c:if test="${f[9]==1}">募集中</c:if>
                        	<c:if test="${f[9]==2}">回款中</c:if>
                        	<c:if test="${f[9]==3}">还款完成</c:if>
                        </td>
                        <td>
                        	<c:if test="${f[10]==0}">否</c:if>
                        	<c:if test="${f[10]==1}">是</c:if>
                        </td>
                        <td>
                        	<c:if test="${f[10]==1}"><a href="<%=basePath%>sysmember/paymentBbinContent?subjectId=${f[0]}" class="btn btn-primary btn-sm">体验金付息</a></c:if>
                        	<a href="<%=basePath%>sysmember/paymentContent?subjectId=${f[0]}" class="btn btn-primary btn-sm">付息列表</a>	
                        </td>
                    </tr>
                </c:forEach>
            </table>
      
	
	
        </div>
        <!-- 内容结束 -->
    </div>
    <!-- 容器结束 -->
    </body>
</html>