package com.reinoanimal.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que permite crear los diferentes tipos de animales
 * 
 * dentro del patron builder esta es la clase director
 * esta clase tambien implementa el patron iterator
 * donde se utiliza collection como el aggrega
 * 
 * @author Edgar Meneses
 * @author Diana Gonzalez
 *
 */
public class ReinoAnimal {

//	private ArrayList<BuilderAnimal> animals;
	
	private Collection<BuilderAnimal> animals;

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

	public void listarAnimal(){
		
		Iterator<BuilderAnimal> iterator = animals.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("------------------------------");
			System.out.println(iterator.next());
			System.out.println("--------------------------------");
			
		}
		
	}

	public Collection<BuilderAnimal> getAnimals() {
		return animals;
	}
	
	
}//end ReinoAnimal