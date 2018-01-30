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

	$(document).ready(function() {
		queryStuInfo();
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
				$("#stuInfoTable").html(str);
			},
			error : function() {
				$("#stuInfoTable").html("<td>未查询到结果</td>");
			}
		});
	}
</script>
<body>
	<div>
		<ul class="layui-nav" lay-filter="">
			<li class="layui-nav-item"><a href="">最新活动</a></li>
			<li class="layui-nav-item"><a href="">产品</a></li>
			<li class="layui-nav-item"><a href="">大数据</a></li>
			<li class="layui-nav-item"><a href="javascript:;">解决方案</a>
				<dl class="layui-nav-child">
					<dd>
						<a href="">移动模块</a>
					</dd>
					<dd>
						<a href="">后台模版</a>
					</dd>
					<dd>
						<a href="">电商平台</a>
					</dd>
				</dl></li>
			<li class="layui-nav-item"><a href="">社区</a></li>
		</ul>
	</div>
	<div class="layui-tab layui-tab-brief">
		<ul class="layui-tab-title">
			<li>网站设置</li>
			<li>用户管理</li>
			<li>权限分配</li>
			<li>商品管理</li>
			<li>订单管理</li>
		</ul>
		<div class="layui-tab-content">
			<div class="layui-tab-item">内容2</div>
			<div class="layui-tab-item">内容3</div>
			<div class="layui-tab-item">内容4</div>
			<div class="layui-tab-item">内容5</div>

			<div class="layui-tab-item">
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
	</div>
</body>
</html>