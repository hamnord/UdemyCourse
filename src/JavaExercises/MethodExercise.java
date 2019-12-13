package JavaExercises;

public class MethodExercise {
  public static void main(String[] args) {


    caculateScore(true, 800, 5, 100);
    caculateScore(true, 10000, 8, 200);
    negativeScore(true, 0);
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

  public static int negativeScore(boolean remove, int negativeFinal) {

    if (remove) {
      negativeFinal -= caculateScore(true,800,5,100);

      System.out.println("negative score: " + negativeFinal);
      System.out.println("just for fun ¯\\_(ツ)_/¯ ");
    }

    return -1;

  }

}
