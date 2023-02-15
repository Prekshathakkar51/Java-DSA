package ConditionLoopsAssignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n for Fibonacci: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int sum = a + b;
        System.out.println(a + " ");
        System.out.println(b + " ");
        System.out.println(sum + " ");

        for(int i = 4; i<=n ; i++){
            a = b;
            b = sum;
            sum = a+b;
            System.out.println(sum + " ");

        }

    }
}
