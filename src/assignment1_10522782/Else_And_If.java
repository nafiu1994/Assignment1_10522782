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
public class Else_And_If {
    public static void main(String args[]){
      /* 
        --------------------------------------------------------------------------------------------- 
                                     ANSWERS TO QUESTIONS                                            '
                                                                                                     '
        1. When the boolean expression in the if statement evaluates true, the                       '
           body of the if statement is executed. On false evaluation, next statement                 '
           is executed, which is the else if statement. When the else if statement also              '
           evaluates false, the else statement will then be executed. Only one of the                '
           multi-if statement are executed.                                                          ' 
                                                                                                     '
        2. More than one of the three statements may be executed.                                    '
           This is because only the second and third statements form a branch of if-else statements. '
                                                                                                     '
        _____________________________________________________________________________________________
       */  
                int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		/*else*/ if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
    }
    
}
