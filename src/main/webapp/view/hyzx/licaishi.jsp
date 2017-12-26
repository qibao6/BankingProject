<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="http://www.ying158.com/images/icon.ico" type="image/x-icon" rel="shortcut icon">
        <link href="<%=basePath %>resources/web/css/common.css" rel="stylesheet">
        <link href="<%=basePath %>resources/web/css/jw.css" rel="stylesheet">
        <link href="<%=basePath %>resources/web/font/iconfont.css" rel="stylesheet">
        <script src="<%=basePath %>resources/web/js/jquery.js"></script>
        <script src="<%=basePath %>resources/web/js/bootstrap.js"></script>

        <script src="<%=basePath %>resources/uploadify/jquery.uploadify.min.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="<%=basePath %>resources/uploadify/uploadify.css">
        <script>
            $(function () {
                $(".picTab a").click(function () {
                    if (!$(this).hasClass("select")) {
                        var num = $(this).index();
                        $(this).addClass("select").siblings().removeClass("select");
                        $(".txtCon p").eq(num).show().siblings().hide();
                    }
                })
                $(".tbConBox .tab a").click(function () {
                    if (!$(this).hasClass("select")) {
                        var num = $(this).index();
                        $(this).addClass("select").siblings().removeClass("select");
                        $("#conBox .box").eq(num).show().siblings().hide();
                    }
                })
            })
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
            .uploadify{
                left:0px;
            }

        </style>
</head>
<body>
	<div class="tbConBox">
                        <div class="tab">
                            <a class="select" href="javascript:;">我是理财师</a>
                        </div>
                        <div id="conBox">
                            <div class="box" style="display:block">
                                <div class="remind"><strong>理财师身份认证</strong></div>
                                <form action="<%=basePath %>hyzx/${memberId }/renzhen" method="post" id="form1" enctype="multipart/form-data">
                                    <table class="txTable" width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="140" align="right">真实姓名：</td>
                                            <td><input class="tytxt" type="text" name="financialPlannerName" value="${fPlanner.financialPlannerName }" ${fPlanner.orgname!=null?"disabled":"" }
                                                       style="display: inline;width:250px;"></td>
                                        </tr>
                                        <tr>
                                            <td align="right">机构名称：</td>
                                            <td><input class="tytxt" type="text" name="orgname" value="${fPlanner.orgname }" ${fPlanner.orgname!=null?"disabled":"" }
                                                       style="display: inline;width:250px;"></td>
                                        </tr>
                                        <tr>
                                            <td align="right">我的名片：</td>
                                            <td>
                                            	<c:if test="${fPlanner.mycard==null }">
                                            		<input type="file" name="ufile" />
                                            	</c:if>
                                            	<c:if test="${fPlanner.mycard!=null }">
                                                	<img width=50 height=50 src="<%=basePath %>upload/${fPlanner.mycard}">
                                            	</c:if>
                                            </td>

                                        </tr>

                                        <tr>
                                            <td align="right">我的邮寄地址：</td>
                                            <td><input type="text" class="tytxt" name="address" value="${fPlanner.address }" ${fPlanner.orgname!=null?"disabled":"" }
                                                       style="display: inline;width:250px;"></td>
                                        </tr>
                                        <tr>
                                            <td>&nbsp;</td>
                                            <td>
                                                    <button type="${fPlanner.status!=0?'sunmit':'button'}" class="tybutton" style="background-color: #2c5976">
                                                    	<c:if test="${fPlanner.status!=0}">认证</c:if>
                                                    	<c:if test="${fPlanner.status==0}">认证成功</c:if>
                                                    </button>
                                            </td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>


        <div class="modal fade errorInfo infoModal" id="withdrawErrorModal" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content jddModalContnt" style="border-radius: 0px;width:400px;">
                    <div class="modal-header">
                        <span>通知</span>
                        <button type="button" class="close" data-dismiss="modal"><span
                                aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                    </div>
                    <div class="modal-body">
                        <div id="withdrawError"></div>
                        <button class="btn btn-success confirmBtn" data-dismiss="modal">确认</button>
                    </div>
                </div>
            </div>
        </div>
	
</body>
</html>