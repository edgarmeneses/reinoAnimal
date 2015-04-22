package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:29 p.m.
 */
public class CaballoDeMar extends BuilderAnimal {
	
	private String raza;
	
	public CaballoDeMar(String razo){
		super();
		this.raza=razo;
		crearAlimentacion();
		crearEstructura();
		crearRaza();
		crearReproduccion();
	}

	
	/**
	 * metodo para crear el tipo de alimentacion
	 */
	public void crearAlimentacion(){
		String caracteristica = "Se alimentan de pequeños organismos pelágicos que cazan al acecho, camuflados entre las algas, y que succionan con sus largos hocicos.";
		animal.setTipoAlimantacion(caracteristica, TipoAlimentacion.carnivoro);
	}

	/**
	 * metodo para crear el tipo de estructura
	 */
	public void crearEstructura(){
		animal.setTipoEstructura(new Vertebrado(TipoGrupo.peces));
	}

	/**
	 * metodo para crear la raza
	 */
	public void crearRaza(){
		animal.setRaza(raza);
		//"Syngnathidae"
	}

	/**
	 * metodo para crear el tipo de reproduccion
	 */
	public void crearReproduccion(){
		String descripcion = "Se reproducen desde la primavera hasta los meses de verano, En esta epoco la hembra transpasa los huevos a la bolsa ventral de los machos";
		animal.setTipoReproduccion(descripcion, TipoReproduccion.oviparos);
	}
}//end CaballoDeMar