package JavaExercises;

public class LeapYearCalculator {

  public static boolean isLeapYear(int year) {

    int leapYear = 0;

    if (year < 1 || year > 9999) {
      System.out.println("Out of Scope");
      return false;
    }

    else if (year >= 1 && year <= 9999) {
      if ( year % 400 == leapYear || year % 4 == leapYear && year % 100 != leapYear) {
      System.out.println(" The year is a leap year (it has 366 days). ");
      return true; }

      else {
        System.out.println(" The year is NOT a leap year (it has 365 days). ");
        return false;
      }

    }
    return false;
  }

}
