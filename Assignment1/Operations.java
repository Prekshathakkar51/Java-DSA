package Assignment1;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = in.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();

        System.out.println("Enter the operation(+,-,*,/): ");
        char op = in.next().charAt(0);

        if( op == '+'){
            double res = num1 + num2;
            System.out.println("The addition is : " + res);
        } else if (op == '-') {
            double res = num1 - num2;
            System.out.println("The subtraction is : " + res);
        } else if (op == '*') {
            double res = num1 * num2;
            System.out.println("The multiplication is : " + res);

        }else{
            double res = num1 / num2;
            System.out.println("The division is : " + res);
        }


    }
}
