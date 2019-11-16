package com.bean;

public class AdministradorBean {
	private int id_administrador;
	private String nombre;
	private String apellido;
	private String mail;
	private String password;
	public int getId_administrador() {
		return id_administrador;
	}
	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
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
}
