package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no: ");
        double a = in.nextDouble();
        System.out.print("Enter the power: ");
        double b = in.nextDouble();
        System.out.println(Math.pow(a,b));



    }
}
