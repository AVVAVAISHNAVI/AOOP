package com.passwordValidator;

public class PasswordValidator {

		
		    public static boolean isValidPassword(String password) {
		        if (password == null || password.length() < 8) {
		            return false; 
		        }
		        
		        boolean hasUpperCase = false;
		        boolean hasLowerCase = false;
		        boolean hasSpecialChar = false;
		        
		        for (char c : password.toCharArray()) {
		            if (Character.isUpperCase(c)) {
		                hasUpperCase = true;
		            } else if (Character.isLowerCase(c)) {
		                hasLowerCase = true;
		            } else if (!Character.isLetterOrDigit(c)) {
		                hasSpecialChar = true;
		            }
		        }
		        return hasUpperCase && hasLowerCase && hasSpecialChar;
		    }
		    public static void main(String[] args) {
		        String[] testPasswords = {
		            "Password123", 
		            "P@ssw0rd",    
		            "12345678",    
		            "P@ss",       
		            "LongPasswordWithNoSpecialChar",
		            "Vaishnavi1@Password", 
		            "noUPPERcase!", 
		            "NOLOWERCASE123!" 
		        };

		        for (String password : testPasswords) {
		            System.out.println("Password: " + password + " -> " + (isValidPassword(password) ? "Valid" : "Invalid"));
		        }
		    }

	}


