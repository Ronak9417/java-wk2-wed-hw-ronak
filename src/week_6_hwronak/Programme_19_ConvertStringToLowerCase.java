package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the uppercase sentence: ");
        String uppercase = sc.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner
        sc.close();

    }
    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.print("The Lowercase of the string is = " + str.toLowerCase());
    }
}
