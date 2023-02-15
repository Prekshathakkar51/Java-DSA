package Assignment1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String: ");
        String check = in.next();
        String reverse = "";
        int strl = check.length();
//        System.out.println(strl);

        for (int i = (strl - 1); i >=0; --i)       // here the condition, (strl-1) as the index of the first char of the string starts from 0.
        {
            reverse = reverse + check.charAt(i);
        }

        if(check.equals((reverse))){
            System.out.println(check + " is a palindrome");
        }
        else
        {
            System.out.println(check + " is not a palindrome");
        }

    }
}
