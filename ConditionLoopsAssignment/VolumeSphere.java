package ConditionLoopsAssignment;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of Sphere: ");
        double r = in.nextDouble();

        double v = (1.33333) * 3.14159 * (r*r*r);
        System.out.println("The volume of sphere is: " + v);
    }
}
