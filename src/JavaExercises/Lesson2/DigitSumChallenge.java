package JavaExercises.Lesson2;

public class DigitSumChallenge {
  public static int sumDigits (int n){
    int sum = 0;

    if ( n < 10) {
      System.out.println("Invalid Value");
      return -1;
    }

    while (n > 0){
      int num = n % 10;
      sum += num;
      n /= 10;
    }
    System.out.println("Sum: " + sum);
  return sum;
  }
}
