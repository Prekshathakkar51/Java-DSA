package ConditionLoopsAssignment;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double r = in.nextDouble();

        double p = 2*3.14159*r;
        System.out.println("Perimeter of Circle is: " + p);


    }
}
