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
    if ( (topScore > secondTopScore) && (topScore < 100) ) {
      System.out.println( " Greater than second top score and less than 100");
    }

    if ((topScore > 90) || (secondTopScore <= 90)) {
      System.out.println("either or both of the conditions are true");
    }

    int newValue = 50;
    if (newValue == 50) {
      System.out.println("This is true");
    }

    boolean isCar = false;
    if (isCar) {
      System.out.println("this is not supposed to happen");
    }

    isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }

    // operator Challenge

    double varOne = 20.00d;
    double varTwo = 80.00d;
    double sumVar = (varOne + varTwo) * 100.00d;
    System.out.println(" sumVar = " + sumVar);
    double remaindVar = sumVar % 40.00d;
    System.out.println("remainderVar = " + remaindVar);
    boolean sumCorrect = (remaindVar == 0) ? true : false;
    System.out.println("is no remainder = " + sumCorrect);
    if (!sumCorrect) {
      System.out.println(" got som remainder");
    }
  }
}
