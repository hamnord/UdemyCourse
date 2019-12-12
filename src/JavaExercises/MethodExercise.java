package JavaExercises;

public class MethodExercise {
  public static void main(String[] args) {


    caculateScore(true, 800, 5, 100);
    caculateScore(true, 10000, 8, 200);
  }


  public static int caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      System.out.println("finalScore: " + finalScore);

      return finalScore;
    }

    return -1;
  }

}
