/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
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
        
        Employee firstEmployee = new Employee("Joe Bloggs", "jb@gmail.com") {};
        Employee secondEmployee = new Employee("Ann Banana", "ab@gmail.com") {};
        Employee thirdEmployee = new Employee("Tom Thumb", "tt@gmail.com") {};
        
        // Stored in an arrayList
        
        ArrayList<Employee> projectGroup = new ArrayList<>();
        projectGroup.add(firstEmployee);
        projectGroup.add(secondEmployee);
        projectGroup.add(thirdEmployee);
        
        // Use of getter created in Employee Class 
        
        System.out.println(Employee.getNextEmpNum());
        
        // Part 2 BONUS CHALLENGE: Create a HashSet called staffSet that will not allow two employees with the same empNum to be elements
        
        HashSet<Employee> staffHashset = new HashSet<>();
        staffHashset.add(firstEmployee);
        staffHashset.add(secondEmployee);
        staffHashset.add(thirdEmployee);
    /*
        
    Description of specs: (C)	Write the code to search and display the name of each of the employees in the projectGroup array, 
    who have an employee number above the value stored in a variable called m.

    Issue: wording "who have an employee number above the value stored in a variable called m." confusing

    My interpretation: the search query is stored in variable "m"

    */
        
        // Get employee name based on employee number
    
        int m = secondEmployee.empNum;  // Test employee

        for  (Employee displayEmployee : projectGroup) {
        if (displayEmployee.empNum == m) {
            System.out.println("The name corresponding to this Employee Number is " + displayEmployee.name);
            break; // Exit the loop when the person is found
            }
        }
                
        /* 
        
        TESTING IF PART 2 SECTION (a) iii) WORKS
        
        Company firstComp = new Company();
        firstComp.addNewStaff(secondEmployee);
        firstComp.addNewStaff(thirdEmployee);
        
        firstComp.listEmployees(1);
        
       */
        
        //    PART 2 SECTION (c)
        

        Scanner scanner = new Scanner(System.in);
        
        Company company = new Company();
        
        // Manager credentials
        
        Manager manager = new Manager("Manager Name", "manager@example.com", "Gnomeo", "smurf");


        while (true) {  // Manager login
            System.out.println("1. Login as Manager, 2. Exit. Choose an option:");
            int selection = scanner.nextInt();
            scanner.nextLine(); // To make sure the previous selection is clear

            if (selection == 1) {
                System.out.print("Enter your username: ");
                String userName = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                if (userName.equals(manager.getUserName()) && password.equals(manager.getPassword())) {
                    System.out.println("Login successful.");
                    
        // Menu to view, add and remove staff
                    
        while (true) {
            System.out.println("1. Add new staff, 2. View current staff, 3. Remove staff, 4. Logout. Choose an option:");
            int managerOption = scanner.nextInt();
            scanner.nextLine(); // To make sure the previous selection is clear

            switch (managerOption) {
                
                case 1: // Add staff
                    System.out.print("Enter staff name: ");
                    String staffName = scanner.nextLine();
                    System.out.print("Enter staff email: ");
                    String staffEmail = scanner.nextLine();
                    Employee newEmployee = new Employee(staffName, staffEmail) {};
                    company.addNewStaff(newEmployee);
                    System.out.println("New staff added.");
                    break;
                
                case 2: // View staff
                    System.out.println("Employees list:");
                    for (Employee employee : projectGroup) {
                        System.out.println("Name: " + employee.getName() + ", Email: " + employee.getEmail() + ", Employee Number: " + employee.getEmpNum());
                        }
                    if (projectGroup.isEmpty()) {
                        System.out.println("No employees stored.");
                        }
                    break;
                
                case 3:   // Remove staff
                    System.out.print("Enter Employee Number of the staff to remove: ");
                    int empNumToRemove = scanner.nextInt();
                    scanner.nextLine();  // To make sure the previous selection is clear

                    boolean found = false;
                    
                    Iterator<Employee> iterator = projectGroup.iterator();

                    while (iterator.hasNext()) {
                    Employee employee = iterator.next();
                    if (employee.getEmpNum() == empNumToRemove) {
                        iterator.remove();
                        System.out.println("Employee with Employee Number " + empNumToRemove + " has been removed.");
                        found = true;
                        break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Employee with Employee Number " + empNumToRemove + " not found.");
                        }
                    break;
                
                case 4: // Logout
                    return;
                }
        }
        
        // Back to original console menu (login)
        
                } else { // Login failure
                    System.out.println("Login failed. Please try again.");
                }
                
            } else if (selection == 2) { // Close the menu
                break; 
            }
        }
        scanner.close();
    }

 }

