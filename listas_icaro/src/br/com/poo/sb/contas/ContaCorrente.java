package br.com.poo.sb.contas;

import br.com.poo.sb.OperacaoInvalidaException;
import br.com.poo.sb.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	private double chequeEspecial;

	// Construtor
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int numero, String titular, double saldo, double chequeEspecial) {
		super(numero, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	// getter para o chequeEspecial
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	// setter para o chequeEspecial
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	// metodos simular cheque especial
	public void aplicarJurosCE(double saldo, double taxa) throws SaldoInsuficienteException, OperacaoInvalidaException {
		if(saldo < 0 || taxa < 0) {
			this.sacar(-(saldo) * taxa);
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	

}