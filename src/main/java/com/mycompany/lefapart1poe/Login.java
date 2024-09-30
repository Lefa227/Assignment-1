/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lefapart1poe;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
    
    String enteredUsername; // Entered username during login
    String enteredPassword; // Entered password during login
    String firstName; // User's first name
    String lastName; // User's last name
    String password; // User's password
    String username; // User's username

    // Check if the username is valid
    public boolean checkUsername() {
        if (username.length() <= 5 && username.contains("_")) {
            return true;
        }
        return false;
    }
    
    
    // Check if the password meets complexity requirements
    public boolean checkPasswordComplexity() {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasCapitalLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }
        return hasCapitalLetter && hasNumber && hasSpecialChar;
    }
}
