package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the runs: ");
        double runs = in.nextDouble();

        System.out.println("No. of Matches: ");
        double matches = in.nextDouble();

        System.out.println("No. of Not out: ");
        double notout = in.nextDouble();

        double dismissals = matches - notout;
        double batavg = runs/dismissals;

        if (dismissals == 0){
            System.out.println("NA");
        }else {
            System.out.println("The batting average is : " + batavg);
        }



    }
}


//Batting avg = runs scored/no.of dismissals
//no. of dismissals = no.of innings - no.of innings he remained not out

