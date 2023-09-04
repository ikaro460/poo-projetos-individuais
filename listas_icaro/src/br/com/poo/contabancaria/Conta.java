package br.com.poo.contabancaria;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	private static Logger logger = Logger.getLogger(Conta.class.getName());

	// construtores
	public Conta() {
	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	// getter
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Número da conta: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo;
	}


	// metodos sacar, depositar e transferir
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			logger.log(Level.WARNING, () -> "Saldo insuficiente!");
			return false;
		} else {
			this.saldo -= valor;
			logger.log(Level.INFO, () -> "Saque efetuado com sucesso!");
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (valor < 0) {
			logger.log(Level.INFO, () -> "Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			logger.log(Level.INFO, () -> "Depósito efetuado com sucesso!");
			return true;
		}
	}

	public boolean transferir(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (!retirou) {
			logger.log(Level.WARNING, () -> "Saldo insuficiente!");
			return false;
		} else {
			destino.depositar(valor);
			return true;
		}
	}

}
