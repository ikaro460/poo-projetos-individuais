package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//uma variavel pra cada unidade de medida de temperatura
		double tempC, tempF;
		
		// instancia o scanner
		Scanner sc = new Scanner(System.in);
		
		//recebe o valor inserido pelo usuario
		System.out.println("Digite a temperatura em Celsius: ");
		
		// leia tempC
		tempC = sc.nextDouble();
		limpa();
		
		// fecha scanner
		sc.close();
		
		tempF = tempC * 1.8 + 32;
		
		System.out.println("Temperatura em Celsius: "+tempC+"\nTemperatura em Fahrenheit: "+tempF);

	}
	
	// funcao limpa
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}

}
