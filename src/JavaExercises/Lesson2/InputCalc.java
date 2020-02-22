package JavaExercises.Lesson2;

import java.util.Scanner;

public class InputCalc {

 public static void inputThenPrintSumAndAverage (){
   Scanner scanner = new Scanner(System.in);

   int number = 0;
   int sum = 0;
   int count = 0;
   double average;

   while (true){

     System.out.print("Input: ");
     boolean hasInt = scanner.hasNextInt();

     if (hasInt) {
       number = scanner.nextInt();
       sum += number;
       count++;
     }

     else {
       average = (double) sum/count;
       System.out.println("SUM = " + sum + " AVG = " +  Math.round(average));
       break;
     }

     scanner.nextLine();
   }
   scanner.close();

 }
}
