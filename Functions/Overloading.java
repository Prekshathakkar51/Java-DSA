package Functions;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(25);
        fun("Preksha");
        int ans = sum(5,7,4);
        System.out.println(ans);

    }

    static  int sum(int a, int b){
        return a + b;
    }
static  int sum(int a, int b , int c){
        return a + b + c;
}
    static void fun(int a){
        System.out.println("first one");
    }

    static void fun(String name){
        System.out.println("Second one");
    }


}

// Either the no. of arguments should be diff or teh type of arguments should b diff