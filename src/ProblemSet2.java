/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

         System.out.print("Enter your first name: ");
         String firstName = in.nextLine();

         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();

         System.out.print("Enter your grade: ");
         int grade = in.nextInt();

         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();

         System.out.print("Enter your hometown: ");
         String hometown = in.nextLine();

         System.out.println("\nNAME     : " + firstName + " " + lastName);
         System.out.println("GRADE    : " + grade);
         System.out.println("AGE      : " + age);
         System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final int DOLLAR_VALUE = 100;
         final int QUARTER_VALUE = 25;
         final int DIME_VALUE = 10;
         final int NICKEL_VALUE = 5;
         final int PENNY_VALUE = 1;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();

         int pennies1 = (int) (dollarAmount * 100);

         int dollars1 = pennies1 / DOLLAR_VALUE;
         pennies1 = pennies1 % DOLLAR_VALUE;

         int quarters1 = pennies1 / QUARTER_VALUE;
         pennies1 = pennies1 % QUARTER_VALUE;

         int dimes1 = pennies1 / DIME_VALUE;
         pennies1 = pennies1 % DIME_VALUE;

         int nickels1 = pennies1 / NICKEL_VALUE;
         pennies1 = pennies1 % NICKEL_VALUE;

         int pennies2 = pennies1 / PENNY_VALUE;
         pennies1 = pennies1 % PENNY_VALUE;

         System.out.println("\nDOLLARS  : " + dollars1);
         System.out.println("QUARTERS : " + quarters1);
         System.out.println("DIMES    : " + dimes1);
         System.out.println("NICKELS  : " + nickels1);
         System.out.println("PENNIES  : " + pennies2);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final int TEN_DOLLAR_VALUE = 1000;
         final int FIVE_DOLLAR_VALUE = 500;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount2 = in.nextDouble();

         int pennies3 = (int) (dollarAmount2 * 100);

         int tenDollar2 = pennies3 / TEN_DOLLAR_VALUE;
         pennies3 = pennies3 % TEN_DOLLAR_VALUE;

         int fiveDollar2 = pennies3 / FIVE_DOLLAR_VALUE;
         pennies3 = pennies3 % FIVE_DOLLAR_VALUE;

         int dollars2 = pennies3 / DOLLAR_VALUE;
         pennies3 = pennies3 % DOLLAR_VALUE;

         int quarters2 = pennies3 / QUARTER_VALUE;
         pennies3 = pennies3 % QUARTER_VALUE;

         int dimes2 = pennies3 / DIME_VALUE;
         pennies3 = pennies3 % DIME_VALUE;

         int nickels2 = pennies3 / NICKEL_VALUE;
         pennies3 = pennies3 % NICKEL_VALUE;

         int pennies4 = (int) (pennies3 / PENNY_VALUE);
         pennies3 = pennies3 % PENNY_VALUE;

         int billCount = tenDollar2 + fiveDollar2 + dollars2;
         int coinCount = quarters2 + dimes2 + nickels2 + pennies4;

         System.out.println("\nBILLS : " + billCount);
         System.out.println("COINS : " + coinCount);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final int INCHES_IN_A_MILE = 63360;
         final int INCHES_IN_A_YARD = 36;
         final int INCHES_IN_A_FOOT = 12;

         System.out.print("\nEnter a number of inches: ");
         int inchesCount = in.nextInt();

         int milesCount = inchesCount / INCHES_IN_A_MILE;
         inchesCount = inchesCount % INCHES_IN_A_MILE;

         int yardsCount = inchesCount / INCHES_IN_A_YARD;
         inchesCount = inchesCount % INCHES_IN_A_YARD;

         int feetCount = inchesCount / INCHES_IN_A_FOOT;
         inchesCount = inchesCount % INCHES_IN_A_FOOT;

         System.out.println("\nMILES  : " + milesCount);
         System.out.println("YARDS  : " + yardsCount);
         System.out.println("FEET   : " + feetCount);
         System.out.println("INCHES : " + inchesCount);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         final int CM_IN_A_METER = 100;
         final int CM_IN_A_KILOMETER = 100000;

         System.out.print("\nEnter a number of centimeters: ");
         int cmCount = in.nextInt();

         int kmCount = cmCount / CM_IN_A_KILOMETER;
         cmCount = cmCount % CM_IN_A_KILOMETER;

         int meterCount = cmCount / CM_IN_A_METER;
         cmCount = cmCount % CM_IN_A_METER;

         System.out.println("\nKILOMETERS  : " + kmCount);
         System.out.println("METERS      : " + meterCount);
         System.out.println("CENTIMETERS : " + cmCount);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();

         double radius = diameter / 2;
         double circleArea = Math.PI * Math.pow(radius, 2);
         double circumfrence = Math.PI * diameter;

         System.out.printf("\nAREA          : %,.2f", circleArea);
         System.out.printf("\nCIRCUMFERENCE : %,.2f\n", circumfrence);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\nEnter a length: ");
         double rectangleLength = in.nextDouble();
         System.out.print("Enter a width: ");
         double rectangleWidth = in.nextDouble();

         double rectangleArea = rectangleLength * rectangleWidth;
         double rectanglePerimeter = (2 * rectangleLength) + (2 * rectangleWidth);
         double rectangleDiagonal = Math.pow(rectangleLength, 2) + Math.pow(rectangleWidth, 2);
         rectangleDiagonal = Math.sqrt(rectangleDiagonal);

         System.out.printf("\nAREA      : %,.2f", rectangleArea);
         System.out.printf("\nPERIMETER : %,.2f", rectanglePerimeter);
         System.out.printf("\nDIAGONAL  : %,.2f\n", rectangleDiagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double hexagonSideLength = in.nextDouble();

         double hexagonArea = Math.pow(hexagonSideLength, 2) * ((3 * Math.sqrt(3)) / 2);
         double hexagonPerimeter = hexagonSideLength * 6;

         System.out.printf("\nAREA      : %,.2f", hexagonArea);
         System.out.printf("\nPERIMETER : %,.2f\n", hexagonPerimeter);

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

         System.out.print("\nEnter a string: ");
         in.nextLine();
         String initialString = in.nextLine();

         String stringHalfOne = initialString.substring(0, (initialString.length() / 2));
         String stringHalfTwo = initialString.substring(initialString.length() / 2);

         System.out.println("\n" + stringHalfTwo + stringHalfOne);

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("\nEnter your first name: ");
         String firstName2 = in.nextLine();
         System.out.print("Enter your middle name: ");
         String middleName2 = in.nextLine();
         System.out.print("Enter your last name: ");
         String lastName2 = in.nextLine();

         String firstInitial = firstName2.substring(0, 1);
         String middleInitial = middleName2.substring(0, 1);
         String lastInitial = lastName2.substring(0, 1);

         System.out.println("\n" + firstInitial + middleInitial + lastInitial);

        in.close();
    }
}
