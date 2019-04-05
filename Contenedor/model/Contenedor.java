package model;

public class Contenedor{

	private double weight;

	private double height;

	private double largo;



	public Contenedor(double weight, double height, double largo){

		this.weight = weight;

		this.height = height;

		this.largo = largo;
	}

	public getVolumenc1(){

		double volumenc1 = weight * height * largo;

		return volumenc1;
	}

	public getVolumenc2(){

		double volumenc2 = weight * height * largo;

		return volumenc2
	}

	public getVolumenc3(){

		double volumenc3 = weight * height * largo;

		return volumenc3;
	}



	public getVolumenTotalDeLaMercancia(){

		double volumenTotal = volumenc1 * volumenc2 * volumenc3;

		return volumenTotal;
	}

	public getVolumenPromedioDeLosContenedores(){

		double volumenPromedio = (volumenc1 * volumenc2 * volumenc3) / 3;

		return volumenPromedio;
	}
}