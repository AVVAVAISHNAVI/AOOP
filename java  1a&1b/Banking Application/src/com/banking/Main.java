package com.banking;

public class Main {

	public static void main(String[] args) {
		
		        LoginManager loginManager = LoginManager.getInstance();

		        loginManager.login("john_doe");

		        BankingOperations operations = new BankingOperations();
		        operations.viewBalance();
		        operations.deposit(150.00);
		        operations.withdraw(50.00);

		        loginManager.logout();

		        operations.viewBalance();
		        operations.deposit(100.00);
		        operations.withdraw(30.00);
		    }
		

	}


