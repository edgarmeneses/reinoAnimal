package com.reinoanimal.logica;

/**
 * Clase que describe la estructura de los animales 
 *
 */

public class Vertebrado extends Estructura {

	/**
	 * grupo de vertebrados al cual pertenece el animal
	 * con sus caracteristicas
	 */
	private TipoGrupo grupo;
	
	private static final String DEFAULT_CARACTERISTICA = "son aquellos que tienen huesos y columna vertebral. El cuerpo de los vertebrados está formado por cabeza, tronco y extremidades";
	
	private static final String DEFAULT_NOMBRE = "Vertebrado";
	
	/**
	 * Metodo Constructor de la clase con Getters y Setters
	 */

	public Vertebrado(TipoGrupo grupo){
		super(DEFAULT_CARACTERISTICA, DEFAULT_NOMBRE);
		this.grupo=grupo;
	}
	
	public TipoGrupo getGrupo() {
		return grupo;
	}

	public void setGrupo(TipoGrupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Vertebrado [grupo=" + grupo + "]";
	}
	
	
}//end Vertebrado