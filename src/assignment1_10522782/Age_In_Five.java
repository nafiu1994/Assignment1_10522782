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
public class Age_In_Five {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hello, What's your name?");
        name = keyboard.next();
        
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        
        System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) +"! Imagine that.");
    }
}
