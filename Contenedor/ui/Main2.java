package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private Contenedor control;

	//Constructor

	public Main(){
		init();
	
	}

			public static void main(String[] args) {
				Main program = new Main();
				program.menu();

	}

	public void menu(){

		Scanner entrada = new Scanner(System.in);

			Contenedor c1;

			Contenedor c2;

			Contenedor c3;

			double weight, height, largo;

			System.out. println("------------------------------------------------------------------------------");

			System.out. println("							CONTENEDORES MARITIMOS");

			System.out. println("------------------------------------------------------------------------------");

			System.out.println(" ");



			System.out.print("Escribe el ancho del contenedor: ");
			weight = entrada.nextInt();

			System.out.print("Escribe la altura del contenedor: ");
			height = entrada.nextInt();

			System.out.print("Escribe el largo del contenedor: ");
			largo = entrada.nextInt();





		Scanner sn = new Scanner(System.in);

		boolean salir = false;

		int opcion;

		while (salir == false){

			System.out.println("1. Calcular el volumen total de la mercancia");

			System.out.println("2. Calcular el volumen promedio de los 3 contenedores");

			System.out.println("3. Salir del menu");




			System.out.println("Selecciona la opcion que deseas realizar:");

			opcion = sn.nextInt();


				switch(opcion){

					case 1:

						System.out.println(control.getExhibition().getZoneKangaroo().printZoneKangaroo());
						break;

					case 2:

						System.out.println("Has seleccionado la opcion 2");
						break;

					case 3:

					salir = true;
					System.out.println("Menu Cerrado");




				}
			

			
		}	

	}

	public void init(){

		c3 = new Contenedor (weight, height, largo);

		c2 = new Contenedor (weight, height, largo);

		c1 = new Contenedor (weight, height, largo);

	
	}


}