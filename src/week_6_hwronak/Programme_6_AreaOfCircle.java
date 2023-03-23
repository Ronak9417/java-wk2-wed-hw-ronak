package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Declare scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        areaOfCircle(radius);

        //scanner close
        sc.close();
    }

    // Calculating the area of circle.
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of the circle is  : " + area);
    }
}
