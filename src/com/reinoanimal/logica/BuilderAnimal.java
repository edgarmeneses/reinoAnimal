package com.reinoanimal.logica;


public abstract class BuilderAnimal {
	/**
	 * animal que se va a constroir con todas sus partes
	 * actua como una interfaz dando las caracteristicas que debe tener cualquier
	 * construccion de un aimal
	 */
	protected Animal animal;

	public BuilderAnimal(){
		animal = new Animal();
	}

	/**
	 * metodo para crear el tipo de alimentacion
	 */
	public abstract void crearAlimentacion();

	/**
	 * metodo para crear el tipo de estructura
	 */
	public abstract void crearEstructura();

	/**
	 * metodo para crear la raza
	 */
	public abstract void crearRaza();
	
	public abstract void crearNombre();

	/**
	 * metodo para crear el tipo de reproduccion
	 */
	public abstract void crearReproduccion();

	@Override
	public String toString() {
		return  animal.toString();
	}
	
	
}//end BuilderAnimal