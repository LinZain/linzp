<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- jquery -->
<link rel="stylesheet" href="./plugin/layui/css/layui.css">
<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
<!-- layui -->
<script type="text/javascript" src="./plugin/layui/layui.js"></script>
<!-- Bootstrap table -->
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet"
	href="./plugin/bootstrap-table/bootstrap-table.min.css">
<script type="text/javascript" src="./js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="./plugin/bootstrap-table/bootstrap-table.min.js"></script>

<script type="text/javascript" src="./js/jsp/index.js"></script>

<script type="text/javascript">
	/**
	 * 字符串对象是否不为空
	 */
	function isNotNull(val) {
		console.info(val);
		if (val !== null && val !== undefined && val !== '') {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 页面跳转
	 */
	function change(changeUrl, url) {
		var myForm = document.createElement("form");
		myForm.method = "post";
		myForm.action = changeUrl;
		var myInput = document.createElement("input");
		myInput.setAttribute("name", "url"); // 为input对象设置name
		myInput.setAttribute("value", url); // 为input对象设置value
		myForm.appendChild(myInput);
		document.body.appendChild(myForm);
		myForm.submit();
		document.body.removeChild(myForm);
	}
</script>
