/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

/**
 *
 * (B)	Write another class, EmployeeTest, containing the main method, which

	creates 3 Employee objects, with the following details

Name	Email
Joe Bloggs	jb@gmail.com 
Ann Banana	ab@gmail.com
Tom Thumb	tt@gmail.com

	declares an array, called projectGroup, to store these 3 Employee objects and loads the array with the objects.
	prints out the value of variable nextEmpNum to the terminal window. 

(C)	Write the code to search and display the name of each of the employees in the projectGroup array, who have an employee number above the value stored in a variable called m.

Challenge: Implement a check for a valid email address

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
