package ConditionLoopsAssignment.IntermediateJavaProgram;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char alpha = in.next().charAt(0);

        if ((alpha == 'a') || (alpha == 'e') || (alpha == 'i') || (alpha == 'o') || (alpha == 'u') || (alpha == 'A') || (alpha == 'E') || (alpha == 'I') || (alpha == 'O') || (alpha == 'U')){

            System.out.println(alpha + " is a vowel");
        }else
            System.out.println(alpha + " is a consonant");
    }
}
