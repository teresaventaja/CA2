/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

/**
 *

 * @author User
 */
public class Employee {
     /**
     * @param args the command line arguments
     */
    String name;
    String email;
    int empNum;

    public static int nextEmpNum = 1;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    public Employee() {
        name = "DefaultName";
        email = "default@xmail.com";
        empNum = nextEmpNum++;
    }
    
    public String getName() {
    return name;
    }
    
    public String getEmail() {
    return email;
    }
    
    public int getEmpNum() {
    return empNum;
    }
    
    public void setEmail(String email) {
    if (email.length() > 3) {
    this.email = email;
        } else {
        System.out.println("The email must be at least 3 characters long");
        }
    }

    public static int getNextEmpNum() {
    return nextEmpNum;
    }
    
}
