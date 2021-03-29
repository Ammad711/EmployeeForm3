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
<h1>Employee Form</h1>
 <form action = "A" method = "POST">
         Enter Name - <input type = "text" name = "name"> Characters between 5 and 30
         <br /></br>
         Enter Age - <input type = "text" name = "age"> Age between 18 and 60
         <br /></br>
         Enter Email_ID - <input type = "text" name = "email" /> Valid Email ID</br></br> 
         Enter Phone_Number - <input type = "text" name = "phone" /> Phone Number should be in 10 digits</br></br>
         <input type = "submit" value = "Submit" />
      </form></br>
<a href=/EmployeeForm3/ViewAll>View All Employees</a>
<c:out value="${msg }"></c:out>
</body>
</html>