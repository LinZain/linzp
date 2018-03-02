<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="./js_inc.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<script type="text/javascript" charset="UTF-8">
	layui.use([ 'element', 'carousel' ], function() {
		var carousel = layui.carousel, element = layui.element;

		carousel.render({
			elem : '#test1',
			width : '100%',//设置容器宽度
			arrow : 'always',//始终显示箭头
			height : '666px',
			anim : 'fade', //切换动画方式
			arrow : 'hover'
		});
	});
</script>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<div class="layui-header">
			<div class="layui-logo">BOLL6电商管理系统</div>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"><img
						src="http://t.cn/RCzsdCq" class="layui-nav-img">Zain</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">注销</a></li>
			</ul>
		</div>
	</div>
	<div class="layui-carousel" id="test1">
		<div carousel-item="" align="center" class="layui-bg-black">
			<div style="background-color: black;">
				<img src="./img/CF/1.1.jpg">
			</div>
			<div style="background-color: black;">
				<img src="./img/CF/2.1.jpg">
			</div>
			<div style="background-color: black;">
				<img src="./img/CF/3.1.jpg">
			</div>
			<div style="background-color: black;">
				<img src="./img/CF/4.1.jpg">
			</div>
			<div style="background-color: black;">
				<img src="./img/CF/5.1.jpg">
			</div>
		</div>
	</div>
	<div class="layui-fluid" align="center">
		<div class="layui-row" style="height: 30%">
			<div class="layui-col-md1" align="right">
				<i class="layui-icon">&#xe63f;</i>
			</div>
			<div class="layui-col-md2">
				<a href="javascript:change('./change','commodity/commodityList')"
					class="change"><img src="./img/font/1.jpg"></a>
			</div>
			<div class="layui-col-md2">
				<a
					href="javascript:change('./change','commodity/commodityManagement')"
					class="change"><img src="./img/font/2.jpg"></a>
			</div>
			<div class="layui-col-md2">
				<a href="javascript:change('./change','order/orderManagement')"
					class="change"><img src="./img/font/3.jpg"></a>
			</div>
			<div class="layui-col-md2">
				<a href="javascript:change('./change','system/systemManagement')"
					class="change"><img src="./img/font/4.jpg"></a>
			</div>
			<div class="layui-col-md2">
				<a href="javascript:change('./change','user/userManagement')"
					class="change"><img src="./img/font/5.jpg"></a>
			</div>
			<div class="layui-col-md1" align="left">
				<i class="layui-icon">&#xe63f;</i>
			</div>
		</div>
	</div>
</body>
</html>