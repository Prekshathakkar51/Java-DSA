package ConditionLoopsAssignment.IntermediateJavaProgram;
import java.util.Scanner;
public class FutureInvest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of money you want to invest: ");
        double a = in.nextDouble();

        System.out.println("Enter the rate of interest paid(per year): ");
        double r = in.nextDouble();

        System.out.println("Enter the no. of years you want to hold your investment: ");
        double y = in.nextDouble();

        double fv = a * Math.pow((1+ (r/100)), y);

        System.out.println("Your investment of Rs. " + a + " will become Rs. " + fv + " after " +y+ " years.");
    }
}
