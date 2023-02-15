package Functions.Assignment;

import java.util.Scanner;

public class SumN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers you would enter: ");
        int n = in.nextInt();



        System.out.println("The sum is : "+ sum(n));

    }

    static int sum(int n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Start entering : ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            sum = sum +num;
        }
        return sum;
    }
}