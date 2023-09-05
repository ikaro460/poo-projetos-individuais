package br.com.poo.balanco;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BalancoTrimestralInt {
	
	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	private Integer gastosAbril = 0;
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril;
	
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();
	
	
	// construtores
	public BalancoTrimestralInt() {
		Util.customizer();
		customLogger.log(Level.INFO, "Objeto criado" );
	}	
	
	public BalancoTrimestralInt(int janeiro) {
		this.gastosJaneiro = janeiro;
		
		Util.customizer();
		customLogger.log(Level.INFO, "Objeto criado" );
	}
	
	public BalancoTrimestralInt(int janeiro, int fevereiro) {
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		
		Util.customizer();
		customLogger.log(Level.INFO, "Objeto criado" );
	}
	
	public BalancoTrimestralInt(int janeiro, int fevereiro, int marco) {
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		
		Util.customizer();
		customLogger.log(Level.INFO, "Objeto criado" );
	}
	
	public BalancoTrimestralInt(int janeiro, int fevereiro, int marco, int abril) {
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		this.gastosAbril = abril;
		
		Util.customizer();
		customLogger.log(Level.INFO, "Objeto criado" );
	}
	
	// metodo soma
	public int soma () {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public int soma (int janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public int soma (int janeiro, int fevereiro) {
		Util.customizer();
		int somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public int soma (int janeiro, int fevereiro, int marco) {
		Util.customizer();
		int somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
	public int soma (int janeiro, int fevereiro, int marco, int abril) {
		Util.customizer();
		int soma4 = janeiro + fevereiro + marco + abril;
		customLogger.log(Level.INFO, () -> "O gasto dos primeiros 4 meses foi de R$ " + df.format(soma4));
		return soma4;
	}
}
