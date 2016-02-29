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
public class A_Little_Quiz {
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        
        int kount = 0, ans;
        
        System.out.println("Are you ready for a Quiz?");
        keyboard.next();
        
        System.out.println("Q1 What is the capital of Alaska? \n   1) Melbourne \n   2) Anchorage \n   3) Juneau ");
        ans = keyboard.nextInt();
        if ( ans == 3)
        {
            System.out.println("Thats right!");
            kount += 1;
        }
        else
        {
            System.out.println("Sorry! Wrong Answer");
        }
        
        System.out.println("Q2 Can you store the value 'cat' in a variable of type int? \n   1) yes \n   2) no");
        ans = keyboard.nextInt();
        if ( ans == 2)
        {
            System.out.println("That's right!");
            kount += 1;
        }
        else
        {
            System.out.println("Sorry, 'cat' is a string. ints can only store numbers");
        }
        
        System.out.println("What is the result of 9+6/2? \n   1) 5 \n   2) 11  \n   3) 15/3");
        ans = keyboard.nextInt();
        if ( ans == 2)
        {
            System.out.println("That's correct.");
            kount += 1;
        }
        else
        {
            System.out.println("Wrong answer!");
        }
        
        System.out.println("Overall, you got " + kount + " out of 3 correct. \n Thanks for playing!");
    }
}
