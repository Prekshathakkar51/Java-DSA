package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class AvgOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers u want to enter?: ");
        int n = in.nextInt();
        int i = 1;
        int num  = 0;
        int sum = 0;
        System.out.println("Enter the numbers: ");
        while(n>=i){

            num = in.nextInt();
            sum = sum+ num;
            i++;
        }
        System.out.println(sum);
        double summ = sum;
        double nn = n;
        double avg = summ/nn;
        System.out.println("The Avg is: " + avg);
    }
}
