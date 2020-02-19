package JavaExercises.Lesson2;

public class LargestPrime {

  public static int getLargestPrime (int number){
    if (number < 2){
      System.out.println("Invalid Value");
      return -1;
    }
    int factor;
    for (factor = 2; factor <= number; factor++){
      if (number % factor == 0){
        number /= factor;
        factor--;
      }
    }
    System.out.println("largest prime factor: " + factor);
    return factor;
  }
}
