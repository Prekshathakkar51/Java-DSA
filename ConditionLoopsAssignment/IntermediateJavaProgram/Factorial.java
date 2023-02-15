package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int i = 1;
         int fac = 1;
//         int n = num;


         while (num>=i){
             fac =  fac * i;
             i++;
         }

        System.out.println(fac);
    }
}
