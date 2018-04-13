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

	$(document).ready(function() {
		queryFunc()
	});

	function queryFunc() {
		tableInit();
	}
	function tableInit() {
		$("#productTable").bootstrapTable('destroy');
		$('#productTable')
				.bootstrapTable(
						{
							ajax : function(request) {
								$
										.ajax({
											type : "get",
											url : "${pageContext.request.contextPath}/queryPdt",
											data : {
												type : $('#keyWord').val()
											},
											dataType : "json",
											cache : false,
											success : function(msg) {
												request.success({
													row : msg
												});
												$('#productTable')
														.bootstrapTable('load',
																msg);
											},
											error : function() {
												alert("错误");
											}
										});
							},
							columns : [ {
								field : 'pdtId',
								halign : 'center',
								align : 'center',
								title : '产品编号'
							}, {
								field : 'pdtPic',
								halign : 'center',
								align : 'center',
								title : '产品图片',
							}, {
								field : 'pdtTitle',
								halign : 'center',
								align : 'center',
								title : '产品主题',
							}, {
								field : 'pdtPrice',
								halign : 'center',
								align : 'center',
								title : '产品价格',
							}, {
								field : 'promotionPrice',
								halign : 'center',
								align : 'center',
								title : '打折价格',
							}, {
								field : 'pdtBrand',
								halign : 'center',
								align : 'center',
								title : '产品商标',
							}, {
								field : 'pdtCategory',
								halign : 'center',
								align : 'center',
								title : '产品类别',
							}, {
								field : 'pdtDetial',
								halign : 'center',
								align : 'center',
								title : '产品详情',
							}, {
								field : 'pdtDescribe',
								halign : 'center',
								align : 'center',
								title : '产品描述',
							}, {
								field : 'pdtInventory',
								halign : 'center',
								align : 'center',
								title : '产品库存',
							}, {
								field : 'pdtStatus',
								halign : 'center',
								align : 'center',
								title : '产品状态',
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
						href="javascript:queryCommodity('')">所有商品</a></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">新潮热款</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">一月</a>
							</dd>
							<dd>
								<a href="javascript:;">二月</a>
							</dd>
							<dd>
								<a href="javascript:;">三月</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">上装</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">卫衣</a>
							</dd>
							<dd>
								<a href="javascript:;">夹克</a>
							</dd>
							<dd>
								<a href="javascript:;">大衣</a>
							</dd>
							<dd>
								<a href="javascript:;">羽绒服</a>
							</dd>
							<dd>
								<a href="javascript:;">T恤</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a class="" href="javascript:;">下装</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">运动裤</a>
							</dd>
							<dd>
								<a href="javascript:;">休闲裤</a>
							</dd>
							<dd>
								<a href="javascript:;">牛仔裤</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>
		<div class="layui-body">
			<table class="table table-striped" id="productTable">
			</table>
		</div>
	</div>
</body>
</html>