package com.banking;

public class LoginManager {

	    private static LoginManager instance = null;

	    private boolean loggedIn = false;
	    private String username = null;

	    private LoginManager() {
	    }

	    public static LoginManager getInstance() {
	        if (instance == null) {
	            instance = new LoginManager();
	        }
	        return instance;
	    }

	    public void login(String username) {
	        this.loggedIn = true;
	        this.username = username;
	        System.out.println(username + " has logged in.");
	    }

	    public void logout() {
	        this.loggedIn = false;
	        this.username = null;
	        System.out.println("User has logged out.");
	    }

	    public boolean isLoggedIn() {
	        return loggedIn;
	    }

	    public String getUsername() {
	        return username;
	    }
	}


