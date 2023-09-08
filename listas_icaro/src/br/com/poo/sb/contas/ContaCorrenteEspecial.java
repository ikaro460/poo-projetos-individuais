package br.com.poo.sb.contas;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	private double cartaoCredito;
	private double investimento;
	
	
	
	public ContaCorrenteEspecial() {
		super();
	}
	public ContaCorrenteEspecial(int numero, String titular, double saldo, double chequeEspecial, double cartaoCredito, double investimento) {
		super(numero, titular, saldo, chequeEspecial);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
		
	}
	//getters e setters
	public double getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public double getInvestimento() {
		return investimento;
	}
	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

}
