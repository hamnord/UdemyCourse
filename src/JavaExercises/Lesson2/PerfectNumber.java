package JavaExercises.Lesson2;

public class PerfectNumber {
  public static boolean isPerfectNumber (int number){
    if (number < 1 ){
      System.out.println("Invalid Value");
      return false;
    }

    int factor;
    int sumFactor = 0 ;

    for (int i = 1; i <= number; i++){
      if ( number % i == 0){
        factor = i;
        System.out.println("Factor: " + factor ) ;

        sumFactor += i;

        if (sumFactor == number){
          System.out.println("Perfect Number: " + sumFactor);
          return true;
        }
      }
    }
    System.out.println("Not Perfect: " + number);
    return false;
  }
}
