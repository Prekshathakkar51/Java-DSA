package ConditionLoopsAssignment;

import java.util.Scanner;

public class PerimeterParallelo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the adjacent side 1 of parallelogram: ");
        double s1 = in.nextDouble();

        System.out.print("Enter the adjacent side 2 of parallelogram: ");
        double s2 = in.nextDouble();

        double p = 2*(s1+s2);

        System.out.println("The Perimeter of Parallelogram: "+ p);


    }

}
