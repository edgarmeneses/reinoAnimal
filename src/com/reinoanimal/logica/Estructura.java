package com.reinoanimal.logica;
/**
 * Clase que representa la estructura organica de un animal
 * Es una clase abstracta dado que la estuctura se divide en vetebrados e invetebrados
 * dentro del patron builder esta clase es un componente del producto
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 */
public abstract class Estructura {
	/**
	 * caracteristica de la estructura
	 */
	protected String caracteristica;
	/**
	 * nombre de la esctructura
	 */
	protected String nombre;
	/**
	 * constructor de la clase Estructura.java
	 */
	public Estructura(){

	}
	/**
	 * constructor de la clase Estructura.java
	 * @param caracteristica
	 * @param nombre
	 */
	public Estructura(String caracteristica, String nombre) {
		this.caracteristica = caracteristica;
		this.nombre = nombre;
	}
	/**
	 * retorna la crateristica del la estructura
	 * @return
	 */
	public String getCaracteristica() {
		return caracteristica;
	}
	/**
	 * permite asignar una caracteristica
	 * @param caracteristica
	 */
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	/**
	 * retorna el nombre de la estructura
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * permite asignar un nobre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Estructura [caracteristica=" + caracteristica + ", nombre="
				+ nombre + "]";
	}


	
}//end Estructura