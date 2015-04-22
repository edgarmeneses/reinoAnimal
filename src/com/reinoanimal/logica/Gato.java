package com.reinoanimal.logica;

/**
 * Es una animal especifico dentro de la logica del negocio
 * hereda de BuilderAnimal
 * dentro del patron builder es un BuilderConcret
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class Gato extends BuilderAnimal {
	
	/**
	 * raza de gato
	 */
	private String raza;
	/**
	 * constructr de la clase Gato.java
	 * @param raza
	 */
	public Gato(String raza){
		
		super ();
		this.raza=raza;
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
		
		String caracteristica= "Se alimenta de leche y carnes ";
		animal.setTipoAlimantacion(caracteristica, TipoAlimentacion.carnivoro);
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
		
		String descripcion="Los gatos tienen reproducción sexual con fecundación interna.";
		animal.setTipoReproduccion(descripcion, TipoReproduccion.oviviparos);
	}
	/**
	 * metodo para crear el nombre del animal
	 */
	@Override
	public void crearNombre() {
		animal.setNombre("Gato " + animal.getRaza());
	}
}//end Gato