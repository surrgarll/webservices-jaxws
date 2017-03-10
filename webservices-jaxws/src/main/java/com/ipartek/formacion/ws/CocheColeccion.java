package com.ipartek.formacion.ws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheColeccion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Coche> coches;

	public CocheColeccion() {
		super();
		coches=new ArrayList<Coche>();
	}

	public List<Coche> getCoches() {
		return coches;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	

}
