<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>

	<form:form method="post" modelAttribute="userDetails" action="updateUser">
		<table>
			
			<tr>
				<td>Id</td>
				<td><form:input path="id" /></td>
			</tr>
		
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><form:input path="address" /></td>
			</tr>

			<tr>
				<td>Hobbies</td>
				<td><form:checkboxes path="hobbies" items="${hobbies}"/></td>
			</tr>

			<tr>
				<td>Interest</td>
				<td><form:radiobuttons path="interest" items="${interests}"/></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>


</body>
</html>