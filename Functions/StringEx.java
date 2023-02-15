package Functions;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String personalisedMsg = myGreet(name);
        System.out.println(personalisedMsg);
    }

    private static String myGreet(String name) {
        String msg ="Hello " + name;
        return msg;
    }

    static  String greet(){

        String greeting = "How are you?";
        return greeting;
    }
}
