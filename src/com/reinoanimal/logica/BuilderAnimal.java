package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:27 p.m.
 */
public abstract class BuilderAnimal {

	protected Animal animal;

	public BuilderAnimal(){
		animal = new Animal();
	}

	public void finalize() throws Throwable {

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

	/**
	 * metodo para crear el tipo de reproduccion
	 */
	public abstract void crearReproduccion();
}//end BuilderAnimal