package com.ipartek.formacion;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		String wsdlurl="http://localhost:8080/webservices-jaxws/peliculasservice?wsdl";
		try {
			URL url=new URL(wsdlurl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
