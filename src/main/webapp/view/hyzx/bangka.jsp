<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/font/iconfont.css"
	rel="stylesheet">
<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
		var citys={
				湖北:[{武汉:["汉口","武昌","江夏"]},{襄阳:["枣阳","谷城","老河口"]},{随州:["唐镇","随县"]}],
				湖南:[{长沙:["沙一","沙二","沙三"]},{岳阳:["岳一","岳一","岳一"]},{湘潭:["湘一","湘二"]}]
			};
		window.onload=function(){
			var opro=document.getElementById("pro");
			for(var key in citys){
				var option=document.createElement("option");
				option.Value=key;
				option.innerHTML=key;
				opro.appendChild(option);
			}
		}
		function chang1(obj){
			var ocity=document.getElementById("city");
			var owic=document.getElementById("wic");
			for(var key in citys){
				if(key==obj.value){
					var op=owic.getElementsByTagName("option");
					var len=op.length;
					for(f=1;f<len;f++){
						owic.removeChild(op[1]);
					}
					var op=ocity.getElementsByTagName("option");
					var len=op.length;
					for(i=1;i<len;i++){
						ocity.removeChild(op[1]);
					}
					for(i=0;i<citys[key].length;i++){
						for(var keys in citys[key][i]){
							var option=document.createElement("option");
							option.Value=keys;
							option.innerHTML=keys;
							ocity.appendChild(option);
						}
					}
				}
			}
		}
		function chang2(obj){
			var owic=document.getElementById("wic");
			for(var key in citys){
				for(i=0;i<citys[key].length;i++){
					for(var keys in citys[key][i]){
						if(keys==obj.value){
							var op=owic.getElementsByTagName("option");
							var len=op.length;
							for(f=1;f<len;f++){
								owic.removeChild(op[1]);
							}
							for(j=0;j<citys[key][i][keys].length;j++){
								var option=document.createElement("option");
								option.Value=citys[key][i][keys][j];
								option.innerHTML=citys[key][i][keys][j];
								owic.appendChild(option);
							}
						}
					}
				}
			}
		}
		function address(){
			 $("#cardaddress").val($("#pro").val()+"-"+$("#city").val()+"-"+$("#wic").val()+"-"+$("#cardaddress1").val());
		 }
	</script>
<body>
	<div class="tbConBox">
		<div class="tab">
			<a class="select" href="javascript:;">银行卡管理</a>
		</div>
		<div id="conBox">
			<div class="box" style="display: block">
				<div class="myBankCards clearfix">
					<div class="title"><font size="4">绑定银行卡</font></div>
					<form action="<%=basePath%>hyzx/${memberId }/bangka" method="post">
					<table class="txTable" width="100%" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td align="right">姓名：</td>
							<td><input type="text" class="tytxt" id="username"
								name="username" value="${members.memberName }" placeholder="姓名"></td>
							<td style="color: #ff6a00">实名信息提交后不可修改，请务必认真填写真实资料</td>
						</tr>
						<tr>
							<td width="140" align="right">身份证：</td>
							<td><input type="text" class="tytxt" id="identity"
								name="identity" value="${members.memberIdentity }" placeholder="身份证"></td>
							<td style="color: #ff6a00">一个身份证只能绑定一个帐号</td>
						</tr>

						<tr>
							<td align="right">开户银行：</td>
							<td colspan="2"><select name="memberBankcardsType" class="form-control" id="type">
									<option value="工商银行">工商银行</option>
									<option value="光大银行">光大银行</option>
									<option value="广发银行">广发银行</option>
									<option value="华夏银行">华夏银行</option>
									<option value="建设银行">建设银行</option>
									<option value="交通银行">交通银行</option>
									<option value="民生银行">民生银行</option>
									<option value="农业银行">农业银行</option>
									<option value="浦发银行">浦发银行</option>
									<option value="兴业银行">兴业银行</option>
									<option value="邮政储蓄">邮政储蓄</option>
									<option value="招商银行">招商银行</option>
									<option value="中国银行">中国银行</option>
									<option value="中信银行">中信银行</option>
							</select></td>
						</tr>

						<tr>
							<td align="right">开户地：</td>
							<td colspan="2">
								<div style="float: left;">
								<select id="pro" onchange="chang1(this);" style="width: 80px;">
							    	<option>省份</option>
							    </select>
							    <select id="city" onchange="chang2(this);" style="width: 100px;">
							    	<option>地级市</option>
							    </select>
							    <select id="wic" style="width: 120px;">
							    	<option>市、县、区</option>
							    </select>
								</div>
							</td>
							<td></td>
						</tr>
						<tr>
							<td align="right">开户支行：</td>
							<td><div style="float: left;">
									<input type="text" class="tytxt" name="cardaddress1"
										id="cardaddress1" placeholder="开户支行">
								</div>
								<input type="hidden" name="cardaddress" id="cardaddress" />
							</td>
							<td></td>
						</tr>
						<tr>
							<td align="right">银行卡号：</td>
							<td><input type="text" class="tytxt" id="bankCardNum"
								placeholder="银行卡号"></td>
						</tr>
						<tr>
							<td align="right">确认卡号：</td>
							<td><input type="text" class="tytxt" name="cardNo" id="bankCardNumConfirm"
								placeholder="确认卡号"></td>
							<td></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><button type="submit" class="tybutton" id="buttonsubmit" onclick="address();">保存</button></td>
							<td></td>
						</tr>
					</table>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>