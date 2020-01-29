package JavaExercises.Lesson2;

public class EvenNumber {

  public static boolean isEvenNumber (int number){
    return number % 2 == 0;
  }

  public static void printEven(int number, int end){

    while (number <= end){
      number++;
      if(!isEvenNumber(number)) {
        continue;
      }
      System.out.println("Even: " + number);
    }
  }

  public static void sumEven (int number, int end){
    int sum = 0;
    int count = 0;

    if ( number <= end ) {
      for (int i = number; i <= end; i++){

        if (isEvenNumber(i)){
          sum += i ;
          System.out.println(" Even Numbers: " + i);
          count++;

          if(count == 5){
            System.out.println("Count reached five." + sum);
            break;
          }
        }
      }
    }
  }

  public static void sumEvenWhile(int number, int end){
    int sum = 0;
    int count = 0;

    while (number <= end){
      number++;
      if (isEvenNumber(number)) {
        System.out.println("Even number: " + number);
        sum += number;
        count++;

        if (count == 5) {
          break;
        }
      }
    }
    System.out.println("Even Numbers Found: " + count);
    System.out.println("Even Numbers Summed: " + sum);
  }

}
