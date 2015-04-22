package com.reinoanimal.logica;

public class Alimentacion {

	private String descripcion;
	private TipoAlimentacion tipo;

	public Alimentacion(){
		
	}

	public Alimentacion(String descripcion, TipoAlimentacion tipo) {

		this.descripcion = descripcion;
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoAlimentacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoAlimentacion tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Alimentacion [descripcion=" + descripcion + ", tipo=" + tipo
				+ "]";
	}
	
	

	
}//end Alimentacion