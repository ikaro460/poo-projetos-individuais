package br.com.poo.contabancaria;

public class OperacaoInvalidaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
