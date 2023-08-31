package br.com.poo.balanco;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BalancoTrimestralDouble {
	
	private double gastosJaneiro = 15000.0;
	private double gastosFevereiro = 23000.0;
	private double gastosMarco = 17000.0;
	private double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	// instancia o logger
	private static Logger logger = Logger.getLogger(BalancoTrimestralDouble.class.getName());
			
	public double soma () {
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public double soma (double janeiro) {
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public double soma (double janeiro, double fevereiro) {
		somaTotal = janeiro + fevereiro;
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	public double soma (double janeiro, double fevereiro, double marco) {
		somaTotal = janeiro + fevereiro + marco;
		logger.log(Level.INFO, "O balanço trimestral é de R$: " + somaTotal);
		return somaTotal;
	}
	
	
	
	
}
