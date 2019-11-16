package com.bean;

import java.awt.*;

public class PacienteBena {
    private int id_paciente;
    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private String poliza;
    private int ss;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPoliza() {
		return poliza;
	}

	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }
}
