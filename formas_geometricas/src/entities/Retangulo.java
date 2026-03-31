package entities;

import application.Forma;

public class Retangulo extends Forma {
	double largura, altura;
	
	public Retangulo(double altura, double largura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return largura * altura;
	}
}
