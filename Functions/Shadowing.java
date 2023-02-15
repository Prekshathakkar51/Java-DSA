package Functions;

public class Shadowing {
    static int x = 99;  //this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); //90

        int x; //the class variable at line 4 is shadowed by this
        x = 40;  // scope will begin when the value is initialised
        System.out.println(x); //40
        fun(); //90
    }

    static  void fun(){
        System.out.println(x);
    }
}
