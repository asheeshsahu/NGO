<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NGO</title>
</head>
<body>
	<table>
  <tr>
    <th>title</th>
    <th>category</th>
    <th>zipcode</th>
    <th>city</th>
    <th>address</th>
    <th>short description</th>
    <th>date</th>
  </tr>
  <c:forEach var="post" items="${eventslist}">
  
  <c:url var="deleteLink" value="/homengo/userpostdelete">
		<c:param name="title" value="${post.title}"></c:param>
  </c:url>
  
    <c:url var="updateLink" value="/homengo/userpostupdate">
		<c:param name="title" value="${post.title}"></c:param>
  </c:url>
  
  <c:url var="subscribeLink" value="/homengo/subscribe">
		<c:param name="title" value="${post.title}"></c:param>
  </c:url>
  
  <tr>
    <td>${post.title}</td>
    <td>${post.category}</td>
    <td>${post.zipcode}</td>
    <td>${post.city}</td>
    <td>${post.address}</td>
    <td>${post.shortdescription}</td>
    <td>${post.date}</td>
  	<td><a href="${deleteLink}"><button>Delete</button></td></a>
  	<td><a href="${updateLink}"><button>Update</button></td></a>
  	<td><a href="${subscribeLink}"><button>Subscribe</button></td></a>
  </tr>
  </c:forEach>
</table>
<a href="${pageContext.servletContext.contextPath}/logout"><button>logout</button></a>
</body>
</html>