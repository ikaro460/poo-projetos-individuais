package br.com.poo.balanco;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BalancoTrimestralDouble {
	
	private double gastosJaneiro = 15000.0;
	private double gastosFevereiro = 23000.0;
	private double gastosMarco = 17000.0;
	private double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	static final String TXT = "O balanço trimestral é de R$: ";
	DecimalFormat df = new DecimalFormat("#,###"); // cpf ###,###,###-##
	
	// instancia o logger
	private static Logger logger = Logger.getLogger(BalancoTrimestralDouble.class.getName());
			
	public double soma () {
		Logger logger2 = Util.setupLogger();
		
		//() -> funcao anonima/lambda
		logger2.log(Level.INFO, () -> TXT + df.format(somaTotal));
		
		
		return somaTotal;
	}
	
	public double soma (double janeiro) {
		logger.log(Level.INFO, () -> TXT + df.format(somaTotal));
		return janeiro;
	}
	
	public double soma (double janeiro, double fevereiro) {
		somaTotal = janeiro + fevereiro;
		logger.log(Level.INFO, () -> TXT + df.format(somaTotal));
		return somaTotal;
	}
	
	public double soma (double janeiro, double fevereiro, double marco) {
		somaTotal = janeiro + fevereiro + marco;
		logger.log(Level.INFO, () -> TXT + df.format(somaTotal));
		return somaTotal;
	}
	
	
	
	
}
