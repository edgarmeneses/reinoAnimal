package com.reinoanimal.presentacion;

import java.util.Scanner;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import com.reinoanimal.logica.CaballoDeMar;
import com.reinoanimal.logica.Gato;
import com.reinoanimal.logica.Hamsters;
import com.reinoanimal.logica.Langosta;
import com.reinoanimal.logica.ReinoAnimal;

public class Menu {
	private Scanner teclado;
	private ReinoAnimal reinoAnimal;

	public Menu() {
		// TODO Auto-generated constructor stub
		teclado = new Scanner(System.in);
		reinoAnimal= new ReinoAnimal();
		accesoMenu();

	}
	private void menu(){
		System.out.println();
		System.out.println("1. Crear Animal");
		System.out.println("2. Listar Animales");
		System.out.println("3. Acerca de");
		System.out.println("4. Salir");
		System.out.println();
	}

	private int leerOpciones(){
		System.out.println("Señor usuario digite una opcion");
		return teclado.nextInt();
	}

	public void accesoMenu(){
		int opcion = 0;

		while(opcion != 4){
			menu();
			switch (opcion=leerOpciones()) {
			case 1:
				System.out.println("-------------------------------------------------");
				crearAnimal();
				System.out.println("--------------------------------------------------");
				break;
			case 2:
				System.out.println("------------------------------------------------");
				reinoAnimal.listarAnimal();
				System.out.println("--------------------------------------------------");
				break;
			case 3:
				acercaDe();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("---------------------------------------------");
				System.out.println("La opcion ingresada no es valida");
				System.out.println("----------------------------------------------");
				break;
			}
		}
	}
	
	private void crearAnimal(){
		String tipo = seleccionarTipoAnimal();
		
		switch (tipo.toLowerCase()) {
		case "gato":
			System.out.println("ingrese la raza");
			String razaG = teclado.next();
			Gato gato = new Gato(razaG);
			reinoAnimal.getAnimals().add(gato);
			System.out.println("Usted creo el animal: " + gato);
			break;
		case "langosta":
			System.out.println("ingrese la raza");
			String razaL = teclado.next();
			Langosta langosta = new Langosta(razaL);
			reinoAnimal.getAnimals().add(langosta);
			System.out.println("usted creo el animal: " + langosta);
			break;
		case "caballo de mar":
			System.out.println("ingrese la raza");
			String razaC = teclado.next();
			CaballoDeMar caballoDeMar = new CaballoDeMar(razaC);
			reinoAnimal.getAnimals().add(caballoDeMar);
			System.out.println("Usted creo el animal: "+ caballoDeMar);
			
			break;
		case "hamster":
			System.out.println("ingrese la raza");
			String razaH = teclado.next();
			Hamsters hamsters = new Hamsters(razaH);
			reinoAnimal.getAnimals().add(hamsters);
			System.out.println("Usted creo el animal: "+ hamsters);
			break;

		default:
			System.out.println("El animal seleccionado no es vaido ");
			break;
		}
	}
	
	private String seleccionarTipoAnimal(){
		System.out.println("Digite el nombre del animal que decia creagar");
		System.out.println("gato, langosta, caballo de mar o hamster");
		return teclado.next();
	}
	
	public void acercaDe(){
		System.out.println("Aplicacion: ReinoAnimal");
		System.out.println("Version: 1.0");
		System.out.println("Desarrollado por: ");
		System.out.println("Diana Milena Gonzales Prieto");
		System.out.println("Edgar Antonio Meneses Cadena");
		System.out.println("Descripcion: presentacion patrones arquitecturales iterator y builder");
	}
	
	

	public static void main(String[] args) {
		Menu menu = new Menu();
	}

}
