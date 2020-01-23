package JavaExercises.Lesson1;

public class AreaCalculator {

  public static double area(double radius) {
    if (radius < 0) {
      System.out.println("Invalid Value, Error: " + radius);
      return -1;
    } else {

      double areaOfCircle = Math.PI * radius * radius;
      System.out.println("Area of Circle: " + areaOfCircle);
      return areaOfCircle;
    }
  }

    public static double area(double x, double  y) {
      if (x < 0 || y < 0) {
        System.out.println("Invalid Value, param: x: " + x);
        System.out.println("Invalid Value, Param: y: " + y);
        return -1;
      }

      else {

        double areaOfRectangle = x * y;
        System.out.println("Area of Circle: " + areaOfRectangle);
        return areaOfRectangle;
      }

  }
}
