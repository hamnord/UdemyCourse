package JavaExercises;

public class EqualSumChecker {

  public static boolean hasEqualSum(int nr1, int nr2, int nr3) {

    boolean sum = (nr1 + nr2 == nr3) ? true : false;

    if(sum) {
      System.out.println("TRUE, Sum are Equal");
      return true;

  } else
    System.out.println(" FALSE, not Equal");
  return false;}

}
