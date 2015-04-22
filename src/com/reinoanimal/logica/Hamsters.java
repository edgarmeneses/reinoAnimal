package com.reinoanimal.logica;

/**
 * calase que hace referencia a un aimal especifico 
 * hereda de BuilderAnimal
 * 
 * dentro del patron builder es un BuilderConcret
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class Hamsters extends BuilderAnimal {
	private String raza ;
	public Hamsters(String raza){
		super();
		this.raza = raza;
		crearAlimentacion();
		crearEstructura();
		crearRaza();
		crearReproduccion();
		crearNombre();
	}
	
	/**
	 * metodo para crear el tipo de alimentacion
	 */
	public void crearAlimentacion(){
		String descripcion = "Estos Animales se alimentan de vegetales, carnes y cereales";
		animal.setTipoAlimantacion(descripcion, TipoAlimentacion.omnivoros);
	}

	/**
	 * metodo para crear el tipo de estructura
	 */
	public void crearEstructura(){
		animal.setTipoEstructura(new Vertebrado(TipoGrupo.mamiferos));
	}

	/**
	 * metodo para crear la raza
	 */
	public void crearRaza(){
		animal.setRaza(raza);
	}

	/**
	 * metodo para crear el tipo de reproduccion
	 */
	public void crearReproduccion(){
		String descripcion = "Se realiza a travez de copulacion";
		animal.setTipoReproduccion(descripcion, TipoReproduccion.viviparos);
	}

	@Override
	public void crearNombre() {
		animal.setNombre("Hamsters "+ animal.getRaza());
	}
}//end Hamsters