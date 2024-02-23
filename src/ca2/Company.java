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
    String userName;
    String password;
    
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

    public void addNewStaff(Employee addEmployee) {
        staff.add(addEmployee);
    }
    
    //	getStaffNumber() returns the number of employees currently in the arrayList.
    
    public void getStaffNumber() {
        staff.size();
    }
    
    /* 
    
    listEmployees() uses an iterator object to find in the arrayList all employees above a given employee number value  
    (this value is a parameter for this method) and prints the names of these employees. 
    
    */
    
    public void listEmployees(int empNum) {
    Iterator<Employee> iterator = staff.iterator();

        while (iterator.hasNext()) {
            Employee theEmployee = iterator.next();
            if (theEmployee.getEmpNum() > empNum) {
                System.out.println(theEmployee.getName());
            }
        }
    }

    /*
            
    b)	A particular employee has been designated a “manager”. They are considered as a regular employee for all purposes, 
        except that they also have a “username” and a “password” as fields, with corresponding getters and setters. 

    c)	Create a Netbean-console menu system for the manager to log in and 
        and add new staff. (username – “Gnomeo”; Password – “smurf”)
            
    */
            
        public Manager() {
        userName = "Gnomeo";
        password = "smurf";
        }
    
        public void managerLogin() {
            System.out.println("Please, enter your username");
        }    

}
