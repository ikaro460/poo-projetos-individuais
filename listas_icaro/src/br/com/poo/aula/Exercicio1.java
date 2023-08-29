package br.com.poo.aula;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome; 
		String sobrenome;
		
		// instancia scanner
		Scanner sc = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Qual seu nome? ");
		nome = sc.nextLine();
		System.out.println("E sobrenome? ");
		sobrenome = sc.nextLine();
		
		// imprime o nome com sobrenome
		System.out.println("Olá, "+nome+" "+sobrenome+", seja bem-vindo(a)!");
		
		//fecha scanner
		sc.close();

	}

}
