package JavaExercises;

import javax.swing.*;

public class BarkingDogExercise {

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (barking == hourOfDay < 8 || hourOfDay <= 22) {
      System.out.println("The Dog barks");
      return true;
    } else if (hourOfDay > 23)
      System.out.println("Invalid Range");
      return false;
  }
}



