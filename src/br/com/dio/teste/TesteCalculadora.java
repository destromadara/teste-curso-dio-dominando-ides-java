package br.com.dio.teste;

import java.util.Scanner;

import br.com.dio.modelo.CalculadoraSimples;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		double n1, n2;
		System.out.println("Digite digite o primeiro número: ");
		n1 = scn.nextDouble();
		System.out.println("Digite digite o segundo número: ");
		n2 = scn.nextDouble();

		CalculadoraSimples calc = new CalculadoraSimples();
		calc.somar(n1, n2);
		calc.subtrair(n1, n2);
		calc.multiplicar(n1, n2);
		calc.dividir(n1, n2);
		calc.showMessage();

	}

}
