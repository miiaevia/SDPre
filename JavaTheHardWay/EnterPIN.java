import java.util.Scanner; 

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		int pin, entry2; 
		String password, entry1; 

		password = "String";
		pin = 12345; 

		System.out.println( "WELCOME TO THE BANK OF JAVA." ); 
		System.out.print( "ENTER YOUR PASSWORD: " ); 
		entry1 = keyboard.next(); 

		while ( !entry1.equals( "String" ) ) {
			System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN." ); 
			System.out.print( "\nENTER YOUR PASSWORD: " ); 
			entry1 = keyboard.next();
		}

		System.out.print( "PASSWORD ACCEPTED. " );
		System.out.print( "ENTER YOUR PIN: " ); 
		entry2 = keyboard.nextInt(); 

		while ( entry2 != pin) {
			System.out.println( "\nINCORRECT PIN. TRY AGAIN." ); 
			System.out.print( "ENTER YOUR PIN: " ); 
			entry2 = keyboard.nextInt(); 
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17" ); 
	}
}