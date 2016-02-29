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
public class Dumb_Calculator {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        double n1, n2, n3;
        
        System.out.println("What is your first number?");
        n1 = keyboard.nextDouble();
        
        System.out.println("What is your second number?");
        n2 = keyboard.nextDouble();
        
        System.out.println("What is  your third number?");
        n3 = keyboard.nextDouble();
        
        System.out.println("(" + n1 + " + " + n2 + " + " + n3 + " )/2  is...." + (n1+n2+n3)/2 );

    }
    
}
