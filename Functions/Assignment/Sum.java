package Functions.Assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        System.out.println("The sum of "+ num1 +" + " + num2 +" is " + sum(num1,num2));
    }

    static  int sum(int num1, int num2){
        return num1+num2;
    }
}
