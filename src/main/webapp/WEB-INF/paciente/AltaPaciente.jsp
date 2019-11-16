<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta Paciente</title>
</head>
<body>

<s:form action="altaPaciente">
						
						<h1>Alta Paciente </h1>
						<s:textfield name="paciente.nombre" label="Nombre:" />
						<s:textfield name="paciente.apellido" label="Apellido:" />
						<s:textfield name="paciente.mail" label="Mail:" />
						<s:textfield name="paciente.password" label="Password:"/>
						
						
						 <s:submit value="Enviar"/> 
					</s:form>

</body>
</html>