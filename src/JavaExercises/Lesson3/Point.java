package JavaExercises.Lesson3;

public class Point {

  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;

  }

  public Point() {
    this(0, 0);
  }

  public double distance(int y, int x) {
    double xY = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
    return Math.sqrt(xY);
  }

  public double distance() {
    return distance(0,0);
  }

  public double distance(Point secondPoint) {
    return distance(secondPoint.y, secondPoint.x);
  }


  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

}
