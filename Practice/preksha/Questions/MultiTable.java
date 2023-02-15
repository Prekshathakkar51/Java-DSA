package Practice.preksha.Questions;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a no. to get its table: ");
        int num = in.nextInt();

        for (int i = 1; i<=10; i++){
            int res = num * i;
            System.out.println(num + " X " + i + " = " + res);
        }
    }
}
