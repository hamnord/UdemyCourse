package JavaExercises.Lesson3.InheritanceChallengePart1;

public class Car extends Vehicle {

  private String color;
  private String model;

  public Car(){
    super("",0,0);
  }

  public Car (String color, String model){
    super("",0,0);
    this.color = color;
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
