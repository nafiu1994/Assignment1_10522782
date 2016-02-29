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
        
public class Choose_Your_Own_Adventure {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String reply;
        
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'?");
        reply = keyboard.next();
        
        //Case 1
        if ( reply.equalsIgnoreCase("kitchen"))
        {
            System.out.println("\nThere is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                                "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                                "or look in a \"cabinet\".");
            reply = keyboard.next();
            if (reply.equalsIgnoreCase("Refrigerator"))
            {
                System.out.println("\nInside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                                    "Would you like to eat some of the food? (\"yes\" or \"no\")");
                reply = keyboard.next();
                if ( reply.equalsIgnoreCase("no"))
                {
                    System.out.println("\nYou die of starvation... eventually.\n" + " ");
                }
                else
                {
                    System.out.println("\nEnjoy your food while you can. Life is beautiful!");
                }
            }
            if (reply.equalsIgnoreCase("cabinet"))
            {
                System.out.println("\nInside the cabinet you see sponge and detergent.  It looks pretty cool.\n" +
                                    "Would you like to do some washing? (\"yes\" or \"no\")");
                reply = keyboard.next();
                if ( reply.equalsIgnoreCase("no"))
                {
                    System.out.println("\nEnjoy living in dirt! Cleanliness is next to Godliness!" + " ");
                }
                else
                {
                    System.out.println("\nWise choice! A reward awaits you next door after washing!");
                }
            }
        }
        
        //Case 2
        if ( reply.equalsIgnoreCase("Upstairs"))
        {
            System.out.println("\nUpstairs you see a hallway.  At the end of the hallway is the master\n" +
                               "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                                "to go?");
            reply = keyboard.next();
            if (reply.equalsIgnoreCase("bedroom"))
            {
                System.out.println("\nYou are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                                    "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                                    "like to open the door? (\"yes\" or \"no\")");
                reply = keyboard.next();
                if ( reply.equalsIgnoreCase("no"))
                {
                    System.out.println("\nWell, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                                        "I'm tired of making nested if statements.");
                }
                else
                {
                    System.out.println("\nKindly drop some coins into that box for the children's home at Varlene");
                }
            }
            if (reply.equalsIgnoreCase("bathroom"))
            {
                System.out.println("\nInside the bathroom you see a jacuzzi and a baththub, would you like to "
                        + "use the jacuzzi? (\"yes\" or \"no\")");
                reply = keyboard.next();
                if ( reply.equalsIgnoreCase("no"))
                {
                    System.out.println("\nMy Goodness! Who on earth wouldn't like a jacuzzi?" + " ");
                }
                else
                {
                    System.out.println("\nDid you know jacuzzis give one more mental relaxation than any other device?"
                            +"\nPlease do enjoy your Bath.");
                }
            }
        }
        
    }
    
}
