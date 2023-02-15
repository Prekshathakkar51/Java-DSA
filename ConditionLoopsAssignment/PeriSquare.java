package ConditionLoopsAssignment;

import java.util.Scanner;

public class PeriSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        double s = in.nextDouble();

        double p = 4*s;
        System.out.println("The perimeter of the square is: " + p);
    }
}
