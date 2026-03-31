package application;

import entities.Circulo;

public class Test {

	public static void main(String[] args) {
		Forma forma = new Circulo();
		System.out.println("Area Circulo: " + forma.calcularArea());
	}

}
