package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class SumOfNegPos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers until you enter 0");
        System.out.println("Enter the numbers: ");
        int num = 1 ;
        int sumeve = 0;
        int sumodd = 0;
        int sumneg = 0;


        while (num != 0){

            if (num%2==0 && num>0) {
                sumeve = sumeve + num;
            }
            else if (num<=0) {
                sumneg = sumneg +num;

            }
            else {
                sumodd = sumodd+num ;
            }

            num = in.nextInt();
        }
        System.out.println("The sum of even numbers is: "+ (sumeve));
        System.out.println("The sum of odd numbers is: "+ (sumodd-1));
        System.out.println("The sum of negative numbers is: "+ (sumneg));
    }
}
