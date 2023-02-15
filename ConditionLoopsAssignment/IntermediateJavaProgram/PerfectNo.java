package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class PerfectNo {
    static long Perfect(long num)
    {
        long sum = 0;
        for(int i = 1;i<=num/2;i++){
            if(num % i == 0){
                sum = sum +i;
            }
        }
        return sum;
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        long number = in.nextLong();
        long s = Perfect(number);

        if (s==number){
            System.out.println(number + " is a perfect number");
        }else
            System.out.println(number + " is not a perfect number");
    }
}
