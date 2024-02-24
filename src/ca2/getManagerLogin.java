/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class getManagerLogin {
    
    public String askString (String prompt) {
        
    //ask the manager using prompt. Return what the manager enters
        
    Scanner myScanner = new Scanner (System.in);
    System.out.println(prompt);
    try{
        String userInput = myScanner.nextLine();
    return userInput; // returns what the user entered
    } catch (Exception e) {
    return ""; // the method has to return something
    }
    }
}
