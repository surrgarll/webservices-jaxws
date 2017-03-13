package com.ipartek.formacion.service;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.ipartek.formacion.pojo.Genero;
import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaServiceImp implements PeliculaService {
	private Set<Pelicula> peliculas;

	public PeliculaServiceImp() {
		peliculas=new TreeSet<Pelicula>();
		init();
	}

	private void init() {
		Genero genero=new Genero();
		genero.setNombre("fantástica");
		Pelicula pelicula=new Pelicula();
		pelicula.setCodigo(1);
		pelicula.setTitulo("El señor de los anillos");
		pelicula.setFestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero=new Genero();
		genero.setNombre("acción");
		pelicula=new Pelicula();
		pelicula.setCodigo(2);
		pelicula.setTitulo("Kill Bill 1");
		pelicula.setFestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero=new Genero();
		genero.setNombre("ciencia ficción");
		pelicula=new Pelicula();
		pelicula.setCodigo(3);
		pelicula.setTitulo("Star Wars Episodio IV: Una nueva Esperanza");
		pelicula.setFestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero=new Genero();
		genero.setNombre("ciencia ficción");
		pelicula=new Pelicula();
		pelicula.setCodigo(4);
		pelicula.setTitulo("Kubrick");
		pelicula.setFestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		genero=new Genero();
		genero.setNombre("ciencia ficción");
		pelicula=new Pelicula();
		pelicula.setCodigo(4);
		pelicula.setTitulo("Prueba");
		pelicula.setFestreno(new Date());
		pelicula.setGenero(genero);
		peliculas.add(pelicula);
		
		
		
		
		
		
	}

	@Override
	public Pelicula getById(int codigo) {
		Pelicula peli=null;
		peli=econtrarPorCodigo(codigo);
		return peli;
	}

	private Pelicula econtrarPorCodigo(int codigo) {
		Pelicula peli=null;
		boolean encontrado=false;
		Iterator<Pelicula> it=peliculas.iterator();
		while(it.hasNext()&&encontrado==false){
			Pelicula aux=it.next();
			if(aux.getCodigo()==codigo){
				encontrado=true;
				peli=aux;		
				
			}

		}
		return peli;
	}

	@Override
	public Set<Pelicula> getAll() {
		return peliculas;
	}

}
