package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of subjects: ");
        int n = in.nextInt();
        int s;
        int sum = 0;
        int i;
        for(i = 1; i<=n; i++) {
            System.out.println("Enter the marks of " + i + " subject: ");
             s = in.nextInt();
             sum = sum+s;

        }
        int avg = sum/n;
        System.out.println("The avg of your marks is: " + avg);


    }
}
