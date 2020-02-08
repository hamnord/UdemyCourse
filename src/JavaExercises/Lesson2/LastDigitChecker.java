package JavaExercises.Lesson2;

public class LastDigitChecker {
  public static boolean hasSameLastDigit(int i, int j, int y) {
    if (i < 10 || i > 1000 || j < 10 || j > 1000 || y < 10 || y > 1000) {
      System.out.println("Out of Range");
      return false;
    }

    int lastI = i % 10;
    int lastJ = j % 10;
    int lastY = y % 10;

   if (lastI == lastJ || lastI == lastY || lastJ == lastY) {
      System.out.println("True");
      return true;
    }
    else
     System.out.println("False");
      return false;
  }

  public static boolean isValid (int i){
    if ( i < 10 || i > 1000){
      System.out.println("Out of Range");
      return false;
    }
    else {
      System.out.println("True");
      return true;
    }
  }
  }


