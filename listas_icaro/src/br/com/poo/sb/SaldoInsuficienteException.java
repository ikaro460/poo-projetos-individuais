package br.com.poo.sb;

public class SaldoInsuficienteException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final double saldoDisponivel;

    public SaldoInsuficienteException(double saldoDisponivel) {
        super("Saldo insuficiente. Saldo disponível: " + saldoDisponivel);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
}
