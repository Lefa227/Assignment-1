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
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        
        //Make use of a do while loop to ensure the user enters the correct details 
        do{
        System.out.print("Please enter your username:");
         username = scanner.nextLine(); 
        
        } while(!log.checkUsername(username));
        
        do{
        System.out.print("Please enter your password:");
        password = scanner.nextLine();
        }while(log.checkpasswordcomplexity(password));     
    }
}
