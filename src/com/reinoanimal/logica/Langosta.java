package com.reinoanimal.logica;

public class Langosta extends BuilderAnimal{

	private String raza;

	public Langosta(String raza) {
		super();
		this.raza=raza;
		crearAlimentacion();
		crearEstructura();
		crearReproduccion();
		crearRaza();
		crearNombre();
	}

	@Override
	public void crearAlimentacion() {
		String descripcion = "Su alimentación está basada en moluscos y otros animales muertos, ya que se trata de una especia carroñera, aunque a veces también ingieren peces, almejas vivas o algas.";
		animal.setTipoAlimantacion(descripcion, TipoAlimentacion.carnivoro);
	}

	@Override
	public void crearEstructura() {
		// TODO Auto-generated method stub
		animal.setTipoEstructura(new Invertebrado());
	}

	@Override
	public void crearRaza() {
		// TODO Auto-generated method stub
		animal.setRaza(raza);
	}

	@Override
	public void crearNombre() {
		// TODO Auto-generated method stub
		animal.setNombre("Langosta "+ animal.getRaza());
	}

	@Override
	public void crearReproduccion() {
		// TODO Auto-generated method stub
		String descripcion = "Las hembras transportan los huevos fecundados bajo el abdomen, al eclosionar sueltan larvas";
		animal.setTipoReproduccion(descripcion, TipoReproduccion.oviparos);
	}

}
