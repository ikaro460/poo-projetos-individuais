package br.com.poo.sos;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.balanco.Util;

public class ServicoDeEmergencia {
	

	public static void main(String[] args) {
		final Logger logger = Util.setupLogger();
		
		// Delegacia
		Delegacia dp = new Delegacia("13 DP","Av Barão do Rio Branco", 22485256);
		Util.customizer();
		logger.log(Level.INFO, ()-> "" + dp);
		
		// Denuncia
		Denuncia dn = new Denuncia("Anonimo","Latrocínio", 22082023);
		Util.customizer();
		logger.log(Level.INFO, ()-> "" + dn);
	}

}
