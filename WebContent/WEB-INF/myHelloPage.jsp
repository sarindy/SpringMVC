<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">


<title>My Hello Page</title>
</head>


<body>

	 <h1>${myWelcomeMessage}</h1> 
	<br />

	<table>
		<c:forEach items="${myLists}" var="list">
			<tr>
				<td>ID : <c:out value="${list}" /></td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>