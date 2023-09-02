package br.com.poo.balanco;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Util {

	private Util() {
		
	}
	
	public static Logger setupLogger() {
		Logger logger = Logger.getLogger(Util.class.getName());
		logger.setUseParentHandlers(false);
		ConsoleHandler customHandler = new ConsoleHandler();
		
		customHandler.setFormatter(new Formatter() {
			@Override
			public String format(LogRecord rec) {
				return rec.getMessage()+"\n";
			}
		});
		
		logger.addHandler(customHandler);
		return logger;
	}
}
