<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form:form modelAttribute="userLogin" action="login.do" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><form:input path="username" />
			</tr>

			<tr>
				<td>Password</td>
				<td><form:password path="password" />
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>