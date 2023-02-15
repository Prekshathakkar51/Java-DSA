package ConditionLoopsAssignment;

import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle: ");
        double l = in.nextDouble();

        System.out.print("Enter the breadth of Rectangle: ");
        double b = in.nextDouble();

        double a = l*b;

        System.out.println("Area of Rectangle: " + a);


    }
}
