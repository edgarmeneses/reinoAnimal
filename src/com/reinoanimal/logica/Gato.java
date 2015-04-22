package com.reinoanimal.logica;


public class Gato extends BuilderAnimal {
	
	private String raza;
	
	public Gato(String raza){
		
		super ();
		this.raza=raza;
		crearAlimentacion();
		crearEstructura();
		crearRaza();
		crearReproduccion();

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
		
		String descripcion="Los gatos tienen reproducci�n sexual con fecundaci�n interna.";
		animal.setTipoReproduccion(descripcion, TipoReproduccion.oviviparos);
	}
}//end Gato