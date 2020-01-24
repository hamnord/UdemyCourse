package JavaExercises.Lesson2;

public class ForLoopExercise {

  public static void main(String[] args) {

    for (int i = 8; i > 1; i--){
      System.out.println("10.000 at " + i + "% interest: " + ForLoopExercise.calculateInterest(10000, i) );
    }

    System.out.println("\n");

    for (int i = 2; i < 9; i++){
      System.out.println("10.000 at " + i + "% interest: " + ForLoopExercise.calculateInterest(10000, i));
    }

    int count = 0;
    for(int i = 10; i<50; i++){
      if(isPrime(i)) {
        count++;
        System.out.println("Nr " + i + " is a PrimeNr");
        if(count == 3){
          System.out.println("Stopping.");
          break;
        }
      }
    }
  }

  public static double calculateInterest(double amount, double interestRate){
    return (amount * (interestRate/100));
  }

  public static boolean isPrime (int n){
    if (n == 1) {
      return false;
    }
    // for (int = i = 2; i <= n/2; i++)
    for (int i = 2; i <= Math.sqrt(n); i++){
      if (n % i == 0) {
        return false;
      }
    } return true;
  }
}
