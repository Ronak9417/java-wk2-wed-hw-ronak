package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {

    // Static methods
    public static void additions(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static int substraction(int a, int b) {
        //return a - b;
        int result = a -b;
        return result;
    }
    // Instance method.
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }
    public int division(int a, int b) {
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        // scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Please enter the second number : ");
        int b = sc.nextInt();

        additions(a, b);

        int sunResult = substraction(a, b);
        System.out.println("The substraction of " + a + " and " + b + " is : " + sunResult);
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);

        // close scanner
        sc.close();

    }
}
