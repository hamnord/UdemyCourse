package JavaExercises.Lesson2;

public class FlourPackProblem {

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      System.out.println("Lol no");
      return false;
    }
    bigCount *= 5;
    int sum = bigCount + smallCount;

    if (sum >= goal) {
      goal %= 5;
      if (goal == 0) {
        System.out.println("Goal achieved!" + sum);
        return true;
      }
    }

    if (bigCount + smallCount < goal){
      System.out.println("FAIL! Goal not achieved..nub");
    return false;
    }

    return smallCount >= goal;
  }
}
