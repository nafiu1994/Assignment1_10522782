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
public class How_Old_Are_You {
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        int age;
        String name;
        
        System.out.println("Hey, What's your name? (Sorry, I keep forgetting.) ");
        name = keyboard.next();
        
        System.out.println("Ok, " + name + " How old are you? ");
        age = keyboard.nextInt();
        
        if ( age >= 25)
        {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
        else if ( age >= 18)
        {
            System.out.println("You can vote but not rent a car, " + name + ".");
        }
        else if ( age >= 16)
        {
            System.out.println("You can drive but not vote, " + name + ".");
        }
        else if ( age < 16)
        {
            System.out.println("You can't drive, " + name + ".");
        }
    }
    
}
