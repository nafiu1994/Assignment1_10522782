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
public class Age_Message3 {
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        int age;
        String name;
        
        System.out.println("Your name: ");
        name = keyboard.next();
        
        System.out.println("Your age: ");
        age = keyboard.nextInt();
        
        if ( age >= 25)
        {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
        if ( (age >= 16) && age < 18 )
        {
            System.out.println("You can drive but not vote, " + name + ".");
        }
        if ( (age >= 18) && age < 25 )
        {
            System.out.println("You can vote but not rent a car " + name + ".");
        }
        if ( age < 16 )
        {
            System.out.println("You can't drive, " + name + ".");
        }
        
    }
    
}
