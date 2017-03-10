package com.ipartek.formacion.service;

import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Coche;

public class CocheServiceImp implements CocheService {
	Map<Integer,Coche> coches;
	
	public CocheServiceImp() {
		super();
		coches=new HashMap<Integer,Coche>();
		init();
	}

	private void init() {
		Coche coche=new Coche();
		coche.setCodigo(0);
		coche.setNombre("Renault Megan");
		coches.put(coche.getCodigo(), coche);
		
		coche=new Coche();
		coche.setCodigo(1);
		coche.setNombre("Renault Scenic");
		coches.put(coche.getCodigo(), coche);
		
		coche=new Coche();
		coche.setCodigo(2);
		coche.setNombre("ford focus");
		coches.put(coche.getCodigo(), coche);		
		
		
	}

	public Map<Integer, Coche> getAll() {
		return coches;
	}
	public Coche getById (Integer codigo){
		return coches.get(codigo);
	}

}
