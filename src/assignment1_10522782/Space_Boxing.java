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
public class Space_Boxing {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        double weight, status = 0.0;
        int planet;
        
        System.out.println("Please enter your current earth weight: ");
        weight = keyboard.nextDouble();
        
        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus   2. Mars  3. Jupiter  \n 4. Saturn  5. Uranus  6. Neptune");
        System.out.println("Which planet are you visiting?");
        planet = keyboard.nextInt();
        
        //if-else statements
        if ( planet == 1)
        {
            status = weight * 0.78;
        }
        else if ( planet == 2)
        {
            status = weight * 0.39;
        }
        else if ( planet == 3)
        {
            status = weight * 2.65;
        }
        else if ( planet == 4)
        {
            status = weight * 1.17;
        }
        else if ( planet == 5)
        {
            status = weight * 1.05;
        }
        else if ( planet == 6)
        {
            status = weight * 1.23;
        }
        
        System.out.println("Your weight would be " + status + " pounds on that planet.");
    }
    
}
