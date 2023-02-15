package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Initial value: ");
        double v1 = in.nextDouble();
        System.out.print("Enter the rate of Depreciation: ");
        double r = in.nextDouble();
        System.out.print("Enter time in years: ");
        double t = in.nextDouble();

        double v2 = v1 * Math.pow(((1-r)/100),t);
        System.out.print("Depreciation: " + v2);



    }
//    if V1 is the value at a certain time and R% per annum is the rate (the rate can not be more than 100%) of depreciation per year, then the value V2 at the end of T years is:
//    V2 = V1 * ((1-r)/100)^t

//    Given three variable V1, R and T where
//    V1 is the initial value,
//    R is the rate of depreciation and
//    T is the time in years.
//    The task is to find the value of the item after T years.


}
