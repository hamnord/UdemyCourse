package JavaExercises;

public class BasicExercises2 {

  public static void main (String [] args) {

    // Char exercise
    char myChar = 'D';
    char myUniCode = '\u0044';
    char myCopyRightChar ='\u00A9';
    System.out.println(myChar);
    System.out.println(myUniCode);
    System.out.println(myCopyRightChar);

    // Boolean Exercise
    boolean myTrueBooleanValue = true;
    boolean myFalseBooleanValue = false;
    boolean isCustomerOverTwentyOne = true;

    // String exercise
    String myString = "this is a string";
    System.out.println("myString is equal to " + myString);
    myString = myString + ", and this is more";
    System.out.println(" mystring is equal to " + myString);
    myString = myString + " \u00A9 2019 " ;
    System.out.println(" mystring is equal to " + myString);
    String numberString = "250.55 ";
    numberString = numberString + "49.95" ;
    System.out.println(numberString);
    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("LastString is equal to " + lastString);
    double doubleNumber = 120.47d;
    lastString = lastString + doubleNumber;
    System.out.println("LastString is equal to " + lastString);

    // operand and operator expressions

    int result = 1 + 2;
    System.out.println("1 + 2 = " + result);
    int previousResult = result;
    System.out.println("previousResult " + previousResult);
    result = result - 1; // 3 -1 = 2;
    System.out.println("3 - 1 = " + result);
    System.out.println("previousResult " + previousResult);

    result = result * 10; // 2 * 10 = 20
    System.out.println(" 2 * 10 = " + result);

    result = result / 5; // 20/5 = 4
    System.out.println(" 20 / 5 = " + result);

    result = result % 3; // the remainder of (4 % 3) = 1
    System.out.println(" 4 % 3 = " + result);

    // result = result + 1;
    result++; // 1 + 1 = 2
    System.out.println( " 1 + 1 = " + result);

    result--;
    System.out.println("2-1 = " + result);

    // result = result + 2;
    result += 2;
    System.out.println(" 1 + 2 = " + result);

    result *= 10; // 3* 10 = 30
    System.out.println("3*10 = " + result);

    result /= 3; // 30 / 3 = 10
    System.out.println("30/3 = " + result);

    result -= 2;
    System.out.println("10 - 2 = " + result);


  }
}
