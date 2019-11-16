package com.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.PacienteBena;
import com.dao.DAOPaciente;
import com.database.Conexion;

public class DAOPaciente_Impl extends Conexion implements DAOPaciente{

	@Override
	public ArrayList<PacienteBena> consultar() throws Exception {
		String ret = "error";
		ArrayList<PacienteBena> buffer_pacientes = new ArrayList<PacienteBena>();
		
	      Connection conn = null;
	      
	    	 establishConnection();
	         conn = getCon();
	         String sql = "SELECT * FROM paciente";
	         Statement statement = conn.createStatement();
	         ResultSet rs = statement.executeQuery(sql);

	         while (rs.next()) {
	        	 PacienteBena pacienteAux = new PacienteBena();
	        	 pacienteAux.setId_paciente(Integer.parseInt(rs.getString(1)));
	        	 pacienteAux.setNombre(rs.getString(2));
	        	 pacienteAux.setApellido(rs.getString(3));	            
	        	 pacienteAux.setSs(Integer.parseInt(rs.getString(4)));
	        	 pacienteAux.setPoliza(rs.getString(5));
	        	 pacienteAux.setMail(rs.getString(6));
	        	 pacienteAux.setPassword(rs.getString(7));
	            
	            buffer_pacientes.add(pacienteAux);
	         }

	         if (conn != null) {
	            try {
	               closeConnection();
	            } catch (Exception e) {
					e.printStackTrace();
	            }
	         }
	      
	      return buffer_pacientes;
	}

}
