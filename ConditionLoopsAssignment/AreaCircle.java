package ConditionLoopsAssignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.print("Enter the radius of the circle: ");

       double r = in.nextDouble();

       double a = 3.14159*r*r;
        System.out.println("Area of Circle is: " + a);


    }
}
