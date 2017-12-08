<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<link href="<%=basePath%>resources/web/images/icon.ico" type="image/x-icon" rel="shortcut icon">

<link href="<%=basePath%>resources/web/font/iconfont.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>resources/web/css/common.css" rel="stylesheet">
<link href="<%=basePath%>resources/web/css/jw.css" rel="stylesheet">

<script src="<%=basePath%>resources/web/js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/web/layer/layer.js"></script>
<script src="<%=basePath%>resources/web/echart/dist/echarts.js"></script>
	<style>
		* {
			margin: 0;
			padding: 0;
			list-style: none;
		}

		img {
			border: 0;
		}

		.rides-cs {
			font-size: 12px;
			background: #29a7e2;
			position: fixed;
			top: 250px;
			right: 0px;
			_position: absolute;
			z-index: 1500;
			border-radius: 6px 0px 0 6px;
		}

			.rides-cs a {
				color: #00A0E9;
			}

				.rides-cs a:hover {
					color: #ff8100;
					text-decoration: none;
				}

			.rides-cs .floatL {
				width: 36px;
				float: left;
				position: relative;
				z-index: 1;
				margin-top: 21px;
				height: 181px;
			}

				.rides-cs .floatL a {
					font-size: 0;
					text-indent: -999em;
					display: block;
				}

			.rides-cs .floatR {
				width: 130px;
				float: left;
				padding: 5px;
				overflow: hidden;
			}

				.rides-cs .floatR .cn {
					background: #F7F7F7;
					border-radius: 6px;
					margin-top: 4px;
				}

			.rides-cs .cn .titZx {
				font-size: 14px;
				color: #333;
				font-weight: 600;
				line-height: 24px;
				padding: 5px;
				text-align: center;
			}

			.rides-cs .cn ul {
				padding: 0px;
			}

				.rides-cs .cn ul li {
					line-height: 38px;
					height: 38px;
					border-bottom: solid 1px #E6E4E4;
					overflow: hidden;
					text-align: center;
				}

					.rides-cs .cn ul li span {
						color:#333;
					}

					.rides-cs .cn ul li a {
						color: #777;
					}

					.rides-cs .cn ul li img {
						vertical-align: middle;
					}

			.rides-cs .btnOpen, .rides-cs .btnCtn {
				position: relative;
				z-index: 9;
				top: 25px;
				left: 0;
				background-image: url(/Content/images/jw/qqkefu.png);
				background-repeat: no-repeat;
				display: block;
				height: 146px;
				padding: 8px;
			}

			.rides-cs .btnOpen {
				background-position: 0 0;
			}

			.rides-cs .btnCtn {
				background-position: -37px 0;
			}

			.rides-cs ul li.top {
				border-bottom: solid #ACE5F9 1px;
			}

			.rides-cs ul li.bot {
				border-bottom: none;
			}

        .topNav {
            padding: 0;
            margin: 0;
        }
	li {
		margin: 0;
		padding: 8px 0;
	}

	li.active {
		/*background: #323030;*/
        background:none;
	}

	li.active a {
		color: white;
	}
	</style>

