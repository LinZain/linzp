<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>

<jsp:include page="../js_inc.jsp"></jsp:include>

<script type="text/javascript" charset="UTF-8">
	layui.use([ 'form' ], function() {
		var layer = layui.layer, form = layui.form;
	});

	function queryFunc() {
		tableInit();
	}
	function tableInit() {
		$("#commodityManagementTable").bootstrapTable('destroy'); 
		$('#commodityManagementTable')
				.bootstrapTable(
						{
							ajax : function(request) {
								$
										.ajax({
											type : "post",
											url : "${pageContext.request.contextPath}/order/queryOrder",
											data : {
												type : $('#keyWord').val()
											},
											dataType : "json",
											cache : false,
											success : function(msg) {
												request.success({
													row : msg
												});
												$('#commodityManagementTable')
														.bootstrapTable('load',
																msg);
											},
											error : function() {
												alert("错误");
											}
										});
							},
							columns : [ {
								field : 'stuName',
								halign : 'center',
								align : 'center',
								title : '学生姓名'
							}, {
								field : 'stuNO',
								halign : 'center',
								align : 'center',
								title : '学生学号',
							}, {
								field : 'stuSex',
								halign : 'center',
								align : 'center',
								title : '学生性别',
							} ],
							classes : 'table table-hover',
							sortOrder : 'asc',
							pagination : true,
							sidePagination : 'server',
							clickToSelect : true,
							pageNumber : 1,
							pageSize : 10,
							pageList : [ 10, 20 ],
							cache : false
						});
	}

	function testButton() {
		$.ajax({
			type : "get",
			url : "${pageContext.request.contextPath}/jiyu/saveOrder",
			data:{
				customerName : "aaaa",
				customerPhone : "12345678912",
				customerAddress : "上海市",
				customerTpye : "1"
			},
			success : function(json) {
				alert("success");
			},
			error : function(json) {
				alert("error");
			}
		});
	}
	
	function queryButton() {
		$.ajax({
			type : "get",
			url : "${pageContext.request.contextPath}/jiyu/queryOrder",
			dataType : "json",
			success : function(json) {
				console.info(json);
			},
			error : function(json) {
				console.info("error");
			}
		});
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
					href="javascript:change('./change','product/productList')">商品列表</a></li>
				<li class="layui-nav-item"><a
					href="javascript:change('./change','product/productManagement')">商品管理</a></li>
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
			<form class="layui-form layui-form-pane">
				<div class="layui-form-item">
					<div class="layui-inline">
						<div class="layui-input-inline">
							<input type="text" id="keyWord" placeholder="请输入关键字"
								class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">单行选择框</label>
						<div class="layui-input-block">
							<select name="type" lay-filter="aihao" id="aihao">
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
						<button id="queryOrder"class="layui-btn"  type="button" onclick="queryFunc()">搜索</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
				<table class="table table-striped" id="commodityManagementTable">
				</table>
			</form>
			<button id="testButton" onclick="testButton()">保存订单</button>
			<button id="testButton" onclick="queryButton()">查询订单</button>
		</div>
	</div>
</body>
</html>