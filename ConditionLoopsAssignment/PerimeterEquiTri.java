package ConditionLoopsAssignment;

import java.util.Scanner;

public class PerimeterEquiTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of the triangle: ");
        double s = in.nextDouble();

        double p = 3 * s;

        System.out.println("Perimeter of Equilateral Triangle is: " + p);
    }
}
