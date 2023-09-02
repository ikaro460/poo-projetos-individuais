package br.com.poo.extras;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

	public static void main(String[] args) {
		String nome = "icaro";
		String sobrenome = "gaspar";
		
		final Logger logger = Logger.getLogger(LoggerTest.class.getName());

		if (logger.isLoggable(Level.INFO)) {
			logger.log(Level.INFO, String.format("Olá, %s %s, seja bem vindo", nome, sobrenome));
		}
		
	}

}
