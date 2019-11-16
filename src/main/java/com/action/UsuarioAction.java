package com.action;

import com.dao.DAOUsuario;
import com.dao.impl.DAOAdministrador_Impl;
import com.dao.impl.DAOUsuario_Impl;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport{
	private String email;
	private String password;
	
	
	
	public String validarLoginYRedireccionar() {
		String resultado = "";
		DAOUsuario daoUsuario = new DAOUsuario_Impl();
		
		try {
			resultado = daoUsuario.buscarTipoDeUsuario(email, password);
		} catch (Exception e) {
			resultado = ERROR;
			e.printStackTrace();
		}
		return resultado;
	}


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

}
