package JavaExercises;

public class SecondsAndMinutes {

  public static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid Value";

    } else {
      long hours = minutes / 60;
      long leftOverMinutes = minutes % 60;

      return hours + "h " + leftOverMinutes + "m " + seconds + "s";
    }
  }

  public static String getDurationString(long seconds) {
    if (seconds < 0) {
      return "Invalid Value";

    } else {
      long minutes = seconds / 60;
      long leftOverSeconds = seconds % 60;

      return getDurationString(minutes, leftOverSeconds);

    }
  }

}
