package JavaExercises;

public class BarkingDogExercise {

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 8 || hourOfDay > 22) {
      return barking; }
  }

}


