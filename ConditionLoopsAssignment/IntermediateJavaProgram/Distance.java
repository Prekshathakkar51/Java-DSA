package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter point1: ");
        double p1 = in.nextDouble();
        ;
        System.out.print("Enter Point2: ");
        double p2 = in.nextDouble();
        double dist;

        if (p2 > p1) {
            dist = p2 - p1;
        } else {
            dist = p1 - p2;
        }

        System.out.println("The distance between them is : " + dist);
    }
}
