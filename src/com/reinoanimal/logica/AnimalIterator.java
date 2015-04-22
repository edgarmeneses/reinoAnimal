package com.reinoanimal.logica;

public interface AnimalIterator {
	
	public boolean hasNext();
	public Animal next();
	public Animal current();
	public Animal first();
}
