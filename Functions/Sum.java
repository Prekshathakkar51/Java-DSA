package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int ans = sum2();
//        sum();

        int ans3 = sum3(20,30);
        System.out.println(ans3);



    }

//    return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;

//        System.out.println("This will never execute");
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: "+ sum);
    }

//    pass the value of the function when u r calling the function in main

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}

//Methods and functions
/*
return_type name (arguments) {
    //body
    return statement;
}
 */