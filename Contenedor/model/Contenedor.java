package model;

public class Contenedor{

	private double widht;

	private double height;

	private double largo;



	public Contenedor(double widht, double height, double largo){

		this.widht = widht;

		this.height = height;

		this.largo = largo;
	}

	public double getWidth(){

		return widht;
	}

	public void setWidth(double widht){

		this.widht = widht;
	}

	public double getHeight(){

		return height;
	}

	public void setHeight(double height){

		this.height = height;
	}

	public double getLargo(){

		return largo;
	}

	public void setLargo(double largo){

		this.largo = largo;
	}



	public double getVolumen(){

		double volumen = widht * height * largo;

		return volumen;
	}

}