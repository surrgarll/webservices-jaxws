package com.ipartek.formacion.ws;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaColeccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Pelicula> peliculas;
	private String mensaje;
	public PeliculaColeccion() {
		super();
		peliculas=new TreeSet<Pelicula>();
		mensaje="";
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	

}
