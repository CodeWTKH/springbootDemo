<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
			<td>${errorMsg.serviceName}</td>
			<td>${errorMsg.errorMessage}</td>
			<td>${errorMsg.serviceStack}</td>
			<td>${errorMsg.timestamp?string("yyyy-MM-dd HH:mm:ss")}</td>
		</tr>
</table>
</body>
</html>