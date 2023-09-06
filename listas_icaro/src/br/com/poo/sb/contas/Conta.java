package br.com.poo.sb.contas;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.sb.OperacaoInvalidaException;
import br.com.poo.sb.SaldoInsuficienteException;
import br.com.poo.util.Util;

public class Conta {
	
	static Logger logger = Util.setupLogger();

	private int numero;
	private String titular;
	private double saldo;

	// construtores
	public Conta() {
		logger.log(Level.INFO, "Objeto criado");
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
		return "Número da conta: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo + "\n";
	}

	// metodos sacar, depositar e transferir
	public void sacar(double valor) throws SaldoInsuficienteException, OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor inválido");
		}else if((this.saldo + 500) >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}

	public void depositar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor inválido");
		} else {
			this.saldo += valor;
		}
	}

	public void transferir(Conta destino, double valor) throws SaldoInsuficienteException, OperacaoInvalidaException {
		this.sacar(valor);
		destino.depositar(valor);
	}

}
