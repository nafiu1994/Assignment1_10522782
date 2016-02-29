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
public class The_Worst_Number {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int num = 5, num2;
        
        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!\n");
        System.out.print("I'm Thinking of a number from 1-10. Try to guess! ");
        num2 = keyboard.nextInt();
        
        if ( num2 == num)
        {
            System.out.println("LOL!!! U GOT IT! I CAN'T BELIEVE U GUESSED IT WAS " + num + "!");
        }
        else
        {
            System.out.println("WOOT!  U SUXOR!!! I PWN J00!!! IT WAS " + num);
        }
    }
    
}
