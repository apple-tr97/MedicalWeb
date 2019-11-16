<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<title>Lista Doctores</title>
</head>
<body>
	<h1>Lista Doctores</h1>
		<table border="1">
			<tr>
		      
		       <td><b>Id Doctor</b></td>
		       <td><b>Nombre</b></td>
		       <td><b>Apellido</b></td>
		       <td><b>Cedula</b></td>
		       <td><b>Equipo</b></td>	  
		       <td><b>Universidad</b></td>
		       <td><b>Afiliacion</b></td>
		       <td><b>Especialidad</b></td>
		       <td><b>Mail</b></td>
		       <td><b>Password</b></td>
		    </tr>
			<s:iterator value="buffer_medicos" status="i">
				<tr>
					<td><s:property value="id_medico"/></td>
					<td><s:property value="nombre"/></td>
					<td><s:property value="apellido"/></td>
					<td><s:property value="cedula"/></td>
					<td><s:property value="equipo"/></td>
					<td><s:property value="universidad"/></td>
					<td><s:property value="afiliacion"/></td>
					<td><s:property value="especialidad"/></td>
				</tr>
			</s:iterator>
		</table>
		<h4><a href="#">Regresar</a></h4>		
</body>
</html>
