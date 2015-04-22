package com.reinoanimal.logica;

public class Invertebrado extends Estructura {
	private static final String DEFAULT_CARACTERISTICA="se conoce a todos los animales que no tienen columna vertebral, aunque dispongan de un esqueleto interno más o menos rígido";
	private static final String DEFAULT_NOMBRE = "Invertebrado";
	
	public Invertebrado(){
		super(DEFAULT_CARACTERISTICA, DEFAULT_NOMBRE);
	}
	
	
}//end Invertebrado