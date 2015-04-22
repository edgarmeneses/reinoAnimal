package com.reinoanimal.logica;

/**
 * Clase animla el cual esta compuesto por:
 * un tipo de alimentacion, un tipo de estructura,
 * un tipo de reproduccion
 * estos elementos permiten clasificar en cisrtos grupos a todos los animales
 * tambien necesita la raza junto con el nombre del animal
 * 
 * Dentro del patron builder este es el product
 * @author Edgar Meneses
 * @author Diana Gonzalez
 */
public class Animal {
	
	/**
	 * nombre del animal (gato, perro, leon...)
	 */
	private String nombre;
	/**
	 * raza del animal
	 */
	private String raza;
	/**
	 * tipo de alimentacion del animal
	 */
	private Alimentacion tipoAlimantacion;
	/**
	 * tipo de esturctura del animal
	 */
	private Estructura tipoEstructura;
	/**
	 * tipo de reproduccion delase animal
	 */
	private Reproduccion tipoReproduccion;
	/**
	 * constructor de la clase Animal.java
	 * 
	 */
	public Animal(){
		
		
		tipoAlimantacion = new Alimentacion();
		tipoReproduccion = new Reproduccion();
	}
	/**
	 * permite obtener la raza
	 * @return
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * permite asignar una raza
	 * @param raza
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * retorna el tipo de alimentacion
	 * @return
	 */
	public Alimentacion getTipoAlimantacion() {
		return tipoAlimantacion;
	}
	/**
	 * permite asignar un tipo de alimento
	 * @param descripcion
	 * @param tipo
	 */
	public void setTipoAlimantacion(String descripcion, TipoAlimentacion tipo) {
		this.tipoAlimantacion.setDescripcion(descripcion);
		this.tipoAlimantacion.setTipo(tipo);
	}
	/**
	 * retorna el tipo de estructura
	 * @return
	 */
	public Estructura getTipoEstructura() {
		return tipoEstructura;
	}
	/**
	 * permite asignar un tipo de estructura
	 * @param tipoEstructura
	 */
	public void setTipoEstructura(Estructura tipoEstructura) {
		this.tipoEstructura = tipoEstructura;
	}

	public Reproduccion getTipoReproduccion() {
		return tipoReproduccion;
	}

	public void setTipoReproduccion(String descripcion, TipoReproduccion tipo) {
		this.tipoReproduccion.setDescripcion(descripcion);
		this.tipoReproduccion.setTipo(tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal "+ nombre +"\n"+ "[raza=" + raza +"\n"+ ", tipoAlimantacion="
				+ tipoAlimantacion +  "\n"+ ", tipoEstructura=" + tipoEstructura
				+"\n"+ ", tipoReproduccion=" + tipoReproduccion + "]";
	}
	
	
}//end Animal