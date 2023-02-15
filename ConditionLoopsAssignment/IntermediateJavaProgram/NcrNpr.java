package ConditionLoopsAssignment.IntermediateJavaProgram;
import java.util.Scanner;
public class NcrNpr {

    public static int fact(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++){

            factorial = factorial * i;

        }
        return factorial;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 'n': ");
        int n = in.nextInt();
        System.out.println("Enter 'r': ");
        int r = in.nextInt();

        System.out.println("ncr is : " + (fact(n)/(fact(n-r)*fact(r))));
        System.out.println("npr is : " + (fact(n)/fact(r)));

    }
}
