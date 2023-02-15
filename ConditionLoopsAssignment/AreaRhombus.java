package ConditionLoopsAssignment;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the diagonal 1: ");
        double d1 = in.nextDouble();

        System.out.print("Enter the diagonal 2: ");
        double d2 = in.nextDouble();

        double a = 0.5*(d1*d2);

        System.out.println("The area of rhombus is: " + a);


    }
}
