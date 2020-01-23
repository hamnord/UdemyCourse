package JavaExercises.Lesson2;

public class NumberOfDaysInMonth {
  public static boolean isLeapYear(int year){
   if (year < 1 || year > 9999) {
     System.out.println("Out of Bounce");
     return false;
   }else {
     int leap = 0;
     if(year % 400 == leap || year % 4 == leap && year % 100 != leap){
       System.out.println(year + " Is a leapYear");
       return true;
     }

   }
    System.out.println(year + " Not a leapYear");
   return false;
  }

  public static int getDaysInMonth (int month, int year){
    if (month < 0 || month > 12 || year < 1 || year > 9999){
      System.out.println(" Out of Bounce BRuh");
      return -1;
    } else {
      if (month == 2 && isLeapYear(year)){ System.out.println("February while leap year has: 29Days"); return 29; }
      else if (month == 2){ System.out.println(" Feburary has: 28Days "); return 28; }
      else if (month == 1){ System.out.println("Januari has: 31Days"); return 31; }
      else if (month == 3){ System.out.println("March has: 31Days"); return 31; }
      else if (month == 4){ System.out.println("April has : 30Days"); return 30; }
      else if (month == 5){ System.out.println("May has: 31Days"); return 31; }
      else if (month == 6){ System.out.println("June has: 30Days"); return 30; }
      else if (month == 7){ System.out.println("July has: 31Days"); return 31; }
      else if (month == 8){ System.out.println("August has: 31Days"); return 31; }
      else if (month == 9){ System.out.println("September has: 30Days"); return 30; }
      else if (month == 10){ System.out.println("October has: 31Days"); return 31; }
      else if (month == 11){ System.out.println("November has: 30Days"); return 30;}
      else if (month == 12){ System.out.println("December has: 31Days"); return 31; }

      System.out.println("Bruh choose a month");
      return -1;
    }
  }


}
