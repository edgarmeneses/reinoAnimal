package com.reinoanimal.logica;

/**
 * @author Edgar Meneses
 * @version 1.0
 * @created 21-abr-2015 10:21:18 p.m.
 */
public class Alimentacion {

	private String descripcion;
	private TipoAlimentacion tipo;

	public Alimentacion(){
		
	}

	public Alimentacion(String descripcion, TipoAlimentacion tipo) {
		super();
		this.descripcion = descripcion;
		this.tipo = tipo;
	}

	
}//end Alimentacion