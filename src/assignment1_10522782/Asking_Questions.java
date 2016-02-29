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

public class Asking_Questions {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        int age, height_feet, height_inches;
        double weight;
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        System.out.println("How tall are you? Enter height in feet, strike the return key and then enter height in inches");
        height_feet = keyboard.nextInt();
        height_inches = keyboard.nextInt();
        
        System.out.println("How much do you weigh? ");
        weight = keyboard.nextDouble();
        
        System.out.println("So, you're " + age + " years old " + height_feet + "'" + height_inches + " tall and " + weight + " heavy");
        
    }
    
}
