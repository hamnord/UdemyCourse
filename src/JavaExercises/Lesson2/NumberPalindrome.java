package JavaExercises.Lesson2;

public class NumberPalindrome {

  public static boolean isPalindrome(int number) {
    int reverseDigit = 0;
    int palindrome = number;

    while (palindrome != 0) {
      int lastDigit = palindrome % 10;
      reverseDigit *= 10;
      reverseDigit += lastDigit;
      palindrome /= 10;
    }
    System.out.println("Reverse "+ reverseDigit);
    System.out.println("Num " + number);

    if (reverseDigit == number){
    System.out.println("Its a Palindrome: " + number);
    return true;

    }else {
      System.out.println("Its Not a PalinDrome: " + number);
      return false; }
  }
}





