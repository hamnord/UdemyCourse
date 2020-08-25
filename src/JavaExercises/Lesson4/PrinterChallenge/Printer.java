package JavaExercises.Lesson4.PrinterChallenge;

public class Printer {

  private int tonerBlackLevel;
  private int tonerRGBLevel;
  private int pages;
  private boolean duplex;

  public Printer(int tonerBlackLevel, int tonerRGBLevel, boolean duplex){

    if(tonerBlackLevel >= 0 && tonerBlackLevel <= 100){
      this.tonerBlackLevel = tonerBlackLevel;
    } else {
      System.out.println("Error toner level");
    }

    if(tonerRGBLevel >= 0 &&  tonerRGBLevel <= 100){
      this.tonerRGBLevel = tonerRGBLevel;
    } else {
      System.out.println("Error toner level");
    }

    this.pages = 0;
    this.duplex = duplex;
  }

  public int fillTonerBlack(int level){
    if (this.tonerBlackLevel + level > 100){
      System.out.println("Error! Trying to exceed maximum Black-toner amount" );
       return -1;
    }
    else {
      this.tonerBlackLevel += level;

      if (this.tonerBlackLevel == 100) {
        System.out.println("Black toner is full: " + this.tonerBlackLevel + "%");
        return this.tonerBlackLevel;
      }
    }

      System.out.println("Black toner level: " + this.tonerBlackLevel + "%");
    return this.tonerBlackLevel;
  }

  public int fillTonerRGB(int level){
    if (this.tonerRGBLevel + level > 100){
      System.out.println("Error! Trying to exceed maximum RGB-toner amount" );
      return -1;
    }
    else {
      this.tonerRGBLevel += level;

      if (this.tonerRGBLevel == 100) {
        System.out.println("RGB toner is full: " + this.tonerRGBLevel + "%");
        return this.tonerRGBLevel;
      }
    }

    System.out.println("RGB toner level: " + this.tonerRGBLevel + "%");
    return this.tonerRGBLevel;
  }

  public void printPages (int nrOfPages){
    int printedPages = nrOfPages;

    if(this.duplex){
      printedPages = (nrOfPages / 2) + (nrOfPages % 2);

      System.out.println("Duplex print activated, printing on both sides");
      this.pages += printedPages;
      System.out.println("Nr of duplex pages printed: " + printedPages);

    }
    else {
        this.pages += printedPages;
      System.out.println("Nr of pages printed: " + this.pages);
    }
  }

  public int getTonerBlackLevel() {
    if(tonerBlackLevel == 0){
      System.out.println("Black toner is empty: " +tonerBlackLevel);
    }
    return tonerBlackLevel;
  }

  public int getTonerRGBLevel() {
    if(tonerRGBLevel == 0){
      System.out.println("Black toner is empty: " +tonerRGBLevel);
    }
      return tonerRGBLevel;
  }
}
