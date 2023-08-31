package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInt {
	
	private static final Logger logger = Logger.getLogger(BalancoTrimestralInt.class.getName());

	private int jan = 15000;
	private int fev = 23000;
	private int mar = 17000;
	
	private int somaTotal = jan + fev + mar;
	
	public int soma() {
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		somaTotal = janeiro;
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public int soma(int janeiro, int fevereiro) {
		somaTotal = janeiro + fevereiro;
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		somaTotal = janeiro + fevereiro + marco;
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
}
