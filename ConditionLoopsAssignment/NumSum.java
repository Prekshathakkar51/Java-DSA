package ConditionLoopsAssignment;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int sum = 0;

        while(num != 0){

            sum = sum +num;

            num = in.nextInt();

        }
        System.out.println(sum-1);
    }
}
