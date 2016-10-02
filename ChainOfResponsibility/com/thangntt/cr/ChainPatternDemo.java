package com.thangntt.cr;

public class ChainPatternDemo {

	public static void main(String[] args) {
		
		AbstractLogger loggerChain = getChainofLogger();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");

	}
	
	private static AbstractLogger getChainofLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}	

}
