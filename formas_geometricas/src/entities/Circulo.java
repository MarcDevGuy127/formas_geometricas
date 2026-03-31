package entities;

import application.Forma;

public class Circulo extends Forma {
	double raio = 5;
	
	public void calcularCirculo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
