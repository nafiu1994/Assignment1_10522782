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
public class Gender_Game {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender, m_status;
        String f_name, l_name;
        
        System.out.println("What is your gender (M or F): ");
        gender = keyboard.next().charAt(0);
        
        System.out.println("First name: ");
        f_name = keyboard.next();
        
        System.out.println("Last name: ");
        l_name = keyboard.next();
        
        System.out.println("Age");
        age = keyboard.nextInt();
        
        //Females
        if ( gender == 'F')
        {
            if (age >= 20)
            {
                System.out.print("Are you married, " + f_name  + " (y/n)? ");
                m_status = keyboard.next().charAt(0);
                
                if ( m_status == 'y')
                {
                    System.out.println("Then I shall call you Mrs. " + l_name + ".");       
                }
                else
                {
                    System.out.println("Then I shall call you Ms. " + l_name + ".");
                }
                        
            }
            else
            {
                System.out.println("Then I shall call you " + f_name + " " + l_name + ".");
            }
                     
        }
        
        else if ( gender == 'M')
        {
            if ( age >= 20)
            {
                System.out.println("Then I shall call you Mr. " + l_name + ".");
            }
            else
            {
                System.out.println("Then I shall call you " + f_name + " " + l_name + ".");
            }
        }
        
    }
    
}
