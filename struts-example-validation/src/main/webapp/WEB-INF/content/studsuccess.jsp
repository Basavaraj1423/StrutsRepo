<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Details</h1>
Name:${student.name }<br>
City:${student.city }<br>
Age:${student.age }<br>
Allowance:${student.allowance }<br>
Courses:${student.course }<br>
Gender:${student.gender }<br>
Email:${student.email }<br>
Hobby:${student.hobby }<br>
</body>
</html>