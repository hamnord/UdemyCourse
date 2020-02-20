package JavaExercises.Lesson2;

import java.util.Scanner;

public class ReadingUserInput {

  public static void sumUserInput () {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int sum = 0;

    while (count < 10) {
      int turn = count + 1;

      System.out.print("Enter number #" + turn + ": ");
      boolean hasInt = scanner.hasNextInt();

      if (hasInt) {
        int number = scanner.nextInt();
        sum += number;
        count++;
      }
      else {
        System.out.println(" Invalid Value ");
      }

      scanner.nextLine();

    }
    System.out.println("Sum of input: " + sum );
    scanner.close();
  }
}
