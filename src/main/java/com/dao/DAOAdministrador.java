package com.dao;

import com.bean.AdministradorBean;
import com.bean.MedicoBean;

public interface DAOAdministrador {
	public String registrarAdministrador(AdministradorBean administrador) throws Exception;
	public String registrarDoctor(MedicoBean medico) throws Exception;
	/*public registrarPaciente();
	public crearRecetas()*/
	//crearHistorialMedico()
	
	/*public consultarHistorialesMedicos()
	public consultarRecetas();
	public consultarPacientes();
	public consultarMedico();
	consultarPacientesPorMedico
	consultarHistorialMedicoPorPaciente
	consultarRecetasPorPaciente();
	consultarRecetasPorMedico();*/
	
}
