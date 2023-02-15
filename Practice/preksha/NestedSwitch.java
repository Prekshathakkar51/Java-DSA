package Practice.preksha;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1 -> System.out.println("Preksha Thakkar");
            case 2 -> System.out.println("Tirth Thakkar");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Dept");
                    case "Management" -> System.out.println("Management Dept");
                    default -> System.out.println("No such dept");
                }
            }
            default -> System.out.println("no valid id");
        }
    }
}
