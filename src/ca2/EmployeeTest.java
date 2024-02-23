/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import static ca2.Employee.nextEmpNum;
import java.util.ArrayList;
import java.util.Set;

/**
 *add git
 * @author User
 * 
 * https://github.com/teresaventaja/CA2
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Three objects
        
        Employee firstEmployee = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee secondEmployee = new Employee("Ann Banana", "ab@gmail.com");
        Employee thirdEmployee = new Employee("Tom Thumb", "tt@gmail.com");
        
        // Stored in an arrayList
        
        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(firstEmployee);
        projectGroup.add(secondEmployee);
        projectGroup.add(thirdEmployee);
        
        // Use of getter created in Emloyee Class 
        
        System.out.println(Employee.getNextEmpNum());
   
    /*
        
    Description of specs: (C)	Write the code to search and display the name of each of the employees in the projectGroup array, 
    who have an employee number above the value stored in a variable called m.

    Issue: wording "who have an employee number above the value stored in a variable called m." confusing

    My interpretation: the search query is stored in variable "m"

    */
        
        // Get employee name based on employee number
    
        int m = secondEmployee.empNum;

        for  (Employee displayEmployee : projectGroup) {
        if (displayEmployee.empNum == m) {
            System.out.println("The name corresponding to this Employee Number is " + displayEmployee.name);
            break; // Exit the loop when the person is found
            }
        }
        
    }
}
