/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10522782;

/**
 *
 * @author Lawal Nafiu
 */
import java.util.Scanner;
public class More_User_Input {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        //Variable declarations
        String f_name, l_name, Id, login;
        int grade;
        double GPA;
        
        System.out.println("Please enter the following information so I can sell it for a profit");
        
        System.out.println("First Name:  ");
        f_name = keyboard.next();
        
        System.out.println("Last Name:  ");
        l_name = keyboard.next();
        
        System.out.println("Grade (9-12):  ");
        grade = keyboard.nextInt();
        
        System.out.println("Student ID:  ");
        Id = keyboard.next();
        
        System.out.println("Login:  ");
        login = keyboard.next();
        
        System.out.println("GPA (0.0-4.0:  ");
        GPA = keyboard.nextDouble();
        
        System.out.println("\n\nLogin: " + login + "\n ID: " + Id + "\n Name: " + f_name + " " + l_name + " \n GPA: " + GPA + "\n Grade: " + grade);
            
    }
}
