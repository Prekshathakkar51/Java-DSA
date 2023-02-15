package Practice.preksha.Questions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        if ((year%400 ==0) || (year%100 != 0 && year%4 ==0)){
            System.out.println("It is leap year");
        }else {
            System.out.println("It is not a leap year");
        }

    }
}
