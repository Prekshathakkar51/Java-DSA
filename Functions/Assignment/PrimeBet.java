package Functions.Assignment;

import java.util.Scanner;

public class PrimeBet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the starting number  : ");
        int nums = in.nextInt();
        System.out.println("Enter the ending number  : ");
        int nume = in.nextInt();
        prime(nums,nume);

    }

    static void prime(int nums,int nume) {
        int sum = 0;
        int flag = 0;

        for (int i = nums+1; i < nume; i++) {
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);


            }

        }
    }