</head>
<body>
	<div id="floatTools" class="rides-cs" style="height:408px;">
		<div class="floatL">
			<a id="aFloatTools_Show" class="btnOpen" title="查看在线客服" style="top:90px;display:block" href="javascript:void(0);">展开</a>
			<a id="aFloatTools_Hide" class="btnCtn" title="关闭在线客服" style="top:90px;display:none" href="javascript:void(0);">收缩</a>
		</div>
		<div id="divFloatToolsView" class="floatR" style="display: none;height:408px;width: 140px;">
			<div class="cn">
				<img src="/Content/images/jw/kefun.png" style="  width: 100px;display: block; margin: 0 auto; padding-top: 10px;"/>
				<h3 class="titZx">盈+金融在线客服</h3>
				<ul>
					<li><span>客服1</span> <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=508886246&site=qq&menu=yes"><img border="0" src="/Content/images/jw/littleQQ.png" alt="点击这里给我发消息" title="点击这里给我发消息" /></a> </li>
					<li><span>客服2</span> <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=3276064217&site=qq&menu=yes"><img border="0" src="/Content/images/jw/littleQQ.png" alt="点击这里给我发消息" title="点击这里给我发消息" /></a> </li>
					<li><span>客服3</span> <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=2717994963&site=qq&menu=yes"><img border="0" src="/Content/images/jw/littleQQ.png" alt="点击这里给我发消息" title="点击这里给我发消息" /></a> </li>
                    <li><span>技术A</span> <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=2088636909&site=qq&menu=yes"><img border="0" src="/Content/images/jw/littleQQ.png" alt="点击这里给我发消息" title="点击这里给我发消息" /></a> </li>
					<li style="border:none;"><span>电话：4000-999-158</span> </li>
				</ul>
			</div>
		</div>
	</div>
	
    <div style=" width:1002px; height:94px; margin:0 auto;">
        <iframe src="http://pro.ying158.com/iframetop" scrolling="no" frameborder="0" width="1002" height="94"></iframe>
    </div>
    	<div class="main">
		

<!-- Chang URLs to wherever Video.js files will be hosted -->
<link href="/Scripts/plugins/video-js/video-js.css" rel="stylesheet" type="text/css">
<!-- video.js must be in the <head> for older IEs to work. -->
<script src="/Scripts/plugins/video-js/video.js"></script>
<!-- Unless using the CDN hosted version, update the URL to the Flash SWF -->
<script>
    videojs.options.flash.swf = "video-js.swf";
</script>

<div class="indexBanner">
    

<div id="homebanner" class="carousel slide" data-ride="carousel">


    <ol class="carousel-indicators">
            <li data-target="#homebanner" data-slide-to="0" class=" active"></li>
    </ol>

    <div class="carousel-inner" role="listbox">
                <div class=" item active">
                    <img src="/Content/images/banner2.jpg" alt="[]" />
                    
                </div>
    </div>

    <a class="left carousel-control" href="#homebanner" role="button" data-slide="prev">
        <span class="fa fa-chevron-circle-left" aria-hidden="true"></span>
        <span class="sr-only">上一张</span>
    </a>
    <a class="right carousel-control" href="#homebanner" role="button" data-slide="next">
        <span class="fa fa-chevron-circle-right" aria-hidden="true"></span>
        <span class="sr-only">下一张</span>
    </a>
</div>
    <div class="login-box">
        <div class="block backdrop"></div>
        <div class="block" style=" height:280px;">

            
            
            <p style="margin-top:20px; line-height:50px; font-size:20px; text-align:center; color:#fff;"><span style="color:#917739;">欢迎</span>盈主到来</p>
            <p style="margin-bottom:15px; line-height:50px; font-size:20px; text-align:center; color:#fff;">现在开始<span style="color:#917739;">您的财富</span> 之旅吧</p>
            <a style="float:none; margin:0 auto; margin-left:15px;    display: inline-block;margin-bottom: 10px;" href="http://pro.ying158.com/web/login"><img src="/images/ying_index_login_btn.png" /></a>
            <a style="float:none; margin:0 auto; margin-left:15px; margin-top:10px;" href="http://pro.ying158.com/web/regis"><img src="/images/ying_index_reg_btn.png" /></a>
            
        </div>
    </div>
</div>

