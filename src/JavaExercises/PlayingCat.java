package JavaExercises;

public class PlayingCat {

  public static boolean isCatPlaying (boolean summer, int temperature){
    if (summer && temperature >= 25 && temperature <= 45 || !summer && temperature >= 25 && temperature <= 35) {
      System.out.println("True: Cat is playing");
      return true;
    }
    System.out.println("False: Cat sleeping");
    return false;
  }

}
