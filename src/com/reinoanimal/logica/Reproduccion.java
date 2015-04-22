package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:38 p.m.
 */
public class Reproduccion {

	private String descripcion;
	private TipoReproduccion tipo;

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