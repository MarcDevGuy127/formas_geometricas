package entities;

import application.Forma;

public class Triangulo extends Forma {
	double base, altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (base * altura)/ 2;
	}
	
	
}
