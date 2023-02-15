package ConditionLoopsAssignment;

import java.util.Scanner;

public class CurvedSurfAreaCyl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();

        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();

        double a = 2 * 3.14159 * r * h;
        System.out.println("The Curved Surface Area of Cylinder is: " + a);

    }
}
