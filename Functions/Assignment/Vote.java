package Functions.Assignment;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        eligi(age);
    }

    static void eligi(int age){
        if(age>=18){
            System.out.println("Your are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}