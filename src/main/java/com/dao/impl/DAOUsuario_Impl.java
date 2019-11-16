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
	
	/*@Override
	public void insertar(PacienteBean paciente) throws Exception {
		Connection conn = null;
	      
   	 	establishConnection();
        conn = getCon();
        String sql = "INSERT INTO paciente (id_paciente, id_propietario, nombre, categoria, raza, edad)";
        sql+="VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        System.out.println("id_paciente: " + paciente.getId());
        System.out.println("id_propietario: " + paciente.getIdOwner());
        
        ps.setString(1, paciente.getId());
        ps.setString(2, paciente.getIdOwner());
        ps.setString(3, paciente.getName());
        ps.setString(4, paciente.getCategoria());
        ps.setString(5, paciente.getRaza());
        ps.setString(6, Integer.toString(paciente.getEdad()));
        
        ps.execute();

        if (conn != null) {
           try {
              closeConnection();
           } catch (Exception e) {
				e.printStackTrace();
           }
        }
		
	}*/
	
}
