package Assignment1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st no: ");
        int num1 = in.nextInt();

        System.out.println("Enter 2nd no: ");
        int num2 = in.nextInt();

        for(int i = num1; i<= num2; i++)
        {
            int sum = 0;
            int check = i;

            while (check != 0)
            {
                int rem;
                rem = check % 10;
                sum = sum +(rem * rem * rem);
                check = check/10;

            }

            if(sum == i){
                System.out.println(i+" is an Armstrong number");

            }
        }

    }
}
