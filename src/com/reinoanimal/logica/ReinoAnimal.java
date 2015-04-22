package com.reinoanimal.logica;


import java.util.ArrayList;


public class ReinoAnimal implements AnimalColeccion {

	private Animal[] animals;

	public ReinoAnimal(){
		
		animals= new Animal[3];
		animals[0]= new Animal("Gato..");
		animals[1]= new Animal("Pero..");
		animals[2]= new Animal("caballo..");
		

	}

	@Override
	public AnimalIterator iterator() {
		// TODO Auto-generated method stub
		return new ReinoAnimalAnimalesIterator();
	}
	
	private class ReinoAnimalAnimalesIterator implements AnimalIterator{
		
        private int anim = 0;
        
        @Override
        public boolean hasNext() {
            if(anim < animals.length) {
                return true;
            }
            return false;
        }
 
        @Override
        public Animal next() {
            return animals[ anim++ ];
        }
 
        @Override
        public Animal current() {
            // TODO Auto-generated method stub
            return null;
        }
 
        @Override
        public Animal first() {
            // TODO Auto-generated method stub
            return null;
        }
	}


}//end ReinoAnimal