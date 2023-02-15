package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class CompoundInterst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal Balance: ");
        double p = in.nextDouble();

        System.out.print("Enter the interest rate: ");
        double r = in.nextDouble();

        System.out.print("Enter the time period: ");
        double t = in.nextDouble();

        System.out.println("Enter the number of times interest applied per time period");
        double n = in.nextDouble();

        double a = p * Math.pow((1+(r/100)), t*n);

        double ci = a - p;

        System.out.println("The Compound interest is : " + ci);
    }
}

// A = P(1+(r/n))^nt

//        A	=	final amount
//        P	=	initial principal balance
//        r	=	interest rate
//        n	=	number of times interest applied per time period
//        t	=	number of time periods elapsed
