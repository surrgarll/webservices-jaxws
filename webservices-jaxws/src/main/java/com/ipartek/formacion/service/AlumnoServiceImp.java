package com.ipartek.formacion.service;


import java.util.HashMap;
import java.util.Map;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoServiceImp implements AlumnoService {

	private Map<Integer,Alumno> alumnos;
	
	public AlumnoServiceImp() {
		init();
	}
	private void init() {
		alumnos=new HashMap<Integer,Alumno>();
		
		Alumno alumno=new Alumno();
		alumno.setCodigo(0);
		alumno.setApellidos("Apell0 Apell0");
		alumno.setNombre("Nombre0");
		alumno.setDni("12345678A");
		alumno.setEmail("email0@prueba.es");
		alumnos.put(alumno.getCodigo(), alumno);
		
		alumno=new Alumno();
		alumno.setCodigo(1);
		alumno.setApellidos("Apell1 Apell1");
		alumno.setNombre("Nombre1");
		alumno.setDni("12345678B");
		alumno.setEmail("email1@prueba.es");
		alumnos.put(alumno.getCodigo(), alumno);
		
	}

	@Override
	public Map<Integer,Alumno> getAll() {
		return alumnos;
	}

	@Override
	public Alumno getById(Integer codigo) {
		return alumnos.get(codigo);
	}

}
