package JavaExercises;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces (double dec1, double dec2) {

    dec1 = (int) (dec1 * 1000);
    dec2 = (int) (dec2 * 1000);

    if (dec1 == dec2) {
      System.out.println("True, Decimals are equal");
      return true;
    }
    System.out.println("False, Decimals not equal");
  return false;}
}
