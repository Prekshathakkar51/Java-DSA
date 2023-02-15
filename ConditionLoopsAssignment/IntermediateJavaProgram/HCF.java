package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = in.nextInt();

        int min, hcf;

        if(num1<num2){
            min = num1;
        }
        else
            min = num2;
        while (true) {
            if (num1 % min == 0 && num2 % min == 0) {
                hcf = min;
                System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
                break;
            }
            --min;
        }
    }
}
