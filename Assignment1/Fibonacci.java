package Assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int n1 = 0;
        int n2 = 1;
        int next = n1+n2;

        System.out.print(n1 + " " );
        System.out.print(n2 + " " );

        for( int i = 3; i<=n; i++)
        {
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
            next = n1+n2;
        }


    }
}
