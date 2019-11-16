package com.dao.impl;

import com.bean.AdministradorBean;
import com.bean.MedicoBean;
import com.dao.DAOAdministrador;
import com.database.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOAdministrador_Impl extends Conexion implements DAOAdministrador{
	private AdministradorBean administrador;

	public AdministradorBean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(AdministradorBean administrador) {
		this.administrador = administrador;
	}

	@Override
	public String registrarAdministrador(AdministradorBean administrador) throws Exception{
		String respuesta = "";
		Connection conn = null;
		establishConnection();
		conn = getCon();
		String sql = "INSERT INTO Administrador(nombre,apellido,mail,password) VALUES(?,?,?,?)";
		String sql2 = "INSERT INTO Usuario(email,password,tipo) VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		PreparedStatement ps2 = conn.prepareStatement(sql2);
		ps.setString(1,administrador.getNombre());
		ps.setString(2,administrador.getApellido());
		ps.setString(3,administrador.getMail());
		ps.setString(4,administrador.getPassword());
		ps2.setString(1,administrador.getMail());
		ps2.setString(2,administrador.getPassword());
		ps2.setString(3,""+"Administrador");
		ResultSet rs = ps.executeQuery();
		ResultSet rs2 = ps2.executeQuery();
		if(rs.next()) {
			if(rs2.next()) {
				respuesta = rs.getString(1);
			}else {
				respuesta = "error2";
			}
		}else {
			respuesta = "error1";
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

	@Override
	public String registrarDoctor(MedicoBean medico) throws Exception {
		String respuesta = "";
		Connection conn = null;
		establishConnection();
		conn = getCon();
		String sql = "INSERT INTO Administrador(nombre,apellido,cedula,equipo,universidad,afiliacion,especialidad,mail,password) VALUES(?,?,?,?,?,?,?,?,?)";
		String sql2 = "INSERT INTO Usuario(email,password,tipo) VALUES(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		PreparedStatement ps2 = conn.prepareStatement(sql2);
		ps.setString(1,medico.getNombre());
		ps.setString(2,medico.getApellido());
		ps.setString(3,medico.getCedula());
		ps.setString(4,medico.getEquipo());
		ps.setString(5,medico.getUniversidad());
		ps.setString(6,medico.getAfiliacion());
		ps.setString(7,medico.getEspecialidad());
		ps.setString(8,medico.getMail());
		ps.setString(9,medico.getPassword());
		ps2.setString(1,medico.getMail());
		ps2.setString(2,medico.getPassword());
		ps2.setString(3,""+"Medico");
		int rs = ps.executeUpdate();
		int rs2 = ps2.executeUpdate();
		
		respuesta = "success";

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
