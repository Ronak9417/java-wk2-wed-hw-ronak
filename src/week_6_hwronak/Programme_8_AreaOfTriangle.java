package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {


        // Declare scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the triangle : ");
        int length = sc.nextInt();
        System.out.print("Please enter the height of the triangle : ");
        int height = sc.nextInt();

        areaOfTriangle(length, height);

        //close scanner
        sc.close();
    }

    // Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The area of triangle is : " + area);
    }


}
