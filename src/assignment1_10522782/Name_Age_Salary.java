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
public class Name_Age_Salary {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        double salary;
        
        System.out.println("Hello. What is your name?");
        name = keyboard.next();
        
        System.out.println("\n Hi " + name + "! How old are you?");
        age = keyboard.nextInt();
        
        System.out.println("\n So you're " + age + ", eh? That's not old at all! How much do you make, " + name + "?");
        salary = keyboard.nextDouble();
        
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
        
    }
    
    
}
