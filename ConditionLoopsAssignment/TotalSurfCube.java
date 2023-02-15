package ConditionLoopsAssignment;

import java.util.Scanner;

public class TotalSurfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        double s = in.nextDouble();

        double a = 6 * (s*s);

        System.out.println("The Total Surface Area of Cube is : "+ a);
    }
}
