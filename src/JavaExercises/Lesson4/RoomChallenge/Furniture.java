package JavaExercises.Lesson4.RoomChallenge;

import java.awt.desktop.PreferencesEvent;

public class Furniture {

  private String sofa;
  private String tv;
  private String table;
  public boolean isOn = false;

  public Furniture (String sofa, String tv, String table){
    this.sofa = sofa;
    this.table = table;
    this.tv = tv;
  }

  public void isTvOn (){
    if (!isOn){
      tv = "tv is off";
    } else {
      tv = "tv is on";
    }
    System.out.println(tv);
  }

  public String getTv() {
    return tv;
  }

  public String getSofa() {
    return sofa;
  }

  public String getTable() {
    return table;
  }
}
