package com.reinoanimal.logica;

public class Vertebrado extends Estructura {

	/**
	 * grupo de vertebrados al cual pertenece el animal
	 */
	private TipoGrupo grupo;
	
	private static final String DEFAULT_CARACTERISTICA = "son aquellos que tienen huesos y columna vertebral. El cuerpo de los vertebrados est� formado por cabeza, tronco y extremidades";
	
	private static final String DEFAULT_NOMBRE = "Vertebrado";

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