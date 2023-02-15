package ConditionLoopsAssignment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AreaParallelo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of parallelogram: ");
        double b = in.nextDouble();

        System.out.print("Enter the height of parallelogram: ");
        double h = in.nextDouble();

        double a = b*h;

        System.out.println("The Area of Parallelogram: "+ a);


    }
}
