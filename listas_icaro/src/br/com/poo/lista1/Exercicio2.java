package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// declaracao de variaveis
		int arrayLength = 6;
		int[] idades = new int[arrayLength]; 
		int soma = 0;
		
		// instancia o scanner
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < arrayLength; i++) {
			// Pergunta idade
			System.out.println("Qual é a idade do colega "+(i+1)+"? ");
			
			// leia idade
			idades[i] = sc.nextInt();
			soma += idades[i];
			limpa();
		}

		//fecha scanner
		sc.close();
		
		System.out.println("O tempo de vida meu e dos meus colegas é "+soma+"!");

	}

	// funcao limpa
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

}
