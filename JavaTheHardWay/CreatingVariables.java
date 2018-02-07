public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, year; 
		double seconds, e, checking, weight; 
		String firstName, lastName, title, petName, nationality; 

		x = 10; 
		y = 400; 
		age = 39;
		year = 2017; 

		seconds = 4.71; 
		e = 2.71828182845904523536; 
		checking = 1.89; 
		weight = 15.508; 

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr."; 
		petName = "DiNozzo";
		nationality = "Dutch"; 

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." ); 
		System.out.println( "My age is " + age );
		System.out.println( "There are only a few weeks left in " + year ); 
		System.out.println( "The experiment took " + seconds + " seconds." ); 
		System.out.println( "A favorite irrational # is Euler's number: " + e ); 
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My cat's weight is " + weight + " lbs and his name is " + petName );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "I am " + nationality );  
	}
}