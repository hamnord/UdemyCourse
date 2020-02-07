package JavaExercises.Lesson2;

import org.w3c.dom.ls.LSOutput;

public class SharedDigit {
  public static boolean hasSharedDigit(int first, int second) {

    if (first < 10 || first > 99 || second < 10 || second > 99) {
      System.out.println("out of range");
      return false;
    }

    int firstLastNum = first % 10;

    while (second > 0) {

      int firstNum = first % 10;
      first /= 10;
      int secLastNum = second % 10;
      second /= 10;

      if (firstLastNum == secLastNum || firstNum == secLastNum ) {
        System.out.println("True");
        return true;

      }
    }

    System.out.println("False");
    return false;
  }
}
