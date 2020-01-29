package JavaExercises.Lesson2;

public class SumOdd {

  public static boolean isOdd(int number) {
    //  System.out.println( number);
    if (number < 0 ) {
      return false;
    }
    else return number % 2 != 0;
  }

  public static int sumOdd ( int start, int end){
    int sum = 0;

    if (start < 0 || end < 0) {
      System.out.println("needs to be greater than 0...");
      return -1;}

    else if ( end >= start ){
      for (int i = start; i <= end; i++){
        if(isOdd(i)){
         sum += i;
        }
       }
      System.out.println("sum = " + sum);
      return sum;
      }
    System.out.println("Invalid Value.");
    return -1;
  }

}
