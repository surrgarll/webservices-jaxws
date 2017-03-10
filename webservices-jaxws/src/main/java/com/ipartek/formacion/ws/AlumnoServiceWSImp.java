package com.ipartek.formacion.ws;

import java.util.ArrayList;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.AlumnoServiceImp;

@WebService(endpointInterface="com.ipartek.formacion.ws.AlumnoServiceWS")
public class AlumnoServiceWSImp implements AlumnoServiceWS{
	AlumnoService aS=new AlumnoServiceImp();

	@Override
	public AlumnoColeccion getAll() {
		AlumnoColeccion coleccion=new AlumnoColeccion();
		coleccion.setAlumnos(new ArrayList<Alumno>(aS.getAll().values()));
		
		return coleccion;
	}

	@Override
	public Alumno getById(Integer codigo) {
		Alumno alumno=null;
		if(codigo!=null){
			alumno=aS.getById(codigo);
		}
		return alumno;
	}

}
