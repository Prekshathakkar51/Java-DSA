package Functions.Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for Factorial: ");
        int num = in.nextInt();
        System.out.println("The Factorial is: " + fac(num));

    }
    static int fac(int num){
        int fac = 1;
        for(int i =1; i<=num;i++){
            fac = fac*i;

        }
        return fac;
    }
}
