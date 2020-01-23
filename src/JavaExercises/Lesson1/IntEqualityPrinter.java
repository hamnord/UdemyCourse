package JavaExercises.Lesson1;

public class IntEqualityPrinter {

  public static void printEqual (int y, int x, int i ) {
    if (x < 0 || y < 0 || i < 0 ) {
      System.out.println("Invalid Value");

    } else if (x == y && y == i && i == x){
      System.out.println("All numbers are equal");

    } else if (x == y || y == i || i == x) {
      System.out.println("Neither all are equal or different");

    } else {
      System.out.println("All numbers are different");
    }
  }
}
