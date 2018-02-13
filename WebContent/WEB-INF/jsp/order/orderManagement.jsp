<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./layui/css/layui.css">
<script type="text/javascript" src="./layui/layui.js"></script>
<script type="text/javascript" src="./js/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="./js/jsp/index.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript" charset="UTF-8">
	layui
			.use(
					[ 'form', 'element', 'table' ],
					function() {
						var element = layui.element, layer = layui.layer, form = layui.form, table = layui.table;
					});

	table.render({
		elem : '#demo',
		height : 315,
		url: './order/orderTable',
		page : true,
		cols : [ [ //表头
		{
			field : 'stuNO',
			title : '学号',
			width : 200,
			sort : true,
			fixed : 'left'
		}, {
			field : 'stuName',
			title : '姓名',
			width : 200
		}, {
			field : 'stuSex',
			title : '性别',
			width : 200,
			sort : true
		} ] ]
	});

	function query() {
		var select;
		form.on('select(aihao)', function(data) {
			select = data.value; //得到美化后的DOM对象
		});
		alert(select);
	}
</script>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<div class="layui-header">
			<div class="layui-logo">
				<a href="javascript:change('./change','index')"
					style="color: white;">BOLL6电商管理系统</a>
			</div>
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a
					href="javascript:change('./change','commodity/commodityList')">商品列表</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','commodity/commodityManagement')">商品管理</a></li>
				<li class="layui-nav-item layui-this"><a
					href="javascript:change('./change','order/orderManagement')">订单管理</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','system/systemManagement')">用户管理</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','user/userManagement')">系统管理</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">控制台</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
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
		<br>
		<div>
			<form class="layui-form layui-form-pane" action="./order/queryOrder" method="post">
				<div class="layui-form-item">
					<div class="layui-inline">
						<div class="layui-input-inline">
							<input type="text" name="keyWord" lay-verify="required"
								placeholder="请输入关键字" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">单行选择框</label>
						<div class="layui-input-block">
							<select name="type" lay-filter="aihao">
								<option value="">请选择类型</option>
								<option value="0">写作</option>
								<option value="1">阅读</option>
								<option value="2">游戏</option>
								<option value="3">音乐</option>
								<option value="4">旅行</option>
							</select>
						</div>
					</div>
					<div class="layui-inline">
						<button class="layui-btn" lay-submit lay-filter="formDemo">搜索</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
			<table class="layui-table" id="demo">
				<tbody id="commodityManagementTable"></tbody>
			</table>
		</div>
	</div>
</body>
</html>