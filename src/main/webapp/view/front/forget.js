var code,base,phone,password,password2,css;


$(function() {
	css = {
			"-moz-box-shadow" : "0px 0px 10px #9e020c",
			"-webkit-box-shadow" : "0px 0px 10px #9e020c",
			"box-shadow" : "0px 0px 10px #9e020c"
		};
	
	forget = function(b) {
		base = b;
		phone=$(".phone");
		code = $(".code");
		password=$(".password");
		password2=$(".password2");
		
		
		
		phone.keyup(function() {
			if ((/^1[3-9][0-9]\d{8}$/.test(phone.val()))) {
				$.ajax({
					type : "POST", // 用POST方式传输
					dataType : "json", // 数据格式:JSON
					async : true,
					url : base + '/web/valiatorPhone', // 目标地址
					data : {
						phone : phone.val(),
						type:2
					},
					success : function(msg) {
						if (msg.code == 0) {
							phone.focus().css(css);
							phone.next(".errorInfo").html(msg.msg).show();
							return;
						} else {
							phone.removeAttr("style");
							phone.next(".errorInfo").html(msg.msg).show();
							return;
						}
					}
				});
			}
		});
		
		code.keyup(function() {
			if ((/^.{4}$/.test(code.val()))) {
				code.removeAttr("style");
				code.next(".errorInfo").html("").hide();
				return;
			}
		});
		
		password.keyup(function() {
			if ((/^[a-zA-Z]\w{5,17}$/.test(password.val()))) {
				password.removeAttr("style");
				password.next(".errorInfo").html("").hide();
				return;
			}
		});
		password2.keyup(function() {
			if ((password2.val()==password.val())) {
				password2.removeAttr("style");
				password2.next(".errorInfo").html("").hide();
				return;
			}
		});
		
		//忘记密码
		$(".submit").click(function() {
			phone.next(".errorInfo").html("").hide();
			if (!(/^1[3-9][0-9]\d{8}$/.test(phone.val()))) {
				phone.focus().css(css);
				phone.next(".errorInfo").html("手机号码格式不正确").show();
				return;
			}
			if (!(/^.{4}$/.test(code.val()))) {
				code.focus().css(css);
				code.next(".errorInfo").html("验证码格式不正确").show();
				return;
			}
			if (!(/^[a-zA-Z]\w{5,17}$/.test(password.val()))) {
				password.focus().css(css);
				password.next(".errorInfo").html("密码为6位以上的英文加数字").show();
				return;
			}
			if (password.val()!=password2.val()) {
				password2.focus().css(css);
				password2.next(".errorInfo").html("两次密码不一致").show();
				return;
			}
			
			$.ajax({
				type : "POST", // 用POST方式传输
				dataType : "json", // 数据格式:JSON
				async : true,
				url : base + 'web/forgetsuccess', // 目标地址
				data : {
					mobilePhone : phone.val(),
					password:password.val(),
					code : code.val()
				},
				success : function(msg) {
					if (msg.code == 0) {
						alert("您的密码已经重新设置！");
						window.location.href=base+"web/login";
					} else {
						phone.next(".errorInfo").html(msg.msg).show();
					}
				}
			});
			
		});
	};
});



// 发送验证码		
var InterValObj; //timer变量，控制时间
var curCount;//当前剩余秒数
function sendMessage(count) {
		if (!(/^1[3-9][0-9]\d{8}$/.test(phone.val()))) {
			phone.focus().css(css);
			phone.next(".errorInfo").html("手机号码格式不正确").show();
		return;
		}
		curCount = count;
		$("#btnSendCode").attr("disabled", "true");
		$("#btnSendCode").addClass("grey")
		$("#btnSendCode").html(""+ curCount + "秒");
		InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
		$.ajax({
			type : "POST", // 用POST方式传输
			dataType : "json", // 数据格式:JSON
			async : true,
			url : base + 'web/sendTestValSms', // 目标地址
			data : {
				phone : phone.val(),
				type:3
			},
			success : function(msg) {
				if (msg.code == 0) {
					phone.next(".errorInfo").html(msg.msg).show();
				} else {
					phone.next(".errorInfo").html(msg.msg).show();
				}
			}
		});
}
//timer处理函数
function SetRemainTime() {
	if (curCount == 0) {                
		window.clearInterval(InterValObj);//停止计时器
		$("#btnSendCode").removeAttr("disabled");//启用按钮
		$("#btnSendCode").removeClass("grey")
		$("#btnSendCode").html("重新发送");
	}
	else {
		curCount--;
		$("#btnSendCode").html(""+ curCount + "秒");
	}
}

