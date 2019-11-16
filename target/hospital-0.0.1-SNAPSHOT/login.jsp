<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
	<title>Login</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>
		<s:form action="validar_usuario">
   			<s:textfield label="Username" name="email"/>
  		 		<s:password label="Password" name="password" />
  				<s:submit value="Ingresar"/>
		</s:form>
		
	</body>
</html>
