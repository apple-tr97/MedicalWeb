package com.action;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.MedicoBean;
import com.bean.PacienteBena;
import com.dao.DAOMedico;
import com.dao.DAOPaciente;
import com.dao.impl.DAOMedico_Impl;
import com.dao.impl.DAOPaciente_Impl;
import com.opensymphony.xwork2.ActionSupport;

public class AdministradorAction extends ActionSupport{
	private ArrayList<PacienteBena> buffer_pacientes;
	private ArrayList<MedicoBean> buffer_medicos;
	
	public ArrayList<PacienteBena> getBuffer_pacientes() {
		return buffer_pacientes;
	}

	public void setBuffer_pacientes(ArrayList<PacienteBena> buffer_pacientes) {
		this.buffer_pacientes = buffer_pacientes;
	}	

	public ArrayList<MedicoBean> getBuffer_medicos() {
		return buffer_medicos;
	}

	public void setBuffer_medicos(ArrayList<MedicoBean> buffer_medicos) {
		this.buffer_medicos = buffer_medicos;
	}
	

	public String consultarPacientes() {
		DAOPaciente daoPaciente = new DAOPaciente_Impl();
		
		try {
			this.buffer_pacientes = daoPaciente.consultar();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String consultarDoctores() {
		DAOMedico daoMedico = new DAOMedico_Impl();
		
		try {
			this.buffer_medicos = daoMedico.consultar();
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
=======
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

    public AdministradorBean getAdmin() {
        return administrador;
    }

    public void setAdmin(AdministradorBean administrador) {
        this.administrador = administrador;
    }
    public String init() { return "success";}
    public String crearAdmin() {
        String resultado = "";
        DAOAdministrador daoAdmin = new DAOAdministrador_Impl();
        try {
            resultado = daoAdmin.registrarAdministrador(administrador);
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
>>>>>>> f80bb2bd741cf33fe49583b3806e3d68fe11695a
}
