<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

	<s:form action="details">
		<s:textfield type="text" name="student.studentName" label="StudentName"></s:textfield>
		<s:textfield type="text" name="student.studentId" label="StudentId"></s:textfield>
		<s:textfield type="text" name="student.mobileNumber" label="MobileNumber"></s:textfield>
		<s:textfield type="email" name="student.email" label="Email"></s:textfield>
		<s:submit value="submit">Submit</s:submit>
	</s:form>


</body>
</html>