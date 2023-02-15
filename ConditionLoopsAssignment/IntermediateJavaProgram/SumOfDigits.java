package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Enter the number and get the sum of it's digits: "));
        int num = in.nextInt();
        String strnum = String.valueOf(num);
        int len = strnum.length();
//        System.out.println(len);
        int sum = 0;


        for(int i = 1;i<=len;i++){
            int num1 = num%10;

            sum = sum +num1;

            num = num/10;
        }
        System.out.println("The sum of the digits of the number is: " + sum);
    }
}
