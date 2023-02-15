package Functions.Assignment;

import javax.swing.*;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        boolean p = false;
        isPrime(num);
    }
    static void isPrime(int num){
        if(num<=1){
            System.out.println("Neither Prime nor Composite");
        }

        int flag = 0;
        for (int c = 2; ((c*c)<=num); c++) {
            if (num%c ==0){
                System.out.println("It is not prime");
                flag = 1;
                break;
            }
        }
        if(flag ==0){
        System.out.println("It is prime");


    }
}}