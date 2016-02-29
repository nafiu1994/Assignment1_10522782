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
public class Compare_To_Challenge {
    public static void main(String args[]){
        //Negative
        System.out.println("Comparing \"baaf\" with \"bansir\" gives " + "baaf".compareTo("bansir"));
        System.out.println("Comparing \"barbara\" with \"matilda\" gives " + "barbara".compareTo("matilda"));
        System.out.println("Comparing \"carbon\" with \"charcoal\" gives " + "carbon".compareTo("charcoal"));
        System.out.println("Comparing \"parrot\" with \"Bansir\" gives " + "parrot".compareTo("squirrel"));
        System.out.println("Comparing \"shoe\" with \"shoemaker\" gives " + "shoe".compareTo("shoemaker"));
        System.out.println();
        
        //Positive
        System.out.println("Comparing \"anang\" with \"ababio\" gives " + "anang".compareTo("ababio"));
        System.out.println("Comparing \"macintosh\" with \"laptop\" gives " + "macintosh".compareTo("laptop"));
        System.out.println("Comparing \"pencil\" with \"pen\" gives " + "pencil".compareTo("pen"));
        System.out.println("Comparing \"eraser\" with \"blade\" gives " + "eraser".compareTo("blade"));
        System.out.println("Comparing \"violin\" with \"guitar\" gives " + "violinf".compareTo("guitar"));
        System.out.println();
        
        //Zero
        System.out.println("Comparing \"CRIME\" with \"CRIME\" gives " + "CRIME".compareTo("CRIME"));
        System.out.println("Comparing \"alexis\" with \"alexis\" gives " + "alexis".compareTo("alexis"));
    }
    
}
