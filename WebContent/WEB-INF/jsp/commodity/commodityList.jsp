<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./layui/css/layui.css">
<script type="text/javascript" src="./layui/layui.js"></script>
<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="./js/jsp/index.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript" charset="UTF-8">
	layui.use('element', function() {
		var element = layui.element;
	});

	$(document).ready(function() {
		queryCommodity(null);
	});

	function queryCommodity(comtype) {
		$.ajax({
			type : "post",
			url : "${pageContext.request.contextPath}/queryCom",
			data : {
				type : comtype
			},
			dataType : "json",
			success : function(json) {
				gril = eval(json.rows);
				var str = "";
				for (i in gril) {
					str += "<tr>" + "<td>" + gril[i].stuNO + "</td>" + "<td>"
							+ gril[i].stuName + "</td>" + "<td>"
							+ gril[i].stuSex + "</td>" + "</tr>";
				}
				$("#stuInfoTable").html(str);
			},
			error : function() {
				$("#stuInfoTable").html("<td>未查询到结果</td>");
			}
		});
	}
</script>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<!-- 头部区域（可配合layui已有的水平导航） -->
		<div class="layui-header">
			<div class="layui-logo">
				<a href="javascript:change('./change','index')" style="color: white;">BOLL6电商管理系统</a>
			</div>
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item layui-this"><a
					href="javascript:change('./change','commodity/commodityList')">商品列表</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','commodity/commodityManagement')">商品管理</a></li>
				<li class="layui-nav-item"><a
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

		<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item"><a class=""
						href="javascript:queryCommodity(null)">所有商品</a></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">新潮热款</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:queryCommodity(Jan)">一月</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Feb)">二月</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(March)">三月</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">上装</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:queryCommodity(Hoodie)">卫衣</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Jacket)">夹克</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Coat)">大衣</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(DownCoat)">羽绒服</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Tshirt)">T恤</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">下装</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:queryCommodity(Sweatpants)">运动裤</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Casualpants)">休闲裤</a>
							</dd>
							<dd>
								<a href="javascript:queryCommodity(Jeans)">牛仔裤</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>
		<div class="layui-body">
			<table class="layui-table">
				<thead>
					<tr>
						<th>学号</th>
						<th>姓名</th>
						<th>性别</th>
					</tr>
				</thead>
				<tbody id="stuInfoTable"></tbody>
			</table>
		</div>
	</div>
</body>
</html>