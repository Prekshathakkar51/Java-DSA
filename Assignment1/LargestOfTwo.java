package Assignment1;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = in.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();

        if(num1 > num2){
            System.out.println("Num1 is largest");
        }else
        {
            System.out.println("Num2 is largest");
        }
    }
}
