import java.util.Scanner; 

public class CoinFlipWhileLoop {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		String coin, again; 
		int streak = 0; 
		double gotHeads; 

		gotHeads = Math.random(); 

		if ( gotHeads < 0.5 )
				coin = "HEADS"; 
			else
				coin = "TAILS"; 

			System.out.println( "You flip a coin and it is... " + coin ); 

		while ( coin.equals("HEADS") ) {
			streak++; 
			System.out.println( "\tThat's " + streak + " in a row...." ); 
			System.out.print( "\tWould you like to flip again (y/n)? " ); 
			again = keyboard.next(); 
		
			if ( again.equals("y") ){
				streak++; 
				System.out.println( "\tThat's " + streak + " in a row...." ); 
				System.out.print( "\tWould you like to flip again (y/n)? " ); 
				again = keyboard.next(); 
			}	
			if ( !again.equals("y") ) {
				System.out.println( "\tYou lose everything!" ); 
				System.out.println( "\tShould've quit while you were aHEAD...." ); 
				streak = 0; 
				again = "n";   
				coin = "TAILS"; 
			}
		}
		System.out.println( "Final score: " + streak );
	}
}