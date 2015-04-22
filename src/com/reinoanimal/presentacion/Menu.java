package com.reinoanimal.presentacion;

import java.util.Scanner;

public class Menu {
	private Scanner teclado;

	public Menu() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		accesoMenu();
	}
	private void menu(){
		System.out.println("1. Crear Animal");
		System.out.println("2. Listar Animales");
		System.out.println("3. Acerca de");
		System.out.println("4. Salir");
	}

	private int leerOpciones(){
		System.out.println("Señor usuario digite una opcion");
		return teclado.nextInt();
	}

	public void accesoMenu(){
		int opcion = 0;

		while(opcion != 3){
			menu();
			switch (opcion=leerOpciones()) {
			case 1:

				break;

			default:
				System.out.println("---------------------------------------------");
				System.out.println("La opcion ingresada no es valida");
				System.out.println("----------------------------------------------");
				break;
			}
		}
	}
	

	public static void main(String[] args) {
		Menu menu = new Menu();
	}

}
