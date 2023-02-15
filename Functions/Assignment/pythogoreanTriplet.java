package Functions.Assignment;

import java.util.Scanner;

public class pythogoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = in.nextInt();

        System.out.print("Enter b = ");
        int b = in.nextInt();

        System.out.print("Enter c = ");
        int c = in.nextInt();

        pyt(a,b,c);

    }
    static void pyt(int a , int b, int c){
        int max = a;
        if (b >= max)
            max = b;

        if (c >= max)
            max = c;

        if (max == a) {
            System.out.println((b * b + c * c) == (a * a));
        } else if (max == b) {
            System.out.println((a * a + c * c) == (b * b));
        } else {
            System.out.println((a * a + b * b) == (c * c));
        }
    }
}
