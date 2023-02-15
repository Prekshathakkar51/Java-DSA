package ConditionLoopsAssignment;

import java.util.Scanner;

public class PeriRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle: ");
        double l = in.nextDouble();

        System.out.print("Enter the breadth of Rectangle: ");
        double b = in.nextDouble();

        double p = 2*(l+b);

        System.out.println("Area of Rectangle: " + p);
    }
}
