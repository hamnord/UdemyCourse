package JavaExercises.Lesson2;

public class Sum3And5Challenge {
  public static void main(String[] args) {

    int count = 0;
    int sum = 0;

    for (int i = 1; i <= 1000; i++){

      if (i % 3 == 0 && i % 5 == 0 ) {
        count ++;
        sum += i;
        System.out.println("Divisible by 3 or 5: " + i);
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println("Sum = " + sum);
    System.out.println(" Conditions met. Shutting down.");
  }
}
