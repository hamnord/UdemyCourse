package JavaExercises.Lesson2;

import java.util.Scanner;

public class MinMaxInput {

  public static void getMinMaxValue() {
    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    boolean firstInput = true;

    while (true){

      System.out.print("Enter Number: ");
      boolean hasNumber = scanner.hasNextInt();

      if (hasNumber) {
        int number = scanner.nextInt();

        if (firstInput){
          firstInput = false;
          min = number;
          max = number;
        }

          if (max < number) {
            max = number;
          }
        if (min > number) {
          min = number;
        }
        }

      else {
        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
        break;
      }
        scanner.nextLine();
    }
    scanner.close();
  }
}
