package JavaExercises.Lesson2;

public class DayOfTheWeek {

  /*
  public static void printDayOfTheWeek(int days){

    switch (days){
      case 1:
        System.out.println("Monday");
        break;
        case 2:
          System.out.println("Tuesday");
          break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 0:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid Value");
        break;
    }
  }*/

  public static void printDayOfTheWeek(int days){
    if (days <= 0 || days > 7){
      System.out.println("Invalid Value");
    }
    else {
      if (days == 1){ System.out.println("Monday"); }
      else if (days == 2) { System.out.println("Tuesday"); }
      else if (days == 3) { System.out.println("Wednesday"); }
      else if (days == 4) { System.out.println("Thursday"); }
      else if (days == 5) { System.out.println("Friday"); }
      else if (days == 6) { System.out.println("Saturday"); }
      else { System.out.println("Sunday"); }

    }
  }
}
