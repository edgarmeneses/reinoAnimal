package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:30 p.m.
 */
public abstract class Estructura {

	protected String caracteristica;
	protected String nombre;

	public Estructura(){

	}

	public Estructura(String caracteristica, String nombre) {
		this.caracteristica = caracteristica;
		this.nombre = nombre;
	}
	
	
}//end Estructura