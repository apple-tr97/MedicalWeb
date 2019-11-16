package com.dao;

import java.util.ArrayList;

import com.bean.PacienteBena;

public interface DAOPaciente {
	public ArrayList<PacienteBena> consultar() throws Exception;
}
