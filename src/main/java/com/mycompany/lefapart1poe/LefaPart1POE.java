/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lefapart1poe;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LefaPart1POE {

    public static void main(String[] args) {
       
        //Call the methods from the external class 
         Login log = new Login();
         
         //Import scanner 
          Scanner scanner = new Scanner(System.in);
          
           System.out.print("Please enter your firstname:");
        String firstname = scanner.nextLine();
        
        System.out.print("Please enter your lastname:");
        String lastname = scanner.nextLine();
        
         System.out.println("Please enter username");
        String username = scanner.nextLine();
        
         System.out.println("Please enter password");
        String password = scanner.nextLine();
        
        //Make use of a do while loop to ensure the user enters the correct details 
      //User registration 
        
         System.out.println(log.registerUser());
         while(!log.checkUsername()|| !log.checkPasswordComplexity()){
             System.out.println("Try the registration process again!!!!");
             System.out.println("Please enter username");
             username = scanner.nextLine();
             System.out.println("Please enter user Password");
             password = scanner.nextLine();
             
             System.out.println(log.registerUser());
         }
         
         //User Login Process 
         System.out.println("Login Process...........");
         System.out.println("Please enter username");
         username = scanner.nextLine();
         System.out.println("Please enter password");
         password = scanner.nextLine();
         
         System.out.println(log.returnLoginStatus());
         
         //Make use of a do while loop to ensure that the user enters the details that meet the requirements 
         while(!log.loginUser()){
             System.out.println("Please try the login process once more......");
             System.out.println("Please enter username");
             username = scanner.nextLine();
             System.out.println("Please enter password");
             password = scanner.nextLine();
             
             System.out.println(log.returnLoginStatus());
            
         }
         

        
    }
}
