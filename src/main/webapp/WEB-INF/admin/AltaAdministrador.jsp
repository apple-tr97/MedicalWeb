<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta Administrador</title>
</head>
<body>

<s:form action="altaAdministrador">
						
						<h1>Alta Administrador</h1>
						<s:textfield name="administrador.nombre" label="Nombre:" />
						<s:textfield name="administrador.apellido" label="Apellido:" />
						<s:textfield name="administrador.mail" label="Mail:" />
						<s:textfield name="administrador.password" label="Password:"/>
						
						
						 <s:submit value="Enviar"/> 
					</s:form>

</body>
</html>