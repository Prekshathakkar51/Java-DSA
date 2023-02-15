package ConditionLoopsAssignment;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Area of Triangular Prism");
        System.out.print("Enter the Apothem length of Triangular Prism: ");
        double a = in.nextDouble();

        System.out.print("Enter the Base length of Triangular prism: ");
        double b = in.nextDouble();

        System.out.print("Enter the Height of Triangular prism: ");
        double h = in.nextDouble();

        double v = 0.5 * a * b * h;

        System.out.println("The volume of Prism is: " + v);


    }

}
