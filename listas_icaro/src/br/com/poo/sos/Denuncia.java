package br.com.poo.sos;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.util.Util;

public class Denuncia {
	
	private String denunciante;
	private String motivo;
	private Integer data;
	
	private static final String OBJ_CRIADO = "Objeto criado";
	private Logger logger = Util.setupLogger();
	
	public Denuncia() {
		Util.customizer();
		logger.log(Level.INFO, OBJ_CRIADO);
	}
	
	public Denuncia(String denunciante, String motivo, Integer data) {
		Util.customizer();
		this.denunciante = denunciante;
		this.motivo = motivo;
		this.data = data;
		logger.log(Level.INFO, OBJ_CRIADO);
	}
	
	@Override
	public String toString() {
		return "Denunciante: " + denunciante + "\nMotivo: " + motivo + "\nData: " + data + "\n";
	}
	
}
