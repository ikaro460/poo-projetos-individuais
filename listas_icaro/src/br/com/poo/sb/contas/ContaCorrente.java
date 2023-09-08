package br.com.poo.sb.contas;

import java.util.logging.Level;

import br.com.poo.sb.OperacaoInvalidaException;
import br.com.poo.sb.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	private double limite;
	private double tarifa;

	// Construtor
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int numero, String titular, double saldo, double chequeEspecial) {
		super(numero, titular, saldo);
		this.limite = chequeEspecial;
	}

	// getter para o chequeEspecial
	public double getChequeEspecial() {
		return limite;
	}
	
	// setter para o chequeEspecial
	public void setChequeEspecial(double chequeEspecial) {
		this.limite = chequeEspecial;
	}
	

	public void sacarChequeEspecial(double valor) throws SaldoInsuficienteException, OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor inválido");
		}else if((getSaldo() + limite) >= valor) {
			setSaldo(getSaldo() - valor);
			logger.log(Level.INFO, () -> "Saque Cheque Especial: " + valor );
		} else {
			throw new SaldoInsuficienteException(getSaldo());
		}
	}
	
	
	
	// metodos simular cheque especial
	public void aplicarJurosCE() throws SaldoInsuficienteException, OperacaoInvalidaException {
		if(getSaldo() < 0 || tarifa > 0) {
			sacarChequeEspecial(-(getSaldo()) * tarifa);
		} else {
			throw new SaldoInsuficienteException(getSaldo());
		}
	}
	
	

}