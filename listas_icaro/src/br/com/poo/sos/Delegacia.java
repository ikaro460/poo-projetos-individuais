package br.com.poo.sos;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class Delegacia {
	
	private String nome;
	private String end;
	private Integer tel;
	
	private static final String OBJ_CRIADO = "Objeto criado";
	private Logger logger = Util.setupLogger();
	
	public Delegacia() {
		Util.customizer();
		logger.log(Level.INFO, OBJ_CRIADO);
	}
	
	public Delegacia(String nome, String end, Integer tel) {
		Util.customizer();
		this.nome = nome;
		this.end = end;
		this.tel = tel;
		logger.log(Level.INFO, OBJ_CRIADO);
	}
	
	@Override
	public String toString() {
		return "Delegacia: " + nome + "\nEndereço: " + end + "\ntel: " + tel + "\n";
	}

}
