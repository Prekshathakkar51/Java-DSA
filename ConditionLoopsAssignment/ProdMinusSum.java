package ConditionLoopsAssignment;

import java.util.Scanner;

public class ProdMinusSum {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
            int num = in.nextInt();
            int n = num;

            int i =5 ;
            int sum = 0;
            while(num>=1){
                int rem = num % 10;
                num/=10;
                sum = sum+rem;
                i--;


            }

            int summ = sum;

            int prod = 1;

            while(n>=1){
                int rem = n % 10;
                n/=10;
                prod = prod*rem;
                i--;


            }
            int prodd = prod;

            System.out.println(prodd);
            System.out.println(summ);

            int result = prodd-summ;

            System.out.println("Result = "+ result );

        }
}


