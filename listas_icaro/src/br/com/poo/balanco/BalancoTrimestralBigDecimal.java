package br.com.poo.balanco;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralBigDecimal {
	
	private BigDecimal gastosJaneiro = new BigDecimal("15000.00");
	private BigDecimal gastosFevereiro = new BigDecimal("23000.00");
	private BigDecimal gastosMarco = new BigDecimal("17000.00");
	private BigDecimal gastosAbril = new BigDecimal("10000.00");
	
	
	private BigDecimal somaTotal = gastosJaneiro.add(gastosFevereiro.add(gastosMarco.add(gastosAbril)));
	private static final String OBJ_CRIADO = "Objeto criado";
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private static Logger customLogger = Util.setupLogger();
	
	// construtores
	public BalancoTrimestralBigDecimal() {
		Util.customizer();
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}	
	
	public BalancoTrimestralBigDecimal(BigDecimal janeiro) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralBigDecimal(BigDecimal janeiro, BigDecimal fevereiro) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralBigDecimal(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	public BalancoTrimestralBigDecimal(BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco, BigDecimal abril) {
		Util.customizer();
		this.gastosJaneiro = janeiro;
		this.gastosFevereiro = fevereiro;
		this.gastosMarco = marco;
		this.gastosAbril = abril;
		customLogger.log(Level.INFO, OBJ_CRIADO );
	}
	
	
	// soma
	public BigDecimal soma () {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public BigDecimal soma (BigDecimal janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public BigDecimal soma (BigDecimal janeiro, BigDecimal fevereiro) {
		Util.customizer();
		BigDecimal somaBi = janeiro.add(fevereiro);
		somaTotal = janeiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public BigDecimal soma (BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco) {
		Util.customizer();
		BigDecimal somaTri = janeiro.add(fevereiro.add(marco));
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
	public BigDecimal soma (BigDecimal janeiro, BigDecimal fevereiro, BigDecimal marco, BigDecimal abril) {
		Util.customizer();
		BigDecimal soma4 = janeiro.add(fevereiro.add(marco.add(abril)));
		customLogger.log(Level.INFO, () -> "O gasto dos primeiros 4 meses foi de R$ " + df.format(soma4));
		return soma4;
	}
}
