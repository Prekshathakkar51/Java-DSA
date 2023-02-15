package Functions.Assignment;

import java.util.Scanner;

public class EveOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        Eo(num);
    }
    static  void Eo(int num){
        if(num %2 ==0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}

