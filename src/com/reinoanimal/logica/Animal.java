package com.reinoanimal.logica;


public class Animal {
	
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
	 * tipo de reproduccion del animal
	 */
	private Reproduccion tipoReproduccion;

	public Animal(String nombre){
		this.nombre=nombre;
		
		tipoAlimantacion = new Alimentacion();
		tipoReproduccion = new Reproduccion();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Alimentacion getTipoAlimantacion() {
		return tipoAlimantacion;
	}

	public void setTipoAlimantacion(String descripcion, TipoAlimentacion tipo) {
		this.tipoAlimantacion.setDescripcion(descripcion);
		this.tipoAlimantacion.setTipo(tipo);
	}

	public Estructura getTipoEstructura() {
		return tipoEstructura;
	}

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
		return "Animal [nombre=" + nombre + ", raza=" + raza
				+ ", tipoAlimantacion=" + tipoAlimantacion
				+ ", tipoEstructura=" + tipoEstructura + ", tipoReproduccion="
				+ tipoReproduccion + "]";
	}


	
}//end Animal