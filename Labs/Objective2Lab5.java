import java.util.Scanner;

public class Objective2Lab5 {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double side1, side2, hypotenuse;

    System.out.println("How long is the first side of the triangle?");
    side1 = keyboard.nextDouble();

    System.out.println("How long is the second side of the triangle?");
    side2 = keyboard.nextDouble();

    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
    System.out.print("The hypotenuse of a triangle with sides " + side1);
    System.out.println(" and " + side2 + " is " + hypotenuse);
  }
}
