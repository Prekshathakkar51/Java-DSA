package Functions.Assignment;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        System.out.println("Enter num3: ");
        int num3 = in.nextInt();

        System.out.println("The max of 3 nos is: " + Max(num1,num2,num3));
        System.out.println("The min of 3 nos is: " + Min(num1,num2,num3));







    }
    static int Max(int num1,int num2,int num3){
        int max = 0;
        if(num1>num2 && num1>num3){

                max = num1;
            }
        else if(num2>num3) {
                max = num2;
            }

        else  {
            max = num3;
        }

    return max;
    }

    static int Min(int num1,int num2,int num3){
        int min = 0;
        if(num1<num2 && num1<num3){
                min = num1;}
        else if(num2<num1 && num2<num3){
            min = num2;
        }
        else{
            min = num3;
        }

        return min;
    }
}


