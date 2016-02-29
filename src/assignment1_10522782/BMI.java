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
public class BMI {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        double height, weight;
        
        System.out.println("Your height in m: ");
        height = keyboard.nextDouble();
        
        System.out.println("Your weight in kg: ");
        weight = keyboard.nextDouble();
        
        System.out.println("Your BMI is " + weight/(Math.pow(height,2)));
 
    }
    
}
