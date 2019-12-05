package JavaExercises;

public class BasicExercises {

  public static void main (String[] args){


    System.out.println(" basic int exercise ");

    int myFirstNumber = (10 + 5) + (2 * 10);
    int mySecondNumber = 12;
    int myThirdNumber = myFirstNumber * 2;
    int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
    int myLastOne = 1000 - myTotal;
     System.out.println(" My Total: " + myTotal);
     System.out.println(" My Last one: " + myLastOne);

    System.out.println(" \n basic Primitive Types exercise");

    int myValue = 10000;
    // int == 32 bit
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    int myMaxIntTest = 2147483647;
      System.out.println(" Integer Min: " + myMinIntValue + "\n Integer Max: " + myMaxIntValue);
      System.out.println(" Busted max value: " + (myMaxIntValue + 1));
      System.out.println(" Busted min value: " + (myMinIntValue - 1));


    // byte == 8 bit
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
      System.out.println(" Byte Min: " + myMinByteValue);
      System.out.println(" Byte Max: " + myMaxByteValue);

    // short == 16 bit
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
      System.out.println(" Short Min: " + myMinShortValue);
      System.out.println(" Short Max: " + myMaxShortValue);

    // long == 64 bit
    long myLongValue = 100L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    long bigLongLiteralValue = 2147483647234L;
      System.out.println(" Long Min: " + myMinLongValue);
      System.out.println(" Long Max: " + myMaxLongValue);
      System.out.println(bigLongLiteralValue);

    System.out.println("Casting exercise");

      int myTotal = (myMinIntValue / 2);
      byte myNewByteValue = (byte) (myMinByteValue / 2);
      short myNewShortValue = (short) (myMinShortValue / 2);

    // prim type challenge
    byte myByte = 10;
    short myShort = 20;
    int myInt = 30;
    long sumWithLong = 50000L + 10L * (myByte + myShort + myInt);
      System.out.println("Sum: " + sumWithLong);

    System.out.println("Float and Double Exercise");

    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
      System.out.println(" float min: " + myMinFloatValue);
      System.out.println(" float Max: " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
      System.out.println(" Double min: " + myMinDoubleValue);
      System.out.println(" Double Max: " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5d / 3d;

     System.out.println("my Int: " + myIntValue);
     System.out.println("my Float: " + myFloatValue);
     System.out.println("my Double: " + myDoubleValue);

    // double challenge
    double pound = 10d;
    double covertedTokilograms = pound * 0.45359237d;
     System.out.println("Coverted to KG: " +covertedTokilograms);

  }

}
