package com.reinoanimal.logica;
/**
 * Clase que describe el tipo de alimentacion de un animal
 *
 * dentro del patron builder esta es una aprte del producto
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class Alimentacion {
	/**
	 * descripcion de la alimentacion
	 */
	private String descripcion;
	/**
	 * tipo de alimentacion
	 */
	private TipoAlimentacion tipo;
	/**
	 * constructor de la clase Alimentacion,java
	 */
	public Alimentacion(){
		
	}
	/**
	 * constructor de la clase Alimentacion.java
	 * @param descripcion descripcion
	 * @param tipo tipo alimentcion
	 */
	public Alimentacion(String descripcion, TipoAlimentacion tipo) {

		this.descripcion = descripcion;
		this.tipo = tipo;
	}
	/**
	 * retorna la descripcion
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * permite asignar una descripcion
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * retorna el tipo de alimentacion
	 * @return
	 */
	public TipoAlimentacion getTipo() {
		return tipo;
	}
	/**
	 * permite asignar un tipo de aimentacion
	 * @param tipo
	 */
	public void setTipo(TipoAlimentacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Alimentacion [descripcion=" + descripcion + ", tipo=" + tipo
				+ "]";
	}
	
	

	
}//end Alimentacion