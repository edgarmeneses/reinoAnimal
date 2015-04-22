package com.reinoanimal.logica;


public abstract class BuilderAnimal {

	protected Animal animal;

	public BuilderAnimal(){
		animal = new Animal("hh");
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

	@Override
	public String toString() {
		return  animal.toString();
	}
	
	
}//end BuilderAnimal