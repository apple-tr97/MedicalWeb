package com.action;

import com.bean.AdministradorBean;
import com.dao.DAOAdministrador;
import com.dao.impl.DAOAdministrador_Impl;
import com.opensymphony.xwork2.ActionSupport;

public class AdministradorAction extends ActionSupport {
    private int id;
    private AdministradorBean administrador;

    public AdministradorBean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorBean administrador) {
        this.administrador = administrador;
    }

    public String crearAdmin() {
        String resultado = "";
        DAOAdministrador daoAdmin = new DAOAdministrador_Impl();
        try {
        	System.out.println("Usuario: "+getAdministrador());
            resultado = daoAdmin.registrarAdministrador(getAdministrador());
            
        } catch (Exception e) {
            resultado = ERROR;
            e.printStackTrace();
        }
        return resultado;
    }
}
