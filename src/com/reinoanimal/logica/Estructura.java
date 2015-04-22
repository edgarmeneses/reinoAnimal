package com.reinoanimal.logica;

public abstract class Estructura {

	protected String caracteristica;
	
	protected String nombre;

	public Estructura(){

	}

	public Estructura(String caracteristica, String nombre) {
		this.caracteristica = caracteristica;
		this.nombre = nombre;
	}
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Estructura [caracteristica=" + caracteristica + ", nombre="
				+ nombre + "]";
	}


	
}//end Estructura