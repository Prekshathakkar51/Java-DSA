package ConditionLoopsAssignment;

import java.util.Scanner;

public class VolnumePyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base length: ");
        double l = in.nextDouble();
        System.out.println("Enter base width: ");
        double w = in.nextDouble();
        System.out.println("Enter base height: ");
        double h = in.nextDouble();

        double v = (l*w*h)/3;

        System.out.println("The volume of Pyramid is: "+ v);


    }
}
