<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country: 
		<form:select path="country">
			<form:option value="India" label="India"></form:option>
			<form:option value="Oman" label="Oman"></form:option>
			<form:option value="Saudi" label="Saudi"></form:option>
			<form:option value="Canada" label="Canada"></form:option>
			<form:option value="USA" label="USA"></form:option>
		</form:select>
		
		<br><br>
		
		Gender:
		Male<form:radiobutton path="gender" value="Male"/>
		Female<form:radiobutton path="gender" value="Female"/>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>











