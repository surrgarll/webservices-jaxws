
package com.ipartek.formacion.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ipartek.formacion.ws.CocheColeccion;

@XmlRootElement(name = "obtenerTodosResponse", namespace = "http://com.ipartek.formacion/types")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTodosResponse", namespace = "http://com.ipartek.formacion/types")
public class GetAllResponse {

    @XmlElement(name = "return", namespace = "")
    private CocheColeccion _return;

    /**
     * 
     * @return
     *     returns CocheColeccion
     */
    public CocheColeccion getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(CocheColeccion _return) {
        this._return = _return;
    }

}
