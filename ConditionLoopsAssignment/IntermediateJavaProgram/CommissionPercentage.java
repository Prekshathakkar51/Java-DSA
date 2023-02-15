package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class CommissionPercentage {
//    commission=(commissionPercentage/100)*amount;
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the amount on which u r getting commission: ");
    double amount = in.nextDouble();
    System.out.println("Enter the commission percentage: ");
    double comper = in.nextDouble();

    double comm = (comper/100)*amount;

    System.out.println("Your Commisision Amount is: Rs " + comm);

}
}
