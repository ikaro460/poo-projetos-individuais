package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1; 
		int n2;
		int soma;
		
		// instancia scanner
		Scanner sc = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		// calculo
		soma = n1 + n2;
		System.out.println("A soma dos dois números é igual a "+soma);
		
		//fecha scanner
		sc.close();

	}

}
