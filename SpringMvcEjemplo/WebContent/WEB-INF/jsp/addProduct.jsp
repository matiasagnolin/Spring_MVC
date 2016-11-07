<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Crear producto</h1>
	<h2>Usuario: ${name}</h2>
	
	<form:form method="POST" action="${pageContext.request.contextPath}/addProductSuccess">
	<table>
		<tr>
		        <td><form:label path="description">Descripcion</form:label></td>
		        <td><form:input path="description" /></td>
		    </tr>
		    <tr>
		        <td><form:label path="amount">Cantidad</form:label></td>
		        <td><form:input path="amount" /></td>
		    </tr>
		    <tr>
		        <td colspan="2">
		            <input type="submit" value="Submit"/>
		        </td>
		    </tr>
		</table>
	</form:form>
	
</body>
</html>