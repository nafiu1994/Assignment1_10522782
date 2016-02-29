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
public class Twenty_Questions {
    public static void main( String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        String item, size;
        
        System.out.println("TWO QUESTIONS! \n Think of an object and I'll try to guess it.");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        item = keyboard.next();
        System.out.println("Question 2) Is it bigger than a breadbox? ");
        size = keyboard.next();
        
        if ( item.equalsIgnoreCase("animal") )
        {
            if( size.equalsIgnoreCase("no") )
            {
                System.out.println("My guess is that you are thinking of a squirrel. \n I would ask you if I'm right but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a horse. \n I would ask you if I'm right but I don't actually care.");
            }
        }
        
        if ( item.equalsIgnoreCase("mineral") )
        {
            if( size.equalsIgnoreCase("no") )
            {
                System.out.println("My guess is that you are thinking of a paper clip. \n I would ask you if I'm right but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a greenhouse. \n I would ask you if I'm right but I don't actually care.");
            }
        }
        
        if ( item.equalsIgnoreCase("vegetable") )
        {
            if( size.equalsIgnoreCase("no") )
            {
                System.out.println("My guess is that you are thinking of a hot pepper. \n I would ask you if I'm right but I don't actually care.");
            }
            else
            {
                System.out.println("My guess is that you are thinking of a water melon. \n I would ask you if I'm right but I don't actually care.");
            }
        }
    }
    
}
