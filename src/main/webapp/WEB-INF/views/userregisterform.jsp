<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.servletContext.contextPath}/register/usersave" method="post" modelAttribute="userregister">
		Email
		<input type="email" name="emailid">
		
				First 
		<input type="text" name="firstname">
		
				Last
		<input type="text" name="lastname">
		
				Gender
		<input type="text" name="gender"> <!--  Use Radio Button For Gender -->
		
				age
		<input type="number" name="age">
		
				password
		<input type="password" name="password">
		
		
						Last
		<input type="text" name="role" value="ROLE_USER"> <!-- Hide Role Input Field  -->
		
		<button type="submit">Submit</button>
	</form>
	
</body>
</html>