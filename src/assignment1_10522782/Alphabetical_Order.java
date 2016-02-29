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
public class Alphabetical_Order {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String name;
        
        System.out.print("What's your last name?");
        name = keyboard.next();
        
        if ( name.compareTo("Carswell") < 0)
        {
            System.out.println("You don't have to wait long, " + name + ".");
        }
        else if ( name.compareTo("Jones") < 0)
        {
            System.out.println("that's not bad, " + name + ".");
        }
        else if ( name.compareTo("Smith") < 0)
        {
            System.out.println("looks like a bit of a wait, " + name + ".");
        }
        else if ( name.compareTo("Young") < 0)
        {
            System.out.println("it's gonna be a while, " + name + ".");
        }
        else if ( name.compareTo("Carswell") > 0)
        {
            System.out.println("Ynot going anywhere for a while, " + name + ".");
        }
    }
    
}
