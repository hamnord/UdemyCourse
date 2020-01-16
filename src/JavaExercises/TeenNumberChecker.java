package JavaExercises;

public class TeenNumberChecker {

  public static boolean hasTeen (int age1, int age2, int age3) {

    int teen = 13;
    int teen2 = 19;

    boolean teenCheck = (
            age1 <= teen2 && age1 >= teen ||
            age2 <= teen2 && age2 >= teen ||
            age3 <= teen2 && age3 >= teen) ? true : false;

    if (teenCheck) {
      System.out.println("True, In Range");
      return true;
    }
    else
      System.out.println("False, Out of Range");
    return false;
  }

  public static boolean isTeen (int age) {

    int teen = 13;
    int teen2 = 19;

    boolean teenCheck = (age <= teen2 && age >= teen) ? true : false;

    if (teenCheck) {
      System.out.println("True, In Range");
      return true;
    }

    else
    System.out.println("False, Out of Range");
    return false;
}
}
