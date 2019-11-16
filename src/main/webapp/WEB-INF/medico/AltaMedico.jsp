<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta Medico</title>
</head>
<body>

<s:form action="altaMedico_fin">
						
						<h1>Alta Medico </h1>
						<s:textfield name="medico.nombre" label="Nombre" />
						<s:textfield name="medico.apellido" label="Apellido" />
						<s:textfield name="medico.mail" label="Mail" />
						<s:textfield name="medico.password" label="Password"/>
						<s:textfield name="medico.cedula" label="Cedula"/>
						<s:textfield name="medico.equipo" label="Equipo"/>
						<s:textfield name="medico.especialidad" label="Especialidad"/>
						<s:textfield name="medico.universidad" label="Universidad"/>
						<s:textfield name="medico.afiliacion" label="Afiliacion"/>
						
						
						 <s:submit value="Enviar"/> 
					</s:form>

</body>
</html>