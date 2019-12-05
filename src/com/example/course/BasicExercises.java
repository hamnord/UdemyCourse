package com.example.course;

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
    System.out.println(" Integer Min: " + myMinIntValue + "\n Integer Max: " + myMaxIntValue);
    System.out.println(" Busted max value: " + (myMaxIntValue + 1));
    System.out.println(" Busted min value: " + (myMinIntValue - 1));

    int myMaxIntTest = 2147483647;

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
    System.out.println(" Long Min: " + myMinLongValue);
    System.out.println(" Long Max: " + myMaxLongValue);

    long bigLongLiteralValue = 2147483647234L;
    System.out.println(bigLongLiteralValue);

    short bigShortLiteralValue = 32767;


  }



}
