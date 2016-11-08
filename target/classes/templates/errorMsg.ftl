<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<#list errorMsgs as errorMsg>
		<tr>
			<td>${errorMsg.serviceName}</td>
			<td>${errorMsg.timestamp?string("yyyy-MM-dd HH:mm:ss")}</td>
			<td><a href="/errormsg/${errorMsg.msgId}">detail</a></td>
		</tr>
	</#list>
</table>
</body>
</html>