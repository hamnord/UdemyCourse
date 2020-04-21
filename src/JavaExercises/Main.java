package JavaExercises;

import JavaExercises.Lesson2.*;
import JavaExercises.Lesson3.*;
import JavaExercises.Lesson3.CarpetCostCalculator.Calculator;
import JavaExercises.Lesson3.CarpetCostCalculator.Carpet;
import JavaExercises.Lesson3.CarpetCostCalculator.Floor;
import JavaExercises.Lesson3.CylinderChallenge.Circle;
import JavaExercises.Lesson3.CylinderChallenge.Cylinder;
import JavaExercises.Lesson3.InheritanceChallengePart1.Car;
import JavaExercises.Lesson3.InheritanceChallengePart1.RaceCar;
import JavaExercises.Lesson3.Point;
import JavaExercises.Lesson3.PoolAreaChallenge.Cuboid;

import java.awt.*;

public class Main {
  public static void main(String[] args) {

    /* Methods from Lesson 1 & 2 */

    // SpeedConverterExercise.printConversion(10);
    // MegabyteConverter.printMegaBytesAndKiloBytes(5000);
    // BarkingDogExercise.shouldWakeUp(true,-1);
    // LeapYearCalculator.isLeapYear(1924);
    // DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123);
    // EqualSumChecker.hasEqualSum(1,-1,0);
    // TeenNumberChecker.hasTeen(22, 23, 34);
    // TeenNumberChecker.isTeen(22);
    // System.out.println(SecondsAndMinutes.getDurationString(200, 1));
    // System.out.println(SecondsAndMinutes.getDurationString( 3700));
    // AreaCalculator.area(-1);
    // AreaCalculator.area(5.0,4.0);
    // MinutesToYearDaysCalculator.printYearsAndDays(561600);
    // IntEqualityPrinter.printEqual(-1,-2,-3);
    // PlayingCat.isCatPlaying(true,10);
    // DayOfTheWeek.printDayOfTheWeek(8);
    // NumberAsWord.printNumberInWord(-1);
    // NumberOfDaysInMonth.isLeapYear(2000);
    // NumberOfDaysInMonth.getDaysInMonth(13,2020);
    // SumOdd.sumOdd(10,5);
    // EvenNumber.printEven(1,20);
    // EvenNumber.sumEven(1,5);
    // EvenNumber.sumEvenWhile(1,50);
    // DigitSumChallenge.sumDigits(125);
    // NumberPalindrome.isPalindrome(702);
    // FirstAndLastDigitSum.sumFirstAndLastDigit(102);
    // EvenDigitSum.getEvenDigitSum(246245);
    // SharedDigit.hasSharedDigit(25, 24);
    // LastDigitChecker.hasSameLastDigit(101,22,1);
    // LastDigitChecker.isValid();
    // GreatestCommonDivisor.getGreatestCommonDivisor(25,15);
    // GreatestCommonDivisor.commonDivisorWhile(25,15);
    // AllFactors.printFactors(28);
    // PerfectNumber.isPerfectNumber(55);
    // NumberToWords.numberToWords(100);
    // FlourPackProblem.canPack(1,0,6);
    // LargestPrime.getLargestPrime(217);
    // DiagonalStar.printSquareStar(2);
    // ReadingUserInput.sumUserInput();
    // MinMaxInput.getMinMaxValue();
    // InputCalc.inputThenPrintSumAndAverage();
    // PaintJob.getBucketCount(3.26, 0.75 );

    /* Lesson 3
     * SimpleCalc

    SimpleCalc calc = new SimpleCalc();
    calc.setFirstNumber(5.0);
    calc.setSecondNumber(4);
    System.out.println("Add = " + calc.getAdditionResult());
    System.out.println("Subtract = " + calc.getSubtractionResult());
    calc.setFirstNumber(5.25);
    calc.setSecondNumber(0);
    System.out.println("Multiply = " + calc.getMultiplicationResult());
    System.out.println("Divide = " + calc.getDivisionResult());

    /* Person

    Person person = new Person();

    person.setFirstName("");
    person.setLastName("");
    person.setAge(10);
    System.out.println("FullName = " + person.getFullName());
    System.out.println("Teen = " + person.isTeen());

    person.setFirstName("John");
    person.setAge(18);
    System.out.println("FullName = " + person.getFullName());
    System.out.println("Teen = " + person.isTeen());

    person.setLastName("Smith");
    System.out.println("FullName = " + person.getFullName());

     */

    /* BankAccount

    BankAccount defaultAccount = new BankAccount();

    System.out.println("**********************");

    BankAccount account = new BankAccount(
        "123-324-562-7",
        10000,
        "Jocke Fiddesson",
        "VonFidd@gmail.com",
        "+732-42 41 15" );

    account.printAccount();
    account.depositFunds(500);
    System.out.println("Current Balance after deposit: " + account.getBalance());

    account.withdrawFunds(1500);
    account.withdrawFunds(499);
    System.out.println("Current Balance after withdrawal: " + account.getBalance());


     */

    /* VipCustomer

    VipCustomer vipDefault = new VipCustomer();
    System.out.println("Name: " + vipDefault.getName() +
        ", CreditLimit: " + vipDefault.getCreditLimit() +
        ", mail: " + vipDefault.getEmail());

    VipCustomer jocke = new VipCustomer("jocke", 100000);
    System.out.println("Name: " + jocke.getName() +
        ", CreditLimit: " + jocke.getCreditLimit() +
        ", mail: " +  jocke.getEmail());

    VipCustomer stephaaan = new VipCustomer("Stephaaan", 10, "DolphinHunter69@yahoo.org");
    System.out.println("Name: " + stephaaan.getName() +
        ", CreditLimit: " + stephaaan.getCreditLimit() +
        ", mail: " + stephaaan.getEmail());

     */

    /* Wall-Challenge

    Wall wall = new Wall(5,4);
    System.out.println("Area = " + wall.getArea());

    System.out.println("Width = " + wall.getWidth());
    System.out.println("Height = " + wall.getHeight());

     */

    /* Point Challenge


    Point first = new Point(6,5);
    Point second = new Point(3,1);
    System.out.println("Distance()= " + first.distance());
    System.out.println("Distance()= " + first.distance(second));
    System.out.println("Distance()= " + first.distance(2,2));

    Point point = new Point();
    System.out.println("Distance()= " + point.distance());

     */

    /*  CarpetCostCalculator

    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75,4.0);
    Calculator calc = new Calculator(floor,carpet);
    System.out.println("Total: " + calc.getTotalCost());

     carpet = new Carpet(1.5);
     floor = new Floor(5.4,4.5);
     calc = new Calculator(floor,carpet);
    System.out.println("Total: " + calc.getTotalCost());

     */

    /* ComplexNumber

    ComplexNumber one = new ComplexNumber(1.0,1.0);
    ComplexNumber number = new ComplexNumber(2.5,-1.5);
    one.add(1,1);
    System.out.println("one.real = " + one.getReal());
    System.out.println("one.Imaginary = " + one.getImaginary());
    one.subtract(number);
    System.out.println("one.real = " + one.getReal());
    System.out.println("one.Imaginary = " + one.getImaginary());
    number.subtract(one);
    System.out.println("one.real = " + number.getReal());
    System.out.println("one.Imaginary = " + number.getImaginary());

     */

    /*
    RaceCar f1Car = new RaceCar();
    Car volvo = new Car();

    f1Car.setSteering("forward");
    f1Car.setSpeed(250);
    System.out.println("A " + f1Car.getColor() + " " + f1Car.getModel() + " going " + f1Car.getSteering() + " in a speed of " + f1Car.getSpeed() + "/mph");

    volvo.setColor("Green");
    volvo.setModel("240 volvo");
    volvo.setSpeed(1000);
    System.out.println("A " + volvo.getColor() + " " + volvo.getModel() + " Going in speed of " + volvo.getSpeed() + "/mph");

     */

    /*
    Circle circle = new Circle(3.75);
    System.out.println("circle.Radius = " + circle.getRadius());
    System.out.println("circle.Area = " + circle.getArea());

    Cylinder cylinder = new Cylinder(5.55, 7.25);
    System.out.println("cylinder.Radius = " + cylinder.getRadius());
    System.out.println("cylinder.Height = " + cylinder.getHeight());
    System.out.println("cylinder.Area = " + cylinder.getArea());
    System.out.println("cylinder.Volume = " + cylinder.getVolume());

     */

    /*
    Rectangle rectangle = new Rectangle(5,5);
    System.out.println("rectangle.w = " + rectangle.getWidth());
    System.out.println("rectangle.l = " + rectangle.getLength());
    System.out.println("rectangle.area = " + rectangle.getArea());

    Cuboid cuboid = new Cuboid(5,10,5);
    System.out.println("cuboid.w");
    System.out.println("cuboid.l");
    System.out.println("cuboid.h");
    System.out.println("cuboid.volume");

     */
  }
}
