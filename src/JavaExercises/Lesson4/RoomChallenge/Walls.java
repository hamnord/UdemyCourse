package JavaExercises.Lesson4.RoomChallenge;

public class Walls {

  private String color;
  private String window;
  private int numberOfWindows;
  private String door;
  private int numberOfDoors;
  public boolean isopen = false;

  public Walls (String color, String window, int numberOfWindows, String door , int numberOfDoors){
    this.color = color;
    this.window = window;
    this.numberOfWindows = numberOfWindows;
    this.door = door;
    this.numberOfDoors = numberOfDoors;
  }

  public Walls (String color, int numberOfWindows, int numberOfDoors){
    this.color = color;
    this.numberOfWindows = numberOfWindows;
    this.numberOfDoors = numberOfDoors;
  }

  public void doorIsOpen(){
    if (!isopen){
      door = "The door is closed";
    }
    else {
      door = "The door is open";
    }
    System.out.println(door);
  }


  public void openDoor(){
    isopen = true;
    door = "the door has been open";
    System.out.println(door);
  }

  public void closeDoor(){
    isopen = false;
    door = "the door has been closed";
    System.out.println(door);
  }

  public String getColor() {
    return color;
  }

  private String getDoor() {
    return door;
  }

  public String getWindow() {
    return window;
  }

  public int getNumberOfWindows() {
    return numberOfWindows;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }
}
