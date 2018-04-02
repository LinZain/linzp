<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../js_inc.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<script type="text/javascript" charset="UTF-8">
	layui.use('element', function() {
		var element = layui.element;
	});

	function queryStuInfo() {
		$.ajax({
			type : "post",
			url : "${pageContext.request.contextPath}/stuInfo",
			dataType : "json",
			success : function(json) {
				gril = eval(json.rows);
				var str = "";
				for (i in gril) {
					str += "<tr>" + "<td>" + gril[i].stuNO + "</td>" + "<td>"
							+ gril[i].stuName + "</td>" + "<td>"
							+ gril[i].stuSex + "</td>" + "</tr>";
				}
				$("#commodityManagementTable").html(str);
			},
			error : function() {
				$("#commodityManagementTable").html("<td>未查询到结果</td>");
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
				<li class="layui-nav-item"><a
					href="javascript:change('./change','commodity/commodityList')">商品列表</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','commodity/commodityManagement')">商品管理</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','order/orderManagement')">订单管理</a></li>
				<li class="layui-nav-item layui-this"><a
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
					<li class="layui-nav-item"><a class="" href="javascript:;">商品导航</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">一层主题</a>
							</dd>
							<dd>
								<a href="javascript:;">二层主题</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">商品标签</a></li>
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
				<tbody id="commodityManagementTable"></tbody>
			</table>
		</div>
	</div>
</body>
</html>