package JavaExercises.Lesson1;

public class IfExercise {
  public static void main(String[] args) {

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println(" it is not an alien!");
      System.out.println(" And I am scared of aliens");
    }

    int topScore = 80;
    if (topScore < 100) {
      System.out.println(" you got the highScore!");
    }

    int secondTopScore = 81;
    if ((topScore > secondTopScore) && (topScore < 100)) {
      System.out.println(" Greater than second top score and less than 100");
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

    // keyWords and Expressions
    double km = (100 * 1.609344);
    int hs = 50;

    if (hs == 50) {
      System.out.println("this is a expression");
    }

    boolean gameOver = true;
    int score = 3000;
    int levelCompleted = 5;
    int bonus = 100;

    if (score < 5000 && score > 1000) {
      System.out.println(" biggeer than 1000 and lesser than 5000");
    } else if
    (score < 1000) {
      System.out.println(" less 1000");
    } else {
      System.out.println(" else ");
    }

    // scope challenge

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("finalscore 1 : " + finalScore);

    }

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("finalScore 2 : " + finalScore);
    }

  }
}

