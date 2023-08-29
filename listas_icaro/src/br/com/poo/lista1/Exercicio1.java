package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// declaracao de variaveis
		String nome;
		String sobrenome;

		// instancia o scanner
		Scanner sc = new Scanner(System.in);

		// funcao escreva no portugol
		System.out.println("Qual o seu nome?");

		// leia nome
		nome = sc.nextLine();

		// limpa tela
		limpa();

		// pergunta o sobrenome
		System.out.println("E sobrenome?");

		// leia sobrenome
		sobrenome = sc.nextLine();

		// fecha o scanner
		sc.close();

		// limpa tela
		limpa();

		// mensagem de boas vindas
		System.out.println("Olá, " + nome + " " + sobrenome + ", seja bem-vinda(o) ao universo da programação!");
	}

	// funcao limpa
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}