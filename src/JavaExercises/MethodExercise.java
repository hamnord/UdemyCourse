package JavaExercises;

public class MethodExercise {
  public static void main(String[] args) {

  /*  boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    caculateScore(true, 800, 5, 100);
    caculateScore(true, 10000, 8, 200);
    negativeScore(true, 0);

    int highScore = caculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("final Score was: " + highScore);

    */

    // my calling methods
    calculateHighScorePosition(1500);
    calculateHighScorePosition(900);
    calculateHighScorePosition(400);
    calculateHighScorePosition(50);

    // tims calling methods
    int highScorePos = calcHighScore(1500);
    displayHighScore("tim", highScorePos);
    highScorePos = calcHighScore(900);
    displayHighScore("timmy", highScorePos);
    highScorePos = calcHighScore(400);
    displayHighScore("tims", highScorePos);
    highScorePos = calcHighScore(50);
    displayHighScore("tommy", highScorePos);

  }

  // method challenge - my solution

  static void displayHighScorePosition(String playersName, String positionTable) {
    System.out.println(" Player: " + playersName + " Finished in: " + positionTable);

  }

  public static int calculateHighScorePosition(int playerScore) {

    if (playerScore >= 1000) {
      displayHighScorePosition("Baba","1st Place!");
      System.out.println("Congratulations! you're the Winner! \n"); }

    else if (playerScore >= 500) {
      displayHighScorePosition("Bibi","2nd Place!");
      System.out.println(" Too bad! It was so Close! \n "); }

    else if (playerScore >= 100) {
      displayHighScorePosition("Dodo","3rd Place!");
      System.out.println(" Well you didn't lose \n "); }

    else {
      displayHighScorePosition("Bobo","Last Place!");
      System.out.println(" You lost! "); }

    return -1;
  }

  // method challenge - tims solution

  public static void displayHighScore (String playerName, int highScorePos) {
    System.out.println(playerName + " managed to get into position " + highScorePos + " on the high score table");
  }

  public static int calcHighScore (int playerScore ) {
   /* if (playerScore >= 1000) { return 1; }
    else if (playerScore >= 500) { return 2; }
    else if (playerScore >= 100) { return 3; }
    else { return 4; }
    */
   int position = 4;
   if (playerScore >= 1000) {
     position = 1; }
   else if (playerScore >= 500) {
     position = 2; }
   else if (playerScore >= 100) {
     position = 3;
   }
    return position;
  }

/*
  public static int caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("finalScore: " + finalScore);

      return finalScore;
    }

    return -1;
  }

  public static int negativeScore(boolean remove, int negativeFinal) {

    if (remove) {
      negativeFinal -= caculateScore(true,800,5,100);

      System.out.println("negative score: " + negativeFinal);
      System.out.println("just for fun ¯\\_(ツ)_/¯ ");
    }

    return -1;

  }*/

}
