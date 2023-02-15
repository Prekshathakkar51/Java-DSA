package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class KunalDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("As per the condition: Kunal is allowed to go out with his friends only on the even days of a given month.");
        System.out.println("So for Month of August(31 days): ");
        int Kunal = 0;
        for(int i = 1;i<=31;i++){
            if(i%2==0){
                Kunal+=1;
            }
            else{
                Kunal+=0;
            }

        }
        System.out.println("The number of Days kunal can go out is: " + Kunal);

    }
}
