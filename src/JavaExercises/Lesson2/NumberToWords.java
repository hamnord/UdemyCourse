package JavaExercises.Lesson2;

public class NumberToWords {

  public static int getDigitCount (int number){
    if (number < 0){
    return -1;
    }
    if (number == 0){
      return 1;
    }
    int count = 0;
    while (number != 0){
      count += 1;
      number /= 10;
      }
        return count;
  }

  public static int reverse (int number){
    int reversed = 0;

      while (number != 0){
        reversed *= 10;
        reversed += number % 10;
        number /= 10;
      }

    return reversed;
  }

  public static void numberToWords ( int number){
    if (number < 0 ) {
      System.out.println("Invalid Value");
    }

    int reversed = reverse(number);
    int getCount = getDigitCount(number);

    for (int i = 1; i <= getCount; i++){

      int lastNum = reversed % 10;
      reversed /= 10;

      if (lastNum == 0){ System.out.println("Zero");}
      else if (lastNum == 1){ System.out.println("One");}
      else if (lastNum == 2){ System.out.println("Two");}
      else if (lastNum == 3){ System.out.println("Three");}
      else if (lastNum == 4){ System.out.println("Four");}
      else if (lastNum == 5){ System.out.println("Five");}
      else if (lastNum == 6){ System.out.println("Six");}
      else if (lastNum == 7){ System.out.println("Seven");}
      else if (lastNum == 8){ System.out.println("Eight");}
      else if (lastNum == 9){ System.out.println("Nine");}
      else { System.out.println("Other");}
    }
  }
}
