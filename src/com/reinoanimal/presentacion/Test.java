package com.reinoanimal.presentacion;

import java.nio.file.attribute.AclEntry.Builder;

import com.reinoanimal.logica.BuilderAnimal;
import com.reinoanimal.logica.CaballoDeMar;
import com.reinoanimal.logica.Hamsters;

public class Test {
	
	public static void main(String[] args) {
		BuilderAnimal animal = new CaballoDeMar("nn");
		System.out.println(animal);
	}

}
