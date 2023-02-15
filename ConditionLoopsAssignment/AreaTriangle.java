package ConditionLoopsAssignment;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base of Triangle(in cm): ");
        double b = in.nextDouble();

        System.out.print("Enter height of Triangle(in cm): ");
        double h = in.nextDouble();

        double a = 0.5*b*h;
        System.out.println("The area of triangle is : " + a);
    }
}
