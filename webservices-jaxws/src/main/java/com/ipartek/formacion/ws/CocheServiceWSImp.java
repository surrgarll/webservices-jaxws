package com.ipartek.formacion.ws;

import java.util.ArrayList;
import java.util.Map;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.CocheService;
import com.ipartek.formacion.service.CocheServiceImp;

@WebService(serviceName="cochewsimp",endpointInterface="com.ipartek.formacion.ws.CocheServiceWS")
public class CocheServiceWSImp implements CocheServiceWS {
	CocheService cS=new CocheServiceImp();
	
	public Coche getById(Integer codigo) {
		Coche coche=null;
		if(codigo!=null){
			coche=cS.getById(codigo);
		}
		return coche;
	}
	public CocheColeccion getAll() {
		CocheColeccion coleccion=new CocheColeccion();
		Map<Integer,Coche> coches=cS.getAll();
		coleccion.setCoches(new ArrayList<Coche>(coches.values()));
		return coleccion;
	}

}
