package com.banking;

public class BankingOperations {
	    public void viewBalance() {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Viewing balance for " + loginManager.getUsername());
	          
	        } else {
	            System.out.println("Please log in to view balance.");
	        }
	    }
	    public void deposit(double amount) {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Depositing $" + amount + " for " + loginManager.getUsername());
	           
	        } else {
	            System.out.println("Please log in to deposit funds.");
	        }
	    }

	    
	    public void withdraw(double amount) {
	        LoginManager loginManager = LoginManager.getInstance();
	        if (loginManager.isLoggedIn()) {
	            System.out.println("Withdrawing $" + amount + " for " + loginManager.getUsername());
	           
	        } else {
	            System.out.println("Please log in to withdraw funds.");
	        }
	    }
	}

