package java_week2_writing_hw;

import java.util.Scanner;

public class Programme_8_AreaOfTriangle {
    /**
     * Write a program to calculate the area of a triangle.
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of triangle: ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle: ");
        int height = scanner.nextInt();
        areaOfTriangle(height, length);
        //closing the scanner object
        scanner.close();
    }


    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The Area of a triangle is: " + area);
    }
}
