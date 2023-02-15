package Functions.Assignment;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        System.out.println("The product of "+ num1 +" & " + num2 +" is " + multi(num1,num2));
    }

    static  int multi(int num1, int num2){
        return num1*num2;
    }
}
