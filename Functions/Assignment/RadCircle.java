package Functions.Assignment;

import java.util.Scanner;

public class RadCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = in.nextDouble();


        System.out.println("The circumference of the circle is:  " + circum(r));
        System.out.println("The area of the circle is:  " + area(r));
    }

    static  double circum(double r){
        return (2*3.141592653589793238*r);
    }

    static double area(double r){
        return (3.141592653589793238*r*r);
    }
}
