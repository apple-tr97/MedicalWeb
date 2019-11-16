<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
	<title>Menu Admin</title>
	</head>
	<body>

						<s:url action="goto_crear_admin_jsp" var="goto_crear_admin"/>
						<s:url action="goto_login_jsp" var="goto_login"/>
						<s:url action="welcome" var="goto_welcome"/>
						 <a href="alta_administrador">Alta Administrador</a>
					   	 <a href="${goto_crear_admin}">Alta Paciente</a>
					   	 <a href="${goto_crear_admin}">Alta Doctor</a>
				
	</body>
</html>