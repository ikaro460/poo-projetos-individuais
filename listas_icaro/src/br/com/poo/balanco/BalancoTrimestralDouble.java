package br.com.poo.balanco;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class BalancoTrimestralDouble {
	
	private Double gastosJaneiro = 15000.0;
	private Double gastosFevereiro = 23000.0;
	private Double gastosMarco = 17000.0;
	private Double gastosAbril = 10000.0;
	
	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril;
	
	private static final String OBJ_CRIADO = "Objeto criado";
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();
	
	// construtores
	public BalancoTrimestralDouble() {
		Util.customizer();
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}	
	
	public BalancoTrimestralDouble(double janeiro) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralDouble(double janeiro, double fevereiro) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralDouble(double janeiro, double fevereiro, double marco) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralDouble(double janeiro, double fevereiro, double marco, double abril) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		this.gastosAbril = abril;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	// metodo soma
	public double soma () {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public double soma (double janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public double soma (double janeiro, double fevereiro) {
		Util.customizer();
		Double somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public double soma (double janeiro, double fevereiro, double marco) {
		Util.customizer();
		Double somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
	public double soma (double janeiro, double fevereiro, double marco, double abril) {
		Util.customizer();
		Double soma4 = janeiro + fevereiro + marco + abril;
		customLogger.log(Level.INFO, () -> "O gasto dos primeiros 4 meses foi de R$ " + df.format(soma4));
		return soma4;
	}
}
