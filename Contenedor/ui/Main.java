package ui;

import model.*;

import java.util.Scanner;

public class Main{

	//Relations

	private Ship control;

	//Constructor


	public void init(){


		/*Contenedor c3 = new Contenedor (width3, height3, largo3);

		Contenedor c2 = new Contenedor (width2, height2, largo2);

		Contenedor c1 = new Contenedor (width, height, largo);
		
		control = new Ship(c1, c2, c3);*/
	
	}

	public Main(){
		init();
	
	}

			public static void main(String[] args) {
				Main program = new Main();
				program.menu();

	}

	public void menu(){

		Scanner entrada = new Scanner(System.in);

			double width, height, largo;

			double width2, height2, largo2;

			double width3, height3, largo3;

			System.out. println("------------------------------------------------------------------------------");

			System.out. println(".                          CONTENEDORES MARITIMOS");

			System.out. println("------------------------------------------------------------------------------");

			System.out.println(" ");





			System.out.println("CONTENEDOR 1");

			System.out.println("Escribe el ancho del contenedor: ");
			width = entrada.nextInt();

			System.out.println("Escribe la altura del contenedor: ");
			height = entrada.nextInt();

			System.out.println("Escribe el largo del contenedor: ");
			largo = entrada.nextInt();

			System.out.println(" ");




			System.out.println("CONTENEDOR 2");

			System.out.println("Escribe el ancho del contenedor: ");
			width2 = entrada.nextInt();

			System.out.println("Escribe la altura del contenedor: ");
			height2 = entrada.nextInt();

			System.out.println("Escribe el largo del contenedor: ");
			largo2 = entrada.nextInt();

			System.out.println(" ");




			System.out.println("CONTENEDOR 3");

			System.out.println("Escribe el ancho del contenedor: ");
			width3 = entrada.nextInt();

			System.out.println("Escribe la altura del contenedor: ");
			height3 = entrada.nextInt();

			System.out.println("Escribe el largo del contenedor: ");
			largo3 = entrada.nextInt();





		Contenedor c3 = new Contenedor (width3, height3, largo3);

		Contenedor c2 = new Contenedor (width2, height2, largo2);

		Contenedor c1 = new Contenedor (width, height, largo);

		Ship control = new Ship(c1, c2, c3);







		Scanner sn = new Scanner(System.in);

		boolean salir = false;

		int opcion;

		while (salir == false){

			System.out.println(" ");

			System.out.println("MENU");

			System.out.println("1. Calcular el volumen total de la mercancia");

			System.out.println("2. Calcular el volumen promedio de los 3 contenedores");

			System.out.println("3. Salir del menu");



			System.out.println(" ");

			System.out.println("Selecciona la opcion que deseas realizar:");

			opcion = sn.nextInt();


				switch(opcion){

					case 1:

						System.out.println("El volumen total de la mercancia es de: " + control.calcularVolumenTotal() + "m");
						break;

					case 2:

						System.out.println("El volumen promedio de los 3 contenedores es: " + control.calcularPromedioContenedores() + "m");
						break;

					case 3:

					salir = true;
					System.out.println("Menu Cerrado");




				}
			

			
		}	

	}


}