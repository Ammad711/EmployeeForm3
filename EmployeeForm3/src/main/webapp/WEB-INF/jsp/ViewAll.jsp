<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View All Employees</h1>
ID Name Phone Email <br/>
<c:forEach items="${emps }" var="t">
<c:out value="${t.id}"></c:out> <c:out value="${t.name}"></c:out>
 <c:out value="${t.phone}"></c:out> <c:out value="${t.email}"></c:out><br/>
</c:forEach></br></br>
<a href=/EmployeeForm3/employeeform>Back To Employee Form...</a>
</body>
</html>