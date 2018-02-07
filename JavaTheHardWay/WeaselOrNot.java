import java.util.Scanner; 

public class WeaselOrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		String word; 
		boolean yep, nope; 

		System.out.println( "Type the word \"weasel\", please." ); 
		word = keyboard.next();

		yep = "weasel".equals( word ); 
		nope = !word.equals( "weasel" ); 

		System.out.println( "You typed what was requested: " + yep ); 
		System.out.println( "You ignored polite instructions: " + nope ); 
	}
}
// The .equals method appears to work regardless of whether the variable or the string is 
// at the beginning of the method, as long as both are present to compare.