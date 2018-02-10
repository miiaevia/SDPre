import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if (userNum == 0) {
        System.out.println("This number is neither positive nor negative.");
      }
      else if (userNum > 0) {
        System.out.println("This number is positive.");
      }
      else if (userNum < 0) {
        System.out.println("This number is negative.");
      }

      scanner.close();
  }
}
