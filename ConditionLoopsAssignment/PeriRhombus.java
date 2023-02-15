package ConditionLoopsAssignment;

import java.util.Scanner;

public class PeriRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of rhombus: ");
        double s = in.nextDouble();

        double p = 4*s;
        System.out.println("The perimeter of the rhombus is: " + p);


    }
}
