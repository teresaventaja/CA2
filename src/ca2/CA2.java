/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import static ca2.Employee.nextEmpNum;
import java.util.Set;

/**
 *add git
 * @author User
 */
public class CA2 {

    /**
     * @param args the command line arguments
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

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee firstEmp = new Employee("Antonio", "ant@gmail.com");
        firstEmp.getNextEmpNum();
        //firstEmp.getEmpNum();
        System.out.println(firstEmp.getEmpNum());
        System.out.println(nextEmpNum);
        
        Employee secEmp = new Employee("Antoni", "ant@gmai.com");
        System.out.println(secEmp.getEmpNum());
        secEmp.setEmail("a@dd");
        
    }
    
}
