package Functions;

import java.util.Arrays;

public class VArArgs {
    public static void main(String[] args) {
        fun(2,69, 998, 3,8,99,5,852);
        multiple(2,3, "Preksha", "Tirth");
        demo("hi","hello");
    }

    static  void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