<div class="container index">
    <div class="row">
        <div class="report">
            <div class="title">
                <i class="fa fa-volume-up fa-2"></i>最新公告
            </div>
            <div class="content" id="announcements">
                <span id="spanAnnouncements" data-bind="foreach:$data">
                    <input type="hidden" data-bind="value:id" />
                    <span data-bind="text:title+' '+strDate, click: showannouncement" class="hidden" style="cursor:pointer">最新公告</span>
                </span>
            </div>
            <a href="/home/newscenter">
                查看更多>>&nbsp;&nbsp;&nbsp;&nbsp;
            </a>
        </div>
        <iframe width="972" height="500" scrolling="no" frameborder="0" src="http://pro.ying158.com/subject/iframeindex"></iframe>
        <div class=" download apply">
            <div class="title">
                <img src="/Content/images/jw/applyLeft.png" />合作商风采<img src="/Content/images/jw/applyRight.png" />
            </div>
            <div id="introMarquee">
                <div id="marqueeContainer">
                    <ul id="articleImgs" class="unstyled" style="  background-color: #917739;padding-top: 10px;">
                        <li>
                            <img src="/Content/images/jw/hezuo1.jpg" name="hezuo1Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo2.jpg" name="hezuo2Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo3.jpg" name="hezuo3Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo4.jpg" name="hezuo4Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo5.jpg" name="hezuo5Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo6.jpg" name="hezuo6Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo7.jpg" name="hezuo7Big.jpg">
                        </li>
                        <li>
                            <img src="/Content/images/jw/hezuo8.jpg" name="hezuo8Big.jpg">
                        </li>
                    </ul>
                    <ul id="articleImgs2" class="unstyled" style="background-color: #917739; padding-top: 10px;margin-left: -5px;"></ul>
                </div>
            </div>
        </div>

    </div>
</div>




<div id="announcementModal" class="modal fade infoModal">
    <div class="modal-dialog">
        <div class="modal-content" data-bind="if: $data">
            <div class="modal-header">
                <span data-bind="text:title"></span>
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only"></span></button>
            </div>
            <div class="modal-body">
                <div class=" col-lg-12">
                    <div data-bind="html:content" style="text-align:left"></div>
                </div>
                <p></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-straight" data-dismiss="modal" style="margin-top:initial;">确认</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade myModal" id="bigImg" role="dialog">
    <div class="modal-dialog modal-sm" style="width: 1200px;">
        <div class="modal-content">
            <div class="modal-header" style="padding-top:10px;padding-bottom:10px;">
                <span>合作商风采</span>
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body" style="text-align: center;">
                <img id="theBigImg" src="" />
            </div>
        </div>
    </div>
</div>
<div class="modal fade errorInfo infoModal" id="closePositionDialog" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content" style="border-radius: 0px;width:400px;">
            <div class="modal-header">
                <span>温馨提示</span>
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
            </div>
            <div class="modal-body">
                <div id="errorMsg"></div><br>
            </div>
        </div>
    </div>
</div>

<div class="bottomAd" style="position:fixed; bottom:0px; margin:0 auto;">
    <script type="text/javascript">
        function hide() {
            $(".bottomAd").hide();
        }
    </script>
    <img src="http://ying158.com/images/yingjia.png" border="0" usemap="#Map" />
    <map name="Map" id="Map">
        <area shape="rect" coords="1420,23,1445,48" href="javascript:hide();" />
    </map>
