import java.util.Scanner; 

public class BMICalculator {
	public static void main ( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, lb, bmi; 
		int ft, in;

		System.out.print( "Your height (feet only): " ); 
		ft = keyboard.nextInt(); 

		System.out.print( "Your height (inches only): " ); 
		in = keyboard.nextInt(); 

		m = ((ft * 12) + in) * 0.0254;  

		System.out.print( "Your weight in lb: " ); 
		lb = keyboard.nextDouble(); 

		kg = lb * (1/2.2);

		bmi = kg / (m*m); 

		System.out.println( "Your BMI is " + bmi );
	}
}