package br.com.dio.teste;

import br.com.dio.modelo.Livro;

public class Teste {
	public static void main(String[] args) {
		Livro livro01 = new Livro("A Travessia", "William P. Young");
		Livro livro02 = new Livro("A Cabana", "William P. Young");
		
		System.out.println(livro01);
		System.out.println(livro02);
	}

}
