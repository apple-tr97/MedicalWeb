package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class UsuarioAction extends ActionSupport{
	
	public String validarLoginYRedireccionar() {
		
		//return "Usuario";
		//return "Medico";
		//return "Error";
		return "Administrador";
	}

}