</div>

            <script src="/Scripts/knockout-3.2.0.js"></script>
            <script>
    $("#marqueeContainer img").click(function () {
        var bigImg = $(this).attr("name");
        var url = "/Content/images/jw/" + bigImg;
        $("#bigImg #theBigImg").attr("src", url);
        $("#bigImg").modal();
    });

    (function () {
        var raf = window.requestAnimationFrame || function _raf(f) { return setTimeout(f, 16.6); }
        var caf = window.cancelAnimationFrame || function _caf(f) { return clearTimeout(f); }
        var tick = function () {
            var ticks = {};
            var _tick = function _tick(name, newTick) {
                if (!ticks[name] || !newTick) {
                    ticks[name] = newTick;
                }
                lastTick = ticks[name];
                ticks[name] = newTick;
                return newTick - lastTick;
            };
            return _tick;
        }();

        var speed = 33.333333;
        var tab = document.getElementById("introMarquee");
        var tab1 = document.getElementById("articleImgs");
        var tab2 = document.getElementById("articleImgs2");
        tab2.innerHTML = tab1.innerHTML;
        $("#articleImgs2 img").click(function () {
            var bigImg = $(this).attr("name");
            var url = "/Content/images/jw/" + bigImg;
            $("#bigImg #theBigImg").attr("src", url);
            $("#bigImg").modal();
        });
        var offsetWidth1 = tab1.offsetWidth;
        var offsetLeft2 = tab2.offsetLeft;
        var scrollLeft = 0;
        var MyMar;
        function Marquee(time) {
            t = tick("introMarquee", time || new Date());
            MyMar = raf(Marquee);

            if (scrollLeft >= offsetLeft2) {
                scrollLeft = scrollLeft % offsetLeft2;
            }
            scrollLeft += (1 / speed) * t;
            tab.scrollLeft = scrollLeft;
        }
        var MyMar = raf(Marquee, speed);
        tab.onmouseover = function () { caf(MyMar); tick("introMarquee", null); };
        tab.onmouseout = function () { MyMar = raf(Marquee, speed); };
        var currentLeft = 0;
        
    })();

    var loginFromPage = function () {
        var phone = $("#phone").val();
        var password = $("#password").val();
        if ($.trim(phone) == "") {
            $("#phone").focus();
            return;
        }
        if ($.trim(password) == "") {
            $("#password").focus();
            return;
        }
        $(".loginBtn").addClass("disabled");
        $.post("/api/authentication/signIn", { login: phone, password: password }, function (data) {
            if (data.isAuthenticated) {
                window.location.href = '/account/UserCenter';
            } else {
                $(".loginInfo #loginFail").html(data.errorMessage);
                $(".loginInfo").modal();
                $(".loginBtn").removeClass("disabled");
            }
        });
    }

    function login() {

        var phone = $.trim($("#phoneNum").val());
        if (phone == "") {
            $("#infosResult").html("请输入您的手机号码");
            $("#infoUser").modal();
            $("#phoneNum").focus();
            return false;
        }

        var pwd = $.trim($("#pwd").val());

        if (pwd == "") {
            $("#infosResult").html("请输入登录密码");
            $("#infoUser").modal();
            $("#pwd").focus();
            return false;
        }

        $(".loginBtn").addClass("disabled");
        $.post("/api/authentication/signIn", { login: phone, password: pwd }, function (data) {
            if (data.isAuthenticated) {
                if (data.returnUrl) {
                    window.location.href = data.returnUrl;
                } else {
                    window.location.href = '/account/UserCenter';
                }
            } else {
                $("#loginError").html(data.errorMessage);
                $("#loginError").show();
                $(".loginBtn").removeClass("disabled");
            }
        });
    }
    var counter = 1;
    var announceTimer = function () {
        return setInterval(function () {
            var length = $("#spanAnnouncements > span").length;
            if (length) {

                $("#spanAnnouncements > span").each(function (i, e) {
                    if (i == counter % length) {
                        $(this).removeClass("hidden");
                    } else {
                        $(this).addClass("hidden");

                    }
                });
                counter++;
                if (counter == length) counter = 0;
            }

        }, 2000);
    };
    var timerId = announceTimer();
    var announcements = ko.observableArray();
    var announcement = ko.observable();
    var showannouncement = function (an) {
        announcement(an);
        $('#announcementModal').modal('show');
    }
    $(function () {

        ko.applyBindings(announcements, document.getElementById("announcements"));
        ko.applyBindings(announcement, document.getElementById("announcementModal"));

        $.get("/api/article/articleByCategory/b8c8dd38-0805-4ef4-bff6-17b835fca8aa/5", "", function (rel) {

            $.each(rel, function (i, v) {
                if (v.title.length > 32) {
                    v.title = v.title.substring(0, 30) + '...';
                }
            });
            announcements(rel);
        });

    });


    var notReady = function () {
        $("#closePositionDialog #errorMsg").html("<h4>即将推出，敬请期待！</h4>");
        $("#closePositionDialog").modal();
    }

</script>
<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "//hm.baidu.com/hm.js?3a07c2531807d298ad88175fa22f9413";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
    
</body>
</html>