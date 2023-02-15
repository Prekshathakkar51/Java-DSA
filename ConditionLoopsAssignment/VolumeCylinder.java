package ConditionLoopsAssignment;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();

        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();

        double v = 3.14159 * (r*r) * h;
        System.out.println("The Volume of Cylinder is: " + v);


    }
}
