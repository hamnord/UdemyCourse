package JavaExercises;


public class BarkingDogExercise {

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

    if (hourOfDay < 0 || hourOfDay > 23) {
      System.out.println("invalid Range");
      return false;

    } else if (hourOfDay >= 8 && hourOfDay <= 22) {
      System.out.println("false");
      return false;

    } else if (hourOfDay >= 1 || hourOfDay <= 7 || hourOfDay >= 23) {
      if (barking == true) {
        System.out.println("The Dog barks");
        return true;
      }
      System.out.println("not Barking");
      return false;
    }
    return false;
  }
  }
