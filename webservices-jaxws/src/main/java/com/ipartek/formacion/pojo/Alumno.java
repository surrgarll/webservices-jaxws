package com.ipartek.formacion.pojo;

import java.io.Serializable;


public class Alumno implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String nombre;
	private String apellidos;
	private String dni;
	private String tfno;
	private String email;
	public Alumno() {
		super();
		codigo=-1;
		nombre="";
		apellidos="";
		dni="";
		tfno="";
		email="";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTfno() {
		return tfno;
	}
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
