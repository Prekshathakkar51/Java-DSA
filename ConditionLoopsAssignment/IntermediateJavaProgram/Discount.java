package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Discount Amount = (Discount Percentage * Price)/100
//        Discounted Price = Price - Discount Amount
        System.out.print("Enter the Price of the item: ");
        double amount = in.nextDouble();;

        System.out.print("Enter the Discount Percentage: ");
        double disper = in.nextDouble();

        double disamt = (disper * amount)/100;
        double dispri = amount - disamt;

        System.out.println("Congratulations! you got the discount and now you have to pay RS " + dispri);

    }
}
