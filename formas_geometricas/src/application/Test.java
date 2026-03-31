package application;

import entities.Circulo;
import entities.Quadrado;
import entities.Retangulo;
import entities.Triangulo;

public class Test {

	public static void main(String[] args) {
		Forma c = new Circulo(5.0);
		Forma r = new Retangulo(5.0,2.0);
		Forma t = new Triangulo(4.0,2.0);
		Forma q = new Quadrado(10.0,2.0);
		System.out.println("Area Circulo: " + c.calcularArea());
		System.out.println("Area Retangulo: " + r.calcularArea());
		System.out.println("Area Triangulo: " + t.calcularArea());
		System.out.println("Area Quadrado: " + q.calcularArea());
	}

}
