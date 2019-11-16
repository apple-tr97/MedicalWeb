package com.action;

import com.bean.AdministradorBean;
import com.bean.MedicoBean;
import com.dao.DAOAdministrador;
import com.dao.impl.DAOAdministrador_Impl;
import com.opensymphony.xwork2.ActionSupport;

public class AdministradorAction extends ActionSupport {
    private int id;
    private AdministradorBean administrador;
    private MedicoBean medico;

    public MedicoBean getMedico() {
        return medico;
    }

    public void setMedico(MedicoBean medico) {
        this.medico = medico;
    }

    public AdministradorBean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorBean administrador) {
        this.administrador = administrador;
    }
    public String init() { return "success";}
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

    public String crearMedico() {
        String resultado = "";
        DAOAdministrador daoAdmin = new DAOAdministrador_Impl();
        try {
            resultado = daoAdmin.registrarDoctor(medico);
        } catch (Exception e) {
            resultado = ERROR;
            e.printStackTrace();
        }
        return resultado;
    }
}
