import java.util.Scanner; 

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, team; 
		int age; 
		double weight, income; 

		Scanner keyboard = new Scanner( System.in ); 

		System.out.print( "Hello. What is your name? " ); 
		name = keyboard.next(); 

		System.out.print ( "Hi, " + name + "! How old are you? " ); 
		age = keyboard.nextInt(); 

		System.out.println( "So you're " + age+ ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " ); 
		weight = keyboard.nextDouble(); 

		System.out.println ( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name +  "? " );
		income = keyboard.nextDouble();

		System.out.print ( "Hopefully that is " + income + " per hour" ); 
		System.out.println( " and not per year!" ); 
		System.out.print( "What is your favorite football team? " ); 
		team = keyboard.next();

		System.out.print( "The " + team + "??? ");
		System.out.println( "I'm sorry!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		/* Program does not blow up if I type an integer when it's 
		expecting a double. Just converts it to a floating point #.*/
		/* Program does not blow up if I type any numbers into a string
		variable, just converts it to a string. */
		/* String variable blows up if I type "I can has?" as my input.
		Says it is an "input mismatch exception." The program appears to
		not like the spaces. That seems weird since I can write a 
		string with spaces in the program, not sure why the input string method
		doesn't like it. Typing "I can has?" will make the other quiestions
		blow up as well, as it's not a number, integer or floating. */
	}
}