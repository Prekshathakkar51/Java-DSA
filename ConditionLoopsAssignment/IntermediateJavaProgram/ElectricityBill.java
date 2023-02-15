package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit
        System.out.print("Enter the units of electricity consumed: ");
        int u = in.nextInt();
        int total;

        if (u<=100){
            total = u*10;
        } else if (u>100 && u<=200){
            total = (100*10) + ((u-100)*15);
        } else if (u>200 && u<=300) {
            total = (100*10) + (100*15) + ((u-200)*20);
        } else {
            total = (100*10) + (100*15) + (100*20) + ((u-300)*25);
        }

        System.out.println("The total Electricity bill is: " + total);
    }
}
