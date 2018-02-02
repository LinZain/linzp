<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./layui/css/layui.css">
<script type="text/javascript" src="./layui/layui.js"></script>
<script type="text/javascript" src="./js/jquery/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript" charset="UTF-8">
	layui.use('element', function() {
		var element = layui.element;
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
</body>
</html>