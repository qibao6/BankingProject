var mobilePhone,css,base,userName,userPass,code;
$(function(){
	css = {
	        "-moz-box-shadow" : "0px 0px 10px #9e020c",
	        "-webkit-box-shadow" : "0px 0px 10px #9e020c",
	        "box-shadow" : "0px 0px 10px #9e020c"
	    };
	
	 login=function(b){
	  base=b;
	  userName=$("#userName");
	  userPass=$("#password");
	  mobilePhone=$("#mobilePhone");
	  code=$("#code");
	  
	  userName.keyup(function() {
			if ((userName.val()!="")) {
				userName.removeAttr("style");
				$(".error").html("").hide();
				return;
			}
		});
		
	  userPass.keyup(function() {
			if ((userPass.val()!="")) {
				userPass.removeAttr("style");
				$(".error").html("").hide();
				return;
			}
		});
	  mobilePhone.keyup(function() {
			if ((/^1[3-9][0-9]\d{8}$/.test(mobilePhone.val()))) {
				mobilePhone.removeAttr("style");
				$(".error").html("").hide();
				return;
			}
		});
	  code.keyup(function() {
			if ((/^.{4}$/.test(code.val()))) {
				code.removeAttr("style");
				$(".error").html("").hide();
				return;
			}
		});
	  
	  $("#submit").click(function() {
		    if (userName.val()=="") {
		    	userName.focus().css(css);				    	
	            return false;
	     	}
	        if (userPass.val() == "") {
	        	userPass.focus().css(css);
	            return false;
	        } 
	        if (!(/^1[3-9][0-9]\d{8}$/.test(mobilePhone.val()))) {
	        	mobilePhone.focus().css(css);
	            return false;
	        } 
	        if (!(/^.{4}$/.test(code.val()))) {
	        	code.focus().css(css);
	            return false;
	        } 
	        var en_phone=userName.val();
	        var en_pwd =userPass.val();
			 $.ajax({
				 type : "POST", // 用POST方式传输
				 url:base+'/manage/login',
				 data:{
					 "userName":en_phone,
					 "password":en_pwd,
					 "mobilePhone":mobilePhone.val(),
					 "code":code.val()
				 },
				 success:function(data){
					 if(data.code == 0){
						 window.location.href=b+"/manage/index";
					 }else{
						 $(".error").html(data.msg).show();
					 }
				 }
			 });
	  });
	  $(document).keyup(function(event) {
			if (event.keyCode == 13) {
				$("#submit").trigger("click");
			}
		});
	 };
});



//发送验证码		
var InterValObj; //timer变量，控制时间
var curCount;//当前剩余秒数
function sendMessage(count) {
		if (!(/^1[3-9][0-9]\d{8}$/.test(mobilePhone.val()))) {
			mobilePhone.focus().css(css);
			$(".error").html("手机号码格式不正确").show();
			return;
		}else{
			$.ajax({
				type : "POST", // 用POST方式传输
				url:base+'/manage/checkedSms',
				data:{
					"mobilePhone":mobilePhone.val()
				},
				success:function(data){
					if(data.code != 0){
						$(".error").html(data.msg).show();
						return;
					}else {
						curCount = count;
						$("#btnSendCode").attr("disabled", "true");
						$("#btnSendCode").addClass("grey")
						$("#btnSendCode").val(""+ curCount + "秒");
						InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
						$.ajax({
							type : "POST", // 用POST方式传输
							dataType : "json", // 数据格式:JSON
							async : true,
							url : base + '/manage/sendTestValSms', // 目标地址
							data : {
								phone : mobilePhone.val(),
								type:6
							},
							success : function(msg) {
								if (msg.code == 0) {
									$(".error").html(msg.msg).show();
								} else {
									$(".error").html(msg.msg).show();
								}
							}
						});
					}
				}
			});
		}

}
//timer处理函数
function SetRemainTime() {
	if (curCount == 0) {                
		window.clearInterval(InterValObj);//停止计时器
		$("#btnSendCode").removeAttr("disabled");//启用按钮
		$("#btnSendCode").removeClass("grey")
		$("#btnSendCode").val("重新发送");
	}
	else {
		curCount--;
		$("#btnSendCode").val(""+ curCount + "秒");
	}
}