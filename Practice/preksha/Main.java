package Practice.preksha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Output
//        System.out.println("Hello world!");
//        System.out.print("My name is Preksha");
//        System.out.print("This will not add a new line");

//Input
        Scanner input = new Scanner(System.in);
//        TAkes only integer
//        System.out.println(input.nextInt());
//        Takes only 1 word
//        System.out.println(input.next());
//        Takes whole line
//          System.out.println(input.nextLine());

    }

    public static class Switch {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

    //        String fruits = in.next();

    //        String a = "Preksha";
    //        String b = "Preksha";

    //        System.out.println(a == b);
    //        == checks the value as well as the reference of the object
    //        a -> Preksha <-b


    //        System.out.println(a.equals(b));
    //        .equals only checks the value of the string and not the reference.
    //        a-> Preksha <-b  and a->Preksha , b->Preksha give output as true where as forn2nd condition the == gives false.

    //        String fruit = in.next();
    //
    //        if (fruit.equals("mango")){
    //            System.out.println("King of Fruit");
    //        }
    //
    //        if (fruit.equals("apple"))
    //        {
    //            System.out.println("A sweet red fruit");

    //        switch (fruits) {
    //            case "Mango" -> System.out.println("King of Fruit");
    //            case "Apple" -> System.out.println("A sweet red fruit");
    //            case "Orange" -> System.out.println("Round fruit");
    //            case "Grapes" -> System.out.println("Small fruit");
    //            default -> System.out.println("Please enter a valid fruit");
    //        }

            int day = in.nextInt();
    //        switch (day) {
    //            case 1:
    //                System.out.println("Monday");
    //                break;
    //            case 2:
    //                System.out.println("Tuesday");
    //                break;
    //            case 3:
    //                System.out.println("Wednesday");
    //                break;
    //            case 4:
    //                System.out.println("Thursday");
    //                break;
    //            case 5:
    //                System.out.println("Friday");
    //                break;
    //            case 6:
    //                System.out.println("Saturday");
    //                break;
    //            case 7:
    //                System.out.println("Sunday");
    //                break;

    //            switch (day) {
    //                case 1:
    //                case 2:
    //                case 3:
    //                case 4:
    //                case 5:
    //                    System.out.println("Weekday");
    //                    break;
    //                case 6:
    //                case 7:
    //                    System.out.println("Weekend");
    //                    break;

            switch (day) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("Weekend");
            }


            }
        }
}
