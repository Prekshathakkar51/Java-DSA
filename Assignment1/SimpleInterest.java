package Assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = in.nextDouble();

        System.out.print("Enter Time: ");
        double t = in.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = in.nextDouble();

        double SI = (p*r*t)/100;

        System.out.println("Your Simple Interest is : " + SI);


    }
}
