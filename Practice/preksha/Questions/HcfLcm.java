package Practice.preksha.Questions;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        int max = Math.max(num1, num2);
        int lcm;
        while (true){
            if(max % num1 == 0 && max % num2 ==0 ){
                 lcm = max;
                System.out.println("The LCM is: " + lcm);
                break;
            }
            ++max;
        }

        int gcd = (num1*num2)/lcm;
        System.out.println("The GCD is: " + gcd);


    }
}
