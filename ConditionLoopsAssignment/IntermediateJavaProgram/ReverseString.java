package ConditionLoopsAssignment.IntermediateJavaProgram;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String a = in.nextLine();

        String rev = "";
        int strl = a.length();

        for(int i = (strl -1); i>=0; i--){
            rev = rev + a.charAt(i);
        }
        System.out.println("The reverse string of " + a + " is " + rev);
    }
}
