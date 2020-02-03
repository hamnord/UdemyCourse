package JavaExercises.Lesson2;

public class EvenDigitSum {
  public static int getEvenDigitSum (int number){
    int sum = 0;

    while(number > 0){
      int last = number % 10;
      if(last % 2 == 0) {
        int even = last;
        sum += even;
      }
      number /= 10;

      System.out.println("even: " + number);
      }

    if (number < 0){
      System.out.println("Not a valid Number...");
      return -1;}

    System.out.println("Even Numbers Summed: " + sum);
    return sum;
  }
}