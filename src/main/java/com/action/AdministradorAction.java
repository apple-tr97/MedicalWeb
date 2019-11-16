package com.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.AdministradorBean;
import com.bean.MedicoBean;
import com.bean.PacienteBena;
import com.dao.DAOAdministrador;
import com.dao.DAOMedico;
import com.dao.DAOPaciente;
import com.dao.impl.DAOAdministrador_Impl;
import com.dao.impl.DAOMedico_Impl;
import com.dao.impl.DAOPaciente_Impl;
import com.opensymphony.xwork2.ActionSupport;

public class AdministradorAction extends ActionSupport{
    private int id;
    private AdministradorBean administrador;
    private PacienteBena paciente;
    private MedicoBean medico;
	private ArrayList<PacienteBena> buffer_pacientes;
	private ArrayList<MedicoBean> buffer_medicos;

	public PacienteBena getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteBena paciente) {
		this.paciente = paciente;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AdministradorBean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(AdministradorBean administrador) {
		this.administrador = administrador;
	}

	public MedicoBean getMedico() {
		return medico;
	}

	public void setMedico(MedicoBean medico) {
		this.medico = medico;
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
        
		public String init() { return "success";}
        
        public String crearAdmin() {
        	System.out.println("Entro a crear");
            String resultado = "";
            DAOAdministrador daoAdmin = new DAOAdministrador_Impl();
            try {
            	System.out.println("Entro en el try");
                resultado = daoAdmin.registrarAdministrador(administrador);
                System.out.println("resultado: "+resultado);
            } catch (Exception e) {
                resultado = ERROR;
                e.printStackTrace();
            }
            return resultado;
        }

	public String crearPaciente() {
		System.out.println("Entro a crear");
		String resultado = "";
		DAOAdministrador daoAdmin = new DAOAdministrador_Impl();
		try {
			System.out.println("Entro en el try");
			resultado = daoAdmin.registrarPaciente(paciente);
			System.out.println("resultado: "+resultado);
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
