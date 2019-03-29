<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/post/add" method="post" modelAttribute="postdetails">
		Title
		<input type="hidden"  name="title" value="${postdetails.title}">
		
				Category 
		<input type="text" name="category">
		
				Zipcode
		<input type="text" name="zipcode">
		
				Address
		<input type="text" name="address"> <!--  Use Radio Button For Gender -->
		
				City
		<input type="text" name="city">
		
				Short Description
		<input type="text" name="shortdescription">
		
		
						Date
		<input type="date" name="date">
		<!-- Picture
			<input type="file" name="picture"> -->
		
		<button type="submit">Submit</button>
	</form>
</body>
</html>