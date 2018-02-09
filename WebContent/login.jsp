<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./layui/css/layui.css" media="all">
<script type="text/javascript" src="./layui/layui.js"></script>
<script type="text/javascript" src="./js/jquery/jquery-3.2.1.min.js"></script>
</head>
<script type="text/javascript" charset="UTF-8">
	layui.use(['form','element'], function() {
		var element = layui.element,
		form = layui.form;
	});
</script>
<body>
	<form class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/login" method="post">
		<div class="layui-form-item">
			<label class="layui-form-label">用户名</label>
			<div class="layui-input-inline">
				<input type="text" name="username" lay-verify="required"
					placeholder="请输入用户名" autocomplete="off" class="layui-input">
			</div>
			<br><br><br>
			<label class="layui-form-label">密  码</label>
			<div class="layui-input-inline">
				<input type="password" name="password" lay-verify="required"
					placeholder="请输入密码" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<button class="layui-btn" lay-submit="" lay-filter="demo2">登录</button>
		</div>
	</form>
</body>
</html>