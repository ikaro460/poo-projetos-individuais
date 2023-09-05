package br.com.poo.sb;

public class OperacaoInvalidaException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
