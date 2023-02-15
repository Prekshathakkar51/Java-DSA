package ConditionLoopsAssignment;

import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius of cone: ");
        double r = in.nextDouble();

        System.out.println("Enter height of cone: ");
        double h = in.nextDouble();

        double v =  3.14159 * (r*r) * (h/3);

        System.out.println("The volume of cone is: "+ v);


    }
}
