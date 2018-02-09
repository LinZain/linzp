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