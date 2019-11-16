package com.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.MedicoBean;
import com.bean.PacienteBena;
import com.dao.DAOMedico;
import com.database.Conexion;

public class DAOMedico_Impl extends Conexion implements DAOMedico{

	@Override
	public ArrayList<MedicoBean> consultar() throws Exception {		
		String ret = "error";
		ArrayList<MedicoBean> buffer_medicos = new ArrayList<MedicoBean>();
		
	      Connection conn = null;
	      
	    	 establishConnection();
	         conn = getCon();
	         String sql = "SELECT * FROM medico";
	         Statement statement = conn.createStatement();
	         ResultSet rs = statement.executeQuery(sql);

	         while (rs.next()) {
	        	 MedicoBean medicoAux = new MedicoBean();
	        	 medicoAux.setId_medico(Integer.parseInt(rs.getString(1)));
	        	 medicoAux.setNombre(rs.getString(2));
	        	 medicoAux.setApellido(rs.getString(3));	
	        	 medicoAux.setCedula(rs.getString(4));
	        	 medicoAux.setEquipo(rs.getString(5));
	        	 medicoAux.setUniversidad(rs.getString(6));
	        	 medicoAux.setAfiliacion(rs.getString(7));
	        	 medicoAux.setEspecialidad(rs.getString(8));
	        	 medicoAux.setMail(rs.getString(9));
	        	 medicoAux.setPassword(rs.getString(10));
	            
	            buffer_medicos.add(medicoAux);
	         }

	         if (conn != null) {
	            try {
	               closeConnection();
	            } catch (Exception e) {
					e.printStackTrace();
	            }
	         }
	      
	      return buffer_medicos;
	}

}
