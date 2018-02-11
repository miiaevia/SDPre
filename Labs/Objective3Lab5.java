import java.util.Scanner;

public class Objective3Lab5 {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double num1, num2, sum;

    System.out.print("Please enter a number: ");
    num1 = keyboard.nextDouble();

    System.out.print("Please enter another number: ");
    num2 = keyboard.nextDouble();

    sum = num1 + num2;
    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
  }
}
