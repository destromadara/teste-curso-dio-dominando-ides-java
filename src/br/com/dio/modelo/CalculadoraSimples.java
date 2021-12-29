package br.com.dio.modelo;

public class CalculadoraSimples {

	double soma;
	double subtracao;
	double multiplicacao;
	double divisao;

	public double somar(double a, double b) {
		this.soma = a + b;
		return this.soma;
	}

	public double subtrair(double a, double b) {
		this.subtracao = a - b;
		return this.subtracao;
	}

	public double multiplicar(double a, double b) {
		this.multiplicacao = a * b;
		return this.multiplicacao;
	}

	public double dividir(double a, double b) {
		this.divisao = a / b;
		return this.divisao;

	}

	public void showMessage() {
		System.out.println("O valor da soma: " + this.soma);
		System.out.println("O valor da subtração: " + this.subtracao);
		System.out.println("O valor da multiplicacao: " + this.multiplicacao);
		System.out.println("O valor da divisao: " + this.divisao);
	}

}
