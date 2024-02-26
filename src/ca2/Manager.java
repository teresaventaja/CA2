/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;

/**
 *
 * @author User
 */
public class Manager extends Employee {
        // Adding to meet Part 2 . b)
    
    public static String userName = "Gnomeo";
    public static String password = "smurf";

    
        public Manager(String name, String email, String userName, String password) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        }
        
        // Adding to meet Part 2 . b)
    
    public String getUserName() {
    return userName;
    }
    
    public String getPassword() {
    return password;
    }
    
    public void setUserName(String userName) {
    this.userName = userName;
    }
    
    public void setPassword(String password) {
    this.password = password;
    }
}
