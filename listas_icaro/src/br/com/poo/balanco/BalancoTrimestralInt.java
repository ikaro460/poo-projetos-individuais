package br.com.poo.balanco;

public class BalancoTrimestralInt {

	private Integer jan = 15000;
	private Integer fev = 23000;
	private Integer mar = 17000;
	
	private Integer gastosInt = jan + fev + mar;
	
	public int soma() {
		System.out.printf("GastosInt: %d", gastosInt);
		return gastosInt;
	}
}
