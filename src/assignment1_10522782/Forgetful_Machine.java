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
public class Forgetful_Machine {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Give me a word!");
        keyboard.next();
        
        System.out.println("Give me a second word!");
        keyboard.next();
        
        System.out.println("Great, now your favourite number");
        keyboard.next();
        
        System.out.println(" And your second favourite number....");
        keyboard.next();
        
        System.out.println("Whew!  Wasn't that fun?"); 
        
    }
}
