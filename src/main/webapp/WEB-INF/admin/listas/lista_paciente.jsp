<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<title>Lista Pacientes</title>
</head>
<body>
	<h1>Lista Pacientes</h1>
		<table border="1">
			<tr>
		      
		       <td><b>Id Paciente</b></td>
		       <td><b>Nombre</b></td>
		       <td><b>Apellido</b></td>
		       <td><b>ID SS</b></td>
		       <td><b>Poliza</b></td>	  
		       <td><b>Mail</b></td>
		       <td><b>Password</b></td>
		    </tr>
			<s:iterator value="buffer_pacientes" status="i">
				<tr>
					<td><s:property value="id_paciente"/></td>
					<td><s:property value="nombre"/></td>
					<td><s:property value="apellido"/></td>
					<td><s:property value="ss"/></td>
					<td><s:property value="poliza"/></td>
					<td><s:property value="mail"/></td>
					<td><s:property value="password"/></td>
				</tr>
			</s:iterator>
		</table>
		<h4><a href="#">Regresar</a></h4>		
</body>
</html>
