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

					<s:url action="welcome" var="regresar"/>
					<s:form action="validar_usuario">
		    			<s:textfield label="Username" name="usuario.usuarioID"/>
		   		 		<s:password label="Password" name="usuario.password" />
	    				<a class="more"> <s:submit value="Ingresar"/> </a>
					</s:form>
					<h4><a href="${regresar}">Regresar</a></h4>
		
	</body>
</html>
