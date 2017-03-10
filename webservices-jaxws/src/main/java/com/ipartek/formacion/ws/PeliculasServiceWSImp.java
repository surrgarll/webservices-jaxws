package com.ipartek.formacion.ws;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaService;
import com.ipartek.formacion.service.PeliculaServiceImp;

@WebService(serviceName="peliculasservice",portName="",targetNamespace="")
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)
public class PeliculasServiceWSImp {
	
	@Resource
	WebServiceContext wsContext;
	
	@WebMethod(operationName="obtenerporid_peli")
	public PeliculaMensaje getById_peli(int codigo){
		PeliculaMensaje pm=new PeliculaMensaje();
		if(validarPeticion()){
			PeliculaService pS=new PeliculaServiceImp();
			Pelicula pelicula=pS.getById(codigo);	
			if(pelicula==null){
				pm.setMensaje("El código enviado no corresponde a ninguna película: "+codigo);
			}else{
				pm.setPelicula(pelicula);
			}
		}else{
			pm.setMensaje("Los datos de usuario no son correctos");
		}
		return pm;
	}
	private boolean validarPeticion(){
		boolean valido=false;
		//WS-Security < protocolo de seguridad
		MessageContext contextoMensajes=wsContext.getMessageContext();
		Map<?,?> encabezados=(Map<?, ?>) contextoMensajes.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<?> listaparamtros= (List<?>) encabezados.get("sessionId");
/*		para simplificar consideramos que generamos un único id de sesión para todos los usuarios
		y no hacemos un bucle de las sesiones generadas y activas */
		String sessionId="ipsession";
		if(listaparamtros!=null){
			if(sessionId.equals(listaparamtros.get(0).toString())){
				valido=true;
			}
		}
		return valido;
	}

}
