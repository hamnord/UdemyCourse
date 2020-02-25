package JavaExercises.Lesson3;

public class Wall {

  private double width;
  private double height;

  public Wall (){
    this(0,0);
  }

  public Wall (double width, double height){
    // solution with ternary
    this.width = (width < 0) ? 0 : width;
    this.height = (height < 0) ? 0 : height;

    /* - ordinary If/else statement

    if ( width < 0 ){
      this.width = 0;
    }
    else {
      this.width = width;
    }
    if (height < 0) {
      this.height = 0;
    }
    else {
      this.height = height;
    } */

  }

  public double getArea (){
    return width * height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = (width < 0 ) ? 0 : width;

    /*
    if ( width < 0 ){
      this.width = 0;
    }
    else {
      this.width = width;
    } */

  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = (height < 0 ) ? 0 : height;
    /*
    if (height < 0) {
      this.height = 0;
    }
    else {
      this.height = height;
    } */
  }
}
