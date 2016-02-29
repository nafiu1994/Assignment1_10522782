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
public class Two_More_Questions {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        String loc, status;
        
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println("Question 1) Does it stay inside or outside or both");
        loc = keyboard.next();
        
        System.out.println("Question 2) Is it a living thing?");
        status = keyboard.next();
        
        if ( loc.equalsIgnoreCase("inside") && status.equalsIgnoreCase("yes"))
        {
            System.out.println("Then what else will be on your mind other than a houseplant?");
        }
        if ( loc.equalsIgnoreCase("inside") && status.equalsIgnoreCase("no"))
        {
            System.out.println("I have a strong feeling you're thinking about a dinig table!");
        }
        
        if ( loc.equalsIgnoreCase("outside") && status.equalsIgnoreCase("yes"))
        {
            System.out.println("Then what else will be on your mind other than a lemon tree?");
        }
        if ( loc.equalsIgnoreCase("outside") && status.equalsIgnoreCase("no"))
        {
            System.out.println("May be its a swimming pool!");
        }
        
        if ( loc.equalsIgnoreCase("both") && status.equalsIgnoreCase("yes"))
        {
            System.out.println("That will be your little cat");
        }
        if ( loc.equalsIgnoreCase("both") && status.equalsIgnoreCase("no"))
        {
            System.out.println("Obviously the nonliving, inside/outside thing on your mind is a dead ant!");
     
        }   
    }
        
    
}
