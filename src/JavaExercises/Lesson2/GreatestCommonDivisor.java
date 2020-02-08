package JavaExercises.Lesson2;

public class GreatestCommonDivisor {
  public static int getGreatestCommonDivisor (int i, int j){
    if ( i < 10 || j < 10){
      System.out.println("Invalid Value");
      return -1;
    }
    int common = 0;

    for (int y = 1; y <= i && y <= j ; y++){
      if ( i % y == 0 && j % y == 0){
        common = y;
      }
    }
    System.out.println("CommonDivisor: " + common);
    return common;
  }
}
