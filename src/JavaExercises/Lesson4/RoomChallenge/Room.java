package JavaExercises.Lesson4.RoomChallenge;

public class Room {

  private Walls walls;
  private Furniture furniture;

  public Room (Walls walls, Furniture furniture){
    this.walls = walls;
    this.furniture = furniture;
  }

  public void isTheDoorOpen(){
   walls.doorIsOpen();
  }


  public Walls getWalls() {
    return walls;
  }

  public Furniture getFurniture() {
    return furniture;
  }
}
