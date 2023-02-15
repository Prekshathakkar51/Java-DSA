package Assignment1;

import java.util.Scanner;

public class RupToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Currency in Rupees: ");
        double rup = in.nextDouble();

        double usd = rup/79.63;

        System.out.println("The USD value : " + usd);


    }
}
