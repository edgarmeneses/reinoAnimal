package com.reinoanimal.presentacion;

import java.nio.file.attribute.AclEntry.Builder;

import com.reinoanimal.logica.Animal;
import com.reinoanimal.logica.AnimalIterator;
import com.reinoanimal.logica.BuilderAnimal;
import com.reinoanimal.logica.CaballoDeMar;
import com.reinoanimal.logica.Hamsters;
import com.reinoanimal.logica.ReinoAnimal;

public class Test {
	
	public static void main(String[] args) {
//		BuilderAnimal animal = new CaballoDeMar("nn");
//		System.out.println(animal);
		
		ReinoAnimal reinoAnimal= new ReinoAnimal();
		AnimalIterator animalIterator=reinoAnimal.iterator();
		while (animalIterator.hasNext()){
			Animal animal= animalIterator.next();
			System.out.println("Animal:  " + animal.getNombre());
		}
	}

}
