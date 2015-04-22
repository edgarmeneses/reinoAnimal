package com.reinoanimal.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que permite crear los diferentes tipos de animales
 * 
 * dentro del patron builder esta es la clase director
 * esta clase tambien implementa el patron iterator
 * donde se utilizan las interfaces Collection, ArrayList e Iterator y representan a las interfaces
 * del patron ieterator de la siguente manera
 * 
 * collection como el Aggregate
 * ArrayList como ConcreteAggregate
 * iterator como iterator
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class ReinoAnimal {

//	private ArrayList<BuilderAnimal> animals;
	/**
	 * coleccion de animales
	 */
	private Collection<BuilderAnimal> animals;
	/**
	 * constructor de la clase ReinoAnimal.java
	 */
	public ReinoAnimal(){
		animals = new ArrayList<BuilderAnimal>();
		animals.add(new Gato("Persa"));
		animals.add(new Hamsters("Roborovski"));
		animals.add(new CaballoDeMar("Arabe"));
		animals.add(new Langosta("Real"));
	}

	/**
	 * metodo para crear un animal
	 */
	public void crearAnimal(BuilderAnimal buAn){
		animals.add(buAn);
	}
	/**
	 * metodo para listar un animal
	 * se aplica como tal el concepto del patron iterator
	 */
	public void listarAnimal(){
		
		Iterator<BuilderAnimal> iterator = animals.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("------------------------------");
			System.out.println(iterator.next());
			System.out.println("--------------------------------");
			
		}
		
	}
	/**
	 * metodo que retorna la coleccion de animales
	 * @return
	 */
	public Collection<BuilderAnimal> getAnimals() {
		return animals;
	}
	
	
}//end ReinoAnimal