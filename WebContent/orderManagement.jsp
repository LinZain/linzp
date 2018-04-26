<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" charset="UTF-8">
	function testButton() {
		$.ajax({
			type : "get",
			url : "${pageContext.request.contextPath}/pdt/getPdtByGroupId",
			data : {
				groupId : "1",
			},
			success : function(json) {
				console.info(JSON.stringify(json));
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
				gril = eval(json.rows);
				var str = "";
				for (i in gril) {
					str += gril[i].customerName + gril[i].customerPhone
							+ gril[i].customerAddress + gril[i].customerType
							+ "<br>";
				}
				$("#queryOrderP").html(str);
			},
			error : function(json) {
				console.info("error");
			}
		});
	}
</script>
<body>
	<button id="testButton" onclick="testButton()">保存订单</button>
	<button id="testButton" onclick="queryButton()">查询订单</button>
	<p id="queryOrderP"></p>
</body>
</html>