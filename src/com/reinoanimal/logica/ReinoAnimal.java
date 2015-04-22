package com.reinoanimal.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class ReinoAnimal {

//	private ArrayList<BuilderAnimal> animals;
	
	Collection<BuilderAnimal> animals = new ArrayList<BuilderAnimal>();

	public ReinoAnimal(){

	}

	/**
	 * metodo para crear un animal
	 */
	public void crearAnimal(BuilderAnimal buAn){
		
		animals.add(new Gato("Persa"));
		animals.add(new Hamsters("Roborovski"));
		animals.add(new CaballoDeMar("Arabe"));

	}

	public void listarAnimal(){
		
		Iterator<BuilderAnimal> iterator = animals.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("Animal:   ");
			System.out.println(iterator.next());
			
		}
		
	}
}//end ReinoAnimal