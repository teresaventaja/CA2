/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 * 
 * 
 */
public class Company extends Employee {
    
    String companyName;
    
    ArrayList<Employee> staff = new ArrayList<>();

    // Write the default constructor for this class which initialises all fields
    
    public Company() {
        name = "DefaultName";
        email = "default@xmail.com";
        empNum = nextEmpNum++;
        companyName = "defaultCompany";
    }
    
    // Write an overloaded constructor which accepts a name value as a parameter.
    
    public Company(String name) {
    this.name = name;
    email = "default@xmail.com";
    empNum = nextEmpNum++;
    companyName = "defaultCompany";
}  
    
    // addNewStaff() adds a new employee to the staff arrayList (the employee is a parameter). 

    public void addNewStaff(Employee addThisEmployee) {
        staff.add(addThisEmployee);
    }
    
    //	getStaffNumber() returns the number of employees currently in the arrayList.
    
    public void getStaffNumber() {
        staff.size();
    }
    
    /* 
    
    listEmployees() uses an iterator object to find in the arrayList all employees above a given employee number value  
    (this value is a parameter for this method) and prints the names of these employees. 
    
    */
    
    public void listEmployees(int checkAboveThisEmployeeNumber) {
    Iterator<Employee> iterator = staff.iterator();

        while (iterator.hasNext()) {
            Employee theEmployee = iterator.next();
            if (theEmployee.getEmpNum() > checkAboveThisEmployeeNumber) {
                System.out.println(theEmployee.getName());
            }
        }
    }
    
 public void removeStaff(int employeeNumberToRemove) { // Iterator to remove staff
    Iterator<Employee> iterator = staff.iterator();
    
    while (iterator.hasNext()) {
        Employee employee = iterator.next();
        if (employee.getEmpNum() == employeeNumberToRemove) {
            iterator.remove();
            System.out.println("Employee with Employee Number " + employeeNumberToRemove + " has been removed.");
            return;
        }
    }
    System.out.println("Employee with Employee Number " + employeeNumberToRemove + " not found.");
}   

}
