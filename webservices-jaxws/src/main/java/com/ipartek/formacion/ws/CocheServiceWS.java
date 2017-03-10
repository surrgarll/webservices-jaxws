package com.ipartek.formacion.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


import com.ipartek.formacion.pojo.Coche;


/*@SOAPBinding(use=Use.LITERAL,style=Style.RPC)*/
@WebService(targetNamespace="http://com.ipartek.formacion/types",name="cochews")
@SOAPBinding(use=Use.LITERAL,style=Style.DOCUMENT)
public interface CocheServiceWS {
	
	
/*	@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formacion.ws.CocheColeccion")*/
	@WebMethod(operationName="obtenerTodos")
	public CocheColeccion getAll();
	
	
	/*@ResponseWrapper(targetNamespace="http://com.ipartek.formacion/types",className="com.ipartek.formacion.pojo.Coche")*/
	/*@WebParam(targetNamespace="http://com.ipartek.formacion/types",mode=Mode.IN,name="codigocoche")*/
	@WebMethod(operationName="obtenerPorId")
	public Coche getById ( Integer codigo);

}
