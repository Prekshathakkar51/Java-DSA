package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks of Subject 1: ");
        double m1 = in.nextDouble();
        double g1 = m1/10;

        System.out.print("Enter the marks of Subject 2: ");
        double m2 = in.nextDouble();
        double g2 = m2/10;

        System.out.print("Enter the marks of Subject 3: ");
        double m3 = in.nextDouble();
        double g3 = m3/10;

        System.out.print("Enter the marks of Subject 4: ");
        double m4 = in.nextDouble();
        double g4 = m4/10;

        System.out.print("Enter the marks of Subject 5: ");
        double m5 = in.nextDouble();
        double g5 = m5/10;

        double cgpa = (g1+g2+g3+g4+g5)/5;
        System.out.println("The CGPA is: " + cgpa);







    }
}
