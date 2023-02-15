package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = in.nextInt();

        int max, lcm;

        if(num1>num2){
            max = num1;
        }
        else
            max = num2;
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            }
            ++max;
        }
    }
}
