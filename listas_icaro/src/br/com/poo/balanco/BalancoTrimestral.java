package br.com.poo.balanco;

import java.math.BigDecimal;


public class BalancoTrimestral {

	public static void main(String[] args) {
		
		// instancia do valor int
		BalancoTrimestralInt bti = new BalancoTrimestralInt(1200);
		bti.soma();
		bti.soma(100, 112389);
		
		
		// instancia do valor double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
		btd.soma();
		btd.soma(15000.50, 1500.99);
		
		
		// instancia do valor BigDecimal
		BalancoTrimestralBigDecimal btg = new BalancoTrimestralBigDecimal();
		btg.soma();
		btg.soma(new BigDecimal(100));
		btg.soma(new BigDecimal(100), new BigDecimal(4500));
		btg.soma(new BigDecimal(100), new BigDecimal(4500), new BigDecimal(15000));
	}

}
