package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        double x = obj.nextDouble();
        System.out.println("Please enter second number : ");
        double y = obj.nextDouble();
        System.out.println("Please enter third number : ");
        double z = obj.nextDouble();
        averageOfThreeNumber(x, y, z);

        //close scanner
        obj.close();

    }

    // Calculation the average of three numbers
    public static void averageOfThreeNumber(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

}
