package JavaExercises.Lesson1;

public class MegabyteConverter {

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int convertedToMB = Math.round(kiloBytes / 1024);
      int remaingKB = Math.round(kiloBytes % 1024);
      System.out.println(kiloBytes + " KB = " + convertedToMB + " MB and " + remaingKB+ " KB");
    }
  }
}