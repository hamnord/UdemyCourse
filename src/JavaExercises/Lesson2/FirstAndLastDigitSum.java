package JavaExercises.Lesson2;

public class FirstAndLastDigitSum {

  public static int sumFirstAndLastDigit (int number){
    int sum = 0;
    int n = number;
    int lastNum = n % 10;

    while (n > 0) {
    int firstNum = n;
      n /= 10;
      sum = firstNum + lastNum;

    }
    if (number < 0){
      System.out.println("Invalid Value");
      return -1;}

    else {
      System.out.println("Original number: " + number);
      System.out.println("last and first number summed: " + sum);
      return sum;
    }
  }

}
