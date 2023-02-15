package Functions.Assignment;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int m = in.nextInt();

        Grade(m);

    }
    static void Grade(int m){
        if (m>=90){
            System.out.println("Grade : AA");
        } else if (m>=80 && m<90) {
            System.out.println("Grade : AB");
        }else if (m>=70 && m<80) {
            System.out.println("Grade : BB");
        }else if (m>=60 && m<70) {
            System.out.println("Grade : BC");
        }else if (m>=50 && m<60) {
            System.out.println("Grade : CD");
        }else if (m>=40 && m<50) {
            System.out.println("Grade : DD");
        }else  {
            System.out.println("Grade : Fail");
        }
    }
}
