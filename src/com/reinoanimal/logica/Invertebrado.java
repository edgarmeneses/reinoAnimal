package com.reinoanimal.logica;
/**
 * clase que hace referencia a la estructura organica de os invertebrados
 * esta calase hereda de Estuctura
 * esta clase dentro del patron builder es un coponente del producto
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class Invertebrado extends Estructura {
	/**
	 * descripcion de la estructura
	 */
	private static final String DEFAULT_CARACTERISTICA="se conoce a todos los animales que no tienen columna vertebral, aunque dispongan de un esqueleto interno más o menos rígido";
	/**
	 * nombre que resive la estuctura
	 */
	private static final String DEFAULT_NOMBRE = "Invertebrado";
	/**
	 * constructor de la clase Invertebrados.java
	 */
	public Invertebrado(){
		super(DEFAULT_CARACTERISTICA, DEFAULT_NOMBRE);
	}
	
	
}//end Invertebrado