package com.logging;

public class Main {

	public static void main(String[] args) {

		        Logger logger = Logger.getInstance();
		        logger.log("Application started.");
		        logger.log("Performing some operations...");

		        Logger anotherLogger = Logger.getInstance();
		        anotherLogger.log("Application finished.");

		        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
		    }

	}


