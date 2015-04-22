package com.reinoanimal.logica;
/**
 * Clase que describe el tipo de reprodccion de los animales ingresados 
 *
 */

public class Reproduccion {

	private String descripcion;
	private TipoReproduccion tipo;
/**
 * Metodo constructor de la clase, con sus getter y setters correspondientes
 */

	public Reproduccion(){

	}

	public Reproduccion(String descripcion, TipoReproduccion tipo) {
		super();
		this.descripcion = descripcion;
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoReproduccion getTipo() {
		return tipo;
	}

	public void setTipo(TipoReproduccion tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Reproduccion [descripcion=" + descripcion + ", tipo=" + tipo
				+ "]";
	}
	
}//end Reproduccion