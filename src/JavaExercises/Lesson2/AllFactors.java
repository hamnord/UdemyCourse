package JavaExercises.Lesson2;

public class AllFactors {

  public static void printFactors (int number){
    if (number < 1 ){
      System.out.println("Invalid Value");
    }

    int factor;

    for (int i = 1; i <= number; i++){
      if ( number % i == 0){
        factor = i;
        System.out.println("Factor: " + factor + " by " + number) ;
      }
    }
  }
}
