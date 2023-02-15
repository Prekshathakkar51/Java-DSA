package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

swap(a,b);

        System.out.println(a + " " + b);

        String name = "Preksha Thakkar";
        changename(name);
        System.out.println(name);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
//        this change will only be valid in this function only for primitive data types

    }

    static void changename(String naam){
        naam = "Tirth Thakkar";  //Not changing bt creating a new object   . Strings are final objects , they cant be modified
    }
}
