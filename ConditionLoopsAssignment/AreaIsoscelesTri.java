package ConditionLoopsAssignment;

import java.util.Scanner;

public class AreaIsoscelesTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
       double l1 = in.nextDouble();
        System.out.print("Enter Side 2: ");
       double l2 = in.nextDouble();
       double a = 0.5*(Math.sqrt(((l1*l1)-((l2*l2)/4))))*l2;

        System.out.println("Area of Isosceles Triangle is: "+ a);
    }
}

