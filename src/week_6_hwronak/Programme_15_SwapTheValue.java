package week_6_hwronak;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        // Scanner declaration
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = obj.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = obj.nextInt();

        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first,second);

        //close scanner
        obj.close();
    }

    //swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

    }
}
