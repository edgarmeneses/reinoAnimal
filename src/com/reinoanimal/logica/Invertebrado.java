package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:35 p.m.
 */
public class Invertebrado extends Estructura {
	private static final String DEFAULT_CARACTERISTICA="se conoce a todos los animales que no tienen columna vertebral, aunque dispongan de un esqueleto interno más o menos rígido";
	private static final String DEFAULT_NOMBRE = "Invertebrado";
	
	public Invertebrado(){
		super(DEFAULT_CARACTERISTICA, DEFAULT_NOMBRE);
	}
	
	
}//end Invertebrado