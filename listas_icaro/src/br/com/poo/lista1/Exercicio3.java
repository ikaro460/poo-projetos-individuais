//ZEUS - CALCULADORA
//
//PASSO A PASSO
//
// 1- Incluir bibliotecas Tipos, Texto e Util 
// 2- Declaracao de variaveis
// 	2.1- Declarar variaveis reais: n1, n2, subtracao, multiplicacao e divisao
//	2.2- Declarar variaveis inteiras: operador, validacao e menuFinal
//	2.3- Declarar variaveis cadeia:  n1cadeia, n2cadeia e alfabeto.
//
// 3- MENU INICIAL - Abre loop do menu inicial que irá rodar enquanto o numero inserido nao for válido.
//	3.1- Atribui o valor verdadeiro a variavel validacao.
//	3.2- Recebe numeros inseridos pelo usuario.
//	3.3- Percorre o vetor alfabeto comparando os valores inseridos.
//		3.3.2- Se o valor inserido conter o valor do vetor, atribuir falso ao valor da validacao.
//		3.3.3- Criar condicao para caso o numero seja decimal.
//	3.4- Se o numero nao for validado, retorna mensagem de erro.
//
// 5- Converter os tipos dos valores inseridos.
//	5.1- Converter cadeia para real.
//	5.2- Converter real para inteiro.
//	5.3- Criar n1Tela e n2Tela que ira testar se os valores inseridos contem casas decimais relevantes a serem exibidas.
//
// 6- MENU DOS CALCULOS - Abrir loop para menu com escolhas de operacoes;
// 	6.1- Recebe a operaçao a escolhida.
//	6.2- Criar uma alternativa para trocar os numeros escolhidos(Voltar ao menu inicial).
//	6.3- Efetua o calculo e exibe o resultado de acordo com a operacao selecionada.
//	6.4- Menu final
//		6.4.1- Deseja realizar outra operacao? sim ou nao.
// 7- MENU FINAL - ainda dentro do loop do menu dos calculos
//	7.1- Deseja realizar outra operacao:
//		7.1.1- Sim: Ler menuFinal[0] = 1
//		7.1.2- Nao: Ler menuFinal[0] = 2
//	7.1- Deseja sair da calculadora:
//		7.1.1- Sim: Ler menuFinal[1] = 1
//		7.1.2- Não: Ler menuFinal[1] = 2
//		7.1.3- Voltar ao menu inicial: ler menuFinal[1] = 3
// 8- Verifica opcao escolhida no ultimo menu e encerra ou reinicia o programa.
//
// FIM

//BUGS
//1- Receber e exibir numeros decimais. RESOLVIDO
//2- Tratar opcoes invalidas no menu de operacoes. PARCIALMENTE RESOLVIDO. erro se digitar uma cadeia
//
//POSSIVEIS MELHORIAS
//
//1- Implementar funcoes

package br.com.poo.lista1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

	private double[] numeros = {0,0};

	public static void main(String[] args) {
		Exercicio3 ex3 = new Exercicio3();
		ex3.menuEnterNumber();
	}

	public void menuEnterNumber() {
		
		// mensagens do boas vindas
		System.out.println("Olá, seja bem-vindo(a) ao Zeus, a calculadora dos deuses!");
		System.out.println();
		
		// recebe numeros validados do usuario
		inputValidNumber();

		// imprime valores inseridos
		System.out.println("Números inseridos: " + numeros[0] + " e " + numeros[1]);

	}

	public void inputValidNumber() {
		Scanner sc = new Scanner(System.in);

		boolean validInput = false;
		while (!validInput) {
			try {
				if (numeros[0] == 0) { // testa se o valor ja foi inserido
					System.out.print("Digite o primeiro número: ");
					numeros[0] = sc.nextInt();
				}

				System.out.print("Digite o segundo número: ");
				numeros[1] = sc.nextInt();

				// Se o codigo chegar aqui o valor e validado
				validInput = true;
			} catch (InputMismatchException e) {
				limpa();
				System.out.println("Valor invãlido. Por favor digite um número válido.");
				System.out.println();
				sc.nextLine(); // Limpa o valor inválido
			}
		}
		sc.close();
	}
	
	public static void limpa() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
