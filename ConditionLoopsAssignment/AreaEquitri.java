package ConditionLoopsAssignment;

import java.util.Scanner;

public class AreaEquitri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the triangle: ");
        double s = in.nextDouble();

        double a = (Math.sqrt(3)/4)*(s*s);

        System.out.println("Area of Equilateral Triangle is: " + a);

    }
}
