package com.dao;

import java.util.ArrayList;

import com.bean.MedicoBean;
import com.bean.PacienteBena;

public interface DAOMedico {
	public ArrayList<MedicoBean> consultar() throws Exception;
}
