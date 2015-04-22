package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:45 p.m.
 */
public class Vertebrado extends Estructura {

	/**
	 * grupo de vertebrados al cual pertenece el animal
	 */
	private TipoGrupo grupo;
	
	private static final String DEFAULT_CARACTERISTICA = "son aquellos que tienen huesos y columna vertebral. El cuerpo de los vertebrados está formado por cabeza, tronco y extremidades";
	
	private static final String DEFAULT_NOMBRE = "Vertebrado";

	public Vertebrado(){
		super(DEFAULT_CARACTERISTICA, DEFAULT_NOMBRE);
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