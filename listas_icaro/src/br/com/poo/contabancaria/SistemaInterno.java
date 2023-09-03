package br.com.poo.contabancaria;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SistemaInterno {

	public static void main(String[] args) {
		// instancia minhaConta
		Conta minhaConta = new Conta(123, "Pedro", 1000);
		
		// instancia contaDestino
		Conta contaDestino = new Conta(321, "Destino da Silva", 5000);
		
		// instancia Logger
		final Logger logger = Logger.getLogger(SistemaInterno.class.getName());
		
		// imprime as duas contas na tela
		logger.log(Level.INFO, () -> "\nMinha conta\n" + minhaConta);
		logger.log(Level.INFO, () -> "\nConta destino\n" + contaDestino);
		
		minhaConta.sacar(2);
		minhaConta.depositar(3);
		minhaConta.transferir(contaDestino, 2000); //
		minhaConta.transferir(contaDestino, 990);
		
		
		// imprime as contas apos operacoes
		logger.log(Level.INFO, () -> "\nMinha conta\n" + minhaConta);
		logger.log(Level.INFO, () -> "\nConta destino\n" + contaDestino);
		
		
	}

}
