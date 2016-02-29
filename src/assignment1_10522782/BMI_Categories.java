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
        
public class BMI_Categories {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        double height, weight, bmi;
        
        System.out.println("Your height in m: ");
        height = keyboard.nextDouble();
        
        System.out.println("Your weight in kg: ");
        weight = keyboard.nextDouble();
        
        bmi = weight/(Math.pow(height,2));
        
        System.out.println("Your BMI is " + bmi);
        
        if ( bmi >= 30.0 )
        {
            System.out.println("BMI Category: obese");
        }
        else if ( bmi >= 25.0 )
        {
            System.out.println("BMI Category: overweight");
        }
        else if ( bmi >= 18.5 )
        {
            System.out.println("BMI Category: normal weight");
        }
        else if ( bmi <18.5 )
        {
            System.out.println("BMI Category: underweight");
        }
    }
}
