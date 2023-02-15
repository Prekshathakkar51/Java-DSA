package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Of how many nos. you want the sum");
        int n = in.nextInt();
         int num, sum = 0;
        System.out.println("Enter the number: ");
        for (int i = 1; i<=n;i++){
            num = in.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum is: " + sum);

    }
}
