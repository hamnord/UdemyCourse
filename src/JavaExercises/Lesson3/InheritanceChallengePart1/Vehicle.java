package JavaExercises.Lesson3.InheritanceChallengePart1;

public class Vehicle {

  private String steering;
  private int gear;
  private int speed;

  public Vehicle (String steering, int gear, int speed){
    this.steering = steering;
    this.gear = gear;
    this.speed = speed;
  }

  public String getSteering() {
    return steering;
  }

  public void setSteering(String steering) {
    this.steering = steering;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
