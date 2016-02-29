/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10522782;
import javax.swing.*;
/**
 *
 * @author Lawal Nafiu
 */
public class Prog611 {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);
        
        System.out.print("Hello, " + name + ".");
        System.out.print("Next year, you'll be " + (age + 1));
        System.exit(0);
    }
    
}
