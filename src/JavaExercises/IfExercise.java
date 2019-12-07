package JavaExercises;

public class IfExercise {
  public static void main (String [] args) {

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println(" it is not an alien!");
      System.out.println(" And I am scared of aliens");
    }

    int topScore = 80;
    if(topScore < 100) {
      System.out.println(" you got the highScore!");
    }

    int secondTopScore = 81;
    if (topScore > secondTopScore && topScore < 100) {
      System.out.println( " Greater than second top score and less than 100");
    }

  }
}
