package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:23 p.m.
 */
public class Animal {

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

	public Animal(){
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

	@Override
	public String toString() {
		return "Animal [raza=" + raza +"\n"+ ", tipoAlimantacion="
				+ tipoAlimantacion + "\n"+ ", tipoEstructura=" + tipoEstructura
				+ "\n"+", tipoReproduccion=" + tipoReproduccion + "]";
	}
	
	
}//end Animal