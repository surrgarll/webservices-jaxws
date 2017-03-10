
package com.ipartek.formacion.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipartek.formacion.ws.PeliculaMensaje;

@XmlRootElement(name = "obtenerporid_peliResponse", namespace = "http://ws.formacion.ipartek.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerporid_peliResponse", namespace = "http://ws.formacion.ipartek.com/")
public class GetById_peliResponse {

    @XmlElement(name = "return", namespace = "")
    private PeliculaMensaje _return;

    /**
     * 
     * @return
     *     returns PeliculaMensaje
     */
    public PeliculaMensaje getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(PeliculaMensaje _return) {
        this._return = _return;
    }

}
