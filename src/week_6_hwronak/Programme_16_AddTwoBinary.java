package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {


        // scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number : ");
        String first = sc.nextLine();
        System.out.println("Enter second binary number : ");
        String second = sc.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The addition of two binary number is : " + addition);

        //Closing the scanner
        sc.close();

    }

    //adding the two binary numbers
    public static String addTwoBinaryNumbers(String first, String second) {
        int a = Integer.parseInt(first, 2);
        int b = Integer.parseInt(second, 2);
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }

}
