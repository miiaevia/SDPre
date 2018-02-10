public class Objective6Lab3 {
  public static void main(String[] args) {
    int count = 0, a;

    while ( count <= 19 ) {
      count++;
      a = count % 2;
      if ( a == 0 ) {
        System.out.println( count + " is even.");
      }
      else {
        System.out.println( count + " is odd.");
      }
    }
  }
}
