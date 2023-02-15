package Practice.preksha.Questions;

import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        for(int i = num1; i<= num2; i++){
            int sum = 0;
            int check = i;

            while(check != 0){

                int rem = check % 10;
                sum = sum + (rem*rem*rem);
                check = check/10;
            }

            if (sum == i){
                System.out.println(i + " is a palindrome");
            }
        }



    }



}

