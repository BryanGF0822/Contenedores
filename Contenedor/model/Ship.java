package model;

public class Ship{

	private Contenedor c1;

	private Contenedor c2;

	private Contenedor c3;



	public Ship( Contenedor c1, Contenedor c2, Contenedor c3){

		this.c1 = c1;

		this.c2 = c2;

		this.c3 = c3;
	}

	public Contenedor getC1(){

		return c1;
	}

	public void setC1 (Contenedor c1){

		this.c1 = c1;
	}

	public Contenedor getC2(){

		return c2;
	}

	public void setC2(Contenedor c2){

		this.c2 = c2;
	}

	public Contenedor getC3(){

		return c3;
	}

	public void setC3(Contenedor c3){

		this.c3 = c3;
	}








	public double calcularVolumenTotal(){

		double volumen_total = c1.getVolumen() + c2.getVolumen() + c3.getVolumen();

		return volumen_total;
	}

	public double calcularPromedioContenedores(){

		double promedio = (c1.getVolumen() + c2.getVolumen() + c3.getVolumen()) / 3;

		return promedio;
	}


}