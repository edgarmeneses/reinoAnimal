package com.reinoanimal.presentacion;

import java.nio.file.attribute.AclEntry.Builder;






import com.reinoanimal.logica.Animal;
import com.reinoanimal.logica.BuilderAnimal;
import com.reinoanimal.logica.CaballoDeMar;
import com.reinoanimal.logica.Hamsters;
import com.reinoanimal.logica.Invertebrado;
import com.reinoanimal.logica.ReinoAnimal;
import com.reinoanimal.logica.TipoAlimentacion;
import com.reinoanimal.logica.TipoReproduccion;

public class Test {
	
	public static void main(String[] args) {
		
		
//		BuilderAnimal animal = new CaballoDeMar("nn");
//		System.out.println(animal.toString());
//		
		ReinoAnimal animal = new ReinoAnimal();
		animal.crearAnimal(new CaballoDeMar("Otra"));
		animal.listarAnimal();
	}

}
