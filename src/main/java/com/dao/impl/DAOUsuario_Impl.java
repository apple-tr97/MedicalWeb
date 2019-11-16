package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UsuarioBean;
import com.dao.DAOUsuario;
import com.database.Conexion;


public class DAOUsuario_Impl extends Conexion implements DAOUsuario{

	@Override
	public String buscarTipoDeUsuario(String email, String password) throws Exception{
		String respuesta = "";
		 Connection conn = null;
		 
    	 establishConnection();
         conn = getCon();
         String sql = "SELECT tipo FROM usuario WHERE";
         sql+=" email = ? AND password = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, email);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();
     	
         if(rs.next()) {
            respuesta = rs.getString(1);
         }else {
        	 respuesta = "error";
         }

         if (conn != null) {
            try {
               closeConnection();
            } catch (Exception e) {
				e.printStackTrace();
            }
         }
      
      return respuesta;
	}
	
}
