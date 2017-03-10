package com.ipartek.formacion.ws;

import java.io.Serializable;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaMensaje implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pelicula pelicula;
	private String mensaje;
	public PeliculaMensaje() {
		super();
		pelicula=null;
		mensaje="";
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	

}
